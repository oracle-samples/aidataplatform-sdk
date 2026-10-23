// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for PrivateNetworkProfile service. <br/>
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
public class PrivateNetworkProfileAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements PrivateNetworkProfileAsync {
    /**
     * Service instance for PrivateNetworkProfile.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("PRIVATENETWORKPROFILE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PrivateNetworkProfileAsyncClient.class);

    PrivateNetworkProfileAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, PrivateNetworkProfileAsyncClient> {
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
        public PrivateNetworkProfileAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new PrivateNetworkProfileAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreatePrivateNetworkProfileResponse> createPrivateNetworkProfile(CreatePrivateNetworkProfileRequest request, final com.oracle.bmc.responses.AsyncHandler<CreatePrivateNetworkProfileRequest, CreatePrivateNetworkProfileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreatePrivateNetworkProfileDetails(), "createPrivateNetworkProfileDetails is required");
        


return clientCall(request, CreatePrivateNetworkProfileResponse::builder)
        .logger(LOG, "createPrivateNetworkProfile")
        .serviceDetails("PrivateNetworkProfile", "CreatePrivateNetworkProfile", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreatePrivateNetworkProfileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("privateNetworkProfiles")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, CreatePrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreatePrivateNetworkProfileResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("etag", 
            CreatePrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreatePrivateNetworkProfileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeletePrivateNetworkProfileResponse> deletePrivateNetworkProfile(DeletePrivateNetworkProfileRequest request, final com.oracle.bmc.responses.AsyncHandler<DeletePrivateNetworkProfileRequest, DeletePrivateNetworkProfileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getPrivateNetworkProfileKey(), "privateNetworkProfileKey must not be blank");


return clientCall(request, DeletePrivateNetworkProfileResponse::builder)
        .logger(LOG, "deletePrivateNetworkProfile")
        .serviceDetails("PrivateNetworkProfile", "DeletePrivateNetworkProfile", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeletePrivateNetworkProfileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("privateNetworkProfiles").appendPathParam(request.getPrivateNetworkProfileKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeletePrivateNetworkProfileResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeletePrivateNetworkProfileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetPrivateNetworkProfileResponse> getPrivateNetworkProfile(GetPrivateNetworkProfileRequest request, final com.oracle.bmc.responses.AsyncHandler<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getPrivateNetworkProfileKey(), "privateNetworkProfileKey must not be blank");


return clientCall(request, GetPrivateNetworkProfileResponse::builder)
        .logger(LOG, "getPrivateNetworkProfile")
        .serviceDetails("PrivateNetworkProfile", "GetPrivateNetworkProfile", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetPrivateNetworkProfileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("privateNetworkProfiles").appendPathParam(request.getPrivateNetworkProfileKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, GetPrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("etag", 
            GetPrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetPrivateNetworkProfileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListPrivateNetworkProfilesResponse> listPrivateNetworkProfiles(ListPrivateNetworkProfilesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListPrivateNetworkProfilesRequest, ListPrivateNetworkProfilesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListPrivateNetworkProfilesResponse::builder)
        .logger(LOG, "listPrivateNetworkProfiles")
        .serviceDetails("PrivateNetworkProfile", "ListPrivateNetworkProfiles", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListPrivateNetworkProfilesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("privateNetworkProfiles")
            
                
                    
                    .appendQueryParam("name", request.getName())
            
                
                    .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                    
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfileCollection.class, ListPrivateNetworkProfilesResponse.Builder::privateNetworkProfileCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListPrivateNetworkProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListPrivateNetworkProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListPrivateNetworkProfilesResponse.Builder::opcTotalItems)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdatePrivateNetworkProfileResponse> updatePrivateNetworkProfile(UpdatePrivateNetworkProfileRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdatePrivateNetworkProfileRequest, UpdatePrivateNetworkProfileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getPrivateNetworkProfileKey(), "privateNetworkProfileKey must not be blank");
        Objects.requireNonNull(request.getUpdatePrivateNetworkProfileDetails(), "updatePrivateNetworkProfileDetails is required");
        


return clientCall(request, UpdatePrivateNetworkProfileResponse::builder)
        .logger(LOG, "updatePrivateNetworkProfile")
        .serviceDetails("PrivateNetworkProfile", "UpdatePrivateNetworkProfile", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdatePrivateNetworkProfileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("privateNetworkProfiles").appendPathParam(request.getPrivateNetworkProfileKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, UpdatePrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("etag", 
            UpdatePrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdatePrivateNetworkProfileResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivateNetworkProfileAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public PrivateNetworkProfileAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public PrivateNetworkProfileAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public PrivateNetworkProfileAsyncClient(
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
    public PrivateNetworkProfileAsyncClient (
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
    public PrivateNetworkProfileAsyncClient (
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
    public PrivateNetworkProfileAsyncClient (
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
