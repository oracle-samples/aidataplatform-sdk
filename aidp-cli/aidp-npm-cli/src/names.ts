// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

const WORD_PATTERN = /[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+/g;
const COMMAND_GROUP_NAME_OVERRIDES = new Map<string, string>([
  ["ml-ops", "mlops"]
]);

export function wordsFromMixed(value: string): string[] {
  const normalized = String(value || "").replace(/[^0-9A-Za-z]+/g, " ");
  const words: string[] = [];
  for (const token of normalized.split(/\s+/).filter(Boolean)) {
    words.push(...(token.match(WORD_PATTERN) ?? [token]));
  }
  return words;
}

export function serviceNameFromClientClass(className: string): string {
  const defaultName = wordsFromMixed(className.replace(/Client$/, ""))
    .map((word) => word.toLowerCase())
    .join("-");
  return COMMAND_GROUP_NAME_OVERRIDES.get(defaultName) ?? defaultName;
}

export function camelToKebab(value: string): string {
  return wordsFromMixed(value)
    .map((word) => word.toLowerCase())
    .join("-");
}

export function camelToSnake(value: string): string {
  return wordsFromMixed(value)
    .map((word) => word.toLowerCase())
    .join("_");
}

export function cliNameToLowerCamel(value: string): string {
  const parts = value
    .trim()
    .split(/[-_]+/)
    .filter(Boolean)
    .map((part) => part.toLowerCase());

  if (parts.length === 0) {
    return "";
  }

  return parts
    .map((part, index) => (index === 0 ? part : part.charAt(0).toUpperCase() + part.slice(1)))
    .join("");
}

export function lowerCamelToCliName(value: string): string {
  return camelToKebab(value);
}

export function normalizedLookupName(value: string): string {
  return value.replace(/[-_]/g, "").toLowerCase();
}
