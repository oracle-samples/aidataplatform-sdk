// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Notebook service. <br/>
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
public class NotebookAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements NotebookAsync {
    /**
     * Service instance for Notebook.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("NOTEBOOK").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(NotebookAsyncClient.class);

    NotebookAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NotebookAsyncClient> {
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
        public NotebookAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new NotebookAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateContentResponse> createContent(CreateContentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateContentRequest, CreateContentResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateSessionResponse> createSession(CreateSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateSessionRequest, CreateSessionResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteContentResponse> deleteContent(DeleteContentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteContentRequest, DeleteContentResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("Location", 
            DeleteContentResponse.Builder::location)
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteContentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteSessionResponse> deleteSession(DeleteSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteSessionRequest, DeleteSessionResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ExportContentsResponse> exportContents(ExportContentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ExportContentsRequest, ExportContentsResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedContents.class, ExportContentsResponse.Builder::exportedContents)
                .handleResponseHeaderString("etag", 
            ExportContentsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportContentsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetContentResponse> getContent(GetContentRequest request, final com.oracle.bmc.responses.AsyncHandler<GetContentRequest, GetContentResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, GetContentResponse.Builder::content)
                .handleResponseHeaderString("etag", 
            GetContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetContentResponse.Builder::opcRequestId)
                .handleResponseHeaderDate("Last-Modified", 
            GetContentResponse.Builder::lastModified)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetSessionResponse> getSession(GetSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetSessionRequest, GetSessionResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, GetSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            GetSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListSessionsResponse> listSessions(ListSessionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListSessionsRequest, ListSessionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SessionCollection.class, ListSessionsResponse.Builder::sessionCollection)
                .handleResponseHeaderString("etag", 
            ListSessionsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ListSessionsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ModifyContentResponse> modifyContent(ModifyContentRequest request, final com.oracle.bmc.responses.AsyncHandler<ModifyContentRequest, ModifyContentResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PatchSessionResponse> patchSession(PatchSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<PatchSessionRequest, PatchSessionResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, PatchSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            PatchSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PatchSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateContentResponse> updateContent(UpdateContentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateContentRequest, UpdateContentResponse> handler) {
                
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
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public NotebookAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public NotebookAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public NotebookAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public NotebookAsyncClient(
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
    public NotebookAsyncClient (
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
    public NotebookAsyncClient (
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
    public NotebookAsyncClient (
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
