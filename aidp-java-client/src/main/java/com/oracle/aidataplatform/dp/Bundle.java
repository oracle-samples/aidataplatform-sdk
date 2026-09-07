// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface Bundle extends AutoCloseable {

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
     * (Deprecated)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CreateBundleResponse createBundle(CreateBundleRequest request);
    
    /**
     * (Preview) Creates a new bundle.
* <p>
This operation is asynchronous. The service validates the request, starts bundle
* creation, and returns an async operation key in the response headers. Use the async
* operation APIs to track completion.
* <p>
Typical use cases:
* - capture selected workspace resources into a version-controlled bundle
* - prepare a bundle for later deployment or promotion
* - establish a bundle root that can later be inspected, updated, or deployed
* <p>
Request notes:
* - `path` identifies the parent folder in the workspace volume where the bundle should be created
* - `name` identifies the bundle folder name
* - `bundledResources` identifies which workspace resources should be included
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CreateBundleActionResponse createBundleAction(CreateBundleActionRequest request);
    
    /**
     * (Deprecated)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    DeployBundleResponse deployBundle(DeployBundleRequest request);
    
    /**
     * Deprecated compatibility API. Use `publish` for new callers.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    DeployBundleActionResponse deployBundleAction(DeployBundleActionRequest request);
    
    /**
     * (Deprecated)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    FetchBundleDeploymentStatusResponse fetchBundleDeploymentStatus(FetchBundleDeploymentStatusRequest request);
    
    /**
     * Deprecated compatibility API. Use `getBundlePublishStatus` for new callers.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    FetchBundleDeploymentStatusActionResponse fetchBundleDeploymentStatusAction(FetchBundleDeploymentStatusActionRequest request);
    
    /**
     * (Preview) Returns the latest publish summary.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    FetchBundlePublishStatusActionResponse fetchBundlePublishStatusAction(FetchBundlePublishStatusActionRequest request);
    
    /**
     * (Preview) Publishes the specified bundle, creating or updating jobs and agent flows according to the bundle manifest.
* Returns an async job key for tracking publish progress.
* <p>
This operation is asynchronous. The request is accepted for background execution and
* returns an async operation key in the response headers.
* <p>
Publishing typically uses:
* - the bundle manifest at the bundle root
* - top-level resource descriptors in the bundle
* - dependency descriptors referenced by those top-level resources
* - default or override variable values when present
* <p>
Use this operation when you want to apply the bundle contents into the target
* workspace state.
* <p>
Request notes:
* - `path` identifies the bundle root folder in the workspace volume
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    PublishBundleActionResponse publishBundleAction(PublishBundleActionRequest request);
    
    /**
     * (Deprecated)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    PurgeBundleResponse purgeBundle(PurgeBundleRequest request);
    
    /**
     * (Preview) Tears down all resources deployed by the specified bundle in the workspace.
* <p>
This operation is intended to tear down resources that were created or managed through
* bundle deployment. It does not delete the bundle files themselves from the workspace
* volume.
* <p>
This operation is asynchronous. The service accepts the purge request, starts the
* background teardown workflow, and returns async operation headers.
* <p>
Typical use cases:
* - remove resources that were previously deployed from a bundle
* - clean up a workspace before re-deploying or retiring a bundle
* <p>
Request notes:
* - `path` identifies the bundle root folder in the workspace volume
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    PurgeBundleActionResponse purgeBundleAction(PurgeBundleActionRequest request);
    
    /**
     * (Deprecated)
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    SyncBundleResponse syncBundle(SyncBundleRequest request);
    
    /**
     * (Preview) Synchronizes the code, descriptors, and mapping in the bundle by reconciling the contents with the resource origins.
* Returns an async job key for tracking sync progress.
* <p>
This operation is intended for cases where the bundle should be refreshed to reflect
* newer source changes while preserving the bundle structure and identity.
* <p>
This operation is asynchronous and returns async operation headers when accepted.
* <p>
Typical use cases:
* - refresh bundle contents after upstream workspace resources have changed
* - reconcile descriptor or artifact content with current resource origins
* - preserve local bundle overrides while pulling in source resource updates
* - keep a bundle current before promoting it
* <p>
Request notes:
* - `path` identifies the bundle root folder in the workspace volume
* - the bundle must contain a valid `aidp_workbench.yaml`
* - the bundle must contain `.aidp/resource_origins.yaml`
* - origin metadata must refer to the same AIDP/Data Lake and workspace as the request
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    SyncBundleActionResponse syncBundleAction(SyncBundleActionRequest request);
    

}
