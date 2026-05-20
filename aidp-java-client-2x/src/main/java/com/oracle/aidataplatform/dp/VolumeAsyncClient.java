// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for Volume service. <br/>
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
public class VolumeAsyncClient implements VolumeAsync {
    /**
     * Service instance for Volume.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("VOLUME").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(VolumeAsyncClient.class);

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
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public VolumeAsyncClient(
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
    public VolumeAsyncClient (
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
    public VolumeAsyncClient (
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
    public VolumeAsyncClient (
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
    public VolumeAsyncClient (
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
                "VolumeAsyncClient",
                 "downloadAiDataPlatformFile"
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VolumeAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public VolumeAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new VolumeAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CreateAiDataPlatformVolumeResponse> createAiDataPlatformVolume(CreateAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformVolumeRequest, CreateAiDataPlatformVolumeResponse> handler) {
        LOG.trace("Called async createAiDataPlatformVolume");
        final CreateAiDataPlatformVolumeRequest interceptedRequest = CreateAiDataPlatformVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "CreateAiDataPlatformVolume", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformVolumeResponse> transformer = CreateAiDataPlatformVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformVolumeRequest, CreateAiDataPlatformVolumeResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformVolumeRequest, CreateAiDataPlatformVolumeResponse>, java.util.concurrent.Future<CreateAiDataPlatformVolumeResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateVolumeDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformVolumeRequest, CreateAiDataPlatformVolumeResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformDirResponse> deleteAiDataPlatformDir(DeleteAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformDirRequest, DeleteAiDataPlatformDirResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformDir");
        final DeleteAiDataPlatformDirRequest interceptedRequest = DeleteAiDataPlatformDirConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformDirConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "DeleteAiDataPlatformDir", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformDirResponse> transformer = DeleteAiDataPlatformDirConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformDirRequest, DeleteAiDataPlatformDirResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformDirRequest, DeleteAiDataPlatformDirResponse>, java.util.concurrent.Future<DeleteAiDataPlatformDirResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformDirRequest, DeleteAiDataPlatformDirResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformFileResponse> deleteAiDataPlatformFile(DeleteAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformFileRequest, DeleteAiDataPlatformFileResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformFile");
        final DeleteAiDataPlatformFileRequest interceptedRequest = DeleteAiDataPlatformFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformFileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "DeleteAiDataPlatformFile", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformFileResponse> transformer = DeleteAiDataPlatformFileConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformFileRequest, DeleteAiDataPlatformFileResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformFileRequest, DeleteAiDataPlatformFileResponse>, java.util.concurrent.Future<DeleteAiDataPlatformFileResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformFileRequest, DeleteAiDataPlatformFileResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformVolumeResponse> deleteAiDataPlatformVolume(DeleteAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformVolumeRequest, DeleteAiDataPlatformVolumeResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformVolume");
        final DeleteAiDataPlatformVolumeRequest interceptedRequest = DeleteAiDataPlatformVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "DeleteAiDataPlatformVolume", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformVolumeResponse> transformer = DeleteAiDataPlatformVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformVolumeRequest, DeleteAiDataPlatformVolumeResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformVolumeRequest, DeleteAiDataPlatformVolumeResponse>, java.util.concurrent.Future<DeleteAiDataPlatformVolumeResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformVolumeRequest, DeleteAiDataPlatformVolumeResponse>(
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
    public java.util.concurrent.Future<DownloadAiDataPlatformFileResponse> downloadAiDataPlatformFile(DownloadAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileRequest, DownloadAiDataPlatformFileResponse> handler) {
        LOG.trace("Called async downloadAiDataPlatformFile");
        final DownloadAiDataPlatformFileRequest interceptedRequest = DownloadAiDataPlatformFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DownloadAiDataPlatformFileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "DownloadAiDataPlatformFile", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadAiDataPlatformFileResponse> transformer = DownloadAiDataPlatformFileConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileRequest, DownloadAiDataPlatformFileResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileRequest, DownloadAiDataPlatformFileResponse>, java.util.concurrent.Future<DownloadAiDataPlatformFileResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DownloadAiDataPlatformFileRequest, DownloadAiDataPlatformFileResponse>(
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
    public java.util.concurrent.Future<DownloadAiDataPlatformFileWithParResponse> downloadAiDataPlatformFileWithPar(DownloadAiDataPlatformFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileWithParRequest, DownloadAiDataPlatformFileWithParResponse> handler) {
        LOG.trace("Called async downloadAiDataPlatformFileWithPar");
        final DownloadAiDataPlatformFileWithParRequest interceptedRequest = DownloadAiDataPlatformFileWithParConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DownloadAiDataPlatformFileWithParConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "DownloadAiDataPlatformFileWithPar", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DownloadAiDataPlatformFileWithParResponse> transformer = DownloadAiDataPlatformFileWithParConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileWithParRequest, DownloadAiDataPlatformFileWithParResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileWithParRequest, DownloadAiDataPlatformFileWithParResponse>, java.util.concurrent.Future<DownloadAiDataPlatformFileWithParResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DownloadAiDataPlatformFileWithParRequest, DownloadAiDataPlatformFileWithParResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformVolumeResponse> getAiDataPlatformVolume(GetAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformVolumeRequest, GetAiDataPlatformVolumeResponse> handler) {
        LOG.trace("Called async getAiDataPlatformVolume");
        final GetAiDataPlatformVolumeRequest interceptedRequest = GetAiDataPlatformVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "GetAiDataPlatformVolume", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformVolumeResponse> transformer = GetAiDataPlatformVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformVolumeRequest, GetAiDataPlatformVolumeResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformVolumeRequest, GetAiDataPlatformVolumeResponse>, java.util.concurrent.Future<GetAiDataPlatformVolumeResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformVolumeRequest, GetAiDataPlatformVolumeResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformFilesResponse> listAiDataPlatformFiles(ListAiDataPlatformFilesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformFilesRequest, ListAiDataPlatformFilesResponse> handler) {
        LOG.trace("Called async listAiDataPlatformFiles");
        final ListAiDataPlatformFilesRequest interceptedRequest = ListAiDataPlatformFilesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformFilesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "ListAiDataPlatformFiles", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformFilesResponse> transformer = ListAiDataPlatformFilesConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformFilesRequest, ListAiDataPlatformFilesResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformFilesRequest, ListAiDataPlatformFilesResponse>, java.util.concurrent.Future<ListAiDataPlatformFilesResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformFilesRequest, ListAiDataPlatformFilesResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformVolumePermissionsResponse> listAiDataPlatformVolumePermissions(ListAiDataPlatformVolumePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumePermissionsRequest, ListAiDataPlatformVolumePermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformVolumePermissions");
        final ListAiDataPlatformVolumePermissionsRequest interceptedRequest = ListAiDataPlatformVolumePermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformVolumePermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "ListAiDataPlatformVolumePermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformVolumePermissionsResponse> transformer = ListAiDataPlatformVolumePermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumePermissionsRequest, ListAiDataPlatformVolumePermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumePermissionsRequest, ListAiDataPlatformVolumePermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformVolumePermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformVolumePermissionsRequest, ListAiDataPlatformVolumePermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformVolumesResponse> listAiDataPlatformVolumes(ListAiDataPlatformVolumesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumesRequest, ListAiDataPlatformVolumesResponse> handler) {
        LOG.trace("Called async listAiDataPlatformVolumes");
        final ListAiDataPlatformVolumesRequest interceptedRequest = ListAiDataPlatformVolumesConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformVolumesConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "ListAiDataPlatformVolumes", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformVolumesResponse> transformer = ListAiDataPlatformVolumesConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumesRequest, ListAiDataPlatformVolumesResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumesRequest, ListAiDataPlatformVolumesResponse>, java.util.concurrent.Future<ListAiDataPlatformVolumesResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformVolumesRequest, ListAiDataPlatformVolumesResponse>(
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
    public java.util.concurrent.Future<MakeAiDataPlatformDirResponse> makeAiDataPlatformDir(MakeAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<MakeAiDataPlatformDirRequest, MakeAiDataPlatformDirResponse> handler) {
        LOG.trace("Called async makeAiDataPlatformDir");
        final MakeAiDataPlatformDirRequest interceptedRequest = MakeAiDataPlatformDirConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = MakeAiDataPlatformDirConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "MakeAiDataPlatformDir", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, MakeAiDataPlatformDirResponse> transformer = MakeAiDataPlatformDirConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<MakeAiDataPlatformDirRequest, MakeAiDataPlatformDirResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<MakeAiDataPlatformDirRequest, MakeAiDataPlatformDirResponse>, java.util.concurrent.Future<MakeAiDataPlatformDirResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<MakeAiDataPlatformDirRequest, MakeAiDataPlatformDirResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformVolumePermissionResponse> manageAiDataPlatformVolumePermission(ManageAiDataPlatformVolumePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformVolumePermissionRequest, ManageAiDataPlatformVolumePermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformVolumePermission");
        final ManageAiDataPlatformVolumePermissionRequest interceptedRequest = ManageAiDataPlatformVolumePermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformVolumePermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "ManageAiDataPlatformVolumePermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformVolumePermissionResponse> transformer = ManageAiDataPlatformVolumePermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformVolumePermissionRequest, ManageAiDataPlatformVolumePermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformVolumePermissionRequest, ManageAiDataPlatformVolumePermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformVolumePermissionResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getManageVolumePermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformVolumePermissionRequest, ManageAiDataPlatformVolumePermissionResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformDirResponse> updateAiDataPlatformDir(UpdateAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformDirRequest, UpdateAiDataPlatformDirResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformDir");
        final UpdateAiDataPlatformDirRequest interceptedRequest = UpdateAiDataPlatformDirConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformDirConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "UpdateAiDataPlatformDir", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformDirResponse> transformer = UpdateAiDataPlatformDirConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformDirRequest, UpdateAiDataPlatformDirResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformDirRequest, UpdateAiDataPlatformDirResponse>, java.util.concurrent.Future<UpdateAiDataPlatformDirResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateDirDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformDirRequest, UpdateAiDataPlatformDirResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformVolumeResponse> updateAiDataPlatformVolume(UpdateAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformVolumeRequest, UpdateAiDataPlatformVolumeResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformVolume");
        final UpdateAiDataPlatformVolumeRequest interceptedRequest = UpdateAiDataPlatformVolumeConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformVolumeConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "UpdateAiDataPlatformVolume", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformVolumeResponse> transformer = UpdateAiDataPlatformVolumeConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformVolumeRequest, UpdateAiDataPlatformVolumeResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformVolumeRequest, UpdateAiDataPlatformVolumeResponse>, java.util.concurrent.Future<UpdateAiDataPlatformVolumeResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateVolumeDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformVolumeRequest, UpdateAiDataPlatformVolumeResponse>(
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
    public java.util.concurrent.Future<UploadAiDataPlatformFileResponse> uploadAiDataPlatformFile(UploadAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileRequest, UploadAiDataPlatformFileResponse> handler) {
        LOG.trace("Called async uploadAiDataPlatformFile");
        if (request.getRetryConfiguration() != null || authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            request = com.oracle.bmc.retrier.Retriers.wrapBodyInputStreamIfNecessary(request, UploadAiDataPlatformFileRequest.builder());
        }
        final UploadAiDataPlatformFileRequest interceptedRequest = UploadAiDataPlatformFileConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UploadAiDataPlatformFileConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "UploadAiDataPlatformFile", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UploadAiDataPlatformFileResponse> transformer = UploadAiDataPlatformFileConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileRequest, UploadAiDataPlatformFileResponse> handlerToUse = new com.oracle.bmc.responses.internal.StreamClosingAsyncHandler<>(handler);

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileRequest, UploadAiDataPlatformFileResponse>, java.util.concurrent.Future<UploadAiDataPlatformFileResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUploadFileDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UploadAiDataPlatformFileRequest, UploadAiDataPlatformFileResponse>(
                (com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) this.authenticationDetailsProvider,
                handlerToUse,
                futureSupplier) {
                    @Override
                    protected void beforeRetryAction() {
                        LOG.debug("Resetting stream");
                        com.oracle.bmc.retrier.Retriers.tryResetStreamForRetry(
                        interceptedRequest.getUploadFileDetails(), true);
                    }
            };
        } else {
            return futureSupplier.apply(handlerToUse);
        }
    }

    @Override
    public java.util.concurrent.Future<UploadAiDataPlatformFileWithParResponse> uploadAiDataPlatformFileWithPar(UploadAiDataPlatformFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileWithParRequest, UploadAiDataPlatformFileWithParResponse> handler) {
        LOG.trace("Called async uploadAiDataPlatformFileWithPar");
        final UploadAiDataPlatformFileWithParRequest interceptedRequest = UploadAiDataPlatformFileWithParConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UploadAiDataPlatformFileWithParConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Volume", "UploadAiDataPlatformFileWithPar", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UploadAiDataPlatformFileWithParResponse> transformer = UploadAiDataPlatformFileWithParConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileWithParRequest, UploadAiDataPlatformFileWithParResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileWithParRequest, UploadAiDataPlatformFileWithParResponse>, java.util.concurrent.Future<UploadAiDataPlatformFileWithParResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUploadFileWithParDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UploadAiDataPlatformFileWithParRequest, UploadAiDataPlatformFileWithParResponse>(
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
