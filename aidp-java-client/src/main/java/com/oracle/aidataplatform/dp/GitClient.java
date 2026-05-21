// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GitClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Git {
    /**
     * Service instance for Git.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("GIT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GitClient.class);



    GitClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GitClient> {
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
        public GitClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new GitClient(this, authenticationDetailsProvider);
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
    
    public CheckoutBranchResponse checkoutBranch(CheckoutBranchRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCheckoutBranchDetails(), "checkoutBranchDetails is required");
        


return clientCall(request, CheckoutBranchResponse::builder)
        .logger(LOG, "checkoutBranch")
        .serviceDetails("Git", "CheckoutBranch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CheckoutBranchRequest::builder)
        
        
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
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranch.class, CheckoutBranchResponse.Builder::gitBranch)
                .handleResponseHeaderString("etag", 
            CheckoutBranchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CheckoutBranchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CheckoutBranchResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CommitPushGitRepositoryResponse commitPushGitRepository(CommitPushGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCommitPushDetails(), "commitPushDetails is required");
        


return clientCall(request, CommitPushGitRepositoryResponse::builder)
        .logger(LOG, "commitPushGitRepository")
        .serviceDetails("Git", "CommitPushGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CommitPushGitRepositoryRequest::builder)
        
        
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
            CommitPushGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CommitPushGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CreateGitBranchResponse createGitBranch(CreateGitBranchRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getCreateGitBranchDetails(), "createGitBranchDetails is required");
        


return clientCall(request, CreateGitBranchResponse::builder)
        .logger(LOG, "createGitBranch")
        .serviceDetails("Git", "CreateGitBranch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateGitBranchRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("gitBranches")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateGitBranch.class, CreateGitBranchResponse.Builder::createGitBranch)
                .handleResponseHeaderString("etag", 
            CreateGitBranchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateGitBranchResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateGitBranchResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public GetGitDiffDetailResponse getGitDiffDetail(GetGitDiffDetailRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitFolderPath(), "gitFolderPath is required");
        
        Objects.requireNonNull(request.getBranchName(), "branchName is required");
        
        Objects.requireNonNull(request.getGitFilePath(), "gitFilePath is required");
        


return clientCall(request, GetGitDiffDetailResponse::builder)
        .logger(LOG, "getGitDiffDetail")
        .serviceDetails("Git", "GetGitDiffDetail", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetGitDiffDetailRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitDiffDetail.class, GetGitDiffDetailResponse.Builder::gitDiffDetail)
                .handleResponseHeaderString("opc-request-id", 
            GetGitDiffDetailResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetGitOperationStateResponse getGitOperationState(GetGitOperationStateRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, GetGitOperationStateResponse::builder)
        .logger(LOG, "getGitOperationState")
        .serviceDetails("Git", "GetGitOperationState", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetGitOperationStateRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("gitOperationState")
            
                
                    
                    .appendQueryParam("operationName", request.getOperationName())
            
                
                    
                    .appendQueryParam("branchName", request.getBranchName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitOperationState.class, GetGitOperationStateResponse.Builder::gitOperationState)
                .handleResponseHeaderString("opc-request-id", 
            GetGitOperationStateResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetGitRepositoryResponse getGitRepository(GetGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, GetGitRepositoryResponse::builder)
        .logger(LOG, "getGitRepository")
        .serviceDetails("Git", "GetGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey())
            
                
                    
                    .appendQueryParam("shouldIncludeCredentialKey", request.getShouldIncludeCredentialKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitRepository.class, GetGitRepositoryResponse.Builder::gitRepository)
                .handleResponseHeaderString("opc-request-id", 
            GetGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            GetGitRepositoryResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public ListGitBranchesResponse listGitBranches(ListGitBranchesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, ListGitBranchesResponse::builder)
        .logger(LOG, "listGitBranches")
        .serviceDetails("Git", "ListGitBranches", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListGitBranchesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranchCollection.class, ListGitBranchesResponse.Builder::gitBranchCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListGitBranchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListGitBranchesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListGitBranchesResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public ListGitDiffsResponse listGitDiffs(ListGitDiffsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitFolderPath(), "gitFolderPath is required");
        
        Objects.requireNonNull(request.getBranchName(), "branchName is required");
        


return clientCall(request, ListGitDiffsResponse::builder)
        .logger(LOG, "listGitDiffs")
        .serviceDetails("Git", "ListGitDiffs", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListGitDiffsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection.class, ListGitDiffsResponse.Builder::gitDiffSummaryCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListGitDiffsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListGitDiffsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListGitDiffsResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public MergeGitRepositoryResponse mergeGitRepository(MergeGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitMergeDetails(), "gitMergeDetails is required");
        


return clientCall(request, MergeGitRepositoryResponse::builder)
        .logger(LOG, "mergeGitRepository")
        .serviceDetails("Git", "MergeGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MergeGitRepositoryRequest::builder)
        
        
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
            MergeGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            MergeGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public PullGitRepositoryResponse pullGitRepository(PullGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitPullDetails(), "gitPullDetails is required");
        


return clientCall(request, PullGitRepositoryResponse::builder)
        .logger(LOG, "pullGitRepository")
        .serviceDetails("Git", "PullGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PullGitRepositoryRequest::builder)
        
        
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
            PullGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PullGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RebaseGitRepositoryResponse rebaseGitRepository(RebaseGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitRebaseDetails(), "gitRebaseDetails is required");
        


return clientCall(request, RebaseGitRepositoryResponse::builder)
        .logger(LOG, "rebaseGitRepository")
        .serviceDetails("Git", "RebaseGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RebaseGitRepositoryRequest::builder)
        
        
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
            RebaseGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RebaseGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResetGitFolderStateResponse resetGitFolderState(ResetGitFolderStateRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getResetGitFolderStateDetails(), "resetGitFolderStateDetails is required");
        


return clientCall(request, ResetGitFolderStateResponse::builder)
        .logger(LOG, "resetGitFolderState")
        .serviceDetails("Git", "ResetGitFolderState", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResetGitFolderStateRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("resetState")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ResetGitFolderStateResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            ResetGitFolderStateResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResetGitRepositoryResponse resetGitRepository(ResetGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getGitResetDetails(), "gitResetDetails is required");
        


return clientCall(request, ResetGitRepositoryResponse::builder)
        .logger(LOG, "resetGitRepository")
        .serviceDetails("Git", "ResetGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResetGitRepositoryRequest::builder)
        
        
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
            ResetGitRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            ResetGitRepositoryResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public ResolveGitConflictsResponse resolveGitConflicts(ResolveGitConflictsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");
        Objects.requireNonNull(request.getConflictResolveDetails(), "conflictResolveDetails is required");
        


return clientCall(request, ResolveGitConflictsResponse::builder)
        .logger(LOG, "resolveGitConflicts")
        .serviceDetails("Git", "ResolveGitConflicts", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ResolveGitConflictsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey()).appendPathParam("actions").appendPathParam("resolveConflicts")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitBranch.class, ResolveGitConflictsResponse.Builder::gitBranch)
                .handleResponseHeaderString("etag", 
            ResolveGitConflictsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ResolveGitConflictsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateGitRepositoryResponse updateGitRepository(UpdateGitRepositoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateGitRepositoryDetails(), "updateGitRepositoryDetails is required");
        
        
        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");


return clientCall(request, UpdateGitRepositoryResponse::builder)
        .logger(LOG, "updateGitRepository")
        .serviceDetails("Git", "UpdateGitRepository", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateGitRepositoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitRepositories").appendPathParam(request.getGitRepositoryKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateGitRepositoryResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateGitRepositoryResponse.Builder::opcRequestId)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GitClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public GitClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public GitClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public GitClient(
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
    public GitClient(
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
    public GitClient(
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
    public GitClient(
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
