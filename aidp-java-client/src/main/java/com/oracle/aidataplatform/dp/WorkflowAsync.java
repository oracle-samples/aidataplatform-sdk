package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface WorkflowAsync extends AutoCloseable {

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
     * Cancels a job run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelAiDataPlatformJobRunResponse> cancelAiDataPlatformJobRun(CancelAiDataPlatformJobRunRequest request, com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse> handler);
    
    /**
     * Cancels all job runs for a given job.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CancelAiDataPlatformJobRunsResponse> cancelAiDataPlatformJobRuns(CancelAiDataPlatformJobRunsRequest request, com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse> handler);
    
    /**
     * Creates a job in an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformJobResponse> createAiDataPlatformJob(CreateAiDataPlatformJobRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse> handler);
    
    /**
     * Creates a job run for an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformJobRunResponse> createAiDataPlatformJobRun(CreateAiDataPlatformJobRunRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse> handler);
    
    /**
     * Deletes a job from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformJobResponse> deleteAiDataPlatformJob(DeleteAiDataPlatformJobRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse> handler);
    
    /**
     * Deletes a job run from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformJobRunResponse> deleteAiDataPlatformJobRun(DeleteAiDataPlatformJobRunRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse> handler);
    
    /**
     * Exports task run output in HTML or ipynb format.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportAiDataPlatformTaskRunOutputResponse> exportAiDataPlatformTaskRunOutput(ExportAiDataPlatformTaskRunOutputRequest request, com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse> handler);
    
    /**
     * Fetches the task run output from the runtime engine.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<FetchAiDataPlatformOutputResponse> fetchAiDataPlatformOutput(FetchAiDataPlatformOutputRequest request, com.oracle.bmc.responses.AsyncHandler<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse> handler);
    
    /**
     * Returns detailed information about a given job in AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformJobResponse> getAiDataPlatformJob(GetAiDataPlatformJobRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse> handler);
    
    /**
     * Returns detailed information about a given job run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformJobRunResponse> getAiDataPlatformJobRun(GetAiDataPlatformJobRunRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse> handler);
    
    /**
     * Returns detailed information about a task run with a given task run key.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformTaskRunResponse> getAiDataPlatformTaskRun(GetAiDataPlatformTaskRunRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse> handler);
    
    /**
     * Returns a list of job permissions.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformJobPermissionsResponse> listAiDataPlatformJobPermissions(ListAiDataPlatformJobPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse> handler);
    
    /**
     * Returns a detailed list of job runs in an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformJobRunsResponse> listAiDataPlatformJobRuns(ListAiDataPlatformJobRunsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse> handler);
    
    /**
     * Returns a list of jobs for a given AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformJobsResponse> listAiDataPlatformJobs(ListAiDataPlatformJobsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse> handler);
    
    /**
     * Returns a list of the latest job runs for a given job key.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformRecentJobRunsResponse> listAiDataPlatformRecentJobRuns(ListAiDataPlatformRecentJobRunsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse> handler);
    
    /**
     * Returns a list of tasks run in an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformTaskRunsResponse> listAiDataPlatformTaskRuns(ListAiDataPlatformTaskRunsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse> handler);
    
    /**
     * Update job permissions with the provided details.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformJobPermissionResponse> manageAiDataPlatformJobPermission(ManageAiDataPlatformJobPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse> handler);
    
    /**
     * Repairs and reruns a job run.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RepairAiDataPlatformJobRunResponse> repairAiDataPlatformJobRun(RepairAiDataPlatformJobRunRequest request, com.oracle.bmc.responses.AsyncHandler<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse> handler);
    
    /**
     * Update details for a job in AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformJobResponse> updateAiDataPlatformJob(UpdateAiDataPlatformJobRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse> handler);
    
}
