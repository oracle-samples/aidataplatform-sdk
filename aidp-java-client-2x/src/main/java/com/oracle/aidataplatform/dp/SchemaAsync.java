package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface SchemaAsync extends AutoCloseable {

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
     * Creates a managed table with data loaded from a sample file.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformDataTableResponse> createAiDataPlatformDataTable(CreateAiDataPlatformDataTableRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformDataTableRequest, CreateAiDataPlatformDataTableResponse> handler);
    
    /**
     * Creates a schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformSchemaResponse> createAiDataPlatformSchema(CreateAiDataPlatformSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformSchemaRequest, CreateAiDataPlatformSchemaResponse> handler);
    
    /**
     * Creates a table.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformTableResponse> createAiDataPlatformTable(CreateAiDataPlatformTableRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformTableRequest, CreateAiDataPlatformTableResponse> handler);
    
    /**
     * Creates a view.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformViewResponse> createAiDataPlatformView(CreateAiDataPlatformViewRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformViewRequest, CreateAiDataPlatformViewResponse> handler);
    
    /**
     * Deletes a schema from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformSchemaResponse> deleteAiDataPlatformSchema(DeleteAiDataPlatformSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformSchemaRequest, DeleteAiDataPlatformSchemaResponse> handler);
    
    /**
     * Deletes a table from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformTableResponse> deleteAiDataPlatformTable(DeleteAiDataPlatformTableRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformTableRequest, DeleteAiDataPlatformTableResponse> handler);
    
    /**
     * Deletes a view from AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformViewResponse> deleteAiDataPlatformView(DeleteAiDataPlatformViewRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformViewRequest, DeleteAiDataPlatformViewResponse> handler);
    
    /**
     * Generates a URI for uploading a sample file to a temporary folder in a schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAiDataPlatformTempFileUploadTargetResponse> generateAiDataPlatformTempFileUploadTarget(GenerateAiDataPlatformTempFileUploadTargetRequest request, com.oracle.bmc.responses.AsyncHandler<GenerateAiDataPlatformTempFileUploadTargetRequest, GenerateAiDataPlatformTempFileUploadTargetResponse> handler);
    
    /**
     * Returns detailed information about a specified schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformSchemaResponse> getAiDataPlatformSchema(GetAiDataPlatformSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformSchemaRequest, GetAiDataPlatformSchemaResponse> handler);
    
    /**
     * Returns detailed information about a table.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformTableResponse> getAiDataPlatformTable(GetAiDataPlatformTableRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTableRequest, GetAiDataPlatformTableResponse> handler);
    
    /**
     * Returns information about a view.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformViewResponse> getAiDataPlatformView(GetAiDataPlatformViewRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformViewRequest, GetAiDataPlatformViewResponse> handler);
    
    /**
     * Returns a list of permissions for a given schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformSchemaPermissionsResponse> listAiDataPlatformSchemaPermissions(ListAiDataPlatformSchemaPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemaPermissionsRequest, ListAiDataPlatformSchemaPermissionsResponse> handler);
    
    /**
     * Returns a list of schemas in a given AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformSchemasResponse> listAiDataPlatformSchemas(ListAiDataPlatformSchemasRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemasRequest, ListAiDataPlatformSchemasResponse> handler);
    
    /**
     * Returns a list of permissions for a given table.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformTablePermissionsResponse> listAiDataPlatformTablePermissions(ListAiDataPlatformTablePermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablePermissionsRequest, ListAiDataPlatformTablePermissionsResponse> handler);
    
    /**
     * Returns a list of tables in a schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformTablesResponse> listAiDataPlatformTables(ListAiDataPlatformTablesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablesRequest, ListAiDataPlatformTablesResponse> handler);
    
    /**
     * Returns a list of view permissions.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformViewPermissionsResponse> listAiDataPlatformViewPermissions(ListAiDataPlatformViewPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewPermissionsRequest, ListAiDataPlatformViewPermissionsResponse> handler);
    
    /**
     * Returns a list of views in a schema.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformViewsResponse> listAiDataPlatformViews(ListAiDataPlatformViewsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewsRequest, ListAiDataPlatformViewsResponse> handler);
    
    /**
     * Updates the permissions for a given schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformSchemaPermissionResponse> manageAiDataPlatformSchemaPermission(ManageAiDataPlatformSchemaPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSchemaPermissionRequest, ManageAiDataPlatformSchemaPermissionResponse> handler);
    
    /**
     * Updates the permissions for a given table.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformTablePermissionResponse> manageAiDataPlatformTablePermission(ManageAiDataPlatformTablePermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformTablePermissionRequest, ManageAiDataPlatformTablePermissionResponse> handler);
    
    /**
     * Updates permissions on a view.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformViewPermissionResponse> manageAiDataPlatformViewPermission(ManageAiDataPlatformViewPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformViewPermissionRequest, ManageAiDataPlatformViewPermissionResponse> handler);
    
    /**
     * Returns details of a table schema from the specified location.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PerformAiDataPlatformInferSchemaResponse> performAiDataPlatformInferSchema(PerformAiDataPlatformInferSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaRequest, PerformAiDataPlatformInferSchemaResponse> handler);
    
    /**
     * Returns table schema and data from the specified location.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PerformAiDataPlatformInferSchemaWithPreviewResponse> performAiDataPlatformInferSchemaWithPreview(PerformAiDataPlatformInferSchemaWithPreviewRequest request, com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaWithPreviewRequest, PerformAiDataPlatformInferSchemaWithPreviewResponse> handler);
    
    /**
     * Refreshes schema in an AI Data Platform Workbench through the crawler.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshAiDataPlatformSchemaResponse> refreshAiDataPlatformSchema(RefreshAiDataPlatformSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformSchemaRequest, RefreshAiDataPlatformSchemaResponse> handler);
    
    /**
     * Refreshes a table in an AI Data Platform Workbench through the crawler.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshAiDataPlatformTableResponse> refreshAiDataPlatformTable(RefreshAiDataPlatformTableRequest request, com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformTableRequest, RefreshAiDataPlatformTableResponse> handler);
    
    /**
     * Retrieve PAR for the entities created in AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RetrieveAiDataPlatformParResponse> retrieveAiDataPlatformPar(RetrieveAiDataPlatformParRequest request, com.oracle.bmc.responses.AsyncHandler<RetrieveAiDataPlatformParRequest, RetrieveAiDataPlatformParResponse> handler);
    
    /**
     * Updates a schema.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformSchemaResponse> updateAiDataPlatformSchema(UpdateAiDataPlatformSchemaRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformSchemaRequest, UpdateAiDataPlatformSchemaResponse> handler);
    
    /**
     * Updates a table with provided details.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformTableResponse> updateAiDataPlatformTable(UpdateAiDataPlatformTableRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformTableRequest, UpdateAiDataPlatformTableResponse> handler);
    
    /**
     * Updates a view with given information.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformViewResponse> updateAiDataPlatformView(UpdateAiDataPlatformViewRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformViewRequest, UpdateAiDataPlatformViewResponse> handler);
    
}
