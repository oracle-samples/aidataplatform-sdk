// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import { readFileSync } from "fs";
import { join } from "path";

import { consumeLeadingGlobalOptions, parseGlobalOptions } from "./args";
import {
  aidpConfigPath,
  buildAuthenticationDetailsProvider,
  configureClientEndpoint,
  readAidpConfig,
  resolveEndpoint,
  writeAidpConfig
} from "./config";
import {
  CommandDefinition,
  CommandGroup,
  CommandManifest,
  findCommand,
  findCommandGroup
} from "./discovery";
import { CliError } from "./errors";
import {
  commandGroupsHelp,
  commandGroupsOutput,
  commandHelp,
  commandSummary,
  configureHelp,
  groupHelp,
  rootHelp,
  searchHelp
} from "./help";
import {
  closeMatches,
  parseCommandOptions,
  unknownMessage,
  withCommandUsageHint
} from "./commandArgs";
import { loadCommandManifest } from "./manifest";
import { normalizedLookupName } from "./names";
import { CapturedHttpResponse, printErrorResponse, printResponse, stringify } from "./output";
import { loadSdkClientClass } from "./sdk";

export async function main(argv: string[] = process.argv.slice(2)): Promise<number> {
  try {
    const manifest = loadCommandManifest();
    const parsed = parseGlobalOptions(argv);

    if (parsed.versionRequested) {
      printVersion();
      return 0;
    }
    if (parsed.args.length === 0) {
      console.log(rootHelp(manifest));
      return 0;
    }

    return await dispatch(manifest, parsed.args, parsed.globals, parsed.helpRequested);
  } catch (error) {
    if (isServiceError(error)) {
      printErrorResponse(serviceErrorPayload(error));
      return serviceErrorStatus(error);
    }
    const detail = error instanceof Error ? error.message : String(error);
    console.error(`aidp: error: ${detail}`);
    return error instanceof CliError ? error.exitCode : 1;
  }
}

async function dispatch(
  manifest: CommandManifest,
  args: string[],
  globals: ReturnType<typeof parseGlobalOptions>["globals"],
  helpRequested: boolean
): Promise<number> {
  const command = args[0];
  const tail = args.slice(1);

  if (command === "help") {
    return handleHelp(manifest, tail);
  }
  if (command === "version") {
    printVersion();
    return 0;
  }
  if (command === "command-groups") {
    console.log(helpRequested ? commandGroupsHelp() : commandGroupsOutput(manifest));
    return 0;
  }
  if (command === "search") {
    if (helpRequested || tail.length === 0) {
      console.log(searchHelp());
    } else {
      handleSearch(manifest, tail);
    }
    return 0;
  }
  if (command === "configure") {
    if (helpRequested || tail.length === 0) {
      console.log(configureHelp());
    } else {
      handleConfigure(tail);
    }
    return 0;
  }

  const group = findCommandGroup(manifest, command);
  if (!group) {
    throw unknownCommandGroup(manifest, command);
  }

  const [updatedGlobals, remainingTail] = consumeLeadingGlobalOptions(tail, globals);
  if (remainingTail.length === 0) {
    console.log(groupHelp(group));
    return 0;
  }

  const commandName = remainingTail[0];
  const commandDefinition = findCommand(group, commandName);
  if (!commandDefinition) {
    throw unknownCommandName(group, commandName);
  }
  if (helpRequested) {
    console.log(commandHelp(group, commandDefinition));
    return 0;
  }

  return await handleCommand(group, commandDefinition, remainingTail.slice(1), updatedGlobals);
}

