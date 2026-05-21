// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Workspace service. <br/>
* There are two ways to use async client:
* 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
* getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else, 
* because the stream will be closed right after the AsyncHandler is invoked. <br/>
* 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
* Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
* but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
* is used, it is still safe to use the Future to determine whether or not the request was completed via
* Future.isDone/isCancelled.<br/>
* Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
*/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkspaceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements WorkspaceAsync {
    /**
     * Service instance for Workspace.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceAsyncClient.class);

    WorkspaceAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(
            builder,
            authenticationDetailsProvider
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceAsyncClient> {
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
        public WorkspaceAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkspaceAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateGitFolderResponse> createGitFolder(CreateGitFolderRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateGitFolderRequest, CreateGitFolderResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitFolder.class, CreateGitFolderResponse.Builder::gitFolder)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateGitFolderResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateGitFolderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CreateGitFolderResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteWorkspaceResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, GetWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("etag", 
            GetWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetWorkspaceResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListCreateWorkspacePermissionsResponse> listCreateWorkspacePermissions(ListCreateWorkspacePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListCreateWorkspacePermissionsRequest, ListCreateWorkspacePermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection.class, ListCreateWorkspacePermissionsResponse.Builder::createWorkspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListCreateWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListCreateWorkspacePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListWorkspacePermissionsResponse> listWorkspacePermissions(ListWorkspacePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListWorkspacePermissionsRequest, ListWorkspacePermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspacePermissionCollection.class, ListWorkspacePermissionsResponse.Builder::workspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspacePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceCollection.class, ListWorkspacesResponse.Builder::workspaceCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspacesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageCreateWorkspacePermissionResponse> manageCreateWorkspacePermission(ManageCreateWorkspacePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageCreateWorkspacePermissionRequest, ManageCreateWorkspacePermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageCreateWorkspacePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageWorkspacePermissionResponse> manageWorkspacePermission(ManageWorkspacePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageWorkspacePermissionRequest, ManageWorkspacePermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageWorkspacePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateWorkspaceResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateWorkspaceAsyncOperationStatusResponse> updateWorkspaceAsyncOperationStatus(UpdateWorkspaceAsyncOperationStatusRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceAsyncOperationStatusRequest, UpdateWorkspaceAsyncOperationStatusResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateWorkspaceAsyncOperationStatusResponse.Builder::workspace)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateWorkspaceAsyncOperationStatusResponse.Builder::etag)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkspaceAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public WorkspaceAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public WorkspaceAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkspaceAsyncClient(
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
    public WorkspaceAsyncClient (
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
    public WorkspaceAsyncClient (
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
    public WorkspaceAsyncClient (
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
