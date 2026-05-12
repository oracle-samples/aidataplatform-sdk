package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface CatalogAsync extends AutoCloseable {

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
     * Test the connection of an AI Data Platform Workbench to an external catalog.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CatalogAiDataPlatformTestConnectionResponse> catalogAiDataPlatformTestConnection(CatalogAiDataPlatformTestConnectionRequest request, com.oracle.bmc.responses.AsyncHandler<CatalogAiDataPlatformTestConnectionRequest, CatalogAiDataPlatformTestConnectionResponse> handler);
    
    /**
     * Create a catalog in the AI Data Platform Workbench with the given ID.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformCatalogResponse> createAiDataPlatformCatalog(CreateAiDataPlatformCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformCatalogRequest, CreateAiDataPlatformCatalogResponse> handler);
    
    /**
     * Deletes the specified catalog from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformCatalogResponse> deleteAiDataPlatformCatalog(DeleteAiDataPlatformCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformCatalogRequest, DeleteAiDataPlatformCatalogResponse> handler);
    
    /**
     * Gets detailed information about an AI Data Platform Workbench catalog with a given catalog key.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformCatalogResponse> getAiDataPlatformCatalog(GetAiDataPlatformCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformCatalogRequest, GetAiDataPlatformCatalogResponse> handler);
    
    /**
     * Gets a list of all permissions in the specified catalog of an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformCatalogPermissionsResponse> listAiDataPlatformCatalogPermissions(ListAiDataPlatformCatalogPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogPermissionsRequest, ListAiDataPlatformCatalogPermissionsResponse> handler);
    
    /**
     * Get a list of catalogs in an AI Data Platform Workbench with a given ID.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformCatalogsResponse> listAiDataPlatformCatalogs(ListAiDataPlatformCatalogsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogsRequest, ListAiDataPlatformCatalogsResponse> handler);
    
    /**
     * Update permission details for a catalog in an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformCatalogPermissionResponse> manageAiDataPlatformCatalogPermission(ManageAiDataPlatformCatalogPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCatalogPermissionRequest, ManageAiDataPlatformCatalogPermissionResponse> handler);
    
    /**
     * Refresh a catalog in an AI Data Platform Workbench through a crawler.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RefreshAiDataPlatformCatalogResponse> refreshAiDataPlatformCatalog(RefreshAiDataPlatformCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformCatalogRequest, RefreshAiDataPlatformCatalogResponse> handler);
    
    /**
     * Update the details of an AI Data Platform Workbench catalog with the given information.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformCatalogResponse> updateAiDataPlatformCatalog(UpdateAiDataPlatformCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformCatalogRequest, UpdateAiDataPlatformCatalogResponse> handler);
    
}
