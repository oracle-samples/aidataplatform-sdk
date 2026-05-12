package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SchemaClient implements Schema {
    /**
     * Service instance for Schema.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("SCHEMA").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaClient.class);

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
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public SchemaClient(
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
    public SchemaClient(
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
    public SchemaClient(
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
    public SchemaClient(
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
    protected SchemaClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SchemaClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public SchemaClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
            }
            return new SchemaClient(authenticationDetailsProvider,
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
    public CreateAiDataPlatformDataTableResponse createAiDataPlatformDataTable(CreateAiDataPlatformDataTableRequest request) {
        LOG.trace("Called createAiDataPlatformDataTable");
            final CreateAiDataPlatformDataTableRequest interceptedRequest = CreateAiDataPlatformDataTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformDataTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformDataTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformDataTableResponse> transformer = CreateAiDataPlatformDataTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateDataTableDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformSchemaResponse createAiDataPlatformSchema(CreateAiDataPlatformSchemaRequest request) {
        LOG.trace("Called createAiDataPlatformSchema");
            final CreateAiDataPlatformSchemaRequest interceptedRequest = CreateAiDataPlatformSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformSchemaResponse> transformer = CreateAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateSchemaDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformTableResponse createAiDataPlatformTable(CreateAiDataPlatformTableRequest request) {
        LOG.trace("Called createAiDataPlatformTable");
            final CreateAiDataPlatformTableRequest interceptedRequest = CreateAiDataPlatformTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformTableResponse> transformer = CreateAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateTableDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformViewResponse createAiDataPlatformView(CreateAiDataPlatformViewRequest request) {
        LOG.trace("Called createAiDataPlatformView");
            final CreateAiDataPlatformViewRequest interceptedRequest = CreateAiDataPlatformViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformViewResponse> transformer = CreateAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateViewDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformSchemaResponse deleteAiDataPlatformSchema(DeleteAiDataPlatformSchemaRequest request) {
        LOG.trace("Called deleteAiDataPlatformSchema");
            final DeleteAiDataPlatformSchemaRequest interceptedRequest = DeleteAiDataPlatformSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformSchemaResponse> transformer = DeleteAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.delete(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformTableResponse deleteAiDataPlatformTable(DeleteAiDataPlatformTableRequest request) {
        LOG.trace("Called deleteAiDataPlatformTable");
            final DeleteAiDataPlatformTableRequest interceptedRequest = DeleteAiDataPlatformTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformTableResponse> transformer = DeleteAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.delete(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public DeleteAiDataPlatformViewResponse deleteAiDataPlatformView(DeleteAiDataPlatformViewRequest request) {
        LOG.trace("Called deleteAiDataPlatformView");
            final DeleteAiDataPlatformViewRequest interceptedRequest = DeleteAiDataPlatformViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformViewResponse> transformer = DeleteAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.delete(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GenerateAiDataPlatformTempFileUploadTargetResponse generateAiDataPlatformTempFileUploadTarget(GenerateAiDataPlatformTempFileUploadTargetRequest request) {
        LOG.trace("Called generateAiDataPlatformTempFileUploadTarget");
            final GenerateAiDataPlatformTempFileUploadTargetRequest interceptedRequest = GenerateAiDataPlatformTempFileUploadTargetConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GenerateAiDataPlatformTempFileUploadTargetConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GenerateAiDataPlatformTempFileUploadTarget", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GenerateAiDataPlatformTempFileUploadTargetResponse> transformer = GenerateAiDataPlatformTempFileUploadTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public GetAiDataPlatformSchemaResponse getAiDataPlatformSchema(GetAiDataPlatformSchemaRequest request) {
        LOG.trace("Called getAiDataPlatformSchema");
            final GetAiDataPlatformSchemaRequest interceptedRequest = GetAiDataPlatformSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformSchemaResponse> transformer = GetAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAiDataPlatformTableResponse getAiDataPlatformTable(GetAiDataPlatformTableRequest request) {
        LOG.trace("Called getAiDataPlatformTable");
            final GetAiDataPlatformTableRequest interceptedRequest = GetAiDataPlatformTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformTableResponse> transformer = GetAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAiDataPlatformViewResponse getAiDataPlatformView(GetAiDataPlatformViewRequest request) {
        LOG.trace("Called getAiDataPlatformView");
            final GetAiDataPlatformViewRequest interceptedRequest = GetAiDataPlatformViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformViewResponse> transformer = GetAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformSchemaPermissionsResponse listAiDataPlatformSchemaPermissions(ListAiDataPlatformSchemaPermissionsRequest request) {
        LOG.trace("Called listAiDataPlatformSchemaPermissions");
            final ListAiDataPlatformSchemaPermissionsRequest interceptedRequest = ListAiDataPlatformSchemaPermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSchemaPermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformSchemaPermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSchemaPermissionsResponse> transformer = ListAiDataPlatformSchemaPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformSchemasResponse listAiDataPlatformSchemas(ListAiDataPlatformSchemasRequest request) {
        LOG.trace("Called listAiDataPlatformSchemas");
            final ListAiDataPlatformSchemasRequest interceptedRequest = ListAiDataPlatformSchemasConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSchemasConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformSchemas", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSchemasResponse> transformer = ListAiDataPlatformSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformTablePermissionsResponse listAiDataPlatformTablePermissions(ListAiDataPlatformTablePermissionsRequest request) {
        LOG.trace("Called listAiDataPlatformTablePermissions");
            final ListAiDataPlatformTablePermissionsRequest interceptedRequest = ListAiDataPlatformTablePermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformTablePermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformTablePermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformTablePermissionsResponse> transformer = ListAiDataPlatformTablePermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformTablesResponse listAiDataPlatformTables(ListAiDataPlatformTablesRequest request) {
        LOG.trace("Called listAiDataPlatformTables");
            final ListAiDataPlatformTablesRequest interceptedRequest = ListAiDataPlatformTablesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformTablesConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformTables", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformTablesResponse> transformer = ListAiDataPlatformTablesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformViewPermissionsResponse listAiDataPlatformViewPermissions(ListAiDataPlatformViewPermissionsRequest request) {
        LOG.trace("Called listAiDataPlatformViewPermissions");
            final ListAiDataPlatformViewPermissionsRequest interceptedRequest = ListAiDataPlatformViewPermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformViewPermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformViewPermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformViewPermissionsResponse> transformer = ListAiDataPlatformViewPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformViewsResponse listAiDataPlatformViews(ListAiDataPlatformViewsRequest request) {
        LOG.trace("Called listAiDataPlatformViews");
            final ListAiDataPlatformViewsRequest interceptedRequest = ListAiDataPlatformViewsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformViewsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformViews", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformViewsResponse> transformer = ListAiDataPlatformViewsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ManageAiDataPlatformSchemaPermissionResponse manageAiDataPlatformSchemaPermission(ManageAiDataPlatformSchemaPermissionRequest request) {
        LOG.trace("Called manageAiDataPlatformSchemaPermission");
            final ManageAiDataPlatformSchemaPermissionRequest interceptedRequest = ManageAiDataPlatformSchemaPermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformSchemaPermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformSchemaPermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformSchemaPermissionResponse> transformer = ManageAiDataPlatformSchemaPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getManageSchemaPermissionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ManageAiDataPlatformTablePermissionResponse manageAiDataPlatformTablePermission(ManageAiDataPlatformTablePermissionRequest request) {
        LOG.trace("Called manageAiDataPlatformTablePermission");
            final ManageAiDataPlatformTablePermissionRequest interceptedRequest = ManageAiDataPlatformTablePermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformTablePermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformTablePermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformTablePermissionResponse> transformer = ManageAiDataPlatformTablePermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getManageTablePermissionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ManageAiDataPlatformViewPermissionResponse manageAiDataPlatformViewPermission(ManageAiDataPlatformViewPermissionRequest request) {
        LOG.trace("Called manageAiDataPlatformViewPermission");
            final ManageAiDataPlatformViewPermissionRequest interceptedRequest = ManageAiDataPlatformViewPermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformViewPermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformViewPermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformViewPermissionResponse> transformer = ManageAiDataPlatformViewPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getManageViewPermissionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public PerformAiDataPlatformInferSchemaResponse performAiDataPlatformInferSchema(PerformAiDataPlatformInferSchemaRequest request) {
        LOG.trace("Called performAiDataPlatformInferSchema");
            final PerformAiDataPlatformInferSchemaRequest interceptedRequest = PerformAiDataPlatformInferSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformAiDataPlatformInferSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformAiDataPlatformInferSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, PerformAiDataPlatformInferSchemaResponse> transformer = PerformAiDataPlatformInferSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getPerformInferSchemaDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public PerformAiDataPlatformInferSchemaWithPreviewResponse performAiDataPlatformInferSchemaWithPreview(PerformAiDataPlatformInferSchemaWithPreviewRequest request) {
        LOG.trace("Called performAiDataPlatformInferSchemaWithPreview");
            final PerformAiDataPlatformInferSchemaWithPreviewRequest interceptedRequest = PerformAiDataPlatformInferSchemaWithPreviewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformAiDataPlatformInferSchemaWithPreviewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformAiDataPlatformInferSchemaWithPreview", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, PerformAiDataPlatformInferSchemaWithPreviewResponse> transformer = PerformAiDataPlatformInferSchemaWithPreviewConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getPerformInferSchemaDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RefreshAiDataPlatformSchemaResponse refreshAiDataPlatformSchema(RefreshAiDataPlatformSchemaRequest request) {
        LOG.trace("Called refreshAiDataPlatformSchema");
            final RefreshAiDataPlatformSchemaRequest interceptedRequest = RefreshAiDataPlatformSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshAiDataPlatformSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RefreshAiDataPlatformSchemaResponse> transformer = RefreshAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RefreshAiDataPlatformTableResponse refreshAiDataPlatformTable(RefreshAiDataPlatformTableRequest request) {
        LOG.trace("Called refreshAiDataPlatformTable");
            final RefreshAiDataPlatformTableRequest interceptedRequest = RefreshAiDataPlatformTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshAiDataPlatformTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RefreshAiDataPlatformTableResponse> transformer = RefreshAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RetrieveAiDataPlatformParResponse retrieveAiDataPlatformPar(RetrieveAiDataPlatformParRequest request) {
        LOG.trace("Called retrieveAiDataPlatformPar");
            final RetrieveAiDataPlatformParRequest interceptedRequest = RetrieveAiDataPlatformParConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RetrieveAiDataPlatformParConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RetrieveAiDataPlatformPar", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RetrieveAiDataPlatformParResponse> transformer = RetrieveAiDataPlatformParConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformSchemaResponse updateAiDataPlatformSchema(UpdateAiDataPlatformSchemaRequest request) {
        LOG.trace("Called updateAiDataPlatformSchema");
            final UpdateAiDataPlatformSchemaRequest interceptedRequest = UpdateAiDataPlatformSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformSchemaResponse> transformer = UpdateAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.put(ib, retriedRequest.getUpdateSchemaDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformTableResponse updateAiDataPlatformTable(UpdateAiDataPlatformTableRequest request) {
        LOG.trace("Called updateAiDataPlatformTable");
            final UpdateAiDataPlatformTableRequest interceptedRequest = UpdateAiDataPlatformTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformTableResponse> transformer = UpdateAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.put(ib, retriedRequest.getUpdateTableDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformViewResponse updateAiDataPlatformView(UpdateAiDataPlatformViewRequest request) {
        LOG.trace("Called updateAiDataPlatformView");
            final UpdateAiDataPlatformViewRequest interceptedRequest = UpdateAiDataPlatformViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformViewResponse> transformer = UpdateAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.put(ib, retriedRequest.getUpdateViewDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }


}
