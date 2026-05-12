package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface MLOpsAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the 
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Create an Experiment in a Workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformExperimentResponse> createAiDataPlatformExperiment(CreateAiDataPlatformExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse> handler);
    
    /**
     * Create a new run within an Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformExperimentRunResponse> createAiDataPlatformExperimentRun(CreateAiDataPlatformExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse> handler);
    
    /**
     * Create a ModelVersion.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformModelVersionResponse> createAiDataPlatformModelVersion(CreateAiDataPlatformModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse> handler);
    
    /**
     * Create a RegisteredModel in a Workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformRegisteredModelResponse> createAiDataPlatformRegisteredModel(CreateAiDataPlatformRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse> handler);
    
    /**
     * Create a ModelVersion in a specified Workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformWorkspaceModelVersionResponse> createAiDataPlatformWorkspaceModelVersion(CreateAiDataPlatformWorkspaceModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse> handler);
    
    /**
     * Delete an Experiment
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformExperimentResponse> deleteAiDataPlatformExperiment(DeleteAiDataPlatformExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse> handler);
    
    /**
     * Delete an Experiment Run
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunResponse> deleteAiDataPlatformExperimentRun(DeleteAiDataPlatformExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse> handler);
    
    /**
     * Delete a tag on an Experiment Run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunTagResponse> deleteAiDataPlatformExperimentRunTag(DeleteAiDataPlatformExperimentRunTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse> handler);
    
    /**
     * Delete a tag on an Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformExperimentTagResponse> deleteAiDataPlatformExperimentTag(DeleteAiDataPlatformExperimentTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse> handler);
    
    /**
     * Delete a ModelVersion
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformModelVersionResponse> deleteAiDataPlatformModelVersion(DeleteAiDataPlatformModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse> handler);
    
    /**
     * Delete a tag on ModelVersion.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformModelVersionTagResponse> deleteAiDataPlatformModelVersionTag(DeleteAiDataPlatformModelVersionTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse> handler);
    
    /**
     * Delete a RegisteredModel
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelResponse> deleteAiDataPlatformRegisteredModel(DeleteAiDataPlatformRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse> handler);
    
    /**
     * Delete a tag on RegisteredModel.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelTagResponse> deleteAiDataPlatformRegisteredModelTag(DeleteAiDataPlatformRegisteredModelTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse> handler);
    
    /**
     * Get metadata for an experiment by ID. This method works on deleted experiments.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformExperimentByIdResponse> getAiDataPlatformExperimentById(GetAiDataPlatformExperimentByIdRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse> handler);
    
    /**
     * This endpoint will return deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformExperimentByNameResponse> getAiDataPlatformExperimentByName(GetAiDataPlatformExperimentByNameRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse> handler);
    
    /**
     * Get details of an experiment run by ID.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformExperimentRunByIdResponse> getAiDataPlatformExperimentRunById(GetAiDataPlatformExperimentRunByIdRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse> handler);
    
    /**
     * Returns a history of ExperimentRun metric.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformExperimentRunMetricHistoryResponse> getAiDataPlatformExperimentRunMetricHistory(GetAiDataPlatformExperimentRunMetricHistoryRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse> handler);
    
    /**
     * Get details for ModelVersion.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformModelVersionResponse> getAiDataPlatformModelVersion(GetAiDataPlatformModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse> handler);
    
    /**
     * Get details for RegisteredModel.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformRegisteredModelResponse> getAiDataPlatformRegisteredModel(GetAiDataPlatformRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse> handler);
    
    /**
     * Returns a list of Artifacts.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformArtifactsResponse> listAiDataPlatformArtifacts(ListAiDataPlatformArtifactsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse> handler);
    
    /**
     * Returns a list of Experiment Runs in a Workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformExperimentRunsResponse> listAiDataPlatformExperimentRuns(ListAiDataPlatformExperimentRunsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse> handler);
    
    /**
     * Returns a list of Experiments.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformExperimentsResponse> listAiDataPlatformExperiments(ListAiDataPlatformExperimentsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse> handler);
    
    /**
     * Returns a list of LoggedModels.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformLoggedModelsResponse> listAiDataPlatformLoggedModels(ListAiDataPlatformLoggedModelsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse> handler);
    
    /**
     * Returns a list of ModelVersions.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformModelVersionsResponse> listAiDataPlatformModelVersions(ListAiDataPlatformModelVersionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse> handler);
    
    /**
     * Returns a list of RegisteredModels in a Workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformRegisteredModelsResponse> listAiDataPlatformRegisteredModels(ListAiDataPlatformRegisteredModelsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse> handler);
    
    /**
     * Log an Experiment Run Batch.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LogAiDataPlatformExperimentRunBatchResponse> logAiDataPlatformExperimentRunBatch(LogAiDataPlatformExperimentRunBatchRequest request, com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse> handler);
    
    /**
     * Log an Experiment Run Inputs.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LogAiDataPlatformExperimentRunInputsResponse> logAiDataPlatformExperimentRunInputs(LogAiDataPlatformExperimentRunInputsRequest request, com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse> handler);
    
    /**
     * Log an Experiment Run Metric.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LogAiDataPlatformExperimentRunMetricResponse> logAiDataPlatformExperimentRunMetric(LogAiDataPlatformExperimentRunMetricRequest request, com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse> handler);
    
    /**
     * Log an Experiment Run Model.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LogAiDataPlatformExperimentRunModelResponse> logAiDataPlatformExperimentRunModel(LogAiDataPlatformExperimentRunModelRequest request, com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse> handler);
    
    /**
     * Log an Experiment Run Param.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<LogAiDataPlatformExperimentRunParamResponse> logAiDataPlatformExperimentRunParam(LogAiDataPlatformExperimentRunParamRequest request, com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse> handler);
    
    /**
     * Rename a RegisteredModel.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RenameAiDataPlatformRegisteredModelResponse> renameAiDataPlatformRegisteredModel(RenameAiDataPlatformRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse> handler);
    
    /**
     * Restore an Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreAiDataPlatformExperimentResponse> restoreAiDataPlatformExperiment(RestoreAiDataPlatformExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse> handler);
    
    /**
     * Restore an Experiment Run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestoreAiDataPlatformExperimentRunResponse> restoreAiDataPlatformExperimentRun(RestoreAiDataPlatformExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse> handler);
    
    /**
     * Set a tag on an Experiment Run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetAiDataPlatformExperimentRunTagResponse> setAiDataPlatformExperimentRunTag(SetAiDataPlatformExperimentRunTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse> handler);
    
    /**
     * Set a tag on an Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetAiDataPlatformExperimentTagResponse> setAiDataPlatformExperimentTag(SetAiDataPlatformExperimentTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse> handler);
    
    /**
     * Set a tag on ModelVersion.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetAiDataPlatformModelVersionTagResponse> setAiDataPlatformModelVersionTag(SetAiDataPlatformModelVersionTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse> handler);
    
    /**
     * Set a tag on RegisteredModel.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SetAiDataPlatformRegisteredModelTagResponse> setAiDataPlatformRegisteredModelTag(SetAiDataPlatformRegisteredModelTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse> handler);
    
    /**
     * Transition a ModelVersion stage
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TransitionAiDataPlatformModelVersionStageResponse> transitionAiDataPlatformModelVersionStage(TransitionAiDataPlatformModelVersionStageRequest request, com.oracle.bmc.responses.AsyncHandler<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse> handler);
    
    /**
     * Update an Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformExperimentResponse> updateAiDataPlatformExperiment(UpdateAiDataPlatformExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse> handler);
    
    /**
     * Update an Experiment Run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunResponse> updateAiDataPlatformExperimentRun(UpdateAiDataPlatformExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse> handler);
    
    /**
     * Update tags on ExperimentRun.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunTagsResponse> updateAiDataPlatformExperimentRunTags(UpdateAiDataPlatformExperimentRunTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse> handler);
    
    /**
     * Update tags on Experiment.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformExperimentTagsResponse> updateAiDataPlatformExperimentTags(UpdateAiDataPlatformExperimentTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse> handler);
    
    /**
     * Update a ModelVersion
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformModelVersionResponse> updateAiDataPlatformModelVersion(UpdateAiDataPlatformModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse> handler);
    
    /**
     * Update tags on ModelVersion.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformModelVersionTagsResponse> updateAiDataPlatformModelVersionTags(UpdateAiDataPlatformModelVersionTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse> handler);
    
    /**
     * Update a RegisteredModel
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelResponse> updateAiDataPlatformRegisteredModel(UpdateAiDataPlatformRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse> handler);
    
    /**
     * Update tags on RegisteredModel.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelTagsResponse> updateAiDataPlatformRegisteredModelTags(UpdateAiDataPlatformRegisteredModelTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse> handler);
    
}
