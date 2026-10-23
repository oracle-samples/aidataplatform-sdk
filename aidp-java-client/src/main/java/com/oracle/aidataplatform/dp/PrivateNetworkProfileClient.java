// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class PrivateNetworkProfileClient extends com.oracle.bmc.http.internal.BaseSyncClient implements PrivateNetworkProfile {
    /**
     * Service instance for PrivateNetworkProfile.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("PRIVATENETWORKPROFILE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PrivateNetworkProfileClient.class);


    private final PrivateNetworkProfileWaiters waiters;

    PrivateNetworkProfileClient(
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
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("PrivateNetworkProfile-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new PrivateNetworkProfileWaiters(executorService, this);
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, PrivateNetworkProfileClient> {
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
        public PrivateNetworkProfileClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new PrivateNetworkProfileClient(this, authenticationDetailsProvider, executorService);
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
    
    public CreatePrivateNetworkProfileResponse createPrivateNetworkProfile(CreatePrivateNetworkProfileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, CreatePrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreatePrivateNetworkProfileResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("etag", 
            CreatePrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreatePrivateNetworkProfileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeletePrivateNetworkProfileResponse deletePrivateNetworkProfile(DeletePrivateNetworkProfileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeletePrivateNetworkProfileResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeletePrivateNetworkProfileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetPrivateNetworkProfileResponse getPrivateNetworkProfile(GetPrivateNetworkProfileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, GetPrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("etag", 
            GetPrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetPrivateNetworkProfileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListPrivateNetworkProfilesResponse listPrivateNetworkProfiles(ListPrivateNetworkProfilesRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfileCollection.class, ListPrivateNetworkProfilesResponse.Builder::privateNetworkProfileCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListPrivateNetworkProfilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListPrivateNetworkProfilesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListPrivateNetworkProfilesResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public UpdatePrivateNetworkProfileResponse updatePrivateNetworkProfile(UpdatePrivateNetworkProfileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.class, UpdatePrivateNetworkProfileResponse.Builder::privateNetworkProfile)
                .handleResponseHeaderString("etag", 
            UpdatePrivateNetworkProfileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdatePrivateNetworkProfileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    public PrivateNetworkProfileWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public PrivateNetworkProfileClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public PrivateNetworkProfileClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public PrivateNetworkProfileClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public PrivateNetworkProfileClient(
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
    public PrivateNetworkProfileClient(
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
    public PrivateNetworkProfileClient(
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
    public PrivateNetworkProfileClient(
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
    public PrivateNetworkProfileClient(
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
