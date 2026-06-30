// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Agent service. <br/>
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
public class AgentAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements AgentAsync {
    /**
     * Service instance for Agent.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("AGENT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(AgentAsyncClient.class);

    AgentAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, AgentAsyncClient> {
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
        public AgentAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new AgentAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CopyAgentResponse> copyAgent(CopyAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<CopyAgentRequest, CopyAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getCopyAgentDetails(), "copyAgentDetails is required");
        


return clientCall(request, CopyAgentResponse::builder)
        .logger(LOG, "copyAgent")
        .serviceDetails("Agent", "CopyAgent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CopyAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("actions").appendPathParam("copy")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Agent.class, CopyAgentResponse.Builder::agent)
                .handleResponseHeaderString("location", 
            CopyAgentResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CopyAgentResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CopyAgentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CopyAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAgentResponse> createAgent(CreateAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAgentRequest, CreateAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateAgentDetails(), "createAgentDetails is required");
        


return clientCall(request, CreateAgentResponse::builder)
        .logger(LOG, "createAgent")
        .serviceDetails("Agent", "CreateAgent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Agent.class, CreateAgentResponse.Builder::agent)
                .handleResponseHeaderString("location", 
            CreateAgentResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAgentResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAgentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAgentRequest, DeleteAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, DeleteAgentResponse::builder)
        .logger(LOG, "deleteAgent")
        .serviceDetails("Agent", "DeleteAgent", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAgentDeploymentResponse> deleteAgentDeployment(DeleteAgentDeploymentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAgentDeploymentRequest, DeleteAgentDeploymentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getAgentDeploymentKey(), "agentDeploymentKey must not be blank");


return clientCall(request, DeleteAgentDeploymentResponse::builder)
        .logger(LOG, "deleteAgentDeployment")
        .serviceDetails("Agent", "DeleteAgentDeployment", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAgentDeploymentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("deployments").appendPathParam(request.getAgentDeploymentKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAgentDeploymentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAgentSessionResponse> deleteAgentSession(DeleteAgentSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAgentSessionRequest, DeleteAgentSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, DeleteAgentSessionResponse::builder)
        .logger(LOG, "deleteAgentSession")
        .serviceDetails("Agent", "DeleteAgentSession", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAgentSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAgentSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeployAgentResponse> deployAgent(DeployAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeployAgentRequest, DeployAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getDeployAgentDetails(), "deployAgentDetails is required");
        


return clientCall(request, DeployAgentResponse::builder)
        .logger(LOG, "deployAgent")
        .serviceDetails("Agent", "DeployAgent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeployAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("deployments").appendPathParam("actions").appendPathParam("deploy")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.AgentDeployment.class, DeployAgentResponse.Builder::agentDeployment)
                .handleResponseHeaderString("location", 
            DeployAgentResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            DeployAgentResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            DeployAgentResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeployAgentResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeployAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAgentResponse> getAgent(GetAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAgentRequest, GetAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, GetAgentResponse::builder)
        .logger(LOG, "getAgent")
        .serviceDetails("Agent", "GetAgent", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Agent.class, GetAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", 
            GetAgentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAgentDeploymentResponse> getAgentDeployment(GetAgentDeploymentRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAgentDeploymentRequest, GetAgentDeploymentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getAgentDeploymentKey(), "agentDeploymentKey must not be blank");


return clientCall(request, GetAgentDeploymentResponse::builder)
        .logger(LOG, "getAgentDeployment")
        .serviceDetails("Agent", "GetAgentDeployment", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAgentDeploymentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("deployments").appendPathParam(request.getAgentDeploymentKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentDeployment.class, GetAgentDeploymentResponse.Builder::agentDeployment)
                .handleResponseHeaderString("etag", 
            GetAgentDeploymentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAgentDeploymentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAgentSessionResponse> getAgentSession(GetAgentSessionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAgentSessionRequest, GetAgentSessionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, GetAgentSessionResponse::builder)
        .logger(LOG, "getAgentSession")
        .serviceDetails("Agent", "GetAgentSession", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAgentSessionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("sessions").appendPathParam(request.getSessionId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentSession.class, GetAgentSessionResponse.Builder::agentSession)
                .handleResponseHeaderString("etag", 
            GetAgentSessionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAgentSessionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAgentSessionTraceResponse> getAgentSessionTrace(GetAgentSessionTraceRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAgentSessionTraceRequest, GetAgentSessionTraceResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");
        
        Validate.notBlank(request.getTraceKey(), "traceKey must not be blank");


return clientCall(request, GetAgentSessionTraceResponse::builder)
        .logger(LOG, "getAgentSessionTrace")
        .serviceDetails("Agent", "GetAgentSessionTrace", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAgentSessionTraceRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("sessions").appendPathParam(request.getSessionId()).appendPathParam("traces").appendPathParam(request.getTraceKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TraceDetails.class, GetAgentSessionTraceResponse.Builder::traceDetails)
                .handleResponseHeaderString("opc-request-id", 
            GetAgentSessionTraceResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            GetAgentSessionTraceResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAgentDeploymentsResponse> listAgentDeployments(ListAgentDeploymentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAgentDeploymentsRequest, ListAgentDeploymentsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, ListAgentDeploymentsResponse::builder)
        .logger(LOG, "listAgentDeployments")
        .serviceDetails("Agent", "ListAgentDeployments", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAgentDeploymentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("deployments")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                .appendListQueryParam("lifecycleState", request.getLifecycleState(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                
                    
                    .appendQueryParam("timeCreatedGreaterThanOrEqualTo", request.getTimeCreatedGreaterThanOrEqualTo())
            
                
                    
                    .appendQueryParam("timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
            
                .appendListQueryParam("computeKey", request.getComputeKey(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentDeploymentCollection.class, ListAgentDeploymentsResponse.Builder::agentDeploymentCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAgentDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAgentDeploymentsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAgentPermissionsResponse> listAgentPermissions(ListAgentPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAgentPermissionsRequest, ListAgentPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, ListAgentPermissionsResponse::builder)
        .logger(LOG, "listAgentPermissions")
        .serviceDetails("Agent", "ListAgentPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAgentPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentPermissionCollection.class, ListAgentPermissionsResponse.Builder::agentPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAgentPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAgentPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAgentSessionChatHistoriesResponse> listAgentSessionChatHistories(ListAgentSessionChatHistoriesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAgentSessionChatHistoriesRequest, ListAgentSessionChatHistoriesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        
        Validate.notBlank(request.getSessionId(), "sessionId must not be blank");


return clientCall(request, ListAgentSessionChatHistoriesResponse::builder)
        .logger(LOG, "listAgentSessionChatHistories")
        .serviceDetails("Agent", "ListAgentSessionChatHistories", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAgentSessionChatHistoriesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("sessions").appendPathParam(request.getSessionId()).appendPathParam("chatHistory")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SessionChatHistoryCollection.class, ListAgentSessionChatHistoriesResponse.Builder::sessionChatHistoryCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAgentSessionChatHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAgentSessionChatHistoriesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAgentSessionsResponse> listAgentSessions(ListAgentSessionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAgentSessionsRequest, ListAgentSessionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, ListAgentSessionsResponse::builder)
        .logger(LOG, "listAgentSessions")
        .serviceDetails("Agent", "ListAgentSessions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAgentSessionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("sessions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("timeCreatedGreaterThanOrEqualTo", request.getTimeCreatedGreaterThanOrEqualTo())
            
                
                    
                    .appendQueryParam("timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentSessionCollection.class, ListAgentSessionsResponse.Builder::agentSessionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAgentSessionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-prev-page", 
            ListAgentSessionsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString("opc-next-page", 
            ListAgentSessionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAgentsResponse> listAgents(ListAgentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAgentsRequest, ListAgentsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAgentsResponse::builder)
        .logger(LOG, "listAgents")
        .serviceDetails("Agent", "ListAgents", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAgentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents")
            
                
                    
                    .appendQueryParam("computeKey", request.getComputeKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.AgentCollection.class, ListAgentsResponse.Builder::agentCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAgentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAgentsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAgentPermissionResponse> manageAgentPermission(ManageAgentPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAgentPermissionRequest, ManageAgentPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getManageAgentPermissionDetails(), "manageAgentPermissionDetails is required");
        


return clientCall(request, ManageAgentPermissionResponse::builder)
        .logger(LOG, "manageAgentPermission")
        .serviceDetails("Agent", "ManageAgentPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAgentPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAgentPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PreviewAgentAgentCardResponse> previewAgentAgentCard(PreviewAgentAgentCardRequest request, final com.oracle.bmc.responses.AsyncHandler<PreviewAgentAgentCardRequest, PreviewAgentAgentCardResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPreviewAgentCardDetails(), "previewAgentCardDetails is required");
        


return clientCall(request, PreviewAgentAgentCardResponse::builder)
        .logger(LOG, "previewAgentAgentCard")
        .serviceDetails("Agent", "PreviewAgentAgentCard", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PreviewAgentAgentCardRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam("actions").appendPathParam("previewAgentCard")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.AgentCardPreviewResponse.class, PreviewAgentAgentCardResponse.Builder::agentCardPreviewResponse)
                .handleResponseHeaderString("etag", 
            PreviewAgentAgentCardResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PreviewAgentAgentCardResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RedeployAgentByKeyResponse> redeployAgentByKey(RedeployAgentByKeyRequest request, final com.oracle.bmc.responses.AsyncHandler<RedeployAgentByKeyRequest, RedeployAgentByKeyResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getUpdateAgentDeploymentDetails(), "updateAgentDeploymentDetails is required");
        


return clientCall(request, RedeployAgentByKeyResponse::builder)
        .logger(LOG, "redeployAgentByKey")
        .serviceDetails("Agent", "RedeployAgentByKey", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RedeployAgentByKeyRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("deployments").appendPathParam("actions").appendPathParam("redeploy")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.AgentDeployment.class, RedeployAgentByKeyResponse.Builder::agentDeployment)
                .handleResponseHeaderString("location", 
            RedeployAgentByKeyResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            RedeployAgentByKeyResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            RedeployAgentByKeyResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RedeployAgentByKeyResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            RedeployAgentByKeyResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAgentResponse> updateAgent(UpdateAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAgentRequest, UpdateAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getUpdateAgentDetails(), "updateAgentDetails is required");
        


return clientCall(request, UpdateAgentResponse::builder)
        .logger(LOG, "updateAgent")
        .serviceDetails("Agent", "UpdateAgent", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Agent.class, UpdateAgentResponse.Builder::agent)
                .handleResponseHeaderString("etag", 
            UpdateAgentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAgentDeploymentMetadataResponse> updateAgentDeploymentMetadata(UpdateAgentDeploymentMetadataRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAgentDeploymentMetadataRequest, UpdateAgentDeploymentMetadataResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");
        Objects.requireNonNull(request.getUpdateAgentDeploymentMetadataDetails(), "updateAgentDeploymentMetadataDetails is required");
        


return clientCall(request, UpdateAgentDeploymentMetadataResponse::builder)
        .logger(LOG, "updateAgentDeploymentMetadata")
        .serviceDetails("Agent", "UpdateAgentDeploymentMetadata", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAgentDeploymentMetadataRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("actions").appendPathParam("updateDeploymentMetadata")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("if-match", request.getIfMatch())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.AgentDeployment.class, UpdateAgentDeploymentMetadataResponse.Builder::agentDeployment)
                .handleResponseHeaderString("etag", 
            UpdateAgentDeploymentMetadataResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAgentDeploymentMetadataResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ValidateAgentResponse> validateAgent(ValidateAgentRequest request, final com.oracle.bmc.responses.AsyncHandler<ValidateAgentRequest, ValidateAgentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getAgentKey(), "agentKey must not be blank");


return clientCall(request, ValidateAgentResponse::builder)
        .logger(LOG, "validateAgent")
        .serviceDetails("Agent", "ValidateAgent", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ValidateAgentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("agents").appendPathParam(request.getAgentKey()).appendPathParam("actions").appendPathParam("validate")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ValidateAgentResponse.class, ValidateAgentResponse.Builder::validateAgentResponse)
                .handleResponseHeaderString("etag", 
            ValidateAgentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ValidateAgentResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AgentAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public AgentAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public AgentAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public AgentAsyncClient(
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
    public AgentAsyncClient (
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
    public AgentAsyncClient (
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
    public AgentAsyncClient (
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
