package com.oracle.aidp.cli.invocation.bundle;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.fixture.GitCredentialFixture;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.util.UUID;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BundleRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_BUNDLE = "cli_bundle";
  private static final String GROUP_BUNDLE = "bundle";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String WORKSPACE_NAME_PREFIX = "IT_Bundle_CLI_";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration GIT_FOLDER_READY_TIMEOUT = Duration.ofMinutes(5);
  private static final Duration BUNDLE_ASYNC_TIMEOUT = Duration.ofMinutes(20);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(15);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private GitCredentialFixture gitCredentialFixture;
  private String runId;
  private String workspaceKey;
  private String workspaceDisplayName;
  private String gitFolderPath;
  private String bundleName;
  private String bundleRootRelativePath;
  private String bundleRootAbsolutePath;
  private String jobName;
  private String jobKey;
  private boolean workspaceDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    gitCredentialFixture = new GitCredentialFixture(config, runner, invocationBuilder, runId);
    gitCredentialFixture.requireConfigured("bundle CLI tests");
    workspaceDisplayName = WORKSPACE_NAME_PREFIX + runId;
    gitFolderPath = "bundle_git_" + runId;
    bundleName = "bundle_cli_" + runId;
    bundleRootRelativePath = gitFolderPath + "/" + bundleName;
    bundleRootAbsolutePath = "/Workspace/" + bundleRootRelativePath;
    jobName = "bundle_job_" + runId + ".job";

    JsonNode workspaceResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "create", createWorkspaceBody(workspaceDisplayName))));
    assertStatus(workspaceResponse, 201);
    workspaceKey = extractWorkspaceKey(workspaceResponse);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);

    createGitBackedFolder();
    waitForWorkspaceObjectAvailable(gitFolderPath, GIT_FOLDER_READY_TIMEOUT);
    createWorkflowJob();
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION})
  public void testCreateBundleCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "bundle", "create", createBundleBody(), workspaceKey)));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), BUNDLE_ASYNC_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateBundleCommand")
  public void testFetchDeploymentStatusCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "bundle", "fetch-deployment-status", bundlePathBody(), workspaceKey)));

    assertStatus(response, 200);
    JsonNode responseData = data(response);
    assertFalse(responseData.isMissingNode(), "Bundle deployment status response should include data.");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testFetchDeploymentStatusCommand")
  public void testSyncBundleCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "bundle", "sync-bundle", bundlePathBody(), workspaceKey)));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), BUNDLE_ASYNC_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testSyncBundleCommand")
  public void testDeployBundleCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "bundle", "deploy", bundlePathBody(), workspaceKey)));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), BUNDLE_ASYNC_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDeployBundleCommand")
  public void testPurgeBundleCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "bundle", "purge", bundlePathBody(), workspaceKey)));

    assertStatus(response, 202);
    waitForAsyncOperationSucceeded(extractAsyncOperationKey(response), BUNDLE_ASYNC_TIMEOUT);
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_BUNDLE, GROUP_BUNDLE, GROUP_REL_VALIDATION})
  public void tearDown() {
    try {
      deleteWorkflowJobIfPresent();
      deleteWorkspaceIfPresent();
    } finally {
      if (gitCredentialFixture != null) {
        gitCredentialFixture.deleteCreatedCredentialIfPresent();
      }
    }
  }

  private void createGitBackedFolder() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace",
                    "create-git-folder",
                    gitCredentialFixture.createGitFolderBody(
                        gitFolderPath, "Git folder created by bundle CLI rel validation."),
                    workspaceKey)));
    assertStatusIn(response, 200, 202);
  }

  private void createWorkflowJob() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workflow", "create-job", createWorkflowJobBody(), workspaceKey)));
    assertStatus(response, 201);
    jobKey = requiredText(jobNode(response), "key");
  }

  private JsonNode jobNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "job");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private void waitForAsyncOperationSucceeded(String asyncOperationKey, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(invocationBuilder.command("async-operations", "get", asyncOperationKey));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, 200)) {
        JsonNode asyncOperation = asyncOperationNode(lastResponse);
        String status = requiredText(asyncOperation, "status");
        if (isSucceededAsyncStatus(status)) {
          return;
        }
        if (isFailedAsyncStatus(status)) {
          throw new AssertionError(
              "Bundle async operation failed. key="
                  + asyncOperationKey
                  + ", response="
                  + lastResponse);
        }
      } else if (lastResponse != null && !hasStatus(lastResponse, 401, 404, 409, 429, 500, 502, 503, 504)) {
        throw new AssertionError(
            "Unexpected response while waiting for bundle async operation "
                + asyncOperationKey
                + ": "
                + lastResponse);
      }
      sleep();
    }
    throw new AssertionError(
        "Bundle async operation "
            + asyncOperationKey
            + " did not succeed within "
            + timeout
            + ". Last response="
            + lastResponse
            + "\nLast output:\n"
            + lastOutput);
  }

  private JsonNode asyncOperationNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "asyncOperation", "async_operation");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private boolean isSucceededAsyncStatus(String status) {
    return "SUCCEEDED".equalsIgnoreCase(status) || "SUCCESS".equalsIgnoreCase(status);
  }

  private boolean isFailedAsyncStatus(String status) {
    return "FAILED".equalsIgnoreCase(status)
        || "CANCELED".equalsIgnoreCase(status)
        || "CANCELLED".equalsIgnoreCase(status);
  }

  private void waitForWorkspaceLifecycleState(String key, String expectedState, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    AssertionError lastError = null;
    while (System.nanoTime() < deadline) {
      try {
        JsonNode workspace = data(getWorkspace(key));
        String state = optionalText(workspace, "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(state)) {
          return;
        }
      } catch (AssertionError e) {
        lastError = e;
      }
      sleep();
    }
    if (lastError != null) {
      throw lastError;
    }
    throw new AssertionError("Workspace " + key + " did not reach state " + expectedState);
  }

  private void waitForWorkspaceObjectAvailable(String path, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(
              invocationBuilder.command(
                  "workspace-object", "head", workspaceKey, path, "--should-include-metadata=true"));
      lastOutput = result.combinedOutput();
      JsonNode response = responseJsonOrNull(result);
      if (result.exitCode() == 0 && response != null && hasStatus(response, 200, 204)) {
        return;
      }
      sleep();
    }
    throw new AssertionError(
        "Workspace object " + path + " was not available within " + timeout + ". Last output:\n" + lastOutput);
  }

  private JsonNode getWorkspace(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("workspace", "get", key)));
    assertStatus(response, 200);
    return response;
  }

  private void deleteWorkflowJobIfPresent() {
    if (runner == null || invocationBuilder == null || workspaceKey == null || jobKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting bundle fixture workflow job " + jobKey);
    CliCommandResult result =
        runner.run(invocationBuilder.command("workflow", "delete-job", workspaceKey, jobKey));
    if (result.exitCode() != 0) {
      CliTestLogger.block(
          "CLEANUP",
          "Failed to delete bundle fixture workflow job:",
          result.combinedOutput(),
          config.cliLogMaxCharacters());
    }
  }

  private void deleteWorkspaceIfPresent() {
    if (workspaceDeleted || runner == null || invocationBuilder == null || workspaceKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting bundle test workspace " + workspaceKey);
    CliCommandResult result = runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
    if (result.exitCode() != 0) {
      if (isNotFound(result)) {
        workspaceDeleted = true;
        return;
      }
      CliTestLogger.block(
          "CLEANUP",
          "Failed to delete bundle test workspace:",
          result.combinedOutput(),
          config.cliLogMaxCharacters());
      return;
    }
    JsonNode response = assertSuccess(result);
    assertStatus(response, 204);
    waitForWorkspaceDeleted(workspaceKey, WORKSPACE_DELETE_TIMEOUT);
    workspaceDeleted = true;
  }

  private void waitForWorkspaceDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (isNotFound(result)) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace " + key + " was not deleted within " + timeout);
  }

  private boolean isNotFound(CliCommandResult result) {
    JsonNode response = responseJsonOrNull(result);
    if (response == null) {
      return false;
    }
    int status = response.path("status").asInt(-1);
    return status == 404;
  }

  private boolean hasStatus(JsonNode response, int... acceptableStatuses) {
    int actual = response.path("status").asInt(-1);
    for (int status : acceptableStatuses) {
      if (actual == status) {
        return true;
      }
    }
    return false;
  }

  private JsonNode responseJsonOrNull(CliCommandResult result) {
    try {
      return responseJson(result);
    } catch (AssertionError e) {
      return null;
    }
  }

  private String createWorkspaceBody(String displayName) {
    return """
        {
          "displayName": "%s",
          "description": "%s",
          "defaultCatalogKey": "default"
        }
        """
        .formatted(displayName, displayName);
  }

  private String createWorkflowJobBody() {
    return """
        {
          "name": "%s",
          "description": "Workflow job fixture for bundle CLI rel validation.",
          "path": "/Workspace/jobs",
          "maxConcurrentRuns": 1
        }
        """
        .formatted(jobName);
  }

  private String createBundleBody() {
    return """
        {
          "name": "%s",
          "description": "Bundle created by CLI rel validation.",
          "path": "%s",
          "bundledResources": [
            {
              "resourceKey": "%s",
              "resourceType": "JOB"
            }
          ]
        }
        """
        .formatted(bundleName, "/Workspace/" + gitFolderPath, jobKey);
  }

  private String bundlePathBody() {
    return """
        {
          "path": "%s"
        }
        """
        .formatted(bundleRootAbsolutePath);
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private String extractAsyncOperationKey(JsonNode response) {
    String key =
        optionalText(
            response.path("headers"),
            "datalake-async-operation-key",
            "aidp-async-operation-key",
            "oidl-async-operation-key");
    assertNotNull(key, "Expected async operation key in response headers: " + response);
    return key;
  }

  private static void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting", e);
    }
  }
}
