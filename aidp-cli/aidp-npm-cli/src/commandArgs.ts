// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import {
  applyGlobalOption,
  GLOBAL_BOOLEAN_OPTIONS,
  GLOBAL_VALUE_OPTIONS,
  optionValue,
  splitInlineOption
} from "./args";
import { buildRequestId, GlobalOptions } from "./config";
import { BodyField, CommandDefinition, CommandField, CommandGroup } from "./discovery";
import { CliError } from "./errors";
import { bodyContainsSensitiveField, jsonBodyArgumentSource } from "./bodySecurity";
import { parseJsonObject, parseJsonValue, readJsonArgument, readRawBodyArgument } from "./json";
import { camelToSnake, normalizedLookupName } from "./names";

export interface CommandInvocation {
  globals: GlobalOptions;
  request: Record<string, unknown>;
}

export function parseCommandOptions(
  group: CommandGroup,
  command: CommandDefinition,
  tokens: string[],
  globals: GlobalOptions
): CommandInvocation {
  let parsedGlobals = { ...globals };
  const request: Record<string, unknown> = {};
  const positionalFields = commandArgumentFields(command);
  const optionFields = commandOptionMap(command);
  const optionNames = Array.from(optionFields.keys()).sort();
  let positionalIndex = 0;
  let noRequestId = false;
  let index = 0;

  while (index < tokens.length) {
    const token = tokens[index];

    if (!token.startsWith("-")) {
      const field = positionalFields[positionalIndex];
      if (!field) {
        throw new CliError(`Unexpected argument '${token}'.`);
      }
      request[field.name] = parseFieldValue(field, token, argumentMetavar(field));
      positionalIndex += 1;
      index += 1;
      continue;
    }

    if (token === "-h" || token === "--help") {
      index += 1;
      continue;
    }

    if (token === "--no-request-id") {
      noRequestId = true;
      index += 1;
      continue;
    }

    if (token in GLOBAL_BOOLEAN_OPTIONS) {
      parsedGlobals = {
        ...parsedGlobals,
        [GLOBAL_BOOLEAN_OPTIONS[token]]: true
      };
      index += 1;
      continue;
    }

    const [optionName, inlineValue] = splitInlineOption(token);

    if (optionName in GLOBAL_VALUE_OPTIONS) {
      const [value, nextIndex] = optionValue(tokens, index, optionName, inlineValue);
      parsedGlobals = applyGlobalOption(parsedGlobals, optionName, value);
      index = nextIndex;
      continue;
    }

    if (optionName === "--body") {
      if (!command.bodyField) {
        throw new CliError(`${command.name} does not accept --body.`);
      }
      const [value, nextIndex] = optionValue(tokens, index, optionName, inlineValue);
      const usesRawBody = commandUsesRawBody(command);
      const parsedBody = usesRawBody ? readRawBodyArgument(value) : parseJsonObject(readJsonArgument(value), "--body");
      if (!usesRawBody && jsonBodyArgumentSource(value) === "inline" && bodyContainsSensitiveField(command, parsedBody)) {
        throw new CliError(
          "Inline --body JSON is blocked because this request body contains sensitive fields. " +
            "Use --body @request.json, --body file:///path/request.json, or --body -."
        );
      }
      const body = usesRawBody ? parsedBody : normalizeBodyForSdk(command, parsedBody as Record<string, unknown>);
      request[command.bodyField] = body;
      index = nextIndex;
      continue;
    }

    if (optionName === "--opc-request-id") {
      const [value, nextIndex] = optionValue(tokens, index, optionName, inlineValue);
      request.opcRequestId = value;
      index = nextIndex;
      continue;
    }

    const field = optionFields.get(optionName);
    if (!field) {
      throw new CliError(
        unknownMessage("option", optionName, optionNames, `aidp ${group.name} ${command.name} -h`)
      );
    }

    const [value, nextIndex] = optionValue(tokens, index, optionName, inlineValue);
    request[field.name] = parseFieldValue(field, value, optionName);
    index = nextIndex;
  }

  validatePositionalArguments(positionalFields, positionalIndex);
  applyInstanceId(command, request, parsedGlobals);
  validateRequiredFields(command, request, positionalFields);
  addRequestId(command, request, noRequestId);

  return { globals: parsedGlobals, request };
}

export function commandArgumentFields(command: CommandDefinition): CommandField[] {
  return command.fields
    .filter((field) => {
      return field.required && field.in === "path" && field.name !== "aiDataPlatformId";
    })
    .map(normalizeField);
}

export function commandOptionFields(command: CommandDefinition): CommandField[] {
  const argumentFieldNames = new Set(commandArgumentFields(command).map((field) => field.name));
  return command.fields
    .filter((field) => {
      if (field.name === "aiDataPlatformId" || field.name === "opcRequestId") {
        return false;
      }
      if (argumentFieldNames.has(field.name)) {
        return false;
      }
      return field.in !== "body";
    })
    .map(normalizeField);
}

