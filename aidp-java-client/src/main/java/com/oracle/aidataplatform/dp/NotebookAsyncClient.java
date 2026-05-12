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
    
    public java.util.concurrent.Future<CreateAiDataPlatformContentResponse> createAiDataPlatformContent(CreateAiDataPlatformContentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformContentRequest, CreateAiDataPlatformContentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getCreateContentDetails(), "createContentDetails is required");
        


return clientCall(request, CreateAiDataPlatformContentResponse::builder)
        .logger(LOG, "createAiDataPlatformContent")
        .serviceDetails("Notebook", "CreateAiDataPlatformContent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("datalake-tenant-id", request.getDatalakeTenantId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, CreateAiDataPlatformContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            CreateAiDataPlatformContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformContentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformSessionResponse> createAiDataPlatformSession(CreateAiDataPlatformSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformSessionRequest, CreateAiDataPlatformSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateSessionDetails(), "createSessionDetails is required");
        


return clientCall(request, CreateAiDataPlatformSessionResponse::builder)
        .logger(LOG, "createAiDataPlatformSession")
        .serviceDetails("Notebook", "CreateAiDataPlatformSession", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("datalake-tenant-id", request.getDatalakeTenantId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, CreateAiDataPlatformSessionResponse.Builder::session)
                .handleResponseHeaderString("Location", 
            CreateAiDataPlatformSessionResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformSessionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformSessionResponse.Builder::opcWorkRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformContentResponse> deleteAiDataPlatformContent(DeleteAiDataPlatformContentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformContentRequest, DeleteAiDataPlatformContentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");


return clientCall(request, DeleteAiDataPlatformContentResponse::builder)
        .logger(LOG, "deleteAiDataPlatformContent")
        .serviceDetails("Notebook", "DeleteAiDataPlatformContent", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        
        
                .handleResponseHeaderString("Location", 
            DeleteAiDataPlatformContentResponse.Builder::location)
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformContentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformSessionResponse> deleteAiDataPlatformSession(DeleteAiDataPlatformSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformSessionRequest, DeleteAiDataPlatformSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, DeleteAiDataPlatformSessionResponse::builder)
        .logger(LOG, "deleteAiDataPlatformSession")
        .serviceDetails("Notebook", "DeleteAiDataPlatformSession", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ExportAiDataPlatformContentsResponse> exportAiDataPlatformContents(ExportAiDataPlatformContentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformContentsRequest, ExportAiDataPlatformContentsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getExportContentsDetails(), "exportContentsDetails is required");
        


return clientCall(request, ExportAiDataPlatformContentsResponse::builder)
        .logger(LOG, "exportAiDataPlatformContents")
        .serviceDetails("Notebook", "ExportAiDataPlatformContents", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ExportAiDataPlatformContentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("actions").appendPathParam("export").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedContents.class, ExportAiDataPlatformContentsResponse.Builder::exportedContents)
                .handleResponseHeaderString("etag", 
            ExportAiDataPlatformContentsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportAiDataPlatformContentsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformContentResponse> getAiDataPlatformContent(GetAiDataPlatformContentRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformContentRequest, GetAiDataPlatformContentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");


return clientCall(request, GetAiDataPlatformContentResponse::builder)
        .logger(LOG, "getAiDataPlatformContent")
        .serviceDetails("Notebook", "GetAiDataPlatformContent", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
            
                
                    .appendEnumQueryParam("type", request.getType())
                    
            
                
                    .appendEnumQueryParam("format", request.getFormat())
                    
            
                
                    
                    .appendQueryParam("content", request.getContent())
            
                
                    
                    .appendQueryParam("hash", request.getHash())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, GetAiDataPlatformContentResponse.Builder::content)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformContentResponse.Builder::opcRequestId)
                .handleResponseHeaderDate("Last-Modified", 
            GetAiDataPlatformContentResponse.Builder::lastModified)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformSessionResponse> getAiDataPlatformSession(GetAiDataPlatformSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformSessionRequest, GetAiDataPlatformSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, GetAiDataPlatformSessionResponse::builder)
        .logger(LOG, "getAiDataPlatformSession")
        .serviceDetails("Notebook", "GetAiDataPlatformSession", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, GetAiDataPlatformSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformSessionsResponse> listAiDataPlatformSessions(ListAiDataPlatformSessionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSessionsRequest, ListAiDataPlatformSessionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAiDataPlatformSessionsResponse::builder)
        .logger(LOG, "listAiDataPlatformSessions")
        .serviceDetails("Notebook", "ListAiDataPlatformSessions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformSessionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions")
            
                
                    
                    .appendQueryParam("cluster_id", request.getClusterId())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("agentFlowKey", request.getAgentFlowKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SessionCollection.class, ListAiDataPlatformSessionsResponse.Builder::sessionCollection)
                .handleResponseHeaderString("etag", 
            ListAiDataPlatformSessionsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSessionsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ModifyAiDataPlatformContentResponse> modifyAiDataPlatformContent(ModifyAiDataPlatformContentRequest request, final com.oracle.bmc.responses.AsyncHandler<ModifyAiDataPlatformContentRequest, ModifyAiDataPlatformContentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getModifyContentDetails(), "modifyContentDetails is required");
        


return clientCall(request, ModifyAiDataPlatformContentResponse::builder)
        .logger(LOG, "modifyAiDataPlatformContent")
        .serviceDetails("Notebook", "ModifyAiDataPlatformContent", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(ModifyAiDataPlatformContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, ModifyAiDataPlatformContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            ModifyAiDataPlatformContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            ModifyAiDataPlatformContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            ModifyAiDataPlatformContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            ModifyAiDataPlatformContentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PatchAiDataPlatformSessionResponse> patchAiDataPlatformSession(PatchAiDataPlatformSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<PatchAiDataPlatformSessionRequest, PatchAiDataPlatformSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");
        Objects.requireNonNull(request.getPatchSessionDetails(), "patchSessionDetails is required");
        


return clientCall(request, PatchAiDataPlatformSessionResponse::builder)
        .logger(LOG, "patchAiDataPlatformSession")
        .serviceDetails("Notebook", "PatchAiDataPlatformSession", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(PatchAiDataPlatformSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, PatchAiDataPlatformSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            PatchAiDataPlatformSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PatchAiDataPlatformSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformContentResponse> updateAiDataPlatformContent(UpdateAiDataPlatformContentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformContentRequest, UpdateAiDataPlatformContentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getContentPath(), "contentPath must not be blank");
        Objects.requireNonNull(request.getUpdateContentDetails(), "updateContentDetails is required");
        


return clientCall(request, UpdateAiDataPlatformContentResponse::builder)
        .logger(LOG, "updateAiDataPlatformContent")
        .serviceDetails("Notebook", "UpdateAiDataPlatformContent", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformContentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("notebook").appendPathParam("api").appendPathParam("contents").appendPathParam(request.getContentPath())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, UpdateAiDataPlatformContentResponse.Builder::content)
                .handleResponseHeaderString("Location", 
            UpdateAiDataPlatformContentResponse.Builder::location)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateAiDataPlatformContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformContentResponse.Builder::opcRequestId)
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