function handleHelp(manifest: CommandManifest, args: string[]): number {
  if (args.length === 0) {
    console.log(rootHelp(manifest));
    return 0;
  }
  if (args[0] === "command-groups") {
    console.log(commandGroupsHelp());
    return 0;
  }
  if (args[0] === "search") {
    console.log(searchHelp());
    return 0;
  }
  if (args[0] === "configure") {
    console.log(configureHelp());
    return 0;
  }
  if (args[0] === "version") {
    printVersion();
    return 0;
  }

  const group = findCommandGroup(manifest, args[0]);
  if (!group) {
    throw unknownCommandGroup(manifest, args[0]);
  }
  if (args.length === 1) {
    console.log(groupHelp(group));
    return 0;
  }
  const command = findCommand(group, args[1]);
  if (!command) {
    throw unknownCommandName(group, args[1]);
  }
  console.log(commandHelp(group, command));
  return 0;
}

async function handleCommand(
  group: CommandGroup,
  command: CommandDefinition,
  tokens: string[],
  globals: ReturnType<typeof parseGlobalOptions>["globals"]
): Promise<number> {
  let invocation: ReturnType<typeof parseCommandOptions>;
  try {
    invocation = parseCommandOptions(group, command, tokens, globals);
  } catch (error) {
    if (error instanceof CliError) {
      throw withCommandUsageHint(group, command, error);
    }
    throw error;
  }

  const authProvider = await buildAuthenticationDetailsProvider(invocation.globals);
  const endpoint = resolveEndpoint(invocation.globals, authProvider);
  const clientClass = group.clientClass ?? loadSdkClientClass(group.clientClassName);
  const client = new clientClass({ authenticationDetailsProvider: authProvider });
  configureClientEndpoint(client, endpoint);

  const capture = installHttpCapture(client, group, command, invocation.request, invocation.globals.debug);
  const sdkMethod = client[command.sdkMethodName];
  if (typeof sdkMethod !== "function") {
    throw new CliError(`${group.name} has no command-name '${command.name}'.`);
  }

  try {
    const response = await callSdkMethod(
      client,
      sdkMethod as (...args: unknown[]) => Promise<unknown>,
      invocation.request
    );
    printResponse(response, capture.captured);
  } catch (error) {
    if (error instanceof CliError) {
      throw withCommandUsageHint(group, command, error);
    }
    throw error;
  } finally {
    closeClient(client);
  }

  return 0;
}

async function callSdkMethod(
  client: Record<string, unknown>,
  sdkMethod: (...args: unknown[]) => Promise<unknown>,
  request: Record<string, unknown>
): Promise<unknown> {
  const originalWarn = console.warn;
  console.warn = (...args: unknown[]) => {
    const message = args.map(String).join(" ");
    if (message.startsWith("Request cannot be retried. Not Retrying. Exception occurred")) {
      return;
    }
    originalWarn.apply(console, args);
  };
  try {
    return await sdkMethod.call(client, request);
  } finally {
    console.warn = originalWarn;
  }
}

function isServiceError(error: unknown): error is Record<string, unknown> {
  if (!error || typeof error !== "object") {
    return false;
  }
  const value = error as Record<string, unknown>;
  return typeof value.statusCode === "number" && "serviceCode" in value && "message" in value;
}

function serviceErrorPayload(error: Record<string, unknown>): Record<string, unknown> {
  return {
    status: serviceErrorStatus(error),
    code: String(error.serviceCode ?? ""),
    message: String(error.message ?? ""),
    "opc-request-id": error.opcRequestId ?? null
  };
}

function serviceErrorStatus(error: Record<string, unknown>): number {
  const status = Number(error.statusCode);
  return Number.isFinite(status) && status > 0 ? status : 1;
}

function handleConfigure(args: string[]): void {
  const action = args[0];
  if (action === "get") {
    const config = readAidpConfig();
    console.log("AIDP CLI configuration:");
    console.log(`  file: ${aidpConfigPath()}`);
    console.log(`  instance-id: ${config["instance-id"] || "(not set)"}`);
    return;
  }
  if (action === "set") {
    if (args.length !== 3) {
      throw new CliError("Usage: aidp configure set instance-id <ocid>");
    }
    if (args[1] !== "instance-id") {
      throw new CliError("Only instance-id can be configured.");
    }
    const config = readAidpConfig();
    config["instance-id"] = args[2];
    writeAidpConfig(config);
    console.log(`Set instance-id in ${aidpConfigPath()}`);
    return;
  }
  throw new CliError(`Unknown configure command '${action}'. Run 'aidp configure --help'.`);
}

