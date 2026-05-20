// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import { existsSync, readFileSync } from "fs";
import { join } from "path";

import {
  BodyField,
  BodyModel,
  BodyVariant,
  CommandDefinition,
  CommandField,
  CommandGroup,
  CommandManifest
} from "./discovery";
import { CliError } from "./errors";

interface RawManifest {
  commandGroups?: RawCommandGroup[];
  sourceSpec?: string;
  sourceSpecSha256?: string;
  version?: number;
}

interface RawCommandGroup {
  clientClassName?: string;
  commands?: RawCommand[];
  description?: string;
  name?: string;
  tag?: string;
}

interface RawCommand {
  aliases?: string[];
  bodyEnumFields?: Record<string, unknown[]>;
  bodyField?: string;
  bodyFields?: RawBodyField[];
  bodyModel?: string;
  bodyModels?: Record<string, RawBodyModel>;
  bodyRequiredFields?: string[];
  deprecated?: boolean;
  description?: string;
  fields?: RawField[];
  httpMethod?: string;
  name?: string;
  operationId?: string;
  path?: string;
  responseBodyKey?: string;
  responseHeaderFields?: string[];
  sdkMethodName?: string;
  section?: string;
  summary?: string;
}

interface RawField {
  cliName?: string;
  description?: string;
  enumValues?: unknown[];
  in?: string;
  modelName?: string;
  name?: string;
  originalName?: string;
  required?: boolean;
  type?: string;
}

interface RawBodyField {
  enumValues?: unknown[];
  itemType?: string;
  modelName?: string;
  name?: string;
  required?: boolean;
  type?: string;
}

interface RawBodyModel {
  enumFields?: Record<string, unknown[]>;
  fields?: RawBodyField[];
  requiredFields?: string[];
  variants?: RawBodyVariant[];
}

interface RawBodyVariant {
  discriminatorField?: string;
  discriminatorValue?: unknown;
  modelName?: string;
}

export function loadCommandManifest(): CommandManifest {
  const manifestPath = join(__dirname, "operation_manifest.json");
  if (!existsSync(manifestPath)) {
    throw new CliError("AIDP command manifest is missing. Regenerate the CLI package before running aidp.");
  }

  const raw = JSON.parse(readFileSync(manifestPath, "utf8")) as RawManifest;
  if (!Array.isArray(raw.commandGroups)) {
    throw new CliError("AIDP command manifest is invalid. Regenerate the CLI package before running aidp.");
  }

  return {
    commandGroups: raw.commandGroups.map(commandGroupFromRaw),
    sourceSpec: String(raw.sourceSpec ?? ""),
    sourceSpecSha256: String(raw.sourceSpecSha256 ?? ""),
    version: Number(raw.version ?? 0)
  };
}

function commandGroupFromRaw(raw: RawCommandGroup): CommandGroup {
  return {
    clientClassName: requiredString(raw.clientClassName, "clientClassName"),
    commands: (raw.commands ?? []).map(commandFromRaw),
    description: String(raw.description ?? ""),
    name: requiredString(raw.name, "name"),
    tag: String(raw.tag ?? "")
  };
}

function commandFromRaw(raw: RawCommand): CommandDefinition {
  return {
    aliases: (raw.aliases ?? []).map(String),
    bodyEnumFields: normalizeEnumMap(raw.bodyEnumFields),
    bodyField: raw.bodyField ? String(raw.bodyField) : undefined,
    bodyFields: (raw.bodyFields ?? []).map(bodyFieldFromRaw),
    bodyModel: String(raw.bodyModel ?? ""),
    bodyModels: bodyModelsFromRaw(raw.bodyModels ?? {}),
    bodyRequiredFields: (raw.bodyRequiredFields ?? []).map(String),
    deprecated: Boolean(raw.deprecated),
    description: String(raw.description ?? ""),
    fields: (raw.fields ?? []).map(fieldFromRaw),
    httpMethod: String(raw.httpMethod ?? ""),
    name: requiredString(raw.name, "name"),
    operationId: String(raw.operationId ?? ""),
    path: String(raw.path ?? ""),
    responseBodyKey: String(raw.responseBodyKey ?? ""),
    responseHeaderFields: (raw.responseHeaderFields ?? []).map(String),
    sdkMethodName: requiredString(raw.sdkMethodName, "sdkMethodName"),
    section: String(raw.section ?? "Available Commands"),
    summary: String(raw.summary ?? "")
  };
}

function fieldFromRaw(raw: RawField): CommandField {
  const name = requiredString(raw.name, "field.name");
  return {
    cliName: String(raw.cliName ?? name),
    description: String(raw.description ?? ""),
    enumValues: raw.enumValues ?? [],
    in: String(raw.in ?? ""),
    modelName: String(raw.modelName ?? ""),
    name,
    originalName: String(raw.originalName ?? name),
    required: Boolean(raw.required),
    type: String(raw.type ?? "")
  };
}

function bodyFieldFromRaw(raw: RawBodyField): BodyField {
  return {
    enumValues: raw.enumValues ?? [],
    itemType: String(raw.itemType ?? ""),
    modelName: String(raw.modelName ?? ""),
    name: requiredString(raw.name, "bodyField.name"),
    required: Boolean(raw.required),
    type: String(raw.type ?? "")
  };
}

function bodyModelsFromRaw(raw: Record<string, RawBodyModel>): Record<string, BodyModel> {
  const models: Record<string, BodyModel> = {};
  for (const [name, model] of Object.entries(raw)) {
    models[name] = {
      enumFields: normalizeEnumMap(model.enumFields),
      fields: (model.fields ?? []).map(bodyFieldFromRaw),
      requiredFields: (model.requiredFields ?? []).map(String),
      variants: (model.variants ?? []).map(bodyVariantFromRaw)
    };
  }
  return models;
}

function bodyVariantFromRaw(raw: RawBodyVariant): BodyVariant {
  return {
    discriminatorField: requiredString(raw.discriminatorField, "bodyVariant.discriminatorField"),
    discriminatorValue: raw.discriminatorValue,
    modelName: requiredString(raw.modelName, "bodyVariant.modelName")
  };
}

function normalizeEnumMap(value: Record<string, unknown[]> | undefined): Record<string, unknown[]> {
  const result: Record<string, unknown[]> = {};
  for (const [key, items] of Object.entries(value ?? {})) {
    result[key] = Array.isArray(items) ? items : [];
  }
  return result;
}

function requiredString(value: unknown, field: string): string {
  if (typeof value !== "string" || value.length === 0) {
    throw new CliError(`AIDP command manifest is invalid: missing ${field}.`);
  }
  return value;
}
