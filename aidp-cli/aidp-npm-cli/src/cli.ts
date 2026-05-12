import { readFileSync } from "fs";
import { join } from "path";

import { parseRootArgs } from "./args";
import {
  buildAuthenticationDetailsProvider,
  configureClientEndpoint,
  resolveEndpoint
} from "./config";
import {
  discoverServices,
  findOperation,
  findService,
  OperationDefinition,
  ServiceDefinition
} from "./discovery";
import { CliError } from "./errors";
import { operationHelp, operationsHelp, rootHelp, invokeHelp } from "./help";
import {
  buildOperationRequest,
  parseInvokeOptions
} from "./invokeArgs";
import { loadManifestServices } from "./manifest";
import { camelToSnake } from "./names";
import { printResponse, stringify } from "./output";
import { loadSdkClientClass, loadSdkModule } from "./sdk";

export async function main(argv: string[] = process.argv.slice(2)): Promise<number> {
  try {
    const parsed = parseRootArgs(argv);

    if (parsed.command === "help") {
      console.log(rootHelp());
      return 0;
    }

    if (parsed.command === "version") {
      console.log(`aidp ${packageVersion()}`);
      return 0;
    }

    if (parsed.command === "services") {
      return handleServices(loadServices());
    }

    if (parsed.command === "operations") {
      if (
        parsed.args.length === 0 ||
        parsed.args[0] === "-h" ||
        parsed.args[0] === "--help"
      ) {
        console.log(operationsHelp());
        return 0;
      }
      return handleOperations(loadServices(), parsed.args);
    }

    if (parsed.args.length === 0 || parsed.args[0] === "-h" || parsed.args[0] === "--help") {
      console.log(invokeHelp());
      return 0;
    }

    return await handleInvoke(loadServices(), parsed.args, parsed.globals);
  } catch (error) {
    if (error instanceof CliError) {
      console.error(`aidp: error: ${error.message}`);
      return error.exitCode;
    }

    const detail = error instanceof Error ? error.message : String(error);
    console.error(`aidp: error: ${detail}`);
    return 1;
  }
}

function loadServices(): ServiceDefinition[] {
  return loadManifestServices() ?? discoverServices(loadSdkModule());
}

function handleServices(services: ServiceDefinition[]): number {
  console.log("Available services:");
  services.forEach((service, index) => {
    const suffix = service.description ? ` - ${service.description}` : "";
    console.log(`${index + 1}. service: ${service.name}${suffix}`);
  });
  console.log();
  console.log("Hint: Start by listing generated workspace operations:");
  console.log("  aidp operations workspace");
  return 0;
}

function handleOperations(services: ServiceDefinition[], args: string[]): number {
  if (args.length === 0) {
    console.log(operationsHelp());
    return 0;
  }

  const service = findServiceOrThrow(services, args[0]);
  const operationName = args.find((arg, index) => index > 0 && !arg.startsWith("-"));
  if (operationName) {
    const operation = findOperationOrThrow(service, operationName);
    console.log(operationHelp(service, operation));
    return 0;
  }

  console.log(`Available operations for ${service.name}:`);
  service.operations.forEach((operation, index) => {
    const description = operationListDescription(operation);
    const suffix = description ? ` - ${description}` : "";
    console.log(`${index + 1}. operation: ${operation.displayName}${suffix}`);
    const parameters = operationListParameters(operation);
    if (parameters.length > 0) {
      console.log(`   Params: ${parameters.join(", ")}`);
    }
    console.log();
  });

  if (service.operations.length > 0) {
    const operation = exampleOperation(service.operations);
    console.log();
    console.log("Hint: Invoke an operation with required parameters:");
    console.log(invokeExample(service, operation));
    console.log();
    console.log("For operation-specific help and a sample command:");
    console.log(`  aidp operations ${service.name} ${operation.displayName} --help`);
  }

  return 0;
}

function operationListDescription(operation: OperationDefinition): string {
  const description = operation.description || operation.summary || "";
  if (!description) {
    return "";
  }
  return /[.!?]$/.test(description) ? description : `${description}.`;
}

function operationListParameters(operation: OperationDefinition): string[] {
  return operationRequiredFields(operation).map((field) => `*${camelToSnake(field)}`);
}

