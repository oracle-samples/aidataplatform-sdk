package com.oracle.aidp.sdk.mlops;

import static com.oracle.aidp.sdk.support.SdkTestSupport.assertSuccessful;
import static com.oracle.aidp.sdk.support.SdkTestSupport.requestId;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import com.oracle.aidp.sdk.client.SdkClients;
import com.oracle.aidp.sdk.config.SdkTestConfig;
import com.oracle.aidp.sdk.support.SdkTestResources;
import com.oracle.aidataplatform.dp.MLOpsClient;
import com.oracle.aidataplatform.dp.model.CreateExperimentDetails;
import com.oracle.aidataplatform.dp.model.CreateExperimentRunDetails;
import com.oracle.aidataplatform.dp.model.CreateModelVersionDetails;
import com.oracle.aidataplatform.dp.model.CreateRegisteredModelDetails;
import com.oracle.aidataplatform.dp.model.Dataset;
import com.oracle.aidataplatform.dp.model.DatasetInput;
import com.oracle.aidataplatform.dp.model.DeleteExperimentDetails;
import com.oracle.aidataplatform.dp.model.DeleteExperimentRunDetails;
import com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagDetails;
import com.oracle.aidataplatform.dp.model.DeleteExperimentTagDetails;
import com.oracle.aidataplatform.dp.model.DeleteModelVersionDetails;
import com.oracle.aidataplatform.dp.model.DeleteModelVersionTagDetails;
import com.oracle.aidataplatform.dp.model.DeleteRegisteredModelDetails;
import com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagDetails;
import com.oracle.aidataplatform.dp.model.ExperimentRunMetric;
import com.oracle.aidataplatform.dp.model.ExperimentRunParam;
import com.oracle.aidataplatform.dp.model.ExperimentRunStatus;
import com.oracle.aidataplatform.dp.model.ExperimentRunTag;
import com.oracle.aidataplatform.dp.model.ExperimentRunTagKey;
import com.oracle.aidataplatform.dp.model.ExperimentTag;
import com.oracle.aidataplatform.dp.model.ExperimentTagKey;
import com.oracle.aidataplatform.dp.model.InputTag;
import com.oracle.aidataplatform.dp.model.ListExperimentRunsDetails;
import com.oracle.aidataplatform.dp.model.ListExperimentsDetails;
import com.oracle.aidataplatform.dp.model.ListLoggedModelsDetails;
import com.oracle.aidataplatform.dp.model.LogExperimentRunBatchDetails;
import com.oracle.aidataplatform.dp.model.LogExperimentRunInputsDetails;
import com.oracle.aidataplatform.dp.model.LogExperimentRunMetricDetails;
import com.oracle.aidataplatform.dp.model.LogExperimentRunModelDetails;
import com.oracle.aidataplatform.dp.model.LogExperimentRunParamDetails;
import com.oracle.aidataplatform.dp.model.ModelVersionTag;
import com.oracle.aidataplatform.dp.model.ModelVersionTagKey;
import com.oracle.aidataplatform.dp.model.RegisteredModelTag;
import com.oracle.aidataplatform.dp.model.RegisteredModelTagKey;
import com.oracle.aidataplatform.dp.model.RenameRegisteredModelDetails;
import com.oracle.aidataplatform.dp.model.RestoreExperimentDetails;
import com.oracle.aidataplatform.dp.model.RestoreExperimentRunDetails;
import com.oracle.aidataplatform.dp.model.SetExperimentRunTagDetails;
import com.oracle.aidataplatform.dp.model.SetExperimentTagDetails;
import com.oracle.aidataplatform.dp.model.SetModelVersionTagDetails;
import com.oracle.aidataplatform.dp.model.SetRegisteredModelTagDetails;
import com.oracle.aidataplatform.dp.model.TransitionModelVersionStageDetails;
import com.oracle.aidataplatform.dp.model.UpdateExperimentDetails;
import com.oracle.aidataplatform.dp.model.UpdateExperimentRunDetails;
import com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsDetails;
import com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails;
import com.oracle.aidataplatform.dp.model.UpdateModelVersionDetails;
import com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsDetails;
import com.oracle.aidataplatform.dp.model.UpdateRegisteredModelDetails;
import com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsDetails;
import com.oracle.aidataplatform.dp.requests.CreateExperimentRequest;
import com.oracle.aidataplatform.dp.requests.CreateExperimentRunRequest;
import com.oracle.aidataplatform.dp.requests.CreateModelVersionRequest;
import com.oracle.aidataplatform.dp.requests.CreateRegisteredModelRequest;
import com.oracle.aidataplatform.dp.requests.CreateWorkspaceModelVersionRequest;
import com.oracle.aidataplatform.dp.requests.DeleteExperimentRequest;
import com.oracle.aidataplatform.dp.requests.DeleteExperimentRunRequest;
import com.oracle.aidataplatform.dp.requests.DeleteExperimentRunTagRequest;
import com.oracle.aidataplatform.dp.requests.DeleteExperimentTagRequest;
import com.oracle.aidataplatform.dp.requests.DeleteModelVersionRequest;
import com.oracle.aidataplatform.dp.requests.DeleteModelVersionTagRequest;
import com.oracle.aidataplatform.dp.requests.DeleteRegisteredModelRequest;
import com.oracle.aidataplatform.dp.requests.DeleteRegisteredModelTagRequest;
import com.oracle.aidataplatform.dp.requests.GetExperimentByIdRequest;
import com.oracle.aidataplatform.dp.requests.GetExperimentByNameRequest;
import com.oracle.aidataplatform.dp.requests.GetExperimentRunByIdRequest;
import com.oracle.aidataplatform.dp.requests.GetExperimentRunMetricHistoryRequest;
import com.oracle.aidataplatform.dp.requests.GetModelVersionRequest;
import com.oracle.aidataplatform.dp.requests.GetRegisteredModelRequest;
import com.oracle.aidataplatform.dp.requests.ListArtifactsRequest;
import com.oracle.aidataplatform.dp.requests.ListExperimentRunsRequest;
import com.oracle.aidataplatform.dp.requests.ListExperimentsRequest;
import com.oracle.aidataplatform.dp.requests.ListLoggedModelsRequest;
import com.oracle.aidataplatform.dp.requests.ListModelVersionsRequest;
import com.oracle.aidataplatform.dp.requests.ListRegisteredModelsRequest;
import com.oracle.aidataplatform.dp.requests.LogExperimentRunBatchRequest;
import com.oracle.aidataplatform.dp.requests.LogExperimentRunInputsRequest;
import com.oracle.aidataplatform.dp.requests.LogExperimentRunMetricRequest;
import com.oracle.aidataplatform.dp.requests.LogExperimentRunModelRequest;
import com.oracle.aidataplatform.dp.requests.LogExperimentRunParamRequest;
import com.oracle.aidataplatform.dp.requests.RenameRegisteredModelRequest;
import com.oracle.aidataplatform.dp.requests.RestoreExperimentRequest;
import com.oracle.aidataplatform.dp.requests.RestoreExperimentRunRequest;
import com.oracle.aidataplatform.dp.requests.SetExperimentRunTagRequest;
import com.oracle.aidataplatform.dp.requests.SetExperimentTagRequest;
import com.oracle.aidataplatform.dp.requests.SetModelVersionTagRequest;
import com.oracle.aidataplatform.dp.requests.SetRegisteredModelTagRequest;
import com.oracle.aidataplatform.dp.requests.TransitionModelVersionStageRequest;
import com.oracle.aidataplatform.dp.requests.UpdateExperimentRequest;
import com.oracle.aidataplatform.dp.requests.UpdateExperimentRunRequest;
import com.oracle.aidataplatform.dp.requests.UpdateExperimentRunTagsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateExperimentTagsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateModelVersionRequest;
import com.oracle.aidataplatform.dp.requests.UpdateModelVersionTagsRequest;
import com.oracle.aidataplatform.dp.requests.UpdateRegisteredModelRequest;
import com.oracle.aidataplatform.dp.requests.UpdateRegisteredModelTagsRequest;
import com.oracle.aidataplatform.dp.responses.CreateExperimentResponse;
import com.oracle.aidataplatform.dp.responses.CreateExperimentRunResponse;
import com.oracle.aidataplatform.dp.responses.CreateModelVersionResponse;
import com.oracle.aidataplatform.dp.responses.CreateRegisteredModelResponse;
import com.oracle.aidataplatform.dp.responses.CreateWorkspaceModelVersionResponse;
import com.oracle.aidataplatform.dp.responses.DeleteExperimentResponse;
import com.oracle.aidataplatform.dp.responses.DeleteExperimentRunResponse;
import com.oracle.aidataplatform.dp.responses.DeleteModelVersionResponse;
import com.oracle.aidataplatform.dp.responses.DeleteRegisteredModelResponse;
import com.oracle.aidataplatform.dp.responses.GetExperimentByIdResponse;
import com.oracle.aidataplatform.dp.responses.GetExperimentByNameResponse;
import com.oracle.aidataplatform.dp.responses.GetExperimentRunByIdResponse;
import com.oracle.aidataplatform.dp.responses.GetExperimentRunMetricHistoryResponse;
import com.oracle.aidataplatform.dp.responses.GetModelVersionResponse;
import com.oracle.aidataplatform.dp.responses.GetRegisteredModelResponse;
import com.oracle.aidataplatform.dp.responses.ListArtifactsResponse;
import com.oracle.aidataplatform.dp.responses.ListExperimentRunsResponse;
import com.oracle.aidataplatform.dp.responses.ListExperimentsResponse;
import com.oracle.aidataplatform.dp.responses.ListLoggedModelsResponse;
import com.oracle.aidataplatform.dp.responses.ListModelVersionsResponse;
import com.oracle.aidataplatform.dp.responses.ListRegisteredModelsResponse;
import com.oracle.aidataplatform.dp.responses.RenameRegisteredModelResponse;
import com.oracle.aidataplatform.dp.responses.UpdateExperimentRunResponse;
import com.oracle.bmc.model.BmcException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MlOpsSdkIT {
  private SdkTestConfig config;
  private MLOpsClient mlOpsClient;
  private String workspaceKey;
  private String createdExperimentId;
  private String createdExperimentName;
  private String createdRunId;
  private String createdRegisteredModelName;
  private final List<ModelVersionRef> createdModelVersions = new ArrayList<>();

  @BeforeClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"})
  public void setUp() throws Exception {
    config = SdkTestConfig.load();
    workspaceKey = SdkTestResources.ensureSharedWorkspace(config);
    mlOpsClient = SdkClients.mlOpsClient(config);
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 0)
  public void listRegisteredModelsTest() {
    ListRegisteredModelsResponse response =
        mlOpsClient.listRegisteredModels(
            ListRegisteredModelsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .maxResults(10L)
                
                .opcRequestId(requestId("list-registered-models"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 1)
  public void listModelVersionsTest() {
    ListModelVersionsResponse response =
        mlOpsClient.listModelVersions(
            ListModelVersionsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .maxResults(10L)
                
                .opcRequestId(requestId("list-model-versions"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 2)
  public void listExperimentsTest() {
    ListExperimentsResponse response =
        mlOpsClient.listExperiments(
            ListExperimentsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .listExperimentsDetails(ListExperimentsDetails.builder().maxResults(10L).build())
                
                .opcRequestId(requestId("list-experiments"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 3)
  public void listExperimentRunsTest() {
    ListExperimentRunsResponse response =
        mlOpsClient.listExperimentRuns(
            ListExperimentRunsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .listExperimentRunsDetails(
                    ListExperimentRunsDetails.builder().maxResults(10).build())
                
                .opcRequestId(requestId("list-experiment-runs"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 5)
  public void listLoggedModelsTest() {
    String experimentId = effectiveExperimentId();

    ListLoggedModelsResponse response =
        mlOpsClient.listLoggedModels(
            ListLoggedModelsRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .listLoggedModelsDetails(
                    ListLoggedModelsDetails.builder()
                        .experimentIds(List.of(experimentId))
                        .maxResults(10L)
                        .build())
                
                .opcRequestId(requestId("list-logged-models"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getOpcRequestId());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 6)
  public void getExperimentByIdTest() {
    String experimentId = effectiveExperimentId();

    GetExperimentByIdResponse response = getExperimentById(workspaceKey, experimentId);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getExperimentResponse());
    assertNotNull(response.getExperimentResponse().getExperiment());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 7)
  public void getExperimentByNameTest() {
    String experimentName = effectiveExperimentName();

    GetExperimentByNameResponse response =
        mlOpsClient.getExperimentByName(
            GetExperimentByNameRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .experimentName(experimentName)
                
                .opcRequestId(requestId("get-experiment-by-name"))
                .build());

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getExperimentResponse());
    assertNotNull(response.getExperimentResponse().getExperiment());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 8)
  public void getExperimentRunByIdTest() {
    String runId = effectiveExperimentRunId();

    GetExperimentRunByIdResponse response = getExperimentRunById(workspaceKey, runId);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getGetExperimentRunResponseDetails());
    assertNotNull(response.getGetExperimentRunResponseDetails().getRun());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 10)
  public void getRegisteredModelTest() {
    String registeredModelName = effectiveRegisteredModelName();

    GetRegisteredModelResponse response = getRegisteredModel(registeredModelName);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getGetRegisteredModelResponseDetails());
    assertNotNull(response.getGetRegisteredModelResponseDetails().getRegisteredModel());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 11)
  public void getModelVersionTest() {
    String registeredModelName = effectiveRegisteredModelName();
    String modelVersion = effectiveModelVersionKey();

    GetModelVersionResponse response = getModelVersion(registeredModelName, modelVersion);

    assertSuccessful(response.get__httpStatusCode__());
    assertNotNull(response.getGetModelVersionResponseDetails());
    assertNotNull(response.getGetModelVersionResponseDetails().getModelVersion());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 4)
  public void experimentAndRunMutationFlowTest() {
    if (!config.runMlOpsExperimentMutationTests()) {
      throw new SkipException("Set sdkRunMlOpsExperimentMutationTests=true to run MLOps experiment mutations.");
    }
    String suffix = Long.toString(System.currentTimeMillis());
    String experimentName = config.mlOpsNamePrefix() + "experiment_" + suffix;
    String updatedExperimentName = experimentName + "_updated";
    String runName = config.mlOpsNamePrefix() + "run_" + suffix;
    String updatedRunName = runName + "_updated";
    String metricKey = "sdk_metric_" + suffix;

    CreateExperimentResponse createExperimentResponse =
        mlOpsClient.createExperiment(
            CreateExperimentRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createExperimentDetails(CreateExperimentDetails.builder().name(experimentName).build())
                
                .opcRetryToken(requestId("create-experiment-retry"))
                .opcRequestId(requestId("create-experiment"))
                .build());
    assertSuccessful(createExperimentResponse.get__httpStatusCode__());
    assertNotNull(createExperimentResponse.getCreateExperimentResponseDetails());
    createdExperimentId = createExperimentResponse.getCreateExperimentResponseDetails().getExperimentId();
    createdExperimentName = experimentName;
    assertNotNull(createdExperimentId);

    assertSuccessful(getExperimentById(workspaceKey, createdExperimentId).get__httpStatusCode__());
    GetExperimentByNameResponse getByNameResponse =
        mlOpsClient.getExperimentByName(
            GetExperimentByNameRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .experimentName(experimentName)
                
                .opcRequestId(requestId("get-created-experiment"))
                .build());
    assertSuccessful(getByNameResponse.get__httpStatusCode__());

    assertSuccessful(
        mlOpsClient
            .updateExperiment(
                UpdateExperimentRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .updateExperimentDetails(
                        UpdateExperimentDetails.builder()
                            .experimentId(createdExperimentId)
                            .newName(updatedExperimentName)
                            .build())
                    
                    .opcRequestId(requestId("update-experiment"))
                    .build())
            .get__httpStatusCode__());
    createdExperimentName = updatedExperimentName;

    assertSuccessful(
        mlOpsClient
            .setExperimentTag(
                SetExperimentTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .setExperimentTagDetails(
                        SetExperimentTagDetails.builder()
                            .experimentId(createdExperimentId)
                            .key("sdk_tag")
                            .value("set")
                            .build())
                    
                    .opcRequestId(requestId("set-experiment-tag"))
                    .build())
            .get__httpStatusCode__());

    assertSuccessful(
        mlOpsClient
            .updateExperimentTags(
                UpdateExperimentTagsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .updateExperimentTagsDetails(
                        UpdateExperimentTagsDetails.builder()
                            .experimentId(createdExperimentId)
                            .setTags(List.of(ExperimentTag.builder().key("sdk_batch_tag").value("set").build()))
                            .deleteTags(List.of(ExperimentTagKey.builder().key("sdk_tag").build()))
                            .build())
                    
                    .opcRequestId(requestId("update-experiment-tags"))
                    .build())
            .get__httpStatusCode__());

    assertSuccessful(
        mlOpsClient
            .deleteExperimentTag(
                DeleteExperimentTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .deleteExperimentTagDetails(
                        DeleteExperimentTagDetails.builder()
                            .experimentId(createdExperimentId)
                            .key("sdk_batch_tag")
                            .build())
                    
                    .opcRequestId(requestId("delete-experiment-tag"))
                    .build())
            .get__httpStatusCode__());

    CreateExperimentRunResponse createRunResponse =
        mlOpsClient.createExperimentRun(
            CreateExperimentRunRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .createExperimentRunDetails(
                    CreateExperimentRunDetails.builder()
                        .experimentId(createdExperimentId)
                        .runName(runName)
                        .startTime(System.currentTimeMillis())
                        .tags(List.of(ExperimentRunTag.builder().key("sdk_created").value("true").build()))
                        .build())
                
                .opcRetryToken(requestId("create-run-retry"))
                .opcRequestId(requestId("create-run"))
                .build());
    assertSuccessful(createRunResponse.get__httpStatusCode__());
    assertNotNull(createRunResponse.getCreateExperimentRunResponseDetails());
    assertNotNull(createRunResponse.getCreateExperimentRunResponseDetails().getRun());
    assertNotNull(createRunResponse.getCreateExperimentRunResponseDetails().getRun().getInfo());
    createdRunId = createRunResponse.getCreateExperimentRunResponseDetails().getRun().getInfo().getRunId();
    assertNotNull(createdRunId);

    assertSuccessful(getExperimentRunById(workspaceKey, createdRunId).get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .listArtifacts(
                ListArtifactsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .runId(createdRunId)
                    .path("")
                    
                    .opcRequestId(requestId("list-artifacts"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .listExperimentRuns(
                ListExperimentRunsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .listExperimentRunsDetails(
                        ListExperimentRunsDetails.builder()
                            .experimentIds(List.of(createdExperimentId))
                            .maxResults(10)
                            .build())
                    
                    .opcRequestId(requestId("list-created-runs"))
                    .build())
            .get__httpStatusCode__());

    long now = System.currentTimeMillis();
    assertSuccessful(
        mlOpsClient
            .logExperimentRunParam(
                LogExperimentRunParamRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .logExperimentRunParamDetails(
                        LogExperimentRunParamDetails.builder()
                            .runId(createdRunId)
                            .key("sdk_param")
                            .value("value")
                            .build())
                    
                    .opcRequestId(requestId("log-run-param"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .logExperimentRunMetric(
                LogExperimentRunMetricRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .logExperimentRunMetricDetails(
                        LogExperimentRunMetricDetails.builder()
                            .runId(createdRunId)
                            .key(metricKey)
                            .value(1.0d)
                            .timestamp(now)
                            .step(0L)
                            .build())
                    
                    .opcRequestId(requestId("log-run-metric"))
                    .build())
            .get__httpStatusCode__());

    GetExperimentRunMetricHistoryResponse metricHistoryResponse =
        mlOpsClient.getExperimentRunMetricHistory(
            GetExperimentRunMetricHistoryRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .runId(createdRunId)
                .metricKey(metricKey)
                .maxResults(10)
                
                .opcRequestId(requestId("get-metric-history"))
                .build());
    assertSuccessful(metricHistoryResponse.get__httpStatusCode__());
    assertNotNull(metricHistoryResponse.getExperimentRunMetricHistoryCollection());

    assertSuccessful(
        mlOpsClient
            .logExperimentRunBatch(
                LogExperimentRunBatchRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .logExperimentRunBatchDetails(
                        LogExperimentRunBatchDetails.builder()
                            .runId(createdRunId)
                            .metrics(
                                List.of(
                                    ExperimentRunMetric.builder()
                                        .key("sdk_batch_metric")
                                        .value(2.0d)
                                        .timestamp(now + 1)
                                        .step(1L)
                                        .build()))
                            .params(
                                List.of(
                                    ExperimentRunParam.builder()
                                        .key("sdk_batch_param")
                                        .value("value")
                                        .build()))
                            .tags(
                                List.of(
                                    ExperimentRunTag.builder()
                                        .key("sdk_batch_run_tag")
                                        .value("set")
                                        .build()))
                            .build())
                    
                    .opcRequestId(requestId("log-run-batch"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .logExperimentRunModel(
                LogExperimentRunModelRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .logExperimentRunModelDetails(
                        LogExperimentRunModelDetails.builder()
                            .runId(createdRunId)
                            .modelJson(logModelJson(createdRunId))
                            .build())
                    
                    .opcRequestId(requestId("log-run-model"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .listLoggedModels(
                ListLoggedModelsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .listLoggedModelsDetails(
                        ListLoggedModelsDetails.builder()
                            .experimentIds(List.of(createdExperimentId))
                            .maxResults(10L)
                            .build())
                    
                    .opcRequestId(requestId("list-created-models"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .logExperimentRunInputs(
                LogExperimentRunInputsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .logExperimentRunInputsDetails(
                        LogExperimentRunInputsDetails.builder()
                            .runId(createdRunId)
                            .datasetInputs(
                                List.of(
                                    DatasetInput.builder()
                                        .dataset(
                                            Dataset.builder()
                                                .name("sdk_dataset")
                                                .digest("sdk-digest")
                                                .sourceType("URI")
                                                .source("file:///tmp/sdk-dataset")
                                                .schema("{}")
                                                .profile("{}")
                                                .build())
                                        .tags(
                                            List.of(
                                                InputTag.builder()
                                                    .key("sdk_input")
                                                    .value("true")
                                                    .build()))
                                        .build()))
                            .build())
                    
                    .opcRequestId(requestId("log-run-inputs"))
                    .build())
            .get__httpStatusCode__());

    assertSuccessful(
        mlOpsClient
            .setExperimentRunTag(
                SetExperimentRunTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .setExperimentRunTagDetails(
                        SetExperimentRunTagDetails.builder()
                            .runId(createdRunId)
                            .key("sdk_run_tag")
                            .value("set")
                            .build())
                    
                    .opcRequestId(requestId("set-run-tag"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .updateExperimentRunTags(
                UpdateExperimentRunTagsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .updateExperimentRunTagsDetails(
                        UpdateExperimentRunTagsDetails.builder()
                            .runId(createdRunId)
                            .setTags(List.of(ExperimentRunTag.builder().key("sdk_run_batch_tag").value("set").build()))
                            .deleteTags(List.of(ExperimentRunTagKey.builder().key("sdk_run_tag").build()))
                            .build())
                    
                    .opcRequestId(requestId("update-run-tags"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .deleteExperimentRunTag(
                DeleteExperimentRunTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .deleteExperimentRunTagDetails(
                        DeleteExperimentRunTagDetails.builder()
                            .runId(createdRunId)
                            .key("sdk_run_batch_tag")
                            .build())
                    
                    .opcRequestId(requestId("delete-run-tag"))
                    .build())
            .get__httpStatusCode__());

    UpdateExperimentRunResponse updateRunResponse =
        mlOpsClient.updateExperimentRun(
            UpdateExperimentRunRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .updateExperimentRunDetails(
                    UpdateExperimentRunDetails.builder()
                        .runId(createdRunId)
                        .runName(updatedRunName)
                        .status(ExperimentRunStatus.Finished)
                        .endTime(System.currentTimeMillis())
                        .build())
                
                .opcRequestId(requestId("update-run"))
                .build());
    assertSuccessful(updateRunResponse.get__httpStatusCode__());
    assertNotNull(updateRunResponse.getUpdateExperimentRunResponseDetails());
    assertNotNull(updateRunResponse.getUpdateExperimentRunResponseDetails().getRunInfo());
    assertEquals(updateRunResponse.getUpdateExperimentRunResponseDetails().getRunInfo().getRunId(), createdRunId);

    DeleteExperimentRunResponse deleteRunResponse = deleteExperimentRun(workspaceKey, createdRunId);
    assertSuccessful(deleteRunResponse.get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .restoreExperimentRun(
                RestoreExperimentRunRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .restoreExperimentRunDetails(
                        RestoreExperimentRunDetails.builder().runId(createdRunId).build())
                    
                    .opcRequestId(requestId("restore-run"))
                    .build())
            .get__httpStatusCode__());

    DeleteExperimentResponse deleteExperimentResponse = deleteExperiment(workspaceKey, createdExperimentId);
    assertSuccessful(deleteExperimentResponse.get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .restoreExperiment(
                RestoreExperimentRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .workspaceKey(workspaceKey)
                    .restoreExperimentDetails(
                        RestoreExperimentDetails.builder().experimentId(createdExperimentId).build())
                    
                    .opcRequestId(requestId("restore-experiment"))
                    .build())
            .get__httpStatusCode__());
  }

  @Test(groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"}, priority = 9)
  public void registeredModelAndModelVersionMutationFlowTest() {
    if (!config.runMlOpsModelMutationTests()) {
      throw new SkipException("Set sdkRunMlOpsModelMutationTests=true to run MLOps model mutations.");
    }
    String suffix = Long.toString(System.currentTimeMillis());
    String modelName = qualifiedRegisteredModelName(config.mlOpsNamePrefix() + "model_" + suffix);
    String renamedModelName = modelName + "_renamed";

    CreateRegisteredModelResponse createModelResponse =
        mlOpsClient.createRegisteredModel(
            CreateRegisteredModelRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .createRegisteredModelDetails(
                    CreateRegisteredModelDetails.builder()
                        .name(modelName)
                        .description("Created by MlOpsSdkIT")
                        .tags(List.of(RegisteredModelTag.builder().key("sdk_created").value("true").build()))
                        .build())
                
                .opcRetryToken(requestId("create-reg-model-retry"))
                .opcRequestId(requestId("create-reg-model"))
                .build());
    assertSuccessful(createModelResponse.get__httpStatusCode__());
    assertNotNull(createModelResponse.getCreateRegisteredModelResponseDetails());
    assertNotNull(createModelResponse.getCreateRegisteredModelResponseDetails().getRegisteredModel());
    createdRegisteredModelName = createModelResponse.getCreateRegisteredModelResponseDetails().getRegisteredModel().getName();
    assertEquals(createdRegisteredModelName, modelName);

    assertSuccessful(getRegisteredModel(createdRegisteredModelName).get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .updateRegisteredModel(
                UpdateRegisteredModelRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .updateRegisteredModelDetails(
                        UpdateRegisteredModelDetails.builder()
                            .name(createdRegisteredModelName)
                            .description("Updated by MlOpsSdkIT")
                            .build())
                    
                    .opcRequestId(requestId("update-reg-model"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .setRegisteredModelTag(
                SetRegisteredModelTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .setRegisteredModelTagDetails(
                        SetRegisteredModelTagDetails.builder()
                            .name(createdRegisteredModelName)
                            .key("sdk_model_tag")
                            .value("set")
                            .build())
                    
                    .opcRequestId(requestId("set-reg-model-tag"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .updateRegisteredModelTags(
                UpdateRegisteredModelTagsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .updateRegisteredModelTagsDetails(
                        UpdateRegisteredModelTagsDetails.builder()
                            .name(createdRegisteredModelName)
                            .setTags(List.of(RegisteredModelTag.builder().key("sdk_model_batch_tag").value("set").build()))
                            .deleteTags(List.of(RegisteredModelTagKey.builder().key("sdk_model_tag").build()))
                            .build())
                    
                    .opcRequestId(requestId("update-reg-model-tags"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .deleteRegisteredModelTag(
                DeleteRegisteredModelTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .deleteRegisteredModelTagDetails(
                        DeleteRegisteredModelTagDetails.builder()
                            .name(createdRegisteredModelName)
                            .key("sdk_model_batch_tag")
                            .build())
                    
                    .opcRequestId(requestId("delete-reg-model-tag"))
                    .build())
            .get__httpStatusCode__());

    RenameRegisteredModelResponse renameResponse =
        mlOpsClient.renameRegisteredModel(
            RenameRegisteredModelRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .renameRegisteredModelDetails(
                    RenameRegisteredModelDetails.builder()
                        .name(createdRegisteredModelName)
                        .newName(renamedModelName)
                        .build())
                
                .opcRequestId(requestId("rename-reg-model"))
                .build());
    assertSuccessful(renameResponse.get__httpStatusCode__());
    assertNotNull(renameResponse.getRenameRegisteredModelResponseDetails());
    assertNotNull(renameResponse.getRenameRegisteredModelResponseDetails().getRegisteredModel());
    createdRegisteredModelName = renameResponse.getRenameRegisteredModelResponseDetails().getRegisteredModel().getName();
    assertEquals(createdRegisteredModelName, renamedModelName);

    String modelVersion = createModelVersion(createdRegisteredModelName, false);
    String workspaceModelVersion = createModelVersion(createdRegisteredModelName, true);

    assertSuccessful(getModelVersion(createdRegisteredModelName, modelVersion).get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .listModelVersions(
                ListModelVersionsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .filter("name='" + createdRegisteredModelName + "'")
                    .maxResults(10L)
                    
                    .opcRequestId(requestId("list-created-versions"))
                    .build())
            .get__httpStatusCode__());

    assertSuccessful(
        mlOpsClient
            .updateModelVersion(
                UpdateModelVersionRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .updateModelVersionDetails(
                        UpdateModelVersionDetails.builder()
                            .name(createdRegisteredModelName)
                            .version(modelVersion)
                            .description("Updated by MlOpsSdkIT")
                            .build())
                    
                    .opcRequestId(requestId("update-model-version"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .setModelVersionTag(
                SetModelVersionTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .setModelVersionTagDetails(
                        SetModelVersionTagDetails.builder()
                            .name(createdRegisteredModelName)
                            .version(modelVersion)
                            .key("sdk_version_tag")
                            .value("set")
                            .build())
                    
                    .opcRequestId(requestId("set-model-version-tag"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .updateModelVersionTags(
                UpdateModelVersionTagsRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .updateModelVersionTagsDetails(
                        UpdateModelVersionTagsDetails.builder()
                            .name(createdRegisteredModelName)
                            .version(modelVersion)
                            .setTags(List.of(ModelVersionTag.builder().key("sdk_version_batch_tag").value("set").build()))
                            .deleteTags(List.of(ModelVersionTagKey.builder().key("sdk_version_tag").build()))
                            .build())
                    
                    .opcRequestId(requestId("update-model-version-tags"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .deleteModelVersionTag(
                DeleteModelVersionTagRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .deleteModelVersionTagDetails(
                        DeleteModelVersionTagDetails.builder()
                            .name(createdRegisteredModelName)
                            .version(modelVersion)
                            .key("sdk_version_batch_tag")
                            .build())
                    
                    .opcRequestId(requestId("delete-model-version-tag"))
                    .build())
            .get__httpStatusCode__());
    assertSuccessful(
        mlOpsClient
            .transitionModelVersionStage(
                TransitionModelVersionStageRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .transitionModelVersionStageDetails(
                        TransitionModelVersionStageDetails.builder()
                            .name(createdRegisteredModelName)
                            .version(modelVersion)
                            .stage(config.mlOpsModelVersionStage())
                            .archiveExistingVersions(false)
                            .build())
                    
                    .opcRequestId(requestId("transition-version"))
                    .build())
            .get__httpStatusCode__());

    assertNotNull(modelVersion);
    assertNotNull(workspaceModelVersion);
  }

  @AfterClass(
      alwaysRun = true,
      groups = {"sdk_tests", "sdk_mlops", "mlops", "rel_validation"})
  public void tearDown() {
    for (ModelVersionRef modelVersionRef : List.copyOf(createdModelVersions)) {
      try {
        deleteCreatedModelVersion(modelVersionRef.name(), modelVersionRef.version());
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (createdRegisteredModelName != null) {
      try {
        deleteRegisteredModel(createdRegisteredModelName);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (createdRunId != null) {
      try {
        deleteExperimentRun(workspaceKey, createdRunId);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (createdExperimentId != null) {
      try {
        deleteExperiment(workspaceKey, createdExperimentId);
      } catch (BmcException e) {
        if (e.getStatusCode() != 404) {
          throw e;
        }
      }
    }
    if (mlOpsClient != null) {
      mlOpsClient.close();
    }
  }

  private GetExperimentByIdResponse getExperimentById(String workspaceKey, String experimentId) {
    return mlOpsClient.getExperimentById(
        GetExperimentByIdRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .workspaceKey(workspaceKey)
            .experimentId(experimentId)
            
            .opcRequestId(requestId("get-experiment-by-id"))
            .build());
  }

  private String effectiveExperimentId() {
    return firstNonBlank(config.experimentId(), createdExperimentId, "missing-experiment");
  }

  private String effectiveExperimentName() {
    return firstNonBlank(config.experimentName(), createdExperimentName, "missing-experiment");
  }

  private String effectiveExperimentRunId() {
    return firstNonBlank(config.experimentRunId(), createdRunId, "missing-run");
  }

  private String effectiveRegisteredModelName() {
    return firstNonBlank(config.registeredModelName(), createdRegisteredModelName, "missing-model");
  }

  private String effectiveModelVersionKey() {
    if (config.modelVersionKey() != null && !config.modelVersionKey().isBlank()) {
      return config.modelVersionKey();
    }
    if (!createdModelVersions.isEmpty()) {
      return createdModelVersions.get(0).version();
    }
    return "missing-version";
  }

  private String firstNonBlank(String... values) {
    for (String value : values) {
      if (value != null && !value.isBlank()) {
        return value;
      }
    }
    return "";
  }

  private GetExperimentRunByIdResponse getExperimentRunById(String workspaceKey, String runId) {
    return mlOpsClient.getExperimentRunById(
        GetExperimentRunByIdRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .workspaceKey(workspaceKey)
            .runId(runId)
            
            .opcRequestId(requestId("get-run-by-id"))
            .build());
  }

  private GetRegisteredModelResponse getRegisteredModel(String modelName) {
    return mlOpsClient.getRegisteredModel(
        GetRegisteredModelRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .name(modelName)
            
            .opcRequestId(requestId("get-registered-model"))
            .build());
  }

  private GetModelVersionResponse getModelVersion(String modelName, String version) {
    return mlOpsClient.getModelVersion(
        GetModelVersionRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .name(modelName)
            .version(version)
            
            .opcRequestId(requestId("get-model-version"))
            .build());
  }

  private String createModelVersion(String modelName, boolean workspaceScoped) {
    CreateModelVersionDetails details =
        CreateModelVersionDetails.builder()
            .name(modelName)
            .source(modelVersionSource(createdRunId))
            .runId(createdRunId)
            .description("Created by MlOpsSdkIT")
            .tags(List.of(ModelVersionTag.builder().key("sdk_created").value("true").build()))
            .build();

    String version;
    if (workspaceScoped) {
      CreateWorkspaceModelVersionResponse response =
          mlOpsClient.createWorkspaceModelVersion(
              CreateWorkspaceModelVersionRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .workspaceKey(workspaceKey)
                  .createModelVersionDetails(details)
                  
                  .opcRetryToken(requestId("create-ws-version-retry"))
                  .opcRequestId(requestId("create-ws-version"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getCreateModelVersionResponseDetails());
      assertNotNull(response.getCreateModelVersionResponseDetails().getModelVersion());
      version = response.getCreateModelVersionResponseDetails().getModelVersion().getVersion();
    } else {
      CreateModelVersionResponse response =
          mlOpsClient.createModelVersion(
              CreateModelVersionRequest.builder()
                  .aiDataPlatformId(config.dataHubId())
                  .createModelVersionDetails(details)
                  
                  .opcRetryToken(requestId("create-version-retry"))
                  .opcRequestId(requestId("create-version"))
                  .build());
      assertSuccessful(response.get__httpStatusCode__());
      assertNotNull(response.getCreateModelVersionResponseDetails());
      assertNotNull(response.getCreateModelVersionResponseDetails().getModelVersion());
      version = response.getCreateModelVersionResponseDetails().getModelVersion().getVersion();
    }
    assertNotNull(version);
    createdModelVersions.add(new ModelVersionRef(modelName, version));
    return version;
  }

  private DeleteExperimentRunResponse deleteExperimentRun(String workspaceKey, String runId) {
    return mlOpsClient.deleteExperimentRun(
            DeleteExperimentRunRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .deleteExperimentRunDetails(DeleteExperimentRunDetails.builder().runId(runId).build())
                
                .opcRequestId(requestId("delete-run"))
                .build());
  }

  private DeleteExperimentResponse deleteExperiment(String workspaceKey, String experimentId) {
    return mlOpsClient.deleteExperiment(
            DeleteExperimentRequest.builder()
                .aiDataPlatformId(config.dataHubId())
                .workspaceKey(workspaceKey)
                .deleteExperimentDetails(
                    DeleteExperimentDetails.builder().experimentId(experimentId).build())
                
                .opcRequestId(requestId("delete-experiment"))
                .build());
  }

  private void deleteCreatedModelVersion(String modelName, String version) {
    assertSuccessful(
        mlOpsClient
            .deleteModelVersion(
                DeleteModelVersionRequest.builder()
                    .aiDataPlatformId(config.dataHubId())
                    .deleteModelVersionDetails(
                        DeleteModelVersionDetails.builder().name(modelName).version(version).build())
                    
                    .opcRequestId(requestId("delete-model-version"))
                    .build())
            .get__httpStatusCode__());
    createdModelVersions.remove(new ModelVersionRef(modelName, version));
  }

  private DeleteRegisteredModelResponse deleteRegisteredModel(String modelName) {
    return mlOpsClient.deleteRegisteredModel(
        DeleteRegisteredModelRequest.builder()
            .aiDataPlatformId(config.dataHubId())
            .deleteRegisteredModelDetails(DeleteRegisteredModelDetails.builder().name(modelName).build())
            
            .opcRequestId(requestId("delete-reg-model"))
            .build());
  }

  private String logModelJson(String runId) {
    String modelJson = config.mlOpsLogModelJson();
    if (modelJson == null || modelJson.isBlank()) {
      modelJson = defaultLogModelJson();
    }
    return modelJson
        .replace("${run_id}", runId)
        .replace("${artifact_path}", "sdk_model")
        .replace("${utc_time_created}", Instant.now().toString());
  }

  private String modelVersionSource(String runId) {
    return config.mlOpsModelVersionSource().replace("${run_id}", runId).replace("runId", runId);
  }

  private String qualifiedRegisteredModelName(String modelName) {
    if (modelName.chars().filter(ch -> ch == '.').count() >= 2) {
      return modelName;
    }
    return config.catalogKey() + ".default." + modelName;
  }

  private static String defaultLogModelJson() {
    return "{\"artifact_path\":\"${artifact_path}\","
        + "\"utc_time_created\":\"${utc_time_created}\","
        + "\"run_id\":\"${run_id}\","
        + "\"flavors\":{\"python_function\":{}}}";
  }

  private record ModelVersionRef(String name, String version) {}
}
