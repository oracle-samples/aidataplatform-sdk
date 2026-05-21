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
    java.util.concurrent.Future<CreateExperimentResponse> createExperiment(CreateExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<CreateExperimentRequest, CreateExperimentResponse> handler);
    
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
    java.util.concurrent.Future<CreateExperimentRunResponse> createExperimentRun(CreateExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<CreateExperimentRunRequest, CreateExperimentRunResponse> handler);
    
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
    java.util.concurrent.Future<CreateModelVersionResponse> createModelVersion(CreateModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResponse> handler);
    
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
    java.util.concurrent.Future<CreateRegisteredModelResponse> createRegisteredModel(CreateRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<CreateRegisteredModelRequest, CreateRegisteredModelResponse> handler);
    
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
    java.util.concurrent.Future<CreateWorkspaceModelVersionResponse> createWorkspaceModelVersion(CreateWorkspaceModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceModelVersionRequest, CreateWorkspaceModelVersionResponse> handler);
    
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
    java.util.concurrent.Future<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResponse> handler);
    
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
    java.util.concurrent.Future<DeleteExperimentRunResponse> deleteExperimentRun(DeleteExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunRequest, DeleteExperimentRunResponse> handler);
    
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
    java.util.concurrent.Future<DeleteExperimentRunTagResponse> deleteExperimentRunTag(DeleteExperimentRunTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunTagRequest, DeleteExperimentRunTagResponse> handler);
    
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
    java.util.concurrent.Future<DeleteExperimentTagResponse> deleteExperimentTag(DeleteExperimentTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteExperimentTagRequest, DeleteExperimentTagResponse> handler);
    
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
    java.util.concurrent.Future<DeleteModelVersionResponse> deleteModelVersion(DeleteModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResponse> handler);
    
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
    java.util.concurrent.Future<DeleteModelVersionTagResponse> deleteModelVersionTag(DeleteModelVersionTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionTagRequest, DeleteModelVersionTagResponse> handler);
    
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
    java.util.concurrent.Future<DeleteRegisteredModelResponse> deleteRegisteredModel(DeleteRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelRequest, DeleteRegisteredModelResponse> handler);
    
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
    java.util.concurrent.Future<DeleteRegisteredModelTagResponse> deleteRegisteredModelTag(DeleteRegisteredModelTagRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelTagRequest, DeleteRegisteredModelTagResponse> handler);
    
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
    java.util.concurrent.Future<GetExperimentByIdResponse> getExperimentById(GetExperimentByIdRequest request, com.oracle.bmc.responses.AsyncHandler<GetExperimentByIdRequest, GetExperimentByIdResponse> handler);
    
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
    java.util.concurrent.Future<GetExperimentByNameResponse> getExperimentByName(GetExperimentByNameRequest request, com.oracle.bmc.responses.AsyncHandler<GetExperimentByNameRequest, GetExperimentByNameResponse> handler);
    
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
    java.util.concurrent.Future<GetExperimentRunByIdResponse> getExperimentRunById(GetExperimentRunByIdRequest request, com.oracle.bmc.responses.AsyncHandler<GetExperimentRunByIdRequest, GetExperimentRunByIdResponse> handler);
    
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
    java.util.concurrent.Future<GetExperimentRunMetricHistoryResponse> getExperimentRunMetricHistory(GetExperimentRunMetricHistoryRequest request, com.oracle.bmc.responses.AsyncHandler<GetExperimentRunMetricHistoryRequest, GetExperimentRunMetricHistoryResponse> handler);
    
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
    java.util.concurrent.Future<GetModelVersionResponse> getModelVersion(GetModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<GetModelVersionRequest, GetModelVersionResponse> handler);
    
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
    java.util.concurrent.Future<GetRegisteredModelResponse> getRegisteredModel(GetRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<GetRegisteredModelRequest, GetRegisteredModelResponse> handler);
    
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
    java.util.concurrent.Future<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request, com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse> handler);
    
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
    java.util.concurrent.Future<ListExperimentRunsResponse> listExperimentRuns(ListExperimentRunsRequest request, com.oracle.bmc.responses.AsyncHandler<ListExperimentRunsRequest, ListExperimentRunsResponse> handler);
    
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
    java.util.concurrent.Future<ListExperimentsResponse> listExperiments(ListExperimentsRequest request, com.oracle.bmc.responses.AsyncHandler<ListExperimentsRequest, ListExperimentsResponse> handler);
    
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
    java.util.concurrent.Future<ListLoggedModelsResponse> listLoggedModels(ListLoggedModelsRequest request, com.oracle.bmc.responses.AsyncHandler<ListLoggedModelsRequest, ListLoggedModelsResponse> handler);
    
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
    java.util.concurrent.Future<ListModelVersionsResponse> listModelVersions(ListModelVersionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListModelVersionsRequest, ListModelVersionsResponse> handler);
    
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
    java.util.concurrent.Future<ListRegisteredModelsResponse> listRegisteredModels(ListRegisteredModelsRequest request, com.oracle.bmc.responses.AsyncHandler<ListRegisteredModelsRequest, ListRegisteredModelsResponse> handler);
    
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
    java.util.concurrent.Future<LogExperimentRunBatchResponse> logExperimentRunBatch(LogExperimentRunBatchRequest request, com.oracle.bmc.responses.AsyncHandler<LogExperimentRunBatchRequest, LogExperimentRunBatchResponse> handler);
    
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
    java.util.concurrent.Future<LogExperimentRunInputsResponse> logExperimentRunInputs(LogExperimentRunInputsRequest request, com.oracle.bmc.responses.AsyncHandler<LogExperimentRunInputsRequest, LogExperimentRunInputsResponse> handler);
    
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
    java.util.concurrent.Future<LogExperimentRunMetricResponse> logExperimentRunMetric(LogExperimentRunMetricRequest request, com.oracle.bmc.responses.AsyncHandler<LogExperimentRunMetricRequest, LogExperimentRunMetricResponse> handler);
    
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
    java.util.concurrent.Future<LogExperimentRunModelResponse> logExperimentRunModel(LogExperimentRunModelRequest request, com.oracle.bmc.responses.AsyncHandler<LogExperimentRunModelRequest, LogExperimentRunModelResponse> handler);
    
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
    java.util.concurrent.Future<LogExperimentRunParamResponse> logExperimentRunParam(LogExperimentRunParamRequest request, com.oracle.bmc.responses.AsyncHandler<LogExperimentRunParamRequest, LogExperimentRunParamResponse> handler);
    
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
    java.util.concurrent.Future<RenameRegisteredModelResponse> renameRegisteredModel(RenameRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<RenameRegisteredModelRequest, RenameRegisteredModelResponse> handler);
    
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
    java.util.concurrent.Future<RestoreExperimentResponse> restoreExperiment(RestoreExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRequest, RestoreExperimentResponse> handler);
    
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
    java.util.concurrent.Future<RestoreExperimentRunResponse> restoreExperimentRun(RestoreExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRunRequest, RestoreExperimentRunResponse> handler);
    
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
    java.util.concurrent.Future<SetExperimentRunTagResponse> setExperimentRunTag(SetExperimentRunTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetExperimentRunTagRequest, SetExperimentRunTagResponse> handler);
    
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
    java.util.concurrent.Future<SetExperimentTagResponse> setExperimentTag(SetExperimentTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetExperimentTagRequest, SetExperimentTagResponse> handler);
    
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
    java.util.concurrent.Future<SetModelVersionTagResponse> setModelVersionTag(SetModelVersionTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetModelVersionTagRequest, SetModelVersionTagResponse> handler);
    
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
    java.util.concurrent.Future<SetRegisteredModelTagResponse> setRegisteredModelTag(SetRegisteredModelTagRequest request, com.oracle.bmc.responses.AsyncHandler<SetRegisteredModelTagRequest, SetRegisteredModelTagResponse> handler);
    
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
    java.util.concurrent.Future<TransitionModelVersionStageResponse> transitionModelVersionStage(TransitionModelVersionStageRequest request, com.oracle.bmc.responses.AsyncHandler<TransitionModelVersionStageRequest, TransitionModelVersionStageResponse> handler);
    
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
    java.util.concurrent.Future<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResponse> handler);
    
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
    java.util.concurrent.Future<UpdateExperimentRunResponse> updateExperimentRun(UpdateExperimentRunRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunRequest, UpdateExperimentRunResponse> handler);
    
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
    java.util.concurrent.Future<UpdateExperimentRunTagsResponse> updateExperimentRunTags(UpdateExperimentRunTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunTagsRequest, UpdateExperimentRunTagsResponse> handler);
    
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
    java.util.concurrent.Future<UpdateExperimentTagsResponse> updateExperimentTags(UpdateExperimentTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateExperimentTagsRequest, UpdateExperimentTagsResponse> handler);
    
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
    java.util.concurrent.Future<UpdateModelVersionResponse> updateModelVersion(UpdateModelVersionRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResponse> handler);
    
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
    java.util.concurrent.Future<UpdateModelVersionTagsResponse> updateModelVersionTags(UpdateModelVersionTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionTagsRequest, UpdateModelVersionTagsResponse> handler);
    
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
    java.util.concurrent.Future<UpdateRegisteredModelResponse> updateRegisteredModel(UpdateRegisteredModelRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelRequest, UpdateRegisteredModelResponse> handler);
    
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
    java.util.concurrent.Future<UpdateRegisteredModelTagsResponse> updateRegisteredModelTags(UpdateRegisteredModelTagsRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelTagsRequest, UpdateRegisteredModelTagsResponse> handler);
    
}
