package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkspaceObjectClient implements WorkspaceObject {
    /**
     * Service instance for WorkspaceObject.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACEOBJECT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();
    // attempt twice if it's instance principals, immediately failures will try to refresh the token
    private static final int MAX_IMMEDIATE_RETRIES_IF_USING_INSTANCE_PRINCIPALS = 2;

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceObjectClient.class);

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
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }

    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
    protected WorkspaceObjectClient(
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
        if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                "WorkspaceObjectClient",
                 "createAiDataPlatformWorkspaceObject,getAiDataPlatformWorkspaceObject,updateAiDataPlatformWorkspaceObject"
                 )
             );
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceObjectClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public WorkspaceObjectClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            if (authenticationDetailsProvider == null) {
                throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
            }
            return new WorkspaceObjectClient(authenticationDetailsProvider,
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
    public CopyAiDataPlatformWorkspaceObjectResponse copyAiDataPlatformWorkspaceObject(CopyAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called copyAiDataPlatformWorkspaceObject");
            final CopyAiDataPlatformWorkspaceObjectRequest interceptedRequest = CopyAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CopyAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "CopyAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CopyAiDataPlatformWorkspaceObjectResponse> transformer = CopyAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCopyWorkspaceObjectDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public CreateAiDataPlatformWorkspaceObjectResponse createAiDataPlatformWorkspaceObject(CreateAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called createAiDataPlatformWorkspaceObject");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null || retryConfiguration != null || shouldRetryBecauseOfWaiterConfiguration(retrier) || authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request = com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(request, CreateAiDataPlatformWorkspaceObjectRequest.builder());
            }
            final CreateAiDataPlatformWorkspaceObjectRequest interceptedRequest = CreateAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "CreateAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformWorkspaceObjectResponse> transformer = CreateAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    try { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getCreateWorkspaceObjectDetails(), retriedRequest);
                                    return transformer.apply(response);
                                    } catch(RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null || retryConfiguration != null || shouldRetryBecauseOfWaiterConfiguration(retrier) || (e instanceof com.oracle.bmc.model.BmcException && tokenRefreshRetrier.getRetryCondition().shouldBeRetried((com.oracle.bmc.model.BmcException) e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(interceptedRequest.getCreateWorkspaceObjectDetails(), true);
                                        }
                                        throw e; // rethrow
                                    } 
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(request.getCreateWorkspaceObjectDetails());
        }
    }

    @Override
    public DeleteAiDataPlatformWorkspaceObjectResponse deleteAiDataPlatformWorkspaceObject(DeleteAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called deleteAiDataPlatformWorkspaceObject");
            final DeleteAiDataPlatformWorkspaceObjectRequest interceptedRequest = DeleteAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "DeleteAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformWorkspaceObjectResponse> transformer = DeleteAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public DownloadAiDataPlatformWorkspaceObjectWithParResponse downloadAiDataPlatformWorkspaceObjectWithPar(DownloadAiDataPlatformWorkspaceObjectWithParRequest request) {
        LOG.trace("Called downloadAiDataPlatformWorkspaceObjectWithPar");
            final DownloadAiDataPlatformWorkspaceObjectWithParRequest interceptedRequest = DownloadAiDataPlatformWorkspaceObjectWithParConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DownloadAiDataPlatformWorkspaceObjectWithParConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "DownloadAiDataPlatformWorkspaceObjectWithPar", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, DownloadAiDataPlatformWorkspaceObjectWithParResponse> transformer = DownloadAiDataPlatformWorkspaceObjectWithParConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public GetAiDataPlatformWorkspaceObjectResponse getAiDataPlatformWorkspaceObject(GetAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called getAiDataPlatformWorkspaceObject");
            final GetAiDataPlatformWorkspaceObjectRequest interceptedRequest = GetAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "GetAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformWorkspaceObjectResponse> transformer = GetAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public HeadAiDataPlatformWorkspaceObjectResponse headAiDataPlatformWorkspaceObject(HeadAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called headAiDataPlatformWorkspaceObject");
            final HeadAiDataPlatformWorkspaceObjectRequest interceptedRequest = HeadAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = HeadAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "HeadAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, HeadAiDataPlatformWorkspaceObjectResponse> transformer = HeadAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.head(ib, retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public ListAiDataPlatformWorkspaceObjectPermissionsResponse listAiDataPlatformWorkspaceObjectPermissions(ListAiDataPlatformWorkspaceObjectPermissionsRequest request) {
        LOG.trace("Called listAiDataPlatformWorkspaceObjectPermissions");
            final ListAiDataPlatformWorkspaceObjectPermissionsRequest interceptedRequest = ListAiDataPlatformWorkspaceObjectPermissionsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformWorkspaceObjectPermissionsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjectPermissions", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformWorkspaceObjectPermissionsResponse> transformer = ListAiDataPlatformWorkspaceObjectPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ListAiDataPlatformWorkspaceObjectsResponse listAiDataPlatformWorkspaceObjects(ListAiDataPlatformWorkspaceObjectsRequest request) {
        LOG.trace("Called listAiDataPlatformWorkspaceObjects");
            final ListAiDataPlatformWorkspaceObjectsRequest interceptedRequest = ListAiDataPlatformWorkspaceObjectsConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformWorkspaceObjectsConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjects", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformWorkspaceObjectsResponse> transformer = ListAiDataPlatformWorkspaceObjectsConverter.fromResponse(java.util.Optional.of(serviceDetails));
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
    public ManageAiDataPlatformWorkspaceObjectPermissionResponse manageAiDataPlatformWorkspaceObjectPermission(ManageAiDataPlatformWorkspaceObjectPermissionRequest request) {
        LOG.trace("Called manageAiDataPlatformWorkspaceObjectPermission");
            final ManageAiDataPlatformWorkspaceObjectPermissionRequest interceptedRequest = ManageAiDataPlatformWorkspaceObjectPermissionConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformWorkspaceObjectPermissionConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ManageAiDataPlatformWorkspaceObjectPermission", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformWorkspaceObjectPermissionResponse> transformer = ManageAiDataPlatformWorkspaceObjectPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getManageWorkspaceObjectPermissionDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public MoveAiDataPlatformWorkspaceObjectResponse moveAiDataPlatformWorkspaceObject(MoveAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called moveAiDataPlatformWorkspaceObject");
            final MoveAiDataPlatformWorkspaceObjectRequest interceptedRequest = MoveAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = MoveAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "MoveAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, MoveAiDataPlatformWorkspaceObjectResponse> transformer = MoveAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getMoveWorkspaceObjectDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public RenameAiDataPlatformWorkspaceObjectResponse renameAiDataPlatformWorkspaceObject(RenameAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called renameAiDataPlatformWorkspaceObject");
            final RenameAiDataPlatformWorkspaceObjectRequest interceptedRequest = RenameAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RenameAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "RenameAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, RenameAiDataPlatformWorkspaceObjectResponse> transformer = RenameAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getRenameWorkspaceObjectDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }

    @Override
    public UpdateAiDataPlatformWorkspaceObjectResponse updateAiDataPlatformWorkspaceObject(UpdateAiDataPlatformWorkspaceObjectRequest request) {
        LOG.trace("Called updateAiDataPlatformWorkspaceObject");
        try {
            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(request.getRetryConfiguration(), retryConfiguration, true);
            if (request.getRetryConfiguration() != null || retryConfiguration != null || shouldRetryBecauseOfWaiterConfiguration(retrier) || authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
                request = com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(request, UpdateAiDataPlatformWorkspaceObjectRequest.builder());
            }
            final UpdateAiDataPlatformWorkspaceObjectRequest interceptedRequest = UpdateAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "UpdateAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformWorkspaceObjectResponse> transformer = UpdateAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    try { 
                                    javax.ws.rs.core.Response response = client.put(ib, retriedRequest.getUpdateWorkspaceObjectDetails(), retriedRequest);
                                    return transformer.apply(response);
                                    } catch(RuntimeException e) {
                                        if (interceptedRequest.getRetryConfiguration() != null || retryConfiguration != null || shouldRetryBecauseOfWaiterConfiguration(retrier) || (e instanceof com.oracle.bmc.model.BmcException && tokenRefreshRetrier.getRetryCondition().shouldBeRetried((com.oracle.bmc.model.BmcException) e))) {
                                            com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(interceptedRequest.getUpdateWorkspaceObjectDetails(), true);
                                        }
                                        throw e; // rethrow
                                    } 
                                });
                    });
        } finally {
            com.oracle.bmc.io.internal.KeepOpenInputStream.closeStream(request.getUpdateWorkspaceObjectDetails());
        }
    }

    @Override
    public UploadAiDataPlatformWorkspaceObjectWithParResponse uploadAiDataPlatformWorkspaceObjectWithPar(UploadAiDataPlatformWorkspaceObjectWithParRequest request) {
        LOG.trace("Called uploadAiDataPlatformWorkspaceObjectWithPar");
            final UploadAiDataPlatformWorkspaceObjectWithParRequest interceptedRequest = UploadAiDataPlatformWorkspaceObjectWithParConverter.interceptRequest(request);
            com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UploadAiDataPlatformWorkspaceObjectWithParConverter.fromRequest(client, interceptedRequest);

            final com.oracle.bmc.retrier.BmcGenericRetrier retrier = com.oracle.bmc.retrier.Retriers.createPreferredRetrier(interceptedRequest.getRetryConfiguration(), retryConfiguration, true);
            com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
            com.oracle.bmc.http.internal.RetryUtils.setClientRetriesHeader(ib, retrier);
            com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "UploadAiDataPlatformWorkspaceObjectWithPar", ib.getRequestUri().toString(), "");
            java.util.function.Function<javax.ws.rs.core.Response, UploadAiDataPlatformWorkspaceObjectWithParResponse> transformer = UploadAiDataPlatformWorkspaceObjectWithParConverter.fromResponse(java.util.Optional.of(serviceDetails));
            return retrier.execute(
                    interceptedRequest,
                    retryRequest -> {
                        final com.oracle.bmc.retrier.TokenRefreshRetrier tokenRefreshRetrier =
                                new com.oracle.bmc.retrier.TokenRefreshRetrier(authenticationDetailsProvider);
                        return tokenRefreshRetrier.execute(
                                retryRequest,
                                retriedRequest -> { 
                                    javax.ws.rs.core.Response response = client.post(ib, retriedRequest.getUploadFileWithParDetails(), retriedRequest);
                                    return transformer.apply(response);
                                });
                    });
    }



   private static boolean shouldRetryBecauseOfWaiterConfiguration(com.oracle.bmc.retrier.BmcGenericRetrier retrier) {
       boolean hasTerminationStrategy = false;
       boolean isMaxAttemptsTerminationStrategy = false;
       if (retrier.getWaiter() != null && retrier.getWaiter().getWaiterConfiguration() != null) {
           hasTerminationStrategy = retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy() != null;
           if (hasTerminationStrategy) {
              isMaxAttemptsTerminationStrategy = retrier.getWaiter().getWaiterConfiguration().getTerminationStrategy()
                   instanceof com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
           }
       }
       final boolean shouldRetry =
       hasTerminationStrategy && (!isMaxAttemptsTerminationStrategy || isMaxAttemptsTerminationStrategy
               && ((com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy)
               retrier.getWaiter()
                       .getWaiterConfiguration()
                       .getTerminationStrategy())
               .getMaxAttempts()
               > 1);
       return shouldRetry;
   }
}
