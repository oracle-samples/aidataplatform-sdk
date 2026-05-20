// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
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
     * (Preview) Creates an experiment in a workspace.
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
     * (Preview) Creates a new run within an experiment.
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
     * (Preview) Creates a model version.
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
     * (Preview) Creates a registered model in a workspace.
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
     * (Preview) Creates a new model version in a specified workspace.
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
     * (Preview) Deletes an experiment.
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
     * (Preview) Deletes an experiment run.
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
     * (Preview) Deletes a tag on an experiment run.
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
     * (Preview) Deletes a tag on an experiment.
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
     * (Preview) Deletes a model version.
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
     * (Preview) Deletes a tag on a model version.
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
     * (Preview) Deletes a registered model.
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
     * (Preview) Deletes a tag on a registered model.
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
     * (Preview) Returns metadata for an experiment by ID. This method works on deleted experiments.
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
     * (Preview) Returns experiment metadata for a given name. Returns deleted experiments, but prefers the active experiment if an active and deleted experiment share the same name. If multiple deleted experiments share the same name, the API will return one of them.
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
     * (Preview) Returns details of an experiment run by ID.
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
     * (Preview) Returns a history of experiment run metrics.
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
     * (Preview)  Returns detailed information for a model version.
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
     * (Preview) Returns details for a specified registered model.
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
     * (Preview) Returns a list of artifacts.
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
     * (Preview) Returns a list of experiment runs in a workspace.
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
     * (Preview) Returns a list of experiments with the given details.
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
     * (Preview) Returns a list of logged models.
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
     * (Preview) Returns a list of model versions.
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
     * (Preview) Returns a list of registered models in a workspace.
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
     * (Preview) Logs an experiment run batch.
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
     * (Preview) Logs experiment run inputs.
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
     * (Preview) Logs an experiment run metric.
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
     * (Preview) Logs an experiment run model.
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
     * (Preview) Logs an experiment run parameter.
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
     * (Preview) Renames a registered model.
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
     * (Preview) Restores an experiment.
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
     * (Preview) Restores an experiment run.
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
     * (Preview) Sets a tag on an experiment run.
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
     * (Preview) Sets a tag on an experiment.
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
     * (Preview) Sets a tag on a model version.
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
     * (Preview) Sets a tag on a registered model.
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
     * (Preview) Transitions a model version stage.
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
     * (Preview) Updates an experiment.
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
     * (Preview) Updates an experiment run.
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
     * (Preview) Updates tags on an experiment run.
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
     * (Preview) Updates tags on experiment.
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
     * (Preview) Updates a model version
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
     * (Preview) Updates tags on a model version.
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
     * (Preview) Updates a registered model with the provided details.
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
     * (Preview) Updates tags on a registered model.
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
