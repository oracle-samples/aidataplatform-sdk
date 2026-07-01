package com.oracle.aidp.cli.invocation.notebook;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NotebookRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_NOTEBOOK = "cli_notebook";
  private static final String GROUP_NOTEBOOK = "notebook";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String WORKSPACE_NAME_PREFIX = "IT_Notebook_CLI_";
  private static final String CLUSTER_NAME_PREFIX = "IT_Notebook_Cluster_CLI_";
  private static final String AMD_GENERIC = "amd.generic";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration CLUSTER_READY_TIMEOUT = Duration.ofMinutes(30);
  private static final Duration CLUSTER_DELETE_TIMEOUT = Duration.ofMinutes(15);
  private static final Duration SESSION_READY_TIMEOUT = Duration.ofMinutes(15);
  private static final Duration SESSION_DELETE_TIMEOUT = Duration.ofMinutes(5);
  private static final Duration CONTENT_READ_TIMEOUT = Duration.ofMinutes(3);
  private static final Duration CONTENT_DELETE_TIMEOUT = Duration.ofMinutes(3);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(20);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String workspaceKey;
  private String workspaceDisplayName;
  private String folderName;
  private String folderObjectPath;
  private String notebookFolderPath;
  private String notebookFileName;
  private String notebookPath;
  private String currentNotebookPath;
  private String clusterKey;
  private String clusterDisplayName;
  private String sessionId;
  private String sessionName;
  private boolean notebookDeleted;
  private boolean sessionDeleted;
  private boolean clusterDeleted;
  private boolean workspaceDeleted;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    workspaceDisplayName = WORKSPACE_NAME_PREFIX + runId;
    folderName = "notebook_cli_" + runId;
    folderObjectPath = folderName;
    notebookFolderPath = "/Workspace/" + folderName;
    notebookFileName = "notebook_" + runId + ".ipynb";
    notebookPath = notebookFolderPath + "/" + notebookFileName;

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "create", createWorkspaceBody(workspaceDisplayName))));
    assertStatus(response, 201);
    workspaceKey = extractWorkspaceKey(response);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
    createNotebookFolder();
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION})
  public void testCreateContentCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "create-content",
                    createNotebookBody(),
                    workspaceKey,
                    notebookFolderPath)));
    assertStatusIn(response, 200, 201);

    JsonNode content = contentNode(response);
    currentNotebookPath = requiredText(content, "path");
    assertEquals(requiredText(content, "type"), "notebook");
    assertTrue(
        normalizeNotebookPath(currentNotebookPath).startsWith(normalizeNotebookPath(notebookFolderPath) + "/"),
        "Created notebook path should be under " + notebookFolderPath + ": " + currentNotebookPath);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateContentCommand")
  public void testModifyContentCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "modify-content",
                    modifyContentBody(notebookPath),
                    workspaceKey,
                    currentNotebookPath)));
    assertStatus(response, 200);

    JsonNode content = contentNode(response);
    assertNotebookPathEquals(requiredText(content, "path"), notebookPath);
    assertEquals(requiredText(content, "name"), notebookFileName);
    currentNotebookPath = requiredText(content, "path");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testModifyContentCommand")
  public void testUpdateContentCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "update-content",
                    updateNotebookContentBody(),
                    workspaceKey,
                    notebookPath)));
    assertStatus(response, 200);

    JsonNode content = contentNode(response);
    assertNotebookPathEquals(requiredText(content, "path"), notebookPath);
    assertEquals(requiredText(content, "type"), "notebook");
    currentNotebookPath = requiredText(content, "path");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateContentCommand")
  public void testGetContentCommand() {
    String pathForGet = currentNotebookPath != null ? currentNotebookPath : notebookPath;
    JsonNode response = getContentResponseWithRetry(pathForGet, CONTENT_READ_TIMEOUT);
    assertStatus(response, 200);

    JsonNode content = contentNode(response);
    assertNotebookPathEquals(requiredText(content, "path"), notebookPath);
    assertEquals(requiredText(content, "type"), "notebook");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateContentCommand")
  public void testExportContentsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "export-contents",
                    "{\"format\":\"ipynb\"}",
                    workspaceKey,
                    notebookPath)));
    assertStatus(response, 200);

    JsonNode exported = data(response);
    assertEquals(requiredText(exported, "format"), "ipynb");
    assertTrue(!exported.path("content").isMissingNode(), "Exported notebook content missing: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateContentCommand")
  public void testCreateSessionCommand() {
    ensureClusterActive();
    sessionName = "notebook_session_" + runId;

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "create-session",
                    createSessionBody(sessionName),
                    workspaceKey)));
    assertStatusIn(response, 200, 201);

    JsonNode session = sessionNode(response);
    sessionId = requiredText(session, "id");
    assertNotebookPathEquals(requiredText(session, "path"), notebookPath);
    assertEquals(requiredText(session, "type"), "notebook");
    waitForSessionState("ACTIVE", SESSION_READY_TIMEOUT);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateSessionCommand")
  public void testGetSessionCommand() {
    JsonNode response = getSessionResponse();
    JsonNode session = sessionNode(response);
    assertEquals(requiredText(session, "id"), sessionId);
    assertNotebookPathEquals(requiredText(session, "path"), notebookPath);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetSessionCommand")
  public void testListSessionsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "notebook",
                    "list-sessions",
                    workspaceKey,
                    "--path",
                    notebookPath,
                    "--cluster-id",
                    clusterKey)));
    assertStatus(response, 200);
    assertTrue(
        sessionItems(response).stream().anyMatch(item -> sessionId.equals(optionalText(item, "id"))),
        "Created notebook session " + sessionId + " was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListSessionsCommand")
  public void testPatchSessionCommand() {
    String updatedSessionName = sessionName + "_updated";
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "notebook",
                    "patch-session",
                    patchSessionBody(updatedSessionName),
                    workspaceKey,
                    sessionId)));
    assertStatus(response, 200);

    JsonNode session = sessionNode(response);
    assertEquals(requiredText(session, "id"), sessionId);
    assertEquals(requiredText(session, "name"), updatedSessionName);
    sessionName = updatedSessionName;
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = "testPatchSessionCommand")
  public void testDeleteSessionCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("notebook", "delete-session", workspaceKey, sessionId)));
    assertStatus(response, 204);
    waitForSessionDeleted(SESSION_DELETE_TIMEOUT);
    sessionDeleted = true;
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION},
      dependsOnMethods = {"testDeleteSessionCommand", "testExportContentsCommand"})
  public void testDeleteContentCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(invocationBuilder.command("notebook", "delete-content", workspaceKey, notebookPath)));
    assertStatus(response, 204);
    notebookDeleted = true;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_NOTEBOOK, GROUP_NOTEBOOK, GROUP_REL_VALIDATION})
  public void cleanup() {
    List<String> cleanupFailures = new ArrayList<>();
    String clusterCleanupFailure = null;
    if (sessionId != null && !sessionDeleted) {
      try {
        deleteSessionIfPresent();
      } catch (RuntimeException | AssertionError e) {
        cleanupFailures.add("session " + sessionId + ": " + e.getMessage());
      }
    }
    if (notebookPath != null && !notebookDeleted) {
      try {
        deleteContentIfPresent(currentNotebookPath != null ? currentNotebookPath : notebookPath);
      } catch (RuntimeException | AssertionError e) {
        cleanupFailures.add("notebook " + notebookPath + ": " + e.getMessage());
      }
    }
    if (clusterKey != null && !clusterDeleted) {
      try {
        deleteClusterIfPresent();
      } catch (RuntimeException | AssertionError e) {
        clusterCleanupFailure = "cluster " + clusterKey + ": " + e.getMessage();
      }
    }
    if (workspaceKey != null && !workspaceDeleted) {
      try {
        deleteWorkspaceIfPresent();
      } catch (RuntimeException | AssertionError e) {
        cleanupFailures.add("workspace " + workspaceKey + ": " + e.getMessage());
      }
    }

    if (clusterCleanupFailure != null && !workspaceDeleted) {
      cleanupFailures.add(clusterCleanupFailure);
    } else if (clusterCleanupFailure != null) {
      CliTestLogger.info(
          "CLEANUP",
          "Ignoring cluster cleanup failure because workspace cleanup completed: " + clusterCleanupFailure);
    }

    if (!cleanupFailures.isEmpty()) {
      fail("Notebook CLI rel validation cleanup failed: " + String.join("; ", cleanupFailures));
    }
  }

  private void createNotebookFolder() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "create",
                    "",
                    workspaceKey,
                    "--path",
                    folderObjectPath,
                    "--type",
                    "FOLDER")));
    assertStatusIn(response, 200, 201, 202, 204);
  }

  private void ensureClusterActive() {
    if (clusterKey != null) {
      waitForClusterState("ACTIVE", CLUSTER_READY_TIMEOUT);
      return;
    }

    clusterDisplayName = CLUSTER_NAME_PREFIX + runId;
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "create", createClusterBody(clusterDisplayName), workspaceKey)));
    assertStatus(response, 202);
    JsonNode cluster = clusterNode(response);
    clusterKey = requiredText(cluster, "key");
    waitForClusterState("ACTIVE", CLUSTER_READY_TIMEOUT);
  }

  private JsonNode getSessionResponse() {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("notebook", "get-session", workspaceKey, sessionId)));
    assertStatus(response, 200);
    return response;
  }

  private void waitForWorkspaceLifecycleState(String key, String expectedState, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastState = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (result.exitCode() == 0) {
        JsonNode workspace = data(responseJson(result));
        lastState = optionalText(workspace, "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(lastState)) {
          return;
        }
      }
      sleep();
    }
    throw new AssertionError(
        "Workspace " + key + " did not reach state " + expectedState + ". Last state=" + lastState);
  }

  private void waitForClusterState(String expectedState, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastState = null;
    String lastOutput = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("cluster", "get", workspaceKey, clusterKey));
      lastOutput = result.combinedOutput();
      if (result.exitCode() == 0) {
        JsonNode cluster = clusterNode(responseJson(result));
        lastState = optionalText(cluster, "state", "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(lastState)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(lastState)) {
          throw new AssertionError("Cluster " + clusterKey + " reached FAILED state: " + cluster);
        }
      }
      sleep();
    }
    throw new AssertionError(
        "Cluster "
            + clusterKey
            + " did not reach state "
            + expectedState
            + ". Last state="
            + lastState
            + " last output="
            + lastOutput);
  }

  private void waitForSessionState(String expectedState, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastState = null;
    String lastOutput = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("notebook", "get-session", workspaceKey, sessionId));
      lastOutput = result.combinedOutput();
      if (result.exitCode() == 0) {
        JsonNode session = sessionNode(responseJson(result));
        lastState = optionalText(session, "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(lastState)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(lastState)) {
          throw new AssertionError("Notebook session " + sessionId + " reached FAILED state: " + session);
        }
      }
      sleep();
    }
    throw new AssertionError(
        "Notebook session "
            + sessionId
            + " did not reach state "
            + expectedState
            + ". Last state="
            + lastState
            + " last output="
            + lastOutput);
  }

  private void waitForContentDeleted(Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(invocationBuilder.command("notebook", "get-content", workspaceKey, notebookPath, "--content", "0"));
      if (hasStatus(responseJsonOrNull(result), 404) || result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Notebook content " + notebookPath + " was not deleted within " + timeout);
  }

  private void waitForSessionDeleted(Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("notebook", "get-session", workspaceKey, sessionId));
      if (hasStatus(responseJsonOrNull(result), 404) || result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Notebook session " + sessionId + " was not deleted within " + timeout);
  }

  private void waitForClusterDeleted(Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("cluster", "get", workspaceKey, clusterKey));
      if (hasStatus(responseJsonOrNull(result), 404) || result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Cluster " + clusterKey + " was not deleted within " + timeout);
  }

  private JsonNode getContentResponseWithRetry(String path, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result =
          runner.run(
              invocationBuilder.command(
                  "notebook",
                  "get-content",
                  workspaceKey,
                  path,
                  "--type",
                  "notebook",
                  "--content",
                  "0"));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && hasStatus(lastResponse, 200)) {
        return lastResponse;
      }
      if (!isRetryableGetContentFailure(lastResponse, lastOutput)) {
        fail("Failed to get notebook content for " + path + ": " + lastOutput);
      }

      CliTestLogger.info(
          "WAIT",
          "Retrying notebook get-content for "
              + path
              + ". Last status="
              + (lastResponse == null ? "none" : lastResponse.path("status").asText()));
      sleep();
    }
    throw new AssertionError(
        "Timed out getting notebook content for "
            + path
            + ". Last response="
            + lastResponse
            + " last output="
            + lastOutput);
  }

  private void waitForWorkspaceDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (hasStatus(responseJsonOrNull(result), 404) || result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace " + key + " was not deleted within " + timeout);
  }

  private void deleteSessionIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting notebook session " + sessionId);
    JsonNode response =
        runDeleteWithRetry(
            "delete notebook session",
            () -> runner.run(invocationBuilder.command("notebook", "delete-session", workspaceKey, sessionId)),
            SESSION_DELETE_TIMEOUT);
    if (hasStatus(response, 204)) {
      waitForSessionDeleted(SESSION_DELETE_TIMEOUT);
    }
    sessionDeleted = true;
  }

  private void deleteContentIfPresent(String path) {
    CliTestLogger.info("CLEANUP", "Deleting notebook content " + path);
    JsonNode response =
        runDeleteWithRetry(
            "delete notebook content",
            () -> runner.run(invocationBuilder.command("notebook", "delete-content", workspaceKey, path)),
            CONTENT_DELETE_TIMEOUT);
    if (sameNotebookPath(path, notebookPath)) {
      notebookDeleted = true;
    }
  }

  private void deleteClusterIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting cluster " + clusterKey);
    JsonNode response =
        runDeleteWithRetry(
            "delete cluster",
            () -> runner.run(invocationBuilder.command("cluster", "delete", workspaceKey, clusterKey)),
            CLUSTER_DELETE_TIMEOUT);
    if (hasStatus(response, 204)) {
      waitForClusterDeleted(CLUSTER_DELETE_TIMEOUT);
    }
    clusterDeleted = true;
  }

  private void deleteWorkspaceIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting workspace " + workspaceKey);
    JsonNode response =
        runDeleteWithRetry(
            "delete workspace",
            () -> runner.run(invocationBuilder.command("workspace", "delete", workspaceKey)),
            WORKSPACE_DELETE_TIMEOUT);
    if (hasStatus(response, 204)) {
      waitForWorkspaceDeleted(workspaceKey, WORKSPACE_DELETE_TIMEOUT);
    }
    workspaceDeleted = true;
  }

  private JsonNode runDeleteWithRetry(String description, Supplier<CliCommandResult> command, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = command.get();
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && hasStatus(lastResponse, 204, 404)) {
        return lastResponse;
      }
      if (hasStatus(lastResponse, 404) || lastOutput.contains("\"status\": 404")) {
        return lastResponse;
      }
      if (!hasStatus(lastResponse, 409)) {
        throw new AssertionError("Failed to " + description + ": " + lastOutput);
      }

      CliTestLogger.info(
          "CLEANUP",
          "Retrying " + description + " because an operation is still in progress. Last response=" + lastResponse);
      sleep();
    }
    throw new AssertionError(
        "Timed out waiting to " + description + ". Last response=" + lastResponse + " last output=" + lastOutput);
  }

  private JsonNode contentNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("path").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "content");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private JsonNode sessionNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("id").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "session");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private JsonNode clusterNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "cluster");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private List<JsonNode> sessionItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "sessionCollection", "session_collection").path("items");
    }

    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private void assertNotebookPathEquals(String actual, String expected) {
    assertEquals(normalizeNotebookPath(actual), normalizeNotebookPath(expected));
  }

  private boolean sameNotebookPath(String left, String right) {
    return normalizeNotebookPath(left).equals(normalizeNotebookPath(right));
  }

  private String normalizeNotebookPath(String path) {
    if (path == null) {
      return "";
    }
    String value = path.trim();
    while (value.startsWith("/")) {
      value = value.substring(1);
    }
    return value;
  }

  private boolean hasStatus(JsonNode response, int... acceptableStatuses) {
    if (response == null) {
      return false;
    }
    int actual = response.path("status").asInt(-1);
    for (int expected : acceptableStatuses) {
      if (actual == expected) {
        return true;
      }
    }
    return false;
  }

  private boolean isRetryableGetContentFailure(JsonNode response, String output) {
    if (hasStatus(response, 404, 409, 429, 500, 502, 503, 504)) {
      return true;
    }
    return output != null
        && (output.contains("RemoteDisconnected")
            || output.contains("Connection aborted")
            || output.contains("request failed"));
  }

  private JsonNode responseJsonOrNull(CliCommandResult result) {
    if (!result.stdout().contains("Response:") && !result.stderr().contains("Response:")) {
      return null;
    }
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

  private String createNotebookBody() {
    return """
        {
          "type": "notebook",
          "ext": ".ipynb"
        }
        """;
  }

  private String modifyContentBody(String targetPath) {
    return """
        {
          "path": "%s"
        }
        """
        .formatted(targetPath);
  }

  private String updateNotebookContentBody() {
    return """
        {
          "name": "%s",
          "path": "%s",
          "type": "notebook",
          "format": "json",
          "content": {
            "cells": [
              {
                "cell_type": "code",
                "execution_count": null,
                "id": "aidp-cli-demo",
                "metadata": {
                  "trusted": true
                },
                "outputs": [],
                "source": "print(\\\"Hello from notebook CLI rel validation\\\")"
              }
            ],
            "metadata": {
              "kernelspec": {
                "display_name": "Python 3",
                "language": "python",
                "name": "python3"
              },
              "language_info": {
                "name": "python"
              }
            },
            "nbformat": 4,
            "nbformat_minor": 5
          }
        }
        """
        .formatted(notebookFileName, notebookPath);
  }

  private String createSessionBody(String name) {
    return """
        {
          "name": "%s",
          "path": "%s",
          "type": "notebook",
          "cluster_id": "%s",
          "kernel": {
            "name": "python3"
          }
        }
        """
        .formatted(name, notebookPath, clusterKey);
  }

  private String patchSessionBody(String name) {
    return """
        {
          "id": "%s",
          "name": "%s",
          "path": "%s",
          "type": "notebook",
          "cluster_id": "%s",
          "must_refresh_context": false
        }
        """
        .formatted(sessionId, name, notebookPath, clusterKey);
  }

  private String createClusterBody(String displayName) {
    return """
        {
          "displayName": "%s",
          "type": "USER",
          "nodeType": "%s",
          "driverConfig": {
            "driverNodeType": "%s",
            "driverShape": "%s",
            "driverShapeConfig": {
              "ocpus": 1,
              "memoryInGBs": 16
            }
          },
          "workerConfig": {
            "workerShape": "%s",
            "workerShapeConfig": {
              "ocpus": 1,
              "memoryInGBs": 16
            },
            "minWorkerCount": 1,
            "maxWorkerCount": 1
          },
          "clusterRuntimeConfig": {
            "type": "SPARK",
            "sparkVersion": "3.5.0",
            "initScripts": [],
            "sparkAdvancedConfigurations": {},
            "sparkEnvVariables": {}
          },
          "autoTerminationMinutes": 60
        }
        """
        .formatted(displayName, AMD_GENERIC, AMD_GENERIC, AMD_GENERIC, AMD_GENERIC);
  }

  private void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while polling notebook CLI resource state.", e);
    }
  }
}
