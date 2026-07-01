package com.oracle.aidp.cli.invocation.cluster;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.aidp.cli.invocation.config.CliTestConfig;
import com.oracle.aidp.cli.invocation.logging.CliTestLogger;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import com.oracle.aidp.cli.invocation.runner.CliCommandRunner;
import com.oracle.aidp.cli.invocation.runner.CliInvocationBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClusterRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_CLUSTER = "cli_cluster";
  private static final String GROUP_CLUSTER = "cluster";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String WORKSPACE_NAME_PREFIX = "IT_Cluster_CLI_";
  private static final String CLUSTER_NAME_PREFIX = "Basic_Cluster_Config_CLI_";
  private static final String UPDATED_CLUSTER_NAME_PREFIX = "Updated_Cluster_Name_CLI_";
  private static final String AMD_GENERIC = "amd.generic";
  private static final String LOG_LEVEL_INFO = "INFO";
  private static final String LOG_STREAM_TYPE_DRIVER = "stderr";
  private static final String LOG_CONTENT_TYPE_DRIVER = "driver";
  private static final String METRIC_CPU_UTILIZATION = "CpuUtilization";
  private static final String AGGREGATION_INTERVAL = "5m";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration CLUSTER_READY_TIMEOUT = Duration.ofMinutes(30);
  private static final Duration CLUSTER_TRANSITION_TIMEOUT = Duration.ofMinutes(20);
  private static final Duration CLUSTER_DELETE_TIMEOUT = Duration.ofMinutes(15);
  private static final Duration OBSERVABILITY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(20);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String workspaceKey;
  private String workspaceDisplayName;
  private String clusterKey;
  private String clusterDisplayName;
  private String libraryPath;
  private boolean clusterDeleted;
  private boolean workspaceDeleted;

  @BeforeClass(alwaysRun = true, groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    workspaceDisplayName = WORKSPACE_NAME_PREFIX + runId;
    libraryPath = "/Workspace/cluster_cli_" + runId + "/requirements.txt";

    String body =
        """
        {
          "displayName": "%s",
          "description": "%s",
          "defaultCatalogKey": "default"
        }
        """
            .formatted(workspaceDisplayName, workspaceDisplayName);

    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.commandWithBody("workspace", "create", body)));
    assertStatus(response, 201);
    workspaceKey = extractWorkspaceKey(response);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION})
  public void testGetDefaultClusterCommand() {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("cluster", "get-default")));
    assertStatus(response, 200);
    JsonNode defaultCluster = clusterLikeNode(response, "defaultCluster", "default_cluster");
    requiredText(defaultCluster, "key");
    requiredText(defaultCluster, "displayName", "display_name");
    requiredText(defaultCluster, "state");
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION})
  public void testCreateClusterCommand() {
    clusterDisplayName = CLUSTER_NAME_PREFIX + runId;

    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "create", createClusterBody(clusterDisplayName), workspaceKey)));
    assertStatus(response, 202);

    JsonNode cluster = clusterNode(response);
    clusterKey = requiredText(cluster, "key");
    assertEquals(clusterDisplayName(cluster), clusterDisplayName);
    waitForClusterState("ACTIVE", CLUSTER_READY_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testCreateClusterCommand")
  public void testGetClusterCommand() {
    JsonNode response = getClusterResponse();
    JsonNode cluster = clusterNode(response);
    assertEquals(requiredText(cluster, "key"), clusterKey);
    assertEquals(clusterDisplayName(cluster), clusterDisplayName);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testCreateClusterCommand")
  public void testListClustersCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "cluster",
                    "list",
                    workspaceKey,
                    "--state",
                    "ACTIVE",
                    "--display-name",
                    clusterDisplayName,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(containsItemWithKey(collectionItems(response, "clusterCollection"), clusterKey));
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testCreateClusterCommand")
  public void testListClusterPermissionsCommand() {
    JsonNode response = listClusterPermissions();
    assertStatus(response, 200);
    assertCollectionItemsNode(response, "clusterPermissionCollection");
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testListClusterPermissionsCommand")
  public void testManageClusterPermissionCommand() {
    String target = config.clusterPermissionTarget();
    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "manage-permission", assignPermissionBody(target), workspaceKey, clusterKey)));
    assertStatusIn(assignResponse, 200, 202, 204);

    JsonNode revokeResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "manage-permission", revokePermissionBody(target), workspaceKey, clusterKey)));
    assertStatusIn(revokeResponse, 200, 202, 204);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testCreateClusterCommand")
  public void testListClusterLibrariesCommand() {
    JsonNode response = listClusterLibraries();
    assertStatus(response, 200);
    assertCollectionItemsNode(response, "clusterLibraryCollection");
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testListClusterLibrariesCommand")
  public void testPatchClusterLibraryCommand() {
    uploadTinyRequirementsFile();

    JsonNode installResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "patch-library", installLibraryBody(libraryPath), workspaceKey, clusterKey)));
    assertStatus(installResponse, 202);
    waitForLibraryInstalled(libraryPath, CLUSTER_TRANSITION_TIMEOUT);

    JsonNode uninstallResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "cluster", "patch-library", uninstallLibraryBody(libraryPath), workspaceKey, clusterKey)));
    assertStatus(uninstallResponse, 202);
    waitForLibraryRemovedOrInactive(libraryPath, CLUSTER_TRANSITION_TIMEOUT);
    waitForClusterState("ACTIVE", CLUSTER_TRANSITION_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testPatchClusterLibraryCommand")
  public void testStopClusterCommand() {
    JsonNode response =
        runWithConflictRetry(
            "stop cluster",
            () ->
                runner.run(
                    invocationBuilder.commandWithBody("cluster", "stop", "{}", workspaceKey, clusterKey)),
            CLUSTER_TRANSITION_TIMEOUT,
            202);
    assertStatus(response, 202);
    waitForClusterState("STOPPED", CLUSTER_TRANSITION_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testStopClusterCommand")
  public void testStartClusterCommand() {
    JsonNode response =
        runWithConflictRetry(
            "start cluster",
            () ->
                runner.run(
                    invocationBuilder.commandWithBody("cluster", "start", "{}", workspaceKey, clusterKey)),
            CLUSTER_TRANSITION_TIMEOUT,
            202);
    assertStatus(response, 202);
    waitForClusterState("ACTIVE", CLUSTER_TRANSITION_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testStartClusterCommand")
  public void testRestartClusterCommand() {
    JsonNode response =
        runWithConflictRetry(
            "restart cluster",
            () ->
                runner.run(
                    invocationBuilder.commandWithBody("cluster", "restart", "{}", workspaceKey, clusterKey)),
            CLUSTER_TRANSITION_TIMEOUT,
            202);
    assertStatus(response, 202);
    waitForClusterState("ACTIVE", CLUSTER_TRANSITION_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testRestartClusterCommand")
  public void testUpdateClusterCommand() {
    String updatedDisplayName = UPDATED_CLUSTER_NAME_PREFIX + System.currentTimeMillis();
    String updatedDescription = "Updated description for cluster CLI rel validation.";

    JsonNode response =
        runWithConflictRetry(
            "update cluster",
            () ->
                runner.run(
                    invocationBuilder.commandWithBody(
                        "cluster",
                        "update",
                        updateClusterBody(updatedDisplayName, updatedDescription),
                        workspaceKey,
                        clusterKey)),
            CLUSTER_TRANSITION_TIMEOUT,
            202);
    assertStatus(response, 202);
    waitForClusterState("ACTIVE", CLUSTER_TRANSITION_TIMEOUT);

    JsonNode updatedCluster = clusterNode(getClusterResponse());
    assertEquals(clusterDisplayName(updatedCluster), updatedDisplayName);
    assertEquals(requiredText(updatedCluster, "description"), updatedDescription);
    clusterDisplayName = updatedDisplayName;
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testUpdateClusterCommand")
  public void testSummarizeMetricsDataCommand() {
    JsonNode response =
        pollForSuccessfulResponse(
            "cluster metrics summary",
            OBSERVABILITY_TIMEOUT,
            () ->
                runner.run(
                    invocationBuilder.commandWithBody(
                        "cluster",
                        "summarize-metrics-data",
                        metricsBody(),
                        workspaceKey,
                        clusterKey)),
            node -> hasNonEmptyNamedArray(data(node), "results", "aggregatedDataPoints"));

    assertStatus(response, 200);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testSummarizeMetricsDataCommand")
  public void testSearchLogsCommand() {
    JsonNode response =
        pollForSuccessfulResponse(
            "cluster log search",
            OBSERVABILITY_TIMEOUT,
            () ->
                runner.run(
                    invocationBuilder.commandWithBody(
                        "cluster", "search-logs", logsBody(), workspaceKey, clusterKey, "--limit", "10")),
            node -> hasNonEmptyNamedArray(data(node), "items", "results"));

    assertStatus(response, 200);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testSearchLogsCommand")
  public void testDownloadLogsCommand() throws IOException {
    JsonNode response =
        pollForSuccessfulResponse(
            "cluster log download",
            OBSERVABILITY_TIMEOUT,
            () ->
                runner.run(
                    invocationBuilder.commandWithBody(
                        "cluster", "download-logs", logsBody(), workspaceKey, clusterKey)),
            node -> findLogParUrl(node) != null,
            200,
            202);

    assertStatusIn(response, 200, 202);
    String parUrl = findLogParUrl(response);
    assertNotNull(parUrl, "Download logs response did not contain a PAR URL: " + response);
    assertTrue(parUrl.startsWith("https://"), "Invalid log PAR URL: " + parUrl);
    validateDownloadedFile(parUrl);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION}, dependsOnMethods = "testDownloadLogsCommand")
  public void testDeleteClusterCommand() {
    JsonNode response =
        runWithConflictRetryAllowingErrorStatus(
            "delete cluster",
            () -> runner.run(invocationBuilder.command("cluster", "delete", workspaceKey, clusterKey)),
            CLUSTER_DELETE_TIMEOUT,
            204,
            405);
    assertStatusIn(response, 204, 405);
    if (hasStatus(response, 204)) {
      waitForClusterDeleted(CLUSTER_DELETE_TIMEOUT);
      clusterDeleted = true;
      return;
    }

    CliTestLogger.info(
        "TEST",
        "cluster delete returned 405 MethodNotAllowed in this environment; workspace cleanup will remove "
            + clusterKey);
  }

  @AfterClass(alwaysRun = true, groups = {GROUP_CLI_TESTS, GROUP_CLI_CLUSTER, GROUP_CLUSTER, GROUP_REL_VALIDATION})
  public void cleanup() {
    List<String> cleanupFailures = new ArrayList<>();
    String clusterCleanupFailure = null;
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
      fail("Cluster CLI rel validation cleanup failed: " + String.join("; ", cleanupFailures));
    }
  }

  private JsonNode getClusterResponse() {
    JsonNode response =
        assertSuccess(runner.run(invocationBuilder.command("cluster", "get", workspaceKey, clusterKey)));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode listClusterPermissions() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "cluster",
                    "list-permissions",
                    workspaceKey,
                    clusterKey,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode listClusterLibraries() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "cluster",
                    "list-libraries",
                    workspaceKey,
                    clusterKey,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));
    assertStatus(response, 200);
    return response;
  }

  private void uploadTinyRequirementsFile() {
    String folderPath = libraryPath.substring(0, libraryPath.lastIndexOf('/'));
    JsonNode folderResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "create",
                    "",
                    workspaceKey,
                    "--path",
                    folderPath,
                    "--type",
                    "FOLDER")));
    assertStatusIn(folderResponse, 200, 201, 202, 204);

    JsonNode fileResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace-object",
                    "create",
                    "requests==2.32.3\n",
                    workspaceKey,
                    "--path",
                    libraryPath,
                    "--type",
                    "FILE")));
    assertStatusIn(fileResponse, 200, 201, 202, 204);
  }

  private void waitForLibraryInstalled(String expectedPath, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastStatus = null;
    while (System.nanoTime() < deadline) {
      JsonNode response = listClusterLibraries();
      for (JsonNode item : collectionItems(response, "clusterLibraryCollection")) {
        if (!matchesLibrary(item, expectedPath)) {
          continue;
        }
        lastStatus = optionalText(item, "status", "lifecycleState", "lifecycle_state");
        if ("INSTALLED".equalsIgnoreCase(lastStatus)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(lastStatus)) {
          throw new AssertionError("Library install failed for " + expectedPath + ": " + item);
        }
      }
      sleep();
    }
    throw new AssertionError(
        "Library " + expectedPath + " was not installed within " + timeout + ". Last status=" + lastStatus);
  }

  private void waitForLibraryRemovedOrInactive(String expectedPath, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastStatus = null;
    JsonNode lastMatchedItem = null;
    while (System.nanoTime() < deadline) {
      JsonNode response = listClusterLibraries();
      boolean found = false;
      for (JsonNode item : collectionItems(response, "clusterLibraryCollection")) {
        if (!matchesLibrary(item, expectedPath)) {
          continue;
        }
        found = true;
        lastMatchedItem = item;
        lastStatus = optionalText(item, "status", "lifecycleState", "lifecycle_state");
        if (isRemovedLibraryStatus(lastStatus)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(lastStatus)) {
          throw new AssertionError("Library uninstall failed for " + expectedPath + ": " + item);
        }
      }
      if (!found) {
        return;
      }
      sleep();
    }
    throw new AssertionError(
        "Library "
            + expectedPath
            + " was not removed or inactive within "
            + timeout
            + ". Last status="
            + lastStatus
            + " last item="
            + lastMatchedItem);
  }

  private boolean matchesLibrary(JsonNode item, String expectedPath) {
    String name = optionalText(item, "name", "path", "displayName", "display_name");
    return (name != null && name.contains(expectedPath)) || item.toString().contains(expectedPath);
  }

  private boolean isRemovedLibraryStatus(String status) {
    if (status == null) {
      return false;
    }
    return switch (status.toUpperCase(Locale.ROOT)) {
      case "UNINSTALLED", "REMOVED", "NOT_INSTALLED", "DELETED" -> true;
      default -> false;
    };
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
      if (result.exitCode() == 0) {
        JsonNode cluster = clusterNode(responseJson(result));
        lastState = optionalText(cluster, "state", "lifecycleState", "lifecycle_state");
        if (expectedState.equalsIgnoreCase(lastState)) {
          return;
        }
        if ("FAILED".equalsIgnoreCase(lastState)) {
          throw new AssertionError("Cluster " + clusterKey + " reached FAILED state: " + cluster);
        }
      } else {
        lastOutput = result.combinedOutput();
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

  private void waitForClusterDeleted(Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("cluster", "get", workspaceKey, clusterKey));
      if (result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Cluster " + clusterKey + " was not deleted within " + timeout);
  }

  private void waitForWorkspaceDeleted(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workspace", "get", key));
      if (result.combinedOutput().contains("\"status\": 404")) {
        return;
      }
      sleep();
    }
    throw new AssertionError("Workspace " + key + " was not deleted within " + timeout);
  }

  private JsonNode pollForSuccessfulResponse(
      String description,
      Duration timeout,
      Supplier<CliCommandResult> command,
      Predicate<JsonNode> responsePredicate) {
    return pollForSuccessfulResponse(description, timeout, command, responsePredicate, 200);
  }

  private JsonNode pollForSuccessfulResponse(
      String description,
      Duration timeout,
      Supplier<CliCommandResult> command,
      Predicate<JsonNode> responsePredicate,
      int... acceptableStatuses) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = command.get();
      lastOutput = result.combinedOutput();
      if (result.exitCode() == 0) {
        lastResponse = responseJson(result);
        if (hasStatus(lastResponse, acceptableStatuses) && responsePredicate.test(lastResponse)) {
          return lastResponse;
        }
      }
      sleep();
    }
    throw new AssertionError(
        "Timed out waiting for "
            + description
            + ". Last response="
            + lastResponse
            + " last output="
            + lastOutput);
  }

  private JsonNode runWithConflictRetry(
      String description, Supplier<CliCommandResult> command, Duration timeout, int... acceptableStatuses) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = command.get();
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, acceptableStatuses)) {
        return lastResponse;
      }
      if (!hasStatus(lastResponse, 409)) {
        if (result.exitCode() == 0) {
          throw new AssertionError(
              "Unexpected status for " + description + ". Response=" + lastResponse + " output=" + lastOutput);
        }
        throw new AssertionError("Failed to " + description + ": " + lastOutput);
      }

      CliTestLogger.info(
          "WAIT",
          "Retrying "
              + description
              + " because the cluster has an in-progress operation. Last response="
              + lastResponse);
      sleep();
    }
    throw new AssertionError(
        "Timed out waiting to " + description + ". Last response=" + lastResponse + " last output=" + lastOutput);
  }

  private JsonNode runWithConflictRetryAllowingErrorStatus(
      String description, Supplier<CliCommandResult> command, Duration timeout, int... acceptableStatuses) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = command.get();
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (lastResponse != null && hasStatus(lastResponse, acceptableStatuses)) {
        return lastResponse;
      }
      if (!hasStatus(lastResponse, 409)) {
        if (result.exitCode() == 0) {
          throw new AssertionError(
              "Unexpected status for " + description + ". Response=" + lastResponse + " output=" + lastOutput);
        }
        throw new AssertionError("Failed to " + description + ": " + lastOutput);
      }

      CliTestLogger.info(
          "WAIT",
          "Retrying "
              + description
              + " because the cluster has an in-progress operation. Last response="
              + lastResponse);
      sleep();
    }
    throw new AssertionError(
        "Timed out waiting to " + description + ". Last response=" + lastResponse + " last output=" + lastOutput);
  }

  private void deleteClusterIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting cluster " + clusterKey);
    long deadline = System.nanoTime() + CLUSTER_DELETE_TIMEOUT.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("cluster", "delete", workspaceKey, clusterKey));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && hasStatus(lastResponse, 204, 404)) {
        if (hasStatus(lastResponse, 204)) {
          waitForClusterDeleted(CLUSTER_DELETE_TIMEOUT);
        }
        clusterDeleted = true;
        return;
      }
      if (hasStatus(lastResponse, 404) || lastOutput.contains("\"status\": 404")) {
        clusterDeleted = true;
        return;
      }
      if (hasStatus(lastResponse, 405)) {
        CliTestLogger.info(
            "CLEANUP",
            "cluster delete returned 405 MethodNotAllowed; workspace cleanup will remove " + clusterKey);
        return;
      }
      if (!hasStatus(lastResponse, 409)) {
        throw new AssertionError("Failed to delete cluster: " + lastOutput);
      }

      CliTestLogger.info(
          "CLEANUP",
          "Cluster delete hit an in-progress operation; retrying. Last response=" + lastResponse);
      sleep();
    }
    throw new AssertionError(
        "Timed out deleting cluster. Last response=" + lastResponse + " last output=" + lastOutput);
  }

  private void deleteWorkspaceIfPresent() {
    CliTestLogger.info("CLEANUP", "Deleting workspace " + workspaceKey);
    CliCommandResult result = runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
    if (result.exitCode() != 0 && !result.combinedOutput().contains("\"status\": 404")) {
      throw new AssertionError("Failed to delete workspace: " + result.combinedOutput());
    }
    if (result.exitCode() == 0) {
      JsonNode response = responseJson(result);
      assertStatusIn(response, 204, 404);
    }
    waitForWorkspaceDeleted(workspaceKey, WORKSPACE_DELETE_TIMEOUT);
    workspaceDeleted = true;
  }

  private JsonNode clusterNode(JsonNode response) {
    return clusterLikeNode(response, "cluster");
  }

  private JsonNode clusterLikeNode(JsonNode response, String... nestedNames) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, nestedNames);
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private void assertCollectionItemsNode(JsonNode response, String collectionName) {
    JsonNode items = collectionItemsNode(response, collectionName);
    assertTrue(
        items.isArray(),
        "Expected collection items array for " + collectionName + " in response: " + response);
  }

  private List<JsonNode> collectionItems(JsonNode response, String collectionName) {
    JsonNode items = collectionItemsNode(response, collectionName);
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private JsonNode collectionItemsNode(JsonNode response, String collectionName) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items =
          firstExisting(
                  responseData,
                  collectionName,
                  snakeCase(collectionName))
              .path("items");
    }

    return items;
  }

  private boolean containsItemWithKey(List<JsonNode> items, String key) {
    return items.stream().anyMatch(item -> key.equals(optionalText(item, "key")));
  }

  private boolean hasNonEmptyNamedArray(JsonNode node, String... fieldNames) {
    if (node == null || node.isMissingNode() || node.isNull()) {
      return false;
    }
    if (node.isObject()) {
      Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
      while (fields.hasNext()) {
        Map.Entry<String, JsonNode> field = fields.next();
        if (matchesAny(field.getKey(), fieldNames) && field.getValue().isArray() && field.getValue().size() > 0) {
          return true;
        }
        if (hasNonEmptyNamedArray(field.getValue(), fieldNames)) {
          return true;
        }
      }
    }
    if (node.isArray()) {
      for (JsonNode item : node) {
        if (hasNonEmptyNamedArray(item, fieldNames)) {
          return true;
        }
      }
    }
    return false;
  }

  private String findText(JsonNode node, String... fieldNames) {
    if (node == null || node.isMissingNode() || node.isNull()) {
      return null;
    }
    if (node.isObject()) {
      Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
      while (fields.hasNext()) {
        Map.Entry<String, JsonNode> field = fields.next();
        if (matchesAny(field.getKey(), fieldNames) && !field.getValue().isNull()) {
          String value = field.getValue().asText();
          if (!value.isBlank()) {
            return value;
          }
        }
        String nested = findText(field.getValue(), fieldNames);
        if (nested != null) {
          return nested;
        }
      }
    }
    if (node.isArray()) {
      for (JsonNode item : node) {
        String nested = findText(item, fieldNames);
        if (nested != null) {
          return nested;
        }
      }
    }
    return null;
  }

  private String findLogParUrl(JsonNode response) {
    return findText(
        response,
        "parUrl",
        "par_url",
        "datalakeClusterLogParUrl",
        "datalake_cluster_log_par_url",
        "datalake-cluster-log-par-url");
  }

  private boolean matchesAny(String value, String... candidates) {
    for (String candidate : candidates) {
      if (candidate.equals(value)) {
        return true;
      }
    }
    return false;
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

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private String clusterDisplayName(JsonNode cluster) {
    return requiredText(cluster, "displayName", "display_name");
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
            "sparkEnvVariables": {
              "envkey": "envvalue"
            }
          },
          "autoTerminationMinutes": 60
        }
        """
        .formatted(displayName, AMD_GENERIC, AMD_GENERIC, AMD_GENERIC, AMD_GENERIC);
  }

  private String updateClusterBody(String displayName, String description) {
    return """
        {
          "displayName": "%s",
          "description": "%s",
          "type": "USER",
          "clusterRuntimeConfig": {
            "type": "SPARK",
            "sparkVersion": "3.5.0"
          },
          "autoTerminationMinutes": 120
        }
        """
        .formatted(displayName, description);
  }

  private String assignPermissionBody(String target) {
    return """
        {
          "assignClusterPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["ADMIN"]
          }
        }
        """
        .formatted(target);
  }

  private String revokePermissionBody(String target) {
    return """
        {
          "revokeClusterPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["ADMIN"]
          }
        }
        """
        .formatted(target);
  }

  private String installLibraryBody(String path) {
    return """
        {
          "items": [
            {
              "operation": "INSTALL",
              "type": "WORKSPACE_FILE",
              "path": "%s"
            }
          ]
        }
        """
        .formatted(path);
  }

  private String uninstallLibraryBody(String path) {
    return """
        {
          "items": [
            {
              "operation": "UNINSTALL",
              "type": "WORKSPACE_FILE",
              "name": "%s"
            }
          ]
        }
        """
        .formatted(path);
  }

  private String metricsBody() {
    return """
        {
          "metricName": "%s",
          "aggregationType": "MEAN",
          "interval": "%s",
          "timeBegin": "%s",
          "timeEnd": "%s"
        }
        """
        .formatted(METRIC_CPU_UTILIZATION, AGGREGATION_INTERVAL, timeBegin(), timeEnd());
  }

  private String logsBody() {
    return """
        {
          "logContentTypeContains": "%s",
          "logStreamTypeContains": "%s",
          "logLevel": "%s",
          "timeBegin": "%s",
          "timeEnd": "%s"
        }
        """
        .formatted(LOG_CONTENT_TYPE_DRIVER, LOG_STREAM_TYPE_DRIVER, LOG_LEVEL_INFO, timeBegin(), timeEnd());
  }

  private String timeBegin() {
    return Instant.now().minus(Duration.ofHours(2)).toString();
  }

  private String timeEnd() {
    return Instant.now().toString();
  }

  private void validateDownloadedFile(String parUrl) throws IOException {
    URLConnection connection = new URL(parUrl).openConnection();
    connection.setConnectTimeout((int) Duration.ofSeconds(60).toMillis());
    connection.setReadTimeout((int) Duration.ofSeconds(60).toMillis());

    long downloadedBytes = 0;
    try (InputStream inputStream = connection.getInputStream()) {
      byte[] chunk = new byte[4096];
      int bytesRead;
      while ((bytesRead = inputStream.read(chunk)) != -1) {
        downloadedBytes += bytesRead;
      }
    }

    assertTrue(downloadedBytes > 0, "Downloaded log file from PAR URL was empty.");
  }

  private String snakeCase(String value) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < value.length(); i++) {
      char ch = value.charAt(i);
      if (Character.isUpperCase(ch) && i > 0) {
        builder.append('_');
      }
      builder.append(Character.toLowerCase(ch));
    }
    return builder.toString().toLowerCase(Locale.ROOT);
  }

  private void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException("Interrupted while waiting for cluster CLI validation.", e);
    }
  }
}
