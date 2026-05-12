import {
  assertAuthMode,
  defaultGlobalOptions,
  GlobalOptions
} from "./config";
import { CliError } from "./errors";

export interface ParsedCommand {
  command: "help" | "version" | "services" | "operations" | "invoke";
  globals: GlobalOptions;
  args: string[];
}

const GLOBAL_OPTIONS_REQUIRING_VALUE = new Set([
  "--config-file",
  "--profile",
  "--auth",
  "--region",
  "--endpoint",
  "--environment-prefix",
  "--environmentprefix",
  "--environment-domain",
  "--environment-host",
  "--timeout",
  "--ai-data-platform-id"
]);

export function parseRootArgs(argv: string[]): ParsedCommand {
  const globals = defaultGlobalOptions();
  let index = 0;

  while (index < argv.length) {
    const token = argv[index];

    if (token === "-h" || token === "--help") {
      return { command: "help", globals, args: [] };
    }

    if (token === "-v" || token === "--version") {
      return { command: "version", globals, args: [] };
    }

    if (!token.startsWith("-")) {
      break;
    }

    if (token === "--debug") {
      globals.debug = true;
      index += 1;
      continue;
    }

    const [optionName, inlineValue] = splitInlineOption(token);
    if (!GLOBAL_OPTIONS_REQUIRING_VALUE.has(optionName)) {
      throw new CliError(`Unknown global option ${optionName}.`);
    }

    const value = inlineValue ?? readRequiredValue(argv, index, optionName);
    applyGlobalOption(globals, optionName, value);
    index += inlineValue === undefined ? 2 : 1;
  }

  const command = argv[index];
  if (!command) {
    return { command: "help", globals, args: [] };
  }

  if (!["services", "operations", "invoke"].includes(command)) {
    throw new CliError(`Unknown command ${command}. Run 'aidp --help'.`);
  }

  return {
    command: command as ParsedCommand["command"],
    globals,
    args: argv.slice(index + 1)
  };
}

function applyGlobalOption(globals: GlobalOptions, optionName: string, value: string): void {
  switch (optionName) {
    case "--config-file":
      globals.configFile = value;
      return;
    case "--profile":
      globals.profile = value;
      return;
    case "--auth":
      assertAuthMode(value);
      globals.auth = value;
      return;
    case "--region":
      globals.region = value;
      return;
    case "--endpoint":
      globals.endpoint = value;
      return;
    case "--environment-prefix":
    case "--environmentprefix":
      globals.environmentPrefix = value;
      return;
    case "--environment-domain":
      globals.environmentDomain = value;
      return;
    case "--environment-host":
      globals.environmentHost = value;
      return;
    case "--timeout":
      globals.timeout = parseTimeout(value);
      return;
    case "--ai-data-platform-id":
      globals.aiDataPlatformId = value;
      return;
    default:
      throw new CliError(`Unknown global option ${optionName}.`);
  }
}

export function splitInlineOption(token: string): [string, string | undefined] {
  const separatorIndex = token.indexOf("=");
  if (separatorIndex < 0) {
    return [token, undefined];
  }
  return [token.slice(0, separatorIndex), token.slice(separatorIndex + 1)];
}

export function readRequiredValue(argv: string[], optionIndex: number, optionName: string): string {
  const value = argv[optionIndex + 1];
  if (value === undefined || value.startsWith("-")) {
    throw new CliError(`${optionName} requires a value.`);
  }
  return value;
}

function parseTimeout(value: string): number {
  const timeout = Number(value);
  if (!Number.isFinite(timeout) || timeout <= 0) {
    throw new CliError("--timeout must be a positive number of seconds.");
  }
  return timeout;
}
