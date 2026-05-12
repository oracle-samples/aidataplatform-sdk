package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

    /**
    * Use the AI Data Platform Data Plane API to manage workspaces and objects in the workspace.
    */

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public interface GitServiceAsync extends AutoCloseable {

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
    java.util.concurrent.Future<CheckoutAiDataPlatformBranchResponse> checkoutAiDataPlatformBranch(CheckoutAiDataPlatformBranchRequest request, com.oracle.bmc.responses.AsyncHandler<CheckoutAiDataPlatformBranchRequest, CheckoutAiDataPlatformBranchResponse> handler);
    
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
    java.util.concurrent.Future<CommitPushAiDataPlatformGitRepositoryResponse> commitPushAiDataPlatformGitRepository(CommitPushAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<CommitPushAiDataPlatformGitRepositoryRequest, CommitPushAiDataPlatformGitRepositoryResponse> handler);
    
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
    java.util.concurrent.Future<CreateAiDataPlatformGitBranchResponse> createAiDataPlatformGitBranch(CreateAiDataPlatformGitBranchRequest request, com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformGitBranchRequest, CreateAiDataPlatformGitBranchResponse> handler);
    
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
    java.util.concurrent.Future<GetAiDataPlatformGitDiffDetailResponse> getAiDataPlatformGitDiffDetail(GetAiDataPlatformGitDiffDetailRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformGitDiffDetailRequest, GetAiDataPlatformGitDiffDetailResponse> handler);
    
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
    java.util.concurrent.Future<GetAiDataPlatformGitOperationStateResponse> getAiDataPlatformGitOperationState(GetAiDataPlatformGitOperationStateRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformGitOperationStateRequest, GetAiDataPlatformGitOperationStateResponse> handler);
    
    /**
     * (Preview) Returns repository metadata, credential references, and workspace linkage for a specific AiDataPlatform git repository.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAiDataPlatformGitRepositoryResponse> getAiDataPlatformGitRepository(GetAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformGitRepositoryRequest, GetAiDataPlatformGitRepositoryResponse> handler);
    
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
    java.util.concurrent.Future<ListAiDataPlatformGitBranchesResponse> listAiDataPlatformGitBranches(ListAiDataPlatformGitBranchesRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformGitBranchesRequest, ListAiDataPlatformGitBranchesResponse> handler);
    
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
    java.util.concurrent.Future<ListAiDataPlatformGitDiffsResponse> listAiDataPlatformGitDiffs(ListAiDataPlatformGitDiffsRequest request, com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformGitDiffsRequest, ListAiDataPlatformGitDiffsResponse> handler);
    
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
    java.util.concurrent.Future<MergeAiDataPlatformGitRepositoryResponse> mergeAiDataPlatformGitRepository(MergeAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<MergeAiDataPlatformGitRepositoryRequest, MergeAiDataPlatformGitRepositoryResponse> handler);
    
    /**
     * (Preview) Performs a git pull for the workspace branch so developers can sync local files with upstream commits.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PullAiDataPlatformGitRepositoryResponse> pullAiDataPlatformGitRepository(PullAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<PullAiDataPlatformGitRepositoryRequest, PullAiDataPlatformGitRepositoryResponse> handler);
    
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
    java.util.concurrent.Future<RebaseAiDataPlatformGitRepositoryResponse> rebaseAiDataPlatformGitRepository(RebaseAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<RebaseAiDataPlatformGitRepositoryRequest, RebaseAiDataPlatformGitRepositoryResponse> handler);
    
    /**
     * (Preview) Aborts in-progress Git operations and discards local changes in the workspace folder to regain a clean state.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetAiDataPlatformGitFolderStateResponse> resetAiDataPlatformGitFolderState(ResetAiDataPlatformGitFolderStateRequest request, com.oracle.bmc.responses.AsyncHandler<ResetAiDataPlatformGitFolderStateRequest, ResetAiDataPlatformGitFolderStateResponse> handler);
    
    /**
     * (Preview) Performs a git reset so the workspace branch matches the specified commit, discarding newer local commits.
* 
     * 
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in 
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ResetAiDataPlatformGitRepositoryResponse> resetAiDataPlatformGitRepository(ResetAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<ResetAiDataPlatformGitRepositoryRequest, ResetAiDataPlatformGitRepositoryResponse> handler);
    
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
    java.util.concurrent.Future<ResolveAiDataPlatformGitConflictsResponse> resolveAiDataPlatformGitConflicts(ResolveAiDataPlatformGitConflictsRequest request, com.oracle.bmc.responses.AsyncHandler<ResolveAiDataPlatformGitConflictsRequest, ResolveAiDataPlatformGitConflictsResponse> handler);
    
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
    java.util.concurrent.Future<UpdateAiDataPlatformGitRepositoryResponse> updateAiDataPlatformGitRepository(UpdateAiDataPlatformGitRepositoryRequest request, com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformGitRepositoryRequest, UpdateAiDataPlatformGitRepositoryResponse> handler);
    
}
