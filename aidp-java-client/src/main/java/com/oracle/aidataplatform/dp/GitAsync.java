// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface GitAsync extends AutoCloseable {

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
     * (Preview) Asynchronously checks out the requested branch in the workspace Git
* folder. Checkout normally resets the local branch to origin/{branchName}, with a
* local-branch fallback. The aidp-async-operation-key response header identifies
* the job; its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CheckoutBranchResponse> checkoutBranch(CheckoutBranchRequest request, com.oracle.bmc.responses.AsyncHandler<CheckoutBranchRequest, CheckoutBranchResponse> handler);
    
    /**
     * (Preview) Asynchronously commits and pushes the stored repository branch. For
* normal commits, omitting files stages all local changes. After conflicts are
* resolved, completes a merge or continues a rebase; rebase continuation
* force-pushes. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CommitPushGitRepositoryResponse> commitPushGitRepository(CommitPushGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<CommitPushGitRepositoryRequest, CommitPushGitRepositoryResponse> handler);
    
    /**
     * (Preview) Asynchronously creates a branch from the current HEAD, checks it out
* in the stored Git folder, and pushes it to origin. The aidp-async-operation-key
* response header identifies the job; its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGitBranchResponse> createGitBranch(CreateGitBranchRequest request, com.oracle.bmc.responses.AsyncHandler<CreateGitBranchRequest, CreateGitBranchResponse> handler);
    
    /**
     * (Preview) Returns a local unified diff for a repository-relative file.
* contextLines and maxPatchBytes are not currently applied by execution.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGitDiffDetailResponse> getGitDiffDetail(GetGitDiffDetailRequest request, com.oracle.bmc.responses.AsyncHandler<GetGitDiffDetailRequest, GetGitDiffDetailResponse> handler);
    
    /**
     * (Preview) Returns a snapshot of Git worktree operation state and readiness for
* an optional operationName. CLEAN does not imply no local changes. This endpoint
* does not report asynchronous job progress.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGitOperationStateResponse> getGitOperationState(GetGitOperationStateRequest request, com.oracle.bmc.responses.AsyncHandler<GetGitOperationStateRequest, GetGitOperationStateResponse> handler);
    
    /**
     * (Preview) Returns stored repository URL, folder, branch, and connectivity
* references. The authentication setting key is included only when
* shouldIncludeCredentialKey=true.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGitRepositoryResponse> getGitRepository(GetGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<GetGitRepositoryRequest, GetGitRepositoryResponse> handler);
    
    /**
     * (Preview) Lists branches on origin with pagination. Name filters and sort
* controls are not currently applied. Page tokens become invalid if the branch
* listing changes.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGitBranchesResponse> listGitBranches(ListGitBranchesRequest request, com.oracle.bmc.responses.AsyncHandler<ListGitBranchesRequest, ListGitBranchesResponse> handler);
    
    /**
     * (Preview) Lists local file changes with snapshot pagination. compareTo, filter,
* displayName, and sort controls are not currently applied; this is not an
* upstream comparison.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGitDiffsResponse> listGitDiffs(ListGitDiffsRequest request, com.oracle.bmc.responses.AsyncHandler<ListGitDiffsRequest, ListGitDiffsResponse> handler);
    
    /**
     * (Preview) Asynchronously merges origin/{remoteBranchName} into the stored
* repository branch and pushes it to origin on a conflict-free merge. commitId is
* not applied. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<MergeGitRepositoryResponse> mergeGitRepository(MergeGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<MergeGitRepositoryRequest, MergeGitRepositoryResponse> handler);
    
    /**
     * (Preview) Asynchronously pulls origin changes into the stored repository branch
* using autostash. Supplied branch, pullAction, and commitMessage overrides are
* not applied. The aidp-async-operation-key response header identifies the job;
* its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PullGitRepositoryResponse> pullGitRepository(PullGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<PullGitRepositoryRequest, PullGitRepositoryResponse> handler);
    
    /**
     * (Preview) Asynchronously rebases the stored repository branch onto
* origin/{remoteBranchName} and force-pushes it on success. commitId is not
* applied. The aidp-async-operation-key response header identifies the job; its
* SUCCEEDED status confirms completion. The stored branch must pass its remote
* synchronization check before rebasing.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RebaseGitRepositoryResponse> rebaseGitRepository(RebaseGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<RebaseGitRepositoryRequest, RebaseGitRepositoryResponse> handler);
    
    /**
     * (Preview) Aborts an in-progress Git operation or discards selected local changes
* according to action. Single-path DISCARD runs synchronously; other requests
* submit a job. When present, datalake-async-operation-key identifies that job.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetGitFolderStateResponse> resetGitFolderState(ResetGitFolderStateRequest request, com.oracle.bmc.responses.AsyncHandler<ResetGitFolderStateRequest, ResetGitFolderStateResponse> handler);
    
    /**
     * (Preview) Asynchronously hard-resets the stored repository branch to
* origin/{branchName}, discards tracked local changes, and force-pushes the stored
* branch. resetMode and commitId are not applied. The aidp-async-operation-key
* response header identifies the job; its SUCCEEDED status confirms completion.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetGitRepositoryResponse> resetGitRepository(ResetGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<ResetGitRepositoryRequest, ResetGitRepositoryResponse> handler);
    
    /**
     * (Preview) Synchronously selects LOCAL or REMOTE file versions, or stages
* manually resolved content with MARK_RESOLVED. Does not complete or push an
* in-progress merge or rebase.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResolveGitConflictsResponse> resolveGitConflicts(ResolveGitConflictsRequest request, com.oracle.bmc.responses.AsyncHandler<ResolveGitConflictsRequest, ResolveGitConflictsResponse> handler);
    
    /**
     * (Preview) Updates repository settings. URL changes and changed sparse checkout
* patterns submit asynchronous operations; credential and private connectivity
* reference changes may complete without an operation key. This operation does
* not change the default branch or relocate the folder. Omitted fields retain
* their stored values.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGitRepositoryResponse> updateGitRepository(UpdateGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateGitRepositoryRequest, UpdateGitRepositoryResponse> handler);
    
}
