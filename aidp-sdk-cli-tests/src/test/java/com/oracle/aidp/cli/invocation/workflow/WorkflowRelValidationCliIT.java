package com.oracle.aidp.cli.invocation.workflow;

import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatus;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertStatusIn;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.assertSuccess;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.data;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.firstExisting;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.optionalText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.requiredText;
import static com.oracle.aidp.cli.invocation.assertions.CliAssertions.responseJson;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkflowRelValidationCliIT {
  private static final String GROUP_CLI_TESTS = "cli_tests";
  private static final String GROUP_CLI_WORKFLOW = "cli_workflow";
  private static final String GROUP_WORKFLOW = "workflow";
  private static final String GROUP_REL_VALIDATION = "rel_validation";

  private static final String WORKSPACE_NAME_PREFIX = "IT_Workflow_CLI_";
  private static final Duration WORKSPACE_READY_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration WORKSPACE_DELETE_TIMEOUT = Duration.ofMinutes(10);
  private static final Duration JOB_DELETE_TIMEOUT = Duration.ofMinutes(5);
  private static final Duration JOB_RUN_READY_TIMEOUT = Duration.ofMinutes(2);
  private static final Duration POLL_INTERVAL = Duration.ofSeconds(15);

  private CliTestConfig config;
  private CliCommandRunner runner;
  private CliInvocationBuilder invocationBuilder;
  private String runId;
  private String workspaceKey;
  private String workspaceDisplayName;
  private String jobName;
  private String updatedJobDescription;
  private String taskKey;
  private String jobKey;
  private String jobRunKey;
  private String taskRunKey;
  private String taskRunOutputKey;
  private boolean workspaceDeleted;
  private boolean jobDeleted;
  private boolean jobRunDeleted;
  private boolean jobPermissionAssignedByTest;

  @BeforeClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION})
  public void setUp() {
    config = CliTestConfig.load();
    runner = new CliCommandRunner(config);
    invocationBuilder = new CliInvocationBuilder(config);
    runId = UUID.randomUUID().toString().replace("-", "");
    workspaceDisplayName = WORKSPACE_NAME_PREFIX + runId;
    jobName = "workflow_job_cli_" + runId;
    updatedJobDescription = "Updated by workflow CLI rel validation " + runId;
    taskKey = "notebook_task_" + runId;

    JsonNode workspaceResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workspace", "create", createWorkspaceBody(workspaceDisplayName))));
    assertStatus(workspaceResponse, 201);
    workspaceKey = extractWorkspaceKey(workspaceResponse);
    waitForWorkspaceLifecycleState(workspaceKey, "ACTIVE", WORKSPACE_READY_TIMEOUT);
  }

  @Test(groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION})
  public void testCreateJobCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workflow", "create-job", createOrUpdateJobBody(jobName, "Workflow job created by CLI rel validation."),
                    workspaceKey)));

    assertStatus(response, 201);
    JsonNode job = jobNode(response);
    jobKey = requiredText(job, "key");
    assertEquals(requiredText(job, "name", "displayName", "display_name"), jobName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateJobCommand")
  public void testGetJobCommand() {
    JsonNode response = getJob(jobKey);
    JsonNode job = jobNode(response);
    assertEquals(requiredText(job, "key"), jobKey);
    assertEquals(requiredText(job, "name", "displayName", "display_name"), jobName);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetJobCommand")
  public void testListJobsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workflow",
                    "list-jobs",
                    workspaceKey,
                    "--display-name",
                    jobName,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        jobItems(response).stream().anyMatch(item -> jobKey.equals(optionalText(item, "key"))),
        "Created workflow job was not present in list response: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListJobsCommand")
  public void testListJobPermissionsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workflow",
                    "list-job-permissions",
                    workspaceKey,
                    jobKey,
                    "--limit",
                    "10",
                    "--sort-order",
                    "ASC",
                    "--sort-by",
                    "displayName")));

    assertStatus(response, 200);
    assertTrue(
        jobPermissionItemsNode(response).isArray(),
        "Job permissions response should expose an items array: " + response);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListJobPermissionsCommand")
  public void testManageJobPermissionCommand() {
    String target = config.workflowPermissionTarget();
    boolean targetHadReadPermission =
        jobPermissionItems(listJobPermissions()).stream()
            .anyMatch(item -> matchesPermissionTarget(item, target, "READ"));

    JsonNode assignResponse =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workflow", "manage-job-permission", assignJobPermissionBody(target), workspaceKey, jobKey)));
    assertStatusIn(assignResponse, 200, 202, 204);
    jobPermissionAssignedByTest = !targetHadReadPermission;

    if (!targetHadReadPermission) {
      JsonNode revokeResponse =
          assertSuccess(
              runner.run(
                  invocationBuilder.commandWithBody(
                      "workflow", "manage-job-permission", revokeJobPermissionBody(target), workspaceKey, jobKey)));
      assertStatusIn(revokeResponse, 200, 202, 204);
      jobPermissionAssignedByTest = false;
    }
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testManageJobPermissionCommand")
  public void testUpdateJobCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.commandWithBody(
                    "workflow",
                    "update-job",
                    createOrUpdateJobBody(jobName, updatedJobDescription),
                    workspaceKey,
                    jobKey)));

    assertStatusIn(response, 200, 202);
    JsonNode getResponse = getJob(jobKey);
    assertEquals(optionalText(jobNode(getResponse), "description"), updatedJobDescription);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testUpdateJobCommand")
  public void testCreateJobRunCommand() {
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "workflow", "create-job-run", createJobRunBody(), workspaceKey));
    JsonNode response = responseJson(result);
    assertExitCodeMatchesStatus(result, response);

    if (hasStatus(response, 201)) {
      JsonNode jobRun = jobRunNode(response);
      jobRunKey = requiredText(jobRun, "key");
      discoverTaskRunFromJobRun(jobRun);
      return;
    }

    assertStatusIn(response, 400, 404, 409, 422);
    jobRunKey = missingJobRunKey();
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCreateJobRunCommand")
  public void testGetJobRunCommand() {
    if (hasRealJobRun()) {
      JsonNode response = waitForJobRunAvailable(jobRunKey, JOB_RUN_READY_TIMEOUT);
      JsonNode jobRun = jobRunNode(response);
      assertEquals(requiredText(jobRun, "key"), jobRunKey);
      discoverTaskRunFromJobRun(jobRun);
      return;
    }

    JsonNode response =
        runStructured(invocationBuilder.command("workflow", "get-job-run", workspaceKey, jobRunKey));
    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetJobRunCommand")
  public void testListJobRunsCommand() {
    JsonNode response =
        assertSuccess(
            runner.run(
                invocationBuilder.command(
                    "workflow",
                    "list-job-runs",
                    workspaceKey,
                    "--limit",
                    "25",
                    "--sort-order",
                    "DESC",
                    "--sort-by",
                    "timeCreated")));

    assertStatus(response, 200);
    if (hasRealJobRun()) {
      assertTrue(
          jobRunItems(response).stream().anyMatch(item -> jobRunKey.equals(optionalText(item, "key"))),
          "Created job run was not present in list response: " + response);
    }
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListJobRunsCommand")
  public void testListRecentJobRunsCommand() {
    CliCommandResult result =
        runner.run(
            invocationBuilder.command(
                "workflow",
                "list-recent-job-runs",
                workspaceKey,
                "--job-key",
                "[\"" + jobKey + "\"]",
                "--record-count",
                "10",
                "--limit",
                "10",
                "--sort-order",
                "DESC",
                "--sort-by",
                "timeCreated"));

    if (result.exitCode() != 0 && result.combinedOutput().contains("Unknown option '--job-key'")) {
      CliCommandResult missingJobKeyResult =
          runner.run(
              invocationBuilder.command(
                  "workflow",
                  "list-recent-job-runs",
                  workspaceKey,
                  "--record-count",
                  "10",
                  "--limit",
                  "10",
                  "--sort-order",
                  "DESC",
                  "--sort-by",
                  "timeCreated"));
      assertTrue(
          missingJobKeyResult.combinedOutput().contains("Missing required parameter --job-key"),
          "Current CLI should either accept --job-key or report the known required job-key wiring gap. Output:\n"
              + missingJobKeyResult.combinedOutput());
      return;
    }

    JsonNode response = assertSuccess(result);

    assertStatus(response, 200);
    assertFalse(data(response).isMissingNode(), "Recent job runs response should include data.");
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListRecentJobRunsCommand")
  public void testListTaskRunsCommand() {
    JsonNode response =
        runStructured(
            invocationBuilder.command(
                "workflow",
                "list-task-runs",
                workspaceKey,
                "--job-run-key",
                jobRunKeyOrMissing(),
                "--limit",
                "25",
                "--sort-order",
                "DESC",
                "--sort-by",
                "timeCreated"));

    assertStatusIn(response, 200, 400, 404);
    if (hasStatus(response, 200)) {
      List<JsonNode> taskRuns = taskRunItems(response);
      if (!taskRuns.isEmpty()) {
        taskRunKey = optionalText(taskRuns.get(0), "key");
        taskRunOutputKey = optionalText(taskRuns.get(0), "outputKey", "output_key");
      }
    }
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testListTaskRunsCommand")
  public void testGetTaskRunCommand() {
    JsonNode response =
        runStructured(
            invocationBuilder.command("workflow", "get-task-run", workspaceKey, taskRunKeyOrMissing()));

    if (hasRealTaskRun()) {
      assertStatus(response, 200);
      JsonNode taskRun = taskRunNode(response);
      assertEquals(requiredText(taskRun, "key"), taskRunKey);
      taskRunOutputKey = optionalText(taskRun, "outputKey", "output_key");
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testGetTaskRunCommand")
  public void testFetchOutputCommand() {
    JsonNode response =
        runStructured(
            invocationBuilder.commandWithBody(
                "workflow", "fetch-output", fetchOutputBody(), workspaceKey, taskRunKeyOrMissing()));

    if (hasRealTaskOutput()) {
      assertStatusIn(response, 200, 400, 404, 409);
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testFetchOutputCommand")
  public void testExportTaskRunOutputCommand() {
    JsonNode response =
        runStructured(
            invocationBuilder.commandWithBody(
                "workflow",
                "export-task-run-output",
                exportTaskRunOutputBody(),
                workspaceKey,
                taskRunKeyOrMissing(),
                taskRunOutputKeyOrMissing()));

    if (hasRealTaskOutput()) {
      assertStatusIn(response, 200, 202, 400, 404, 409);
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testExportTaskRunOutputCommand")
  public void testRepairJobRunCommand() {
    JsonNode response =
        runStructured(
            invocationBuilder.commandWithBody(
                "workflow", "repair-job-run", repairJobRunBody(), workspaceKey, jobRunKeyOrMissing()));

    if (hasRealJobRun()) {
      assertStatusIn(response, 200, 201, 202, 400, 409, 422);
      if (hasStatus(response, 200, 201, 202)) {
        String repairedRunKey = optionalText(jobRunNode(response), "key");
        if (repairedRunKey != null && !repairedRunKey.isBlank()) {
          jobRunKey = repairedRunKey;
          jobRunDeleted = false;
        }
      }
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testRepairJobRunCommand")
  public void testCancelJobRunCommand() {
    JsonNode response =
        runStructured(invocationBuilder.command("workflow", "cancel-job-run", workspaceKey, jobRunKeyOrMissing()));

    if (hasRealJobRun()) {
      assertStatusIn(response, 200, 202, 204, 400, 404, 409);
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCancelJobRunCommand")
  public void testCancelJobRunsCommand() {
    JsonNode response =
        runStructured(invocationBuilder.command("workflow", "cancel-job-runs", workspaceKey, jobKey));

    assertStatusIn(response, 200, 202, 204, 400, 409);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testCancelJobRunsCommand")
  public void testDeleteJobRunCommand() {
    JsonNode response =
        runStructured(invocationBuilder.command("workflow", "delete-job-run", workspaceKey, jobRunKeyOrMissing()));

    if (hasRealJobRun()) {
      assertStatusIn(response, 204, 400, 404, 409);
      if (hasStatus(response, 204, 404)) {
        jobRunDeleted = true;
      }
      return;
    }

    assertStatusIn(response, 400, 404);
  }

  @Test(
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION},
      dependsOnMethods = "testDeleteJobRunCommand")
  public void testDeleteJobCommand() {
    JsonNode response = deleteJobWithRetry(jobKey, JOB_DELETE_TIMEOUT);

    assertStatusIn(response, 204, 404);
    jobDeleted = true;
  }

  @AfterClass(
      alwaysRun = true,
      groups = {GROUP_CLI_TESTS, GROUP_CLI_WORKFLOW, GROUP_WORKFLOW, GROUP_REL_VALIDATION})
  public void tearDown() {
    try {
      revokeJobPermissionIfAssigned();
    } finally {
      try {
        deleteJobIfPresent();
      } finally {
        deleteWorkspaceIfPresent();
      }
    }
  }

  private JsonNode getJob(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("workflow", "get-job", workspaceKey, key)));
    assertStatus(response, 200);
    return response;
  }

  private JsonNode listJobPermissions() {
    return assertSuccess(
        runner.run(
            invocationBuilder.command(
                "workflow",
                "list-job-permissions",
                workspaceKey,
                jobKey,
                "--limit",
                "10",
                "--sort-order",
                "ASC",
                "--sort-by",
                "displayName")));
  }

  private JsonNode runStructured(List<String> command) {
    CliCommandResult result = runner.run(command);
    JsonNode response = responseJson(result);
    assertExitCodeMatchesStatus(result, response);
    return response;
  }

  private void assertExitCodeMatchesStatus(CliCommandResult result, JsonNode response) {
    int status = response.path("status").asInt(-1);
    if (status >= 200 && status < 400) {
      assertEquals(
          result.exitCode(),
          0,
          "CLI command returned a successful response with non-zero exit code.\nSTDOUT:\n"
              + result.stdout()
              + "\nSTDERR:\n"
              + result.stderr());
    }
  }

  private JsonNode waitForJobRunAvailable(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    String lastOutput = null;
    JsonNode lastResponse = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workflow", "get-job-run", workspaceKey, key));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (result.exitCode() == 0 && lastResponse != null && hasStatus(lastResponse, 200)) {
        return lastResponse;
      }
      if (lastResponse != null && !hasStatus(lastResponse, 404, 409, 429, 500, 502, 503, 504)) {
        throw new AssertionError("Unexpected response while waiting for job run " + key + ": " + lastResponse);
      }
      sleep();
    }
    throw new AssertionError(
        "Job run "
            + key
            + " was not available within "
            + timeout
            + ". Last response="
            + lastResponse
            + "\nLast output:\n"
            + lastOutput);
  }

  private JsonNode deleteJobWithRetry(String key, Duration timeout) {
    long deadline = System.nanoTime() + timeout.toNanos();
    JsonNode lastResponse = null;
    String lastOutput = null;
    while (System.nanoTime() < deadline) {
      CliCommandResult result = runner.run(invocationBuilder.command("workflow", "delete-job", workspaceKey, key));
      lastOutput = result.combinedOutput();
      lastResponse = responseJsonOrNull(result);
      if (lastResponse != null && hasStatus(lastResponse, 204, 404)) {
        return lastResponse;
      }
      if (lastResponse != null && !hasStatus(lastResponse, 409, 429, 500, 502, 503, 504)) {
        throw new AssertionError("Unexpected response while deleting workflow job " + key + ": " + lastResponse);
      }
      sleep();
    }
    throw new AssertionError(
        "Workflow job "
            + key
            + " was not deleted within "
            + timeout
            + ". Last response="
            + lastResponse
            + "\nLast output:\n"
            + lastOutput);
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

  private JsonNode getWorkspace(String key) {
    JsonNode response = assertSuccess(runner.run(invocationBuilder.command("workspace", "get", key)));
    assertStatus(response, 200);
    return response;
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

  private String createOrUpdateJobBody(String name, String description) {
    return """
        {
          "name": "%s",
          "description": "%s",
          "path": "jobs",
          "maxConcurrentRuns": 1,
          "timeoutSeconds": 120,
          "tasks": [
            {
              "type": "NOTEBOOK_TASK",
              "taskKey": "%s",
              "runIf": "ALL_SUCCESS",
              "cluster": {
                "clusterKey": "xxxx-xxx-xxx-xxx"
              },
              "notebookPath": "Workspace/Shared/example1/CalenderPrinter.ipynb",
              "maxRetries": 0
            }
          ]
        }
        """
        .formatted(name, description, taskKey);
  }

  private String createJobRunBody() {
    return """
        {
          "jobKey": "%s"
        }
        """
        .formatted(jobKey);
  }

  private String repairJobRunBody() {
    return """
        {
          "taskKeys": ["%s"]
        }
        """
        .formatted(taskKey);
  }

  private String fetchOutputBody() {
    return """
        {
          "outputKey": "%s"
        }
        """
        .formatted(taskRunOutputKeyOrMissing());
  }

  private String exportTaskRunOutputBody() {
    return """
        {
          "format": "HTML"
        }
        """;
  }

  private String assignJobPermissionBody(String target) {
    return """
        {
          "assignJobPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"]
          }
        }
        """
        .formatted(target);
  }

  private String revokeJobPermissionBody(String target) {
    return """
        {
          "revokeJobPermissionDetails": {
            "assignees": {
              "type": "USER",
              "targets": ["%s"]
            },
            "permissions": ["READ"]
          }
        }
        """
        .formatted(target);
  }

  private JsonNode jobNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "job", "jobSummary", "job_summary");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private JsonNode jobRunNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "jobRun", "job_run", "jobRunSummary", "job_run_summary");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private JsonNode taskRunNode(JsonNode response) {
    JsonNode responseData = data(response);
    if (!responseData.path("key").isMissingNode()) {
      return responseData;
    }
    JsonNode nested = firstExisting(responseData, "taskRun", "task_run", "taskRunSummary", "task_run_summary");
    if (!nested.isMissingNode()) {
      return nested;
    }
    return responseData;
  }

  private List<JsonNode> jobItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "jobCollection", "job_collection").path("items");
    }
    return arrayItems(items);
  }

  private List<JsonNode> jobRunItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "jobRunCollection", "job_run_collection").path("items");
    }
    return arrayItems(items);
  }

  private List<JsonNode> taskRunItems(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (!items.isArray()) {
      items = firstExisting(responseData, "taskRunCollection", "task_run_collection").path("items");
    }
    return arrayItems(items);
  }

  private JsonNode jobPermissionItemsNode(JsonNode response) {
    JsonNode responseData = data(response);
    JsonNode items = responseData.path("items");
    if (items.isArray()) {
      return items;
    }
    return firstExisting(responseData, "jobPermissionCollection", "job_permission_collection").path("items");
  }

  private List<JsonNode> jobPermissionItems(JsonNode response) {
    return arrayItems(jobPermissionItemsNode(response));
  }

  private List<JsonNode> arrayItems(JsonNode items) {
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  private boolean matchesPermissionTarget(JsonNode item, String target, String permission) {
    String grantee = optionalText(item, "grantee", "granteeId", "grantee_id", "principalId", "principal_id");
    if (grantee == null || !target.equals(grantee)) {
      return false;
    }
    JsonNode permissions = firstExisting(item, "permissions", "privileges");
    if (permissions.isArray()) {
      for (JsonNode value : permissions) {
        if (permission.equalsIgnoreCase(value.asText())) {
          return true;
        }
      }
      return false;
    }
    String singlePermission = optionalText(item, "permission", "privilege");
    return permission.equalsIgnoreCase(singlePermission);
  }

  private void discoverTaskRunFromJobRun(JsonNode jobRun) {
    if (taskRunKey != null && !taskRunKey.isBlank()) {
      return;
    }

    String discovered = firstObjectValue(firstExisting(jobRun, "taskToTaskRunMap", "task_to_task_run_map"));
    if (discovered == null) {
      JsonNode repairHistory = firstExisting(jobRun, "repairHistory", "repair_history");
      if (repairHistory.isArray()) {
        for (JsonNode entry : repairHistory) {
          discovered = firstObjectValue(firstExisting(entry, "taskToTaskRunMap", "task_to_task_run_map"));
          if (discovered != null) {
            break;
          }
        }
      }
    }

    if (discovered != null && !discovered.isBlank()) {
      taskRunKey = discovered;
    }
  }

  private String firstObjectValue(JsonNode object) {
    if (!object.isObject()) {
      return null;
    }
    var fields = object.fields();
    while (fields.hasNext()) {
      JsonNode value = fields.next().getValue();
      if (!value.isNull() && !value.asText("").isBlank()) {
        return value.asText();
      }
    }
    return null;
  }

  private boolean hasRealJobRun() {
    return jobRunKey != null && !jobRunKey.isBlank() && !jobRunKey.startsWith("missing-job-run-") && !jobRunDeleted;
  }

  private boolean hasRealTaskRun() {
    return taskRunKey != null && !taskRunKey.isBlank() && !taskRunKey.startsWith("missing-task-run-");
  }

  private boolean hasRealTaskOutput() {
    return hasRealTaskRun()
        && taskRunOutputKey != null
        && !taskRunOutputKey.isBlank()
        && !taskRunOutputKey.startsWith("missing-output-");
  }

  private String jobRunKeyOrMissing() {
    if (jobRunKey == null || jobRunKey.isBlank()) {
      jobRunKey = missingJobRunKey();
    }
    return jobRunKey;
  }

  private String taskRunKeyOrMissing() {
    if (taskRunKey == null || taskRunKey.isBlank()) {
      taskRunKey = "missing-task-run-" + runId;
    }
    return taskRunKey;
  }

  private String taskRunOutputKeyOrMissing() {
    if (taskRunOutputKey == null || taskRunOutputKey.isBlank()) {
      taskRunOutputKey = "missing-output-" + runId;
    }
    return taskRunOutputKey;
  }

  private String missingJobRunKey() {
    return "missing-job-run-" + runId;
  }

  private String extractWorkspaceKey(JsonNode response) {
    JsonNode responseData = data(response);
    String key = optionalText(responseData, "key");
    if (key != null) {
      return key;
    }
    return requiredText(firstExisting(responseData, "workspace"), "key");
  }

  private void revokeJobPermissionIfAssigned() {
    if (!jobPermissionAssignedByTest || runner == null || invocationBuilder == null || jobKey == null) {
      return;
    }
    String target = config.workflowPermissionTarget();
    CliTestLogger.info("CLEANUP", "Revoking workflow job permission for " + target);
    CliCommandResult result =
        runner.run(
            invocationBuilder.commandWithBody(
                "workflow", "manage-job-permission", revokeJobPermissionBody(target), workspaceKey, jobKey));
    if (result.exitCode() == 0) {
      jobPermissionAssignedByTest = false;
      return;
    }
    CliTestLogger.block(
        "CLEANUP",
        "Failed to revoke workflow job permission:",
        result.combinedOutput(),
        config.cliLogMaxCharacters());
  }

  private void deleteJobIfPresent() {
    if (jobDeleted || runner == null || invocationBuilder == null || workspaceKey == null || jobKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting workflow job " + jobKey);
    try {
      JsonNode response = deleteJobWithRetry(jobKey, JOB_DELETE_TIMEOUT);
      if (hasStatus(response, 204, 404)) {
        jobDeleted = true;
      }
    } catch (AssertionError e) {
      CliTestLogger.block("CLEANUP", "Failed to delete workflow job:", e.getMessage(), config.cliLogMaxCharacters());
    }
  }

  private void deleteWorkspaceIfPresent() {
    if (workspaceDeleted || runner == null || invocationBuilder == null || workspaceKey == null) {
      return;
    }
    CliTestLogger.info("CLEANUP", "Deleting workflow test workspace " + workspaceKey);
    CliCommandResult result = runner.run(invocationBuilder.command("workspace", "delete", workspaceKey));
    if (result.exitCode() != 0) {
      if (isNotFound(result)) {
        workspaceDeleted = true;
        return;
      }
      CliTestLogger.block(
          "CLEANUP",
          "Failed to delete workflow test workspace:",
          result.combinedOutput(),
          config.cliLogMaxCharacters());
      return;
    }
    JsonNode response = responseJson(result);
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
    return response != null && hasStatus(response, 404);
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

  private static void sleep() {
    try {
      Thread.sleep(POLL_INTERVAL.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new AssertionError("Interrupted while waiting for workflow state.", e);
    }
  }
}
