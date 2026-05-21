const assert = require("assert");
const fs = require("fs");
const path = require("path");
const { spawnSync } = require("child_process");

const args = require("../dist/args");
const discovery = require("../dist/discovery");
const help = require("../dist/help");
const commandArgs = require("../dist/commandArgs");
const manifestModule = require("../dist/manifest");
const names = require("../dist/names");
const output = require("../dist/output");
const manifestJson = require("../dist/operation_manifest.json");

const packageRoot = path.resolve(__dirname, "..");

const generatorSource = fs.readFileSync(path.join(packageRoot, "scripts", "generate_manifest.js"), "utf8");
assert.ok(!generatorSource.includes("api.public"));
assert.ok(!generatorSource.includes('require("yaml")'));

assert.strictEqual(names.serviceNameFromClientClass("WorkspaceObjectClient"), "workspace-object");
assert.strictEqual(names.serviceNameFromClientClass("MlOpsClient"), "mlops");
assert.strictEqual(names.camelToKebab("getWorkspace"), "get-workspace");
assert.strictEqual(names.cliNameToLowerCamel("workspace-key"), "workspaceKey");

assert.strictEqual(manifestJson.version, 4);
assert.ok(Array.isArray(manifestJson.commandGroups));
assert.ok(!("services" in manifestJson));

const manifest = manifestModule.loadCommandManifest();
const workspace = discovery.findCommandGroup(manifest, "workspace");
assert.ok(workspace);
const getWorkspace = discovery.findCommand(workspace, "get-workspace");
assert.ok(getWorkspace);
assert.strictEqual(getWorkspace.sdkMethodName, "getWorkspace");
assert.ok(discovery.findCommandGroup(manifest, "mlops"));
assert.ok(manifest.commandGroups.some((group) => group.name === "mlops"));
assert.ok(!manifest.commandGroups.some((group) => group.name === "ml-ops"));
assert.ok(discovery.findCommandGroup(manifest, "bundle"));
assert.ok(discovery.findCommandGroup(manifest, "cluster"));
assert.ok(discovery.findCommandGroup(manifest, "git"));
assert.ok(discovery.findCommandGroup(manifest, "workspace-object"));

