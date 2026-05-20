// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CredentialsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Credentials {
    /**
     * Service instance for Credentials.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("CREDENTIALS").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CredentialsClient.class);



    CredentialsClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CredentialsClient> {
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
        public CredentialsClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new CredentialsClient(this, authenticationDetailsProvider);
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
    
    public CreateAiDataPlatformCredentialResponse createAiDataPlatformCredential(CreateAiDataPlatformCredentialRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateDataLakeCredentialDetails(), "createDataLakeCredentialDetails is required");
        


return clientCall(request, CreateAiDataPlatformCredentialResponse::builder)
        .logger(LOG, "createAiDataPlatformCredential")
        .serviceDetails("Credentials", "CreateAiDataPlatformCredential", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformCredentialRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("credentials")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformCredentialResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformCredentialResponse deleteAiDataPlatformCredential(DeleteAiDataPlatformCredentialRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");


return clientCall(request, DeleteAiDataPlatformCredentialResponse::builder)
        .logger(LOG, "deleteAiDataPlatformCredential")
        .serviceDetails("Credentials", "DeleteAiDataPlatformCredential", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformCredentialRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("credentials").appendPathParam(request.getCredentialKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformCredentialResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformCredentialResponse getAiDataPlatformCredential(GetAiDataPlatformCredentialRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");


return clientCall(request, GetAiDataPlatformCredentialResponse::builder)
        .logger(LOG, "getAiDataPlatformCredential")
        .serviceDetails("Credentials", "GetAiDataPlatformCredential", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformCredentialRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("credentials").appendPathParam(request.getCredentialKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Credential.class, GetAiDataPlatformCredentialResponse.Builder::credential)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformCredentialResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformCredentialResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformCredentialsResponse listAiDataPlatformCredentials(ListAiDataPlatformCredentialsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformCredentialsResponse::builder)
        .logger(LOG, "listAiDataPlatformCredentials")
        .serviceDetails("Credentials", "ListAiDataPlatformCredentials", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformCredentialsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("credentials")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("lifecycleState", request.getLifecycleState())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
            
                
                    .appendEnumQueryParam("credentialType", request.getCredentialType())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.CredentialCollection.class, ListAiDataPlatformCredentialsResponse.Builder::credentialCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformCredentialsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformCredentialsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformCredentialResponse updateAiDataPlatformCredential(UpdateAiDataPlatformCredentialRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getCredentialKey(), "credentialKey must not be blank");
        Objects.requireNonNull(request.getUpdateDataLakeCredentialDetails(), "updateDataLakeCredentialDetails is required");
        


return clientCall(request, UpdateAiDataPlatformCredentialResponse::builder)
        .logger(LOG, "updateAiDataPlatformCredential")
        .serviceDetails("Credentials", "UpdateAiDataPlatformCredential", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformCredentialRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("credentials").appendPathParam(request.getCredentialKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformCredentialResponse.Builder::opcRequestId)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CredentialsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public CredentialsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public CredentialsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public CredentialsClient(
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
    public CredentialsClient(
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
    public CredentialsClient(
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
    public CredentialsClient(
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
