// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class MLOpsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements MLOpsAsync {
    /**
     * Service instance for MLOps.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("MLOPS").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MLOpsAsyncClient.class);

    MLOpsAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MLOpsAsyncClient> {
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
        public MLOpsAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new MLOpsAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateAiDataPlatformExperimentResponse> createAiDataPlatformExperiment(CreateAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRequest, CreateAiDataPlatformExperimentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateExperimentDetails(), "createExperimentDetails is required");
        


return clientCall(request, CreateAiDataPlatformExperimentResponse::builder)
        .logger(LOG, "createAiDataPlatformExperiment")
        .serviceDetails("MLOps", "CreateAiDataPlatformExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateExperimentResponseDetails.class, CreateAiDataPlatformExperimentResponse.Builder::createExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformExperimentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformExperimentRunResponse> createAiDataPlatformExperimentRun(CreateAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformExperimentRunRequest, CreateAiDataPlatformExperimentRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateExperimentRunDetails(), "createExperimentRunDetails is required");
        


return clientCall(request, CreateAiDataPlatformExperimentRunResponse::builder)
        .logger(LOG, "createAiDataPlatformExperimentRun")
        .serviceDetails("MLOps", "CreateAiDataPlatformExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateExperimentRunResponseDetails.class, CreateAiDataPlatformExperimentRunResponse.Builder::createExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformExperimentRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformModelVersionResponse> createAiDataPlatformModelVersion(CreateAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformModelVersionRequest, CreateAiDataPlatformModelVersionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateModelVersionDetails(), "createModelVersionDetails is required");
        


return clientCall(request, CreateAiDataPlatformModelVersionResponse::builder)
        .logger(LOG, "createAiDataPlatformModelVersion")
        .serviceDetails("MLOps", "CreateAiDataPlatformModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails.class, CreateAiDataPlatformModelVersionResponse.Builder::createModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformModelVersionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformRegisteredModelResponse> createAiDataPlatformRegisteredModel(CreateAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRegisteredModelRequest, CreateAiDataPlatformRegisteredModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateRegisteredModelDetails(), "createRegisteredModelDetails is required");
        


return clientCall(request, CreateAiDataPlatformRegisteredModelResponse::builder)
        .logger(LOG, "createAiDataPlatformRegisteredModel")
        .serviceDetails("MLOps", "CreateAiDataPlatformRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateRegisteredModelResponseDetails.class, CreateAiDataPlatformRegisteredModelResponse.Builder::createRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformRegisteredModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformWorkspaceModelVersionResponse> createAiDataPlatformWorkspaceModelVersion(CreateAiDataPlatformWorkspaceModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceModelVersionRequest, CreateAiDataPlatformWorkspaceModelVersionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateModelVersionDetails(), "createModelVersionDetails is required");
        


return clientCall(request, CreateAiDataPlatformWorkspaceModelVersionResponse::builder)
        .logger(LOG, "createAiDataPlatformWorkspaceModelVersion")
        .serviceDetails("MLOps", "CreateAiDataPlatformWorkspaceModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformWorkspaceModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails.class, CreateAiDataPlatformWorkspaceModelVersionResponse.Builder::createModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformWorkspaceModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformWorkspaceModelVersionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentResponse> deleteAiDataPlatformExperiment(DeleteAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRequest, DeleteAiDataPlatformExperimentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentDetails(), "deleteExperimentDetails is required");
        


return clientCall(request, DeleteAiDataPlatformExperimentResponse::builder)
        .logger(LOG, "deleteAiDataPlatformExperiment")
        .serviceDetails("MLOps", "DeleteAiDataPlatformExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentResponseDetails.class, DeleteAiDataPlatformExperimentResponse.Builder::deleteExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformExperimentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunResponse> deleteAiDataPlatformExperimentRun(DeleteAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunRequest, DeleteAiDataPlatformExperimentRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentRunDetails(), "deleteExperimentRunDetails is required");
        


return clientCall(request, DeleteAiDataPlatformExperimentRunResponse::builder)
        .logger(LOG, "deleteAiDataPlatformExperimentRun")
        .serviceDetails("MLOps", "DeleteAiDataPlatformExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentRunResponseDetails.class, DeleteAiDataPlatformExperimentRunResponse.Builder::deleteExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformExperimentRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentRunTagResponse> deleteAiDataPlatformExperimentRunTag(DeleteAiDataPlatformExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentRunTagRequest, DeleteAiDataPlatformExperimentRunTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentRunTagDetails(), "deleteExperimentRunTagDetails is required");
        


return clientCall(request, DeleteAiDataPlatformExperimentRunTagResponse::builder)
        .logger(LOG, "deleteAiDataPlatformExperimentRunTag")
        .serviceDetails("MLOps", "DeleteAiDataPlatformExperimentRunTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformExperimentRunTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagResponseDetails.class, DeleteAiDataPlatformExperimentRunTagResponse.Builder::deleteExperimentRunTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformExperimentRunTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformExperimentRunTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformExperimentTagResponse> deleteAiDataPlatformExperimentTag(DeleteAiDataPlatformExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformExperimentTagRequest, DeleteAiDataPlatformExperimentTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentTagDetails(), "deleteExperimentTagDetails is required");
        


return clientCall(request, DeleteAiDataPlatformExperimentTagResponse::builder)
        .logger(LOG, "deleteAiDataPlatformExperimentTag")
        .serviceDetails("MLOps", "DeleteAiDataPlatformExperimentTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformExperimentTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("delete-experiment-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentTagResponseDetails.class, DeleteAiDataPlatformExperimentTagResponse.Builder::deleteExperimentTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformExperimentTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformExperimentTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformModelVersionResponse> deleteAiDataPlatformModelVersion(DeleteAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionRequest, DeleteAiDataPlatformModelVersionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteModelVersionDetails(), "deleteModelVersionDetails is required");
        


return clientCall(request, DeleteAiDataPlatformModelVersionResponse::builder)
        .logger(LOG, "deleteAiDataPlatformModelVersion")
        .serviceDetails("MLOps", "DeleteAiDataPlatformModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteModelVersionResponseDetails.class, DeleteAiDataPlatformModelVersionResponse.Builder::deleteModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformModelVersionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformModelVersionTagResponse> deleteAiDataPlatformModelVersionTag(DeleteAiDataPlatformModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformModelVersionTagRequest, DeleteAiDataPlatformModelVersionTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteModelVersionTagDetails(), "deleteModelVersionTagDetails is required");
        


return clientCall(request, DeleteAiDataPlatformModelVersionTagResponse::builder)
        .logger(LOG, "deleteAiDataPlatformModelVersionTag")
        .serviceDetails("MLOps", "DeleteAiDataPlatformModelVersionTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformModelVersionTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails.class, DeleteAiDataPlatformModelVersionTagResponse.Builder::deleteModelVersionTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformModelVersionTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformModelVersionTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelResponse> deleteAiDataPlatformRegisteredModel(DeleteAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelRequest, DeleteAiDataPlatformRegisteredModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteRegisteredModelDetails(), "deleteRegisteredModelDetails is required");
        


return clientCall(request, DeleteAiDataPlatformRegisteredModelResponse::builder)
        .logger(LOG, "deleteAiDataPlatformRegisteredModel")
        .serviceDetails("MLOps", "DeleteAiDataPlatformRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteRegisteredModelResponseDetails.class, DeleteAiDataPlatformRegisteredModelResponse.Builder::deleteRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformRegisteredModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformRegisteredModelTagResponse> deleteAiDataPlatformRegisteredModelTag(DeleteAiDataPlatformRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRegisteredModelTagRequest, DeleteAiDataPlatformRegisteredModelTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteRegisteredModelTagDetails(), "deleteRegisteredModelTagDetails is required");
        


return clientCall(request, DeleteAiDataPlatformRegisteredModelTagResponse::builder)
        .logger(LOG, "deleteAiDataPlatformRegisteredModelTag")
        .serviceDetails("MLOps", "DeleteAiDataPlatformRegisteredModelTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteAiDataPlatformRegisteredModelTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagResponseDetails.class, DeleteAiDataPlatformRegisteredModelTagResponse.Builder::deleteRegisteredModelTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteAiDataPlatformRegisteredModelTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformRegisteredModelTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformExperimentByIdResponse> getAiDataPlatformExperimentById(GetAiDataPlatformExperimentByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByIdRequest, GetAiDataPlatformExperimentByIdResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getExperimentId(), "experimentId is required");
        


return clientCall(request, GetAiDataPlatformExperimentByIdResponse::builder)
        .logger(LOG, "getAiDataPlatformExperimentById")
        .serviceDetails("MLOps", "GetAiDataPlatformExperimentById", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformExperimentByIdRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("get")
            
                
                    
                    .appendQueryParam("experiment_id", request.getExperimentId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentResponse.class, GetAiDataPlatformExperimentByIdResponse.Builder::experimentResponse)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformExperimentByIdResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformExperimentByIdResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformExperimentByNameResponse> getAiDataPlatformExperimentByName(GetAiDataPlatformExperimentByNameRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentByNameRequest, GetAiDataPlatformExperimentByNameResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getExperimentName(), "experimentName is required");
        


return clientCall(request, GetAiDataPlatformExperimentByNameResponse::builder)
        .logger(LOG, "getAiDataPlatformExperimentByName")
        .serviceDetails("MLOps", "GetAiDataPlatformExperimentByName", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformExperimentByNameRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("get-by-name")
            
                
                    
                    .appendQueryParam("experiment_name", request.getExperimentName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentResponse.class, GetAiDataPlatformExperimentByNameResponse.Builder::experimentResponse)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformExperimentByNameResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformExperimentByNameResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformExperimentRunByIdResponse> getAiDataPlatformExperimentRunById(GetAiDataPlatformExperimentRunByIdRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunByIdRequest, GetAiDataPlatformExperimentRunByIdResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        


return clientCall(request, GetAiDataPlatformExperimentRunByIdResponse::builder)
        .logger(LOG, "getAiDataPlatformExperimentRunById")
        .serviceDetails("MLOps", "GetAiDataPlatformExperimentRunById", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformExperimentRunByIdRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("get")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetExperimentRunResponseDetails.class, GetAiDataPlatformExperimentRunByIdResponse.Builder::getExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformExperimentRunByIdResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformExperimentRunByIdResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformExperimentRunMetricHistoryResponse> getAiDataPlatformExperimentRunMetricHistory(GetAiDataPlatformExperimentRunMetricHistoryRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformExperimentRunMetricHistoryRequest, GetAiDataPlatformExperimentRunMetricHistoryResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        
        Objects.requireNonNull(request.getMetricKey(), "metricKey is required");
        


return clientCall(request, GetAiDataPlatformExperimentRunMetricHistoryResponse::builder)
        .logger(LOG, "getAiDataPlatformExperimentRunMetricHistory")
        .serviceDetails("MLOps", "GetAiDataPlatformExperimentRunMetricHistory", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformExperimentRunMetricHistoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("metrics").appendPathParam("get-history")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
            
                
                    
                    .appendQueryParam("metric_key", request.getMetricKey())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentRunMetricHistoryCollection.class, GetAiDataPlatformExperimentRunMetricHistoryResponse.Builder::experimentRunMetricHistoryCollection)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformExperimentRunMetricHistoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            GetAiDataPlatformExperimentRunMetricHistoryResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformModelVersionResponse> getAiDataPlatformModelVersion(GetAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformModelVersionRequest, GetAiDataPlatformModelVersionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");
        
        Objects.requireNonNull(request.getVersion(), "version is required");
        


return clientCall(request, GetAiDataPlatformModelVersionResponse::builder)
        .logger(LOG, "getAiDataPlatformModelVersion")
        .serviceDetails("MLOps", "GetAiDataPlatformModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("get")
            
                
                    
                    .appendQueryParam("name", request.getName())
            
                
                    
                    .appendQueryParam("version", request.getVersion())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetModelVersionResponseDetails.class, GetAiDataPlatformModelVersionResponse.Builder::getModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformModelVersionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformRegisteredModelResponse> getAiDataPlatformRegisteredModel(GetAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRegisteredModelRequest, GetAiDataPlatformRegisteredModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");
        


return clientCall(request, GetAiDataPlatformRegisteredModelResponse::builder)
        .logger(LOG, "getAiDataPlatformRegisteredModel")
        .serviceDetails("MLOps", "GetAiDataPlatformRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("get")
            
                
                    
                    .appendQueryParam("name", request.getName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetRegisteredModelResponseDetails.class, GetAiDataPlatformRegisteredModelResponse.Builder::getRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformRegisteredModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformArtifactsResponse> listAiDataPlatformArtifacts(ListAiDataPlatformArtifactsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformArtifactsRequest, ListAiDataPlatformArtifactsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        


return clientCall(request, ListAiDataPlatformArtifactsResponse::builder)
        .logger(LOG, "listAiDataPlatformArtifacts")
        .serviceDetails("MLOps", "ListAiDataPlatformArtifacts", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformArtifactsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("artifacts").appendPathParam("list")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ArtifactList.class, ListAiDataPlatformArtifactsResponse.Builder::artifactList)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformArtifactsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformExperimentRunsResponse> listAiDataPlatformExperimentRuns(ListAiDataPlatformExperimentRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentRunsRequest, ListAiDataPlatformExperimentRunsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListExperimentRunsDetails(), "listExperimentRunsDetails is required");
        


return clientCall(request, ListAiDataPlatformExperimentRunsResponse::builder)
        .logger(LOG, "listAiDataPlatformExperimentRuns")
        .serviceDetails("MLOps", "ListAiDataPlatformExperimentRuns", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListAiDataPlatformExperimentRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentRunCollection.class, ListAiDataPlatformExperimentRunsResponse.Builder::experimentRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformExperimentRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformExperimentRunsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformExperimentsResponse> listAiDataPlatformExperiments(ListAiDataPlatformExperimentsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformExperimentsRequest, ListAiDataPlatformExperimentsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListExperimentsDetails(), "listExperimentsDetails is required");
        


return clientCall(request, ListAiDataPlatformExperimentsResponse::builder)
        .logger(LOG, "listAiDataPlatformExperiments")
        .serviceDetails("MLOps", "ListAiDataPlatformExperiments", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListAiDataPlatformExperimentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentCollection.class, ListAiDataPlatformExperimentsResponse.Builder::experimentCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformExperimentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformExperimentsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformLoggedModelsResponse> listAiDataPlatformLoggedModels(ListAiDataPlatformLoggedModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformLoggedModelsRequest, ListAiDataPlatformLoggedModelsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListLoggedModelsDetails(), "listLoggedModelsDetails is required");
        


return clientCall(request, ListAiDataPlatformLoggedModelsResponse::builder)
        .logger(LOG, "listAiDataPlatformLoggedModels")
        .serviceDetails("MLOps", "ListAiDataPlatformLoggedModels", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListAiDataPlatformLoggedModelsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("logged-models").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LoggedModelCollection.class, ListAiDataPlatformLoggedModelsResponse.Builder::loggedModelCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformLoggedModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformLoggedModelsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformModelVersionsResponse> listAiDataPlatformModelVersions(ListAiDataPlatformModelVersionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformModelVersionsRequest, ListAiDataPlatformModelVersionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformModelVersionsResponse::builder)
        .logger(LOG, "listAiDataPlatformModelVersions")
        .serviceDetails("MLOps", "ListAiDataPlatformModelVersions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformModelVersionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("search")
            
                
                    
                    .appendQueryParam("filter", request.getFilter())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("order_by", request.getOrderBy())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ModelVersionCollection.class, ListAiDataPlatformModelVersionsResponse.Builder::modelVersionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformModelVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformModelVersionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRegisteredModelsResponse> listAiDataPlatformRegisteredModels(ListAiDataPlatformRegisteredModelsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRegisteredModelsRequest, ListAiDataPlatformRegisteredModelsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformRegisteredModelsResponse::builder)
        .logger(LOG, "listAiDataPlatformRegisteredModels")
        .serviceDetails("MLOps", "ListAiDataPlatformRegisteredModels", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRegisteredModelsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("search")
            
                
                    
                    .appendQueryParam("filter", request.getFilter())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("order_by", request.getOrderBy())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RegisteredModelCollection.class, ListAiDataPlatformRegisteredModelsResponse.Builder::registeredModelCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRegisteredModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRegisteredModelsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunBatchResponse> logAiDataPlatformExperimentRunBatch(LogAiDataPlatformExperimentRunBatchRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunBatchRequest, LogAiDataPlatformExperimentRunBatchResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunBatchDetails(), "logExperimentRunBatchDetails is required");
        


return clientCall(request, LogAiDataPlatformExperimentRunBatchResponse::builder)
        .logger(LOG, "logAiDataPlatformExperimentRunBatch")
        .serviceDetails("MLOps", "LogAiDataPlatformExperimentRunBatch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogAiDataPlatformExperimentRunBatchRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-batch")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunBatchResponseDetails.class, LogAiDataPlatformExperimentRunBatchResponse.Builder::logExperimentRunBatchResponseDetails)
                .handleResponseHeaderString("etag", 
            LogAiDataPlatformExperimentRunBatchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogAiDataPlatformExperimentRunBatchResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunInputsResponse> logAiDataPlatformExperimentRunInputs(LogAiDataPlatformExperimentRunInputsRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunInputsRequest, LogAiDataPlatformExperimentRunInputsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunInputsDetails(), "logExperimentRunInputsDetails is required");
        


return clientCall(request, LogAiDataPlatformExperimentRunInputsResponse::builder)
        .logger(LOG, "logAiDataPlatformExperimentRunInputs")
        .serviceDetails("MLOps", "LogAiDataPlatformExperimentRunInputs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogAiDataPlatformExperimentRunInputsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-inputs")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunInputsResponseDetails.class, LogAiDataPlatformExperimentRunInputsResponse.Builder::logExperimentRunInputsResponseDetails)
                .handleResponseHeaderString("etag", 
            LogAiDataPlatformExperimentRunInputsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogAiDataPlatformExperimentRunInputsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunMetricResponse> logAiDataPlatformExperimentRunMetric(LogAiDataPlatformExperimentRunMetricRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunMetricRequest, LogAiDataPlatformExperimentRunMetricResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunMetricDetails(), "logExperimentRunMetricDetails is required");
        


return clientCall(request, LogAiDataPlatformExperimentRunMetricResponse::builder)
        .logger(LOG, "logAiDataPlatformExperimentRunMetric")
        .serviceDetails("MLOps", "LogAiDataPlatformExperimentRunMetric", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogAiDataPlatformExperimentRunMetricRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-metric")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunMetricResponseDetails.class, LogAiDataPlatformExperimentRunMetricResponse.Builder::logExperimentRunMetricResponseDetails)
                .handleResponseHeaderString("etag", 
            LogAiDataPlatformExperimentRunMetricResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogAiDataPlatformExperimentRunMetricResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunModelResponse> logAiDataPlatformExperimentRunModel(LogAiDataPlatformExperimentRunModelRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunModelRequest, LogAiDataPlatformExperimentRunModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunModelDetails(), "logExperimentRunModelDetails is required");
        


return clientCall(request, LogAiDataPlatformExperimentRunModelResponse::builder)
        .logger(LOG, "logAiDataPlatformExperimentRunModel")
        .serviceDetails("MLOps", "LogAiDataPlatformExperimentRunModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogAiDataPlatformExperimentRunModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-model")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunModelResponseDetails.class, LogAiDataPlatformExperimentRunModelResponse.Builder::logExperimentRunModelResponseDetails)
                .handleResponseHeaderString("etag", 
            LogAiDataPlatformExperimentRunModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogAiDataPlatformExperimentRunModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<LogAiDataPlatformExperimentRunParamResponse> logAiDataPlatformExperimentRunParam(LogAiDataPlatformExperimentRunParamRequest request, final com.oracle.bmc.responses.AsyncHandler<LogAiDataPlatformExperimentRunParamRequest, LogAiDataPlatformExperimentRunParamResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunParamDetails(), "logExperimentRunParamDetails is required");
        


return clientCall(request, LogAiDataPlatformExperimentRunParamResponse::builder)
        .logger(LOG, "logAiDataPlatformExperimentRunParam")
        .serviceDetails("MLOps", "LogAiDataPlatformExperimentRunParam", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogAiDataPlatformExperimentRunParamRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-parameter")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunParamResponseDetails.class, LogAiDataPlatformExperimentRunParamResponse.Builder::logExperimentRunParamResponseDetails)
                .handleResponseHeaderString("etag", 
            LogAiDataPlatformExperimentRunParamResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogAiDataPlatformExperimentRunParamResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RenameAiDataPlatformRegisteredModelResponse> renameAiDataPlatformRegisteredModel(RenameAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformRegisteredModelRequest, RenameAiDataPlatformRegisteredModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getRenameRegisteredModelDetails(), "renameRegisteredModelDetails is required");
        


return clientCall(request, RenameAiDataPlatformRegisteredModelResponse::builder)
        .logger(LOG, "renameAiDataPlatformRegisteredModel")
        .serviceDetails("MLOps", "RenameAiDataPlatformRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RenameAiDataPlatformRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("rename")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RenameRegisteredModelResponseDetails.class, RenameAiDataPlatformRegisteredModelResponse.Builder::renameRegisteredModelResponseDetails)
                .handleResponseHeaderString("opc-request-id", 
            RenameAiDataPlatformRegisteredModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RestoreAiDataPlatformExperimentResponse> restoreAiDataPlatformExperiment(RestoreAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRequest, RestoreAiDataPlatformExperimentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRestoreExperimentDetails(), "restoreExperimentDetails is required");
        


return clientCall(request, RestoreAiDataPlatformExperimentResponse::builder)
        .logger(LOG, "restoreAiDataPlatformExperiment")
        .serviceDetails("MLOps", "RestoreAiDataPlatformExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestoreAiDataPlatformExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("restore")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RestoreExperimentResponseDetails.class, RestoreAiDataPlatformExperimentResponse.Builder::restoreExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            RestoreAiDataPlatformExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RestoreAiDataPlatformExperimentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RestoreAiDataPlatformExperimentRunResponse> restoreAiDataPlatformExperimentRun(RestoreAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<RestoreAiDataPlatformExperimentRunRequest, RestoreAiDataPlatformExperimentRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRestoreExperimentRunDetails(), "restoreExperimentRunDetails is required");
        


return clientCall(request, RestoreAiDataPlatformExperimentRunResponse::builder)
        .logger(LOG, "restoreAiDataPlatformExperimentRun")
        .serviceDetails("MLOps", "RestoreAiDataPlatformExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestoreAiDataPlatformExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("restore")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RestoreExperimentRunResponseDetails.class, RestoreAiDataPlatformExperimentRunResponse.Builder::restoreExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            RestoreAiDataPlatformExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RestoreAiDataPlatformExperimentRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SetAiDataPlatformExperimentRunTagResponse> setAiDataPlatformExperimentRunTag(SetAiDataPlatformExperimentRunTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentRunTagRequest, SetAiDataPlatformExperimentRunTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSetExperimentRunTagDetails(), "setExperimentRunTagDetails is required");
        


return clientCall(request, SetAiDataPlatformExperimentRunTagResponse::builder)
        .logger(LOG, "setAiDataPlatformExperimentRunTag")
        .serviceDetails("MLOps", "SetAiDataPlatformExperimentRunTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetAiDataPlatformExperimentRunTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails.class, SetAiDataPlatformExperimentRunTagResponse.Builder::setExperimentRunTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetAiDataPlatformExperimentRunTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetAiDataPlatformExperimentRunTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SetAiDataPlatformExperimentTagResponse> setAiDataPlatformExperimentTag(SetAiDataPlatformExperimentTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformExperimentTagRequest, SetAiDataPlatformExperimentTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSetExperimentTagDetails(), "setExperimentTagDetails is required");
        


return clientCall(request, SetAiDataPlatformExperimentTagResponse::builder)
        .logger(LOG, "setAiDataPlatformExperimentTag")
        .serviceDetails("MLOps", "SetAiDataPlatformExperimentTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetAiDataPlatformExperimentTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("set-experiment-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails.class, SetAiDataPlatformExperimentTagResponse.Builder::setExperimentTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetAiDataPlatformExperimentTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetAiDataPlatformExperimentTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SetAiDataPlatformModelVersionTagResponse> setAiDataPlatformModelVersionTag(SetAiDataPlatformModelVersionTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformModelVersionTagRequest, SetAiDataPlatformModelVersionTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getSetModelVersionTagDetails(), "setModelVersionTagDetails is required");
        


return clientCall(request, SetAiDataPlatformModelVersionTagResponse::builder)
        .logger(LOG, "setAiDataPlatformModelVersionTag")
        .serviceDetails("MLOps", "SetAiDataPlatformModelVersionTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetAiDataPlatformModelVersionTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails.class, SetAiDataPlatformModelVersionTagResponse.Builder::setModelVersionTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetAiDataPlatformModelVersionTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetAiDataPlatformModelVersionTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<SetAiDataPlatformRegisteredModelTagResponse> setAiDataPlatformRegisteredModelTag(SetAiDataPlatformRegisteredModelTagRequest request, final com.oracle.bmc.responses.AsyncHandler<SetAiDataPlatformRegisteredModelTagRequest, SetAiDataPlatformRegisteredModelTagResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getSetRegisteredModelTagDetails(), "setRegisteredModelTagDetails is required");
        


return clientCall(request, SetAiDataPlatformRegisteredModelTagResponse::builder)
        .logger(LOG, "setAiDataPlatformRegisteredModelTag")
        .serviceDetails("MLOps", "SetAiDataPlatformRegisteredModelTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetAiDataPlatformRegisteredModelTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetRegisteredModelTagResponseDetails.class, SetAiDataPlatformRegisteredModelTagResponse.Builder::setRegisteredModelTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetAiDataPlatformRegisteredModelTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetAiDataPlatformRegisteredModelTagResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<TransitionAiDataPlatformModelVersionStageResponse> transitionAiDataPlatformModelVersionStage(TransitionAiDataPlatformModelVersionStageRequest request, final com.oracle.bmc.responses.AsyncHandler<TransitionAiDataPlatformModelVersionStageRequest, TransitionAiDataPlatformModelVersionStageResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getTransitionModelVersionStageDetails(), "transitionModelVersionStageDetails is required");
        


return clientCall(request, TransitionAiDataPlatformModelVersionStageResponse::builder)
        .logger(LOG, "transitionAiDataPlatformModelVersionStage")
        .serviceDetails("MLOps", "TransitionAiDataPlatformModelVersionStage", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(TransitionAiDataPlatformModelVersionStageRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("transition-stage")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.TransitionModelVersionStageResponseDetails.class, TransitionAiDataPlatformModelVersionStageResponse.Builder::transitionModelVersionStageResponseDetails)
                .handleResponseHeaderString("etag", 
            TransitionAiDataPlatformModelVersionStageResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            TransitionAiDataPlatformModelVersionStageResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentResponse> updateAiDataPlatformExperiment(UpdateAiDataPlatformExperimentRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRequest, UpdateAiDataPlatformExperimentResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentDetails(), "updateExperimentDetails is required");
        


return clientCall(request, UpdateAiDataPlatformExperimentResponse::builder)
        .logger(LOG, "updateAiDataPlatformExperiment")
        .serviceDetails("MLOps", "UpdateAiDataPlatformExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentResponseDetails.class, UpdateAiDataPlatformExperimentResponse.Builder::updateExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformExperimentResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunResponse> updateAiDataPlatformExperimentRun(UpdateAiDataPlatformExperimentRunRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunRequest, UpdateAiDataPlatformExperimentRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentRunDetails(), "updateExperimentRunDetails is required");
        


return clientCall(request, UpdateAiDataPlatformExperimentRunResponse::builder)
        .logger(LOG, "updateAiDataPlatformExperimentRun")
        .serviceDetails("MLOps", "UpdateAiDataPlatformExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentRunResponseDetails.class, UpdateAiDataPlatformExperimentRunResponse.Builder::updateExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformExperimentRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentRunTagsResponse> updateAiDataPlatformExperimentRunTags(UpdateAiDataPlatformExperimentRunTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentRunTagsRequest, UpdateAiDataPlatformExperimentRunTagsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentRunTagsDetails(), "updateExperimentRunTagsDetails is required");
        


return clientCall(request, UpdateAiDataPlatformExperimentRunTagsResponse::builder)
        .logger(LOG, "updateAiDataPlatformExperimentRunTags")
        .serviceDetails("MLOps", "UpdateAiDataPlatformExperimentRunTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformExperimentRunTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("runs").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails.class, UpdateAiDataPlatformExperimentRunTagsResponse.Builder::updateExperimentRunTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformExperimentRunTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformExperimentRunTagsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformExperimentTagsResponse> updateAiDataPlatformExperimentTags(UpdateAiDataPlatformExperimentTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformExperimentTagsRequest, UpdateAiDataPlatformExperimentTagsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentTagsDetails(), "updateExperimentTagsDetails is required");
        


return clientCall(request, UpdateAiDataPlatformExperimentTagsResponse::builder)
        .logger(LOG, "updateAiDataPlatformExperimentTags")
        .serviceDetails("MLOps", "UpdateAiDataPlatformExperimentTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformExperimentTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("experiments").appendPathParam("update-experiment-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentTagsResponseDetails.class, UpdateAiDataPlatformExperimentTagsResponse.Builder::updateExperimentTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformExperimentTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformExperimentTagsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformModelVersionResponse> updateAiDataPlatformModelVersion(UpdateAiDataPlatformModelVersionRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionRequest, UpdateAiDataPlatformModelVersionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateModelVersionDetails(), "updateModelVersionDetails is required");
        


return clientCall(request, UpdateAiDataPlatformModelVersionResponse::builder)
        .logger(LOG, "updateAiDataPlatformModelVersion")
        .serviceDetails("MLOps", "UpdateAiDataPlatformModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateModelVersionResponseDetails.class, UpdateAiDataPlatformModelVersionResponse.Builder::updateModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformModelVersionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformModelVersionTagsResponse> updateAiDataPlatformModelVersionTags(UpdateAiDataPlatformModelVersionTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformModelVersionTagsRequest, UpdateAiDataPlatformModelVersionTagsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateModelVersionTagsDetails(), "updateModelVersionTagsDetails is required");
        


return clientCall(request, UpdateAiDataPlatformModelVersionTagsResponse::builder)
        .logger(LOG, "updateAiDataPlatformModelVersionTags")
        .serviceDetails("MLOps", "UpdateAiDataPlatformModelVersionTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformModelVersionTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("model-versions").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsResponseDetails.class, UpdateAiDataPlatformModelVersionTagsResponse.Builder::updateModelVersionTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformModelVersionTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformModelVersionTagsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelResponse> updateAiDataPlatformRegisteredModel(UpdateAiDataPlatformRegisteredModelRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelRequest, UpdateAiDataPlatformRegisteredModelResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateRegisteredModelDetails(), "updateRegisteredModelDetails is required");
        


return clientCall(request, UpdateAiDataPlatformRegisteredModelResponse::builder)
        .logger(LOG, "updateAiDataPlatformRegisteredModel")
        .serviceDetails("MLOps", "UpdateAiDataPlatformRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateRegisteredModelResponseDetails.class, UpdateAiDataPlatformRegisteredModelResponse.Builder::updateRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformRegisteredModelResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformRegisteredModelTagsResponse> updateAiDataPlatformRegisteredModelTags(UpdateAiDataPlatformRegisteredModelTagsRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRegisteredModelTagsRequest, UpdateAiDataPlatformRegisteredModelTagsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateRegisteredModelTagsDetails(), "updateRegisteredModelTagsDetails is required");
        


return clientCall(request, UpdateAiDataPlatformRegisteredModelTagsResponse::builder)
        .logger(LOG, "updateAiDataPlatformRegisteredModelTags")
        .serviceDetails("MLOps", "UpdateAiDataPlatformRegisteredModelTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateAiDataPlatformRegisteredModelTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("registered-models").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("dh-user-principal", request.getDhUserPrincipal())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsResponseDetails.class, UpdateAiDataPlatformRegisteredModelTagsResponse.Builder::updateRegisteredModelTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformRegisteredModelTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformRegisteredModelTagsResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public MLOpsAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public MLOpsAsyncClient(
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
    public MLOpsAsyncClient (
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
    public MLOpsAsyncClient (
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
    public MLOpsAsyncClient (
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
