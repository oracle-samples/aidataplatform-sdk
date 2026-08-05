package com.oracle.aidp.sdk.workflowjobrun;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidp.sdk.support.SdkTestSupport;
import com.oracle.aidataplatform.dp.ClusterClient;
import com.oracle.aidataplatform.dp.WorkflowClient;
import com.oracle.aidataplatform.dp.model.AssignJobPermissionDetails;
import com.oracle.aidataplatform.dp.model.CreateJobDetails;
import com.oracle.aidataplatform.dp.model.CreateJobRunDetails;
import com.oracle.aidataplatform.dp.model.Expression;
import com.oracle.aidataplatform.dp.model.ExportTaskRunOutputDetails;
import com.oracle.aidataplatform.dp.model.FetchOutputDetails;
import com.oracle.aidataplatform.dp.model.GranteeType;
import com.oracle.aidataplatform.dp.model.IfElseTask;
import com.oracle.aidataplatform.dp.model.JobPrivilege;
import com.oracle.aidataplatform.dp.model.JobRun;
import com.oracle.aidataplatform.dp.model.ManageJobPermissionDetails;
import com.oracle.aidataplatform.dp.model.PermissionAssignees;
import com.oracle.aidataplatform.dp.model.RepairJobRunDetails;
import com.oracle.aidataplatform.dp.model.SortOrder;
import com.oracle.aidataplatform.dp.model.Task;
import com.oracle.aidataplatform.dp.model.TaskRunOutput;
import com.oracle.aidataplatform.dp.model.UpdateJobDetails;
import com.oracle.aidataplatform.dp.requests.CancelJobRunRequest;
import com.oracle.aidataplatform.dp.requests.CancelJobRunsRequest;
import com.oracle.aidataplatform.dp.requests.CreateJobRequest;
import com.oracle.aidataplatform.dp.requests.CreateJobRunRequest;
import com.oracle.aidataplatform.dp.requests.DeleteJobRequest;
import com.oracle.aidataplatform.dp.requests.DeleteJobRunRequest;
import com.oracle.aidataplatform.dp.requests.ExportTaskRunOutputRequest;
import com.oracle.aidataplatform.dp.requests.FetchOutputRequest;
import com.oracle.aidataplatform.dp.requests.GetJobRequest;
import com.oracle.aidataplatform.dp.requests.GetJobRunRequest;
import com.oracle.aidataplatform.dp.requests.GetTaskRunRequest;
import com.oracle.aidataplatform.dp.requests.ListJobPermissionsRequest;
import com.oracle.aidataplatform.dp.requests.ListJobRunsRequest;
import com.oracle.aidataplatform.dp.requests.ListJobsRequest;
import com.oracle.aidataplatform.dp.requests.ListRecentJobRunsRequest;
import com.oracle.aidataplatform.dp.requests.ListTaskRunsRequest;
import com.oracle.aidataplatform.dp.requests.ManageJobPermissionRequest;
import com.oracle.aidataplatform.dp.requests.RepairJobRunRequest;
import com.oracle.aidataplatform.dp.requests.UpdateJobRequest;
import com.oracle.aidataplatform.dp.responses.CancelJobRunResponse;
import com.oracle.aidataplatform.dp.responses.CancelJobRunsResponse;
import com.oracle.aidataplatform.dp.responses.CreateJobResponse;
import com.oracle.aidataplatform.dp.responses.CreateJobRunResponse;
import com.oracle.aidataplatform.dp.responses.DeleteJobResponse;
import com.oracle.aidataplatform.dp.responses.DeleteJobRunResponse;
import com.oracle.aidataplatform.dp.responses.ExportTaskRunOutputResponse;
import com.oracle.aidataplatform.dp.responses.FetchOutputResponse;
import com.oracle.aidataplatform.dp.responses.GetJobResponse;
import com.oracle.aidataplatform.dp.responses.GetJobRunResponse;
import com.oracle.aidataplatform.dp.responses.GetTaskRunResponse;
import com.oracle.aidataplatform.dp.responses.ListJobPermissionsResponse;
import com.oracle.aidataplatform.dp.responses.ListJobRunsResponse;
import com.oracle.aidataplatform.dp.responses.ListJobsResponse;
import com.oracle.aidataplatform.dp.responses.ListRecentJobRunsResponse;
import com.oracle.aidataplatform.dp.responses.ListTaskRunsResponse;
import com.oracle.aidataplatform.dp.responses.ManageJobPermissionResponse;
import com.oracle.aidataplatform.dp.responses.RepairJobRunResponse;
import com.oracle.aidataplatform.dp.responses.UpdateJobResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkflowJobRunSdkIT {
  private SdkTestConfig config;
  private WorkflowClient workflowClient;
  private String aiDataPlatformId;
  private String workspaceKey;
  private String createdJobKey;
  private String createdJobRunKey;
  private String discoveredTaskRunKey;
  private String discoveredTaskRunOutputKey;
  private boolean createdJobDeleted;
  private boolean createdJobRunDeleted;

  @BeforeClass(alwaysRun = true, groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    aiDataPlatformId = config.value("aidpInstanceId", config.required("dataHubId"));
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    ClusterClient clusterClient = SdkClients.clusterClient(config);
    try {
      SdkTestResources.ensureActiveSharedCluster(config, workspaceKey, clusterClient);
    } finally {
      clusterClient.close();
    }
    assertFalse(aiDataPlatformId.isBlank(), "aiDataPlatformId must be configured");
    assertFalse(workspaceKey == null || workspaceKey.isBlank(), "SDK_Test_WS workspace must be available");
    workflowClient = SdkClients.workflowClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 5)
  public void createJob() {
    CreateJobResponse response =
        workflowClient.createJob(
            CreateJobRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .createJobDetails(createJobDetails())
                .opcRetryToken(
                    firstNonBlank(
                        config.value("createJobRetryToken", ""),
                        "workflow-create-job-it-" + UUID.randomUUID()))
                .shouldUpdateRecent(optionalBoolean("createJobShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-create-job"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (response.getJob() != null) {
      createdJobKey = response.getJob().getKey();
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 6)
  public void getJobDetails() {
    String jobKey = firstNonBlank(config.value("getJobDetailsJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for getJobDetails");
    }

    GetJobResponse response =
        workflowClient.getJob(
            GetJobRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .shouldUpdateRecent(optionalBoolean("getJobDetailsShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-get-job"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJob(), "job should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 7)
  public void getJobPermissions() {
    String jobKey = firstNonBlank(config.value("getJobPermissionsJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for getJobPermissions");
    }

    ListJobPermissionsResponse response =
        workflowClient.listJobPermissions(
            ListJobPermissionsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .limit(parsePositiveInt(config.value("getJobPermissionsLimit", "50"), "getJobPermissionsLimit"))
                .page(blankToNull(config.value("getJobPermissionsPage", "")))
                .sortBy(jobPermissionSortBy(config.value("getJobPermissionsSortBy", "")))
                .sortOrder(sortOrder(config.value("getJobPermissionsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-job-perms"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJobPermissionCollection(), "permission collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 8)
  public void createJobRun() {
    String jobKey = firstNonBlank(config.value("createJobRunJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for createJobRun");
    }

    CreateJobRunResponse response =
        workflowClient.createJobRun(
            CreateJobRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .createJobRunDetails(CreateJobRunDetails.builder().jobKey(jobKey).build())
                .opcRetryToken(
                    firstNonBlank(
                        config.value("createJobRunRetryToken", ""),
                        "workflow-create-run-it-" + UUID.randomUUID()))
                .shouldUpdateRecent(optionalBoolean("createJobRunShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-create-run"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    JobRun jobRun = response.getJobRun();
    if (jobRun != null) {
      createdJobRunKey = jobRun.getKey();
      discoveredTaskRunKey = firstNonBlank(discoveredTaskRunKey, firstTaskRunKey(jobRun));
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 9)
  public void getJobRunDetails() {
    String jobRunKey = firstNonBlank(config.value("getJobRunDetailsJobRunKey", ""), createdJobRunKey);
    if (isBlank(jobRunKey)) {
      throw new SkipException("No job run key available for getJobRunDetails");
    }

    GetJobRunResponse response =
        workflowClient.getJobRun(
            GetJobRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobRunKey(jobRunKey)
                .shouldUpdateRecent(optionalBoolean("getJobRunDetailsShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-get-run"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJobRun(), "job run should be present");
    discoveredTaskRunKey = firstNonBlank(discoveredTaskRunKey, firstTaskRunKey(response.getJobRun()));
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 10)
  public void cancelJobRun() {
    String jobRunKey = firstNonBlank(config.value("cancelJobRunJobRunKey", ""), createdJobRunKey);
    if (isBlank(jobRunKey)) {
      throw new SkipException("No job run key available for cancelJobRun");
    }

    CancelJobRunResponse response =
        workflowClient.cancelJobRun(
            CancelJobRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobRunKey(jobRunKey)
                .ifMatch(blankToNull(config.value("cancelJobRunIfMatch", "")))
                .opcRetryToken(blankToNull(config.value("cancelJobRunRetryToken", "")))
                .shouldUpdateRecent(optionalBoolean("cancelJobRunShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-cancel-run"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 11)
  public void updateJob() {
    String jobKey = firstNonBlank(config.value("updateJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for updateJob");
    }

    UpdateJobResponse response =
        workflowClient.updateJob(
            UpdateJobRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .updateJobDetails(updateJobDetails())
                .ifMatch(blankToNull(config.value("updateJobIfMatch", "")))
                .shouldUpdateRecent(optionalBoolean("updateJobShouldUpdateRecent"))
                .opcRequestId(SdkTestSupport.requestId("workflow-update-job"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 12)
  public void manageJobPermission() {
    String jobKey = firstNonBlank(config.value("manageJobPermissionJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for manageJobPermission");
    }
    String assignee = permissionTarget("manageJobPermissionDefaultAssignee");
    if (isBlank(assignee)) {
      throw new SkipException(
          "Set manageJobPermissionDefaultAssignee or sdkWorkspacePermissionTarget to run manageJobPermission");
    }

    ManageJobPermissionResponse response =
        workflowClient.manageJobPermission(
            ManageJobPermissionRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .manageJobPermissionDetails(manageJobPermissionDetails(assignee))
                .ifMatch(blankToNull(config.value("manageJobPermissionIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-manage-perm"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 13)
  public void repairJobRun() {
    String jobRunKey = firstNonBlank(config.value("repairJobRunJobRunKey", ""), createdJobRunKey, "missing-job-run");
    try {
      RepairJobRunResponse response =
          workflowClient.repairJobRun(
              RepairJobRunRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .jobRunKey(jobRunKey)
                  .repairJobRunDetails(repairJobRunDetails())
                  .opcRetryToken(blankToNull(config.value("repairJobRunRetryToken", "")))
                  .ifMatch(blankToNull(config.value("repairJobRunIfMatch", "")))
                  .shouldUpdateRecent(optionalBoolean("repairJobRunShouldUpdateRecent"))
                  .opcRequestId(SdkTestSupport.requestId("workflow-repair-run"))
                  .build());
      SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
      assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    } catch (BmcException e) {
      assertAllowedLiveWorkflowState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 14)
  public void listJobs() {
    ListJobsResponse response =
        workflowClient.listJobs(
            ListJobsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .displayName(blankToNull(config.value("listJobsDisplayName", "")))
                .displayNameContains(blankToNull(config.value("listJobsDisplayNameContains", "")))
                .path(blankToNull(config.value("listJobsPath", "")))
                .createdBy(blankToNull(config.value("listJobsCreatedBy", "")))
                .updatedBy(blankToNull(config.value("listJobsUpdatedBy", "")))
                .limit(parsePositiveInt(config.value("listJobsLimit", "50"), "listJobsLimit"))
                .page(blankToNull(config.value("listJobsPage", "")))
                .sortBy(jobSortBy(config.value("listJobsSortBy", "")))
                .sortOrder(sortOrder(config.value("listJobsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-list-jobs"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJobCollection(), "job collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 15)
  public void listJobRuns() {
    ListJobRunsResponse response =
        workflowClient.listJobRuns(
            ListJobRunsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .displayName(blankToNull(config.value("listJobRunsDisplayName", "")))
                .jobKey(csvWithDefault(config.value("listJobRunsJobKeysCsv", ""), createdJobKey))
                .status(jobRunStatuses(config.value("listJobRunsStatusesCsv", "")))
                .timeCreatedGreaterThanOrEqualTo(
                    optionalDate(config.value("listJobRunsTimeCreatedGreaterThanOrEqualTo", "")))
                .timeCreatedLessThanOrEqualTo(
                    optionalDate(config.value("listJobRunsTimeCreatedLessThanOrEqualTo", "")))
                .limit(parsePositiveInt(config.value("listJobRunsLimit", "25"), "listJobRunsLimit"))
                .page(blankToNull(config.value("listJobRunsPage", "")))
                .sortBy(jobRunSortBy(config.value("listJobRunsSortBy", "")))
                .sortOrder(sortOrder(config.value("listJobRunsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-list-runs"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJobRunCollection(), "job run collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 16)
  public void getLatestJobRuns() {
    List<String> jobKeys =
        csvWithDefault(config.value("getLatestJobRunsJobKeysCsv", ""), createdJobKey);
    if (jobKeys == null || jobKeys.isEmpty()) {
      throw new SkipException("No job keys available for getLatestJobRuns");
    }

    ListRecentJobRunsResponse response =
        workflowClient.listRecentJobRuns(
            ListRecentJobRunsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKeys)
                .recordCount(optionalInt(config.value("getLatestJobRunsRecordCount", "")))
                .limit(parsePositiveInt(config.value("getLatestJobRunsLimit", "25"), "getLatestJobRunsLimit"))
                .page(blankToNull(config.value("getLatestJobRunsPage", "")))
                .sortBy(recentJobRunSortBy(config.value("getLatestJobRunsSortBy", "")))
                .sortOrder(sortOrder(config.value("getLatestJobRunsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-latest-runs"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getJobRunCollection(), "recent job run collection should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 17)
  public void listTaskRuns() {
    String jobRunKey = firstNonBlank(config.value("listTaskRunsJobRunKey", ""), createdJobRunKey);
    if (isBlank(jobRunKey)
        && isBlank(config.value("listTaskRunsParentJobRunKey", ""))
        && isBlank(config.value("listTaskRunsRootJobRunKey", ""))) {
      throw new SkipException("No job run key available for listTaskRuns");
    }

    ListTaskRunsResponse response =
        workflowClient.listTaskRuns(
            ListTaskRunsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobRunKey(blankToNull(jobRunKey))
                .displayName(blankToNull(config.value("listTaskRunsDisplayName", "")))
                .status(taskRunStatuses(config.value("listTaskRunsStatusesCsv", "")))
                .parentJobRunKey(blankToNull(config.value("listTaskRunsParentJobRunKey", "")))
                .rootJobRunKey(blankToNull(config.value("listTaskRunsRootJobRunKey", "")))
                .limit(parsePositiveInt(config.value("listTaskRunsLimit", "25"), "listTaskRunsLimit"))
                .page(blankToNull(config.value("listTaskRunsPage", "")))
                .sortBy(taskRunSortBy(config.value("listTaskRunsSortBy", "timeCreated")))
                .sortOrder(sortOrder(config.value("listTaskRunsSortOrder", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-list-tasks"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getTaskRunCollection(), "task run collection should be present");
    if (response.getTaskRunCollection().getItems() != null
        && !response.getTaskRunCollection().getItems().isEmpty()) {
      discoveredTaskRunKey =
          firstNonBlank(discoveredTaskRunKey, response.getTaskRunCollection().getItems().get(0).getKey());
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 20)
  public void cancelJobRuns() {
    String jobKey = firstNonBlank(config.value("cancelJobRunsJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for cancelJobRuns");
    }

    CancelJobRunsResponse response =
        workflowClient.cancelJobRuns(
            CancelJobRunsRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .ifMatch(blankToNull(config.value("cancelJobRunsIfMatch", "")))
                .opcRetryToken(blankToNull(config.value("cancelJobRunsRetryToken", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-cancel-runs"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 39)
  public void getTaskRunDetails() {
    String configuredTaskRunKey = config.value("getTaskRunDetailsTaskRunKey", "");
    String taskRunKey = firstNonBlank(configuredTaskRunKey, discoveredTaskRunKey);
    if (isBlank(taskRunKey)) {
      throw new SkipException("No task run key available for getTaskRunDetails");
    }
    if (isBlank(configuredTaskRunKey) && !looksLikeTaskRunKey(taskRunKey)) {
      throw new SkipException("Discovered task run key is not a task-run resource key: " + taskRunKey);
    }

    GetTaskRunResponse response =
        workflowClient.getTaskRun(
            GetTaskRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .taskRunKey(taskRunKey)
                .opcRequestId(SdkTestSupport.requestId("workflow-get-task"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    assertNotNull(response.getTaskRun(), "task run should be present");
    discoveredTaskRunOutputKey =
        firstNonBlank(discoveredTaskRunOutputKey, response.getTaskRun().getOutputKey());
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 40)
  public void fetchTaskRunOutput() {
    String configuredTaskRunKey = config.value("fetchTaskRunOutputTaskRunKey", "");
    String taskRunKey = firstNonBlank(configuredTaskRunKey, discoveredTaskRunKey, "missing-task-run");
    String outputKey =
        firstNonBlank(config.value("fetchTaskRunOutputKey", ""), discoveredTaskRunOutputKey, "missing-output");

    try {
      FetchOutputResponse response =
          workflowClient.fetchOutput(
              FetchOutputRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .taskRunKey(taskRunKey)
                  .fetchOutputDetails(fetchOutputDetails(outputKey))
                  .opcRetryToken(blankToNull(config.value("fetchTaskRunOutputRetryToken", "")))
                  .opcRequestId(SdkTestSupport.requestId("workflow-fetch-output"))
                  .build());
      SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
      assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
      TaskRunOutput output = response.getTaskRunOutput();
      if (output != null) {
        discoveredTaskRunOutputKey = firstNonBlank(discoveredTaskRunOutputKey, output.getKey());
      }
    } catch (BmcException e) {
      assertAllowedLiveWorkflowState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 50)
  public void exportTaskRunOutput() {
    String taskRunKey = firstNonBlank(config.value("exportTaskRunOutputTaskRunKey", ""), discoveredTaskRunKey);
    String outputKey =
        firstNonBlank(config.value("exportTaskRunOutputTaskRunOutputKey", ""), discoveredTaskRunOutputKey);
    taskRunKey = firstNonBlank(taskRunKey, "missing-task-run");
    outputKey = firstNonBlank(outputKey, "missing-output");

    try {
      ExportTaskRunOutputResponse response =
          workflowClient.exportTaskRunOutput(
              ExportTaskRunOutputRequest.builder()
                  .aiDataPlatformId(aiDataPlatformId)
                  .workspaceKey(workspaceKey)
                  .taskRunKey(taskRunKey)
                  .taskRunOutputKey(outputKey)
                  .exportTaskRunOutputDetails(exportTaskRunOutputDetails())
                  .opcRequestId(SdkTestSupport.requestId("workflow-export-output"))
                  .build());
      SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
      assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
      assertNotNull(response.getExportedTaskRunOutputContents(), "exported output should be present");
    } catch (BmcException e) {
      assertAllowedLiveWorkflowState(e);
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 80)
  public void deleteJobRun() {
    String jobRunKey = firstNonBlank(config.value("deleteJobRunKey", ""), createdJobRunKey);
    if (isBlank(jobRunKey)) {
      throw new SkipException("No job run key available for deleteJobRun");
    }

    DeleteJobRunResponse response =
        workflowClient.deleteJobRun(
            DeleteJobRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobRunKey(jobRunKey)
                .ifMatch(blankToNull(config.value("deleteJobRunIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-delete-run"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (jobRunKey.equals(createdJobRunKey)) {
      createdJobRunDeleted = true;
    }
  }

  @Test(groups = {"sdk_tests", "sdk_workflow", "workflow", "rel_validation"}, priority = 90)
  public void deleteJob() {
    String jobKey = firstNonBlank(config.value("deleteJobKey", ""), createdJobKey);
    if (isBlank(jobKey)) {
      throw new SkipException("No job key available for deleteJob");
    }

    DeleteJobResponse response =
        workflowClient.deleteJob(
            DeleteJobRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(jobKey)
                .ifMatch(blankToNull(config.value("deleteJobIfMatch", "")))
                .opcRequestId(SdkTestSupport.requestId("workflow-delete-job"))
                .build());
    SdkTestSupport.assertSuccessful(response.get__httpStatusCode__());
    assertNotBlank(response.getOpcRequestId(), "opc-request-id should be present");
    if (jobKey.equals(createdJobKey)) {
      createdJobDeleted = true;
    }
  }

  @AfterClass(alwaysRun = true)
  public void cleanup() {
    if (!isBlank(createdJobRunKey) && !createdJobRunDeleted) {
      try {
        workflowClient.deleteJobRun(
            DeleteJobRunRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobRunKey(createdJobRunKey)
                .opcRequestId(SdkTestSupport.requestId("workflow-clean-run"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (!isBlank(createdJobKey) && !createdJobDeleted) {
      try {
        workflowClient.deleteJob(
            DeleteJobRequest.builder()
                .aiDataPlatformId(aiDataPlatformId)
                .workspaceKey(workspaceKey)
                .jobKey(createdJobKey)
                .opcRequestId(SdkTestSupport.requestId("workflow-clean-job"))
                .build());
      } catch (Exception ignored) {
        // Best-effort cleanup.
      }
    }
    if (workflowClient != null) {
      workflowClient.close();
    }
  }

  private CreateJobDetails createJobDetails() {
    String taskKey = config.value("createJobTaskKey", "cond1");
    return CreateJobDetails.builder()
        .name(uniqueName("sdk_workflow_job_it", config.value("createJobName", "")))
        .description(config.value("createJobDescription", "Created by WorkflowJobRunSdkIT"))
        .path(config.value("createJobPath", "Shared"))
        .maxConcurrentRuns(parsePositiveInt(config.value("createJobMaxConcurrentRuns", "1"), "createJobMaxConcurrentRuns"))
        .tasks(List.of(ifElseTask(taskKey)))
        .build();
  }

  private String firstTaskRunKey(JobRun jobRun) {
    if (jobRun == null || jobRun.getTaskToTaskRunMap() == null || jobRun.getTaskToTaskRunMap().isEmpty()) {
      return "";
    }
    for (String taskRunKey : jobRun.getTaskToTaskRunMap().values()) {
      if (looksLikeTaskRunKey(taskRunKey)) {
        return taskRunKey;
      }
    }
    return "";
  }

  private boolean looksLikeTaskRunKey(String value) {
    return !isBlank(value) && value.contains("-");
  }

  private IfElseTask ifElseTask(String taskKey) {
    return IfElseTask.builder()
        .taskKey(taskKey)
        .runIf(Task.RunIf.AllSuccess)
        .expressions(List.of(Expression.builder().key("A").value("1==1").build()))
        .condition("A")
        .build();
  }

  private UpdateJobDetails updateJobDetails() {
    return UpdateJobDetails.builder()
        .name(uniqueName("sdk_workflow_job_updated_it", config.value("updateJobName", "")))
        .description(config.value("updateJobDescription", "Updated by WorkflowJobRunSdkIT"))
        .path(config.value("updateJobPath", "Shared"))
        .tasks(List.of(ifElseTask(config.value("updateJobTaskKey", "cond1"))))
        .build();
  }

  private ManageJobPermissionDetails manageJobPermissionDetails(String assignee) {
    return ManageJobPermissionDetails.builder()
        .assignJobPermissionDetails(
            AssignJobPermissionDetails.builder()
                .assignees(permissionAssignees(assignee))
                .permissions(List.of(JobPrivilege.Read))
                .build())
        .build();
  }

  private RepairJobRunDetails repairJobRunDetails() {
    List<String> taskKeys = csv(config.value("repairJobRunTaskKeysCsv", ""));
    if (taskKeys == null || taskKeys.isEmpty()) {
      taskKeys = List.of(config.value("createJobTaskKey", "cond1"));
    }
    return RepairJobRunDetails.builder().taskKeys(taskKeys).build();
  }

  private FetchOutputDetails fetchOutputDetails(String outputKey) {
    return FetchOutputDetails.builder().outputKey(outputKey).build();
  }

  private ExportTaskRunOutputDetails exportTaskRunOutputDetails() {
    return ExportTaskRunOutputDetails.builder()
        .format(ExportTaskRunOutputDetails.Format.create(config.value("exportTaskRunOutputFormat", "HTML")))
        .build();
  }

  private PermissionAssignees permissionAssignees(String assignee) {
    return PermissionAssignees.builder()
        .type(GranteeType.User)
        .targets(List.of(assignee))
        .build();
  }

  private String permissionTarget(String key) {
    return firstNonBlank(config.value(key, ""), config.workspacePermissionTarget());
  }

  private String uniqueName(String defaultPrefix, String configuredName) {
    return firstNonBlank(configuredName, defaultPrefix)
        + "_"
        + UUID.randomUUID().toString().substring(0, 8);
  }

  private List<String> csvWithDefault(String csv, String defaultValue) {
    List<String> values = csv(csv);
    if ((values == null || values.isEmpty()) && !isBlank(defaultValue)) {
      return List.of(defaultValue);
    }
    return values;
  }

  private List<String> csv(String csv) {
    if (isBlank(csv)) {
      return null;
    }
    List<String> values = new ArrayList<>();
    for (String value : csv.split(",")) {
      if (!isBlank(value)) {
        values.add(value.trim());
      }
    }
    return values;
  }

  private List<ListJobRunsRequest.Status> jobRunStatuses(String csv) {
    List<String> values = csv(csv);
    if (values == null) {
      return null;
    }
    List<ListJobRunsRequest.Status> statuses = new ArrayList<>();
    for (String value : values) {
      statuses.add(ListJobRunsRequest.Status.create(value));
    }
    return statuses;
  }

  private List<ListTaskRunsRequest.Status> taskRunStatuses(String csv) {
    List<String> values = csv(csv);
    if (values == null) {
      return null;
    }
    List<ListTaskRunsRequest.Status> statuses = new ArrayList<>();
    for (String value : values) {
      statuses.add(ListTaskRunsRequest.Status.create(value));
    }
    return statuses;
  }

  private Date optionalDate(String value) {
    return isBlank(value) ? null : Date.from(Instant.parse(value));
  }

  private Integer optionalInt(String value) {
    return isBlank(value) ? null : parsePositiveInt(value, "integer value");
  }

  private Boolean optionalBoolean(String key) {
    String value = config.value(key, "");
    if (isBlank(value)) {
      return null;
    }
    if (!"true".equalsIgnoreCase(value) && !"false".equalsIgnoreCase(value)) {
      throw new IllegalArgumentException(key + " must be true/false when provided: " + value);
    }
    return Boolean.valueOf(value);
  }

  private SortOrder sortOrder(String value) {
    return isBlank(value) ? null : SortOrder.create(value);
  }

  private ListJobsRequest.SortBy jobSortBy(String value) {
    return isBlank(value) ? null : ListJobsRequest.SortBy.create(value);
  }

  private ListJobRunsRequest.SortBy jobRunSortBy(String value) {
    return isBlank(value) ? null : ListJobRunsRequest.SortBy.create(value);
  }

  private ListRecentJobRunsRequest.SortBy recentJobRunSortBy(String value) {
    return isBlank(value) ? null : ListRecentJobRunsRequest.SortBy.create(value);
  }

  private ListTaskRunsRequest.SortBy taskRunSortBy(String value) {
    return isBlank(value) ? null : ListTaskRunsRequest.SortBy.create(value);
  }

  private ListJobPermissionsRequest.SortBy jobPermissionSortBy(String value) {
    return isBlank(value) ? null : ListJobPermissionsRequest.SortBy.create(value);
  }

  private int parsePositiveInt(String value, String name) {
    try {
      int parsed = Integer.parseInt(value);
      if (parsed <= 0) {
        throw new IllegalArgumentException(name + " must be positive: " + value);
      }
      return parsed;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(name + " must be a positive integer: " + value, e);
    }
  }

  private void assertNotBlank(String value, String message) {
    assertFalse(isBlank(value), message);
  }

  private void assertAllowedLiveWorkflowState(BmcException e) {
    int status = e.getStatusCode();
    if (status == 400 || status == 404 || status == 409 || status == 422) {
      return;
    }
    if (status == 500 && e.getMessage() != null && e.getMessage().contains("not supported")) {
      return;
    }
    throw e;
  }

  private String blankToNull(String value) {
    return isBlank(value) ? null : value;
  }

  private String firstNonBlank(String... values) {
    for (String value : values) {
      if (!isBlank(value)) {
        return value;
      }
    }
    return "";
  }

  private boolean isBlank(String value) {
    return value == null || value.isBlank();
  }
}
