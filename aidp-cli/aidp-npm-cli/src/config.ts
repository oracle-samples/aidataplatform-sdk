import {
  chmodSync,
  closeSync,
  existsSync,
  fsyncSync,
  mkdirSync,
  openSync,
  readFileSync,
  renameSync,
  statSync,
  unlinkSync,
  writeFileSync
} from "fs";
import { dirname } from "path";
import { randomUUID } from "crypto";
import common = require("oci-common");

import { CliError } from "./errors";

export const DEFAULT_PROFILE = "DEFAULT";
export const DEFAULT_AUTH = "security_token";
export const DEFAULT_CONFIG_FILE = "~/.oci/config";
export const DEFAULT_AIDP_CONFIG_FILE = "~/.aidp/config";
export const DEFAULT_ENVIRONMENT_PREFIX = "aidp";
export const DEFAULT_ENVIRONMENT_DOMAIN = "oraclecloud.com";
const AIDP_CONFIG_DIR_MODE = 0o700;
const AIDP_CONFIG_FILE_MODE = 0o600;
const GROUP_OR_WORLD_PERMISSIONS = 0o077;
export const AUTH_CHOICES = [
  "api_key",
  "security_token",
  "instance_principal",
  "resource_principal"
] as const;

export type AuthMode = (typeof AUTH_CHOICES)[number];

export interface ParsedProfile {
  [key: string]: string | undefined;
}

export interface GlobalOptions {
  auth: AuthMode;
  configFile: string;
  debug: boolean;
  endpoint?: string;
  environmentDomain: string;
  environmentHost?: string;
  environmentPrefix: string;
  instanceId?: string;
  profile: string;
  region?: string;
  timeout?: number;
}

const CONFIG_ENV_OVERRIDES: Record<string, string> = {
  OCI_CLI_USER: "user",
  OCI_CLI_FINGERPRINT: "fingerprint",
  OCI_CLI_KEY_FILE: "key_file",
  OCI_CLI_KEY_CONTENT: "key_content",
  OCI_CLI_TENANCY: "tenancy",
  OCI_CLI_PASSPHRASE: "pass_phrase",
  OCI_CLI_SECURITY_TOKEN_FILE: "security_token_file"
};

export function defaultGlobalOptions(): GlobalOptions {
  const auth = (process.env.OCI_CLI_AUTH || DEFAULT_AUTH) as AuthMode;
  assertAuthMode(auth);

  return {
    auth,
    configFile: process.env.OCI_CLI_CONFIG_FILE || DEFAULT_CONFIG_FILE,
    debug: false,
    endpoint: process.env.OCI_CLI_ENDPOINT,
    environmentDomain: DEFAULT_ENVIRONMENT_DOMAIN,
    environmentPrefix: DEFAULT_ENVIRONMENT_PREFIX,
    instanceId: configuredInstanceId(),
    profile: process.env.OCI_CLI_PROFILE || DEFAULT_PROFILE,
    region: process.env.OCI_CLI_REGION
  };
}

export function assertAuthMode(value: string): asserts value is AuthMode {
  if (!AUTH_CHOICES.includes(value as AuthMode)) {
    throw new CliError(
      `argument --auth: invalid choice: '${value}' (choose from ${AUTH_CHOICES.join(", ")})`
    );
  }
}

export function expandHome(value: string): string {
  if (value === "~") {
    return process.env.HOME || value;
  }
  if (value.startsWith("~/")) {
    return `${process.env.HOME || ""}/${value.slice(2)}`;
  }
  return value;
}

export function aidpConfigPath(): string {
  return expandHome(process.env.AIDP_CLI_CONFIG_FILE || DEFAULT_AIDP_CONFIG_FILE);
}

export function readAidpConfig(): Record<string, string> {
  const path = aidpConfigPath();
  if (!existsSync(path)) {
    return {};
  }
  validateAidpConfigPermissions(path);
  const raw = readFileSync(path, "utf8");
  if (!raw.trim()) {
    return {};
  }
  const value = JSON.parse(raw) as unknown;
  if (!value || typeof value !== "object" || Array.isArray(value)) {
    throw new CliError(`${path} must contain a JSON object.`);
  }
  return Object.fromEntries(
    Object.entries(value as Record<string, unknown>).map(([key, item]) => [String(key), String(item)])
  );
}