export function commandRequiresInstanceId(command: CommandDefinition): boolean {
  return command.fields.some((field) => field.name === "aiDataPlatformId" && field.required);
}

export function commandUsesRawBody(command: CommandDefinition): boolean {
  return Boolean(
    command.bodyField &&
      !command.bodyModel &&
      command.bodyFields.length === 0 &&
      Object.keys(command.bodyModels).length === 0
  );
}

export function normalizeBodyForSdk(command: CommandDefinition, body: Record<string, unknown>): Record<string, unknown> {
  const fields = rootBodyFields(command);
  if (fields.length === 0) {
    return body;
  }
  const seenModels = new Set<string>();
  if (command.bodyModel) {
    seenModels.add(command.bodyModel);
  }
  return normalizeObjectForFields(command, body, fields, seenModels);
}

function rootBodyFields(command: CommandDefinition): BodyField[] {
  const rootModel = command.bodyModel ? command.bodyModels[command.bodyModel] : undefined;
  return rootModel?.fields ?? command.bodyFields;
}

function normalizeObjectForFields(
  command: CommandDefinition,
  body: Record<string, unknown>,
  fields: BodyField[],
  seenModels: Set<string>
): Record<string, unknown> {
  const normalized: Record<string, unknown> = {};
  const consumedKeys = new Set<string>();

  for (const field of fields) {
    const inputKey = inputKeyForField(body, field);
    if (inputKey === undefined) {
      continue;
    }
    consumedKeys.add(inputKey);
    normalized[field.name] = normalizeFieldValue(command, field, body[inputKey], seenModels);
  }

  for (const [key, value] of Object.entries(body)) {
    if (!consumedKeys.has(key) && normalized[key] === undefined) {
      normalized[key] = value;
    }
  }

  return normalized;
}

function inputKeyForField(body: Record<string, unknown>, field: BodyField): string | undefined {
  if (Object.prototype.hasOwnProperty.call(body, field.name)) {
    return field.name;
  }
  const wireName = camelToSnake(field.name);
  if (Object.prototype.hasOwnProperty.call(body, wireName)) {
    return wireName;
  }
  return undefined;
}

function normalizeFieldValue(
  command: CommandDefinition,
  field: BodyField,
  value: unknown,
  seenModels: Set<string>
): unknown {
  if (!field.modelName) {
    return value;
  }
  if (field.type === "array" && Array.isArray(value)) {
    return value.map((item) => normalizeModelValue(command, field.modelName, item, seenModels));
  }
  return normalizeModelValue(command, field.modelName, value, seenModels);
}

function normalizeModelValue(
  command: CommandDefinition,
  modelName: string,
  value: unknown,
  seenModels: Set<string>
): unknown {
  if (!isJsonObject(value) || seenModels.has(modelName)) {
    return value;
  }
  const model = command.bodyModels[modelName];
  if (!model) {
    return value;
  }
  const nextSeenModels = new Set(seenModels);
  nextSeenModels.add(modelName);
  return normalizeObjectForFields(command, value, model.fields, nextSeenModels);
}

function isJsonObject(value: unknown): value is Record<string, unknown> {
  return Boolean(value) && typeof value === "object" && !Array.isArray(value);
}

export function argumentMetavar(field: CommandField): string {
  return field.cliName.replace(/-/g, "_").toUpperCase();
}

export function withCommandUsageHint(
  group: CommandGroup,
  command: CommandDefinition,
  error: CliError
): CliError {
  const help = `Use "aidp ${group.name} ${command.name} -h" for command help.`;
  if (error.message.includes(help)) {
    return error;
  }
  return new CliError(`${error.message}\n${help}`, error.exitCode);
}

export function unknownMessage(
  kind: string,
  name: string,
  candidates: string[],
  helpCommand: string,
  matches = closeMatches(name, candidates, 3)
): string {
  const parts = [`Unknown ${kind} '${name}'.`];
  if (matches.length > 0) {
    parts.push(`Did you mean ${matches.map((match) => `'${match}'`).join(", ")}?`);
  }
  parts.push(`Run "${helpCommand}" for help.`);
  return parts.join(" ");
}

export function closeMatches(value: string, candidates: string[], limit = 3): string[] {
  const normalizedValue = normalizedLookupName(value);
  const scored = Array.from(new Set(candidates))
    .map((candidate) => {
      const normalizedCandidate = normalizedLookupName(candidate);
      return {
        candidate,
        score: matchScore(normalizedValue, normalizedCandidate)
      };
    })
    .filter((item) => item.score >= 0.55)
    .sort((left, right) => right.score - left.score || left.candidate.localeCompare(right.candidate));
  return scored.slice(0, limit).map((item) => item.candidate);
}

