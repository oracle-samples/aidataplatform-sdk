// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface WorkspaceObject extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CopyAiDataPlatformWorkspaceObjectResponse copyAiDataPlatformWorkspaceObject(CopyAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Creates a workspace object. You can create a file or folder in the workspace.
* 
*
* Note: This operation consumes a stream.
*
* If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
* necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
* operation is called}.
*
* Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
* will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
* the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
* was called.
*
* If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
* can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
* support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
* above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
* named pipe), then the stream's contents will be buffered in memory, as described below.
*
* If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
* the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
* be buffered in memory. Then the same procedure as above is followed.
*
* The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
* {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
* This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
* is larger, do not use built-in retries and manage retries yourself.
*
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CreateAiDataPlatformWorkspaceObjectResponse createAiDataPlatformWorkspaceObject(CreateAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Deletes a workspace object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    DeleteAiDataPlatformWorkspaceObjectResponse deleteAiDataPlatformWorkspaceObject(DeleteAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Downloads a workspace file by providing the PAR info for downloading the file for given path.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    DownloadAiDataPlatformWorkspaceObjectWithParResponse downloadAiDataPlatformWorkspaceObjectWithPar(DownloadAiDataPlatformWorkspaceObjectWithParRequest request);
    
    /**
     * Returns detailed information about a workspace object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    GetAiDataPlatformWorkspaceObjectResponse getAiDataPlatformWorkspaceObject(GetAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Returns metadata about a workspace object. The contents of the file are not retrieved.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    HeadAiDataPlatformWorkspaceObjectResponse headAiDataPlatformWorkspaceObject(HeadAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Returns a list of workspace object permissions.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ListAiDataPlatformWorkspaceObjectPermissionsResponse listAiDataPlatformWorkspaceObjectPermissions(ListAiDataPlatformWorkspaceObjectPermissionsRequest request);
    
    /**
     * Returns a list of objects in the workspace.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ListAiDataPlatformWorkspaceObjectsResponse listAiDataPlatformWorkspaceObjects(ListAiDataPlatformWorkspaceObjectsRequest request);
    
    /**
     * Updates permissions on a workspace object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ManageAiDataPlatformWorkspaceObjectPermissionResponse manageAiDataPlatformWorkspaceObjectPermission(ManageAiDataPlatformWorkspaceObjectPermissionRequest request);
    
    /**
     * Moves a workspace object to different location.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    MoveAiDataPlatformWorkspaceObjectResponse moveAiDataPlatformWorkspaceObject(MoveAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Renames a workspace object.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    RenameAiDataPlatformWorkspaceObjectResponse renameAiDataPlatformWorkspaceObject(RenameAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Updates a workspace object with the provided information.
*
* Note: This operation consumes a stream.
*
* If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
* necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
* operation is called}.
*
* Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
* will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
* the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
* was called.
*
* If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
* can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
* support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
* above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
* named pipe), then the stream's contents will be buffered in memory, as described below.
*
* If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
* the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
* be buffered in memory. Then the same procedure as above is followed.
*
* The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
* {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
* This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
* is larger, do not use built-in retries and manage retries yourself.
*
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    UpdateAiDataPlatformWorkspaceObjectResponse updateAiDataPlatformWorkspaceObject(UpdateAiDataPlatformWorkspaceObjectRequest request);
    
    /**
     * Creates a workspace file by generating PAR or updates the metadata by close file. If file exists, then it will be updated.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    UploadAiDataPlatformWorkspaceObjectWithParResponse uploadAiDataPlatformWorkspaceObjectWithPar(UploadAiDataPlatformWorkspaceObjectWithParRequest request);
    

}