interface CaptureState {
  captured?: CapturedHttpResponse;
}

function installHttpCapture(
  client: Record<string, unknown>,
  group: CommandGroup,
  command: CommandDefinition,
  requestValues: Record<string, unknown>,
  debug: boolean
): CaptureState {
  const state: CaptureState = {};
  const original = client._httpClient as { send?: (...args: unknown[]) => Promise<Response> } | undefined;
  if (!original || typeof original.send !== "function") {
    return state;
  }
  client._httpClient = {
    ...original,
    send: async (...args: unknown[]) => {
      const request = args[0] as { body?: unknown; headers?: Headers; method?: string; uri?: string };
      if (debug) {
        printDebugDetails(group, command, request, requestValues);
      }
      const response = await original.send!.apply(original, args);
      state.captured = await captureResponse(response);
      return response;
    }
  };
  return state;
}

async function captureResponse(response: Response): Promise<CapturedHttpResponse> {
  const headers: Record<string, string> = {};
  response.headers.forEach((value, key) => {
    headers[key] = value;
  });

  let data: unknown = null;
  try {
    const text = await response.clone().text();
    if (text.trim()) {
      try {
        data = JSON.parse(text);
      } catch {
        data = text;
      }
    }
  } catch {
    data = null;
  }

  return {
    data,
    headers,
    status: response.status
  };
}

function printDebugDetails(
  group: CommandGroup,
  command: CommandDefinition,
  request: { body?: unknown; headers?: Headers; method?: string; uri?: string },
  requestValues: Record<string, unknown>
): void {
  const requestFields = requestFieldMaps(command, requestValues);
  console.error("AIDP CLI debug request:");
  console.error(`  command_group: ${group.name}`);
  console.error(`  command_name: ${command.name}`);
  console.error(`  method: ${request.method || command.httpMethod}`);
  console.error(`  endpoint: ${endpointFromUrl(request.uri || "")}`);
  console.error("  base_path: ");
  console.error(`  url: ${request.uri || ""}`);
  console.error(`  resource_path: ${command.path}`);
  console.error(`  path_params: ${stringify(requestFields.pathParams)}`);
  console.error(`  query_params: ${stringify(requestFields.queryParams)}`);
  console.error(`  headers: ${stringify(safeHeaders(headersToObject(request.headers)))}`);
  console.error(`  body: ${bodyDebugSummary(request.body)}`);
}

function requestFieldMaps(command: CommandDefinition, requestValues: Record<string, unknown>): {
  pathParams: Record<string, unknown>;
  queryParams: Record<string, unknown>;
} {
  const pathParams: Record<string, unknown> = {};
  const queryParams: Record<string, unknown> = {};
  for (const field of command.fields) {
    if (field.in === "path") {
      pathParams[field.originalName] = requestValues[field.name];
    } else if (field.in === "query") {
      queryParams[field.originalName] = requestValues[field.name];
    }
  }
  return { pathParams, queryParams };
}

function endpointFromUrl(value: string): string {
  try {
    const url = new URL(value);
    const versionMatch = url.pathname.match(/^(\/\d{8})(?:\/|$)/);
    return `${url.protocol}//${url.host}${versionMatch ? versionMatch[1] : ""}`;
  } catch {
    return "";
  }
}

function headersToObject(headers: Headers | undefined): Record<string, string> {
  const result: Record<string, string> = {};
  headers?.forEach((value, key) => {
    result[key] = value;
  });
  return result;
}

function safeHeaders(headers: Record<string, string>): Record<string, string> {
  const sensitive = new Set(["authorization", "x-content-sha256", "security-token"]);
  return Object.fromEntries(
    Object.entries(headers).map(([key, value]) => [
      key,
      sensitive.has(key.toLowerCase()) ? "<redacted>" : value
    ])
  );
}

