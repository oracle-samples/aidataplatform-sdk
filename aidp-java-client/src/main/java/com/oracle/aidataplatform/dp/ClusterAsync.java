// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface ClusterAsync extends AutoCloseable {

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
     * Creates a new cluster with the provided details.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformClusterResponse> createAiDataPlatformCluster(CreateAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformClusterRequest, CreateAiDataPlatformClusterResponse> handler);
    
    /**
     * Deletes a cluster from a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformClusterResponse> deleteAiDataPlatformCluster(DeleteAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformClusterRequest, DeleteAiDataPlatformClusterResponse> handler);
    
    /**
     * Downloads logs within the specified cluster and time range.
* The logs can be filtered by severity (`logLevel`), type (`logContentTypeContains`),
* and other parameters such as execution context and thread identifiers.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadAiDataPlatformClusterLogsResponse> downloadAiDataPlatformClusterLogs(DownloadAiDataPlatformClusterLogsRequest request, com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformClusterLogsRequest, DownloadAiDataPlatformClusterLogsResponse> handler);
    
    /**
     * Returns detailed information about a cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformClusterResponse> getAiDataPlatformCluster(GetAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformClusterRequest, GetAiDataPlatformClusterResponse> handler);
    
    /**
     * Gets information about the master catalog default cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformDefaultClusterResponse> getAiDataPlatformDefaultCluster(GetAiDataPlatformDefaultClusterRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformDefaultClusterRequest, GetAiDataPlatformDefaultClusterResponse> handler);
    
    /**
     * Gets a list of libraries installed on a cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformClusterLibrariesResponse> listAiDataPlatformClusterLibraries(ListAiDataPlatformClusterLibrariesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformClusterLibrariesRequest, ListAiDataPlatformClusterLibrariesResponse> handler);
    
    /**
     * Return a list of permissions for a given cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformClusterPermissionsResponse> listAiDataPlatformClusterPermissions(ListAiDataPlatformClusterPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformClusterPermissionsRequest, ListAiDataPlatformClusterPermissionsResponse> handler);
    
    /**
     * Returns a list of all clusters in a given workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformClustersResponse> listAiDataPlatformClusters(ListAiDataPlatformClustersRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformClustersRequest, ListAiDataPlatformClustersResponse> handler);
    
    /**
     * Updates the permissions for a given cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformClusterPermissionResponse> manageAiDataPlatformClusterPermission(ManageAiDataPlatformClusterPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformClusterPermissionRequest, ManageAiDataPlatformClusterPermissionResponse> handler);
    
    /**
     * Updates libraries of a cluster with the provided patches.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PatchAiDataPlatformClusterLibraryResponse> patchAiDataPlatformClusterLibrary(PatchAiDataPlatformClusterLibraryRequest request, com.oracle.bmc.responses.AsyncHandler<PatchAiDataPlatformClusterLibraryRequest, PatchAiDataPlatformClusterLibraryResponse> handler);
    
    /**
     * Restarts a running cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RestartAiDataPlatformClusterResponse> restartAiDataPlatformCluster(RestartAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<RestartAiDataPlatformClusterRequest, RestartAiDataPlatformClusterResponse> handler);
    
    /**
     * Searches logs within the specified cluster and time range. Supports pagination and filtering.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SearchAiDataPlatformClusterLogsResponse> searchAiDataPlatformClusterLogs(SearchAiDataPlatformClusterLogsRequest request, com.oracle.bmc.responses.AsyncHandler<SearchAiDataPlatformClusterLogsRequest, SearchAiDataPlatformClusterLogsResponse> handler);
    
    /**
     * Starts a cluster that has halted operation.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartAiDataPlatformClusterResponse> startAiDataPlatformCluster(StartAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<StartAiDataPlatformClusterRequest, StartAiDataPlatformClusterResponse> handler);
    
    /**
     * Stops an active cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopAiDataPlatformClusterResponse> stopAiDataPlatformCluster(StopAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<StopAiDataPlatformClusterRequest, StopAiDataPlatformClusterResponse> handler);
    
    /**
     * Provides summarized compute metrics for a compute cluster in the given workspace.
* This API aggregates metric data points based on a specified namespace, metric name, 
* and aggregation type. The response contains computed metric summaries.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAiDataPlatformMetricsDataResponse> summarizeAiDataPlatformMetricsData(SummarizeAiDataPlatformMetricsDataRequest request, com.oracle.bmc.responses.AsyncHandler<SummarizeAiDataPlatformMetricsDataRequest, SummarizeAiDataPlatformMetricsDataResponse> handler);
    
    /**
     * Update the details of a given cluster.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformClusterResponse> updateAiDataPlatformCluster(UpdateAiDataPlatformClusterRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformClusterRequest, UpdateAiDataPlatformClusterResponse> handler);
    
}
