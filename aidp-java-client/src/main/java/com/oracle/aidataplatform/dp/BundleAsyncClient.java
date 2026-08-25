// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Bundle service. <br/>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class BundleAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements BundleAsync {
    /**
     * Service instance for Bundle.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("BUNDLE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(BundleAsyncClient.class);

    BundleAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(
            builder,
            authenticationDetailsProvider
        );
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, BundleAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public BundleAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new BundleAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    
    public java.util.concurrent.Future<CreateBundleResponse> createBundle(CreateBundleRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateBundleRequest, CreateBundleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateBundleDetails(), "createBundleDetails is required");
        


return clientCall(request, CreateBundleResponse::builder)
        .logger(LOG, "createBundle")
        .serviceDetails("Bundle", "CreateBundle", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateBundleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("bundles")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            CreateBundleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateBundleResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateBundleActionResponse> createBundleAction(CreateBundleActionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateBundleActionRequest, CreateBundleActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateBundleDetails(), "createBundleDetails is required");
        


return clientCall(request, CreateBundleActionResponse::builder)
        .logger(LOG, "createBundleAction")
        .serviceDetails("Bundle", "CreateBundleAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateBundleActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("createBundle")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            CreateBundleActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateBundleActionResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeployBundleResponse> deployBundle(DeployBundleRequest request, final com.oracle.bmc.responses.AsyncHandler<DeployBundleRequest, DeployBundleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeployBundleDetails(), "deployBundleDetails is required");
        


return clientCall(request, DeployBundleResponse::builder)
        .logger(LOG, "deployBundle")
        .serviceDetails("Bundle", "DeployBundle", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeployBundleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("bundles").appendPathParam("actions").appendPathParam("deploy")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            DeployBundleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeployBundleResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeployBundleActionResponse> deployBundleAction(DeployBundleActionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeployBundleActionRequest, DeployBundleActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeployBundleDetails(), "deployBundleDetails is required");
        


return clientCall(request, DeployBundleActionResponse::builder)
        .logger(LOG, "deployBundleAction")
        .serviceDetails("Bundle", "DeployBundleAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeployBundleActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("deployBundle")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            DeployBundleActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeployBundleActionResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<FetchBundleDeploymentStatusResponse> fetchBundleDeploymentStatus(FetchBundleDeploymentStatusRequest request, final com.oracle.bmc.responses.AsyncHandler<FetchBundleDeploymentStatusRequest, FetchBundleDeploymentStatusResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getFetchBundleDeploymentStatusDetails(), "fetchBundleDeploymentStatusDetails is required");
        


return clientCall(request, FetchBundleDeploymentStatusResponse::builder)
        .logger(LOG, "fetchBundleDeploymentStatus")
        .serviceDetails("Bundle", "FetchBundleDeploymentStatus", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(FetchBundleDeploymentStatusRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("bundles").appendPathParam("actions").appendPathParam("getDeploymentStatus")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.BundleDeploymentStatus.class, FetchBundleDeploymentStatusResponse.Builder::bundleDeploymentStatus)
                .handleResponseHeaderString("opc-request-id", 
            FetchBundleDeploymentStatusResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<FetchBundleDeploymentStatusActionResponse> fetchBundleDeploymentStatusAction(FetchBundleDeploymentStatusActionRequest request, final com.oracle.bmc.responses.AsyncHandler<FetchBundleDeploymentStatusActionRequest, FetchBundleDeploymentStatusActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getFetchBundleDeploymentStatusDetails(), "fetchBundleDeploymentStatusDetails is required");
        


return clientCall(request, FetchBundleDeploymentStatusActionResponse::builder)
        .logger(LOG, "fetchBundleDeploymentStatusAction")
        .serviceDetails("Bundle", "FetchBundleDeploymentStatusAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(FetchBundleDeploymentStatusActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("getBundleDeploymentStatus")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.BundleDeploymentStatus.class, FetchBundleDeploymentStatusActionResponse.Builder::bundleDeploymentStatus)
                .handleResponseHeaderString("opc-request-id", 
            FetchBundleDeploymentStatusActionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<FetchBundlePublishStatusActionResponse> fetchBundlePublishStatusAction(FetchBundlePublishStatusActionRequest request, final com.oracle.bmc.responses.AsyncHandler<FetchBundlePublishStatusActionRequest, FetchBundlePublishStatusActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getFetchBundlePublishStatusDetails(), "fetchBundlePublishStatusDetails is required");
        


return clientCall(request, FetchBundlePublishStatusActionResponse::builder)
        .logger(LOG, "fetchBundlePublishStatusAction")
        .serviceDetails("Bundle", "FetchBundlePublishStatusAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(FetchBundlePublishStatusActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("getBundlePublishStatus")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.BundlePublishStatus.class, FetchBundlePublishStatusActionResponse.Builder::bundlePublishStatus)
                .handleResponseHeaderString("opc-request-id", 
            FetchBundlePublishStatusActionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PublishBundleActionResponse> publishBundleAction(PublishBundleActionRequest request, final com.oracle.bmc.responses.AsyncHandler<PublishBundleActionRequest, PublishBundleActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPublishBundleDetails(), "publishBundleDetails is required");
        


return clientCall(request, PublishBundleActionResponse::builder)
        .logger(LOG, "publishBundleAction")
        .serviceDetails("Bundle", "PublishBundleAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PublishBundleActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("publishBundle")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            PublishBundleActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PublishBundleActionResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PurgeBundleResponse> purgeBundle(PurgeBundleRequest request, final com.oracle.bmc.responses.AsyncHandler<PurgeBundleRequest, PurgeBundleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPurgeBundleDetails(), "purgeBundleDetails is required");
        


return clientCall(request, PurgeBundleResponse::builder)
        .logger(LOG, "purgeBundle")
        .serviceDetails("Bundle", "PurgeBundle", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PurgeBundleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("bundles").appendPathParam("actions").appendPathParam("purge")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            PurgeBundleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PurgeBundleResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PurgeBundleActionResponse> purgeBundleAction(PurgeBundleActionRequest request, final com.oracle.bmc.responses.AsyncHandler<PurgeBundleActionRequest, PurgeBundleActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPurgeBundleDetails(), "purgeBundleDetails is required");
        


return clientCall(request, PurgeBundleActionResponse::builder)
        .logger(LOG, "purgeBundleAction")
        .serviceDetails("Bundle", "PurgeBundleAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PurgeBundleActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("purgeBundle")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            PurgeBundleActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PurgeBundleActionResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SyncBundleResponse> syncBundle(SyncBundleRequest request, final com.oracle.bmc.responses.AsyncHandler<SyncBundleRequest, SyncBundleResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSyncBundleDetails(), "syncBundleDetails is required");
        


return clientCall(request, SyncBundleResponse::builder)
        .logger(LOG, "syncBundle")
        .serviceDetails("Bundle", "SyncBundle", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SyncBundleRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("bundles").appendPathParam("actions").appendPathParam("sync")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            SyncBundleResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            SyncBundleResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SyncBundleActionResponse> syncBundleAction(SyncBundleActionRequest request, final com.oracle.bmc.responses.AsyncHandler<SyncBundleActionRequest, SyncBundleActionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSyncBundleDetails(), "syncBundleDetails is required");
        


return clientCall(request, SyncBundleActionResponse::builder)
        .logger(LOG, "syncBundleAction")
        .serviceDetails("Bundle", "SyncBundleAction", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SyncBundleActionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("syncBundle")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            SyncBundleActionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            SyncBundleActionResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider
        );
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient(
        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
        com.oracle.bmc.ClientConfiguration configuration,
        com.oracle.bmc.http.ClientConfigurator clientConfigurator,
        com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient (
        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
        com.oracle.bmc.ClientConfiguration configuration,
        com.oracle.bmc.http.ClientConfigurator clientConfigurator,
        com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
        java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient (
        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
        com.oracle.bmc.ClientConfiguration configuration,
        com.oracle.bmc.http.ClientConfigurator clientConfigurator,
        com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
        java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
        String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public BundleAsyncClient (
        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
        com.oracle.bmc.ClientConfiguration configuration,
        com.oracle.bmc.http.ClientConfigurator clientConfigurator,
        com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
        java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
        java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
        String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider
        );
    }
}
