// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkspaceClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Workspace {
    /**
     * Service instance for Workspace.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceClient.class);


    private final WorkspaceWaiters waiters;

    WorkspaceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            , java.util.concurrent.ExecutorService executorService) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("Workspace-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new WorkspaceWaiters(executorService, this);
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
        * Set the ExecutorService for the client to be created.
        * @param executorService executorService
        * @return this builder
        */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
        return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public WorkspaceClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkspaceClient(this, authenticationDetailsProvider, executorService);
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
    
    public CreateGitFolderResponse createGitFolder(CreateGitFolderRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateGitFolderDetails(), "createGitFolderDetails is required");
        


return clientCall(request, CreateGitFolderResponse::builder)
        .logger(LOG, "createGitFolder")
        .serviceDetails("Workspace", "CreateGitFolder", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateGitFolderRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitFolders")
        .accept("application/json")
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitFolder.class, CreateGitFolderResponse.Builder::gitFolder)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateGitFolderResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateGitFolderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CreateGitFolderResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateWorkspaceDetails(), "createWorkspaceDetails is required");
        


return clientCall(request, CreateWorkspaceResponse::builder)
        .logger(LOG, "createWorkspace")
        .serviceDetails("Workspace", "CreateWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, CreateWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("location", 
            CreateWorkspaceResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateWorkspaceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateWorkspaceResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, DeleteWorkspaceResponse::builder)
        .logger(LOG, "deleteWorkspace")
        .serviceDetails("Workspace", "DeleteWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("time-data-lake-deletion", request.getTimeDataLakeDeletion())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteWorkspaceResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, GetWorkspaceResponse::builder)
        .logger(LOG, "getWorkspace")
        .serviceDetails("Workspace", "GetWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, GetWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("etag", 
            GetWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetWorkspaceResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListCreateWorkspacePermissionsResponse listCreateWorkspacePermissions(ListCreateWorkspacePermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListCreateWorkspacePermissionsResponse::builder)
        .logger(LOG, "listCreateWorkspacePermissions")
        .serviceDetails("Workspace", "ListCreateWorkspacePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListCreateWorkspacePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("createWorkspacePermissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection.class, ListCreateWorkspacePermissionsResponse.Builder::createWorkspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListCreateWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListCreateWorkspacePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListWorkspacePermissionsResponse listWorkspacePermissions(ListWorkspacePermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListWorkspacePermissionsResponse::builder)
        .logger(LOG, "listWorkspacePermissions")
        .serviceDetails("Workspace", "ListWorkspacePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListWorkspacePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspacePermissionCollection.class, ListWorkspacePermissionsResponse.Builder::workspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspacePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListWorkspacesResponse::builder)
        .logger(LOG, "listWorkspaces")
        .serviceDetails("Workspace", "ListWorkspaces", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListWorkspacesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces")
            
                
                    .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                    
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    .appendEnumQueryParam("type", request.getType())
                    
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
            
                
                    
                    .appendQueryParam("isPrivateNetworkEnabled", request.getIsPrivateNetworkEnabled())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceCollection.class, ListWorkspacesResponse.Builder::workspaceCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspacesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageCreateWorkspacePermissionResponse manageCreateWorkspacePermission(ManageCreateWorkspacePermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getManageCreateWorkspacePermissionDetails(), "manageCreateWorkspacePermissionDetails is required");
        


return clientCall(request, ManageCreateWorkspacePermissionResponse::builder)
        .logger(LOG, "manageCreateWorkspacePermission")
        .serviceDetails("Workspace", "ManageCreateWorkspacePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageCreateWorkspacePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("actions").appendPathParam("manageCreateWorkspacePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageCreateWorkspacePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageWorkspacePermissionResponse manageWorkspacePermission(ManageWorkspacePermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getManageWorkspacePermissionDetails(), "manageWorkspacePermissionDetails is required");
        


return clientCall(request, ManageWorkspacePermissionResponse::builder)
        .logger(LOG, "manageWorkspacePermission")
        .serviceDetails("Workspace", "ManageWorkspacePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageWorkspacePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageWorkspacePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceDetails(), "updateWorkspaceDetails is required");
        


return clientCall(request, UpdateWorkspaceResponse::builder)
        .logger(LOG, "updateWorkspace")
        .serviceDetails("Workspace", "UpdateWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateWorkspaceResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public UpdateWorkspaceAsyncOperationStatusResponse updateWorkspaceAsyncOperationStatus(UpdateWorkspaceAsyncOperationStatusRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAsyncOperationKey(), "asyncOperationKey must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceAsyncOperationStatusDetails(), "updateWorkspaceAsyncOperationStatusDetails is required");
        


return clientCall(request, UpdateWorkspaceAsyncOperationStatusResponse::builder)
        .logger(LOG, "updateWorkspaceAsyncOperationStatus")
        .serviceDetails("Workspace", "UpdateWorkspaceAsyncOperationStatus", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateWorkspaceAsyncOperationStatusRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("asyncOperations").appendPathParam(request.getAsyncOperationKey()).appendPathParam("status")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateWorkspaceAsyncOperationStatusResponse.Builder::workspace)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::etag)

                .callSync();
    }

    @Override
    public WorkspaceWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkspaceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(
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
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(
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
            authenticationDetailsProvider,
            null
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
    public WorkspaceClient(
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
            authenticationDetailsProvider,
            null
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkspaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider,
            executorService
        );
    }
}
