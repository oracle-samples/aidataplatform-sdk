package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface DeltaShareAsync extends AutoCloseable {

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
     * Creates a recipient for a Delta Share protocol in AI Data Platform Workbench.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformRecipientResponse> createAiDataPlatformRecipient(CreateAiDataPlatformRecipientRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse> handler);
    
    /**
     * Create a Delta Share protocol in AI Data Platform Workbench.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAiDataPlatformShareResponse> createAiDataPlatformShare(CreateAiDataPlatformShareRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse> handler);
    
    /**
     * Deletes a Delta Share recipient from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformRecipientResponse> deleteAiDataPlatformRecipient(DeleteAiDataPlatformRecipientRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse> handler);
    
    /**
     * Deletes a Delta Share from an AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAiDataPlatformShareResponse> deleteAiDataPlatformShare(DeleteAiDataPlatformShareRequest request, com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse> handler);
    
    /**
     * Gets detailed information about a Delta Share recipient in an AI Data Platform Workbench instance.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformRecipientResponse> getAiDataPlatformRecipient(GetAiDataPlatformRecipientRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse> handler);
    
    /**
     * Gets detailed information about a Delta Share.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformShareResponse> getAiDataPlatformShare(GetAiDataPlatformShareRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse> handler);
    
    /**
     * Gets a detailed list of Delta Share recipient permissions.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformRecipientPermissionsResponse> listAiDataPlatformRecipientPermissions(ListAiDataPlatformRecipientPermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse> handler);
    
    /**
     * Returns a list of Delta Shares that the specified recipient has been granted access to.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformRecipientSharesResponse> listAiDataPlatformRecipientShares(ListAiDataPlatformRecipientSharesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse> handler);
    
    /**
     * Gets a list of Delta Share recipients in a AI Data Platform Workbench instance.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformRecipientsResponse> listAiDataPlatformRecipients(ListAiDataPlatformRecipientsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse> handler);
    
    /**
     * Gets a list of Delta Shares assets in an AI Data Platform Workbench instance.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformShareDataAssetsResponse> listAiDataPlatformShareDataAssets(ListAiDataPlatformShareDataAssetsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse> handler);
    
    /**
     * Returns a list of Delta Shares that the specified recipient has been granted access to.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformSharePermissionsResponse> listAiDataPlatformSharePermissions(ListAiDataPlatformSharePermissionsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse> handler);
    
    /**
     * Gets a list of recipients that have been given access on the specified Delta Share.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformShareRecipientsResponse> listAiDataPlatformShareRecipients(ListAiDataPlatformShareRecipientsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse> handler);
    
    /**
     * Gets a list of Delta Shares in an AI Data Platform Workbench instance.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAiDataPlatformSharesResponse> listAiDataPlatformShares(ListAiDataPlatformSharesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse> handler);
    
    /**
     * Updates the permissions of a Delta Share recipient in AI Data Platform Workbench.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformRecipientPermissionResponse> manageAiDataPlatformRecipientPermission(ManageAiDataPlatformRecipientPermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse> handler);
    
    /**
     * Updates consumer-side access on a share for a recipient. A provider user can grant or revoke access on a particular share for a given recipient.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformShareAccessResponse> manageAiDataPlatformShareAccess(ManageAiDataPlatformShareAccessRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse> handler);
    
    /**
     * Updates data assets on a Delta Share with the provided information.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformShareDataAssetResponse> manageAiDataPlatformShareDataAsset(ManageAiDataPlatformShareDataAssetRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse> handler);
    
    /**
     * Updates permissions on a Delta Share.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageAiDataPlatformSharePermissionResponse> manageAiDataPlatformSharePermission(ManageAiDataPlatformSharePermissionRequest request, com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse> handler);
    
    /**
     * Updates the metadata of a Delta Share recipient in a AI Data Platform Workbench instance.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformRecipientResponse> updateAiDataPlatformRecipient(UpdateAiDataPlatformRecipientRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse> handler);
    
    /**
     * Update a Delta Share with the provided metadata.
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAiDataPlatformShareResponse> updateAiDataPlatformShare(UpdateAiDataPlatformShareRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse> handler);
    
}
