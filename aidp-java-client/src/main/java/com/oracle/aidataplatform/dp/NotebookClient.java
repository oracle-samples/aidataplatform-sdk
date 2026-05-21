// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class NotebookClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Notebook {
    /**
     * Service instance for Notebook.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("NOTEBOOK").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(NotebookClient.class);


    private final NotebookWaiters waiters;

    NotebookClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            , java.util.concurrent.ExecutorService executorService) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("Notebook-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new NotebookWaiters(executorService, this);
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NotebookClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
        * Set the ExecutorService for the client to be created.
        * @param executorService executorService
        * @return this builder
        */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
        return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public NotebookClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new NotebookClient(this, authenticationDetailsProvider, executorService);
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
    
    public CreateContentResponse createContent(CreateContentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getCreateContentDetails(), "createContentDetails is required");
        


return clientCall(request, CreateContentResponse::builder)
        .logger(LOG, "createContent")
        .serviceDetails("Notebook", "CreateContent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("datalake-tenant-id", request.getDatalakeTenantId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, CreateContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            CreateContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            CreateContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateContentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateSessionResponse createSession(CreateSessionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateSessionDetails(), "createSessionDetails is required");
        


return clientCall(request, CreateSessionResponse::builder)
        .logger(LOG, "createSession")
        .serviceDetails("Notebook", "CreateSession", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("datalake-tenant-id", request.getDatalakeTenantId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, CreateSessionResponse.Builder::session)
                .handleResponseHeaderString("Location", 
            CreateSessionResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            CreateSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateSessionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateSessionResponse.Builder::opcWorkRequestId)

                .callSync();
    }

    @Override
    
    public DeleteContentResponse deleteContent(DeleteContentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");


return clientCall(request, DeleteContentResponse::builder)
        .logger(LOG, "deleteContent")
        .serviceDetails("Notebook", "DeleteContent", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("Location", 
            DeleteContentResponse.Builder::location)
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteContentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteSessionResponse deleteSession(DeleteSessionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, DeleteSessionResponse::builder)
        .logger(LOG, "deleteSession")
        .serviceDetails("Notebook", "DeleteSession", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ExportContentsResponse exportContents(ExportContentsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getExportContentsDetails(), "exportContentsDetails is required");
        


return clientCall(request, ExportContentsResponse::builder)
        .logger(LOG, "exportContents")
        .serviceDetails("Notebook", "ExportContents", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ExportContentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("actions").appendPathParam("export").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedContents.class, ExportContentsResponse.Builder::exportedContents)
                .handleResponseHeaderString("etag", 
            ExportContentsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportContentsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetContentResponse getContent(GetContentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");


return clientCall(request, GetContentResponse::builder)
        .logger(LOG, "getContent")
        .serviceDetails("Notebook", "GetContent", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
            
                
                    .appendEnumQueryParam("type", request.getType())
                    
            
                
                    .appendEnumQueryParam("format", request.getFormat())
                    
            
                
                    
                    .appendQueryParam("content", request.getContent())
            
                
                    
                    .appendQueryParam("hash", request.getHash())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, GetContentResponse.Builder::content)
                .handleResponseHeaderString("etag", 
            GetContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetContentResponse.Builder::opcRequestId)
                .handleResponseHeaderDate("Last-Modified", 
            GetContentResponse.Builder::lastModified)

                .callSync();
    }

    @Override
    
    public GetSessionResponse getSession(GetSessionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, GetSessionResponse::builder)
        .logger(LOG, "getSession")
        .serviceDetails("Notebook", "GetSession", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, GetSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            GetSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListSessionsResponse listSessions(ListSessionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListSessionsResponse::builder)
        .logger(LOG, "listSessions")
        .serviceDetails("Notebook", "ListSessions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListSessionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions")
            
                
                    
                    .appendQueryParam("cluster_id", request.getClusterId())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("agentFlowKey", request.getAgentFlowKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SessionCollection.class, ListSessionsResponse.Builder::sessionCollection)
                .handleResponseHeaderString("etag", 
            ListSessionsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ListSessionsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ModifyContentResponse modifyContent(ModifyContentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getModifyContentDetails(), "modifyContentDetails is required");
        


return clientCall(request, ModifyContentResponse::builder)
        .logger(LOG, "modifyContent")
        .serviceDetails("Notebook", "ModifyContent", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(ModifyContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, ModifyContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            ModifyContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            ModifyContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            ModifyContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            ModifyContentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PatchSessionResponse patchSession(PatchSessionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");
        Objects.requireNonNull(request.getPatchSessionDetails(), "patchSessionDetails is required");
        


return clientCall(request, PatchSessionResponse::builder)
        .logger(LOG, "patchSession")
        .serviceDetails("Notebook", "PatchSession", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(PatchSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, PatchSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            PatchSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PatchSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateContentResponse updateContent(UpdateContentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getUpdateContentDetails(), "updateContentDetails is required");
        


return clientCall(request, UpdateContentResponse::builder)
        .logger(LOG, "updateContent")
        .serviceDetails("Notebook", "UpdateContent", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, UpdateContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            UpdateContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            UpdateContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateContentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    public NotebookWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotebookClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider,
            null
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
    public NotebookClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider,
            null
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
    public NotebookClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider,
            null
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
    public NotebookClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider,
            null
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
    public NotebookClient(
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
            authenticationDetailsProvider,
            null
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
    public NotebookClient(
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
            authenticationDetailsProvider,
            null
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
    public NotebookClient(
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
            authenticationDetailsProvider,
            null
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotebookClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider,
            executorService
        );
    }
}
