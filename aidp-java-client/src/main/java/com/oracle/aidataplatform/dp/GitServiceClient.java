// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GitServiceClient extends com.oracle.bmc.http.internal.BaseSyncClient implements GitService {
    /**
     * Service instance for GitService.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("GITSERVICE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GitServiceClient.class);



    GitServiceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            ) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

    }


    
    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GitServiceClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public GitServiceClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new GitServiceClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    
    public CheckoutAiDataPlatformBranchResponse checkoutAiDataPlatformBranch(CheckoutAiDataPlatformBranchRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCheckoutBranchDetails(), "checkoutBranchDetails is required");
        


return clientCall(request, CheckoutAiDataPlatformBranchResponse::builder)
        .logger(LOG, "checkoutAiDataPlatformBranch")
        .serviceDetails("GitService", "CheckoutAiDataPlatformBranch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CheckoutAiDataPlatformBranchRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("checkOutBranch")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranch.class, CheckoutAiDataPlatformBranchResponse.Builder::gitBranch)
                .handleResponseHeaderString("etag", 
            CheckoutAiDataPlatformBranchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CheckoutAiDataPlatformBranchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CheckoutAiDataPlatformBranchResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CommitPushAiDataPlatformGitRepositoryResponse commitPushAiDataPlatformGitRepository(CommitPushAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCommitPushDetails(), "commitPushDetails is required");
        


return clientCall(request, CommitPushAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "commitPushAiDataPlatformGitRepository")
        .serviceDetails("GitService", "CommitPushAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CommitPushAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("commitPush")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            CommitPushAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CommitPushAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CreateAiDataPlatformGitBranchResponse createAiDataPlatformGitBranch(CreateAiDataPlatformGitBranchRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCreateGitBranchDetails(), "createGitBranchDetails is required");
        


return clientCall(request, CreateAiDataPlatformGitBranchResponse::builder)
        .logger(LOG, "createAiDataPlatformGitBranch")
        .serviceDetails("GitService", "CreateAiDataPlatformGitBranch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformGitBranchRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("gitBranches")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateGitBranch.class, CreateAiDataPlatformGitBranchResponse.Builder::createGitBranch)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformGitBranchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformGitBranchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformGitBranchResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformGitDiffDetailResponse getAiDataPlatformGitDiffDetail(GetAiDataPlatformGitDiffDetailRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitFolderPath(), "gitFolderPath is required");
        
        Objects.requireNonNull(request.getBranchName(), "branchName is required");
        
        Objects.requireNonNull(request.getGitFilePath(), "gitFilePath is required");
        


return clientCall(request, GetAiDataPlatformGitDiffDetailResponse::builder)
        .logger(LOG, "getAiDataPlatformGitDiffDetail")
        .serviceDetails("GitService", "GetAiDataPlatformGitDiffDetail", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformGitDiffDetailRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("gitDiffDetails")
            
                
                    
                    .appendQueryParam("gitFolderPath", request.getGitFolderPath())
            
                
                    
                    .appendQueryParam("branchName", request.getBranchName())
            
                
                    
                    .appendQueryParam("gitFilePath", request.getGitFilePath())
            
                
                    
                    .appendQueryParam("contextLines", request.getContextLines())
            
                
                    
                    .appendQueryParam("maxPatchBytes", request.getMaxPatchBytes())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitDiffDetail.class, GetAiDataPlatformGitDiffDetailResponse.Builder::gitDiffDetail)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformGitDiffDetailResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformGitOperationStateResponse getAiDataPlatformGitOperationState(GetAiDataPlatformGitOperationStateRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, GetAiDataPlatformGitOperationStateResponse::builder)
        .logger(LOG, "getAiDataPlatformGitOperationState")
        .serviceDetails("GitService", "GetAiDataPlatformGitOperationState", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformGitOperationStateRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("gitOperationState")
            
                
                    
                    .appendQueryParam("operationName", request.getOperationName())
            
                
                    
                    .appendQueryParam("branchName", request.getBranchName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitOperationState.class, GetAiDataPlatformGitOperationStateResponse.Builder::gitOperationState)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformGitOperationStateResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformGitRepositoryResponse getAiDataPlatformGitRepository(GetAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, GetAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "getAiDataPlatformGitRepository")
        .serviceDetails("GitService", "GetAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey())
            
                
                    
                    .appendQueryParam("shouldIncludeCredentialKey", request.getShouldIncludeCredentialKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitRepository.class, GetAiDataPlatformGitRepositoryResponse.Builder::gitRepository)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformGitRepositoryResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformGitBranchesResponse listAiDataPlatformGitBranches(ListAiDataPlatformGitBranchesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, ListAiDataPlatformGitBranchesResponse::builder)
        .logger(LOG, "listAiDataPlatformGitBranches")
        .serviceDetails("GitService", "ListAiDataPlatformGitBranches", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformGitBranchesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("gitBranches")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranchCollection.class, ListAiDataPlatformGitBranchesResponse.Builder::gitBranchCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformGitBranchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformGitBranchesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformGitDiffsResponse listAiDataPlatformGitDiffs(ListAiDataPlatformGitDiffsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitFolderPath(), "gitFolderPath is required");
        
        Objects.requireNonNull(request.getBranchName(), "branchName is required");
        


return clientCall(request, ListAiDataPlatformGitDiffsResponse::builder)
        .logger(LOG, "listAiDataPlatformGitDiffs")
        .serviceDetails("GitService", "ListAiDataPlatformGitDiffs", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformGitDiffsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("gitDiff")
            
                
                    
                    .appendQueryParam("gitFolderPath", request.getGitFolderPath())
            
                
                    
                    .appendQueryParam("branchName", request.getBranchName())
            
                
                    .appendEnumQueryParam("compareTo", request.getCompareTo())
                    
            
                
                    .appendEnumQueryParam("filter", request.getFilter())
                    
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection.class, ListAiDataPlatformGitDiffsResponse.Builder::gitDiffSummaryCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformGitDiffsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformGitDiffsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public MergeAiDataPlatformGitRepositoryResponse mergeAiDataPlatformGitRepository(MergeAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitMergeDetails(), "gitMergeDetails is required");
        


return clientCall(request, MergeAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "mergeAiDataPlatformGitRepository")
        .serviceDetails("GitService", "MergeAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MergeAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("merge")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            MergeAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            MergeAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public PullAiDataPlatformGitRepositoryResponse pullAiDataPlatformGitRepository(PullAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitPullDetails(), "gitPullDetails is required");
        


return clientCall(request, PullAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "pullAiDataPlatformGitRepository")
        .serviceDetails("GitService", "PullAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PullAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("pull")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            PullAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PullAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RebaseAiDataPlatformGitRepositoryResponse rebaseAiDataPlatformGitRepository(RebaseAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitRebaseDetails(), "gitRebaseDetails is required");
        


return clientCall(request, RebaseAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "rebaseAiDataPlatformGitRepository")
        .serviceDetails("GitService", "RebaseAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RebaseAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("rebase")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            RebaseAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RebaseAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResetAiDataPlatformGitFolderStateResponse resetAiDataPlatformGitFolderState(ResetAiDataPlatformGitFolderStateRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getResetGitFolderStateDetails(), "resetGitFolderStateDetails is required");
        


return clientCall(request, ResetAiDataPlatformGitFolderStateResponse::builder)
        .logger(LOG, "resetAiDataPlatformGitFolderState")
        .serviceDetails("GitService", "ResetAiDataPlatformGitFolderState", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResetAiDataPlatformGitFolderStateRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("resetState")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ResetAiDataPlatformGitFolderStateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            ResetAiDataPlatformGitFolderStateResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResetAiDataPlatformGitRepositoryResponse resetAiDataPlatformGitRepository(ResetAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitResetDetails(), "gitResetDetails is required");
        


return clientCall(request, ResetAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "resetAiDataPlatformGitRepository")
        .serviceDetails("GitService", "ResetAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResetAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("reset")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ResetAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            ResetAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResolveAiDataPlatformGitConflictsResponse resolveAiDataPlatformGitConflicts(ResolveAiDataPlatformGitConflictsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getConflictResolveDetails(), "conflictResolveDetails is required");
        


return clientCall(request, ResolveAiDataPlatformGitConflictsResponse::builder)
        .logger(LOG, "resolveAiDataPlatformGitConflicts")
        .serviceDetails("GitService", "ResolveAiDataPlatformGitConflicts", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResolveAiDataPlatformGitConflictsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("resolveConflicts")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranch.class, ResolveAiDataPlatformGitConflictsResponse.Builder::gitBranch)
                .handleResponseHeaderString("etag", 
            ResolveAiDataPlatformGitConflictsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ResolveAiDataPlatformGitConflictsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformGitRepositoryResponse updateAiDataPlatformGitRepository(UpdateAiDataPlatformGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateGitRepositoryDetails(), "updateGitRepositoryDetails is required");
        
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, UpdateAiDataPlatformGitRepositoryResponse::builder)
        .logger(LOG, "updateAiDataPlatformGitRepository")
        .serviceDetails("GitService", "UpdateAiDataPlatformGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateAiDataPlatformGitRepositoryResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformGitRepositoryResponse.Builder::opcRequestId)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitServiceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider
        );
    }
}
