package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for Schema service. <br/>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SchemaAsyncClient implements SchemaAsync {
    /**
     * Service instance for Schema.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("SCHEMA").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaAsyncClient.class);

    private final com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider;

    private final org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy apacheConnectionClosingStrategy;
    private final com.oracle.bmc.http.internal.RestClientFactory restClientFactory;
    private final com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory;
    private final java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories;
    private final boolean isNonBufferingApacheClient;
    private final com.oracle.bmc.ClientConfiguration clientConfigurationToUse;
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
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public SchemaAsyncClient(
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
    public SchemaAsyncClient (
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
    public SchemaAsyncClient (
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
    public SchemaAsyncClient (
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
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     * @param defaultRequestSignerFactory The request signer factory used to create the request signer for this service.
     * @param signingStrategyRequestSignerFactories The request signer factories for each signing strategy used to create the request signer
     * @param additionalClientConfigurators Additional client configurators to be run after the primary configurator.
     * @param endpoint Endpoint, or null to leave unset (note, may be overridden by {@code authenticationDetailsProvider})
     * @param restClientFactoryBuilder the builder for the {@link com.oracle.bmc.http.internal.RestClientFactory}
     */
    public SchemaAsyncClient (
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
        this.isNonBufferingApacheClient = com.oracle.bmc.http.ApacheUtils.isNonBufferingClientConfigurator(restClientFactory.getClientConfigurator());
        this.apacheConnectionClosingStrategy =
                com.oracle.bmc.http.ApacheUtils.getApacheConnectionClosingStrategy(
                        restClientFactory.getClientConfigurator());
        this.defaultRequestSignerFactory = defaultRequestSignerFactory;
        this.signingStrategyRequestSignerFactories = signingStrategyRequestSignerFactories;
        this.clientConfigurationToUse = configuration;

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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SchemaAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public SchemaAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new SchemaAsyncClient(authenticationDetailsProvider,
                configuration,
                clientConfigurator,
                requestSignerFactory,
                signingStrategyRequestSignerFactories,
                additionalClientConfigurators,
                endpoint);
        }
    }

    com.oracle.bmc.http.internal.RestClient getClient() {
        return client;
    }

    @Override
    public void refreshClient() {
        LOG.info("Refreshing client '{}'.", this.client != null ? this.client.getClass() : null);
        com.oracle.bmc.http.signing.RequestSigner defaultRequestSigner = this.defaultRequestSignerFactory.createRequestSigner(SERVICE, this.authenticationDetailsProvider);

        java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSigner> requestSigners = new java.util.HashMap<>();
        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.BasicAuthenticationDetailsProvider) {
            for(com.oracle.bmc.http.signing.SigningStrategy s: com.oracle.bmc.http.signing.SigningStrategy.values()) {
                requestSigners.put(s, this.signingStrategyRequestSignerFactories.get(s).createRequestSigner(SERVICE, authenticationDetailsProvider));
            }
        }

        com.oracle.bmc.http.internal.RestClient refreshedClient = this.restClientFactory.create(defaultRequestSigner, requestSigners, this.clientConfigurationToUse, this.isNonBufferingApacheClient);

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
    public void close()
    {
        client.close();
    }

    @Override
    public java.util.concurrent.Future<CreateAiDataPlatformDataTableResponse> createAiDataPlatformDataTable(CreateAiDataPlatformDataTableRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformDataTableRequest, CreateAiDataPlatformDataTableResponse> handler) {
        LOG.trace("Called async createAiDataPlatformDataTable");
        final CreateAiDataPlatformDataTableRequest interceptedRequest = CreateAiDataPlatformDataTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformDataTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformDataTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformDataTableResponse> transformer = CreateAiDataPlatformDataTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformDataTableRequest, CreateAiDataPlatformDataTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformDataTableRequest, CreateAiDataPlatformDataTableResponse>, java.util.concurrent.Future<CreateAiDataPlatformDataTableResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateDataTableDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformDataTableRequest, CreateAiDataPlatformDataTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAiDataPlatformSchemaResponse> createAiDataPlatformSchema(CreateAiDataPlatformSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformSchemaRequest, CreateAiDataPlatformSchemaResponse> handler) {
        LOG.trace("Called async createAiDataPlatformSchema");
        final CreateAiDataPlatformSchemaRequest interceptedRequest = CreateAiDataPlatformSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformSchemaResponse> transformer = CreateAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformSchemaRequest, CreateAiDataPlatformSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformSchemaRequest, CreateAiDataPlatformSchemaResponse>, java.util.concurrent.Future<CreateAiDataPlatformSchemaResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateSchemaDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformSchemaRequest, CreateAiDataPlatformSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAiDataPlatformTableResponse> createAiDataPlatformTable(CreateAiDataPlatformTableRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformTableRequest, CreateAiDataPlatformTableResponse> handler) {
        LOG.trace("Called async createAiDataPlatformTable");
        final CreateAiDataPlatformTableRequest interceptedRequest = CreateAiDataPlatformTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformTableResponse> transformer = CreateAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformTableRequest, CreateAiDataPlatformTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformTableRequest, CreateAiDataPlatformTableResponse>, java.util.concurrent.Future<CreateAiDataPlatformTableResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateTableDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformTableRequest, CreateAiDataPlatformTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<CreateAiDataPlatformViewResponse> createAiDataPlatformView(CreateAiDataPlatformViewRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformViewRequest, CreateAiDataPlatformViewResponse> handler) {
        LOG.trace("Called async createAiDataPlatformView");
        final CreateAiDataPlatformViewRequest interceptedRequest = CreateAiDataPlatformViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "CreateAiDataPlatformView", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformViewResponse> transformer = CreateAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformViewRequest, CreateAiDataPlatformViewResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformViewRequest, CreateAiDataPlatformViewResponse>, java.util.concurrent.Future<CreateAiDataPlatformViewResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateViewDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformViewRequest, CreateAiDataPlatformViewResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAiDataPlatformSchemaResponse> deleteAiDataPlatformSchema(DeleteAiDataPlatformSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformSchemaRequest, DeleteAiDataPlatformSchemaResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformSchema");
        final DeleteAiDataPlatformSchemaRequest interceptedRequest = DeleteAiDataPlatformSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformSchemaResponse> transformer = DeleteAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformSchemaRequest, DeleteAiDataPlatformSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformSchemaRequest, DeleteAiDataPlatformSchemaResponse>, java.util.concurrent.Future<DeleteAiDataPlatformSchemaResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformSchemaRequest, DeleteAiDataPlatformSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAiDataPlatformTableResponse> deleteAiDataPlatformTable(DeleteAiDataPlatformTableRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformTableRequest, DeleteAiDataPlatformTableResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformTable");
        final DeleteAiDataPlatformTableRequest interceptedRequest = DeleteAiDataPlatformTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformTableResponse> transformer = DeleteAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformTableRequest, DeleteAiDataPlatformTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformTableRequest, DeleteAiDataPlatformTableResponse>, java.util.concurrent.Future<DeleteAiDataPlatformTableResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformTableRequest, DeleteAiDataPlatformTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAiDataPlatformViewResponse> deleteAiDataPlatformView(DeleteAiDataPlatformViewRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformViewRequest, DeleteAiDataPlatformViewResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformView");
        final DeleteAiDataPlatformViewRequest interceptedRequest = DeleteAiDataPlatformViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "DeleteAiDataPlatformView", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformViewResponse> transformer = DeleteAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformViewRequest, DeleteAiDataPlatformViewResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformViewRequest, DeleteAiDataPlatformViewResponse>, java.util.concurrent.Future<DeleteAiDataPlatformViewResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformViewRequest, DeleteAiDataPlatformViewResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GenerateAiDataPlatformTempFileUploadTargetResponse> generateAiDataPlatformTempFileUploadTarget(GenerateAiDataPlatformTempFileUploadTargetRequest request, final com.oracle.bmc.responses.AsyncHandler<GenerateAiDataPlatformTempFileUploadTargetRequest, GenerateAiDataPlatformTempFileUploadTargetResponse> handler) {
        LOG.trace("Called async generateAiDataPlatformTempFileUploadTarget");
        final GenerateAiDataPlatformTempFileUploadTargetRequest interceptedRequest = GenerateAiDataPlatformTempFileUploadTargetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GenerateAiDataPlatformTempFileUploadTargetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GenerateAiDataPlatformTempFileUploadTarget", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GenerateAiDataPlatformTempFileUploadTargetResponse> transformer = GenerateAiDataPlatformTempFileUploadTargetConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GenerateAiDataPlatformTempFileUploadTargetRequest, GenerateAiDataPlatformTempFileUploadTargetResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GenerateAiDataPlatformTempFileUploadTargetRequest, GenerateAiDataPlatformTempFileUploadTargetResponse>, java.util.concurrent.Future<GenerateAiDataPlatformTempFileUploadTargetResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GenerateAiDataPlatformTempFileUploadTargetRequest, GenerateAiDataPlatformTempFileUploadTargetResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAiDataPlatformSchemaResponse> getAiDataPlatformSchema(GetAiDataPlatformSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformSchemaRequest, GetAiDataPlatformSchemaResponse> handler) {
        LOG.trace("Called async getAiDataPlatformSchema");
        final GetAiDataPlatformSchemaRequest interceptedRequest = GetAiDataPlatformSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformSchemaResponse> transformer = GetAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformSchemaRequest, GetAiDataPlatformSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformSchemaRequest, GetAiDataPlatformSchemaResponse>, java.util.concurrent.Future<GetAiDataPlatformSchemaResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformSchemaRequest, GetAiDataPlatformSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAiDataPlatformTableResponse> getAiDataPlatformTable(GetAiDataPlatformTableRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTableRequest, GetAiDataPlatformTableResponse> handler) {
        LOG.trace("Called async getAiDataPlatformTable");
        final GetAiDataPlatformTableRequest interceptedRequest = GetAiDataPlatformTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformTableResponse> transformer = GetAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTableRequest, GetAiDataPlatformTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTableRequest, GetAiDataPlatformTableResponse>, java.util.concurrent.Future<GetAiDataPlatformTableResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformTableRequest, GetAiDataPlatformTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<GetAiDataPlatformViewResponse> getAiDataPlatformView(GetAiDataPlatformViewRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformViewRequest, GetAiDataPlatformViewResponse> handler) {
        LOG.trace("Called async getAiDataPlatformView");
        final GetAiDataPlatformViewRequest interceptedRequest = GetAiDataPlatformViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "GetAiDataPlatformView", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformViewResponse> transformer = GetAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformViewRequest, GetAiDataPlatformViewResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformViewRequest, GetAiDataPlatformViewResponse>, java.util.concurrent.Future<GetAiDataPlatformViewResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformViewRequest, GetAiDataPlatformViewResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformSchemaPermissionsResponse> listAiDataPlatformSchemaPermissions(ListAiDataPlatformSchemaPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemaPermissionsRequest, ListAiDataPlatformSchemaPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformSchemaPermissions");
        final ListAiDataPlatformSchemaPermissionsRequest interceptedRequest = ListAiDataPlatformSchemaPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSchemaPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformSchemaPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSchemaPermissionsResponse> transformer = ListAiDataPlatformSchemaPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemaPermissionsRequest, ListAiDataPlatformSchemaPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemaPermissionsRequest, ListAiDataPlatformSchemaPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformSchemaPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformSchemaPermissionsRequest, ListAiDataPlatformSchemaPermissionsResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformSchemasResponse> listAiDataPlatformSchemas(ListAiDataPlatformSchemasRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemasRequest, ListAiDataPlatformSchemasResponse> handler) {
        LOG.trace("Called async listAiDataPlatformSchemas");
        final ListAiDataPlatformSchemasRequest interceptedRequest = ListAiDataPlatformSchemasConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSchemasConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformSchemas", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSchemasResponse> transformer = ListAiDataPlatformSchemasConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemasRequest, ListAiDataPlatformSchemasResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSchemasRequest, ListAiDataPlatformSchemasResponse>, java.util.concurrent.Future<ListAiDataPlatformSchemasResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformSchemasRequest, ListAiDataPlatformSchemasResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformTablePermissionsResponse> listAiDataPlatformTablePermissions(ListAiDataPlatformTablePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablePermissionsRequest, ListAiDataPlatformTablePermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformTablePermissions");
        final ListAiDataPlatformTablePermissionsRequest interceptedRequest = ListAiDataPlatformTablePermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformTablePermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformTablePermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformTablePermissionsResponse> transformer = ListAiDataPlatformTablePermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablePermissionsRequest, ListAiDataPlatformTablePermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablePermissionsRequest, ListAiDataPlatformTablePermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformTablePermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformTablePermissionsRequest, ListAiDataPlatformTablePermissionsResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformTablesResponse> listAiDataPlatformTables(ListAiDataPlatformTablesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablesRequest, ListAiDataPlatformTablesResponse> handler) {
        LOG.trace("Called async listAiDataPlatformTables");
        final ListAiDataPlatformTablesRequest interceptedRequest = ListAiDataPlatformTablesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformTablesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformTables", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformTablesResponse> transformer = ListAiDataPlatformTablesConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablesRequest, ListAiDataPlatformTablesResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTablesRequest, ListAiDataPlatformTablesResponse>, java.util.concurrent.Future<ListAiDataPlatformTablesResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformTablesRequest, ListAiDataPlatformTablesResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformViewPermissionsResponse> listAiDataPlatformViewPermissions(ListAiDataPlatformViewPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewPermissionsRequest, ListAiDataPlatformViewPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformViewPermissions");
        final ListAiDataPlatformViewPermissionsRequest interceptedRequest = ListAiDataPlatformViewPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformViewPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformViewPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformViewPermissionsResponse> transformer = ListAiDataPlatformViewPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewPermissionsRequest, ListAiDataPlatformViewPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewPermissionsRequest, ListAiDataPlatformViewPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformViewPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformViewPermissionsRequest, ListAiDataPlatformViewPermissionsResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ListAiDataPlatformViewsResponse> listAiDataPlatformViews(ListAiDataPlatformViewsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewsRequest, ListAiDataPlatformViewsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformViews");
        final ListAiDataPlatformViewsRequest interceptedRequest = ListAiDataPlatformViewsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformViewsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ListAiDataPlatformViews", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformViewsResponse> transformer = ListAiDataPlatformViewsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewsRequest, ListAiDataPlatformViewsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformViewsRequest, ListAiDataPlatformViewsResponse>, java.util.concurrent.Future<ListAiDataPlatformViewsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformViewsRequest, ListAiDataPlatformViewsResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ManageAiDataPlatformSchemaPermissionResponse> manageAiDataPlatformSchemaPermission(ManageAiDataPlatformSchemaPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSchemaPermissionRequest, ManageAiDataPlatformSchemaPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformSchemaPermission");
        final ManageAiDataPlatformSchemaPermissionRequest interceptedRequest = ManageAiDataPlatformSchemaPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformSchemaPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformSchemaPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformSchemaPermissionResponse> transformer = ManageAiDataPlatformSchemaPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSchemaPermissionRequest, ManageAiDataPlatformSchemaPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSchemaPermissionRequest, ManageAiDataPlatformSchemaPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformSchemaPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageSchemaPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformSchemaPermissionRequest, ManageAiDataPlatformSchemaPermissionResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ManageAiDataPlatformTablePermissionResponse> manageAiDataPlatformTablePermission(ManageAiDataPlatformTablePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformTablePermissionRequest, ManageAiDataPlatformTablePermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformTablePermission");
        final ManageAiDataPlatformTablePermissionRequest interceptedRequest = ManageAiDataPlatformTablePermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformTablePermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformTablePermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformTablePermissionResponse> transformer = ManageAiDataPlatformTablePermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformTablePermissionRequest, ManageAiDataPlatformTablePermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformTablePermissionRequest, ManageAiDataPlatformTablePermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformTablePermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageTablePermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformTablePermissionRequest, ManageAiDataPlatformTablePermissionResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<ManageAiDataPlatformViewPermissionResponse> manageAiDataPlatformViewPermission(ManageAiDataPlatformViewPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformViewPermissionRequest, ManageAiDataPlatformViewPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformViewPermission");
        final ManageAiDataPlatformViewPermissionRequest interceptedRequest = ManageAiDataPlatformViewPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformViewPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "ManageAiDataPlatformViewPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformViewPermissionResponse> transformer = ManageAiDataPlatformViewPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformViewPermissionRequest, ManageAiDataPlatformViewPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformViewPermissionRequest, ManageAiDataPlatformViewPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformViewPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageViewPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformViewPermissionRequest, ManageAiDataPlatformViewPermissionResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PerformAiDataPlatformInferSchemaResponse> performAiDataPlatformInferSchema(PerformAiDataPlatformInferSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaRequest, PerformAiDataPlatformInferSchemaResponse> handler) {
        LOG.trace("Called async performAiDataPlatformInferSchema");
        final PerformAiDataPlatformInferSchemaRequest interceptedRequest = PerformAiDataPlatformInferSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformAiDataPlatformInferSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformAiDataPlatformInferSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PerformAiDataPlatformInferSchemaResponse> transformer = PerformAiDataPlatformInferSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaRequest, PerformAiDataPlatformInferSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaRequest, PerformAiDataPlatformInferSchemaResponse>, java.util.concurrent.Future<PerformAiDataPlatformInferSchemaResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getPerformInferSchemaDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<PerformAiDataPlatformInferSchemaRequest, PerformAiDataPlatformInferSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<PerformAiDataPlatformInferSchemaWithPreviewResponse> performAiDataPlatformInferSchemaWithPreview(PerformAiDataPlatformInferSchemaWithPreviewRequest request, final com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaWithPreviewRequest, PerformAiDataPlatformInferSchemaWithPreviewResponse> handler) {
        LOG.trace("Called async performAiDataPlatformInferSchemaWithPreview");
        final PerformAiDataPlatformInferSchemaWithPreviewRequest interceptedRequest = PerformAiDataPlatformInferSchemaWithPreviewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = PerformAiDataPlatformInferSchemaWithPreviewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "PerformAiDataPlatformInferSchemaWithPreview", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, PerformAiDataPlatformInferSchemaWithPreviewResponse> transformer = PerformAiDataPlatformInferSchemaWithPreviewConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaWithPreviewRequest, PerformAiDataPlatformInferSchemaWithPreviewResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<PerformAiDataPlatformInferSchemaWithPreviewRequest, PerformAiDataPlatformInferSchemaWithPreviewResponse>, java.util.concurrent.Future<PerformAiDataPlatformInferSchemaWithPreviewResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getPerformInferSchemaDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<PerformAiDataPlatformInferSchemaWithPreviewRequest, PerformAiDataPlatformInferSchemaWithPreviewResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshAiDataPlatformSchemaResponse> refreshAiDataPlatformSchema(RefreshAiDataPlatformSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformSchemaRequest, RefreshAiDataPlatformSchemaResponse> handler) {
        LOG.trace("Called async refreshAiDataPlatformSchema");
        final RefreshAiDataPlatformSchemaRequest interceptedRequest = RefreshAiDataPlatformSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshAiDataPlatformSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RefreshAiDataPlatformSchemaResponse> transformer = RefreshAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformSchemaRequest, RefreshAiDataPlatformSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformSchemaRequest, RefreshAiDataPlatformSchemaResponse>, java.util.concurrent.Future<RefreshAiDataPlatformSchemaResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RefreshAiDataPlatformSchemaRequest, RefreshAiDataPlatformSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RefreshAiDataPlatformTableResponse> refreshAiDataPlatformTable(RefreshAiDataPlatformTableRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformTableRequest, RefreshAiDataPlatformTableResponse> handler) {
        LOG.trace("Called async refreshAiDataPlatformTable");
        final RefreshAiDataPlatformTableRequest interceptedRequest = RefreshAiDataPlatformTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RefreshAiDataPlatformTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RefreshAiDataPlatformTableResponse> transformer = RefreshAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformTableRequest, RefreshAiDataPlatformTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformTableRequest, RefreshAiDataPlatformTableResponse>, java.util.concurrent.Future<RefreshAiDataPlatformTableResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RefreshAiDataPlatformTableRequest, RefreshAiDataPlatformTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<RetrieveAiDataPlatformParResponse> retrieveAiDataPlatformPar(RetrieveAiDataPlatformParRequest request, final com.oracle.bmc.responses.AsyncHandler<RetrieveAiDataPlatformParRequest, RetrieveAiDataPlatformParResponse> handler) {
        LOG.trace("Called async retrieveAiDataPlatformPar");
        final RetrieveAiDataPlatformParRequest interceptedRequest = RetrieveAiDataPlatformParConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RetrieveAiDataPlatformParConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "RetrieveAiDataPlatformPar", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RetrieveAiDataPlatformParResponse> transformer = RetrieveAiDataPlatformParConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RetrieveAiDataPlatformParRequest, RetrieveAiDataPlatformParResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RetrieveAiDataPlatformParRequest, RetrieveAiDataPlatformParResponse>, java.util.concurrent.Future<RetrieveAiDataPlatformParResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RetrieveAiDataPlatformParRequest, RetrieveAiDataPlatformParResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAiDataPlatformSchemaResponse> updateAiDataPlatformSchema(UpdateAiDataPlatformSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformSchemaRequest, UpdateAiDataPlatformSchemaResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformSchema");
        final UpdateAiDataPlatformSchemaRequest interceptedRequest = UpdateAiDataPlatformSchemaConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformSchemaConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformSchema", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformSchemaResponse> transformer = UpdateAiDataPlatformSchemaConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformSchemaRequest, UpdateAiDataPlatformSchemaResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformSchemaRequest, UpdateAiDataPlatformSchemaResponse>, java.util.concurrent.Future<UpdateAiDataPlatformSchemaResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateSchemaDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformSchemaRequest, UpdateAiDataPlatformSchemaResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAiDataPlatformTableResponse> updateAiDataPlatformTable(UpdateAiDataPlatformTableRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformTableRequest, UpdateAiDataPlatformTableResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformTable");
        final UpdateAiDataPlatformTableRequest interceptedRequest = UpdateAiDataPlatformTableConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformTableConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformTable", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformTableResponse> transformer = UpdateAiDataPlatformTableConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformTableRequest, UpdateAiDataPlatformTableResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformTableRequest, UpdateAiDataPlatformTableResponse>, java.util.concurrent.Future<UpdateAiDataPlatformTableResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateTableDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformTableRequest, UpdateAiDataPlatformTableResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UpdateAiDataPlatformViewResponse> updateAiDataPlatformView(UpdateAiDataPlatformViewRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformViewRequest, UpdateAiDataPlatformViewResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformView");
        final UpdateAiDataPlatformViewRequest interceptedRequest = UpdateAiDataPlatformViewConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformViewConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Schema", "UpdateAiDataPlatformView", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformViewResponse> transformer = UpdateAiDataPlatformViewConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformViewRequest, UpdateAiDataPlatformViewResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformViewRequest, UpdateAiDataPlatformViewResponse>, java.util.concurrent.Future<UpdateAiDataPlatformViewResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateViewDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformViewRequest, UpdateAiDataPlatformViewResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

}
