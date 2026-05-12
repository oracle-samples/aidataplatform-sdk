package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Role service. <br/>
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
public class RoleAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements RoleAsync {
    /**
     * Service instance for Role.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("ROLE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RoleAsyncClient.class);

    RoleAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoleAsyncClient> {
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
        public RoleAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new RoleAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<AddAiDataPlatformMemberToRoleResponse> addAiDataPlatformMemberToRole(AddAiDataPlatformMemberToRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<AddAiDataPlatformMemberToRoleRequest, AddAiDataPlatformMemberToRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");
        Objects.requireNonNull(request.getAddMemberToRoleDetails(), "addMemberToRoleDetails is required");
        


return clientCall(request, AddAiDataPlatformMemberToRoleResponse::builder)
        .logger(LOG, "addAiDataPlatformMemberToRole")
        .serviceDetails("Role", "AddAiDataPlatformMemberToRole", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(AddAiDataPlatformMemberToRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey()).appendPathParam("actions").appendPathParam("addMember")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            AddAiDataPlatformMemberToRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformRoleResponse> createAiDataPlatformRole(CreateAiDataPlatformRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRoleRequest, CreateAiDataPlatformRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateRoleDetails(), "createRoleDetails is required");
        


return clientCall(request, CreateAiDataPlatformRoleResponse::builder)
        .logger(LOG, "createAiDataPlatformRole")
        .serviceDetails("Role", "CreateAiDataPlatformRole", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Role.class, CreateAiDataPlatformRoleResponse.Builder::role)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformRoleResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformRoleResponse> deleteAiDataPlatformRole(DeleteAiDataPlatformRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRoleRequest, DeleteAiDataPlatformRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");


return clientCall(request, DeleteAiDataPlatformRoleResponse::builder)
        .logger(LOG, "deleteAiDataPlatformRole")
        .serviceDetails("Role", "DeleteAiDataPlatformRole", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformRoleResponse> getAiDataPlatformRole(GetAiDataPlatformRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRoleRequest, GetAiDataPlatformRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");


return clientCall(request, GetAiDataPlatformRoleResponse::builder)
        .logger(LOG, "getAiDataPlatformRole")
        .serviceDetails("Role", "GetAiDataPlatformRole", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey())
            
                
                    .appendEnumQueryParam("roleScope", request.getRoleScope())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Role.class, GetAiDataPlatformRoleResponse.Builder::role)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformRoleResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRolePermissionsResponse> listAiDataPlatformRolePermissions(ListAiDataPlatformRolePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRolePermissionsRequest, ListAiDataPlatformRolePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");


return clientCall(request, ListAiDataPlatformRolePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformRolePermissions")
        .serviceDetails("Role", "ListAiDataPlatformRolePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRolePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey()).appendPathParam("permissions")
            
                
                    .appendEnumQueryParam("permissionScope", request.getPermissionScope())
                    
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RolePermissionCollection.class, ListAiDataPlatformRolePermissionsResponse.Builder::rolePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRolePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRolePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRolesResponse> listAiDataPlatformRoles(ListAiDataPlatformRolesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRolesRequest, ListAiDataPlatformRolesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformRolesResponse::builder)
        .logger(LOG, "listAiDataPlatformRoles")
        .serviceDetails("Role", "ListAiDataPlatformRoles", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRolesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles")
            
                
                    .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                    
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RoleCollection.class, ListAiDataPlatformRolesResponse.Builder::roleCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRolesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRolesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RemoveAiDataPlatformMemberFromRoleResponse> removeAiDataPlatformMemberFromRole(RemoveAiDataPlatformMemberFromRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<RemoveAiDataPlatformMemberFromRoleRequest, RemoveAiDataPlatformMemberFromRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");
        Objects.requireNonNull(request.getRemoveMemberFromRoleDetails(), "removeMemberFromRoleDetails is required");
        


return clientCall(request, RemoveAiDataPlatformMemberFromRoleResponse::builder)
        .logger(LOG, "removeAiDataPlatformMemberFromRole")
        .serviceDetails("Role", "RemoveAiDataPlatformMemberFromRole", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RemoveAiDataPlatformMemberFromRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey()).appendPathParam("actions").appendPathParam("removeMember")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            RemoveAiDataPlatformMemberFromRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformRoleResponse> updateAiDataPlatformRole(UpdateAiDataPlatformRoleRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRoleRequest, UpdateAiDataPlatformRoleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRoleKey(), "roleKey must not be blank");
        Objects.requireNonNull(request.getUpdateRoleDetails(), "updateRoleDetails is required");
        


return clientCall(request, UpdateAiDataPlatformRoleResponse::builder)
        .logger(LOG, "updateAiDataPlatformRole")
        .serviceDetails("Role", "UpdateAiDataPlatformRole", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformRoleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("roles").appendPathParam(request.getRoleKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Role.class, UpdateAiDataPlatformRoleResponse.Builder::role)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformRoleResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformRoleResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public RoleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public RoleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public RoleAsyncClient(
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
    public RoleAsyncClient (
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
    public RoleAsyncClient (
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
    public RoleAsyncClient (
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
