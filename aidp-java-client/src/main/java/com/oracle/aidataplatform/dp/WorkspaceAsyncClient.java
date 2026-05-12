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
    
    public java.util.concurrent.Future<CreateAiDataPlatformGitFolderResponse> createAiDataPlatformGitFolder(CreateAiDataPlatformGitFolderRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformGitFolderRequest, CreateAiDataPlatformGitFolderResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateGitFolderDetails(), "createGitFolderDetails is required");
        


return clientCall(request, CreateAiDataPlatformGitFolderResponse::builder)
        .logger(LOG, "createAiDataPlatformGitFolder")
        .serviceDetails("Workspace", "CreateAiDataPlatformGitFolder", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformGitFolderRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("gitFolders")
        .accept("application/json")
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.GitFolder.class, CreateAiDataPlatformGitFolderResponse.Builder::gitFolder)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformGitFolderResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformGitFolderResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformGitFolderResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformWorkspaceResponse> createAiDataPlatformWorkspace(CreateAiDataPlatformWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceRequest, CreateAiDataPlatformWorkspaceResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateWorkspaceDetails(), "createWorkspaceDetails is required");
        


return clientCall(request, CreateAiDataPlatformWorkspaceResponse::builder)
        .logger(LOG, "createAiDataPlatformWorkspace")
        .serviceDetails("Workspace", "CreateAiDataPlatformWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, CreateAiDataPlatformWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformWorkspaceResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformWorkspaceResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformWorkspaceResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformWorkspaceResponse> deleteAiDataPlatformWorkspace(DeleteAiDataPlatformWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceRequest, DeleteAiDataPlatformWorkspaceResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, DeleteAiDataPlatformWorkspaceResponse::builder)
        .logger(LOG, "deleteAiDataPlatformWorkspace")
        .serviceDetails("Workspace", "DeleteAiDataPlatformWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("time-data-lake-deletion", request.getTimeDataLakeDeletion())
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteAiDataPlatformWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformWorkspaceResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformWorkspaceResponse> getAiDataPlatformWorkspace(GetAiDataPlatformWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceRequest, GetAiDataPlatformWorkspaceResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, GetAiDataPlatformWorkspaceResponse::builder)
        .logger(LOG, "getAiDataPlatformWorkspace")
        .serviceDetails("Workspace", "GetAiDataPlatformWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, GetAiDataPlatformWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformWorkspaceResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformWorkspaceResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformCreateWorkspacePermissionsResponse> listAiDataPlatformCreateWorkspacePermissions(ListAiDataPlatformCreateWorkspacePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCreateWorkspacePermissionsRequest, ListAiDataPlatformCreateWorkspacePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformCreateWorkspacePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformCreateWorkspacePermissions")
        .serviceDetails("Workspace", "ListAiDataPlatformCreateWorkspacePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformCreateWorkspacePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("createWorkspacePermissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection.class, ListAiDataPlatformCreateWorkspacePermissionsResponse.Builder::createWorkspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformCreateWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformCreateWorkspacePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformWorkspacePermissionsResponse> listAiDataPlatformWorkspacePermissions(ListAiDataPlatformWorkspacePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspacePermissionsRequest, ListAiDataPlatformWorkspacePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAiDataPlatformWorkspacePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformWorkspacePermissions")
        .serviceDetails("Workspace", "ListAiDataPlatformWorkspacePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformWorkspacePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspacePermissionCollection.class, ListAiDataPlatformWorkspacePermissionsResponse.Builder::workspacePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformWorkspacePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformWorkspacePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformWorkspacesResponse> listAiDataPlatformWorkspaces(ListAiDataPlatformWorkspacesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspacesRequest, ListAiDataPlatformWorkspacesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformWorkspacesResponse::builder)
        .logger(LOG, "listAiDataPlatformWorkspaces")
        .serviceDetails("Workspace", "ListAiDataPlatformWorkspaces", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformWorkspacesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceCollection.class, ListAiDataPlatformWorkspacesResponse.Builder::workspaceCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformWorkspacesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformWorkspacesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformCreateWorkspacePermissionResponse> manageAiDataPlatformCreateWorkspacePermission(ManageAiDataPlatformCreateWorkspacePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCreateWorkspacePermissionRequest, ManageAiDataPlatformCreateWorkspacePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getManageCreateWorkspacePermissionDetails(), "manageCreateWorkspacePermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformCreateWorkspacePermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformCreateWorkspacePermission")
        .serviceDetails("Workspace", "ManageAiDataPlatformCreateWorkspacePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformCreateWorkspacePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("actions").appendPathParam("manageCreateWorkspacePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformCreateWorkspacePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformWorkspacePermissionResponse> manageAiDataPlatformWorkspacePermission(ManageAiDataPlatformWorkspacePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspacePermissionRequest, ManageAiDataPlatformWorkspacePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getManageWorkspacePermissionDetails(), "manageWorkspacePermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformWorkspacePermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformWorkspacePermission")
        .serviceDetails("Workspace", "ManageAiDataPlatformWorkspacePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformWorkspacePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformWorkspacePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceResponse> updateAiDataPlatformWorkspace(UpdateAiDataPlatformWorkspaceRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceRequest, UpdateAiDataPlatformWorkspaceResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceDetails(), "updateWorkspaceDetails is required");
        


return clientCall(request, UpdateAiDataPlatformWorkspaceResponse::builder)
        .logger(LOG, "updateAiDataPlatformWorkspace")
        .serviceDetails("Workspace", "UpdateAiDataPlatformWorkspace", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformWorkspaceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateAiDataPlatformWorkspaceResponse.Builder::workspace)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateAiDataPlatformWorkspaceResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformWorkspaceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformWorkspaceResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse> updateAiDataPlatformWorkspaceAsyncOperationStatus(UpdateAiDataPlatformWorkspaceAsyncOperationStatusRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceAsyncOperationStatusRequest, UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAsyncOperationKey(), "asyncOperationKey must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceAsyncOperationStatusDetails(), "updateWorkspaceAsyncOperationStatusDetails is required");
        


return clientCall(request, UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse::builder)
        .logger(LOG, "updateAiDataPlatformWorkspaceAsyncOperationStatus")
        .serviceDetails("Workspace", "UpdateAiDataPlatformWorkspaceAsyncOperationStatus", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformWorkspaceAsyncOperationStatusRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("asyncOperations").appendPathParam(request.getAsyncOperationKey()).appendPathParam("status")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Workspace.class, UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse.Builder::workspace)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformWorkspaceAsyncOperationStatusResponse.Builder::etag)
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