function bodyDebugSummary(body: unknown): string {
  if (body === undefined || body === null) {
    return "none";
  }
  if (typeof body === "string") {
    try {
      const parsed = JSON.parse(body) as unknown;
      if (parsed && typeof parsed === "object" && !Array.isArray(parsed)) {
        return `json object keys=${JSON.stringify(Object.keys(parsed as Record<string, unknown>).sort())}`;
      }
    } catch {
      return "string";
    }
  }
  if (body && typeof body === "object" && !Array.isArray(body)) {
    return `json object keys=${JSON.stringify(Object.keys(body as Record<string, unknown>).sort())}`;
  }
  return Array.isArray(body) ? "array" : typeof body;
}

function closeClient(client: Record<string, unknown>): void {
  const close = client.close;
  if (typeof close === "function") {
    close.call(client);
  }
}

function handleSearch(manifest: CommandManifest, args: string[]): void {
  const query = args.join(" ").trim();
  if (!query) {
    console.log(searchHelp());
    return;
  }

  const results: Array<[number, string, string, string]> = [];
  for (const group of manifest.commandGroups) {
    const groupScore = searchScore(query, [group.name, group.description], [], group.name);
    if (groupScore) {
      results.push([groupScore, group.name, "", group.description]);
    }
    for (const command of group.commands) {
      const fields = command.fields.map((field) => field.cliName).join(" ");
      const commandScore = searchScore(
        query,
        [group.name, command.name, ...command.aliases],
        [command.summary, command.description, fields],
        `${group.name} ${command.name}`
      );
      if (commandScore) {
        results.push([commandScore, group.name, command.name, commandSummary(command)]);
      }
    }
  }

  if (results.length === 0) {
    console.log(`No results for '${query}'.`);
    return;
  }

  const filtered = filterSearchResults(results).sort(searchResultSortKey);
  console.log(`Search results for '${query}':`);
  const rows = filtered.slice(0, 30).map(([_score, groupName, commandName, description]) => [
    `${groupName} ${commandName}`.trim(),
    description
  ] as [string, string]);
  console.log(formatTable(rows));
  if (filtered.length > 30) {
    console.log(`\nShowing 30 of ${filtered.length} results.`);
  }
}

function formatTable(rows: Array<[string, string]>): string {
  if (rows.length === 0) {
    return "";
  }
  const width = Math.max(...rows.map(([name]) => name.length));
  return rows
    .map(([name, description]) => `  ${name}${" ".repeat(Math.max(2, width - name.length + 2))}${description}`)
    .join("\n");
}

function filterSearchResults(results: Array<[number, string, string, string]>): Array<[number, string, string, string]> {
  const topScore = Math.max(...results.map(([score]) => score));
  if (topScore < 850) {
    return results;
  }
  const cutoff = Math.floor(topScore * 0.5);
  return results.filter(([score]) => score >= cutoff);
}

function searchResultSortKey(
  left: [number, string, string, string],
  right: [number, string, string, string]
): number {
  return right[0] - left[0] || left[1].localeCompare(right[1]) || left[2].localeCompare(right[2]);
}

const SEARCH_ACTION_PREFIXES = [
  "checkout",
  "commit",
  "create",
  "delete",
  "deploy",
  "download",
  "export",
  "generate",
  "head",
  "list",
  "manage",
  "merge",
  "patch",
  "pull",
  "push",
  "rebase",
  "remove",
  "restart",
  "restore",
  "search",
  "start",
  "stop",
  "summarize",
  "update",
  "upload",
  "get"
];

