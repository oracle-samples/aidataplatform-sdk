const assert = require("assert");
const path = require("path");
const { spawnSync } = require("child_process");

const args = require("../dist/args");
const discovery = require("../dist/discovery");
const help = require("../dist/help");
const invokeArgs = require("../dist/invokeArgs");
const manifest = require("../dist/operation_manifest.json");
const names = require("../dist/names");

assert.strictEqual(names.serviceNameFromClientClass("WorkspaceObjectClient"), "workspace-object");
assert.strictEqual(names.camelToSnake("getAiDataPlatformWorkspace"), "get_ai_data_platform_workspace");
assert.strictEqual(names.cliNameToLowerCamel("ai-data-platform-id"), "aiDataPlatformId");
assert.strictEqual(names.cliNameToLowerCamel("workspace_key"), "workspaceKey");

const parsed = args.parseRootArgs([
  "--auth",
  "security_token",
  "--region=us-phoenix-1",
  "--ai-data-platform-id",
  "ocid1.test",
  "invoke",
  "workspace",
  "get_ai_data_platform_workspace"
]);

assert.strictEqual(parsed.command, "invoke");
assert.strictEqual(parsed.globals.auth, "security_token");
assert.strictEqual(parsed.globals.region, "us-phoenix-1");
assert.strictEqual(parsed.globals.aiDataPlatformId, "ocid1.test");
assert.deepStrictEqual(parsed.args, ["workspace", "get_ai_data_platform_workspace"]);

const rootHelp = help.rootHelp();
assert.ok(rootHelp.includes("-v, --version"));
assert.ok(rootHelp.includes("--config-file FILE"));
assert.ok(rootHelp.includes("OCI config file path."));
assert.ok(rootHelp.includes("OCI authentication mode. Choices: api_key"));
assert.ok(rootHelp.includes("Use 'aidp <command> --help' for command-specific options."));
assert.ok(!rootHelp.includes("API key auth config:"));

const parsedVersion = args.parseRootArgs(["--version"]);
assert.strictEqual(parsedVersion.command, "version");

const originalEnv = {
  OCI_CLI_CONFIG_FILE: process.env.OCI_CLI_CONFIG_FILE,
  OCI_CLI_PROFILE: process.env.OCI_CLI_PROFILE,
  OCI_CONFIG_FILE: process.env.OCI_CONFIG_FILE,
  OCI_PROFILE: process.env.OCI_PROFILE
};
try {
  delete process.env.OCI_CLI_CONFIG_FILE;
  delete process.env.OCI_CLI_PROFILE;
  process.env.OCI_CONFIG_FILE = "/ignored/oci-config";
  process.env.OCI_PROFILE = "IGNORED";

  const defaultOptions = args.parseRootArgs(["services"]).globals;
  assert.strictEqual(defaultOptions.configFile, "~/.oci/config");
  assert.strictEqual(defaultOptions.profile, "DEFAULT");

  process.env.OCI_CLI_CONFIG_FILE = "/tmp/oci-cli-config";
  process.env.OCI_CLI_PROFILE = "DEV";

  const cliEnvOptions = args.parseRootArgs(["services"]).globals;
  assert.strictEqual(cliEnvOptions.configFile, "/tmp/oci-cli-config");
  assert.strictEqual(cliEnvOptions.profile, "DEV");
} finally {
  restoreEnv("OCI_CLI_CONFIG_FILE", originalEnv.OCI_CLI_CONFIG_FILE);
  restoreEnv("OCI_CLI_PROFILE", originalEnv.OCI_CLI_PROFILE);
  restoreEnv("OCI_CONFIG_FILE", originalEnv.OCI_CONFIG_FILE);
  restoreEnv("OCI_PROFILE", originalEnv.OCI_PROFILE);
}

class WorkspaceClient {
  getAiDataPlatformWorkspace(request) {
    return `${request.aiDataPlatformId}:${request.workspaceKey}`;
  }

  createAiDataPlatformWorkspace(request) {
    return request.createWorkspaceDetails;
  }
}

const services = discovery.discoverServices({ WorkspaceClient });
assert.strictEqual(services.length, 1);
assert.strictEqual(services[0].name, "workspace");

const getOperation = discovery.findOperation(services[0], "get_ai_data_platform_workspace");
assert.ok(getOperation);
assert.deepStrictEqual(getOperation.requestFields, ["aiDataPlatformId", "workspaceKey"]);

const getRequest = invokeArgs.buildOperationRequest(
  getOperation,
  parsed.globals,
  {
    body: undefined,
    bodyField: undefined,
    bodyFile: undefined,
    fromJson: undefined,
    help: false,
    noRequestId: false,
    opcRequestId: undefined,
    output: "json",
    params: ["workspace_key=my_workspace"]
  }
);
assert.strictEqual(getRequest.aiDataPlatformId, "ocid1.test");
assert.strictEqual(getRequest.workspaceKey, "my_workspace");

const createOperation = discovery.findOperation(services[0], "create_ai_data_platform_workspace");
assert.ok(createOperation);
const createRequest = invokeArgs.buildOperationRequest(
  createOperation,
  parsed.globals,
  {
    body: "{\"displayName\":\"demo\"}",
    bodyField: undefined,
    bodyFile: undefined,
    fromJson: undefined,
    help: false,
    noRequestId: true,
    opcRequestId: undefined,
    output: "json",
    params: []
  }
);
assert.deepStrictEqual(createRequest.createWorkspaceDetails, { displayName: "demo" });

