import { assertAuthMode, defaultGlobalOptions, GlobalOptions } from "./config";
import { CliError } from "./errors";

export interface ParsedArgs {
  args: string[];
  globals: GlobalOptions;
  helpRequested: boolean;
  versionRequested: boolean;
}

export const GLOBAL_VALUE_OPTIONS: Record<string, keyof GlobalOptions> = {
  "--config-file": "configFile",
  "--profile": "profile",
  "-p": "profile",
  "--auth": "auth",
  "--region": "region",
  "--endpoint": "endpoint",
  "--timeout": "timeout",
  "--instance-id": "instanceId"
};

export const GLOBAL_BOOLEAN_OPTIONS: Record<string, keyof GlobalOptions> = {
  "--debug": "debug"
};

export function parseGlobalOptions(argv: string[]): ParsedArgs {
  let globals = defaultGlobalOptions();
  const remaining: string[] = [];
  let helpRequested = false;
  let versionRequested = false;
  let commandSeen = false;
  let index = 0;

  while (index < argv.length) {
    const token = argv[index];
    if (token === "-h" || token === "--help") {
      helpRequested = true;
      index += 1;
      continue;
    }
    if (token === "-v" || token === "--version") {
      versionRequested = true;
      index += 1;
      continue;
    }
    if (!commandSeen && token in GLOBAL_BOOLEAN_OPTIONS) {
      globals = { ...globals, [GLOBAL_BOOLEAN_OPTIONS[token]]: true };
      index += 1;
      continue;
    }

    const [optionName, inlineValue] = splitInlineOption(token);
    if (!commandSeen && optionName in GLOBAL_VALUE_OPTIONS) {
      const [value, nextIndex] = optionValue(argv, index, optionName, inlineValue);
      globals = applyGlobalOption(globals, optionName, value);
      index = nextIndex;
      continue;
    }
    if (!commandSeen && token.startsWith("-")) {
      throw new CliError(`Unknown option '${optionName}'.`);
    }

    remaining.push(token);
    if (!token.startsWith("-")) {
      commandSeen = true;
    }
    index += 1;
  }

  return { args: remaining, globals, helpRequested, versionRequested };
}

export function consumeLeadingGlobalOptions(
  tokens: string[],
  globals: GlobalOptions
): [GlobalOptions, string[]] {
  let values = { ...globals };
  let index = 0;

  while (index < tokens.length) {
    const token = tokens[index];
    if (token in GLOBAL_BOOLEAN_OPTIONS) {
      values = { ...values, [GLOBAL_BOOLEAN_OPTIONS[token]]: true };
      index += 1;
      continue;
    }

    const [optionName, inlineValue] = splitInlineOption(token);
    if (optionName in GLOBAL_VALUE_OPTIONS) {
      const [value, nextIndex] = optionValue(tokens, index, optionName, inlineValue);
      values = applyGlobalOption(values, optionName, value);
      index = nextIndex;
      continue;
    }

    break;
  }

  return [values, tokens.slice(index)];
}

export function applyGlobalOption(
  globals: GlobalOptions,
  optionName: string,
  value: string
): GlobalOptions {
  const key = GLOBAL_VALUE_OPTIONS[optionName];
  if (!key) {
    throw new CliError(`Unknown global option ${optionName}.`);
  }

  if (key === "auth") {
    assertAuthMode(value);
    return { ...globals, auth: value };
  }
  if (key === "timeout") {
    return { ...globals, timeout: parseTimeout(value) };
  }
  return { ...globals, [key]: value };
}

export function splitInlineOption(token: string): [string, string | undefined] {
  const separatorIndex = token.indexOf("=");
  if (separatorIndex < 0) {
    return [token, undefined];
  }
  return [token.slice(0, separatorIndex), token.slice(separatorIndex + 1)];
}

export function optionValue(
  argv: string[],
  optionIndex: number,
  optionName: string,
  inlineValue: string | undefined
): [string, number] {
  if (inlineValue !== undefined) {
    return [inlineValue, optionIndex + 1];
  }
  const value = argv[optionIndex + 1];
  if (value === undefined) {
    throw new CliError(`${optionName} requires a value.`);
  }
  return [value, optionIndex + 2];
}

function parseTimeout(value: string): number {
  const timeout = Number(value);
  if (!Number.isFinite(timeout) || timeout <= 0) {
    throw new CliError("--timeout must be a positive number of seconds.");
  }
  return timeout;
}
