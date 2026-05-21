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
    public java.util.concurrent.Future<CreateExperimentResponse> createExperiment(CreateExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateExperimentRequest, CreateExperimentResponse> handler) {
        LOG.trace("Called async createExperiment");
        final CreateExperimentRequest interceptedRequest = CreateExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateExperimentResponse> transformer = CreateExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateExperimentRequest, CreateExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateExperimentRequest, CreateExperimentResponse>, java.util.concurrent.Future<CreateExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateExperimentRequest, CreateExperimentResponse>(
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
    public java.util.concurrent.Future<CreateExperimentRunResponse> createExperimentRun(CreateExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateExperimentRunRequest, CreateExperimentRunResponse> handler) {
        LOG.trace("Called async createExperimentRun");
        final CreateExperimentRunRequest interceptedRequest = CreateExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateExperimentRunResponse> transformer = CreateExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateExperimentRunRequest, CreateExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateExperimentRunRequest, CreateExperimentRunResponse>, java.util.concurrent.Future<CreateExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateExperimentRunRequest, CreateExperimentRunResponse>(
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
    public java.util.concurrent.Future<CreateModelVersionResponse> createModelVersion(CreateModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResponse> handler) {
        LOG.trace("Called async createModelVersion");
        final CreateModelVersionRequest interceptedRequest = CreateModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateModelVersionResponse> transformer = CreateModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateModelVersionRequest, CreateModelVersionResponse>, java.util.concurrent.Future<CreateModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateModelVersionRequest, CreateModelVersionResponse>(
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
    public java.util.concurrent.Future<CreateRegisteredModelResponse> createRegisteredModel(CreateRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateRegisteredModelRequest, CreateRegisteredModelResponse> handler) {
        LOG.trace("Called async createRegisteredModel");
        final CreateRegisteredModelRequest interceptedRequest = CreateRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateRegisteredModelResponse> transformer = CreateRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateRegisteredModelRequest, CreateRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateRegisteredModelRequest, CreateRegisteredModelResponse>, java.util.concurrent.Future<CreateRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateRegisteredModelRequest, CreateRegisteredModelResponse>(
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
    public java.util.concurrent.Future<CreateWorkspaceModelVersionResponse> createWorkspaceModelVersion(CreateWorkspaceModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceModelVersionRequest, CreateWorkspaceModelVersionResponse> handler) {
        LOG.trace("Called async createWorkspaceModelVersion");
        final CreateWorkspaceModelVersionRequest interceptedRequest = CreateWorkspaceModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateWorkspaceModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "CreateWorkspaceModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateWorkspaceModelVersionResponse> transformer = CreateWorkspaceModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceModelVersionRequest, CreateWorkspaceModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceModelVersionRequest, CreateWorkspaceModelVersionResponse>, java.util.concurrent.Future<CreateWorkspaceModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateWorkspaceModelVersionRequest, CreateWorkspaceModelVersionResponse>(
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
    public java.util.concurrent.Future<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResponse> handler) {
        LOG.trace("Called async deleteExperiment");
        final DeleteExperimentRequest interceptedRequest = DeleteExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExperimentResponse> transformer = DeleteExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRequest, DeleteExperimentResponse>, java.util.concurrent.Future<DeleteExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteExperimentRequest, DeleteExperimentResponse>(
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
    public java.util.concurrent.Future<DeleteExperimentRunResponse> deleteExperimentRun(DeleteExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunRequest, DeleteExperimentRunResponse> handler) {
        LOG.trace("Called async deleteExperimentRun");
        final DeleteExperimentRunRequest interceptedRequest = DeleteExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExperimentRunResponse> transformer = DeleteExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunRequest, DeleteExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunRequest, DeleteExperimentRunResponse>, java.util.concurrent.Future<DeleteExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteExperimentRunRequest, DeleteExperimentRunResponse>(
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
    public java.util.concurrent.Future<DeleteExperimentRunTagResponse> deleteExperimentRunTag(DeleteExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunTagRequest, DeleteExperimentRunTagResponse> handler) {
        LOG.trace("Called async deleteExperimentRunTag");
        final DeleteExperimentRunTagRequest interceptedRequest = DeleteExperimentRunTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteExperimentRunTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteExperimentRunTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExperimentRunTagResponse> transformer = DeleteExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunTagRequest, DeleteExperimentRunTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteExperimentRunTagRequest, DeleteExperimentRunTagResponse>, java.util.concurrent.Future<DeleteExperimentRunTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentRunTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteExperimentRunTagRequest, DeleteExperimentRunTagResponse>(
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
    public java.util.concurrent.Future<DeleteExperimentTagResponse> deleteExperimentTag(DeleteExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteExperimentTagRequest, DeleteExperimentTagResponse> handler) {
        LOG.trace("Called async deleteExperimentTag");
        final DeleteExperimentTagRequest interceptedRequest = DeleteExperimentTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteExperimentTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteExperimentTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteExperimentTagResponse> transformer = DeleteExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteExperimentTagRequest, DeleteExperimentTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteExperimentTagRequest, DeleteExperimentTagResponse>, java.util.concurrent.Future<DeleteExperimentTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteExperimentTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteExperimentTagRequest, DeleteExperimentTagResponse>(
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
    public java.util.concurrent.Future<DeleteModelVersionResponse> deleteModelVersion(DeleteModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResponse> handler) {
        LOG.trace("Called async deleteModelVersion");
        final DeleteModelVersionRequest interceptedRequest = DeleteModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelVersionResponse> transformer = DeleteModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionRequest, DeleteModelVersionResponse>, java.util.concurrent.Future<DeleteModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteModelVersionRequest, DeleteModelVersionResponse>(
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
    public java.util.concurrent.Future<DeleteModelVersionTagResponse> deleteModelVersionTag(DeleteModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionTagRequest, DeleteModelVersionTagResponse> handler) {
        LOG.trace("Called async deleteModelVersionTag");
        final DeleteModelVersionTagRequest interceptedRequest = DeleteModelVersionTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteModelVersionTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteModelVersionTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteModelVersionTagResponse> transformer = DeleteModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionTagRequest, DeleteModelVersionTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteModelVersionTagRequest, DeleteModelVersionTagResponse>, java.util.concurrent.Future<DeleteModelVersionTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteModelVersionTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteModelVersionTagRequest, DeleteModelVersionTagResponse>(
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
    public java.util.concurrent.Future<DeleteRegisteredModelResponse> deleteRegisteredModel(DeleteRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelRequest, DeleteRegisteredModelResponse> handler) {
        LOG.trace("Called async deleteRegisteredModel");
        final DeleteRegisteredModelRequest interceptedRequest = DeleteRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRegisteredModelResponse> transformer = DeleteRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelRequest, DeleteRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelRequest, DeleteRegisteredModelResponse>, java.util.concurrent.Future<DeleteRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteRegisteredModelRequest, DeleteRegisteredModelResponse>(
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
    public java.util.concurrent.Future<DeleteRegisteredModelTagResponse> deleteRegisteredModelTag(DeleteRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelTagRequest, DeleteRegisteredModelTagResponse> handler) {
        LOG.trace("Called async deleteRegisteredModelTag");
        final DeleteRegisteredModelTagRequest interceptedRequest = DeleteRegisteredModelTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteRegisteredModelTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "DeleteRegisteredModelTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteRegisteredModelTagResponse> transformer = DeleteRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelTagRequest, DeleteRegisteredModelTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteRegisteredModelTagRequest, DeleteRegisteredModelTagResponse>, java.util.concurrent.Future<DeleteRegisteredModelTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getDeleteRegisteredModelTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteRegisteredModelTagRequest, DeleteRegisteredModelTagResponse>(
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
    public java.util.concurrent.Future<GetExperimentByIdResponse> getExperimentById(GetExperimentByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetExperimentByIdRequest, GetExperimentByIdResponse> handler) {
        LOG.trace("Called async getExperimentById");
        final GetExperimentByIdRequest interceptedRequest = GetExperimentByIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetExperimentByIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetExperimentById", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExperimentByIdResponse> transformer = GetExperimentByIdConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetExperimentByIdRequest, GetExperimentByIdResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetExperimentByIdRequest, GetExperimentByIdResponse>, java.util.concurrent.Future<GetExperimentByIdResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetExperimentByIdRequest, GetExperimentByIdResponse>(
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
    public java.util.concurrent.Future<GetExperimentByNameResponse> getExperimentByName(GetExperimentByNameRequest request, final com.oracle.bmc.responses.AsyncHandler<GetExperimentByNameRequest, GetExperimentByNameResponse> handler) {
        LOG.trace("Called async getExperimentByName");
        final GetExperimentByNameRequest interceptedRequest = GetExperimentByNameConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetExperimentByNameConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetExperimentByName", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExperimentByNameResponse> transformer = GetExperimentByNameConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetExperimentByNameRequest, GetExperimentByNameResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetExperimentByNameRequest, GetExperimentByNameResponse>, java.util.concurrent.Future<GetExperimentByNameResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetExperimentByNameRequest, GetExperimentByNameResponse>(
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
    public java.util.concurrent.Future<GetExperimentRunByIdResponse> getExperimentRunById(GetExperimentRunByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetExperimentRunByIdRequest, GetExperimentRunByIdResponse> handler) {
        LOG.trace("Called async getExperimentRunById");
        final GetExperimentRunByIdRequest interceptedRequest = GetExperimentRunByIdConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetExperimentRunByIdConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetExperimentRunById", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExperimentRunByIdResponse> transformer = GetExperimentRunByIdConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetExperimentRunByIdRequest, GetExperimentRunByIdResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetExperimentRunByIdRequest, GetExperimentRunByIdResponse>, java.util.concurrent.Future<GetExperimentRunByIdResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetExperimentRunByIdRequest, GetExperimentRunByIdResponse>(
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
    public java.util.concurrent.Future<GetExperimentRunMetricHistoryResponse> getExperimentRunMetricHistory(GetExperimentRunMetricHistoryRequest request, final com.oracle.bmc.responses.AsyncHandler<GetExperimentRunMetricHistoryRequest, GetExperimentRunMetricHistoryResponse> handler) {
        LOG.trace("Called async getExperimentRunMetricHistory");
        final GetExperimentRunMetricHistoryRequest interceptedRequest = GetExperimentRunMetricHistoryConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetExperimentRunMetricHistoryConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetExperimentRunMetricHistory", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetExperimentRunMetricHistoryResponse> transformer = GetExperimentRunMetricHistoryConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetExperimentRunMetricHistoryRequest, GetExperimentRunMetricHistoryResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetExperimentRunMetricHistoryRequest, GetExperimentRunMetricHistoryResponse>, java.util.concurrent.Future<GetExperimentRunMetricHistoryResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetExperimentRunMetricHistoryRequest, GetExperimentRunMetricHistoryResponse>(
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
    public java.util.concurrent.Future<GetModelVersionResponse> getModelVersion(GetModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetModelVersionRequest, GetModelVersionResponse> handler) {
        LOG.trace("Called async getModelVersion");
        final GetModelVersionRequest interceptedRequest = GetModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetModelVersionResponse> transformer = GetModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetModelVersionRequest, GetModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetModelVersionRequest, GetModelVersionResponse>, java.util.concurrent.Future<GetModelVersionResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetModelVersionRequest, GetModelVersionResponse>(
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
    public java.util.concurrent.Future<GetRegisteredModelResponse> getRegisteredModel(GetRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<GetRegisteredModelRequest, GetRegisteredModelResponse> handler) {
        LOG.trace("Called async getRegisteredModel");
        final GetRegisteredModelRequest interceptedRequest = GetRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "GetRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetRegisteredModelResponse> transformer = GetRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetRegisteredModelRequest, GetRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetRegisteredModelRequest, GetRegisteredModelResponse>, java.util.concurrent.Future<GetRegisteredModelResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetRegisteredModelRequest, GetRegisteredModelResponse>(
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
    public java.util.concurrent.Future<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse> handler) {
        LOG.trace("Called async listArtifacts");
        final ListArtifactsRequest interceptedRequest = ListArtifactsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListArtifactsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListArtifacts", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListArtifactsResponse> transformer = ListArtifactsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse>, java.util.concurrent.Future<ListArtifactsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListArtifactsRequest, ListArtifactsResponse>(
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
    public java.util.concurrent.Future<ListExperimentRunsResponse> listExperimentRuns(ListExperimentRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListExperimentRunsRequest, ListExperimentRunsResponse> handler) {
        LOG.trace("Called async listExperimentRuns");
        final ListExperimentRunsRequest interceptedRequest = ListExperimentRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListExperimentRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListExperimentRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExperimentRunsResponse> transformer = ListExperimentRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListExperimentRunsRequest, ListExperimentRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListExperimentRunsRequest, ListExperimentRunsResponse>, java.util.concurrent.Future<ListExperimentRunsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListExperimentRunsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListExperimentRunsRequest, ListExperimentRunsResponse>(
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
    public java.util.concurrent.Future<ListExperimentsResponse> listExperiments(ListExperimentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListExperimentsRequest, ListExperimentsResponse> handler) {
        LOG.trace("Called async listExperiments");
        final ListExperimentsRequest interceptedRequest = ListExperimentsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListExperimentsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListExperiments", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListExperimentsResponse> transformer = ListExperimentsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListExperimentsRequest, ListExperimentsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListExperimentsRequest, ListExperimentsResponse>, java.util.concurrent.Future<ListExperimentsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListExperimentsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListExperimentsRequest, ListExperimentsResponse>(
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
    public java.util.concurrent.Future<ListLoggedModelsResponse> listLoggedModels(ListLoggedModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListLoggedModelsRequest, ListLoggedModelsResponse> handler) {
        LOG.trace("Called async listLoggedModels");
        final ListLoggedModelsRequest interceptedRequest = ListLoggedModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListLoggedModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListLoggedModels", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListLoggedModelsResponse> transformer = ListLoggedModelsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListLoggedModelsRequest, ListLoggedModelsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListLoggedModelsRequest, ListLoggedModelsResponse>, java.util.concurrent.Future<ListLoggedModelsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getListLoggedModelsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListLoggedModelsRequest, ListLoggedModelsResponse>(
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
    public java.util.concurrent.Future<ListModelVersionsResponse> listModelVersions(ListModelVersionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListModelVersionsRequest, ListModelVersionsResponse> handler) {
        LOG.trace("Called async listModelVersions");
        final ListModelVersionsRequest interceptedRequest = ListModelVersionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListModelVersionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListModelVersions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListModelVersionsResponse> transformer = ListModelVersionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListModelVersionsRequest, ListModelVersionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListModelVersionsRequest, ListModelVersionsResponse>, java.util.concurrent.Future<ListModelVersionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListModelVersionsRequest, ListModelVersionsResponse>(
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
    public java.util.concurrent.Future<ListRegisteredModelsResponse> listRegisteredModels(ListRegisteredModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListRegisteredModelsRequest, ListRegisteredModelsResponse> handler) {
        LOG.trace("Called async listRegisteredModels");
        final ListRegisteredModelsRequest interceptedRequest = ListRegisteredModelsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListRegisteredModelsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "ListRegisteredModels", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListRegisteredModelsResponse> transformer = ListRegisteredModelsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListRegisteredModelsRequest, ListRegisteredModelsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListRegisteredModelsRequest, ListRegisteredModelsResponse>, java.util.concurrent.Future<ListRegisteredModelsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListRegisteredModelsRequest, ListRegisteredModelsResponse>(
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
    public java.util.concurrent.Future<LogExperimentRunBatchResponse> logExperimentRunBatch(LogExperimentRunBatchRequest request, final com.oracle.bmc.responses.AsyncHandler<LogExperimentRunBatchRequest, LogExperimentRunBatchResponse> handler) {
        LOG.trace("Called async logExperimentRunBatch");
        final LogExperimentRunBatchRequest interceptedRequest = LogExperimentRunBatchConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogExperimentRunBatchConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogExperimentRunBatch", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogExperimentRunBatchResponse> transformer = LogExperimentRunBatchConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogExperimentRunBatchRequest, LogExperimentRunBatchResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogExperimentRunBatchRequest, LogExperimentRunBatchResponse>, java.util.concurrent.Future<LogExperimentRunBatchResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunBatchDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogExperimentRunBatchRequest, LogExperimentRunBatchResponse>(
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
    public java.util.concurrent.Future<LogExperimentRunInputsResponse> logExperimentRunInputs(LogExperimentRunInputsRequest request, final com.oracle.bmc.responses.AsyncHandler<LogExperimentRunInputsRequest, LogExperimentRunInputsResponse> handler) {
        LOG.trace("Called async logExperimentRunInputs");
        final LogExperimentRunInputsRequest interceptedRequest = LogExperimentRunInputsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogExperimentRunInputsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogExperimentRunInputs", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogExperimentRunInputsResponse> transformer = LogExperimentRunInputsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogExperimentRunInputsRequest, LogExperimentRunInputsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogExperimentRunInputsRequest, LogExperimentRunInputsResponse>, java.util.concurrent.Future<LogExperimentRunInputsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunInputsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogExperimentRunInputsRequest, LogExperimentRunInputsResponse>(
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
    public java.util.concurrent.Future<LogExperimentRunMetricResponse> logExperimentRunMetric(LogExperimentRunMetricRequest request, final com.oracle.bmc.responses.AsyncHandler<LogExperimentRunMetricRequest, LogExperimentRunMetricResponse> handler) {
        LOG.trace("Called async logExperimentRunMetric");
        final LogExperimentRunMetricRequest interceptedRequest = LogExperimentRunMetricConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogExperimentRunMetricConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogExperimentRunMetric", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogExperimentRunMetricResponse> transformer = LogExperimentRunMetricConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogExperimentRunMetricRequest, LogExperimentRunMetricResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogExperimentRunMetricRequest, LogExperimentRunMetricResponse>, java.util.concurrent.Future<LogExperimentRunMetricResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunMetricDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogExperimentRunMetricRequest, LogExperimentRunMetricResponse>(
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
    public java.util.concurrent.Future<LogExperimentRunModelResponse> logExperimentRunModel(LogExperimentRunModelRequest request, final com.oracle.bmc.responses.AsyncHandler<LogExperimentRunModelRequest, LogExperimentRunModelResponse> handler) {
        LOG.trace("Called async logExperimentRunModel");
        final LogExperimentRunModelRequest interceptedRequest = LogExperimentRunModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogExperimentRunModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogExperimentRunModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogExperimentRunModelResponse> transformer = LogExperimentRunModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogExperimentRunModelRequest, LogExperimentRunModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogExperimentRunModelRequest, LogExperimentRunModelResponse>, java.util.concurrent.Future<LogExperimentRunModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogExperimentRunModelRequest, LogExperimentRunModelResponse>(
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
    public java.util.concurrent.Future<LogExperimentRunParamResponse> logExperimentRunParam(LogExperimentRunParamRequest request, final com.oracle.bmc.responses.AsyncHandler<LogExperimentRunParamRequest, LogExperimentRunParamResponse> handler) {
        LOG.trace("Called async logExperimentRunParam");
        final LogExperimentRunParamRequest interceptedRequest = LogExperimentRunParamConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = LogExperimentRunParamConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "LogExperimentRunParam", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, LogExperimentRunParamResponse> transformer = LogExperimentRunParamConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<LogExperimentRunParamRequest, LogExperimentRunParamResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<LogExperimentRunParamRequest, LogExperimentRunParamResponse>, java.util.concurrent.Future<LogExperimentRunParamResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getLogExperimentRunParamDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<LogExperimentRunParamRequest, LogExperimentRunParamResponse>(
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
    public java.util.concurrent.Future<RenameRegisteredModelResponse> renameRegisteredModel(RenameRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameRegisteredModelRequest, RenameRegisteredModelResponse> handler) {
        LOG.trace("Called async renameRegisteredModel");
        final RenameRegisteredModelRequest interceptedRequest = RenameRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RenameRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RenameRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RenameRegisteredModelResponse> transformer = RenameRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RenameRegisteredModelRequest, RenameRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RenameRegisteredModelRequest, RenameRegisteredModelResponse>, java.util.concurrent.Future<RenameRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRenameRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RenameRegisteredModelRequest, RenameRegisteredModelResponse>(
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
    public java.util.concurrent.Future<RestoreExperimentResponse> restoreExperiment(RestoreExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRequest, RestoreExperimentResponse> handler) {
        LOG.trace("Called async restoreExperiment");
        final RestoreExperimentRequest interceptedRequest = RestoreExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RestoreExperimentResponse> transformer = RestoreExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRequest, RestoreExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRequest, RestoreExperimentResponse>, java.util.concurrent.Future<RestoreExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRestoreExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RestoreExperimentRequest, RestoreExperimentResponse>(
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
    public java.util.concurrent.Future<RestoreExperimentRunResponse> restoreExperimentRun(RestoreExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRunRequest, RestoreExperimentRunResponse> handler) {
        LOG.trace("Called async restoreExperimentRun");
        final RestoreExperimentRunRequest interceptedRequest = RestoreExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RestoreExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "RestoreExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RestoreExperimentRunResponse> transformer = RestoreExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRunRequest, RestoreExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RestoreExperimentRunRequest, RestoreExperimentRunResponse>, java.util.concurrent.Future<RestoreExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRestoreExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RestoreExperimentRunRequest, RestoreExperimentRunResponse>(
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
    public java.util.concurrent.Future<SetExperimentRunTagResponse> setExperimentRunTag(SetExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetExperimentRunTagRequest, SetExperimentRunTagResponse> handler) {
        LOG.trace("Called async setExperimentRunTag");
        final SetExperimentRunTagRequest interceptedRequest = SetExperimentRunTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetExperimentRunTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetExperimentRunTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetExperimentRunTagResponse> transformer = SetExperimentRunTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetExperimentRunTagRequest, SetExperimentRunTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetExperimentRunTagRequest, SetExperimentRunTagResponse>, java.util.concurrent.Future<SetExperimentRunTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetExperimentRunTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetExperimentRunTagRequest, SetExperimentRunTagResponse>(
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
    public java.util.concurrent.Future<SetExperimentTagResponse> setExperimentTag(SetExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetExperimentTagRequest, SetExperimentTagResponse> handler) {
        LOG.trace("Called async setExperimentTag");
        final SetExperimentTagRequest interceptedRequest = SetExperimentTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetExperimentTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetExperimentTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetExperimentTagResponse> transformer = SetExperimentTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetExperimentTagRequest, SetExperimentTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetExperimentTagRequest, SetExperimentTagResponse>, java.util.concurrent.Future<SetExperimentTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetExperimentTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetExperimentTagRequest, SetExperimentTagResponse>(
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
    public java.util.concurrent.Future<SetModelVersionTagResponse> setModelVersionTag(SetModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetModelVersionTagRequest, SetModelVersionTagResponse> handler) {
        LOG.trace("Called async setModelVersionTag");
        final SetModelVersionTagRequest interceptedRequest = SetModelVersionTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetModelVersionTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetModelVersionTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetModelVersionTagResponse> transformer = SetModelVersionTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetModelVersionTagRequest, SetModelVersionTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetModelVersionTagRequest, SetModelVersionTagResponse>, java.util.concurrent.Future<SetModelVersionTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetModelVersionTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetModelVersionTagRequest, SetModelVersionTagResponse>(
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
    public java.util.concurrent.Future<SetRegisteredModelTagResponse> setRegisteredModelTag(SetRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetRegisteredModelTagRequest, SetRegisteredModelTagResponse> handler) {
        LOG.trace("Called async setRegisteredModelTag");
        final SetRegisteredModelTagRequest interceptedRequest = SetRegisteredModelTagConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = SetRegisteredModelTagConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "SetRegisteredModelTag", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, SetRegisteredModelTagResponse> transformer = SetRegisteredModelTagConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<SetRegisteredModelTagRequest, SetRegisteredModelTagResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<SetRegisteredModelTagRequest, SetRegisteredModelTagResponse>, java.util.concurrent.Future<SetRegisteredModelTagResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getSetRegisteredModelTagDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<SetRegisteredModelTagRequest, SetRegisteredModelTagResponse>(
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
    public java.util.concurrent.Future<TransitionModelVersionStageResponse> transitionModelVersionStage(TransitionModelVersionStageRequest request, final com.oracle.bmc.responses.AsyncHandler<TransitionModelVersionStageRequest, TransitionModelVersionStageResponse> handler) {
        LOG.trace("Called async transitionModelVersionStage");
        final TransitionModelVersionStageRequest interceptedRequest = TransitionModelVersionStageConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = TransitionModelVersionStageConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "TransitionModelVersionStage", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, TransitionModelVersionStageResponse> transformer = TransitionModelVersionStageConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<TransitionModelVersionStageRequest, TransitionModelVersionStageResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<TransitionModelVersionStageRequest, TransitionModelVersionStageResponse>, java.util.concurrent.Future<TransitionModelVersionStageResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getTransitionModelVersionStageDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<TransitionModelVersionStageRequest, TransitionModelVersionStageResponse>(
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
    public java.util.concurrent.Future<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResponse> handler) {
        LOG.trace("Called async updateExperiment");
        final UpdateExperimentRequest interceptedRequest = UpdateExperimentConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateExperimentConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateExperiment", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExperimentResponse> transformer = UpdateExperimentConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRequest, UpdateExperimentResponse>, java.util.concurrent.Future<UpdateExperimentResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateExperimentRequest, UpdateExperimentResponse>(
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
    public java.util.concurrent.Future<UpdateExperimentRunResponse> updateExperimentRun(UpdateExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunRequest, UpdateExperimentRunResponse> handler) {
        LOG.trace("Called async updateExperimentRun");
        final UpdateExperimentRunRequest interceptedRequest = UpdateExperimentRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateExperimentRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateExperimentRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExperimentRunResponse> transformer = UpdateExperimentRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunRequest, UpdateExperimentRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunRequest, UpdateExperimentRunResponse>, java.util.concurrent.Future<UpdateExperimentRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateExperimentRunRequest, UpdateExperimentRunResponse>(
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
    public java.util.concurrent.Future<UpdateExperimentRunTagsResponse> updateExperimentRunTags(UpdateExperimentRunTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunTagsRequest, UpdateExperimentRunTagsResponse> handler) {
        LOG.trace("Called async updateExperimentRunTags");
        final UpdateExperimentRunTagsRequest interceptedRequest = UpdateExperimentRunTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateExperimentRunTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateExperimentRunTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExperimentRunTagsResponse> transformer = UpdateExperimentRunTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunTagsRequest, UpdateExperimentRunTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateExperimentRunTagsRequest, UpdateExperimentRunTagsResponse>, java.util.concurrent.Future<UpdateExperimentRunTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentRunTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateExperimentRunTagsRequest, UpdateExperimentRunTagsResponse>(
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
    public java.util.concurrent.Future<UpdateExperimentTagsResponse> updateExperimentTags(UpdateExperimentTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateExperimentTagsRequest, UpdateExperimentTagsResponse> handler) {
        LOG.trace("Called async updateExperimentTags");
        final UpdateExperimentTagsRequest interceptedRequest = UpdateExperimentTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateExperimentTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateExperimentTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateExperimentTagsResponse> transformer = UpdateExperimentTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateExperimentTagsRequest, UpdateExperimentTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateExperimentTagsRequest, UpdateExperimentTagsResponse>, java.util.concurrent.Future<UpdateExperimentTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateExperimentTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateExperimentTagsRequest, UpdateExperimentTagsResponse>(
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
    public java.util.concurrent.Future<UpdateModelVersionResponse> updateModelVersion(UpdateModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResponse> handler) {
        LOG.trace("Called async updateModelVersion");
        final UpdateModelVersionRequest interceptedRequest = UpdateModelVersionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateModelVersionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateModelVersion", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelVersionResponse> transformer = UpdateModelVersionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionRequest, UpdateModelVersionResponse>, java.util.concurrent.Future<UpdateModelVersionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateModelVersionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateModelVersionRequest, UpdateModelVersionResponse>(
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
    public java.util.concurrent.Future<UpdateModelVersionTagsResponse> updateModelVersionTags(UpdateModelVersionTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionTagsRequest, UpdateModelVersionTagsResponse> handler) {
        LOG.trace("Called async updateModelVersionTags");
        final UpdateModelVersionTagsRequest interceptedRequest = UpdateModelVersionTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateModelVersionTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateModelVersionTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateModelVersionTagsResponse> transformer = UpdateModelVersionTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionTagsRequest, UpdateModelVersionTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateModelVersionTagsRequest, UpdateModelVersionTagsResponse>, java.util.concurrent.Future<UpdateModelVersionTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateModelVersionTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateModelVersionTagsRequest, UpdateModelVersionTagsResponse>(
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
    public java.util.concurrent.Future<UpdateRegisteredModelResponse> updateRegisteredModel(UpdateRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelRequest, UpdateRegisteredModelResponse> handler) {
        LOG.trace("Called async updateRegisteredModel");
        final UpdateRegisteredModelRequest interceptedRequest = UpdateRegisteredModelConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateRegisteredModelConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateRegisteredModel", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRegisteredModelResponse> transformer = UpdateRegisteredModelConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelRequest, UpdateRegisteredModelResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelRequest, UpdateRegisteredModelResponse>, java.util.concurrent.Future<UpdateRegisteredModelResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateRegisteredModelDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateRegisteredModelRequest, UpdateRegisteredModelResponse>(
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
    public java.util.concurrent.Future<UpdateRegisteredModelTagsResponse> updateRegisteredModelTags(UpdateRegisteredModelTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelTagsRequest, UpdateRegisteredModelTagsResponse> handler) {
        LOG.trace("Called async updateRegisteredModelTags");
        final UpdateRegisteredModelTagsRequest interceptedRequest = UpdateRegisteredModelTagsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateRegisteredModelTagsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("MLOps", "UpdateRegisteredModelTags", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateRegisteredModelTagsResponse> transformer = UpdateRegisteredModelTagsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelTagsRequest, UpdateRegisteredModelTagsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateRegisteredModelTagsRequest, UpdateRegisteredModelTagsResponse>, java.util.concurrent.Future<UpdateRegisteredModelTagsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getUpdateRegisteredModelTagsDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateRegisteredModelTagsRequest, UpdateRegisteredModelTagsResponse>(
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
