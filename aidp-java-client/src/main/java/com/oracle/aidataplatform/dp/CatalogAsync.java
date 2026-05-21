// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

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
    java.util.concurrent.Future<CatalogTestConnectionResponse> catalogTestConnection(CatalogTestConnectionRequest request, com.oracle.bmc.responses.AsyncHandler<CatalogTestConnectionRequest, CatalogTestConnectionResponse> handler);
    
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
    java.util.concurrent.Future<CreateCatalogResponse> createCatalog(CreateCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse> handler);
    
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
    java.util.concurrent.Future<DeleteCatalogResponse> deleteCatalog(DeleteCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse> handler);
    
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
    java.util.concurrent.Future<GetCatalogResponse> getCatalog(GetCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse> handler);
    
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
    java.util.concurrent.Future<ListCatalogPermissionsResponse> listCatalogPermissions(ListCatalogPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListCatalogPermissionsRequest, ListCatalogPermissionsResponse> handler);
    
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
    java.util.concurrent.Future<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request, com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse> handler);
    
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
    java.util.concurrent.Future<ManageCatalogPermissionResponse> manageCatalogPermission(ManageCatalogPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageCatalogPermissionRequest, ManageCatalogPermissionResponse> handler);
    
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
    java.util.concurrent.Future<RefreshCatalogResponse> refreshCatalog(RefreshCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<RefreshCatalogRequest, RefreshCatalogResponse> handler);
    
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
    java.util.concurrent.Future<UpdateCatalogResponse> updateCatalog(UpdateCatalogRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse> handler);
    
}
