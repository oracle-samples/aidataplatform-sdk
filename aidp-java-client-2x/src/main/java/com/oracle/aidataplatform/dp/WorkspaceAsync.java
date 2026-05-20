// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface WorkspaceAsync extends AutoCloseable {

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
     * Creates a git folder in the workspace
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformGitFolderResponse> createAiDataPlatformGitFolder(CreateAiDataPlatformGitFolderRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformGitFolderRequest, CreateAiDataPlatformGitFolderResponse> handler);
    
    /**
     * Creates a workspace.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformWorkspaceResponse> createAiDataPlatformWorkspace(CreateAiDataPlatformWorkspaceRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceRequest, CreateAiDataPlatformWorkspaceResponse> handler);
    
    /**
     * Deletes a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformWorkspaceResponse> deleteAiDataPlatformWorkspace(DeleteAiDataPlatformWorkspaceRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceRequest, DeleteAiDataPlatformWorkspaceResponse> handler);
    
    /**
     * Gets detailed information about a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformWorkspaceResponse> getAiDataPlatformWorkspace(GetAiDataPlatformWorkspaceRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceRequest, GetAiDataPlatformWorkspaceResponse> handler);
    
    /**
     * Gets a list of create workspace permission summary objects.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformCreateWorkspacePermissionsResponse> listAiDataPlatformCreateWorkspacePermissions(ListAiDataPlatformCreateWorkspacePermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCreateWorkspacePermissionsRequest, ListAiDataPlatformCreateWorkspacePermissionsResponse> handler);
    
    /**
     * Gets a list of workspace permissions.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformWorkspacePermissionsResponse> listAiDataPlatformWorkspacePermissions(ListAiDataPlatformWorkspacePermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspacePermissionsRequest, ListAiDataPlatformWorkspacePermissionsResponse> handler);
    
    /**
     * Gets a list of workspaces.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformWorkspacesResponse> listAiDataPlatformWorkspaces(ListAiDataPlatformWorkspacesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspacesRequest, ListAiDataPlatformWorkspacesResponse> handler);
    
    /**
     * Updates create workspace permissions on a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformCreateWorkspacePermissionResponse> manageAiDataPlatformCreateWorkspacePermission(ManageAiDataPlatformCreateWorkspacePermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCreateWorkspacePermissionRequest, ManageAiDataPlatformCreateWorkspacePermissionResponse> handler);
    
    /**
     * Updates permissions on a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformWorkspacePermissionResponse> manageAiDataPlatformWorkspacePermission(ManageAiDataPlatformWorkspacePermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspacePermissionRequest, ManageAiDataPlatformWorkspacePermissionResponse> handler);
    
    /**
     * Updates the details of a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceResponse> updateAiDataPlatformWorkspace(UpdateAiDataPlatformWorkspaceRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceRequest, UpdateAiDataPlatformWorkspaceResponse> handler);
    
    /**
     * Updates the status of a workspace.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse> updateAiDataPlatformWorkspaceAsyncOperationStatus(UpdateAiDataPlatformWorkspaceAsyncOperationStatusRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceAsyncOperationStatusRequest, UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse> handler);
    
}
