package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.internal.http.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
* Async client implementation for Workflow service. <br/>
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
public class WorkflowAsyncClient implements WorkflowAsync {
    /**
     * Service instance for Workflow.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKFLOW").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkflowAsyncClient.class);

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
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(authenticationDetailsProvider, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     */
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(authenticationDetailsProvider, configuration, null);
    }
    
    /**
     * Creates a new service instance using the given authentication provider and client configuration.  Additionally,
     * a Consumer can be provided that will be invoked whenever a REST Client is created to allow for additional configuration/customization.
     * @param authenticationDetailsProvider The authentication details provider, required.
     * @param configuration The client configuration, optional.
     * @param clientConfigurator ClientConfigurator that will be invoked for additional configuration of a REST client, optional.
     */
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkflowAsyncClient(
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
    public WorkflowAsyncClient (
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
    public WorkflowAsyncClient (
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
    public WorkflowAsyncClient (
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
    public WorkflowAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkflowAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
    public WorkflowAsyncClient build(@javax.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        if (authenticationDetailsProvider == null) {
            throw new NullPointerException("authenticationDetailsProvider is marked non-null but is null");
        }
        return new WorkflowAsyncClient(authenticationDetailsProvider,
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
    public java.util.concurrent.Future<CancelAiDataPlatformJobRunResponse> cancelAiDataPlatformJobRun(CancelAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse> handler) {
        LOG.trace("Called async cancelAiDataPlatformJobRun");
        final CancelAiDataPlatformJobRunRequest interceptedRequest = CancelAiDataPlatformJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CancelAiDataPlatformJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "CancelAiDataPlatformJobRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelAiDataPlatformJobRunResponse> transformer = CancelAiDataPlatformJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse>, java.util.concurrent.Future<CancelAiDataPlatformJobRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse>(
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
    public java.util.concurrent.Future<CancelAiDataPlatformJobRunsResponse> cancelAiDataPlatformJobRuns(CancelAiDataPlatformJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse> handler) {
        LOG.trace("Called async cancelAiDataPlatformJobRuns");
        final CancelAiDataPlatformJobRunsRequest interceptedRequest = CancelAiDataPlatformJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CancelAiDataPlatformJobRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "CancelAiDataPlatformJobRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CancelAiDataPlatformJobRunsResponse> transformer = CancelAiDataPlatformJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse>, java.util.concurrent.Future<CancelAiDataPlatformJobRunsResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformJobResponse> createAiDataPlatformJob(CreateAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse> handler) {
        LOG.trace("Called async createAiDataPlatformJob");
        final CreateAiDataPlatformJobRequest interceptedRequest = CreateAiDataPlatformJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "CreateAiDataPlatformJob", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformJobResponse> transformer = CreateAiDataPlatformJobConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse>, java.util.concurrent.Future<CreateAiDataPlatformJobResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateJobDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse>(
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
    public java.util.concurrent.Future<CreateAiDataPlatformJobRunResponse> createAiDataPlatformJobRun(CreateAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse> handler) {
        LOG.trace("Called async createAiDataPlatformJobRun");
        final CreateAiDataPlatformJobRunRequest interceptedRequest = CreateAiDataPlatformJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = CreateAiDataPlatformJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "CreateAiDataPlatformJobRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, CreateAiDataPlatformJobRunResponse> transformer = CreateAiDataPlatformJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse>, java.util.concurrent.Future<CreateAiDataPlatformJobRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getCreateJobRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformJobResponse> deleteAiDataPlatformJob(DeleteAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformJob");
        final DeleteAiDataPlatformJobRequest interceptedRequest = DeleteAiDataPlatformJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "DeleteAiDataPlatformJob", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformJobResponse> transformer = DeleteAiDataPlatformJobConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse>, java.util.concurrent.Future<DeleteAiDataPlatformJobResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse>(
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
    public java.util.concurrent.Future<DeleteAiDataPlatformJobRunResponse> deleteAiDataPlatformJobRun(DeleteAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse> handler) {
        LOG.trace("Called async deleteAiDataPlatformJobRun");
        final DeleteAiDataPlatformJobRunRequest interceptedRequest = DeleteAiDataPlatformJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = DeleteAiDataPlatformJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "DeleteAiDataPlatformJobRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, DeleteAiDataPlatformJobRunResponse> transformer = DeleteAiDataPlatformJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse>, java.util.concurrent.Future<DeleteAiDataPlatformJobRunResponse>> futureSupplier =
        client.deleteFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse>(
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
    public java.util.concurrent.Future<ExportAiDataPlatformTaskRunOutputResponse> exportAiDataPlatformTaskRunOutput(ExportAiDataPlatformTaskRunOutputRequest request, final com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse> handler) {
        LOG.trace("Called async exportAiDataPlatformTaskRunOutput");
        final ExportAiDataPlatformTaskRunOutputRequest interceptedRequest = ExportAiDataPlatformTaskRunOutputConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ExportAiDataPlatformTaskRunOutputConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ExportAiDataPlatformTaskRunOutput", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ExportAiDataPlatformTaskRunOutputResponse> transformer = ExportAiDataPlatformTaskRunOutputConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse>, java.util.concurrent.Future<ExportAiDataPlatformTaskRunOutputResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getExportTaskRunOutputDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse>(
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
    public java.util.concurrent.Future<FetchAiDataPlatformOutputResponse> fetchAiDataPlatformOutput(FetchAiDataPlatformOutputRequest request, final com.oracle.bmc.responses.AsyncHandler<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse> handler) {
        LOG.trace("Called async fetchAiDataPlatformOutput");
        final FetchAiDataPlatformOutputRequest interceptedRequest = FetchAiDataPlatformOutputConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = FetchAiDataPlatformOutputConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "FetchAiDataPlatformOutput", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, FetchAiDataPlatformOutputResponse> transformer = FetchAiDataPlatformOutputConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse>, java.util.concurrent.Future<FetchAiDataPlatformOutputResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getFetchOutputDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformJobResponse> getAiDataPlatformJob(GetAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse> handler) {
        LOG.trace("Called async getAiDataPlatformJob");
        final GetAiDataPlatformJobRequest interceptedRequest = GetAiDataPlatformJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "GetAiDataPlatformJob", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformJobResponse> transformer = GetAiDataPlatformJobConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse>, java.util.concurrent.Future<GetAiDataPlatformJobResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformJobRunResponse> getAiDataPlatformJobRun(GetAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse> handler) {
        LOG.trace("Called async getAiDataPlatformJobRun");
        final GetAiDataPlatformJobRunRequest interceptedRequest = GetAiDataPlatformJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "GetAiDataPlatformJobRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformJobRunResponse> transformer = GetAiDataPlatformJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse>, java.util.concurrent.Future<GetAiDataPlatformJobRunResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse>(
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
    public java.util.concurrent.Future<GetAiDataPlatformTaskRunResponse> getAiDataPlatformTaskRun(GetAiDataPlatformTaskRunRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse> handler) {
        LOG.trace("Called async getAiDataPlatformTaskRun");
        final GetAiDataPlatformTaskRunRequest interceptedRequest = GetAiDataPlatformTaskRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = GetAiDataPlatformTaskRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "GetAiDataPlatformTaskRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, GetAiDataPlatformTaskRunResponse> transformer = GetAiDataPlatformTaskRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse>, java.util.concurrent.Future<GetAiDataPlatformTaskRunResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformJobPermissionsResponse> listAiDataPlatformJobPermissions(ListAiDataPlatformJobPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformJobPermissions");
        final ListAiDataPlatformJobPermissionsRequest interceptedRequest = ListAiDataPlatformJobPermissionsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformJobPermissionsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ListAiDataPlatformJobPermissions", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformJobPermissionsResponse> transformer = ListAiDataPlatformJobPermissionsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse>, java.util.concurrent.Future<ListAiDataPlatformJobPermissionsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformJobRunsResponse> listAiDataPlatformJobRuns(ListAiDataPlatformJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformJobRuns");
        final ListAiDataPlatformJobRunsRequest interceptedRequest = ListAiDataPlatformJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformJobRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ListAiDataPlatformJobRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformJobRunsResponse> transformer = ListAiDataPlatformJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse>, java.util.concurrent.Future<ListAiDataPlatformJobRunsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformJobsResponse> listAiDataPlatformJobs(ListAiDataPlatformJobsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformJobs");
        final ListAiDataPlatformJobsRequest interceptedRequest = ListAiDataPlatformJobsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformJobsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ListAiDataPlatformJobs", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformJobsResponse> transformer = ListAiDataPlatformJobsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse>, java.util.concurrent.Future<ListAiDataPlatformJobsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformRecentJobRunsResponse> listAiDataPlatformRecentJobRuns(ListAiDataPlatformRecentJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformRecentJobRuns");
        final ListAiDataPlatformRecentJobRunsRequest interceptedRequest = ListAiDataPlatformRecentJobRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformRecentJobRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ListAiDataPlatformRecentJobRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformRecentJobRunsResponse> transformer = ListAiDataPlatformRecentJobRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse>, java.util.concurrent.Future<ListAiDataPlatformRecentJobRunsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse>(
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
    public java.util.concurrent.Future<ListAiDataPlatformTaskRunsResponse> listAiDataPlatformTaskRuns(ListAiDataPlatformTaskRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse> handler) {
        LOG.trace("Called async listAiDataPlatformTaskRuns");
        final ListAiDataPlatformTaskRunsRequest interceptedRequest = ListAiDataPlatformTaskRunsConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ListAiDataPlatformTaskRunsConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ListAiDataPlatformTaskRuns", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ListAiDataPlatformTaskRunsResponse> transformer = ListAiDataPlatformTaskRunsConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse>, java.util.concurrent.Future<ListAiDataPlatformTaskRunsResponse>> futureSupplier =
        client.getFutureSupplier(interceptedRequest, ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse>(
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
    public java.util.concurrent.Future<ManageAiDataPlatformJobPermissionResponse> manageAiDataPlatformJobPermission(ManageAiDataPlatformJobPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse> handler) {
        LOG.trace("Called async manageAiDataPlatformJobPermission");
        final ManageAiDataPlatformJobPermissionRequest interceptedRequest = ManageAiDataPlatformJobPermissionConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = ManageAiDataPlatformJobPermissionConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "ManageAiDataPlatformJobPermission", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, ManageAiDataPlatformJobPermissionResponse> transformer = ManageAiDataPlatformJobPermissionConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse>, java.util.concurrent.Future<ManageAiDataPlatformJobPermissionResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getManageJobPermissionDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse>(
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
    public java.util.concurrent.Future<RepairAiDataPlatformJobRunResponse> repairAiDataPlatformJobRun(RepairAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse> handler) {
        LOG.trace("Called async repairAiDataPlatformJobRun");
        final RepairAiDataPlatformJobRunRequest interceptedRequest = RepairAiDataPlatformJobRunConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = RepairAiDataPlatformJobRunConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.http.internal.RetryTokenUtils.addRetryToken(ib);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "RepairAiDataPlatformJobRun", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, RepairAiDataPlatformJobRunResponse> transformer = RepairAiDataPlatformJobRunConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse>, java.util.concurrent.Future<RepairAiDataPlatformJobRunResponse>> futureSupplier =
        client.postFutureSupplier(interceptedRequest, interceptedRequest.getRepairJobRunDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse>(
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
    public java.util.concurrent.Future<UpdateAiDataPlatformJobResponse> updateAiDataPlatformJob(UpdateAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse> handler) {
        LOG.trace("Called async updateAiDataPlatformJob");
        final UpdateAiDataPlatformJobRequest interceptedRequest = UpdateAiDataPlatformJobConverter.interceptRequest(request);
        final com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = UpdateAiDataPlatformJobConverter.fromRequest(client, interceptedRequest);
        com.oracle.bmc.ServiceDetails serviceDetails = new com.oracle.bmc.ServiceDetails("Workflow", "UpdateAiDataPlatformJob", ib.getRequestUri().toString(), "");
        final java.util.function.Function<javax.ws.rs.core.Response, UpdateAiDataPlatformJobResponse> transformer = UpdateAiDataPlatformJobConverter.fromResponse(java.util.Optional.of(serviceDetails)
        );
        com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse> handlerToUse = handler;

        java.util.function.Function<com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse>, java.util.concurrent.Future<UpdateAiDataPlatformJobResponse>> futureSupplier =
        client.putFutureSupplier(interceptedRequest, interceptedRequest.getUpdateJobDetails(), ib, transformer);

        if (this.authenticationDetailsProvider instanceof com.oracle.bmc.auth.RefreshableOnNotAuthenticatedProvider) {
            return new com.oracle.bmc.util.internal.RefreshAuthTokenWrapper<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse>(
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
