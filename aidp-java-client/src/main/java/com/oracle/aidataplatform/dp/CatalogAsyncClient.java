// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Catalog service. <br/>
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
public class CatalogAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements CatalogAsync {
    /**
     * Service instance for Catalog.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("CATALOG").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CatalogAsyncClient.class);

    CatalogAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CatalogAsyncClient> {
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
        public CatalogAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new CatalogAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CatalogTestConnectionResponse> catalogTestConnection(CatalogTestConnectionRequest request, final com.oracle.bmc.responses.AsyncHandler<CatalogTestConnectionRequest, CatalogTestConnectionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogTestConnectionDetails(), "catalogTestConnectionDetails is required");
        


return clientCall(request, CatalogTestConnectionResponse::builder)
        .logger(LOG, "catalogTestConnection")
        .serviceDetails("Catalog", "CatalogTestConnection", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CatalogTestConnectionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("actions").appendPathParam("testConnection")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            CatalogTestConnectionResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CatalogTestConnectionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateCatalogResponse> createCatalog(CreateCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateCatalogDetails(), "createCatalogDetails is required");
        


return clientCall(request, CreateCatalogResponse::builder)
        .logger(LOG, "createCatalog")
        .serviceDetails("Catalog", "CreateCatalog", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateCatalogRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateCatalogResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateCatalogResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateCatalogResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateCatalogResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteCatalogResponse> deleteCatalog(DeleteCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");


return clientCall(request, DeleteCatalogResponse::builder)
        .logger(LOG, "deleteCatalog")
        .serviceDetails("Catalog", "DeleteCatalog", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteCatalogRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey())
        .accept("application/json")
                
                .appendHeader("is-forced", request.getIsForced())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteCatalogResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteCatalogResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetCatalogResponse> getCatalog(GetCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");


return clientCall(request, GetCatalogResponse::builder)
        .logger(LOG, "getCatalog")
        .serviceDetails("Catalog", "GetCatalog", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetCatalogRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey())
            
                
                    
                    .appendQueryParam("isCatalogGuid", request.getIsCatalogGuid())
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Catalog.class, GetCatalogResponse.Builder::catalog)
                .handleResponseHeaderString("etag", 
            GetCatalogResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetCatalogResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListCatalogPermissionsResponse> listCatalogPermissions(ListCatalogPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListCatalogPermissionsRequest, ListCatalogPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");


return clientCall(request, ListCatalogPermissionsResponse::builder)
        .logger(LOG, "listCatalogPermissions")
        .serviceDetails("Catalog", "ListCatalogPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListCatalogPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CatalogPermissionCollection.class, ListCatalogPermissionsResponse.Builder::catalogPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListCatalogPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListCatalogPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListCatalogsResponse::builder)
        .logger(LOG, "listCatalogs")
        .serviceDetails("Catalog", "ListCatalogs", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListCatalogsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    .appendEnumQueryParam("catalogState", request.getCatalogState())
                    
            
                
                    .appendEnumQueryParam("catalogType", request.getCatalogType())
                    
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CatalogCollection.class, ListCatalogsResponse.Builder::catalogCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListCatalogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListCatalogsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageCatalogPermissionResponse> manageCatalogPermission(ManageCatalogPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageCatalogPermissionRequest, ManageCatalogPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");
        Objects.requireNonNull(request.getManageCatalogPermissionDetails(), "manageCatalogPermissionDetails is required");
        


return clientCall(request, ManageCatalogPermissionResponse::builder)
        .logger(LOG, "manageCatalogPermission")
        .serviceDetails("Catalog", "ManageCatalogPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageCatalogPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageCatalogPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RefreshCatalogResponse> refreshCatalog(RefreshCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshCatalogRequest, RefreshCatalogResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");


return clientCall(request, RefreshCatalogResponse::builder)
        .logger(LOG, "refreshCatalog")
        .serviceDetails("Catalog", "RefreshCatalog", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RefreshCatalogRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey()).appendPathParam("actions").appendPathParam("refresh")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshCatalogResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshCatalogResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateCatalogResponse> updateCatalog(UpdateCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCatalogKey(), "catalogKey must not be blank");
        Objects.requireNonNull(request.getUpdateCatalogDetails(), "updateCatalogDetails is required");
        


return clientCall(request, UpdateCatalogResponse::builder)
        .logger(LOG, "updateCatalog")
        .serviceDetails("Catalog", "UpdateCatalog", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateCatalogRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("catalogs").appendPathParam(request.getCatalogKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateCatalogResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateCatalogResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public CatalogAsyncClient(
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
    public CatalogAsyncClient (
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
    public CatalogAsyncClient (
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
    public CatalogAsyncClient (
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
