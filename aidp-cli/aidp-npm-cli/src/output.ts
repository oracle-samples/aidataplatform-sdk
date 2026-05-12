export function printResponse(response: unknown, output: "json" | "data" | "headers"): void {
  console.log("Response:");

  if (output === "headers") {
    console.log(stringify(extractHeaders(response)));
    return;
  }

  if (output === "data") {
    console.log(stringify(extractData(response)));
    return;
  }

  console.log(stringify(response));
}

export function stringify(value: unknown): string {
  return JSON.stringify(
    value,
    (_key, item) => {
      if (typeof item === "bigint") {
        return item.toString();
      }
      if (item instanceof Uint8Array) {
        return Buffer.from(item).toString("base64");
      }
      return item;
    },
    2
  );
}

function extractData(response: unknown): unknown {
  if (!isRecord(response)) {
    return response;
  }

  const data: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(response)) {
    if (isHeaderLikeKey(key)) {
      continue;
    }
    data[key] = value;
  }

  const entries = Object.entries(data);
  if (entries.length === 1) {
    return entries[0][1];
  }
  return data;
}

function extractHeaders(response: unknown): Record<string, unknown> {
  if (!isRecord(response)) {
    return {};
  }

  if (isRecord(response.headers)) {
    return response.headers;
  }

  const headers: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(response)) {
    if (isHeaderLikeKey(key)) {
      headers[key] = value;
    }
  }
  return headers;
}

function isHeaderLikeKey(key: string): boolean {
  const normalized = key.toLowerCase();
  return (
    normalized === "etag" ||
    normalized === "lastmodified" ||
    normalized === "headers" ||
    normalized.startsWith("opc")
  );
}

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}
