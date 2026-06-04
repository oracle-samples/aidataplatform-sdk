const assert = require("assert");
const fs = require("fs");
const os = require("os");
const path = require("path");
const { spawnSync } = require("child_process");

const args = require("../dist/args");
const discovery = require("../dist/discovery");
const help = require("../dist/help");
const bodySecurity = require("../dist/bodySecurity");
const cli = require("../dist/cli");
const commandArgs = require("../dist/commandArgs");
const config = require("../dist/config");
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
assert.ok(!discovery.findCommandGroup(manifest, "git"));
assert.ok(!manifest.commandGroups.some((group) => group.name === "git"));
const workspaceObject = discovery.findCommandGroup(manifest, "workspace-object");
assert.ok(workspaceObject);
const createWorkspaceObject = discovery.findCommand(workspaceObject, "create");
assert.ok(createWorkspaceObject);
assert.strictEqual(commandArgs.commandUsesRawBody(createWorkspaceObject), true);

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

  const createWorkspaceObjectInvocation = commandArgs.parseCommandOptions(
    workspaceObject,
    createWorkspaceObject,
    ["workspace-key", "--path", "folder_123", "--type", "FOLDER", "--body", ""],
    parsedWithInstance.globals
  );
  assert.strictEqual(createWorkspaceObjectInvocation.request.createWorkspaceObjectDetails, "");
  assert.strictEqual(createWorkspaceObjectInvocation.request.workspaceKey, "workspace-key");
  assert.strictEqual(createWorkspaceObjectInvocation.request.path, "folder_123");

  const createWorkspace = discovery.findCommand(workspace, "create-workspace");
  assert.ok(createWorkspace);
  const createInvocation = commandArgs.parseCommandOptions(
    workspace,
    createWorkspace,
    ["--body", "{\"displayName\":\"demo\"}"],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(createInvocation.request.createWorkspaceDetails, { displayName: "demo" });

  const sensitiveCommand = testBodyCommand({
    bodyModel: "CreateCredentialDetails",
    bodyModels: {
      CreateCredentialDetails: testBodyModel([
        testBodyField("name"),
        testBodyField("credentialDetails", "VaultReferenceCredentialDetails")
      ]),
      VaultReferenceCredentialDetails: testBodyModel([testBodyField("secretId")])
    }
  });
  assert.strictEqual(commandArgs.commandUsesRawBody(sensitiveCommand), false);
  assert.strictEqual(bodySecurity.commandHasSensitiveBodyFields(sensitiveCommand), true);
  assert.doesNotThrow(() =>
    commandArgs.parseCommandOptions(
      testGroup(sensitiveCommand),
      sensitiveCommand,
      ["--body", "{\"name\":\"demo\"}"],
      parsedWithInstance.globals
    )
  );
  assertSensitiveInlineBodyRejected(sensitiveCommand, "{\"credentialDetails\":{\"secretId\":\"super-secret\"}}");

  const gitCredentialCommand = testBodyCommand({
    bodyModel: "CreateJobDetails",
    bodyModels: {
      CreateJobDetails: testBodyModel([testBodyField("gitConfig", "GitConfig")]),
      GitConfig: testBodyModel([testBodyField("credential")])
    }
  });
  assertSensitiveInlineBodyRejected(gitCredentialCommand, "{\"gitConfig\":{\"credential\":\"git-secret\"}}");

  const userSettingCommand = testBodyCommand({
    bodyModel: "CreateUserSettingDetails",
    bodyModels: {
      CreateUserSettingDetails: testBodyModel([testBodyField("data", "GitAccountUserSetting")]),
      GitAccountUserSetting: testBodyModel([testBodyField("personalAccessToken")])
    }
  });
  assertSensitiveInlineBodyRejected(
    userSettingCommand,
    "{\"name\":\"demo\",\"data\":{\"type\":\"GIT_ACCOUNT\",\"personalAccessToken\":\"gh_token_secret_value\"}}",
    ["gh_token_secret_value"]
  );
  assertSensitiveInlineBodyRejected(
    userSettingCommand,
    "{\"name\":\"demo\",\"data\":{\"type\":\"IAM_USER_CREDENTIAL\",\"privateApiKey\":\"private-api-key-value\"}}",
    ["private-api-key-value"]
  );

  const bodyTempDir = fs.mkdtempSync(path.join(packageRoot, "test", "body-"));
  try {
    const bodyFile = path.join(bodyTempDir, "request.json");
    fs.writeFileSync(bodyFile, "{\"credentialDetails\":{\"secretId\":\"file-secret\"}}", "utf8");
    const fileInvocation = commandArgs.parseCommandOptions(
      testGroup(sensitiveCommand),
      sensitiveCommand,
      ["--body", `@${bodyFile}`],
      parsedWithInstance.globals
    );
    assert.deepStrictEqual(fileInvocation.request.testBody, {
      credentialDetails: { secretId: "file-secret" }
    });

    const fileUrlInvocation = commandArgs.parseCommandOptions(
      testGroup(sensitiveCommand),
      sensitiveCommand,
      ["--body", `file://${bodyFile}`],
      parsedWithInstance.globals
    );
    assert.deepStrictEqual(fileUrlInvocation.request.testBody, {
      credentialDetails: { secretId: "file-secret" }
    });

    const rawCommand = testBodyCommand();
    const rawInlineInvocation = commandArgs.parseCommandOptions(
      testGroup(rawCommand),
      rawCommand,
      ["--body", "{}"],
      parsedWithInstance.globals
    );
    assert.strictEqual(rawInlineInvocation.request.testBody, "{}");

    const rawBodyFile = path.join(bodyTempDir, "raw-body.txt");
    fs.writeFileSync(rawBodyFile, "raw-content", "utf8");
    const rawFileInvocation = commandArgs.parseCommandOptions(
      testGroup(rawCommand),
      rawCommand,
      ["--body", `@${rawBodyFile}`],
      parsedWithInstance.globals
    );
    assert.strictEqual(rawFileInvocation.request.testBody, "raw-content");

    const rawFileUrlInvocation = commandArgs.parseCommandOptions(
      testGroup(rawCommand),
      rawCommand,
      ["--body", `file://${rawBodyFile}`],
      parsedWithInstance.globals
    );
    assert.strictEqual(rawFileUrlInvocation.request.testBody, "raw-content");
  } finally {
    fs.rmSync(bodyTempDir, { recursive: true, force: true });
  }

  const stdinInvocation = runStdinBodyParser("{\"credentialDetails\":{\"secretId\":\"stdin-secret\"}}");
  assert.strictEqual(stdinInvocation.status, 0, stdinInvocation.stderr);
  assert.ok(stdinInvocation.stdout.includes("stdin body parser test passed"));

  const rawStdinInvocation = runRawStdinBodyParser("raw-stdin-content");
  assert.strictEqual(rawStdinInvocation.status, 0, rawStdinInvocation.stderr);
  assert.ok(rawStdinInvocation.stdout.includes("raw stdin body parser test passed"));

  const objectBodySummary = cli.bodyDebugSummary({
    credentialDetails: { secretId: "ocid1.secret.oc1..value" }
  });
  const stringBodySummary = cli.bodyDebugSummary("{\"gitConfig\":{\"credential\":\"git-token-value\"}}");
  assert.strictEqual(objectBodySummary, "json object");
  assert.strictEqual(stringBodySummary, "json object");
  for (const summary of [objectBodySummary, stringBodySummary]) {
    assert.ok(!summary.includes("credentialDetails"));
    assert.ok(!summary.includes("secretId"));
    assert.ok(!summary.includes("credential"));
    assert.ok(!summary.includes("git-token-value"));
  }

  assert.deepStrictEqual(cli.safeHeaders({
    Authorization: "Signature raw-auth",
    "security-token": "raw-token",
    "x-content-sha256": "raw-content-sha",
    "opc-request-id": "request-id"
  }), {
    Authorization: "<redacted>",
    "security-token": "<redacted>",
    "x-content-sha256": "<redacted>",
    "opc-request-id": "request-id"
  });

  const formattedSdkError = cli.formatCliError({
    code: "ENOTFOUND",
    message: "getaddrinfo ENOTFOUND aidpdev1.us-ashburn-1.oci.oc-test.com1",
    requestEndpoint: "GET https://aidpdev1.us-ashburn-1.oci.oc-test.com1/20260430/workspaces/WORKSPACE_KEY",
    troubleshootingPage: "See https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdk_troubleshooting.htm"
  });
  assert.ok(!formattedSdkError.includes("[object Object]"));
  assert.ok(formattedSdkError.includes("request failed (ENOTFOUND): getaddrinfo ENOTFOUND"));
  assert.ok(formattedSdkError.includes("Request Endpoint: GET https://aidpdev1.us-ashburn-1.oci.oc-test.com1"));
  assert.strictEqual(
    cli.shouldSuppressSdkRetryWarning(
      "Request failed with Exception : [object Object]\nRetrying request -> Total Attempts : 1, Retrying after 1.417 seconds..."
    ),
    true
  );
  assert.strictEqual(
    cli.shouldSuppressSdkRetryWarning("Request cannot be retried. Not Retrying. Exception occurred : [object Object]"),
    true
  );
  assert.strictEqual(
    cli.shouldSuppressSdkRetryWarning("All retry attempts have exhausted. Total Attempts : 8. Last exception occurred : [object Object]"),
    true
  );
  assert.strictEqual(cli.shouldSuppressSdkRetryWarning("unrelated warning"), false);

  assert.throws(
    () =>
      commandArgs.parseCommandOptions(
        testGroup(sensitiveCommand),
        sensitiveCommand,
        ["--body", "{not-json"],
        parsedWithInstance.globals
      ),
    /--body is not valid JSON/
  );
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

const createWorkspaceObjectHelp = runCli(["workspace-object", "create", "-h"]);
assert.strictEqual(createWorkspaceObjectHelp.status, 0, createWorkspaceObjectHelp.stderr);
assert.ok(createWorkspaceObjectHelp.stdout.includes("raw body string, @path/to/file, file:///path/file, or - for stdin"));
assert.ok(createWorkspaceObjectHelp.stdout.includes("--body @body.txt"));

const gitCommand = runCli(["git", "list-diffs", "-h"]);
assert.notStrictEqual(gitCommand.status, 0);
assert.ok(gitCommand.stderr.includes("Unknown command group"));

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

assertPackMetadataPreparation();
assertAidpConfigPermissions();

console.log("aidp npm cli tests passed");

function runCli(cliArgs) {
  return spawnSync(process.execPath, ["dist/bin/aidp.js", ...cliArgs], {
    cwd: packageRoot,
    encoding: "utf8"
  });
}

function assertPackMetadataPreparation() {
  const packageJsonPath = path.join(packageRoot, "package.json");
  const shrinkwrapPath = path.join(packageRoot, "npm-shrinkwrap.json");
  const packageBackupPath = path.join(packageRoot, ".package.json.prepack-backup");
  const shrinkwrapBackupPath = path.join(packageRoot, ".npm-shrinkwrap.json.prepack-backup");
  const sdkPackageJsonPath = path.join(packageRoot, "..", "..", "aidp-typescript-client", "package.json");
  const sdkVersion = JSON.parse(fs.readFileSync(sdkPackageJsonPath, "utf8")).version;

  const cleanupBackups = () => {
    if (fs.existsSync(packageBackupPath) || fs.existsSync(shrinkwrapBackupPath)) {
      spawnSync(process.execPath, ["scripts/restore_pack_metadata.js"], {
        cwd: packageRoot,
        encoding: "utf8"
      });
    }
  };

  cleanupBackups();
  try {
    const prepareResult = spawnSync(process.execPath, ["scripts/prepare_pack_metadata.js"], {
      cwd: packageRoot,
      encoding: "utf8"
    });
    assert.strictEqual(prepareResult.status, 0, prepareResult.stderr || prepareResult.stdout);

    const preparedPackage = JSON.parse(fs.readFileSync(packageJsonPath, "utf8"));
    assert.strictEqual(preparedPackage.dependencies["aidp-typescript-client"], sdkVersion);
    assert.ok(!("bundledDependencies" in preparedPackage));
    assert.ok(!("bundleDependencies" in preparedPackage));
    assert.ok(fs.existsSync(packageBackupPath));
    assert.ok(!fs.existsSync(shrinkwrapPath));
    assert.ok(fs.existsSync(shrinkwrapBackupPath));
  } finally {
    cleanupBackups();
  }

  assert.ok(fs.existsSync(packageJsonPath));
  assert.ok(fs.existsSync(shrinkwrapPath));
  assert.ok(!fs.existsSync(packageBackupPath));
  assert.ok(!fs.existsSync(shrinkwrapBackupPath));
}

function assertAidpConfigPermissions() {
  if (process.platform === "win32") {
    return;
  }

  const originalHome = process.env.HOME;
  const originalAidpConfigFile = process.env.AIDP_CLI_CONFIG_FILE;
  const originalUmask = process.umask(0);
  const home = fs.mkdtempSync(path.join(os.tmpdir(), "aidp-cli-config-home-"));
  try {
    process.env.HOME = home;
    delete process.env.AIDP_CLI_CONFIG_FILE;

    config.writeAidpConfig({ "instance-id": "ocid1.test" });

    const configDir = path.join(home, ".aidp");
    const configFile = path.join(configDir, "config");
    assert.strictEqual(fileMode(configDir), 0o700);
    assert.strictEqual(fileMode(configFile), 0o600);
    assert.strictEqual(config.readAidpConfig()["instance-id"], "ocid1.test");
    assert.deepStrictEqual(fs.readdirSync(configDir).filter((name) => name.endsWith(".tmp")), []);

    fs.chmodSync(configFile, 0o644);
    assert.throws(() => config.readAidpConfig(), /chmod 600/);

    fs.chmodSync(configFile, 0o600);
    fs.chmodSync(configDir, 0o755);
    assert.throws(() => config.readAidpConfig(), /chmod 700/);
  } finally {
    process.umask(originalUmask);
    restoreEnv("HOME", originalHome);
    restoreEnv("AIDP_CLI_CONFIG_FILE", originalAidpConfigFile);
    fs.rmSync(home, { recursive: true, force: true });
  }
}

function fileMode(filePath) {
  return fs.statSync(filePath).mode & 0o777;
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

function runStdinBodyParser(stdin) {
  return spawnSync(
    process.execPath,
    [
      "-e",
      `
      const assert = require("assert");
      const commandArgs = require("./dist/commandArgs");
      const command = {
        aliases: [],
        bodyEnumFields: {},
        bodyField: "testBody",
        bodyFields: [],
        bodyModel: "CreateCredentialDetails",
        bodyModels: {
          CreateCredentialDetails: testBodyModel([
            testBodyField("credentialDetails", "VaultReferenceCredentialDetails")
          ]),
          VaultReferenceCredentialDetails: testBodyModel([testBodyField("secretId")])
        },
        bodyRequiredFields: [],
        deprecated: false,
        description: "",
        fields: [
          {
            cliName: "body",
            description: "",
            enumValues: [],
            in: "body",
            modelName: "",
            name: "testBody",
            originalName: "testBody",
            required: true,
            type: "object"
          }
        ],
        httpMethod: "POST",
        name: "create-test",
        operationId: "CreateTest",
        path: "/test",
        responseBodyKey: "",
        responseHeaderFields: [],
        sdkMethodName: "createTest",
        section: "",
        summary: ""
      };
      const group = {
        name: "test",
        tag: "test",
        clientClassName: "TestClient",
        description: "",
        commands: [command]
      };
      const invocation = commandArgs.parseCommandOptions(
        group,
        command,
        ["--body", "-"],
        { auth: "security_token", profile: "DEFAULT", instanceId: "ocid1.test" }
      );
      assert.deepStrictEqual(invocation.request.testBody, {
        credentialDetails: { secretId: "stdin-secret" }
      });
      console.log("stdin body parser test passed");

      function testBodyModel(fields) {
        return {
          enumFields: {},
          fields,
          requiredFields: [],
          variants: []
        };
      }

      function testBodyField(name, modelName = "") {
        return {
          enumValues: [],
          itemType: "",
          modelName,
          name,
          required: false,
          type: modelName ? "object" : "string"
        };
      }
      `
    ],
    {
      cwd: packageRoot,
      encoding: "utf8",
      input: stdin
    }
  );
}

function runRawStdinBodyParser(stdin) {
  return spawnSync(
    process.execPath,
    [
      "-e",
      `
      const assert = require("assert");
      const commandArgs = require("./dist/commandArgs");
      const command = {
        aliases: [],
        bodyEnumFields: {},
        bodyField: "testBody",
        bodyFields: [],
        bodyModel: "",
        bodyModels: {},
        bodyRequiredFields: [],
        deprecated: false,
        description: "",
        fields: [
          {
            cliName: "body",
            description: "",
            enumValues: [],
            in: "body",
            modelName: "",
            name: "testBody",
            originalName: "testBody",
            required: true,
            type: "object"
          }
        ],
        httpMethod: "POST",
        name: "create-test",
        operationId: "CreateTest",
        path: "/test",
        responseBodyKey: "",
        responseHeaderFields: [],
        sdkMethodName: "createTest",
        section: "",
        summary: ""
      };
      const group = {
        name: "test",
        tag: "test",
        clientClassName: "TestClient",
        description: "",
        commands: [command]
      };
      const invocation = commandArgs.parseCommandOptions(
        group,
        command,
        ["--body", "-"],
        { auth: "security_token", profile: "DEFAULT", instanceId: "ocid1.test" }
      );
      assert.strictEqual(invocation.request.testBody, "raw-stdin-content");
      console.log("raw stdin body parser test passed");
      `
    ],
    {
      cwd: packageRoot,
      encoding: "utf8",
      input: stdin
    }
  );
}

function assertSensitiveInlineBodyRejected(command, body, sensitiveValues = []) {
  try {
    commandArgs.parseCommandOptions(testGroup(command), command, ["--body", body], {
      auth: "security_token",
      profile: "DEFAULT",
      instanceId: "ocid1.test"
    });
    assert.fail("expected inline sensitive body to be rejected");
  } catch (error) {
    assert.match(error.message, /Inline --body JSON is blocked/);
    assert.ok(!error.message.includes("super-secret"));
    assert.ok(!error.message.includes("git-secret"));
    for (const value of sensitiveValues) {
      assert.ok(!error.message.includes(value));
    }
  }
}

function testGroup(command) {
  return {
    name: "test",
    tag: "test",
    clientClassName: "TestClient",
    description: "",
    commands: [command]
  };
}

function testBodyCommand(overrides = {}) {
  return {
    aliases: [],
    bodyEnumFields: {},
    bodyField: "testBody",
    bodyFields: [],
    bodyModel: "",
    bodyModels: {},
    bodyRequiredFields: [],
    deprecated: false,
    description: "",
    fields: [
      {
        cliName: "body",
        description: "",
        enumValues: [],
        in: "body",
        modelName: "",
        name: "testBody",
        originalName: "testBody",
        required: true,
        type: "object"
      }
    ],
    httpMethod: "POST",
    name: "create-test",
    operationId: "CreateTest",
    path: "/test",
    responseBodyKey: "",
    responseHeaderFields: [],
    sdkMethodName: "createTest",
    section: "",
    summary: "",
    ...overrides
  };
}

function testBodyModel(fields) {
  return {
    enumFields: {},
    fields,
    requiredFields: [],
    variants: []
  };
}

function testBodyField(name, modelName = "") {
  return {
    enumValues: [],
    itemType: "",
    modelName,
    name,
    required: false,
    type: modelName ? "object" : "string"
  };
}