const originalEnv = {
  OCI_CLI_AUTH: process.env.OCI_CLI_AUTH,
  OCI_CLI_CONFIG_FILE: process.env.OCI_CLI_CONFIG_FILE,
  OCI_CLI_PROFILE: process.env.OCI_CLI_PROFILE,
  INSTANCE_ID: process.env.INSTANCE_ID,
  AIDP_CLI_CONFIG_FILE: process.env.AIDP_CLI_CONFIG_FILE
};
try {
  delete process.env.OCI_CLI_AUTH;
  delete process.env.OCI_CLI_CONFIG_FILE;
  delete process.env.OCI_CLI_PROFILE;
  delete process.env.INSTANCE_ID;
  process.env.AIDP_CLI_CONFIG_FILE = path.join(packageRoot, "dist", "test-aidp-config.json");
  try {
    fs.unlinkSync(process.env.AIDP_CLI_CONFIG_FILE);
  } catch {
    // ignore
  }

  const parsed = args.parseGlobalOptions(["-p", "DEFAULT", "workspace", "get-workspace"]);
  assert.strictEqual(parsed.globals.auth, "security_token");
  assert.strictEqual(parsed.globals.profile, "DEFAULT");
  assert.deepStrictEqual(parsed.args, ["workspace", "get-workspace"]);

  process.env.INSTANCE_ID = "ocid1.test";
  const parsedWithInstance = args.parseGlobalOptions(["workspace", "get-workspace"]);
  const getInvocation = commandArgs.parseCommandOptions(workspace, getWorkspace, ["wk1"], parsedWithInstance.globals);
  assert.strictEqual(getInvocation.request.aiDataPlatformId, "ocid1.test");
  assert.strictEqual(getInvocation.request.workspaceKey, "wk1");
  assert.ok(String(getInvocation.request.opcRequestId).startsWith("aidp-cli-"));

  const createWorkspace = discovery.findCommand(workspace, "create-workspace");
  assert.ok(createWorkspace);
  const createInvocation = commandArgs.parseCommandOptions(
    workspace,
    createWorkspace,
    ["--body", "{\"displayName\":\"demo\"}"],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(createInvocation.request.createWorkspaceDetails, { displayName: "demo" });
} finally {
  restoreEnv("OCI_CLI_AUTH", originalEnv.OCI_CLI_AUTH);
  restoreEnv("OCI_CLI_CONFIG_FILE", originalEnv.OCI_CLI_CONFIG_FILE);
  restoreEnv("OCI_CLI_PROFILE", originalEnv.OCI_CLI_PROFILE);
  restoreEnv("INSTANCE_ID", originalEnv.INSTANCE_ID);
  restoreEnv("AIDP_CLI_CONFIG_FILE", originalEnv.AIDP_CLI_CONFIG_FILE);
}

const rootOutput = runCli([]);
assert.strictEqual(rootOutput.status, 0, rootOutput.stderr);
assert.ok(rootOutput.stdout.includes("AIDP CLI"));
assert.ok(rootOutput.stdout.includes("API Command Groups:"));
assert.ok(rootOutput.stdout.includes("command-groups  List API command groups."));
assert.ok(rootOutput.stdout.includes("--auth"));
assert.ok(rootOutput.stdout.includes("default: security_token"));
assert.ok(!hasHelpRow(rootOutput.stdout, "services"));
assert.ok(!hasHelpRow(rootOutput.stdout, "operations"));
assert.ok(!hasHelpRow(rootOutput.stdout, "invoke"));

const versionOutput = runCli(["-v"]);
assert.strictEqual(versionOutput.status, 0, versionOutput.stderr);
assert.strictEqual(versionOutput.stdout.trim(), `aidp npm cli version-${require("../package.json").version}`);

const groupsOutput = runCli(["command-groups"]);
assert.strictEqual(groupsOutput.status, 0, groupsOutput.stderr);
assert.ok(groupsOutput.stdout.includes("Command Groups:"));
assert.ok(groupsOutput.stdout.includes("workspace"));
assert.ok(groupsOutput.stdout.includes("Example:"));
assert.ok(!groupsOutput.stdout.includes("command-group:"));

const workspaceHelp = runCli(["workspace", "-h"]);
assert.strictEqual(workspaceHelp.status, 0, workspaceHelp.stderr);
assert.ok(workspaceHelp.stdout.includes("Usage:\n  aidp workspace [flags]"));
assert.ok(workspaceHelp.stdout.includes("Available Commands:"));
assert.ok(workspaceHelp.stdout.includes("Global Flags:"));

const commandHelp = runCli(["workspace", "get-workspace", "-h"]);
assert.strictEqual(commandHelp.status, 0, commandHelp.stderr);
assert.ok(commandHelp.stdout.includes("Usage:\n  aidp workspace get"));
assert.ok(commandHelp.stdout.includes("Arguments:"));
assert.ok(commandHelp.stdout.includes("WORKSPACE_KEY"));
assert.ok(commandHelp.stdout.includes("--instance-id"));
assert.ok(!commandHelp.stdout.includes("ai_data_platform"));

const createClusterHelp = runCli(["cluster", "create", "-h"]);
assert.strictEqual(createClusterHelp.status, 0, createClusterHelp.stderr);
assert.ok(createClusterHelp.stdout.includes('"displayName": "<string>"'));
assert.ok(createClusterHelp.stdout.includes('"driverConfig"'));
assert.ok(createClusterHelp.stdout.includes("Required JSON fields:\n  displayName\n  driverConfig\n  type"));
assert.ok(createClusterHelp.stdout.includes("Allowed JSON values:"));
assert.ok(createClusterHelp.stdout.includes("type:"));
assert.ok(createClusterHelp.stdout.includes("USER"));
assert.ok(createClusterHelp.stdout.includes("AGENT_FLOW_COMPUTE"));
assert.ok(createClusterHelp.stdout.includes("Body variants:"));
assert.ok(createClusterHelp.stdout.includes("Example JSON - CreateAgentFlowComputeDetails (type=AGENT_FLOW_COMPUTE):"));
assert.ok(createClusterHelp.stdout.includes("Example JSON - CreateSparkClusterDetails (type=USER):"));
assert.ok(createClusterHelp.stdout.includes('"workerConfig"'));

const patchLibraryHelp = runCli(["cluster", "patch-library", "-h"]);
assert.strictEqual(patchLibraryHelp.status, 0, patchLibraryHelp.stderr);
assert.ok(patchLibraryHelp.stdout.includes("Nested body variants:"));
assert.ok(patchLibraryHelp.stdout.includes("Example JSON for items[] - UninstallClusterLibraryDetails (operation=UNINSTALL):"));
assert.ok(patchLibraryHelp.stdout.includes("Example JSON for items[] - InstallClusterLibraryDetails (operation=INSTALL):"));
assert.ok(patchLibraryHelp.stdout.includes('"name": "<string>"'));
assert.ok(patchLibraryHelp.stdout.includes('"path": "<string>"'));

const createJobHelp = runCli(["workflow", "create-job", "-h"]);
assert.strictEqual(createJobHelp.status, 0, createJobHelp.stderr);
assert.ok(createJobHelp.stdout.includes("Nested body variants:"));
assert.ok(createJobHelp.stdout.includes("Example JSON for tasks[] - IfElseTask (type=IF_ELSE_TASK):"));
assert.ok(createJobHelp.stdout.includes("Example JSON for tasks[] - NotebookTask (type=NOTEBOOK_TASK):"));

const gitDiffHelp = runCli(["git", "list-git-diffs", "-h"]);
assert.strictEqual(gitDiffHelp.status, 0, gitDiffHelp.stderr);
assert.ok(gitDiffHelp.stdout.includes("List Pagination"));
assert.ok(!gitDiffHelp.stdout.includes("/iaas/Content/API/Concepts/usingapi.htm#nine"));
assert.ok(gitDiffHelp.stdout.includes("--body") === false);

const searchCompact = runCli(["search", "getworkspace"]);
assert.strictEqual(searchCompact.status, 0, searchCompact.stderr);
assert.ok(searchCompact.stdout.includes("workspace get"));
assert.ok(!searchCompact.stdout.includes("Showing 30"));

const searchSpaced = runCli(["search", "list", "workspaces"]);
assert.strictEqual(searchSpaced.status, 0, searchSpaced.stderr);
assert.ok(searchSpaced.stdout.includes("workspace list"));

const missing = runCli(["workspace", "create-git-folder"]);
assert.strictEqual(missing.status, 2);
assert.ok(missing.stderr.includes("Missing required argument WORKSPACE_KEY."));
assert.ok(missing.stderr.includes('Use "aidp workspace create-git-folder -h"'));

const oldCommand = runCli(["services"]);
assert.notStrictEqual(oldCommand.status, 0);
assert.ok(oldCommand.stderr.includes("Unknown command group"));

const printed = captureStdout(() =>
  output.printResponse({ workspace: { key: "wk1" }, opcRequestId: "request-1" })
);
assert.ok(printed.includes("Response:"));
assert.ok(printed.includes('"data"'));
assert.ok(printed.includes('"headers"'));
assert.ok(printed.includes('"status"'));

const printedError = captureStderr(() =>
  output.printErrorResponse({
    status: 409,
    code: "Conflict",
    message: "already exists",
    "opc-request-id": "request-1"
  })
);
assert.ok(printedError.includes("Response:"));
assert.ok(printedError.includes('"status": 409'));
assert.ok(printedError.includes('"code": "Conflict"'));
assert.ok(printedError.includes('"opc-request-id": "request-1"'));

const configureHelp = help.configureHelp();
assert.ok(configureHelp.includes("aidp configure set instance-id <ocid>"));

console.log("aidp npm cli tests passed");

function runCli(cliArgs) {
  return spawnSync(process.execPath, ["dist/bin/aidp.js", ...cliArgs], {
    cwd: packageRoot,
    encoding: "utf8"
  });
}

function hasHelpRow(text, commandName) {
  return new RegExp(`^\\s{2}${commandName}\\s{2,}`, "m").test(text);
}

function captureStdout(callback) {
  const originalLog = console.log;
  const lines = [];
  console.log = (value = "") => {
    lines.push(String(value));
  };
  try {
    callback();
  } finally {
    console.log = originalLog;
  }
  return lines.join("\n");
}

function captureStderr(callback) {
  const originalError = console.error;
  const lines = [];
  console.error = (value = "") => {
    lines.push(String(value));
  };
  try {
    callback();
  } finally {
    console.error = originalError;
  }
  return lines.join("\n");
}

function restoreEnv(name, value) {
  if (value === undefined) {
    delete process.env[name];
    return;
  }
  process.env[name] = value;
}
