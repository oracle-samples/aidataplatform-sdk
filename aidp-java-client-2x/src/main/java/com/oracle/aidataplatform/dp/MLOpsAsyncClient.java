// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for MLOps service. <br/>
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
public class MLOpsAsyncClient implements MLOpsAsync {
    /**
     * Service instance for MLOps.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("MLOPS").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MLOpsAsyncClient.class);

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
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public MLOpsAsyncClient(
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
    public MLOpsAsyncClient (
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
    public MLOpsAsyncClient (
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
    public MLOpsAsyncClient (
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
    public MLOpsAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MLOpsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public MLOpsAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new MLOpsAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CreateAiDataPlatformExperimentResponse> createAiDataPlatformExperiment(CreateAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse> handler) {
        LOG.trace("Called async createAiDataPlatformExperiment");
        final CreateAiDataPlatformExperimentRequest interceptedRequest = CreateAiDataPlatformExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformExperimentResponse> transformer = CreateAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse>, java.util.concurrent.Future<CreateAiDataPlatformExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformExperimentRunResponse> createAiDataPlatformExperimentRun(CreateAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse> handler) {
        LOG.trace("Called async createAiDataPlatformExperimentRun");
        final CreateAiDataPlatformExperimentRunRequest interceptedRequest = CreateAiDataPlatformExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformExperimentRunResponse> transformer = CreateAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse>, java.util.concurrent.Future<CreateAiDataPlatformExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformModelVersionResponse> createAiDataPlatformModelVersion(CreateAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse> handler) {
        LOG.trace("Called async createAiDataPlatformModelVersion");
        final CreateAiDataPlatformModelVersionRequest interceptedRequest = CreateAiDataPlatformModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformModelVersionResponse> transformer = CreateAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse>, java.util.concurrent.Future<CreateAiDataPlatformModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformRegisteredModelResponse> createAiDataPlatformRegisteredModel(CreateAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse> handler) {
        LOG.trace("Called async createAiDataPlatformRegisteredModel");
        final CreateAiDataPlatformRegisteredModelRequest interceptedRequest = CreateAiDataPlatformRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformRegisteredModelResponse> transformer = CreateAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse>, java.util.concurrent.Future<CreateAiDataPlatformRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformWorkspaceModelVersionResponse> createAiDataPlatformWorkspaceModelVersion(CreateAiDataPlatformWorkspaceModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse> handler) {
        LOG.trace("Called async createAiDataPlatformWorkspaceModelVersion");
        final CreateAiDataPlatformWorkspaceModelVersionRequest interceptedRequest = CreateAiDataPlatformWorkspaceModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformWorkspaceModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateAiDataPlatformWorkspaceModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformWorkspaceModelVersionResponse> transformer = CreateAiDataPlatformWorkspaceModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse>, java.util.concurrent.Future<CreateAiDataPlatformWorkspaceModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentResponse> deleteAiDataPlatformExperiment(DeleteAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformExperiment");
        final DeleteAiDataPlatformExperimentRequest interceptedRequest = DeleteAiDataPlatformExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentResponse> transformer = DeleteAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse>, java.util.concurrent.Future<DeleteAiDataPlatformExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunResponse> deleteAiDataPlatformExperimentRun(DeleteAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformExperimentRun");
        final DeleteAiDataPlatformExperimentRunRequest interceptedRequest = DeleteAiDataPlatformExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentRunResponse> transformer = DeleteAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse>, java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunTagResponse> deleteAiDataPlatformExperimentRunTag(DeleteAiDataPlatformExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformExperimentRunTag");
        final DeleteAiDataPlatformExperimentRunTagRequest interceptedRequest = DeleteAiDataPlatformExperimentRunTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentRunTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentRunTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentRunTagResponse> transformer = DeleteAiDataPlatformExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse>, java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentRunTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentTagResponse> deleteAiDataPlatformExperimentTag(DeleteAiDataPlatformExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformExperimentTag");
        final DeleteAiDataPlatformExperimentTagRequest interceptedRequest = DeleteAiDataPlatformExperimentTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformExperimentTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformExperimentTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformExperimentTagResponse> transformer = DeleteAiDataPlatformExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse>, java.util.concurrent.Future<DeleteAiDataPlatformExperimentTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformModelVersionResponse> deleteAiDataPlatformModelVersion(DeleteAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformModelVersion");
        final DeleteAiDataPlatformModelVersionRequest interceptedRequest = DeleteAiDataPlatformModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformModelVersionResponse> transformer = DeleteAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse>, java.util.concurrent.Future<DeleteAiDataPlatformModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformModelVersionTagResponse> deleteAiDataPlatformModelVersionTag(DeleteAiDataPlatformModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformModelVersionTag");
        final DeleteAiDataPlatformModelVersionTagRequest interceptedRequest = DeleteAiDataPlatformModelVersionTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformModelVersionTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformModelVersionTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformModelVersionTagResponse> transformer = DeleteAiDataPlatformModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse>, java.util.concurrent.Future<DeleteAiDataPlatformModelVersionTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteModelVersionTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelResponse> deleteAiDataPlatformRegisteredModel(DeleteAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformRegisteredModel");
        final DeleteAiDataPlatformRegisteredModelRequest interceptedRequest = DeleteAiDataPlatformRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformRegisteredModelResponse> transformer = DeleteAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse>, java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelTagResponse> deleteAiDataPlatformRegisteredModelTag(DeleteAiDataPlatformRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformRegisteredModelTag");
        final DeleteAiDataPlatformRegisteredModelTagRequest interceptedRequest = DeleteAiDataPlatformRegisteredModelTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformRegisteredModelTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteAiDataPlatformRegisteredModelTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformRegisteredModelTagResponse> transformer = DeleteAiDataPlatformRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse>, java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteRegisteredModelTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformExperimentByIdResponse> getAiDataPlatformExperimentById(GetAiDataPlatformExperimentByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse> handler) {
        LOG.trace("Called async getAiDataPlatformExperimentById");
        final GetAiDataPlatformExperimentByIdRequest interceptedRequest = GetAiDataPlatformExperimentByIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentByIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentById", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentByIdResponse> transformer = GetAiDataPlatformExperimentByIdConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse>, java.util.concurrent.Future<GetAiDataPlatformExperimentByIdResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformExperimentByNameResponse> getAiDataPlatformExperimentByName(GetAiDataPlatformExperimentByNameRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse> handler) {
        LOG.trace("Called async getAiDataPlatformExperimentByName");
        final GetAiDataPlatformExperimentByNameRequest interceptedRequest = GetAiDataPlatformExperimentByNameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentByNameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentByName", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentByNameResponse> transformer = GetAiDataPlatformExperimentByNameConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse>, java.util.concurrent.Future<GetAiDataPlatformExperimentByNameResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformExperimentRunByIdResponse> getAiDataPlatformExperimentRunById(GetAiDataPlatformExperimentRunByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse> handler) {
        LOG.trace("Called async getAiDataPlatformExperimentRunById");
        final GetAiDataPlatformExperimentRunByIdRequest interceptedRequest = GetAiDataPlatformExperimentRunByIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentRunByIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentRunById", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentRunByIdResponse> transformer = GetAiDataPlatformExperimentRunByIdConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse>, java.util.concurrent.Future<GetAiDataPlatformExperimentRunByIdResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformExperimentRunMetricHistoryResponse> getAiDataPlatformExperimentRunMetricHistory(GetAiDataPlatformExperimentRunMetricHistoryRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse> handler) {
        LOG.trace("Called async getAiDataPlatformExperimentRunMetricHistory");
        final GetAiDataPlatformExperimentRunMetricHistoryRequest interceptedRequest = GetAiDataPlatformExperimentRunMetricHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformExperimentRunMetricHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformExperimentRunMetricHistory", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformExperimentRunMetricHistoryResponse> transformer = GetAiDataPlatformExperimentRunMetricHistoryConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse>, java.util.concurrent.Future<GetAiDataPlatformExperimentRunMetricHistoryResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformModelVersionResponse> getAiDataPlatformModelVersion(GetAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse> handler) {
        LOG.trace("Called async getAiDataPlatformModelVersion");
        final GetAiDataPlatformModelVersionRequest interceptedRequest = GetAiDataPlatformModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformModelVersionResponse> transformer = GetAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse>, java.util.concurrent.Future<GetAiDataPlatformModelVersionResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformRegisteredModelResponse> getAiDataPlatformRegisteredModel(GetAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse> handler) {
        LOG.trace("Called async getAiDataPlatformRegisteredModel");
        final GetAiDataPlatformRegisteredModelRequest interceptedRequest = GetAiDataPlatformRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformRegisteredModelResponse> transformer = GetAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse>, java.util.concurrent.Future<GetAiDataPlatformRegisteredModelResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformArtifactsResponse> listAiDataPlatformArtifacts(ListAiDataPlatformArtifactsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformArtifacts");
        final ListAiDataPlatformArtifactsRequest interceptedRequest = ListAiDataPlatformArtifactsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformArtifactsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformArtifacts", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformArtifactsResponse> transformer = ListAiDataPlatformArtifactsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse>, java.util.concurrent.Future<ListAiDataPlatformArtifactsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformExperimentRunsResponse> listAiDataPlatformExperimentRuns(ListAiDataPlatformExperimentRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformExperimentRuns");
        final ListAiDataPlatformExperimentRunsRequest interceptedRequest = ListAiDataPlatformExperimentRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformExperimentRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformExperimentRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformExperimentRunsResponse> transformer = ListAiDataPlatformExperimentRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse>, java.util.concurrent.Future<ListAiDataPlatformExperimentRunsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListExperimentRunsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformExperimentsResponse> listAiDataPlatformExperiments(ListAiDataPlatformExperimentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformExperiments");
        final ListAiDataPlatformExperimentsRequest interceptedRequest = ListAiDataPlatformExperimentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformExperimentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformExperiments", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformExperimentsResponse> transformer = ListAiDataPlatformExperimentsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse>, java.util.concurrent.Future<ListAiDataPlatformExperimentsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListExperimentsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformLoggedModelsResponse> listAiDataPlatformLoggedModels(ListAiDataPlatformLoggedModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformLoggedModels");
        final ListAiDataPlatformLoggedModelsRequest interceptedRequest = ListAiDataPlatformLoggedModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformLoggedModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformLoggedModels", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformLoggedModelsResponse> transformer = ListAiDataPlatformLoggedModelsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse>, java.util.concurrent.Future<ListAiDataPlatformLoggedModelsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListLoggedModelsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformModelVersionsResponse> listAiDataPlatformModelVersions(ListAiDataPlatformModelVersionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformModelVersions");
        final ListAiDataPlatformModelVersionsRequest interceptedRequest = ListAiDataPlatformModelVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformModelVersionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformModelVersions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformModelVersionsResponse> transformer = ListAiDataPlatformModelVersionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse>, java.util.concurrent.Future<ListAiDataPlatformModelVersionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformRegisteredModelsResponse> listAiDataPlatformRegisteredModels(ListAiDataPlatformRegisteredModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformRegisteredModels");
        final ListAiDataPlatformRegisteredModelsRequest interceptedRequest = ListAiDataPlatformRegisteredModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRegisteredModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListAiDataPlatformRegisteredModels", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRegisteredModelsResponse> transformer = ListAiDataPlatformRegisteredModelsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse>, java.util.concurrent.Future<ListAiDataPlatformRegisteredModelsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse>(
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
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunBatchResponse> logAiDataPlatformExperimentRunBatch(LogAiDataPlatformExperimentRunBatchRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse> handler) {
        LOG.trace("Called async logAiDataPlatformExperimentRunBatch");
        final LogAiDataPlatformExperimentRunBatchRequest interceptedRequest = LogAiDataPlatformExperimentRunBatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunBatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunBatch", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunBatchResponse> transformer = LogAiDataPlatformExperimentRunBatchConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse>, java.util.concurrent.Future<LogAiDataPlatformExperimentRunBatchResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunBatchDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse>(
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
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunInputsResponse> logAiDataPlatformExperimentRunInputs(LogAiDataPlatformExperimentRunInputsRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse> handler) {
        LOG.trace("Called async logAiDataPlatformExperimentRunInputs");
        final LogAiDataPlatformExperimentRunInputsRequest interceptedRequest = LogAiDataPlatformExperimentRunInputsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunInputsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunInputs", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunInputsResponse> transformer = LogAiDataPlatformExperimentRunInputsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse>, java.util.concurrent.Future<LogAiDataPlatformExperimentRunInputsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunInputsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse>(
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
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunMetricResponse> logAiDataPlatformExperimentRunMetric(LogAiDataPlatformExperimentRunMetricRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse> handler) {
        LOG.trace("Called async logAiDataPlatformExperimentRunMetric");
        final LogAiDataPlatformExperimentRunMetricRequest interceptedRequest = LogAiDataPlatformExperimentRunMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunMetric", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunMetricResponse> transformer = LogAiDataPlatformExperimentRunMetricConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse>, java.util.concurrent.Future<LogAiDataPlatformExperimentRunMetricResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunMetricDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse>(
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
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunModelResponse> logAiDataPlatformExperimentRunModel(LogAiDataPlatformExperimentRunModelRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse> handler) {
        LOG.trace("Called async logAiDataPlatformExperimentRunModel");
        final LogAiDataPlatformExperimentRunModelRequest interceptedRequest = LogAiDataPlatformExperimentRunModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunModelResponse> transformer = LogAiDataPlatformExperimentRunModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse>, java.util.concurrent.Future<LogAiDataPlatformExperimentRunModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse>(
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
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunParamResponse> logAiDataPlatformExperimentRunParam(LogAiDataPlatformExperimentRunParamRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse> handler) {
        LOG.trace("Called async logAiDataPlatformExperimentRunParam");
        final LogAiDataPlatformExperimentRunParamRequest interceptedRequest = LogAiDataPlatformExperimentRunParamConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogAiDataPlatformExperimentRunParamConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogAiDataPlatformExperimentRunParam", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogAiDataPlatformExperimentRunParamResponse> transformer = LogAiDataPlatformExperimentRunParamConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse>, java.util.concurrent.Future<LogAiDataPlatformExperimentRunParamResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunParamDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse>(
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
    public java.util.concurrent.Future<RenameAiDataPlatformRegisteredModelResponse> renameAiDataPlatformRegisteredModel(RenameAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse> handler) {
        LOG.trace("Called async renameAiDataPlatformRegisteredModel");
        final RenameAiDataPlatformRegisteredModelRequest interceptedRequest = RenameAiDataPlatformRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RenameAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RenameAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RenameAiDataPlatformRegisteredModelResponse> transformer = RenameAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse>, java.util.concurrent.Future<RenameAiDataPlatformRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRenameRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse>(
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
    public java.util.concurrent.Future<RestoreAiDataPlatformExperimentResponse> restoreAiDataPlatformExperiment(RestoreAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse> handler) {
        LOG.trace("Called async restoreAiDataPlatformExperiment");
        final RestoreAiDataPlatformExperimentRequest interceptedRequest = RestoreAiDataPlatformExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RestoreAiDataPlatformExperimentResponse> transformer = RestoreAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse>, java.util.concurrent.Future<RestoreAiDataPlatformExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRestoreExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse>(
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
    public java.util.concurrent.Future<RestoreAiDataPlatformExperimentRunResponse> restoreAiDataPlatformExperimentRun(RestoreAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse> handler) {
        LOG.trace("Called async restoreAiDataPlatformExperimentRun");
        final RestoreAiDataPlatformExperimentRunRequest interceptedRequest = RestoreAiDataPlatformExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RestoreAiDataPlatformExperimentRunResponse> transformer = RestoreAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse>, java.util.concurrent.Future<RestoreAiDataPlatformExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRestoreExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse>(
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
    public java.util.concurrent.Future<SetAiDataPlatformExperimentRunTagResponse> setAiDataPlatformExperimentRunTag(SetAiDataPlatformExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse> handler) {
        LOG.trace("Called async setAiDataPlatformExperimentRunTag");
        final SetAiDataPlatformExperimentRunTagRequest interceptedRequest = SetAiDataPlatformExperimentRunTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformExperimentRunTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformExperimentRunTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformExperimentRunTagResponse> transformer = SetAiDataPlatformExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse>, java.util.concurrent.Future<SetAiDataPlatformExperimentRunTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetExperimentRunTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse>(
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
    public java.util.concurrent.Future<SetAiDataPlatformExperimentTagResponse> setAiDataPlatformExperimentTag(SetAiDataPlatformExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse> handler) {
        LOG.trace("Called async setAiDataPlatformExperimentTag");
        final SetAiDataPlatformExperimentTagRequest interceptedRequest = SetAiDataPlatformExperimentTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformExperimentTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformExperimentTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformExperimentTagResponse> transformer = SetAiDataPlatformExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse>, java.util.concurrent.Future<SetAiDataPlatformExperimentTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetExperimentTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse>(
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
    public java.util.concurrent.Future<SetAiDataPlatformModelVersionTagResponse> setAiDataPlatformModelVersionTag(SetAiDataPlatformModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse> handler) {
        LOG.trace("Called async setAiDataPlatformModelVersionTag");
        final SetAiDataPlatformModelVersionTagRequest interceptedRequest = SetAiDataPlatformModelVersionTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformModelVersionTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformModelVersionTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformModelVersionTagResponse> transformer = SetAiDataPlatformModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse>, java.util.concurrent.Future<SetAiDataPlatformModelVersionTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetModelVersionTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse>(
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
    public java.util.concurrent.Future<SetAiDataPlatformRegisteredModelTagResponse> setAiDataPlatformRegisteredModelTag(SetAiDataPlatformRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse> handler) {
        LOG.trace("Called async setAiDataPlatformRegisteredModelTag");
        final SetAiDataPlatformRegisteredModelTagRequest interceptedRequest = SetAiDataPlatformRegisteredModelTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetAiDataPlatformRegisteredModelTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetAiDataPlatformRegisteredModelTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetAiDataPlatformRegisteredModelTagResponse> transformer = SetAiDataPlatformRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse>, java.util.concurrent.Future<SetAiDataPlatformRegisteredModelTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetRegisteredModelTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse>(
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
    public java.util.concurrent.Future<TransitionAiDataPlatformModelVersionStageResponse> transitionAiDataPlatformModelVersionStage(TransitionAiDataPlatformModelVersionStageRequest request, final com.oracle.bmc.responses.AsyncHandler<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse> handler) {
        LOG.trace("Called async transitionAiDataPlatformModelVersionStage");
        final TransitionAiDataPlatformModelVersionStageRequest interceptedRequest = TransitionAiDataPlatformModelVersionStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = TransitionAiDataPlatformModelVersionStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "TransitionAiDataPlatformModelVersionStage", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, TransitionAiDataPlatformModelVersionStageResponse> transformer = TransitionAiDataPlatformModelVersionStageConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse>, java.util.concurrent.Future<TransitionAiDataPlatformModelVersionStageResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getTransitionModelVersionStageDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentResponse> updateAiDataPlatformExperiment(UpdateAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformExperiment");
        final UpdateAiDataPlatformExperimentRequest interceptedRequest = UpdateAiDataPlatformExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentResponse> transformer = UpdateAiDataPlatformExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse>, java.util.concurrent.Future<UpdateAiDataPlatformExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunResponse> updateAiDataPlatformExperimentRun(UpdateAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformExperimentRun");
        final UpdateAiDataPlatformExperimentRunRequest interceptedRequest = UpdateAiDataPlatformExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentRunResponse> transformer = UpdateAiDataPlatformExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse>, java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunTagsResponse> updateAiDataPlatformExperimentRunTags(UpdateAiDataPlatformExperimentRunTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformExperimentRunTags");
        final UpdateAiDataPlatformExperimentRunTagsRequest interceptedRequest = UpdateAiDataPlatformExperimentRunTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentRunTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentRunTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentRunTagsResponse> transformer = UpdateAiDataPlatformExperimentRunTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse>, java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentRunTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentTagsResponse> updateAiDataPlatformExperimentTags(UpdateAiDataPlatformExperimentTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformExperimentTags");
        final UpdateAiDataPlatformExperimentTagsRequest interceptedRequest = UpdateAiDataPlatformExperimentTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformExperimentTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformExperimentTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformExperimentTagsResponse> transformer = UpdateAiDataPlatformExperimentTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse>, java.util.concurrent.Future<UpdateAiDataPlatformExperimentTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformModelVersionResponse> updateAiDataPlatformModelVersion(UpdateAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformModelVersion");
        final UpdateAiDataPlatformModelVersionRequest interceptedRequest = UpdateAiDataPlatformModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformModelVersionResponse> transformer = UpdateAiDataPlatformModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse>, java.util.concurrent.Future<UpdateAiDataPlatformModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformModelVersionTagsResponse> updateAiDataPlatformModelVersionTags(UpdateAiDataPlatformModelVersionTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformModelVersionTags");
        final UpdateAiDataPlatformModelVersionTagsRequest interceptedRequest = UpdateAiDataPlatformModelVersionTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformModelVersionTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformModelVersionTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformModelVersionTagsResponse> transformer = UpdateAiDataPlatformModelVersionTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse>, java.util.concurrent.Future<UpdateAiDataPlatformModelVersionTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateModelVersionTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelResponse> updateAiDataPlatformRegisteredModel(UpdateAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformRegisteredModel");
        final UpdateAiDataPlatformRegisteredModelRequest interceptedRequest = UpdateAiDataPlatformRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformRegisteredModelResponse> transformer = UpdateAiDataPlatformRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse>, java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelTagsResponse> updateAiDataPlatformRegisteredModelTags(UpdateAiDataPlatformRegisteredModelTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformRegisteredModelTags");
        final UpdateAiDataPlatformRegisteredModelTagsRequest interceptedRequest = UpdateAiDataPlatformRegisteredModelTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformRegisteredModelTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateAiDataPlatformRegisteredModelTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformRegisteredModelTagsResponse> transformer = UpdateAiDataPlatformRegisteredModelTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse>, java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateRegisteredModelTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse>(
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
