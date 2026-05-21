// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface WorkspaceObjectAsync extends AutoCloseable {

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
     * Copy a workspace object to different location.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CopyWorkspaceObjectResponse> copyWorkspaceObject(CopyWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<CopyWorkspaceObjectRequest, CopyWorkspaceObjectResponse> handler);
    
    /**
     * Creates a workspace object. You can create a file or folder in the workspace.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateWorkspaceObjectResponse> createWorkspaceObject(CreateWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceObjectRequest, CreateWorkspaceObjectResponse> handler);
    
    /**
     * Deletes a workspace object.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkspaceObjectResponse> deleteWorkspaceObject(DeleteWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteWorkspaceObjectRequest, DeleteWorkspaceObjectResponse> handler);
    
    /**
     * Downloads a workspace file by providing the PAR info for downloading the file for given path.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadWorkspaceObjectWithParResponse> downloadWorkspaceObjectWithPar(DownloadWorkspaceObjectWithParRequest request, com.oracle.bmc.responses.AsyncHandler<DownloadWorkspaceObjectWithParRequest, DownloadWorkspaceObjectWithParResponse> handler);
    
    /**
     * Returns detailed information about a workspace object.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkspaceObjectResponse> getWorkspaceObject(GetWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<GetWorkspaceObjectRequest, GetWorkspaceObjectResponse> handler);
    
    /**
     * Returns metadata about a workspace object. The contents of the file are not retrieved.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<HeadWorkspaceObjectResponse> headWorkspaceObject(HeadWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<HeadWorkspaceObjectRequest, HeadWorkspaceObjectResponse> handler);
    
    /**
     * Returns a list of workspace object permissions.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkspaceObjectPermissionsResponse> listWorkspaceObjectPermissions(ListWorkspaceObjectPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListWorkspaceObjectPermissionsRequest, ListWorkspaceObjectPermissionsResponse> handler);
    
    /**
     * Returns a list of objects in the workspace.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkspaceObjectsResponse> listWorkspaceObjects(ListWorkspaceObjectsRequest request, com.oracle.bmc.responses.AsyncHandler<ListWorkspaceObjectsRequest, ListWorkspaceObjectsResponse> handler);
    
    /**
     * Updates permissions on a workspace object.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageWorkspaceObjectPermissionResponse> manageWorkspaceObjectPermission(ManageWorkspaceObjectPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageWorkspaceObjectPermissionRequest, ManageWorkspaceObjectPermissionResponse> handler);
    
    /**
     * Moves a workspace object to different location.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MoveWorkspaceObjectResponse> moveWorkspaceObject(MoveWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<MoveWorkspaceObjectRequest, MoveWorkspaceObjectResponse> handler);
    
    /**
     * Renames a workspace object.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RenameWorkspaceObjectResponse> renameWorkspaceObject(RenameWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<RenameWorkspaceObjectRequest, RenameWorkspaceObjectResponse> handler);
    
    /**
     * Updates a workspace object with the provided information.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWorkspaceObjectResponse> updateWorkspaceObject(UpdateWorkspaceObjectRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceObjectRequest, UpdateWorkspaceObjectResponse> handler);
    
    /**
     * Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadWorkspaceObjectWithParResponse> uploadWorkspaceObjectWithPar(UploadWorkspaceObjectWithParRequest request, com.oracle.bmc.responses.AsyncHandler<UploadWorkspaceObjectWithParRequest, UploadWorkspaceObjectWithParResponse> handler);
    
}
