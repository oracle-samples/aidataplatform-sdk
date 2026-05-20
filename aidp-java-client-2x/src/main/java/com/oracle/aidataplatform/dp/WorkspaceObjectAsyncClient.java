// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for WorkspaceObject service. <br/>
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
public class WorkspaceObjectAsyncClient implements WorkspaceObjectAsync {
    /**
     * Service instance for WorkspaceObject.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACEOBJECT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceObjectAsyncClient.class);

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
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkspaceObjectAsyncClient(
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
    public WorkspaceObjectAsyncClient (
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
    public WorkspaceObjectAsyncClient (
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
    public WorkspaceObjectAsyncClient (
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
    public WorkspaceObjectAsyncClient (
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
         if (com.oracle.bmc.http.ApacheUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.http.ApacheUtils.getStreamWarningMessage(
                "WorkspaceObjectAsyncClient",
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceObjectAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public WorkspaceObjectAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new WorkspaceObjectAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CopyAiDataPlatformWorkspaceObjectResponse> copyAiDataPlatformWorkspaceObject(CopyAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CopyAiDataPlatformWorkspaceObjectRequest, CopyAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async copyAiDataPlatformWorkspaceObject");
        final CopyAiDataPlatformWorkspaceObjectRequest interceptedRequest = CopyAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CopyAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "CopyAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CopyAiDataPlatformWorkspaceObjectResponse> transformer = CopyAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CopyAiDataPlatformWorkspaceObjectRequest, CopyAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CopyAiDataPlatformWorkspaceObjectRequest, CopyAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<CopyAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCopyWorkspaceObjectDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CopyAiDataPlatformWorkspaceObjectRequest, CopyAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformWorkspaceObjectResponse> createAiDataPlatformWorkspaceObject(CreateAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceObjectRequest, CreateAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async createAiDataPlatformWorkspaceObject");
        if (request.getRetryConfiguration() != null || authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request = com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(request, CreateAiDataPlatformWorkspaceObjectRequest.builder());
        }
        final CreateAiDataPlatformWorkspaceObjectRequest interceptedRequest = CreateAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "CreateAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformWorkspaceObjectResponse> transformer = CreateAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceObjectRequest, CreateAiDataPlatformWorkspaceObjectResponse> handlerToUse = new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceObjectRequest, CreateAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<CreateAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateWorkspaceObjectDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformWorkspaceObjectRequest, CreateAiDataPlatformWorkspaceObjectResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        LOG.debug("Resetting stream");
                        com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                        interceptedRequest.getCreateWorkspaceObjectDetails(), true);
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<DeleteAiDataPlatformWorkspaceObjectResponse> deleteAiDataPlatformWorkspaceObject(DeleteAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceObjectRequest, DeleteAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformWorkspaceObject");
        final DeleteAiDataPlatformWorkspaceObjectRequest interceptedRequest = DeleteAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "DeleteAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformWorkspaceObjectResponse> transformer = DeleteAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceObjectRequest, DeleteAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceObjectRequest, DeleteAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<DeleteAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformWorkspaceObjectRequest, DeleteAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<DownloadAiDataPlatformWorkspaceObjectWithParResponse> downloadAiDataPlatformWorkspaceObjectWithPar(DownloadAiDataPlatformWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformWorkspaceObjectWithParRequest, DownloadAiDataPlatformWorkspaceObjectWithParResponse> handler) {
        LOG.trace("Called async downloadAiDataPlatformWorkspaceObjectWithPar");
        final DownloadAiDataPlatformWorkspaceObjectWithParRequest interceptedRequest = DownloadAiDataPlatformWorkspaceObjectWithParConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DownloadAiDataPlatformWorkspaceObjectWithParConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "DownloadAiDataPlatformWorkspaceObjectWithPar", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadAiDataPlatformWorkspaceObjectWithParResponse> transformer = DownloadAiDataPlatformWorkspaceObjectWithParConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformWorkspaceObjectWithParRequest, DownloadAiDataPlatformWorkspaceObjectWithParResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformWorkspaceObjectWithParRequest, DownloadAiDataPlatformWorkspaceObjectWithParResponse>, java.util.concurrent.Future<DownloadAiDataPlatformWorkspaceObjectWithParResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DownloadAiDataPlatformWorkspaceObjectWithParRequest, DownloadAiDataPlatformWorkspaceObjectWithParResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformWorkspaceObjectResponse> getAiDataPlatformWorkspaceObject(GetAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceObjectRequest, GetAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async getAiDataPlatformWorkspaceObject");
        final GetAiDataPlatformWorkspaceObjectRequest interceptedRequest = GetAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "GetAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformWorkspaceObjectResponse> transformer = GetAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceObjectRequest, GetAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceObjectRequest, GetAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<GetAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformWorkspaceObjectRequest, GetAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<HeadAiDataPlatformWorkspaceObjectResponse> headAiDataPlatformWorkspaceObject(HeadAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<HeadAiDataPlatformWorkspaceObjectRequest, HeadAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async headAiDataPlatformWorkspaceObject");
        final HeadAiDataPlatformWorkspaceObjectRequest interceptedRequest = HeadAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = HeadAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "HeadAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, HeadAiDataPlatformWorkspaceObjectResponse> transformer = HeadAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<HeadAiDataPlatformWorkspaceObjectRequest, HeadAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<HeadAiDataPlatformWorkspaceObjectRequest, HeadAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<HeadAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.headFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<HeadAiDataPlatformWorkspaceObjectRequest, HeadAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectPermissionsResponse> listAiDataPlatformWorkspaceObjectPermissions(ListAiDataPlatformWorkspaceObjectPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectPermissionsRequest, ListAiDataPlatformWorkspaceObjectPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformWorkspaceObjectPermissions");
        final ListAiDataPlatformWorkspaceObjectPermissionsRequest interceptedRequest = ListAiDataPlatformWorkspaceObjectPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformWorkspaceObjectPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjectPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformWorkspaceObjectPermissionsResponse> transformer = ListAiDataPlatformWorkspaceObjectPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectPermissionsRequest, ListAiDataPlatformWorkspaceObjectPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectPermissionsRequest, ListAiDataPlatformWorkspaceObjectPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformWorkspaceObjectPermissionsRequest, ListAiDataPlatformWorkspaceObjectPermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectsResponse> listAiDataPlatformWorkspaceObjects(ListAiDataPlatformWorkspaceObjectsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectsRequest, ListAiDataPlatformWorkspaceObjectsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformWorkspaceObjects");
        final ListAiDataPlatformWorkspaceObjectsRequest interceptedRequest = ListAiDataPlatformWorkspaceObjectsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformWorkspaceObjectsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjects", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformWorkspaceObjectsResponse> transformer = ListAiDataPlatformWorkspaceObjectsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectsRequest, ListAiDataPlatformWorkspaceObjectsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectsRequest, ListAiDataPlatformWorkspaceObjectsResponse>, java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformWorkspaceObjectsRequest, ListAiDataPlatformWorkspaceObjectsResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformWorkspaceObjectPermissionResponse> manageAiDataPlatformWorkspaceObjectPermission(ManageAiDataPlatformWorkspaceObjectPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspaceObjectPermissionRequest, ManageAiDataPlatformWorkspaceObjectPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformWorkspaceObjectPermission");
        final ManageAiDataPlatformWorkspaceObjectPermissionRequest interceptedRequest = ManageAiDataPlatformWorkspaceObjectPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformWorkspaceObjectPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "ManageAiDataPlatformWorkspaceObjectPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformWorkspaceObjectPermissionResponse> transformer = ManageAiDataPlatformWorkspaceObjectPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspaceObjectPermissionRequest, ManageAiDataPlatformWorkspaceObjectPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspaceObjectPermissionRequest, ManageAiDataPlatformWorkspaceObjectPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformWorkspaceObjectPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageWorkspaceObjectPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformWorkspaceObjectPermissionRequest, ManageAiDataPlatformWorkspaceObjectPermissionResponse>(
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
    public java.util.concurrent.Future<MoveAiDataPlatformWorkspaceObjectResponse> moveAiDataPlatformWorkspaceObject(MoveAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<MoveAiDataPlatformWorkspaceObjectRequest, MoveAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async moveAiDataPlatformWorkspaceObject");
        final MoveAiDataPlatformWorkspaceObjectRequest interceptedRequest = MoveAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = MoveAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "MoveAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, MoveAiDataPlatformWorkspaceObjectResponse> transformer = MoveAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<MoveAiDataPlatformWorkspaceObjectRequest, MoveAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<MoveAiDataPlatformWorkspaceObjectRequest, MoveAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<MoveAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getMoveWorkspaceObjectDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<MoveAiDataPlatformWorkspaceObjectRequest, MoveAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<RenameAiDataPlatformWorkspaceObjectResponse> renameAiDataPlatformWorkspaceObject(RenameAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformWorkspaceObjectRequest, RenameAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async renameAiDataPlatformWorkspaceObject");
        final RenameAiDataPlatformWorkspaceObjectRequest interceptedRequest = RenameAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RenameAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "RenameAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RenameAiDataPlatformWorkspaceObjectResponse> transformer = RenameAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformWorkspaceObjectRequest, RenameAiDataPlatformWorkspaceObjectResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformWorkspaceObjectRequest, RenameAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<RenameAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRenameWorkspaceObjectDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RenameAiDataPlatformWorkspaceObjectRequest, RenameAiDataPlatformWorkspaceObjectResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceObjectResponse> updateAiDataPlatformWorkspaceObject(UpdateAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceObjectRequest, UpdateAiDataPlatformWorkspaceObjectResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformWorkspaceObject");
        if (request.getRetryConfiguration() != null || authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request = com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(request, UpdateAiDataPlatformWorkspaceObjectRequest.builder());
        }
        final UpdateAiDataPlatformWorkspaceObjectRequest interceptedRequest = UpdateAiDataPlatformWorkspaceObjectConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformWorkspaceObjectConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "UpdateAiDataPlatformWorkspaceObject", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformWorkspaceObjectResponse> transformer = UpdateAiDataPlatformWorkspaceObjectConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceObjectRequest, UpdateAiDataPlatformWorkspaceObjectResponse> handlerToUse = new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceObjectRequest, UpdateAiDataPlatformWorkspaceObjectResponse>, java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceObjectResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateWorkspaceObjectDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformWorkspaceObjectRequest, UpdateAiDataPlatformWorkspaceObjectResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        LOG.debug("Resetting stream");
                        com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                        interceptedRequest.getUpdateWorkspaceObjectDetails(), true);
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadAiDataPlatformWorkspaceObjectWithParResponse> uploadAiDataPlatformWorkspaceObjectWithPar(UploadAiDataPlatformWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformWorkspaceObjectWithParRequest, UploadAiDataPlatformWorkspaceObjectWithParResponse> handler) {
        LOG.trace("Called async uploadAiDataPlatformWorkspaceObjectWithPar");
        final UploadAiDataPlatformWorkspaceObjectWithParRequest interceptedRequest = UploadAiDataPlatformWorkspaceObjectWithParConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UploadAiDataPlatformWorkspaceObjectWithParConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("WorkspaceObject", "UploadAiDataPlatformWorkspaceObjectWithPar", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UploadAiDataPlatformWorkspaceObjectWithParResponse> transformer = UploadAiDataPlatformWorkspaceObjectWithParConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformWorkspaceObjectWithParRequest, UploadAiDataPlatformWorkspaceObjectWithParResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformWorkspaceObjectWithParRequest, UploadAiDataPlatformWorkspaceObjectWithParResponse>, java.util.concurrent.Future<UploadAiDataPlatformWorkspaceObjectWithParResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUploadFileWithParDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UploadAiDataPlatformWorkspaceObjectWithParRequest, UploadAiDataPlatformWorkspaceObjectWithParResponse>(
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
