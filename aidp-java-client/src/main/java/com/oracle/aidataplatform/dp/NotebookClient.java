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



    NotebookClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            ) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, NotebookClient> {
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
        public NotebookClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new NotebookClient(this, authenticationDetailsProvider);
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
    
    public CreateAiDataPlatformContentResponse createAiDataPlatformContent(CreateAiDataPlatformContentRequest request) {
                
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
        .operationUsesDefaultRetries()
        
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

                .callSync();
    }

    @Override
    
    public CreateAiDataPlatformSessionResponse createAiDataPlatformSession(CreateAiDataPlatformSessionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
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

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformContentResponse deleteAiDataPlatformContent(DeleteAiDataPlatformContentRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("Location", 
            DeleteAiDataPlatformContentResponse.Builder::location)
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformContentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformContentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformSessionResponse deleteAiDataPlatformSession(DeleteAiDataPlatformSessionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ExportAiDataPlatformContentsResponse exportAiDataPlatformContents(ExportAiDataPlatformContentsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedContents.class, ExportAiDataPlatformContentsResponse.Builder::exportedContents)
                .handleResponseHeaderString("etag", 
            ExportAiDataPlatformContentsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportAiDataPlatformContentsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformContentResponse getAiDataPlatformContent(GetAiDataPlatformContentRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Content.class, GetAiDataPlatformContentResponse.Builder::content)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformContentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformContentResponse.Builder::opcRequestId)
                .handleResponseHeaderDate("Last-Modified", 
            GetAiDataPlatformContentResponse.Builder::lastModified)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformSessionResponse getAiDataPlatformSession(GetAiDataPlatformSessionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, GetAiDataPlatformSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformSessionsResponse listAiDataPlatformSessions(ListAiDataPlatformSessionsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SessionCollection.class, ListAiDataPlatformSessionsResponse.Builder::sessionCollection)
                .handleResponseHeaderString("etag", 
            ListAiDataPlatformSessionsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSessionsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ModifyAiDataPlatformContentResponse modifyAiDataPlatformContent(ModifyAiDataPlatformContentRequest request) {
                
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
        .operationUsesDefaultRetries()
        
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

                .callSync();
    }

    @Override
    
    public PatchAiDataPlatformSessionResponse patchAiDataPlatformSession(PatchAiDataPlatformSessionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Session.class, PatchAiDataPlatformSessionResponse.Builder::session)
                .handleResponseHeaderString("etag", 
            PatchAiDataPlatformSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PatchAiDataPlatformSessionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformContentResponse updateAiDataPlatformContent(UpdateAiDataPlatformContentRequest request) {
                
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
        .operationUsesDefaultRetries()
        
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

                .callSync();
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
    public NotebookClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public NotebookClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
            authenticationDetailsProvider
        );
    }
}