function searchScore(
  query: string,
  primaryValues: string[],
  secondaryValues: string[],
  sortValue: string
): number {
  const queryTokens = searchTokens(query);
  if (queryTokens.length === 0) {
    return 0;
  }

  const primaryValue = primaryValues.filter(Boolean).join(" ");
  const secondaryValue = secondaryValues.filter(Boolean).join(" ");
  const primaryTokens = searchTokens(primaryValue);
  const secondaryTokens = searchTokens(secondaryValue);
  if (primaryTokens.length === 0 && secondaryTokens.length === 0) {
    return 0;
  }

  const compactQuery = compactSearchText(query);
  const compactPrimary = compactSearchText(primaryValue);
  const compactSecondary = compactSearchText(secondaryValue);
  const compactSort = compactSearchText(sortValue);
  const compactSortVariants = compactSortValueVariants(sortValue);
  const expandedPrimaryTokens = expandSearchTokens(primaryTokens);
  const expandedSecondaryTokens = expandSearchTokens(secondaryTokens);

  if (isCompactActionQuery(queryTokens, compactQuery)) {
    return Math.max(...compactSortVariants.map((variant) => compactIdentitySearchScore(compactQuery, variant)));
  }

  let score = 0;
  let matched = false;
  const sortIdentityScore = Math.max(
    ...compactSortVariants.map((variant) => compactIdentitySearchScore(compactQuery, variant))
  );
  if (sortIdentityScore >= 850) {
    score += sortIdentityScore;
    matched = true;
  } else if (compactQuery === compactSort) {
    score += 1000;
    matched = true;
  } else if (compactSort.startsWith(compactQuery)) {
    score += 900;
    matched = true;
  } else if (compactSort.includes(compactQuery)) {
    score += 850;
    matched = true;
  } else if (compactPrimary.includes(compactQuery)) {
    score += 700;
    matched = true;
  } else if (compactSecondary.includes(compactQuery)) {
    score += 350;
    matched = true;
  }

  if (queryTokens.every((token) => queryTokenMatches(token, expandedPrimaryTokens))) {
    score += 500;
    matched = true;
    if (searchTokensInOrder(queryTokens, primaryTokens)) {
      score += 150;
    }
  } else if (queryTokens.length === 1 && queryTokenMatches(queryTokens[0], expandedSecondaryTokens)) {
    score += 150;
    matched = true;
  }

  for (const token of queryTokens) {
    if (expandedPrimaryTokens.has(token)) {
      score += 25;
    } else if (queryTokens.length === 1 && expandedSecondaryTokens.has(token)) {
      score += 10;
    }
  }

  const fuzzyRatio = Math.max(
    ...compactSortVariants.map((variant) => sequenceRatio(compactQuery, variant))
  );
  if (fuzzyRatio >= 0.72 && compactLengthRatio(compactQuery, compactSort) >= 0.8) {
    score += Math.floor(fuzzyRatio * 250);
    matched = true;
  }

  return matched ? score : 0;
}

function isCompactActionQuery(queryTokens: string[], compactQuery: string): boolean {
  return (
    queryTokens.length === 1 &&
    SEARCH_ACTION_PREFIXES.some((action) => compactQuery.startsWith(action) && compactQuery.length > action.length + 2)
  );
}

function compactIdentitySearchScore(compactQuery: string, compactSort: string): number {
  for (const variant of compactSearchVariants(compactQuery)) {
    if (variant === compactSort) {
      return 1000;
    }
    if (compactSort.startsWith(variant)) {
      return 900;
    }
    if (compactSort.includes(variant)) {
      return 850;
    }
  }
  return 0;
}

function compactSearchVariants(value: string): string[] {
  const variants = [value];
  if (value.length > 4 && value.endsWith("ies")) {
    variants.push(`${value.slice(0, -3)}y`);
  }
  if (value.length > 3 && value.endsWith("s")) {
    variants.push(value.slice(0, -1));
  }
  return Array.from(new Set(variants));
}

function compactSortValueVariants(value: string): string[] {
  const tokens = searchTokens(value);
  const variants = [compactSearchText(value)];
  if (tokens.length >= 2 && SEARCH_ACTION_PREFIXES.includes(tokens[tokens.length - 1])) {
    variants.push([tokens[tokens.length - 1], ...tokens.slice(0, -1)].join(""));
  }
  return Array.from(new Set(variants));
}

function compactLengthRatio(left: string, right: string): number {
  if (!left || !right) {
    return 0;
  }
  return Math.min(left.length, right.length) / Math.max(left.length, right.length);
}