function operationRequiredFields(operation: OperationDefinition): string[] {
  if (operation.requiredFields.length > 0) {
    return operation.requiredFields;
  }
  return operation.fields.filter((field) => field.required).map((field) => field.name);
}

function exampleOperation(operations: OperationDefinition[]): OperationDefinition {
  return operations.find((operation) => operation.displayName.startsWith("list_")) ?? operations[0];
}

function invokeExample(service: ServiceDefinition, operation: OperationDefinition): string {
  const lines = [
    "  aidp \\",
    "    --auth security_token \\",
    "    --profile DEFAULT \\",
    "    --region us-phoenix-1 \\",
    "    --ai-data-platform-id <ai_data_platform_ocid> \\",
    `    invoke ${service.name} ${operation.displayName}`
  ];

  for (const field of operationRequiredFields(operation)) {
    if (field === "aiDataPlatformId") {
      continue;
    }
    lines[lines.length - 1] += " \\";
    if (field === operation.bodyField) {
      lines.push("    --body-file request.json");
      continue;
    }
    const cliName = camelToSnake(field);
    lines.push(`    --param ${cliName}=<${cliName}>`);
  }

  return lines.join("\n");
}

async function handleInvoke(
  services: ServiceDefinition[],
  args: string[],
  globals: ReturnType<typeof parseRootArgs>["globals"]
): Promise<number> {
  if (args.length === 0 || args[0] === "-h" || args[0] === "--help") {
    console.log(invokeHelp());
    return 0;
  }

  if (args.length < 2) {
    throw new CliError("invoke requires <service> and <operation>. Run 'aidp invoke --help'.");
  }

  const service = findServiceOrThrow(services, args[0]);
  const operation = findOperationOrThrow(service, args[1]);
  const invokeOptions = parseInvokeOptions(args.slice(2));
  if (invokeOptions.help) {
    console.log(operationHelp(service, operation));
    return 0;
  }

  const request = buildOperationRequest(operation, globals, invokeOptions);
  const authProvider = await buildAuthenticationDetailsProvider(globals);
  const endpoint = resolveEndpoint(globals, authProvider);
  const clientClass = service.clientClass ?? loadSdkClientClass(service.clientClassName);
  const client = new clientClass({ authenticationDetailsProvider: authProvider });
  configureClientEndpoint(client, endpoint);

  const operationMethod = client[operation.methodName];
  if (typeof operationMethod !== "function") {
    throw new CliError(`${service.name} has no operation ${operation.displayName}.`);
  }

  if (globals.debug) {
    printDebugDetails(service, operation, endpoint, request);
  }

  const requestOptions = globals.timeout
    ? { timeout: Math.round(globals.timeout * 1000) }
    : undefined;

  try {
    const response = requestOptions
      ? await operationMethod.call(client, request, requestOptions)
      : await operationMethod.call(client, request);
    printResponse(response, invokeOptions.output);
  } finally {
    closeClient(client);
  }

  return 0;
}

function findServiceOrThrow(services: ServiceDefinition[], name: string): ServiceDefinition {
  const service = findService(services, name);
  if (!service) {
    throw new CliError(`Unknown service '${name}'. Run 'aidp services' to list available services.`);
  }
  return service;
}

function findOperationOrThrow(
  service: ServiceDefinition,
  name: string
): OperationDefinition {
  const operation = findOperation(service, name);
  if (!operation) {
    throw new CliError(
      `${service.name} has no operation '${name}'. Run 'aidp operations ${service.name}'.`
    );
  }
  return operation;
}

function closeClient(client: Record<string, unknown>): void {
  const close = client.close;
  if (typeof close === "function") {
    close.call(client);
  }
}

function printDebugDetails(
  service: ServiceDefinition,
  operation: OperationDefinition,
  endpoint: string,
  request: Record<string, unknown>
): void {
  console.error("AIDP CLI debug request:");
  console.error(`  service: ${service.name}`);
  console.error(`  operation: ${operation.displayName}`);
  console.error(`  method: ${operation.methodName}`);
  console.error(`  endpoint: ${endpoint}`);
  console.error(`  request: ${stringify(redactRequest(request))}`);
}

function redactRequest(request: Record<string, unknown>): Record<string, unknown> {
  const redacted: Record<string, unknown> = {};
  for (const [key, value] of Object.entries(request)) {
    redacted[key] = /token|authorization|password|secret/i.test(key) ? "<redacted>" : value;
  }
  return redacted;
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
