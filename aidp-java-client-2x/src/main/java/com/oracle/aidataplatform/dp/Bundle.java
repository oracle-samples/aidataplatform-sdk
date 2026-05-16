// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
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
     * (Preview) Creates a new bundle under the specified workspace path and initializes it with the
* requested bundled resources.
* <p>
A bundle is a self-contained, portable representation of selected workspace assets, such as jobs
* and agent flows, along with their dependencies and associated code artifacts. It captures both
* the resource configurations and the supporting assets required to recreate those resources in
* another workspace or environment.
* <p>
The bundle manifest is named `aidp_workbench.yaml`. The bundle preserves the workspace folder
* structure for code artifacts from the location where it was created, so the generated bundle
* mirrors the source layout.
* <p>
Dependencies are tracked inside the bundle under each asset type:
*   - job and agent flow dependencies are added under the `dependencies` folder inside the
* `jobs` and `agentflows` folders
* - code dependencies are added under the `artifacts` directory in the bundle
* <p>
Dependency references use template variables, for example:
*   - compute: `$${jobs.dependencies.training_compute.compute.key}`
*   - nested jobs: `$${jobs.dependencies.training_job.job.key}`
*   - aicompute: `$${jobs.dependencies.training_aicompute.aicompute.key}`
* <p>
Bundles also support the special variable `$${bundle.root}`, which points to the root of the
* bundle folder and is used for referencing artifacts.
* <p>
Variables and overrides:
*   - bundles support parameterization using variables defined in the bundle manifest
*     (`aidp_workbench.yaml`)
* <p>
  Example manifest defaults:
*     defaults:
*       variables:
*         job_compute_key: \"$${jobs.dependencies.small.compute.key}\"
* <p>
    - variables can be referenced in resource descriptors using the `$${var.<name>}` syntax
* <p>
  Example usage in a job descriptor:
*     \"clusterKey\": \"$${var.job_compute_key}\"
* <p>
    - workspace-specific overrides can be provided via `.aidp/overrides.yaml` inside the bundle
*     - this file is intended for environment-specific configuration and should not be committed to Git,
*       allowing the bundle to remain portable and environment-agnostic
* <p>
  Example overrides file:
*     variables:
*       job_compute_key: f6e7f5d8-d965-4009-95d9-02e993d9a16b
* <p>
    - when an override is provided, the referenced dependency (for example, compute) is not created,
*       and the provided value is used instead
*     - when no override is provided, the system falls back to the default variable value, which may
*       reference a dependency included in the bundle (resulting in that dependency being created)
*     - this mechanism enables environment-specific customization (for example, reusing existing
*       infrastructure in production while creating new resources in development)
*     - the same pattern can be used for other environment-specific parameters such as compute shape,
*       number of OCPUs, or other configuration values
* <p>
Git integration and promotion:
*   - bundles can only be created inside Git-backed workspace folders
*   - bundles are self-contained packages that include resource definitions, dependency references,
*     and associated code artifacts required to recreate the bundled resources
*   - the entire bundle folder can be committed and pushed to a Git repository
*   - bundles can be pulled into another workspace via Git and deployed there
*   - bundles can be promoted across environments (for example, dev \u2192 test \u2192 prod) using Git workflows
*   - because the bundle includes both resource configuration and code dependencies, it can be used
*     to reliably replicate assets across workspaces
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
    CreateAiDataPlatformBundleResponse createAiDataPlatformBundle(CreateAiDataPlatformBundleRequest request);
    
    /**
     * (Preview) Deploys the specified bundle by reading the bundle manifest and resource descriptors
* from the workspace, resolving bundle variables, and then creating or updating
* workspace resources to match the bundle contents.
* <p>
This operation is asynchronous. The request is accepted for background execution and
* returns an async operation key in the response headers.
* <p>
Deployment typically uses:
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
    DeployAiDataPlatformBundleResponse deployAiDataPlatformBundle(DeployAiDataPlatformBundleRequest request);
    
    /**
     * (Preview) Returns a high-level summary of the most recent deployment activity recorded for the
* specified bundle.
* <p>
This operation is useful after deploy or purge requests when you want the latest
* bundle-level deployment outcome rather than raw async operation details.
* <p>
The response can include:
* - overall deployment status
* - start and completion timestamps
* - summary message
* - resources associated with the last recorded deployment result
* <p>
Typical status values include:
* - `IN_PROGRESS`
* - `SUCCEEDED`
* - `FAILED`
* - `NOT_DEPLOYED`
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
    FetchAiDataPlatformBundleDeploymentStatusResponse fetchAiDataPlatformBundleDeploymentStatus(FetchAiDataPlatformBundleDeploymentStatusRequest request);
    
    /**
     * (Preview) Purges the deployed resources associated with the specified bundle from the workspace.
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
    PurgeAiDataPlatformBundleResponse purgeAiDataPlatformBundle(PurgeAiDataPlatformBundleRequest request);
    

}