export function writeAidpConfig(config: Record<string, string>): void {
  const path = aidpConfigPath();
  ensureAidpConfigParentDirectory(path);
  validateAidpConfigPermissions(path);
  writeAidpConfigAtomically(path, `${JSON.stringify(config, null, 2)}\n`);
}

export function configuredInstanceId(): string | undefined {
  if (process.env.INSTANCE_ID) {
    return process.env.INSTANCE_ID;
  }
  try {
    return readAidpConfig()["instance-id"] || undefined;
  } catch (error) {
    if (error instanceof CliError) {
      throw error;
    }
    return undefined;
  }
}

function ensureAidpConfigParentDirectory(path: string): void {
  const parent = dirname(path);
  mkdirSync(parent, { recursive: true, mode: AIDP_CONFIG_DIR_MODE });
  if (shouldEnforceAidpConfigParentPermissions()) {
    chmodSync(parent, AIDP_CONFIG_DIR_MODE);
  }
}

function validateAidpConfigPermissions(path: string): void {
  if (process.platform === "win32") {
    return;
  }

  if (shouldEnforceAidpConfigParentPermissions()) {
    const parent = dirname(path);
    if (existsSync(parent)) {
      assertOwnerOnlyMode(parent, AIDP_CONFIG_DIR_MODE, "directory");
    }
  }

  if (existsSync(path)) {
    assertOwnerOnlyMode(path, AIDP_CONFIG_FILE_MODE, "file");
  }
}

function shouldEnforceAidpConfigParentPermissions(): boolean {
  return !process.env.AIDP_CLI_CONFIG_FILE;
}

function assertOwnerOnlyMode(path: string, expectedMode: number, kind: "directory" | "file"): void {
  const mode = statSync(path).mode & 0o777;
  if ((mode & GROUP_OR_WORLD_PERMISSIONS) !== 0) {
    throw new CliError(
      `${path} permissions are too open for the AIDP config ${kind}. ` +
        `Run 'chmod ${expectedMode.toString(8)} ${path}' and try again.`
    );
  }
}

function writeAidpConfigAtomically(path: string, content: string): void {
  const tmpPath = `${dirname(path)}/.${randomUUID()}.tmp`;
  let fd: number | undefined;
  try {
    fd = openSync(tmpPath, "wx", AIDP_CONFIG_FILE_MODE);
    writeFileSync(fd, content, "utf8");
    fsyncSync(fd);
    closeSync(fd);
    fd = undefined;
    renameSync(tmpPath, path);
    chmodSync(path, AIDP_CONFIG_FILE_MODE);
  } catch (error) {
    if (fd !== undefined) {
      closeSync(fd);
    }
    try {
      unlinkSync(tmpPath);
    } catch {
      // Best effort cleanup; preserve the original write failure.
    }
    throw error;
  }
}

export function parseProfile(configFilePath: string, profileName: string): ParsedProfile {
  const rawConfig = readFileSync(expandHome(configFilePath), "utf8");
  const lines = rawConfig.split(/\r?\n/);
  let currentProfile: string | undefined;
  const sections = new Map<string, ParsedProfile>();

  for (const rawLine of lines) {
    const line = rawLine.trim();
    if (!line || line.startsWith("#") || line.startsWith(";")) {
      continue;
    }

    const sectionMatch = line.match(/^\[(.+)\]$/);
    if (sectionMatch) {
      currentProfile = sectionMatch[1].trim();
      if (!sections.has(currentProfile)) {
        sections.set(currentProfile, {});
      }
      continue;
    }

    if (!currentProfile) {
      continue;
    }

    const separatorIndex = line.indexOf("=");
    if (separatorIndex < 0) {
      continue;
    }

    const key = line.slice(0, separatorIndex).trim();
    const value = line.slice(separatorIndex + 1).trim();
    sections.get(currentProfile)![key] = value;
  }

  const profile = sections.get(profileName);
  if (!profile) {
    throw new CliError(`OCI profile ${profileName} was not found in ${expandHome(configFilePath)}.`);
  }

  applyConfigEnvOverrides(profile);
  return profile;
}

