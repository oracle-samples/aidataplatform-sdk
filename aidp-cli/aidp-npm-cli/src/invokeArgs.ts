import { buildRequestId, GlobalOptions } from "./config";
import { OperationDefinition } from "./discovery";
import { CliError } from "./errors";
import {
  parseJsonObject,
  parseJsonValue,
  readJsonArgument,
  readJsonFileOrStdin
} from "./json";
import { cliNameToLowerCamel } from "./names";
import { readRequiredValue, splitInlineOption } from "./args";

export interface InvokeOptions {
  body?: string;
  bodyField?: string;
  bodyFile?: string;
  fromJson?: string;
  help: boolean;
  noRequestId: boolean;
  opcRequestId?: string;
  output: "json" | "data" | "headers";
  params: string[];
}

export function defaultInvokeOptions(): InvokeOptions {
  return {
    help: false,
    noRequestId: false,
    output: "json",
    params: []
  };
}

export function parseInvokeOptions(argv: string[]): InvokeOptions {
  const options = defaultInvokeOptions();
  let index = 0;

  while (index < argv.length) {
    const token = argv[index];
    if (token === "-h" || token === "--help") {
      options.help = true;
      index += 1;
      continue;
    }

    if (!token.startsWith("-")) {
      throw new CliError(`Unexpected invoke argument ${token}.`);
    }

    if (token === "--no-request-id") {
      options.noRequestId = true;
      index += 1;
      continue;
    }

    const [optionName, inlineValue] = splitInlineOption(token);
    const value = inlineValue ?? readRequiredValue(argv, index, optionName);

    switch (optionName) {
      case "--param":
        options.params.push(value);
        break;
      case "--body":
        options.body = value;
        break;
      case "--body-file":
        options.bodyFile = value;
        break;
      case "--body-field":
        options.bodyField = value;
        break;
      case "--from-json":
        options.fromJson = value;
        break;
      case "--opc-request-id":
        options.opcRequestId = value;
        break;
      case "--output":
        options.output = parseOutput(value);
        break;
      default:
        throw new CliError(`Unknown invoke option ${optionName}.`);
    }

    index += inlineValue === undefined ? 2 : 1;
  }

  return options;
}

export function buildOperationRequest(
  operation: OperationDefinition,
  globals: GlobalOptions,
  options: InvokeOptions
): Record<string, unknown> {
  const request: Record<string, unknown> = {};

  if (options.fromJson) {
    Object.assign(
      request,
      normalizeParamObject(parseJsonObject(readJsonArgument(options.fromJson), "--from-json"))
    );
  }

  Object.assign(request, parseParams(options.params));

  if (globals.aiDataPlatformId && request.aiDataPlatformId === undefined) {
    request.aiDataPlatformId = globals.aiDataPlatformId;
  }

  const body = loadBody(options);
  if (body !== undefined) {
    const bodyField = options.bodyField
      ? cliNameToLowerCamel(options.bodyField)
      : inferBodyField(operation);
    if (!bodyField) {
      throw new CliError(
        `Could not infer the request body field for ${operation.displayName}. Retry with --body-field <fieldName>.`
      );
    }
    if (request[bodyField] !== undefined) {
      throw new CliError(`Use either --body/--body-file or --param ${bodyField}=..., not both.`);
    }
    request[bodyField] = body;
  }

  validateRequiredFields(request, operation);
  addRequestId(request, operation, options);
  return request;
}

function parseParams(rawParams: string[]): Record<string, unknown> {
  const params: Record<string, unknown> = {};
  for (const rawParam of rawParams) {
    const separatorIndex = rawParam.indexOf("=");
    if (separatorIndex < 0) {
      throw new CliError(`--param must be NAME=VALUE, got '${rawParam}'`);
    }

    const rawName = rawParam.slice(0, separatorIndex).trim();
    if (!rawName) {
      throw new CliError(`--param has an empty name: '${rawParam}'`);
    }

    params[cliNameToLowerCamel(rawName)] = parseJsonValue(rawParam.slice(separatorIndex + 1));
  }
  return params;
}

function normalizeParamObject(value: Record<string, unknown>): Record<string, unknown> {
  const params: Record<string, unknown> = {};
  for (const [key, item] of Object.entries(value)) {
    params[cliNameToLowerCamel(key)] = item;
  }
  return params;
}

function loadBody(options: InvokeOptions): unknown {
  if (options.body && options.bodyFile) {
    throw new CliError("Use either --body or --body-file, not both.");
  }

  if (options.bodyFile) {
    return parseJsonObject(readJsonFileOrStdin(options.bodyFile), "--body-file");
  }

  if (options.body) {
    return parseJsonObject(options.body, "--body");
  }

  return undefined;
}

function inferBodyField(operation: OperationDefinition): string | undefined {
  if (operation.bodyField) {
    return operation.bodyField;
  }

  const bodyFields = operation.requestFields.filter((field) => {
    return (
      field.endsWith("Details") ||
      field === "uploadFileDetails" ||
      field === "patchSessionDetails"
    );
  });

  return bodyFields.length === 1 ? bodyFields[0] : undefined;
}

function validateRequiredFields(
  request: Record<string, unknown>,
  operation: OperationDefinition
): void {
  const missingFields = operation.requiredFields.filter((field) => request[field] === undefined);
  if (missingFields.length === 0) {
    return;
  }

  throw new CliError(
    `Missing required parameter${missingFields.length === 1 ? "" : "s"}: ${missingFields
      .map((field) => `--param ${field}=...`)
      .join(", ")}`
  );
}

function addRequestId(
  request: Record<string, unknown>,
  operation: OperationDefinition,
  options: InvokeOptions
): void {
  if (options.opcRequestId) {
    request.opcRequestId = options.opcRequestId;
    return;
  }

  if (options.noRequestId || request.opcRequestId !== undefined) {
    return;
  }

  if (operation.requestFields.length === 0 || operation.requestFields.includes("opcRequestId")) {
    request.opcRequestId = buildRequestId();
  }
}

function parseOutput(value: string): InvokeOptions["output"] {
  if (value === "json" || value === "data" || value === "headers") {
    return value;
  }
  throw new CliError("--output must be one of: json, data, headers.");
}