function searchTokens(value: string): string[] {
  return value.toLowerCase().match(/[a-z0-9]+/g) ?? [];
}

function compactSearchText(value: string): string {
  return searchTokens(value).join("");
}

function expandSearchTokens(tokens: string[]): Set<string> {
  const expanded = new Set<string>();
  for (const token of tokens) {
    for (const variant of searchTokenVariants(token)) {
      expanded.add(variant);
    }
  }
  return expanded;
}

function searchTokenVariants(token: string): Set<string> {
  const variants = new Set([token]);
  if (token.length > 4 && token.endsWith("ies")) {
    variants.add(`${token.slice(0, -3)}y`);
  }
  if (token.length > 3 && token.endsWith("s")) {
    variants.add(token.slice(0, -1));
  }
  return variants;
}

function queryTokenMatches(queryToken: string, valueTokens: Set<string>): boolean {
  for (const variant of searchTokenVariants(queryToken)) {
    if (valueTokens.has(variant)) {
      return true;
    }
  }
  if (queryToken.length < 5) {
    return false;
  }
  return Array.from(valueTokens).some((token) => sequenceRatio(queryToken, token) >= 0.82);
}

function searchTokensInOrder(queryTokens: string[], valueTokens: string[]): boolean {
  let valueIndex = 0;
  const expandedValues = valueTokens.map(searchTokenVariants);
  for (const queryToken of queryTokens) {
    const variants = searchTokenVariants(queryToken);
    let found = false;
    while (valueIndex < expandedValues.length) {
      if (intersects(variants, expandedValues[valueIndex])) {
        valueIndex += 1;
        found = true;
        break;
      }
      valueIndex += 1;
    }
    if (!found) {
      return false;
    }
  }
  return true;
}

function intersects(left: Set<string>, right: Set<string>): boolean {
  for (const item of left) {
    if (right.has(item)) {
      return true;
    }
  }
  return false;
}

function sequenceRatio(left: string, right: string): number {
  if (left === right) {
    return 1;
  }
  const distance = levenshtein(left, right);
  return 1 - distance / Math.max(left.length, right.length, 1);
}

function levenshtein(left: string, right: string): number {
  const previous = Array.from({ length: right.length + 1 }, (_value, index) => index);
  for (let i = 0; i < left.length; i += 1) {
    let last = previous[0];
    previous[0] = i + 1;
    for (let j = 0; j < right.length; j += 1) {
      const old = previous[j + 1];
      previous[j + 1] =
        left[i] === right[j]
          ? last
          : Math.min(last + 1, previous[j] + 1, previous[j + 1] + 1);
      last = old;
    }
  }
  return previous[right.length];
}

function unknownCommandGroup(manifest: CommandManifest, name: string): CliError {
  const candidates = [
    "command-groups",
    "search",
    "configure",
    "help",
    "version",
    ...manifest.commandGroups.map((group) => group.name)
  ];
  return new CliError(unknownMessage("command group", name, candidates, "aidp command-groups"));
}

function unknownCommandName(group: CommandGroup, name: string): CliError {
  const candidates = group.commands.map((command) => command.name);
  let matches = closeMatches(name, candidates, 3);
  if (matches.length === 0) {
    const normalized = normalizedLookupName(name);
    matches = group.commands
      .filter((command) =>
        [command.sdkMethodName, command.operationId, ...command.aliases].some(
          (alias) => normalizedLookupName(alias) === normalized
        )
      )
      .map((command) => command.name)
      .slice(0, 3);
  }
  return new CliError(
    unknownMessage("command name", name, candidates, `aidp ${group.name} --help`, matches)
  );
}

function printVersion(): void {
  console.log(`aidp npm cli version-${packageVersion()}`);
}

function packageVersion(): string {
  try {
    const packageJson = JSON.parse(readFileSync(join(__dirname, "..", "package.json"), "utf8")) as {
      version?: string;
    };
    return packageJson.version ?? "unknown";
  } catch {
    return "unknown";
  }
}
