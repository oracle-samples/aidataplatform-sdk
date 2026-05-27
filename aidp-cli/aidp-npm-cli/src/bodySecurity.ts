// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import { BodyField, CommandDefinition } from "./discovery";

const MAX_BODY_SCAN_DEPTH = 20;

const SENSITIVE_BODY_FIELD_NAMES = new Set(
  [
    "apiKey",
    "accessToken",
    "clientSecret",
    "credentialDetails",
    "passphrase",
    "password",
    "personalAccessToken",
    "privateApiKey",
    "privateKey",
    "refreshToken",
    "secret",
    "secretContentBase64",
    "secretId",
    "secretKey",
    "secretTokenPair",
    "secretValue",
    "token"
  ].map(normalizedIdentifier)
);

export type JsonBodyArgumentSource = "file" | "inline" | "stdin";

export function jsonBodyArgumentSource(value: string): JsonBodyArgumentSource {
  if (value === "-") {
    return "stdin";
  }
  if (value.startsWith("@") || value.startsWith("file://")) {
    return "file";
  }
  return "inline";
}

export function commandHasSensitiveBodyFields(command: CommandDefinition): boolean {
  return fieldsContainSensitiveBodyField(command, rootBodyFields(command), "", [], new Set(), 0);
}

export function bodyContainsSensitiveField(command: CommandDefinition, body: unknown): boolean {
  const rootModel = rootBodyModelName(command);
  return valueContainsSensitiveField(command, body, rootModel, [], 0);
}

function fieldsContainSensitiveBodyField(
  command: CommandDefinition,
  fields: BodyField[],
  modelName: string,
  parentPath: string[],
  seenModels: Set<string>,
  depth: number
): boolean {
  if (depth >= MAX_BODY_SCAN_DEPTH) {
    return false;
  }
  for (const field of fields) {
    const path = [...parentPath, field.name];
    if (isSensitiveField(field.name, modelName, path)) {
      return true;
    }
    if (!field.modelName || seenModels.has(field.modelName)) {
      continue;
    }
    const model = command.bodyModels[field.modelName];
    if (!model) {
      continue;
    }
    const nextSeen = new Set(seenModels);
    nextSeen.add(field.modelName);
    if (fieldsContainSensitiveBodyField(command, model.fields, field.modelName, path, nextSeen, depth + 1)) {
      return true;
    }
  }
  return false;
}

function valueContainsSensitiveField(
  command: CommandDefinition,
  value: unknown,
  modelName: string,
  parentPath: string[],
  depth: number
): boolean {
  if (depth >= MAX_BODY_SCAN_DEPTH) {
    return false;
  }
  if (Array.isArray(value)) {
    return value.some((item) => valueContainsSensitiveField(command, item, modelName, parentPath, depth + 1));
  }
  if (!isRecord(value)) {
    return false;
  }

  for (const [key, nestedValue] of Object.entries(value)) {
    const path = [...parentPath, key];
    if (isSensitiveField(key, modelName, path)) {
      return true;
    }
    const field = bodyFieldForKey(command, modelName, key);
    const nextModelName = field?.modelName ?? "";
    if (valueContainsSensitiveField(command, nestedValue, nextModelName, path, depth + 1)) {
      return true;
    }
  }
  return false;
}

function isSensitiveField(fieldName: string, modelName: string, path: string[]): boolean {
  const normalizedName = normalizedIdentifier(fieldName);
  if (SENSITIVE_BODY_FIELD_NAMES.has(normalizedName)) {
    return true;
  }
  if (normalizedName === "credential") {
    return normalizedIdentifier(modelName) === "gitconfig" || parentPathName(path) === "gitconfig";
  }
  return false;
}

function bodyFieldForKey(command: CommandDefinition, modelName: string, key: string): BodyField | undefined {
  return fieldsForModel(command, modelName).find(
    (field) => normalizedIdentifier(field.name) === normalizedIdentifier(key)
  );
}

function fieldsForModel(command: CommandDefinition, modelName: string): BodyField[] {
  if (modelName && command.bodyModels[modelName]) {
    return command.bodyModels[modelName].fields;
  }
  return rootBodyFields(command);
}

function rootBodyFields(command: CommandDefinition): BodyField[] {
  const modelName = rootBodyModelName(command);
  return modelName && command.bodyModels[modelName] ? command.bodyModels[modelName].fields : command.bodyFields;
}

function rootBodyModelName(command: CommandDefinition): string {
  return command.bodyModel && command.bodyModels[command.bodyModel] ? command.bodyModel : "";
}

function parentPathName(path: string[]): string {
  return path.length >= 2 ? normalizedIdentifier(path[path.length - 2]) : "";
}

function normalizedIdentifier(value: string): string {
  return value.replace(/[^A-Za-z0-9]/g, "").toLowerCase();
}

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}
