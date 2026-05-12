import { readFileSync } from "fs";
import { randomUUID } from "crypto";
import common = require("oci-common");

import { CliError } from "./errors";

export const DEFAULT_PROFILE = "DEFAULT";
export const DEFAULT_AUTH = "api_key";
export const DEFAULT_CONFIG_FILE = "~/.oci/config";
export const DEFAULT_ENVIRONMENT_PREFIX = "aidp";
export const DEFAULT_ENVIRONMENT_DOMAIN = "oraclecloud.com";
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
  aiDataPlatformId?: string;
  auth: AuthMode;
  configFile: string;
  debug: boolean;
  endpoint?: string;
  environmentDomain: string;
  environmentHost?: string;
  environmentPrefix: string;
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
    const profile = parseProfile(options.configFile, options.profile);
    return profile.region;
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
    const region = getRegion.call(authProvider);
    return normalizeRegionValue(region);
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
