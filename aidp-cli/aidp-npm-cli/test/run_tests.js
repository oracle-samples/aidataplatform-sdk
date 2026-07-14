const assert = require("assert");
const fs = require("fs");
const path = require("path");
const stream = require("stream");
const { spawnSync } = require("child_process");
const common = require("oci-common");

const args = require("../dist/args");
const configModule = require("../dist/config");
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
const mlops = discovery.findCommandGroup(manifest, "mlops");
assert.ok(mlops);
assert.ok(manifest.commandGroups.some((group) => group.name === "mlops"));
assert.ok(!manifest.commandGroups.some((group) => group.name === "ml-ops"));
assert.ok(discovery.findCommandGroup(manifest, "bundle"));
assert.ok(discovery.findCommandGroup(manifest, "cluster"));
const notebook = discovery.findCommandGroup(manifest, "notebook");
assert.ok(notebook);
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
  OCI_CLI_ENDPOINT: process.env.OCI_CLI_ENDPOINT,
  OCI_CLI_PROFILE: process.env.OCI_CLI_PROFILE,
  AIDP_ENDPOINT: process.env.AIDP_ENDPOINT,
  AIDP_INSTANCE_ID: process.env.AIDP_INSTANCE_ID,
  INSTANCE_ID: process.env.INSTANCE_ID
};
try {
  delete process.env.OCI_CLI_AUTH;
  delete process.env.OCI_CLI_CONFIG_FILE;
  delete process.env.OCI_CLI_ENDPOINT;
  delete process.env.OCI_CLI_PROFILE;
  delete process.env.AIDP_ENDPOINT;
  delete process.env.AIDP_INSTANCE_ID;
  delete process.env.INSTANCE_ID;

  const parsed = args.parseGlobalOptions(["-p", "DEFAULT", "workspace", "get-workspace"]);
  assert.strictEqual(parsed.globals.auth, "security_token");
  assert.strictEqual(parsed.globals.profile, "DEFAULT");
  assert.deepStrictEqual(parsed.args, ["workspace", "get-workspace"]);

  process.env.AIDP_INSTANCE_ID = "ocid1.test";
  process.env.INSTANCE_ID = "ocid1.legacy";
  process.env.AIDP_ENDPOINT = "https://aidp-env.example.com";
  process.env.OCI_CLI_ENDPOINT = "https://oci-env.example.com";
  const parsedWithInstance = args.parseGlobalOptions(["workspace", "get-workspace"]);
  assert.strictEqual(parsedWithInstance.globals.instanceId, "ocid1.test");
  assert.strictEqual(parsedWithInstance.globals.endpoint, "https://aidp-env.example.com");
  const getInvocation = commandArgs.parseCommandOptions(workspace, getWorkspace, ["wk1"], parsedWithInstance.globals);
  assert.strictEqual(getInvocation.request.aiDataPlatformId, "ocid1.test");
  assert.strictEqual(getInvocation.request.workspaceKey, "wk1");
  assert.ok(String(getInvocation.request.opcRequestId).startsWith("aidp-cli-"));

  const parsedWithCommandLineInstance = args.parseGlobalOptions([
    "--instance-id",
    "ocid1.cli",
    "--endpoint",
    "https://cli-endpoint.example.com",
    "workspace",
    "get-workspace"
  ]);
  assert.strictEqual(parsedWithCommandLineInstance.globals.instanceId, "ocid1.cli");
  assert.strictEqual(parsedWithCommandLineInstance.globals.endpoint, "https://cli-endpoint.example.com");
  assert.strictEqual(configModule.resolveEndpoint(parsedWithCommandLineInstance.globals), "https://cli-endpoint.example.com");

  for (const hiddenEnvironmentFlag of [
    "--environment-prefix",
    "--environmentprefix",
    "--environment-domain",
    "--environment-host"
  ]) {
    for (const argv of [
      [hiddenEnvironmentFlag, "ignored", "workspace", "get-workspace"],
      [`${hiddenEnvironmentFlag}=ignored`, "workspace", "get-workspace"]
    ]) {
      assert.throws(
        () => args.parseGlobalOptions(argv),
        (error) => {
          assert.strictEqual(error.message, `Unknown option '${hiddenEnvironmentFlag}'.`);
          return true;
        }
      );
    }
  }
  assert.strictEqual(
    config.resolveEndpoint({
      ...parsedWithCommandLineInstance.globals,
      endpoint: "aidp.example.com/"
    }),
    "https://aidp.example.com"
  );
  assert.throws(
    () =>
      config.resolveEndpoint({
        ...parsedWithCommandLineInstance.globals,
        endpoint: "http://127.0.0.1:18080/"
      }),
    /--endpoint must use https:\/\//
  );

  delete process.env.AIDP_INSTANCE_ID;
  delete process.env.INSTANCE_ID;
  const parsedWithoutInstance = args.parseGlobalOptions(["workspace", "get-workspace"]);
  assert.throws(
    () => commandArgs.parseCommandOptions(workspace, getWorkspace, ["wk1"], parsedWithoutInstance.globals),
    /Set --instance-id or AIDP_INSTANCE_ID/
  );
  process.env.AIDP_INSTANCE_ID = "ocid1.test";
  process.env.INSTANCE_ID = "ocid1.legacy";

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

  const emptyBodyCommand = testBodyCommand({
    bodyModel: "EmptyDetails",
    bodyModels: {
      EmptyDetails: testBodyModel([])
    }
  });
  const emptyBodyInvocation = commandArgs.parseCommandOptions(
    testGroup(emptyBodyCommand),
    emptyBodyCommand,
    ["--body", "{}"],
    parsedWithInstance.globals
  );
  const emptyHttpRequest = {};
  cli.prepareHttpRequestForSend(emptyBodyCommand, emptyBodyInvocation.request, emptyHttpRequest);
  assert.strictEqual(emptyHttpRequest.body, "{}");
  const existingHttpRequest = { body: "{\"kept\":true}" };
  cli.prepareHttpRequestForSend(emptyBodyCommand, emptyBodyInvocation.request, existingHttpRequest);
  assert.strictEqual(existingHttpRequest.body, "{\"kept\":true}");

  const updateExperiment = discovery.findCommand(mlops, "update-experiment");
  assert.ok(updateExperiment);
  const updateExperimentInvocation = commandArgs.parseCommandOptions(
    mlops,
    updateExperiment,
    ["workspace-key", "--body", "{\"experiment_id\":\"122\",\"new_name\":\"demo-updated\"}"],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(updateExperimentInvocation.request.updateExperimentDetails, {
    experimentId: "122",
    newName: "demo-updated"
  });
  const updateExperimentCamelInvocation = commandArgs.parseCommandOptions(
    mlops,
    updateExperiment,
    ["workspace-key", "--body", "{\"experimentId\":\"122\",\"newName\":\"demo-updated\"}"],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(updateExperimentCamelInvocation.request.updateExperimentDetails, {
    experimentId: "122",
    newName: "demo-updated"
  });

  const createSession = discovery.findCommand(notebook, "create-session");
  assert.ok(createSession);
  const createSessionInvocation = commandArgs.parseCommandOptions(
    notebook,
    createSession,
    [
      "workspace-key",
      "--body",
      "{\"name\":\"session\",\"cluster_id\":\"cluster-key\",\"kernel\":{\"name\":\"python3\"}}"
    ],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(createSessionInvocation.request.createSessionDetails, {
    name: "session",
    clusterId: "cluster-key",
    kernel: { name: "python3" }
  });

  const nestedBodyCommand = testBodyCommand({
    bodyModel: "ParentDetails",
    bodyModels: {
      ParentDetails: testBodyModel([
        testBodyField("childItems", "ChildDetails", { type: "array", itemType: "object" })
      ]),
      ChildDetails: testBodyModel([testBodyField("childName"), testBodyField("grandChild", "GrandChildDetails")]),
      GrandChildDetails: testBodyModel([testBodyField("grandValue")])
    }
  });
  const nestedInvocation = commandArgs.parseCommandOptions(
    testGroup(nestedBodyCommand),
    nestedBodyCommand,
    [
      "--body",
      "{\"child_items\":[{\"child_name\":\"child\",\"grand_child\":{\"grand_value\":\"nested\"}}],\"unknown_key\":\"kept\"}"
    ],
    parsedWithInstance.globals
  );
  assert.deepStrictEqual(nestedInvocation.request.testBody, {
    childItems: [
      {
        childName: "child",
        grandChild: { grandValue: "nested" }
      }
    ],
    unknown_key: "kept"
  });

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
    assert.ok(Buffer.isBuffer(rawFileInvocation.request.testBody));
    assert.strictEqual(rawFileInvocation.request.testBody.toString("utf8"), "raw-content");
    cli.prepareRequestForSdk(rawCommand, rawFileInvocation.request);
    assert.ok(rawFileInvocation.request.testBody instanceof stream.Readable);
    assert.strictEqual(rawFileInvocation.request.retryConfiguration, common.NoRetryConfigurationDetails);

    const rawFileUrlInvocation = commandArgs.parseCommandOptions(
      testGroup(rawCommand),
      rawCommand,
      ["--body", `file://${rawBodyFile}`],
      parsedWithInstance.globals
    );
    assert.ok(Buffer.isBuffer(rawFileUrlInvocation.request.testBody));
    assert.strictEqual(rawFileUrlInvocation.request.testBody.toString("utf8"), "raw-content");

    const rawStringRequest = { ...rawInlineInvocation.request };
    cli.prepareRequestForSdk(rawCommand, rawStringRequest);
    assert.strictEqual(rawStringRequest.retryConfiguration, undefined);
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
  restoreEnv("OCI_CLI_ENDPOINT", originalEnv.OCI_CLI_ENDPOINT);
  restoreEnv("OCI_CLI_PROFILE", originalEnv.OCI_CLI_PROFILE);
  restoreEnv("AIDP_ENDPOINT", originalEnv.AIDP_ENDPOINT);
  restoreEnv("AIDP_INSTANCE_ID", originalEnv.AIDP_INSTANCE_ID);
  restoreEnv("INSTANCE_ID", originalEnv.INSTANCE_ID);
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
assert.ok(createClusterHelp.stdout.includes("AI_COMPUTE"));
assert.ok(createClusterHelp.stdout.includes("Body variants:"));
assert.ok(createClusterHelp.stdout.includes("Example JSON - CreateAiComputeDetails (type=AI_COMPUTE):"));
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

const printedNonJsonStream = captureStdout(() =>
  output.printResponse({}, { data: "abc", headers: { "content-type": "application/x-yaml" }, status: 200 })
);
assert.deepStrictEqual(parsePrintedResponse(printedNonJsonStream).data, [[97, 98, 99]]);

const printedJsonCapture = captureStdout(() =>
  output.printResponse({}, { data: { ok: true }, headers: { "content-type": "application/json" }, status: 200 })
);
assert.deepStrictEqual(parsePrintedResponse(printedJsonCapture).data, { ok: true });

const capturedJsonFallback = runCaptureResponseParser();
assert.strictEqual(capturedJsonFallback.status, 0, capturedJsonFallback.stderr);
assert.ok(capturedJsonFallback.stdout.includes("capture response parser test passed"));

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
assert.ok(configureHelp.includes("AIDP_INSTANCE_ID"));

console.log("aidp npm cli tests passed");

function runCli(cliArgs) {
  return spawnSync(process.execPath, ["dist/bin/aidp.js", ...cliArgs], {
    cwd: packageRoot,
    encoding: "utf8"
  });
}

function runCaptureResponseParser() {
  return spawnSync(
    process.execPath,
    [
      "-e",
      `
      const assert = require("assert");
      const cli = require("./dist/cli");

      (async () => {
        const validJsonResponse = new Response("{\\"ok\\":true}", {
          status: 200,
          headers: { "content-type": "application/json" }
        });
        const validJsonCapture = await cli.captureResponse(validJsonResponse);
        assert.deepStrictEqual(validJsonCapture.data, { ok: true });

        const rawTextResponse = new Response("volume CLI rel validation content", {
          status: 200,
          headers: { "content-type": "application/json" }
        });
        const rawTextCapture = await cli.captureResponse(rawTextResponse);
        assert.strictEqual(rawTextCapture.data, "volume CLI rel validation content");
        assert.strictEqual(rawTextCapture.status, 200);

        console.log("capture response parser test passed");
      })().catch((error) => {
        console.error(error && error.stack ? error.stack : error);
        process.exit(1);
      });
      `
    ],
    {
      cwd: packageRoot,
      encoding: "utf8"
    }
  );
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

function parsePrintedResponse(text) {
  const marker = "Response:";
  const index = text.indexOf(marker);
  assert.ok(index >= 0);
  return JSON.parse(text.substring(index + marker.length).trim());
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
      assert.ok(Buffer.isBuffer(invocation.request.testBody));
      assert.strictEqual(invocation.request.testBody.toString("utf8"), "raw-stdin-content");
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

function testBodyField(name, modelName = "", overrides = {}) {
  return {
    enumValues: [],
    itemType: "",
    modelName,
    name,
    required: false,
    type: modelName ? "object" : "string",
    ...overrides
  };
}
