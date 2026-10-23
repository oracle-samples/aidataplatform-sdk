// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface Git extends AutoCloseable {

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
     * (Preview) Asynchronously checks out the requested branch in the workspace Git
* folder. Checkout normally resets the local branch to origin/{branchName}, with a
* local-branch fallback. The aidp-async-operation-key response header identifies
* the job; its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CheckoutBranchResponse checkoutBranch(CheckoutBranchRequest request);
    
    /**
     * (Preview) Asynchronously commits and pushes the stored repository branch. For
* normal commits, omitting files stages all local changes. After conflicts are
* resolved, completes a merge or continues a rebase; rebase continuation
* force-pushes. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CommitPushGitRepositoryResponse commitPushGitRepository(CommitPushGitRepositoryRequest request);
    
    /**
     * (Preview) Asynchronously creates a branch from the current HEAD, checks it out
* in the stored Git folder, and pushes it to origin. The aidp-async-operation-key
* response header identifies the job; its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    CreateGitBranchResponse createGitBranch(CreateGitBranchRequest request);
    
    /**
     * (Preview) Returns a local unified diff for a repository-relative file.
* contextLines and maxPatchBytes are not currently applied by execution.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    GetGitDiffDetailResponse getGitDiffDetail(GetGitDiffDetailRequest request);
    
    /**
     * (Preview) Returns a snapshot of Git worktree operation state and readiness for
* an optional operationName. CLEAN does not imply no local changes. This endpoint
* does not report asynchronous job progress.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    GetGitOperationStateResponse getGitOperationState(GetGitOperationStateRequest request);
    
    /**
     * (Preview) Returns stored repository URL, folder, branch, and connectivity
* references. The authentication setting key is included only when
* shouldIncludeCredentialKey=true.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    GetGitRepositoryResponse getGitRepository(GetGitRepositoryRequest request);
    
    /**
     * (Preview) Lists branches on origin with pagination. Name filters and sort
* controls are not currently applied. Page tokens become invalid if the branch
* listing changes.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ListGitBranchesResponse listGitBranches(ListGitBranchesRequest request);
    
    /**
     * (Preview) Lists local file changes with snapshot pagination. compareTo, filter,
* displayName, and sort controls are not currently applied; this is not an
* upstream comparison.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ListGitDiffsResponse listGitDiffs(ListGitDiffsRequest request);
    
    /**
     * (Preview) Asynchronously merges origin/{remoteBranchName} into the stored
* repository branch and pushes it to origin on a conflict-free merge. commitId is
* not applied. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    MergeGitRepositoryResponse mergeGitRepository(MergeGitRepositoryRequest request);
    
    /**
     * (Preview) Asynchronously pulls origin changes into the stored repository branch
* using autostash. Supplied branch, pullAction, and commitMessage overrides are
* not applied. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    PullGitRepositoryResponse pullGitRepository(PullGitRepositoryRequest request);
    
    /**
     * (Preview) Asynchronously rebases the stored repository branch onto
* origin/{remoteBranchName} and force-pushes it on success. commitId is not
* applied. The aidp-async-operation-key response header identifies the job; its
* SUCCEEDED status confirms completion. The stored branch must pass its remote
* synchronization check before rebasing.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    RebaseGitRepositoryResponse rebaseGitRepository(RebaseGitRepositoryRequest request);
    
    /**
     * (Preview) Aborts an in-progress Git operation or discards selected local changes
* according to action. Single-path DISCARD runs synchronously; other requests
* submit a job. When present, datalake-async-operation-key identifies that job.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ResetGitFolderStateResponse resetGitFolderState(ResetGitFolderStateRequest request);
    
    /**
     * (Preview) Asynchronously hard-resets the stored repository branch to
* origin/{branchName}, discards tracked local changes, and force-pushes the stored
* branch. resetMode and commitId are not applied. The aidp-async-operation-key
* response header identifies the job; its SUCCEEDED status confirms completion.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ResetGitRepositoryResponse resetGitRepository(ResetGitRepositoryRequest request);
    
    /**
     * (Preview) Synchronously selects LOCAL or REMOTE file versions, or stages
* manually resolved content with MARK_RESOLVED. Does not complete or push an
* in-progress merge or rebase.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    ResolveGitConflictsResponse resolveGitConflicts(ResolveGitConflictsRequest request);
    
    /**
     * (Preview) Updates repository settings. URL changes and changed sparse checkout
* patterns submit asynchronous operations; credential and private connectivity
* reference changes may complete without an operation key. This operation does
* not change the default branch or relocate the folder. Omitted fields retain
* their stored values.
* 
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     */
    UpdateGitRepositoryResponse updateGitRepository(UpdateGitRepositoryRequest request);
    

}