export function resolveRegion(
  options: GlobalOptions,
  authProvider?: common.AuthenticationDetailsProvider
): string | undefined {
  if (options.region) {
    return options.region;
  }

  const providerRegion = getProviderRegion(authProvider);
  if (providerRegion) {
    return providerRegion;
  }

  if (options.auth !== "instance_principal" && options.auth !== "resource_principal") {
    return parseProfile(options.configFile, options.profile).region;
  }

  return undefined;
}

export async function buildAuthenticationDetailsProvider(
  options: GlobalOptions
): Promise<common.AuthenticationDetailsProvider> {
  const configFile = expandHome(options.configFile);

  if (options.auth === "api_key") {
    return new common.ConfigFileAuthenticationDetailsProvider(configFile, options.profile);
  }

  if (options.auth === "security_token") {
    return new common.SessionAuthDetailProvider(configFile, options.profile);
  }

  if (options.auth === "instance_principal") {
    const builder = new common.InstancePrincipalsAuthenticationDetailsProviderBuilder();
    return await builder.build();
  }

  return common.ResourcePrincipalAuthenticationDetailsProvider.builder();
}

export function resolveEndpoint(
  options: GlobalOptions,
  authProvider?: common.AuthenticationDetailsProvider
): string {
  if (options.endpoint) {
    return normalizeEndpoint(options.endpoint);
  }

  if (options.environmentHost) {
    return `https://${options.environmentHost
      .trim()
      .replace(/^https?:\/\//, "")
      .replace(/\/+$/, "")}`;
  }

  const region = resolveRegion(options, authProvider);
  if (!region) {
    throw new CliError(
      "Set --region, --endpoint, --environment-host, or region in the OCI config profile."
    );
  }
  if (/^https?:\/\//.test(region)) {
    throw new CliError(
      "Region must be an OCI region identifier. For a full service URL, use --endpoint or OCI_CLI_ENDPOINT."
    );
  }

  return `https://${options.environmentPrefix}.${region}.oci.${options.environmentDomain}`.replace(
    /\/+$/,
    ""
  );
}

export function configureClientEndpoint(client: Record<string, unknown>, endpoint: string): void {
  client.endpoint = endpoint;
}

export function buildRequestId(): string {
  return `aidp-cli-${randomUUID()}`;
}

function normalizeEndpoint(endpoint: string): string {
  const stripped = endpoint.trim().replace(/\/+$/, "");
  if (!stripped) {
    throw new CliError("--endpoint cannot be empty.");
  }
  if (stripped.startsWith("https://") || stripped.startsWith("http://")) {
    return stripped;
  }
  return `https://${stripped}`;
}

function applyConfigEnvOverrides(profile: ParsedProfile): void {
  for (const [envName, configKey] of Object.entries(CONFIG_ENV_OVERRIDES)) {
    const value = process.env[envName];
    if (value) {
      profile[configKey] = value;
    }
  }
}

function getProviderRegion(
  authProvider?: common.AuthenticationDetailsProvider
): string | undefined {
  if (!authProvider) {
    return undefined;
  }

  const provider = authProvider as unknown as Record<string, unknown>;
  const getRegion = provider.getRegion;
  if (typeof getRegion === "function") {
    return normalizeRegionValue(getRegion.call(authProvider));
  }

  return normalizeRegionValue(provider.region) ?? normalizeRegionValue(provider.regionId);
}

function normalizeRegionValue(value: unknown): string | undefined {
  if (typeof value === "string" && value.trim()) {
    return value.trim();
  }

  if (value && typeof value === "object") {
    const regionId = (value as Record<string, unknown>).regionId;
    if (typeof regionId === "string" && regionId.trim()) {
      return regionId.trim();
    }
  }

  return undefined;
}
