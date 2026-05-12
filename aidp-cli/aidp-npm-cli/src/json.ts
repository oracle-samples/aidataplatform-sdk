import { readFileSync } from "fs";

import { CliError } from "./errors";

export function parseJsonValue(value: string): unknown {
  const trimmed = value.trim();
  if (trimmed === "") {
    return "";
  }

  try {
    return JSON.parse(trimmed);
  } catch {
    return value;
  }
}

export function parseJsonObject(raw: string, source: string): Record<string, unknown> {
  let value: unknown;
  try {
    value = JSON.parse(raw);
  } catch (error) {
    const detail = error instanceof Error ? error.message : String(error);
    throw new CliError(`${source} is not valid JSON: ${detail}`);
  }

  if (!isRecord(value)) {
    throw new CliError(`${source} must contain a JSON object.`);
  }

  return value;
}

export function readJsonArgument(value: string): string {
  if (value === "-") {
    return readFileSync(0, "utf8");
  }

  if (value.startsWith("file://")) {
    return readFileSync(value.slice("file://".length), "utf8");
  }

  return value;
}

export function readJsonFileOrStdin(path: string): string {
  return path === "-" ? readFileSync(0, "utf8") : readFileSync(path, "utf8");
}

export function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}