const manifestWorkspace = manifest.services.find((service) => service.name === "workspace");
assert.ok(manifestWorkspace);
const manifestCreateWorkspace = manifestWorkspace.operations.find(
  (operation) => operation.displayName === "create_ai_data_platform_workspace"
);
assert.ok(manifestCreateWorkspace);
assert.strictEqual(manifestCreateWorkspace.bodyField, "createWorkspaceDetails");
assert.deepStrictEqual(manifestCreateWorkspace.bodyRequiredFields, ["displayName"]);
assert.ok(manifestCreateWorkspace.bodyFields.some((field) => field.name === "displayName"));

const servicesOutput = spawnSync(process.execPath, ["dist/bin/aidp.js", "services"], {
  cwd: path.resolve(__dirname, ".."),
  encoding: "utf8"
});
assert.strictEqual(servicesOutput.status, 0, servicesOutput.stderr);
assert.ok(servicesOutput.stdout.includes("service: bundle - Create, deploy, inspect deployment status, and purge AIDP bundles."));
assert.ok(servicesOutput.stdout.includes("service: workspace - Create, list, inspect, update, delete workspaces and manage workspace permissions."));
assert.ok(!servicesOutput.stdout.includes("Client:"));

const operationsOutput = spawnSync(process.execPath, ["dist/bin/aidp.js", "operations", "workspace"], {
  cwd: path.resolve(__dirname, ".."),
  encoding: "utf8"
});
assert.strictEqual(operationsOutput.status, 0, operationsOutput.stderr);
assert.ok(operationsOutput.stdout.includes("operation: get_ai_data_platform_workspace - Gets detailed information about an AI Data Platform Workbench workspace."));
assert.ok(operationsOutput.stdout.includes("   Params: *ai_data_platform_id, *workspace_key"));
assert.ok(operationsOutput.stdout.includes("Hint: Invoke an operation with required parameters:"));
assert.ok(operationsOutput.stdout.includes("  aidp operations workspace list_ai_data_platform_create_workspace_permissions --help"));
assert.ok(!operationsOutput.stdout.includes("   Method:"));
assert.ok(!operationsOutput.stdout.includes("   Request fields:"));
assert.ok(!operationsOutput.stdout.includes("   Required:"));

const operationHelpOutput = spawnSync(
  process.execPath,
  ["dist/bin/aidp.js", "operations", "git-service", "rebase_ai_data_platform_git_repository", "--help"],
  {
    cwd: path.resolve(__dirname, ".."),
    encoding: "utf8"
  }
);
assert.strictEqual(operationHelpOutput.status, 0, operationHelpOutput.stderr);
assert.ok(operationHelpOutput.stdout.includes("Operation: git-service.rebase_ai_data_platform_git_repository"));
assert.ok(operationHelpOutput.stdout.includes("Description: (Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift."));
assert.ok(operationHelpOutput.stdout.includes("Parameters:\n  *ai_data_platform_id\n  *workspace_key\n  *git_repository_key\n  *git_rebase_details"));
assert.ok(operationHelpOutput.stdout.includes("    --ai-data-platform-id <ai_data_platform_ocid> \\"));
assert.ok(operationHelpOutput.stdout.includes("    invoke git-service rebase_ai_data_platform_git_repository \\"));
assert.ok(operationHelpOutput.stdout.includes("    --param workspace_key=<workspace_key> \\"));
assert.ok(operationHelpOutput.stdout.includes("    --param git_repository_key=<git_repository_key> \\"));
assert.ok(operationHelpOutput.stdout.includes("    --body-file request.json"));
assert.ok(operationHelpOutput.stdout.includes("Example body:\n{"));
assert.ok(operationHelpOutput.stdout.includes('  "gitFolderPath": "<string>",'));
assert.ok(operationHelpOutput.stdout.includes('  "branchName": "<string>",'));
assert.ok(operationHelpOutput.stdout.includes('  "remoteBranchName": "<string>",'));
assert.ok(operationHelpOutput.stdout.includes('  "commitId": "<string>"'));
assert.ok(operationHelpOutput.stdout.includes("Required body fields:\n  remoteBranchName"));
assert.ok(!operationHelpOutput.stdout.includes("TypeScript method:"));
assert.ok(!operationHelpOutput.stdout.includes("Summary:"));
assert.ok(!operationHelpOutput.stdout.includes("Request fields:"));
assert.ok(!operationHelpOutput.stdout.includes("Allowed request values:"));

const versionOutput = spawnSync(process.execPath, ["dist/bin/aidp.js", "--version"], {
  cwd: path.resolve(__dirname, ".."),
  encoding: "utf8"
});
assert.strictEqual(versionOutput.status, 0, versionOutput.stderr);
assert.match(versionOutput.stdout.trim(), /^aidp \d+\.\d+\.\d+/);

console.log("aidp npm cli tests passed");

function restoreEnv(name, value) {
  if (value === undefined) {
    delete process.env[name];
    return;
  }
  process.env[name] = value;
}
