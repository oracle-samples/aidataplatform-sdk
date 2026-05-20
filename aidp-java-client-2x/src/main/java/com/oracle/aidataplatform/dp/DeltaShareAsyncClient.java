// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for DeltaShare service. <br/>
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
public class DeltaShareAsyncClient implements DeltaShareAsync {
    /**
     * Service instance for DeltaShare.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("DELTASHARE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeltaShareAsyncClient.class);

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
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public DeltaShareAsyncClient(
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
    public DeltaShareAsyncClient (
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
    public DeltaShareAsyncClient (
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
    public DeltaShareAsyncClient (
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
    public DeltaShareAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DeltaShareAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public DeltaShareAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new DeltaShareAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CreateAiDataPlatformRecipientResponse> createAiDataPlatformRecipient(CreateAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse> handler) {
        LOG.trace("Called async createAiDataPlatformRecipient");
        final CreateAiDataPlatformRecipientRequest interceptedRequest = CreateAiDataPlatformRecipientConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformRecipientConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "CreateAiDataPlatformRecipient", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformRecipientResponse> transformer = CreateAiDataPlatformRecipientConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse>, java.util.concurrent.Future<CreateAiDataPlatformRecipientResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateRecipientDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformShareResponse> createAiDataPlatformShare(CreateAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse> handler) {
        LOG.trace("Called async createAiDataPlatformShare");
        final CreateAiDataPlatformShareRequest interceptedRequest = CreateAiDataPlatformShareConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformShareConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "CreateAiDataPlatformShare", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformShareResponse> transformer = CreateAiDataPlatformShareConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse>, java.util.concurrent.Future<CreateAiDataPlatformShareResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateShareDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformRecipientResponse> deleteAiDataPlatformRecipient(DeleteAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformRecipient");
        final DeleteAiDataPlatformRecipientRequest interceptedRequest = DeleteAiDataPlatformRecipientConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformRecipientConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "DeleteAiDataPlatformRecipient", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformRecipientResponse> transformer = DeleteAiDataPlatformRecipientConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse>, java.util.concurrent.Future<DeleteAiDataPlatformRecipientResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformShareResponse> deleteAiDataPlatformShare(DeleteAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformShare");
        final DeleteAiDataPlatformShareRequest interceptedRequest = DeleteAiDataPlatformShareConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformShareConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "DeleteAiDataPlatformShare", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformShareResponse> transformer = DeleteAiDataPlatformShareConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse>, java.util.concurrent.Future<DeleteAiDataPlatformShareResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformRecipientResponse> getAiDataPlatformRecipient(GetAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse> handler) {
        LOG.trace("Called async getAiDataPlatformRecipient");
        final GetAiDataPlatformRecipientRequest interceptedRequest = GetAiDataPlatformRecipientConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformRecipientConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "GetAiDataPlatformRecipient", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformRecipientResponse> transformer = GetAiDataPlatformRecipientConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse>, java.util.concurrent.Future<GetAiDataPlatformRecipientResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformShareResponse> getAiDataPlatformShare(GetAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse> handler) {
        LOG.trace("Called async getAiDataPlatformShare");
        final GetAiDataPlatformShareRequest interceptedRequest = GetAiDataPlatformShareConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformShareConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "GetAiDataPlatformShare", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformShareResponse> transformer = GetAiDataPlatformShareConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse>, java.util.concurrent.Future<GetAiDataPlatformShareResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformRecipientPermissionsResponse> listAiDataPlatformRecipientPermissions(ListAiDataPlatformRecipientPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformRecipientPermissions");
        final ListAiDataPlatformRecipientPermissionsRequest interceptedRequest = ListAiDataPlatformRecipientPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRecipientPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformRecipientPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRecipientPermissionsResponse> transformer = ListAiDataPlatformRecipientPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformRecipientPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformRecipientSharesResponse> listAiDataPlatformRecipientShares(ListAiDataPlatformRecipientSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse> handler) {
        LOG.trace("Called async listAiDataPlatformRecipientShares");
        final ListAiDataPlatformRecipientSharesRequest interceptedRequest = ListAiDataPlatformRecipientSharesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRecipientSharesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformRecipientShares", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRecipientSharesResponse> transformer = ListAiDataPlatformRecipientSharesConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse>, java.util.concurrent.Future<ListAiDataPlatformRecipientSharesResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformRecipientsResponse> listAiDataPlatformRecipients(ListAiDataPlatformRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformRecipients");
        final ListAiDataPlatformRecipientsRequest interceptedRequest = ListAiDataPlatformRecipientsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRecipientsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformRecipients", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRecipientsResponse> transformer = ListAiDataPlatformRecipientsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse>, java.util.concurrent.Future<ListAiDataPlatformRecipientsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformShareDataAssetsResponse> listAiDataPlatformShareDataAssets(ListAiDataPlatformShareDataAssetsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformShareDataAssets");
        final ListAiDataPlatformShareDataAssetsRequest interceptedRequest = ListAiDataPlatformShareDataAssetsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformShareDataAssetsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformShareDataAssets", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformShareDataAssetsResponse> transformer = ListAiDataPlatformShareDataAssetsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse>, java.util.concurrent.Future<ListAiDataPlatformShareDataAssetsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformSharePermissionsResponse> listAiDataPlatformSharePermissions(ListAiDataPlatformSharePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformSharePermissions");
        final ListAiDataPlatformSharePermissionsRequest interceptedRequest = ListAiDataPlatformSharePermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSharePermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformSharePermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSharePermissionsResponse> transformer = ListAiDataPlatformSharePermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformSharePermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformShareRecipientsResponse> listAiDataPlatformShareRecipients(ListAiDataPlatformShareRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformShareRecipients");
        final ListAiDataPlatformShareRecipientsRequest interceptedRequest = ListAiDataPlatformShareRecipientsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformShareRecipientsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformShareRecipients", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformShareRecipientsResponse> transformer = ListAiDataPlatformShareRecipientsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse>, java.util.concurrent.Future<ListAiDataPlatformShareRecipientsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformSharesResponse> listAiDataPlatformShares(ListAiDataPlatformSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse> handler) {
        LOG.trace("Called async listAiDataPlatformShares");
        final ListAiDataPlatformSharesRequest interceptedRequest = ListAiDataPlatformSharesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformSharesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ListAiDataPlatformShares", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformSharesResponse> transformer = ListAiDataPlatformSharesConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse>, java.util.concurrent.Future<ListAiDataPlatformSharesResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformRecipientPermissionResponse> manageAiDataPlatformRecipientPermission(ManageAiDataPlatformRecipientPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformRecipientPermission");
        final ManageAiDataPlatformRecipientPermissionRequest interceptedRequest = ManageAiDataPlatformRecipientPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformRecipientPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ManageAiDataPlatformRecipientPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformRecipientPermissionResponse> transformer = ManageAiDataPlatformRecipientPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformRecipientPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageRecipientPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformShareAccessResponse> manageAiDataPlatformShareAccess(ManageAiDataPlatformShareAccessRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformShareAccess");
        final ManageAiDataPlatformShareAccessRequest interceptedRequest = ManageAiDataPlatformShareAccessConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformShareAccessConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ManageAiDataPlatformShareAccess", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformShareAccessResponse> transformer = ManageAiDataPlatformShareAccessConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse>, java.util.concurrent.Future<ManageAiDataPlatformShareAccessResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageShareAccessDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformShareDataAssetResponse> manageAiDataPlatformShareDataAsset(ManageAiDataPlatformShareDataAssetRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformShareDataAsset");
        final ManageAiDataPlatformShareDataAssetRequest interceptedRequest = ManageAiDataPlatformShareDataAssetConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformShareDataAssetConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ManageAiDataPlatformShareDataAsset", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformShareDataAssetResponse> transformer = ManageAiDataPlatformShareDataAssetConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse>, java.util.concurrent.Future<ManageAiDataPlatformShareDataAssetResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageShareDataAssetDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformSharePermissionResponse> manageAiDataPlatformSharePermission(ManageAiDataPlatformSharePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformSharePermission");
        final ManageAiDataPlatformSharePermissionRequest interceptedRequest = ManageAiDataPlatformSharePermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformSharePermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "ManageAiDataPlatformSharePermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformSharePermissionResponse> transformer = ManageAiDataPlatformSharePermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformSharePermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageSharePermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformRecipientResponse> updateAiDataPlatformRecipient(UpdateAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformRecipient");
        final UpdateAiDataPlatformRecipientRequest interceptedRequest = UpdateAiDataPlatformRecipientConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformRecipientConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "UpdateAiDataPlatformRecipient", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformRecipientResponse> transformer = UpdateAiDataPlatformRecipientConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse>, java.util.concurrent.Future<UpdateAiDataPlatformRecipientResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateRecipientDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformShareResponse> updateAiDataPlatformShare(UpdateAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformShare");
        final UpdateAiDataPlatformShareRequest interceptedRequest = UpdateAiDataPlatformShareConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformShareConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("DeltaShare", "UpdateAiDataPlatformShare", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformShareResponse> transformer = UpdateAiDataPlatformShareConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse>, java.util.concurrent.Future<UpdateAiDataPlatformShareResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateShareDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse>(
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
