const WORD_PATTERN = /[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+/g;

export function wordsFromPascal(value: string): string[] {
  return value.match(WORD_PATTERN) ?? [];
}

export function serviceNameFromClientClass(className: string): string {
  const stem = className.replace(/Client$/, "");
  return wordsFromPascal(stem)
    .map((word) => word.toLowerCase())
    .join("-");
}

export function camelToSnake(value: string): string {
  return wordsFromPascal(value)
    .map((word) => word.toLowerCase())
    .join("_");
}

export function cliNameToLowerCamel(value: string): string {
  const trimmed = value.trim();
  if (!trimmed.includes("-") && !trimmed.includes("_")) {
    return trimmed;
  }

  const parts = trimmed
    .split(/[-_]+/)
    .filter(Boolean)
    .map((part) => part.toLowerCase());

  return parts
    .map((part, index) => {
      if (index === 0) {
        return part;
      }
      return part.charAt(0).toUpperCase() + part.slice(1);
    })
    .join("");
}

export function normalizedLookupName(value: string): string {
  return value.replace(/[-_]/g, "").toLowerCase();
}
