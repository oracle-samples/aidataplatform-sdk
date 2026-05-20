// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class MLOpsClient implements MLOps {
    /**
     * Service instance for MLOps.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("MLOPS").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MLOpsClient.class);

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider;
    private final com.oracle.bmc.retrier.RetryConfiguration retryConfiguration;
    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy apacheConnectionClosingStrategy;
    private final com.oracle.bmc.http.internal.RestClientFactory restClientFactory;
    private final com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory;
    private final java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories;
    private final boolean isNonBufferingApacheClient;
    private final com.oracle.bmc.ClientConfiguration clientConfigurationToUse;
    private final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration circuitBreakerConfiguration;
    private String regionId;

    /**
     * Used to synchronize any updates on the `this.client` object.
     */
    private final Object clientUpdate = new Object();

    /**
     * Stores the actual client object used to make the API calls.
     * Note: This object can get refreshed periodically, hence it's important to keep any updates synchronized.
     *       For any writes to the object, please synchronize on `this.clientUpdate`.
     */
    private volatile com.oracle.bmc.http.internal.RestClient client;

    /**
     * Keeps track of the last endpoint that was assigned to the client, which in turn can be used when the client is refreshed.
     * Note: Always synchronize on `this.clientUpdate` when reading/writing this field.
     */
    private volatile String overrideEndpoint = null;

    /**
     * Creates a new service instance using the given authentication provider.
     * @param authenticationDetailsProvider The authentication details provider, required.
     */
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(authenticationDetailsProvider, configuration, clientConfigurator, new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD));
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     */
    public MLOpsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                defaultRequestSignerFactory,
                new java.util.ArrayList<com.oracle.bmc.http.ClientConfigurator>());
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     */
    public MLOpsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(authenticationDetailsProvider, configuration, clientConfigurator, defaultRequestSignerFactory, additionalClientConfigurators, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public MLOpsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(authenticationDetailsProvider, configuration, clientConfigurator, defaultRequestSignerFactory,
                com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory.createDefaultRequestSignerFactories(),
                additionalClientConfigurators, endpoint);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * <p>
     * This is an advanced constructor for clients that want to take control over how requests are signed.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     */
    public MLOpsClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
    this(authenticationDetailsProvider, configuration, clientConfigurator, defaultRequestSignerFactory,
            signingStrategyRequestSignerFactories, additionalClientConfigurators, endpoint, 
            com.oracle.bmc.http.internal.RestClientFactoryBuilder.builder());
    }

    /**
    * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
    * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
    * <p>
    * This is an advanced constructor for clients that want to take control over how requests are signed.
    * Use the {@link Builder} to get access to all these parameters.
    *
    * @param authenticationDetailsProvider The authentication details provider, required.
    * @param configuration The client configuration, optional.
    * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
    * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
    * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
    * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
    * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
    * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
    */
    protected MLOpsClient(
           com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
           com.oracle.bmc.ClientConfiguration configuration,
           com.oracle.bmc.http.ClientConfigurator clientConfigurator,
           com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
           java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
           java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
           String endpoint,
           com.oracle.bmc.http.internal.RestClientFactoryBuilder restClientFactoryBuilder) {
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        java.util.List<com.oracle.bmc.http.ClientConfigurator> authenticationDetailsConfigurators = new java.util.ArrayList<>();
        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.ProvidesClientConfigurators) {
            authenticationDetailsConfigurators.addAll(((com.oracle.bmc.auth.ProvidesClientConfigurators) this.authenticationDetailsProvider).getClientConfigurators());
        }
        java.util.List<com.oracle.bmc.http.ClientConfigurator> allConfigurators = new java.util.ArrayList<>(additionalClientConfigurators);
        allConfigurators.addAll(authenticationDetailsConfigurators);
        this.restClientFactory = restClientFactoryBuilder.clientConfigurator(clientConfigurator).additionalClientConfigurators(allConfigurators).build();
        this.isNonBufferingApacheClient = com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(this.restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());

        this.clientConfigurationToUse = (configuration != null) ? configuration : com.oracle.bmc.ClientConfiguration.builder().build();
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.retryConfiguration = clientConfigurationToUse.getRetryConfiguration();
        final com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration userCircuitBreakerConfiguration = CircuitBreakerUtils.getUserDefinedCircuitBreakerConfiguration(configuration);
        if (userCircuitBreakerConfiguration == null) {
            this.circuitBreakerConfiguration = CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION;
        } else { 
        this.circuitBreakerConfiguration = userCircuitBreakerConfiguration;
         } 

        this.refreshClient();


        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RegionProvider) {
            com.oracle.bmc.auth.RegionProvider provider = (com.oracle.bmc.auth.RegionProvider) this.authenticationDetailsProvider;

            if (provider.getRegion() != null) {
                this.regionId = provider.getRegion().getRegionId();
                this.setRegion(provider.getRegion());
                if (endpoint != null) {
                    LOG.info(
                        "Authentication details provider configured for region '{}', but endpoint specifically set to '{}'. Using endpoint setting instead of region.",
                        provider.getRegion(), endpoint);
                }
            }
        }
        if (endpoint != null) {
            setEndpoint(endpoint);
        }
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MLOpsClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MLOpsClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
            }
            return new MLOpsClient(authenticationDetailsProvider,
                    configuration,
                    clientConfigurator,
                    requestSignerFactory,
                    signingStrategyRequestSignerFactories,
                    additionalClientConfigurators,
                    endpoint,
                    restClientFactoryBuilder);
        }
    }

    @Override
    public void refreshClient() {
        LOG.info("Refreshing client '{}'.", this.client != null ? this.client.getClass() : null);
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner = this.defaultRequestSignerFactory.createRequestSigner(SERVICE, this.authenticationDetailsProvider);

        java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSigner> requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for(com.oracle.bmc.http.signing.SigningStrategy s: com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(s, this.signingStrategyRequestSignerFactories.get(s).createRequestSigner(SERVICE, this.authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient = this.restClientFactory.create(defaultRequestSigner, requestSigners, this.clientConfigurationToUse, this.isNonBufferingApacheClient, null, this.circuitBreakerConfiguration);

        synchronized (clientUpdate) {
            if (this.overrideEndpoint != null) {
                refreshedClient.setEndpoint(this.overrideEndpoint);
            }

            this.client = refreshedClient;
        }

        LOG.info("Refreshed client '{}'.", this.client != null ? this.client.getClass() : null);
    }

    @Override
    public void setEndpoint(String endpoint) {
        LOG.info("Setting endpoint to {}", endpoint);

        synchronized (clientUpdate) {
            this.overrideEndpoint = endpoint;
            client.setEndpoint(endpoint);
        }
    }

    @Override
    public String getEndpoint() {
        String endpoint = null;
        java.net.URI uri = client.getBaseTarget().getUri();
        if (uri != null) {
            endpoint = uri.toString();
        }
        return endpoint;
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        this.regionId = region.getRegionId();
        java.util.Optional<String> endpoint = com.oracle.bmc.internal.GuavaUtils.adaptFromGuava(region.getEndpoint(SERVICE));
        if (endpoint.isPresent()) {
            setEndpoint(endpoint.get());
        } else {
            throw new IllegalArgumentException(
                    "Endpoint for " + SERVICE + " is not known in region " + region);
        }
    }

    @Override
    public void setRegion(String regionId) {
        regionId = regionId.toLowerCase(java.util.Locale.ENGLISH);
        this.regionId = regionId;
        try {
            com.oracle.bmc.Region region = com.oracle.bmc.Region.fromRegionId(regionId);
            setRegion(region);
        } catch (IllegalArgumentException e) {
            LOG.info("Unknown regionId '{}', falling back to default endpoint format", regionId);
            String endpoint = com.oracle.bmc.Region.formatDefaultRegionEndpoint(SERVICE, regionId);
            setEndpoint(endpoint);
        }
    }

    /**
     * This method should be used to enable or disable the use of realm-specific endpoint template.
     * The default value is null. To enable the use of endpoint template defined for the realm in
     * use, set the flag to true To disable the use of endpoint template defined for the realm in
     * use, set the flag to false
     *
     * @param useOfRealmSpecificEndpointTemplateEnabled This flag can be set to true or false to
     * enable or disable the use of realm-specific endpoint template respectively
     */
    public synchronized void useRealmSpecificEndpointTemplate(
            boolean useOfRealmSpecificEndpointTemplateEnabled) {
        setEndpoint(com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils.getRealmSpecificEndpointTemplate(useOfRealmSpecificEndpointTemplateEnabled, this.regionId, SERVICE));
    }

    @Override
    public void close() {
        client.close();
    }

    @Override
    public CreateAiDataPlatformExperimentResponse createAiDataPlatformExperiment(CreateAiDataPlatformExperimentRequest request) {
        LOG.trace("Called createAiDataPlatformExperiment");
            final CreateAiDataPlatformExperimentRequest interceptedRequest = CreateAiDataPlatformExperimentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformExperimentResponse> transformer = CreateAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateExperimentDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformExperimentRunResponse createAiDataPlatformExperimentRun(CreateAiDataPlatformExperimentRunRequest request) {
        LOG.trace("Called createAiDataPlatformExperimentRun");
            final CreateAiDataPlatformExperimentRunRequest interceptedRequest = CreateAiDataPlatformExperimentRunConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformExperimentRunResponse> transformer = CreateAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateExperimentRunDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformModelVersionResponse createAiDataPlatformModelVersion(CreateAiDataPlatformModelVersionRequest request) {
        LOG.trace("Called createAiDataPlatformModelVersion");
            final CreateAiDataPlatformModelVersionRequest interceptedRequest = CreateAiDataPlatformModelVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformModelVersionResponse> transformer = CreateAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateModelVersionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformRegisteredModelResponse createAiDataPlatformRegisteredModel(CreateAiDataPlatformRegisteredModelRequest request) {
        LOG.trace("Called createAiDataPlatformRegisteredModel");
            final CreateAiDataPlatformRegisteredModelRequest interceptedRequest = CreateAiDataPlatformRegisteredModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformRegisteredModelResponse> transformer = CreateAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateRegisteredModelDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformWorkspaceModelVersionResponse createAiDataPlatformWorkspaceModelVersion(CreateAiDataPlatformWorkspaceModelVersionRequest request) {
        LOG.trace("Called createAiDataPlatformWorkspaceModelVersion");
            final CreateAiDataPlatformWorkspaceModelVersionRequest interceptedRequest = CreateAiDataPlatformWorkspaceModelVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformWorkspaceModelVersionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformWorkspaceModelVersion", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformWorkspaceModelVersionResponse> transformer = CreateAiDataPlatformWorkspaceModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateModelVersionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformExperimentResponse deleteAiDataPlatformExperiment(DeleteAiDataPlatformExperimentRequest request) {
        LOG.trace("Called deleteAiDataPlatformExperiment");
            final DeleteAiDataPlatformExperimentRequest interceptedRequest = DeleteAiDataPlatformExperimentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentResponse> transformer = DeleteAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteExperimentDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformExperimentRunResponse deleteAiDataPlatformExperimentRun(DeleteAiDataPlatformExperimentRunRequest request) {
        LOG.trace("Called deleteAiDataPlatformExperimentRun");
            final DeleteAiDataPlatformExperimentRunRequest interceptedRequest = DeleteAiDataPlatformExperimentRunConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentRunResponse> transformer = DeleteAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteExperimentRunDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformExperimentRunTagResponse deleteAiDataPlatformExperimentRunTag(DeleteAiDataPlatformExperimentRunTagRequest request) {
        LOG.trace("Called deleteAiDataPlatformExperimentRunTag");
            final DeleteAiDataPlatformExperimentRunTagRequest interceptedRequest = DeleteAiDataPlatformExperimentRunTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentRunTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentRunTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentRunTagResponse> transformer = DeleteAiDataPlatformExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteExperimentRunTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformExperimentTagResponse deleteAiDataPlatformExperimentTag(DeleteAiDataPlatformExperimentTagRequest request) {
        LOG.trace("Called deleteAiDataPlatformExperimentTag");
            final DeleteAiDataPlatformExperimentTagRequest interceptedRequest = DeleteAiDataPlatformExperimentTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentTagResponse> transformer = DeleteAiDataPlatformExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteExperimentTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformModelVersionResponse deleteAiDataPlatformModelVersion(DeleteAiDataPlatformModelVersionRequest request) {
        LOG.trace("Called deleteAiDataPlatformModelVersion");
            final DeleteAiDataPlatformModelVersionRequest interceptedRequest = DeleteAiDataPlatformModelVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformModelVersionResponse> transformer = DeleteAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteModelVersionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformModelVersionTagResponse deleteAiDataPlatformModelVersionTag(DeleteAiDataPlatformModelVersionTagRequest request) {
        LOG.trace("Called deleteAiDataPlatformModelVersionTag");
            final DeleteAiDataPlatformModelVersionTagRequest interceptedRequest = DeleteAiDataPlatformModelVersionTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformModelVersionTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformModelVersionTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformModelVersionTagResponse> transformer = DeleteAiDataPlatformModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteModelVersionTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformRegisteredModelResponse deleteAiDataPlatformRegisteredModel(DeleteAiDataPlatformRegisteredModelRequest request) {
        LOG.trace("Called deleteAiDataPlatformRegisteredModel");
            final DeleteAiDataPlatformRegisteredModelRequest interceptedRequest = DeleteAiDataPlatformRegisteredModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformRegisteredModelResponse> transformer = DeleteAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteRegisteredModelDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformRegisteredModelTagResponse deleteAiDataPlatformRegisteredModelTag(DeleteAiDataPlatformRegisteredModelTagRequest request) {
        LOG.trace("Called deleteAiDataPlatformRegisteredModelTag");
            final DeleteAiDataPlatformRegisteredModelTagRequest interceptedRequest = DeleteAiDataPlatformRegisteredModelTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformRegisteredModelTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformRegisteredModelTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformRegisteredModelTagResponse> transformer = DeleteAiDataPlatformRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getDeleteRegisteredModelTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformExperimentByIdResponse getAiDataPlatformExperimentById(GetAiDataPlatformExperimentByIdRequest request) {
        LOG.trace("Called getAiDataPlatformExperimentById");
            final GetAiDataPlatformExperimentByIdRequest interceptedRequest = GetAiDataPlatformExperimentByIdConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentByIdConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentById", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentByIdResponse> transformer = GetAiDataPlatformExperimentByIdConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformExperimentByNameResponse getAiDataPlatformExperimentByName(GetAiDataPlatformExperimentByNameRequest request) {
        LOG.trace("Called getAiDataPlatformExperimentByName");
            final GetAiDataPlatformExperimentByNameRequest interceptedRequest = GetAiDataPlatformExperimentByNameConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentByNameConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentByName", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentByNameResponse> transformer = GetAiDataPlatformExperimentByNameConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformExperimentRunByIdResponse getAiDataPlatformExperimentRunById(GetAiDataPlatformExperimentRunByIdRequest request) {
        LOG.trace("Called getAiDataPlatformExperimentRunById");
            final GetAiDataPlatformExperimentRunByIdRequest interceptedRequest = GetAiDataPlatformExperimentRunByIdConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentRunByIdConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentRunById", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentRunByIdResponse> transformer = GetAiDataPlatformExperimentRunByIdConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformExperimentRunMetricHistoryResponse getAiDataPlatformExperimentRunMetricHistory(GetAiDataPlatformExperimentRunMetricHistoryRequest request) {
        LOG.trace("Called getAiDataPlatformExperimentRunMetricHistory");
            final GetAiDataPlatformExperimentRunMetricHistoryRequest interceptedRequest = GetAiDataPlatformExperimentRunMetricHistoryConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentRunMetricHistoryConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentRunMetricHistory", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentRunMetricHistoryResponse> transformer = GetAiDataPlatformExperimentRunMetricHistoryConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformModelVersionResponse getAiDataPlatformModelVersion(GetAiDataPlatformModelVersionRequest request) {
        LOG.trace("Called getAiDataPlatformModelVersion");
            final GetAiDataPlatformModelVersionRequest interceptedRequest = GetAiDataPlatformModelVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformModelVersionResponse> transformer = GetAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformRegisteredModelResponse getAiDataPlatformRegisteredModel(GetAiDataPlatformRegisteredModelRequest request) {
        LOG.trace("Called getAiDataPlatformRegisteredModel");
            final GetAiDataPlatformRegisteredModelRequest interceptedRequest = GetAiDataPlatformRegisteredModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformRegisteredModelResponse> transformer = GetAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformArtifactsResponse listAiDataPlatformArtifacts(ListAiDataPlatformArtifactsRequest request) {
        LOG.trace("Called listAiDataPlatformArtifacts");
            final ListAiDataPlatformArtifactsRequest interceptedRequest = ListAiDataPlatformArtifactsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformArtifactsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformArtifacts", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformArtifactsResponse> transformer = ListAiDataPlatformArtifactsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformExperimentRunsResponse listAiDataPlatformExperimentRuns(ListAiDataPlatformExperimentRunsRequest request) {
        LOG.trace("Called listAiDataPlatformExperimentRuns");
            final ListAiDataPlatformExperimentRunsRequest interceptedRequest = ListAiDataPlatformExperimentRunsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformExperimentRunsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformExperimentRuns", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformExperimentRunsResponse> transformer = ListAiDataPlatformExperimentRunsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getListExperimentRunsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformExperimentsResponse listAiDataPlatformExperiments(ListAiDataPlatformExperimentsRequest request) {
        LOG.trace("Called listAiDataPlatformExperiments");
            final ListAiDataPlatformExperimentsRequest interceptedRequest = ListAiDataPlatformExperimentsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformExperimentsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformExperiments", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformExperimentsResponse> transformer = ListAiDataPlatformExperimentsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getListExperimentsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformLoggedModelsResponse listAiDataPlatformLoggedModels(ListAiDataPlatformLoggedModelsRequest request) {
        LOG.trace("Called listAiDataPlatformLoggedModels");
            final ListAiDataPlatformLoggedModelsRequest interceptedRequest = ListAiDataPlatformLoggedModelsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformLoggedModelsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformLoggedModels", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformLoggedModelsResponse> transformer = ListAiDataPlatformLoggedModelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getListLoggedModelsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformModelVersionsResponse listAiDataPlatformModelVersions(ListAiDataPlatformModelVersionsRequest request) {
        LOG.trace("Called listAiDataPlatformModelVersions");
            final ListAiDataPlatformModelVersionsRequest interceptedRequest = ListAiDataPlatformModelVersionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformModelVersionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformModelVersions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformModelVersionsResponse> transformer = ListAiDataPlatformModelVersionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformRegisteredModelsResponse listAiDataPlatformRegisteredModels(ListAiDataPlatformRegisteredModelsRequest request) {
        LOG.trace("Called listAiDataPlatformRegisteredModels");
            final ListAiDataPlatformRegisteredModelsRequest interceptedRequest = ListAiDataPlatformRegisteredModelsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRegisteredModelsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformRegisteredModels", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRegisteredModelsResponse> transformer = ListAiDataPlatformRegisteredModelsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.get(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public LogAiDataPlatformExperimentRunBatchResponse logAiDataPlatformExperimentRunBatch(LogAiDataPlatformExperimentRunBatchRequest request) {
        LOG.trace("Called logAiDataPlatformExperimentRunBatch");
            final LogAiDataPlatformExperimentRunBatchRequest interceptedRequest = LogAiDataPlatformExperimentRunBatchConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunBatchConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunBatch", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunBatchResponse> transformer = LogAiDataPlatformExperimentRunBatchConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getLogExperimentRunBatchDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public LogAiDataPlatformExperimentRunInputsResponse logAiDataPlatformExperimentRunInputs(LogAiDataPlatformExperimentRunInputsRequest request) {
        LOG.trace("Called logAiDataPlatformExperimentRunInputs");
            final LogAiDataPlatformExperimentRunInputsRequest interceptedRequest = LogAiDataPlatformExperimentRunInputsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunInputsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunInputs", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunInputsResponse> transformer = LogAiDataPlatformExperimentRunInputsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getLogExperimentRunInputsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public LogAiDataPlatformExperimentRunMetricResponse logAiDataPlatformExperimentRunMetric(LogAiDataPlatformExperimentRunMetricRequest request) {
        LOG.trace("Called logAiDataPlatformExperimentRunMetric");
            final LogAiDataPlatformExperimentRunMetricRequest interceptedRequest = LogAiDataPlatformExperimentRunMetricConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunMetricConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunMetric", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunMetricResponse> transformer = LogAiDataPlatformExperimentRunMetricConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getLogExperimentRunMetricDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public LogAiDataPlatformExperimentRunModelResponse logAiDataPlatformExperimentRunModel(LogAiDataPlatformExperimentRunModelRequest request) {
        LOG.trace("Called logAiDataPlatformExperimentRunModel");
            final LogAiDataPlatformExperimentRunModelRequest interceptedRequest = LogAiDataPlatformExperimentRunModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunModelResponse> transformer = LogAiDataPlatformExperimentRunModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getLogExperimentRunModelDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public LogAiDataPlatformExperimentRunParamResponse logAiDataPlatformExperimentRunParam(LogAiDataPlatformExperimentRunParamRequest request) {
        LOG.trace("Called logAiDataPlatformExperimentRunParam");
            final LogAiDataPlatformExperimentRunParamRequest interceptedRequest = LogAiDataPlatformExperimentRunParamConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunParamConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunParam", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunParamResponse> transformer = LogAiDataPlatformExperimentRunParamConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getLogExperimentRunParamDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RenameAiDataPlatformRegisteredModelResponse renameAiDataPlatformRegisteredModel(RenameAiDataPlatformRegisteredModelRequest request) {
        LOG.trace("Called renameAiDataPlatformRegisteredModel");
            final RenameAiDataPlatformRegisteredModelRequest interceptedRequest = RenameAiDataPlatformRegisteredModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RenameAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RenameAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RenameAiDataPlatformRegisteredModelResponse> transformer = RenameAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getRenameRegisteredModelDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RestoreAiDataPlatformExperimentResponse restoreAiDataPlatformExperiment(RestoreAiDataPlatformExperimentRequest request) {
        LOG.trace("Called restoreAiDataPlatformExperiment");
            final RestoreAiDataPlatformExperimentRequest interceptedRequest = RestoreAiDataPlatformExperimentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RestoreAiDataPlatformExperimentResponse> transformer = RestoreAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getRestoreExperimentDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RestoreAiDataPlatformExperimentRunResponse restoreAiDataPlatformExperimentRun(RestoreAiDataPlatformExperimentRunRequest request) {
        LOG.trace("Called restoreAiDataPlatformExperimentRun");
            final RestoreAiDataPlatformExperimentRunRequest interceptedRequest = RestoreAiDataPlatformExperimentRunConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RestoreAiDataPlatformExperimentRunResponse> transformer = RestoreAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getRestoreExperimentRunDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public SetAiDataPlatformExperimentRunTagResponse setAiDataPlatformExperimentRunTag(SetAiDataPlatformExperimentRunTagRequest request) {
        LOG.trace("Called setAiDataPlatformExperimentRunTag");
            final SetAiDataPlatformExperimentRunTagRequest interceptedRequest = SetAiDataPlatformExperimentRunTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformExperimentRunTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformExperimentRunTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformExperimentRunTagResponse> transformer = SetAiDataPlatformExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getSetExperimentRunTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public SetAiDataPlatformExperimentTagResponse setAiDataPlatformExperimentTag(SetAiDataPlatformExperimentTagRequest request) {
        LOG.trace("Called setAiDataPlatformExperimentTag");
            final SetAiDataPlatformExperimentTagRequest interceptedRequest = SetAiDataPlatformExperimentTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformExperimentTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformExperimentTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformExperimentTagResponse> transformer = SetAiDataPlatformExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getSetExperimentTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public SetAiDataPlatformModelVersionTagResponse setAiDataPlatformModelVersionTag(SetAiDataPlatformModelVersionTagRequest request) {
        LOG.trace("Called setAiDataPlatformModelVersionTag");
            final SetAiDataPlatformModelVersionTagRequest interceptedRequest = SetAiDataPlatformModelVersionTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformModelVersionTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformModelVersionTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformModelVersionTagResponse> transformer = SetAiDataPlatformModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getSetModelVersionTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public SetAiDataPlatformRegisteredModelTagResponse setAiDataPlatformRegisteredModelTag(SetAiDataPlatformRegisteredModelTagRequest request) {
        LOG.trace("Called setAiDataPlatformRegisteredModelTag");
            final SetAiDataPlatformRegisteredModelTagRequest interceptedRequest = SetAiDataPlatformRegisteredModelTagConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformRegisteredModelTagConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformRegisteredModelTag", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformRegisteredModelTagResponse> transformer = SetAiDataPlatformRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getSetRegisteredModelTagDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public TransitionAiDataPlatformModelVersionStageResponse transitionAiDataPlatformModelVersionStage(TransitionAiDataPlatformModelVersionStageRequest request) {
        LOG.trace("Called transitionAiDataPlatformModelVersionStage");
            final TransitionAiDataPlatformModelVersionStageRequest interceptedRequest = TransitionAiDataPlatformModelVersionStageConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = TransitionAiDataPlatformModelVersionStageConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "TransitionAiDataPlatformModelVersionStage", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, TransitionAiDataPlatformModelVersionStageResponse> transformer = TransitionAiDataPlatformModelVersionStageConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getTransitionModelVersionStageDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformExperimentResponse updateAiDataPlatformExperiment(UpdateAiDataPlatformExperimentRequest request) {
        LOG.trace("Called updateAiDataPlatformExperiment");
            final UpdateAiDataPlatformExperimentRequest interceptedRequest = UpdateAiDataPlatformExperimentConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentResponse> transformer = UpdateAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateExperimentDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformExperimentRunResponse updateAiDataPlatformExperimentRun(UpdateAiDataPlatformExperimentRunRequest request) {
        LOG.trace("Called updateAiDataPlatformExperimentRun");
            final UpdateAiDataPlatformExperimentRunRequest interceptedRequest = UpdateAiDataPlatformExperimentRunConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentRunResponse> transformer = UpdateAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateExperimentRunDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformExperimentRunTagsResponse updateAiDataPlatformExperimentRunTags(UpdateAiDataPlatformExperimentRunTagsRequest request) {
        LOG.trace("Called updateAiDataPlatformExperimentRunTags");
            final UpdateAiDataPlatformExperimentRunTagsRequest interceptedRequest = UpdateAiDataPlatformExperimentRunTagsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentRunTagsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentRunTags", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentRunTagsResponse> transformer = UpdateAiDataPlatformExperimentRunTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateExperimentRunTagsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformExperimentTagsResponse updateAiDataPlatformExperimentTags(UpdateAiDataPlatformExperimentTagsRequest request) {
        LOG.trace("Called updateAiDataPlatformExperimentTags");
            final UpdateAiDataPlatformExperimentTagsRequest interceptedRequest = UpdateAiDataPlatformExperimentTagsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentTagsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentTags", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentTagsResponse> transformer = UpdateAiDataPlatformExperimentTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateExperimentTagsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformModelVersionResponse updateAiDataPlatformModelVersion(UpdateAiDataPlatformModelVersionRequest request) {
        LOG.trace("Called updateAiDataPlatformModelVersion");
            final UpdateAiDataPlatformModelVersionRequest interceptedRequest = UpdateAiDataPlatformModelVersionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformModelVersionResponse> transformer = UpdateAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateModelVersionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformModelVersionTagsResponse updateAiDataPlatformModelVersionTags(UpdateAiDataPlatformModelVersionTagsRequest request) {
        LOG.trace("Called updateAiDataPlatformModelVersionTags");
            final UpdateAiDataPlatformModelVersionTagsRequest interceptedRequest = UpdateAiDataPlatformModelVersionTagsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformModelVersionTagsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformModelVersionTags", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformModelVersionTagsResponse> transformer = UpdateAiDataPlatformModelVersionTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateModelVersionTagsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformRegisteredModelResponse updateAiDataPlatformRegisteredModel(UpdateAiDataPlatformRegisteredModelRequest request) {
        LOG.trace("Called updateAiDataPlatformRegisteredModel");
            final UpdateAiDataPlatformRegisteredModelRequest interceptedRequest = UpdateAiDataPlatformRegisteredModelConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformRegisteredModelResponse> transformer = UpdateAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateRegisteredModelDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformRegisteredModelTagsResponse updateAiDataPlatformRegisteredModelTags(UpdateAiDataPlatformRegisteredModelTagsRequest request) {
        LOG.trace("Called updateAiDataPlatformRegisteredModelTags");
            final UpdateAiDataPlatformRegisteredModelTagsRequest interceptedRequest = UpdateAiDataPlatformRegisteredModelTagsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformRegisteredModelTagsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformRegisteredModelTags", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformRegisteredModelTagsResponse> transformer = UpdateAiDataPlatformRegisteredModelTagsConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUpdateRegisteredModelTagsDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }


}
