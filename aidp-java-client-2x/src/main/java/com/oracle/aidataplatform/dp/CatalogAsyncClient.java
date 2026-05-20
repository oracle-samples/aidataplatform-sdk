// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CatalogAsyncClient implements CatalogAsync {
    /**
     * Service instance for Catalog.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("CATALOG").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CatalogAsyncClient.class);

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
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public CatalogAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public CatalogAsyncClient(
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
    public CatalogAsyncClient (
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
    public CatalogAsyncClient (
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
    public CatalogAsyncClient (
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
    public CatalogAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, CatalogAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public CatalogAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new CatalogAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CatalogAiDataPlatformTestConnectionResponse> catalogAiDataPlatformTestConnection(CatalogAiDataPlatformTestConnectionRequest request, final com.oracle.bmc.responses.AsyncHandler<CatalogAiDataPlatformTestConnectionRequest, CatalogAiDataPlatformTestConnectionResponse> handler) {
        LOG.trace("Called async catalogAiDataPlatformTestConnection");
        final CatalogAiDataPlatformTestConnectionRequest interceptedRequest = CatalogAiDataPlatformTestConnectionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CatalogAiDataPlatformTestConnectionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "CatalogAiDataPlatformTestConnection", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CatalogAiDataPlatformTestConnectionResponse> transformer = CatalogAiDataPlatformTestConnectionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CatalogAiDataPlatformTestConnectionRequest, CatalogAiDataPlatformTestConnectionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CatalogAiDataPlatformTestConnectionRequest, CatalogAiDataPlatformTestConnectionResponse>, java.util.concurrent.Future<CatalogAiDataPlatformTestConnectionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCatalogTestConnectionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CatalogAiDataPlatformTestConnectionRequest, CatalogAiDataPlatformTestConnectionResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformCatalogResponse> createAiDataPlatformCatalog(CreateAiDataPlatformCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformCatalogRequest, CreateAiDataPlatformCatalogResponse> handler) {
        LOG.trace("Called async createAiDataPlatformCatalog");
        final CreateAiDataPlatformCatalogRequest interceptedRequest = CreateAiDataPlatformCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformCatalogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "CreateAiDataPlatformCatalog", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformCatalogResponse> transformer = CreateAiDataPlatformCatalogConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformCatalogRequest, CreateAiDataPlatformCatalogResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformCatalogRequest, CreateAiDataPlatformCatalogResponse>, java.util.concurrent.Future<CreateAiDataPlatformCatalogResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateCatalogDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformCatalogRequest, CreateAiDataPlatformCatalogResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformCatalogResponse> deleteAiDataPlatformCatalog(DeleteAiDataPlatformCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformCatalogRequest, DeleteAiDataPlatformCatalogResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformCatalog");
        final DeleteAiDataPlatformCatalogRequest interceptedRequest = DeleteAiDataPlatformCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformCatalogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "DeleteAiDataPlatformCatalog", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformCatalogResponse> transformer = DeleteAiDataPlatformCatalogConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformCatalogRequest, DeleteAiDataPlatformCatalogResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformCatalogRequest, DeleteAiDataPlatformCatalogResponse>, java.util.concurrent.Future<DeleteAiDataPlatformCatalogResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformCatalogRequest, DeleteAiDataPlatformCatalogResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformCatalogResponse> getAiDataPlatformCatalog(GetAiDataPlatformCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformCatalogRequest, GetAiDataPlatformCatalogResponse> handler) {
        LOG.trace("Called async getAiDataPlatformCatalog");
        final GetAiDataPlatformCatalogRequest interceptedRequest = GetAiDataPlatformCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformCatalogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "GetAiDataPlatformCatalog", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformCatalogResponse> transformer = GetAiDataPlatformCatalogConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformCatalogRequest, GetAiDataPlatformCatalogResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformCatalogRequest, GetAiDataPlatformCatalogResponse>, java.util.concurrent.Future<GetAiDataPlatformCatalogResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformCatalogRequest, GetAiDataPlatformCatalogResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformCatalogPermissionsResponse> listAiDataPlatformCatalogPermissions(ListAiDataPlatformCatalogPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogPermissionsRequest, ListAiDataPlatformCatalogPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformCatalogPermissions");
        final ListAiDataPlatformCatalogPermissionsRequest interceptedRequest = ListAiDataPlatformCatalogPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformCatalogPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "ListAiDataPlatformCatalogPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformCatalogPermissionsResponse> transformer = ListAiDataPlatformCatalogPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogPermissionsRequest, ListAiDataPlatformCatalogPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogPermissionsRequest, ListAiDataPlatformCatalogPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformCatalogPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformCatalogPermissionsRequest, ListAiDataPlatformCatalogPermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformCatalogsResponse> listAiDataPlatformCatalogs(ListAiDataPlatformCatalogsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogsRequest, ListAiDataPlatformCatalogsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformCatalogs");
        final ListAiDataPlatformCatalogsRequest interceptedRequest = ListAiDataPlatformCatalogsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformCatalogsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "ListAiDataPlatformCatalogs", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformCatalogsResponse> transformer = ListAiDataPlatformCatalogsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogsRequest, ListAiDataPlatformCatalogsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformCatalogsRequest, ListAiDataPlatformCatalogsResponse>, java.util.concurrent.Future<ListAiDataPlatformCatalogsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformCatalogsRequest, ListAiDataPlatformCatalogsResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformCatalogPermissionResponse> manageAiDataPlatformCatalogPermission(ManageAiDataPlatformCatalogPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCatalogPermissionRequest, ManageAiDataPlatformCatalogPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformCatalogPermission");
        final ManageAiDataPlatformCatalogPermissionRequest interceptedRequest = ManageAiDataPlatformCatalogPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformCatalogPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "ManageAiDataPlatformCatalogPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformCatalogPermissionResponse> transformer = ManageAiDataPlatformCatalogPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCatalogPermissionRequest, ManageAiDataPlatformCatalogPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformCatalogPermissionRequest, ManageAiDataPlatformCatalogPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformCatalogPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageCatalogPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformCatalogPermissionRequest, ManageAiDataPlatformCatalogPermissionResponse>(
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
    public java.util.concurrent.Future<RefreshAiDataPlatformCatalogResponse> refreshAiDataPlatformCatalog(RefreshAiDataPlatformCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformCatalogRequest, RefreshAiDataPlatformCatalogResponse> handler) {
        LOG.trace("Called async refreshAiDataPlatformCatalog");
        final RefreshAiDataPlatformCatalogRequest interceptedRequest = RefreshAiDataPlatformCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RefreshAiDataPlatformCatalogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "RefreshAiDataPlatformCatalog", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RefreshAiDataPlatformCatalogResponse> transformer = RefreshAiDataPlatformCatalogConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformCatalogRequest, RefreshAiDataPlatformCatalogResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RefreshAiDataPlatformCatalogRequest, RefreshAiDataPlatformCatalogResponse>, java.util.concurrent.Future<RefreshAiDataPlatformCatalogResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RefreshAiDataPlatformCatalogRequest, RefreshAiDataPlatformCatalogResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformCatalogResponse> updateAiDataPlatformCatalog(UpdateAiDataPlatformCatalogRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformCatalogRequest, UpdateAiDataPlatformCatalogResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformCatalog");
        final UpdateAiDataPlatformCatalogRequest interceptedRequest = UpdateAiDataPlatformCatalogConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformCatalogConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Catalog", "UpdateAiDataPlatformCatalog", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformCatalogResponse> transformer = UpdateAiDataPlatformCatalogConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformCatalogRequest, UpdateAiDataPlatformCatalogResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformCatalogRequest, UpdateAiDataPlatformCatalogResponse>, java.util.concurrent.Future<UpdateAiDataPlatformCatalogResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateCatalogDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformCatalogRequest, UpdateAiDataPlatformCatalogResponse>(
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
