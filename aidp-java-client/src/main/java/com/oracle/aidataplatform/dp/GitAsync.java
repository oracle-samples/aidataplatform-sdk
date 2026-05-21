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
     * (Preview) Checks out a remote branch into the specified workspace folder, ensuring the worktree tracks the requested branch HEAD.
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
     * (Preview) Stages selected workspace updates, creates a commit, and pushes it upstream so automation can sync with Git providers.
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
     * (Preview) Creates a new branch in the connected repo so teams can stage changes in isolated workspaces.
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
     * (Preview) Returns a unified diff patch for a specific file so editors and review panes can render inline changes.
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
     * (Preview) Returns the current Git worktree status\u2014including in-progress operations or detached HEAD indicators\u2014for the workspace folder.
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
     * (Preview) Returns repository metadata, credential references, and workspace linkage for a specific AI Data Platform Git repository.
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
     * (Preview) Returns branch summaries with optional display-name filters and pagination, so UIs can show branch pickers and search results.
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
     * (Preview) Returns file-level diff summaries for the workspace branch, enabling UI views of changed files or conflicts without heavy payloads.
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
     * (Preview) Applies the requested branch or commit onto the workspace branch to preview integration changes before pushing.
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
     * (Preview) Performs a Git pull for the workspace branch so developers can sync local files with the latest upstream commits.
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
     * (Preview) Rebases the workspace branch on top of another commit or branch to linearize history and resolve drift.
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
     * (Preview) Halts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.
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
     * (Preview) Performs a Git reset so the workspace branch matches the specified commit, discarding newer local commits.
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
     * (Preview) Accepts conflict resolution instructions\u2014choose source or target versions\u2014and records the resolution back to the repo.
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
     * (Preview) Updates stored repository details\u2014such as credentials or default branches\u2014so automation stays aligned with your source control.
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
