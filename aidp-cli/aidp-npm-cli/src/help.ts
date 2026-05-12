import { AUTH_CHOICES, DEFAULT_AUTH } from "./config";
import { OperationDefinition, ServiceDefinition } from "./discovery";

export function rootHelp(): string {
  return `usage: aidp [global options] <command> [command options]

Call AI Data Platform data plane public APIs.

options:
  -h, --help                            show this help message and exit
  -v, --version                         show version and exit
  --config-file FILE                    OCI config file path.
  --profile PROFILE                     OCI config profile.
  --auth MODE                           OCI authentication mode. Choices: ${AUTH_CHOICES.join(", ")}.
                                        Defaults to ${DEFAULT_AUTH}.
  --region REGION                       OCI region. Defaults to the OCI config region.
  --endpoint URL                        AIDP data plane endpoint override. If scheme is omitted,
                                        https:// is used. Takes precedence over environment options.
  --timeout SECONDS                     Connection/read timeout in seconds.
  --ai-data-platform-id OCID            Default value for operation parameter ai_data_platform_id.
  --debug                               Print request debug details to stderr before invoking the API.

commands:
  <command>
    services                            List available API services.
    operations                          List operations for a service.
    invoke                              Invoke an API operation.

Examples:
  aidp services
  aidp operations workspace
  aidp --auth security_token --profile DEFAULT --region us-phoenix-1 \\
    --ai-data-platform-id <ai_data_platform_ocid> \\
    invoke workspace get_ai_data_platform_workspace \\
    --param workspace_key=<workspace_key>

Use 'aidp <command> --help' for command-specific options.
`;
}

export function operationsHelp(): string {
  return `Usage: aidp operations <service> [operation]

Examples:
  aidp operations workspace
  aidp operations workspace get_ai_data_platform_workspace
  aidp operations workspace get_ai_data_platform_workspace --help
`;
}

export function invokeHelp(): string {
  return `Usage: aidp [global options] invoke <service> <operation> [operation options]

Operation options:
  --param NAME=VALUE                    Operation request field. May be repeated.
  --body JSON                           JSON object for the operation body/details field.
  --body-file FILE                      JSON file for the operation body/details field. Use '-' for stdin.
  --body-field NAME                     Request field to receive --body/--body-file when inference is ambiguous.
  --from-json JSON|file://PATH|-        JSON object containing operation request fields.
  --opc-request-id ID                   Request ID. Generated automatically when omitted.
  --no-request-id                       Do not add opcRequestId automatically.
  --output json|data|headers            Output format. Defaults to json.
  -h, --help                            Show help.

Example:
  aidp --auth security_token --profile DEFAULT --region us-phoenix-1 \\
    --ai-data-platform-id <ai_data_platform_ocid> \\
    invoke workspace get_ai_data_platform_workspace \\
    --param workspace_key=<workspace_key>
`;
}

export function operationHelp(service: ServiceDefinition, operation: OperationDefinition): string {
  const lines = [`Operation: ${service.name}.${operation.displayName}`];
  const description = operationDescription(operation);
  if (description) {
    lines.push(`Description: ${description}`);
  }

  lines.push("", "Parameters:");
  const parameters = operationRequiredFields(operation);
  if (parameters.length === 0) {
    lines.push("  none");
  } else {
    for (const parameter of parameters) {
      lines.push(`  *${lowerCamelToSnake(parameter.name)}`);
    }
  }

  lines.push(
    "",
    "Example:",
    exampleForOperation(service, operation)
  );

  const bodySample = exampleBody(operation);
  if (bodySample !== undefined) {
    lines.push("", "Example body:", JSON.stringify(bodySample, null, 2));
  }

  if (operation.bodyRequiredFields.length > 0) {
    lines.push("", "Required body fields:");
    for (const field of operation.bodyRequiredFields) {
      lines.push(`  ${field}`);
    }
  }

  const bodyAllowedValues = formatAllowedBodyValues(operation.bodyEnumFields);
  if (bodyAllowedValues.length > 0) {
    lines.push("", "Allowed body values:", ...bodyAllowedValues);
  }

  return `${lines.join("\n")}\n`;
}

function exampleForOperation(service: ServiceDefinition, operation: OperationDefinition): string {
  const lines = [
    "  aidp \\",
    "    --auth security_token \\",
    "    --profile DEFAULT \\",
    "    --region us-phoenix-1 \\",
    "    --ai-data-platform-id <ai_data_platform_ocid> \\",
    `    invoke ${service.name} ${operation.displayName}`
  ];

  for (const field of operationRequiredFields(operation)) {
    if (field.name === "aiDataPlatformId") {
      continue;
    }
    lines[lines.length - 1] += " \\";
    if (field.name === operation.bodyField) {
      lines.push("    --body-file request.json");
      continue;
    }
    const cliName = lowerCamelToSnake(field.name);
    lines.push(`    --param ${cliName}=<${cliName}>`);
  }

  return lines.join("\n");
}

function operationDescription(operation: OperationDefinition): string {
  const description = operation.description || operation.summary || "";
  if (!description) {
    return "";
  }
  return /[.!?]$/.test(description) ? description : `${description}.`;
}

function operationRequiredFields(operation: OperationDefinition): Array<{ name: string }> {
  if (operation.fields.length > 0) {
    return operation.fields.filter((field) => field.required);
  }
  return operation.requiredFields.map((field) => ({ name: field }));
}

function exampleBody(operation: OperationDefinition): Record<string, unknown> | undefined {
  if (!operation.bodyField) {
    return undefined;
  }

  const sample: Record<string, unknown> = {};
  for (const field of operation.bodyFields) {
    sample[field.name] = sampleBodyValue(field);
  }
  return sample;
}

function sampleBodyValue(field: { enumValues?: string[]; type?: string }): unknown {
  if (field.enumValues && field.enumValues.length > 0) {
    return field.enumValues[0];
  }

  switch (field.type) {
    case "boolean":
      return false;
    case "integer":
    case "number":
      return 0;
    case "array":
      return [];
    case "object":
      return {};
    case "string":
    default:
      return "<string>";
  }
}

function formatAllowedBodyValues(valuesByField: Record<string, string[]>): string[] {
  return Object.entries(valuesByField)
    .filter((entry) => entry[1].length > 0)
    .sort(([left], [right]) => left.localeCompare(right))
    .map(([field, values]) => `  ${field}: ${values.join(", ")}`);
}

function lowerCamelToSnake(value: string): string {
  return value.replace(/([a-z0-9])([A-Z])/g, "$1_$2").toLowerCase();
}