function commandOptionMap(command: CommandDefinition): Map<string, CommandField> {
  const options = new Map<string, CommandField>();
  for (const field of commandOptionFields(command)) {
    options.set(`--${field.cliName}`, field);
  }
  return options;
}

function validatePositionalArguments(fields: CommandField[], parsedCount: number): void {
  if (parsedCount >= fields.length) {
    return;
  }
  throw new CliError(`Missing required argument ${argumentMetavar(fields[parsedCount])}.`);
}

function applyInstanceId(
  command: CommandDefinition,
  request: Record<string, unknown>,
  globals: GlobalOptions
): void {
  if (!commandRequiresInstanceId(command) || request.aiDataPlatformId !== undefined) {
    return;
  }
  if (!globals.instanceId) {
    throw new CliError("Missing AIDP instance OCID. Set --instance-id or AIDP_INSTANCE_ID.");
  }
  request.aiDataPlatformId = globals.instanceId;
}

function validateRequiredFields(
  command: CommandDefinition,
  request: Record<string, unknown>,
  positionalFields: CommandField[]
): void {
  const positionalFieldNames = new Set(positionalFields.map((field) => field.name));
  for (const field of command.fields) {
    if (!field.required || request[field.name] !== undefined) {
      continue;
    }
    if (field.name === "aiDataPlatformId" || positionalFieldNames.has(field.name)) {
      continue;
    }
    if (field.in === "body") {
      throw new CliError("Missing required option --body.");
    }
    throw new CliError(`Missing required option --${field.cliName}.`);
  }
}

function addRequestId(
  command: CommandDefinition,
  request: Record<string, unknown>,
  noRequestId: boolean
): void {
  if (noRequestId || request.opcRequestId !== undefined) {
    return;
  }
  if (command.fields.some((field) => field.name === "opcRequestId")) {
    request.opcRequestId = buildRequestId();
  }
}

function parseFieldValue(field: CommandField, rawValue: string, label: string): unknown {
  const enumValues = fieldEnumValues(field);
  if (enumValues.length > 0) {
    const matched = enumValues.find((value) => String(value) === rawValue);
    if (matched === undefined) {
      throw new CliError(`${label} must be one of: ${enumValues.map(String).join(", ")}.`);
    }
    return matched;
  }

  if (field.type === "boolean" || field.type === "bool") {
    return parseBoolean(rawValue, label);
  }
  if (field.type === "number" || field.type === "float" || field.type === "integer" || field.type === "int") {
    return parseNumber(rawValue, label, field.type === "integer" || field.type === "int");
  }
  if (field.type === "array") {
    const value = parseJsonValue(rawValue);
    if (!Array.isArray(value)) {
      throw new CliError(`${label} must be a JSON array.`);
    }
    return value;
  }
  if (field.type === "object") {
    return parseJsonObject(readJsonArgument(rawValue), label);
  }
  return rawValue;
}

function parseBoolean(value: string, label: string): boolean {
  const normalized = value.toLowerCase();
  if (normalized === "true") {
    return true;
  }
  if (normalized === "false") {
    return false;
  }
  throw new CliError(`${label} must be true or false.`);
}

function parseNumber(value: string, label: string, integer: boolean): number {
  const parsed = Number(value);
  if (!Number.isFinite(parsed) || (integer && !Number.isInteger(parsed))) {
    throw new CliError(`${label} must be ${integer ? "an integer" : "a number"}.`);
  }
  return parsed;
}

function normalizeField(field: CommandField): CommandField {
  return {
    ...field,
    enumValues: fieldEnumValues(field)
  };
}

function fieldEnumValues(field: CommandField): unknown[] {
  return Array.isArray(field.enumValues) ? field.enumValues : [];
}

function matchScore(value: string, candidate: string): number {
  if (!value || !candidate) {
    return 0;
  }
  if (value === candidate) {
    return 1;
  }
  if (candidate.startsWith(value)) {
    return 0.95;
  }
  if (candidate.includes(value)) {
    return 0.85;
  }
  const distance = levenshtein(value, candidate);
  return 1 - distance / Math.max(value.length, candidate.length, 1);
}

function levenshtein(left: string, right: string): number {
  const previous = Array.from({ length: right.length + 1 }, (_value, index) => index);
  for (let i = 0; i < left.length; i += 1) {
    let last = previous[0];
    previous[0] = i + 1;
    for (let j = 0; j < right.length; j += 1) {
      const old = previous[j + 1];
      previous[j + 1] =
        left[i] === right[j]
          ? last
          : Math.min(last + 1, previous[j] + 1, previous[j + 1] + 1);
      last = old;
    }
  }
  return previous[right.length];
}
