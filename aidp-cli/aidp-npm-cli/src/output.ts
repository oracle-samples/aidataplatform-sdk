export interface CapturedHttpResponse {
  data: unknown;
  headers: Record<string, string>;
  status: number | null;
}

export function printResponse(response: unknown, captured?: CapturedHttpResponse): void {
  const payload = captured ? normalizeCapturedResponse(captured) : responseEnvelope(response);
  console.log("Response:");
  console.log(stringify(payload));
}

export function printErrorResponse(payload: unknown): void {
  console.error("Response:");
  console.error(stringify(payload));
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

function responseEnvelope(response: unknown): CapturedHttpResponse {
  if (!isRecord(response)) {
    return { data: response, headers: {}, status: null };
  }

  const headers: Record<string, string> = {};
  const data: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(response)) {
    if (isHeaderLikeKey(key)) {
      if (value !== undefined && value !== null) {
        headers[key] = String(value);
      }
    } else {
      data[key] = value;
    }
  }

  const dataEntries = Object.entries(data);
  return {
    data: dataEntries.length === 1 ? dataEntries[0][1] : data,
    headers,
    status: null
  };
}

function normalizeCapturedResponse(captured: CapturedHttpResponse): CapturedHttpResponse {
  if (typeof captured.data !== "string" || isJsonContentType(captured.headers)) {
    return captured;
  }
  return {
    ...captured,
    data: [Array.from(Buffer.from(captured.data, "utf8"))]
  };
}

function isJsonContentType(headers: Record<string, string>): boolean {
  const contentType = headerValue(headers, "content-type");
  return contentType !== undefined && contentType.toLowerCase().includes("json");
}

function headerValue(headers: Record<string, string>, name: string): string | undefined {
  const normalizedName = name.toLowerCase();
  for (const [key, value] of Object.entries(headers)) {
    if (key.toLowerCase() === normalizedName) {
      return value;
    }
  }
  return undefined;
}

function isHeaderLikeKey(key: string): boolean {
  const normalized = key.toLowerCase();
  return normalized === "etag" || normalized === "lastmodified" || normalized.startsWith("opc");
}

function isRecord(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}
