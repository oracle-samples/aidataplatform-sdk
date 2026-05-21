// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

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

    private final SchemaWaiters waiters;
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
        this(authenticationDetailsProvider, configuration, clientConfigurator, defaultRequestSignerFactory, signingStrategyRequestSignerFactories, additionalClientConfigurators, endpoint, null);
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
     * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
     */
    public SchemaClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
    this(authenticationDetailsProvider, configuration, clientConfigurator, defaultRequestSignerFactory,
            signingStrategyRequestSignerFactories, additionalClientConfigurators, endpoint, executorService, 
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
    * @param executorService ExecutorService used by the client, or null to use the default configured ThreadPoolExecutor
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
           java.util.concurrent.ExecutorService executorService,
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

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("Schema-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SchemaWaiters(executorService, this);
        
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
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
                    executorService,
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
    public CreateDataTableResponse createDataTable(CreateDataTableRequest request) {
        LOG.trace("Called createDataTable");
            final CreateDataTableRequest interceptedRequest = CreateDataTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateDataTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateDataTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateDataTableResponse> transformer = CreateDataTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public CreateSchemaResponse createSchema(CreateSchemaRequest request) {
        LOG.trace("Called createSchema");
            final CreateSchemaRequest interceptedRequest = CreateSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateSchemaResponse> transformer = CreateSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public CreateTableResponse createTable(CreateTableRequest request) {
        LOG.trace("Called createTable");
            final CreateTableRequest interceptedRequest = CreateTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateTableResponse> transformer = CreateTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public CreateViewResponse createView(CreateViewRequest request) {
        LOG.trace("Called createView");
            final CreateViewRequest interceptedRequest = CreateViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateViewResponse> transformer = CreateViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteSchemaResponse deleteSchema(DeleteSchemaRequest request) {
        LOG.trace("Called deleteSchema");
            final DeleteSchemaRequest interceptedRequest = DeleteSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteSchemaResponse> transformer = DeleteSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
        LOG.trace("Called deleteTable");
            final DeleteTableRequest interceptedRequest = DeleteTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteTableResponse> transformer = DeleteTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DeleteViewResponse deleteView(DeleteViewRequest request) {
        LOG.trace("Called deleteView");
            final DeleteViewRequest interceptedRequest = DeleteViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteViewResponse> transformer = DeleteViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GenerateTempFileUploadTargetResponse generateTempFileUploadTarget(GenerateTempFileUploadTargetRequest request) {
        LOG.trace("Called generateTempFileUploadTarget");
            final GenerateTempFileUploadTargetRequest interceptedRequest = GenerateTempFileUploadTargetConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GenerateTempFileUploadTargetConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GenerateTempFileUploadTarget", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GenerateTempFileUploadTargetResponse> transformer = GenerateTempFileUploadTargetConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetSchemaResponse getSchema(GetSchemaRequest request) {
        LOG.trace("Called getSchema");
            final GetSchemaRequest interceptedRequest = GetSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetSchemaResponse> transformer = GetSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetTableResponse getTable(GetTableRequest request) {
        LOG.trace("Called getTable");
            final GetTableRequest interceptedRequest = GetTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetTableResponse> transformer = GetTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetViewResponse getView(GetViewRequest request) {
        LOG.trace("Called getView");
            final GetViewRequest interceptedRequest = GetViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetViewResponse> transformer = GetViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSchemaPermissionsResponse listSchemaPermissions(ListSchemaPermissionsRequest request) {
        LOG.trace("Called listSchemaPermissions");
            final ListSchemaPermissionsRequest interceptedRequest = ListSchemaPermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListSchemaPermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListSchemaPermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListSchemaPermissionsResponse> transformer = ListSchemaPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
        LOG.trace("Called listSchemas");
            final ListSchemasRequest interceptedRequest = ListSchemasConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListSchemasConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListSchemas", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListSchemasResponse> transformer = ListSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListTablePermissionsResponse listTablePermissions(ListTablePermissionsRequest request) {
        LOG.trace("Called listTablePermissions");
            final ListTablePermissionsRequest interceptedRequest = ListTablePermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListTablePermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListTablePermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListTablePermissionsResponse> transformer = ListTablePermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListTablesResponse listTables(ListTablesRequest request) {
        LOG.trace("Called listTables");
            final ListTablesRequest interceptedRequest = ListTablesConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListTablesConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListTables", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListTablesResponse> transformer = ListTablesConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListViewPermissionsResponse listViewPermissions(ListViewPermissionsRequest request) {
        LOG.trace("Called listViewPermissions");
            final ListViewPermissionsRequest interceptedRequest = ListViewPermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListViewPermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListViewPermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListViewPermissionsResponse> transformer = ListViewPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListViewsResponse listViews(ListViewsRequest request) {
        LOG.trace("Called listViews");
            final ListViewsRequest interceptedRequest = ListViewsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListViewsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListViews", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListViewsResponse> transformer = ListViewsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ManageSchemaPermissionResponse manageSchemaPermission(ManageSchemaPermissionRequest request) {
        LOG.trace("Called manageSchemaPermission");
            final ManageSchemaPermissionRequest interceptedRequest = ManageSchemaPermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageSchemaPermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageSchemaPermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageSchemaPermissionResponse> transformer = ManageSchemaPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ManageTablePermissionResponse manageTablePermission(ManageTablePermissionRequest request) {
        LOG.trace("Called manageTablePermission");
            final ManageTablePermissionRequest interceptedRequest = ManageTablePermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageTablePermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageTablePermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageTablePermissionResponse> transformer = ManageTablePermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ManageViewPermissionResponse manageViewPermission(ManageViewPermissionRequest request) {
        LOG.trace("Called manageViewPermission");
            final ManageViewPermissionRequest interceptedRequest = ManageViewPermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageViewPermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageViewPermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageViewPermissionResponse> transformer = ManageViewPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public PerformInferSchemaResponse performInferSchema(PerformInferSchemaRequest request) {
        LOG.trace("Called performInferSchema");
            final PerformInferSchemaRequest interceptedRequest = PerformInferSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformInferSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformInferSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, PerformInferSchemaResponse> transformer = PerformInferSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public PerformInferSchemaWithPreviewResponse performInferSchemaWithPreview(PerformInferSchemaWithPreviewRequest request) {
        LOG.trace("Called performInferSchemaWithPreview");
            final PerformInferSchemaWithPreviewRequest interceptedRequest = PerformInferSchemaWithPreviewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformInferSchemaWithPreviewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformInferSchemaWithPreview", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, PerformInferSchemaWithPreviewResponse> transformer = PerformInferSchemaWithPreviewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public RefreshSchemaResponse refreshSchema(RefreshSchemaRequest request) {
        LOG.trace("Called refreshSchema");
            final RefreshSchemaRequest interceptedRequest = RefreshSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RefreshSchemaResponse> transformer = RefreshSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public RefreshTableResponse refreshTable(RefreshTableRequest request) {
        LOG.trace("Called refreshTable");
            final RefreshTableRequest interceptedRequest = RefreshTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RefreshTableResponse> transformer = RefreshTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public RetrieveParResponse retrievePar(RetrieveParRequest request) {
        LOG.trace("Called retrievePar");
            final RetrieveParRequest interceptedRequest = RetrieveParConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RetrieveParConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RetrievePar", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RetrieveParResponse> transformer = RetrieveParConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public UpdateSchemaResponse updateSchema(UpdateSchemaRequest request) {
        LOG.trace("Called updateSchema");
            final UpdateSchemaRequest interceptedRequest = UpdateSchemaConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateSchemaConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateSchema", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateSchemaResponse> transformer = UpdateSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public UpdateTableResponse updateTable(UpdateTableRequest request) {
        LOG.trace("Called updateTable");
            final UpdateTableRequest interceptedRequest = UpdateTableConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateTableConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateTable", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateTableResponse> transformer = UpdateTableConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public UpdateViewResponse updateView(UpdateViewRequest request) {
        LOG.trace("Called updateView");
            final UpdateViewRequest interceptedRequest = UpdateViewConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateViewConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateView", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateViewResponse> transformer = UpdateViewConverter.fromResponse(java.util.Optional.of(serviceDetails));
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

    @Override
    public SchemaWaiters getWaiters() {
        return waiters;
    }


}
