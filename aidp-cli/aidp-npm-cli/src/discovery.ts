import { normalizedLookupName } from "./names";

const COMMAND_GROUP_ALIASES = new Map<string, string>([
  ["credentials", "credentialstore"],
  ["git", "gitservice"]
]);

export interface CommandField {
  cliName: string;
  description: string;
  enumValues: unknown[];
  in: "path" | "query" | "header" | "body" | string;
  modelName: string;
  name: string;
  originalName: string;
  required: boolean;
  type: string;
}

export interface BodyField {
  enumValues: unknown[];
  itemType: string;
  modelName: string;
  name: string;
  required: boolean;
  type: string;
}

export interface BodyVariant {
  discriminatorField: string;
  discriminatorValue: unknown;
  modelName: string;
}

export interface BodyModel {
  enumFields: Record<string, unknown[]>;
  fields: BodyField[];
  requiredFields: string[];
  variants: BodyVariant[];
}

export interface CommandDefinition {
  aliases: string[];
  bodyEnumFields: Record<string, unknown[]>;
  bodyField?: string;
  bodyFields: BodyField[];
  bodyModel: string;
  bodyModels: Record<string, BodyModel>;
  bodyRequiredFields: string[];
  deprecated: boolean;
  description: string;
  fields: CommandField[];
  httpMethod: string;
  name: string;
  operationId: string;
  path: string;
  responseBodyKey: string;
  responseHeaderFields: string[];
  sdkMethodName: string;
  section: string;
  summary: string;
}

export interface CommandGroup {
  clientClass?: new (args: Record<string, unknown>, config?: Record<string, unknown>) => Record<string, unknown>;
  clientClassName: string;
  commands: CommandDefinition[];
  description: string;
  name: string;
  tag: string;
}

export interface CommandManifest {
  commandGroups: CommandGroup[];
  sourceSpec: string;
  sourceSpecSha256: string;
  version: number;
}

export function findCommandGroup(
  manifest: CommandManifest,
  requestedName: string
): CommandGroup | undefined {
  const normalized = normalizedLookupName(requestedName);
  const directMatch = manifest.commandGroups.find((group) => normalizedLookupName(group.name) === normalized);
  if (directMatch) {
    return directMatch;
  }
  const target = COMMAND_GROUP_ALIASES.get(normalized) ?? normalized;
  return manifest.commandGroups.find((group) => normalizedLookupName(group.name) === target);
}

export function findCommand(
  group: CommandGroup,
  requestedName: string
): CommandDefinition | undefined {
  const normalized = normalizedLookupName(requestedName);
  return group.commands.find((command) => {
    if (normalizedLookupName(command.name) === normalized) {
      return true;
    }
    return command.aliases.some((alias) => normalizedLookupName(alias) === normalized);
  });
}
