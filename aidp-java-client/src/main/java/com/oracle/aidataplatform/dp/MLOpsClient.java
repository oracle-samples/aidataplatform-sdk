// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class MLOpsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements MLOps {
    /**
     * Service instance for MLOps.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("MLOPS").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(MLOpsClient.class);



    MLOpsClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MLOpsClient> {
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
        public MLOpsClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new MLOpsClient(this, authenticationDetailsProvider);
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
    
    public CreateExperimentResponse createExperiment(CreateExperimentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateExperimentDetails(), "createExperimentDetails is required");
        


return clientCall(request, CreateExperimentResponse::builder)
        .logger(LOG, "createExperiment")
        .serviceDetails("MLOps", "CreateExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateExperimentResponseDetails.class, CreateExperimentResponse.Builder::createExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateExperimentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateExperimentRunResponse createExperimentRun(CreateExperimentRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateExperimentRunDetails(), "createExperimentRunDetails is required");
        


return clientCall(request, CreateExperimentRunResponse::builder)
        .logger(LOG, "createExperimentRun")
        .serviceDetails("MLOps", "CreateExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateExperimentRunResponseDetails.class, CreateExperimentRunResponse.Builder::createExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateExperimentRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateModelVersionResponse createModelVersion(CreateModelVersionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateModelVersionDetails(), "createModelVersionDetails is required");
        


return clientCall(request, CreateModelVersionResponse::builder)
        .logger(LOG, "createModelVersion")
        .serviceDetails("MLOps", "CreateModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails.class, CreateModelVersionResponse.Builder::createModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateModelVersionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateRegisteredModelResponse createRegisteredModel(CreateRegisteredModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateRegisteredModelDetails(), "createRegisteredModelDetails is required");
        


return clientCall(request, CreateRegisteredModelResponse::builder)
        .logger(LOG, "createRegisteredModel")
        .serviceDetails("MLOps", "CreateRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateRegisteredModelResponseDetails.class, CreateRegisteredModelResponse.Builder::createRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateRegisteredModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateWorkspaceModelVersionResponse createWorkspaceModelVersion(CreateWorkspaceModelVersionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateModelVersionDetails(), "createModelVersionDetails is required");
        


return clientCall(request, CreateWorkspaceModelVersionResponse::builder)
        .logger(LOG, "createWorkspaceModelVersion")
        .serviceDetails("MLOps", "CreateWorkspaceModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateWorkspaceModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("create")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails.class, CreateWorkspaceModelVersionResponse.Builder::createModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            CreateWorkspaceModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateWorkspaceModelVersionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteExperimentResponse deleteExperiment(DeleteExperimentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentDetails(), "deleteExperimentDetails is required");
        


return clientCall(request, DeleteExperimentResponse::builder)
        .logger(LOG, "deleteExperiment")
        .serviceDetails("MLOps", "DeleteExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentResponseDetails.class, DeleteExperimentResponse.Builder::deleteExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteExperimentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteExperimentRunResponse deleteExperimentRun(DeleteExperimentRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentRunDetails(), "deleteExperimentRunDetails is required");
        


return clientCall(request, DeleteExperimentRunResponse::builder)
        .logger(LOG, "deleteExperimentRun")
        .serviceDetails("MLOps", "DeleteExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentRunResponseDetails.class, DeleteExperimentRunResponse.Builder::deleteExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteExperimentRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteExperimentRunTagResponse deleteExperimentRunTag(DeleteExperimentRunTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentRunTagDetails(), "deleteExperimentRunTagDetails is required");
        


return clientCall(request, DeleteExperimentRunTagResponse::builder)
        .logger(LOG, "deleteExperimentRunTag")
        .serviceDetails("MLOps", "DeleteExperimentRunTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteExperimentRunTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentRunTagResponseDetails.class, DeleteExperimentRunTagResponse.Builder::deleteExperimentRunTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteExperimentRunTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteExperimentRunTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteExperimentTagResponse deleteExperimentTag(DeleteExperimentTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getDeleteExperimentTagDetails(), "deleteExperimentTagDetails is required");
        


return clientCall(request, DeleteExperimentTagResponse::builder)
        .logger(LOG, "deleteExperimentTag")
        .serviceDetails("MLOps", "DeleteExperimentTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteExperimentTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("delete-experiment-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteExperimentTagResponseDetails.class, DeleteExperimentTagResponse.Builder::deleteExperimentTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteExperimentTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteExperimentTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteModelVersionResponse deleteModelVersion(DeleteModelVersionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteModelVersionDetails(), "deleteModelVersionDetails is required");
        


return clientCall(request, DeleteModelVersionResponse::builder)
        .logger(LOG, "deleteModelVersion")
        .serviceDetails("MLOps", "DeleteModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteModelVersionResponseDetails.class, DeleteModelVersionResponse.Builder::deleteModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteModelVersionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteModelVersionTagResponse deleteModelVersionTag(DeleteModelVersionTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteModelVersionTagDetails(), "deleteModelVersionTagDetails is required");
        


return clientCall(request, DeleteModelVersionTagResponse::builder)
        .logger(LOG, "deleteModelVersionTag")
        .serviceDetails("MLOps", "DeleteModelVersionTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteModelVersionTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails.class, DeleteModelVersionTagResponse.Builder::deleteModelVersionTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteModelVersionTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteModelVersionTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteRegisteredModelResponse deleteRegisteredModel(DeleteRegisteredModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteRegisteredModelDetails(), "deleteRegisteredModelDetails is required");
        


return clientCall(request, DeleteRegisteredModelResponse::builder)
        .logger(LOG, "deleteRegisteredModel")
        .serviceDetails("MLOps", "DeleteRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("delete")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteRegisteredModelResponseDetails.class, DeleteRegisteredModelResponse.Builder::deleteRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteRegisteredModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteRegisteredModelTagResponse deleteRegisteredModelTag(DeleteRegisteredModelTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getDeleteRegisteredModelTagDetails(), "deleteRegisteredModelTagDetails is required");
        


return clientCall(request, DeleteRegisteredModelTagResponse::builder)
        .logger(LOG, "deleteRegisteredModelTag")
        .serviceDetails("MLOps", "DeleteRegisteredModelTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DeleteRegisteredModelTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("delete-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.DeleteRegisteredModelTagResponseDetails.class, DeleteRegisteredModelTagResponse.Builder::deleteRegisteredModelTagResponseDetails)
                .handleResponseHeaderString("etag", 
            DeleteRegisteredModelTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DeleteRegisteredModelTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetExperimentByIdResponse getExperimentById(GetExperimentByIdRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getExperimentId(), "experimentId is required");
        


return clientCall(request, GetExperimentByIdResponse::builder)
        .logger(LOG, "getExperimentById")
        .serviceDetails("MLOps", "GetExperimentById", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetExperimentByIdRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("get")
            
                
                    
                    .appendQueryParam("experiment_id", request.getExperimentId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentResponse.class, GetExperimentByIdResponse.Builder::experimentResponse)
                .handleResponseHeaderString("etag", 
            GetExperimentByIdResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetExperimentByIdResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetExperimentByNameResponse getExperimentByName(GetExperimentByNameRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getExperimentName(), "experimentName is required");
        


return clientCall(request, GetExperimentByNameResponse::builder)
        .logger(LOG, "getExperimentByName")
        .serviceDetails("MLOps", "GetExperimentByName", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetExperimentByNameRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("get-by-name")
            
                
                    
                    .appendQueryParam("experiment_name", request.getExperimentName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentResponse.class, GetExperimentByNameResponse.Builder::experimentResponse)
                .handleResponseHeaderString("etag", 
            GetExperimentByNameResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetExperimentByNameResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetExperimentRunByIdResponse getExperimentRunById(GetExperimentRunByIdRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        


return clientCall(request, GetExperimentRunByIdResponse::builder)
        .logger(LOG, "getExperimentRunById")
        .serviceDetails("MLOps", "GetExperimentRunById", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetExperimentRunByIdRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("get")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetExperimentRunResponseDetails.class, GetExperimentRunByIdResponse.Builder::getExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            GetExperimentRunByIdResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetExperimentRunByIdResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetExperimentRunMetricHistoryResponse getExperimentRunMetricHistory(GetExperimentRunMetricHistoryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        
        Objects.requireNonNull(request.getMetricKey(), "metricKey is required");
        


return clientCall(request, GetExperimentRunMetricHistoryResponse::builder)
        .logger(LOG, "getExperimentRunMetricHistory")
        .serviceDetails("MLOps", "GetExperimentRunMetricHistory", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetExperimentRunMetricHistoryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("metrics").appendPathParam("get-history")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
            
                
                    
                    .appendQueryParam("metric_key", request.getMetricKey())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentRunMetricHistoryCollection.class, GetExperimentRunMetricHistoryResponse.Builder::experimentRunMetricHistoryCollection)
                .handleResponseHeaderString("opc-request-id", 
            GetExperimentRunMetricHistoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            GetExperimentRunMetricHistoryResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public GetModelVersionResponse getModelVersion(GetModelVersionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");
        
        Objects.requireNonNull(request.getVersion(), "version is required");
        


return clientCall(request, GetModelVersionResponse::builder)
        .logger(LOG, "getModelVersion")
        .serviceDetails("MLOps", "GetModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("get")
            
                
                    
                    .appendQueryParam("name", request.getName())
            
                
                    
                    .appendQueryParam("version", request.getVersion())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetModelVersionResponseDetails.class, GetModelVersionResponse.Builder::getModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            GetModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetModelVersionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetRegisteredModelResponse getRegisteredModel(GetRegisteredModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getName(), "name is required");
        


return clientCall(request, GetRegisteredModelResponse::builder)
        .logger(LOG, "getRegisteredModel")
        .serviceDetails("MLOps", "GetRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("get")
            
                
                    
                    .appendQueryParam("name", request.getName())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GetRegisteredModelResponseDetails.class, GetRegisteredModelResponse.Builder::getRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            GetRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetRegisteredModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRunId(), "runId is required");
        


return clientCall(request, ListArtifactsResponse::builder)
        .logger(LOG, "listArtifacts")
        .serviceDetails("MLOps", "ListArtifacts", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListArtifactsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("artifacts").appendPathParam("list")
            
                
                    
                    .appendQueryParam("run_id", request.getRunId())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ArtifactList.class, ListArtifactsResponse.Builder::artifactList)
                .handleResponseHeaderString("opc-request-id", 
            ListArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListArtifactsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListExperimentRunsResponse listExperimentRuns(ListExperimentRunsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListExperimentRunsDetails(), "listExperimentRunsDetails is required");
        


return clientCall(request, ListExperimentRunsResponse::builder)
        .logger(LOG, "listExperimentRuns")
        .serviceDetails("MLOps", "ListExperimentRuns", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListExperimentRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentRunCollection.class, ListExperimentRunsResponse.Builder::experimentRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListExperimentRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListExperimentRunsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListExperimentsResponse listExperiments(ListExperimentsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListExperimentsDetails(), "listExperimentsDetails is required");
        


return clientCall(request, ListExperimentsResponse::builder)
        .logger(LOG, "listExperiments")
        .serviceDetails("MLOps", "ListExperiments", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListExperimentsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExperimentCollection.class, ListExperimentsResponse.Builder::experimentCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListExperimentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListExperimentsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListLoggedModelsResponse listLoggedModels(ListLoggedModelsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getListLoggedModelsDetails(), "listLoggedModelsDetails is required");
        


return clientCall(request, ListLoggedModelsResponse::builder)
        .logger(LOG, "listLoggedModels")
        .serviceDetails("MLOps", "ListLoggedModels", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ListLoggedModelsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("logged-models").appendPathParam("search")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LoggedModelCollection.class, ListLoggedModelsResponse.Builder::loggedModelCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListLoggedModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListLoggedModelsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListModelVersionsResponse listModelVersions(ListModelVersionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListModelVersionsResponse::builder)
        .logger(LOG, "listModelVersions")
        .serviceDetails("MLOps", "ListModelVersions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListModelVersionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("search")
            
                
                    
                    .appendQueryParam("filter", request.getFilter())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("order_by", request.getOrderBy())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ModelVersionCollection.class, ListModelVersionsResponse.Builder::modelVersionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListModelVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListModelVersionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListRegisteredModelsResponse listRegisteredModels(ListRegisteredModelsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListRegisteredModelsResponse::builder)
        .logger(LOG, "listRegisteredModels")
        .serviceDetails("MLOps", "ListRegisteredModels", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListRegisteredModelsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("search")
            
                
                    
                    .appendQueryParam("filter", request.getFilter())
            
                
                    
                    .appendQueryParam("max_results", request.getMaxResults())
            
                
                    
                    .appendQueryParam("page_token", request.getPageToken())
            
                
                    
                    .appendQueryParam("order_by", request.getOrderBy())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RegisteredModelCollection.class, ListRegisteredModelsResponse.Builder::registeredModelCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRegisteredModelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRegisteredModelsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public LogExperimentRunBatchResponse logExperimentRunBatch(LogExperimentRunBatchRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunBatchDetails(), "logExperimentRunBatchDetails is required");
        


return clientCall(request, LogExperimentRunBatchResponse::builder)
        .logger(LOG, "logExperimentRunBatch")
        .serviceDetails("MLOps", "LogExperimentRunBatch", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogExperimentRunBatchRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-batch")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunBatchResponseDetails.class, LogExperimentRunBatchResponse.Builder::logExperimentRunBatchResponseDetails)
                .handleResponseHeaderString("etag", 
            LogExperimentRunBatchResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogExperimentRunBatchResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public LogExperimentRunInputsResponse logExperimentRunInputs(LogExperimentRunInputsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunInputsDetails(), "logExperimentRunInputsDetails is required");
        


return clientCall(request, LogExperimentRunInputsResponse::builder)
        .logger(LOG, "logExperimentRunInputs")
        .serviceDetails("MLOps", "LogExperimentRunInputs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogExperimentRunInputsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-inputs")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunInputsResponseDetails.class, LogExperimentRunInputsResponse.Builder::logExperimentRunInputsResponseDetails)
                .handleResponseHeaderString("etag", 
            LogExperimentRunInputsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogExperimentRunInputsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public LogExperimentRunMetricResponse logExperimentRunMetric(LogExperimentRunMetricRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunMetricDetails(), "logExperimentRunMetricDetails is required");
        


return clientCall(request, LogExperimentRunMetricResponse::builder)
        .logger(LOG, "logExperimentRunMetric")
        .serviceDetails("MLOps", "LogExperimentRunMetric", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogExperimentRunMetricRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-metric")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunMetricResponseDetails.class, LogExperimentRunMetricResponse.Builder::logExperimentRunMetricResponseDetails)
                .handleResponseHeaderString("etag", 
            LogExperimentRunMetricResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogExperimentRunMetricResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public LogExperimentRunModelResponse logExperimentRunModel(LogExperimentRunModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunModelDetails(), "logExperimentRunModelDetails is required");
        


return clientCall(request, LogExperimentRunModelResponse::builder)
        .logger(LOG, "logExperimentRunModel")
        .serviceDetails("MLOps", "LogExperimentRunModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogExperimentRunModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-model")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunModelResponseDetails.class, LogExperimentRunModelResponse.Builder::logExperimentRunModelResponseDetails)
                .handleResponseHeaderString("etag", 
            LogExperimentRunModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogExperimentRunModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public LogExperimentRunParamResponse logExperimentRunParam(LogExperimentRunParamRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getLogExperimentRunParamDetails(), "logExperimentRunParamDetails is required");
        


return clientCall(request, LogExperimentRunParamResponse::builder)
        .logger(LOG, "logExperimentRunParam")
        .serviceDetails("MLOps", "LogExperimentRunParam", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(LogExperimentRunParamRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("log-parameter")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.LogExperimentRunParamResponseDetails.class, LogExperimentRunParamResponse.Builder::logExperimentRunParamResponseDetails)
                .handleResponseHeaderString("etag", 
            LogExperimentRunParamResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            LogExperimentRunParamResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RenameRegisteredModelResponse renameRegisteredModel(RenameRegisteredModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getRenameRegisteredModelDetails(), "renameRegisteredModelDetails is required");
        


return clientCall(request, RenameRegisteredModelResponse::builder)
        .logger(LOG, "renameRegisteredModel")
        .serviceDetails("MLOps", "RenameRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RenameRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("rename")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RenameRegisteredModelResponseDetails.class, RenameRegisteredModelResponse.Builder::renameRegisteredModelResponseDetails)
                .handleResponseHeaderString("opc-request-id", 
            RenameRegisteredModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RestoreExperimentResponse restoreExperiment(RestoreExperimentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRestoreExperimentDetails(), "restoreExperimentDetails is required");
        


return clientCall(request, RestoreExperimentResponse::builder)
        .logger(LOG, "restoreExperiment")
        .serviceDetails("MLOps", "RestoreExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestoreExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("restore")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RestoreExperimentResponseDetails.class, RestoreExperimentResponse.Builder::restoreExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            RestoreExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RestoreExperimentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RestoreExperimentRunResponse restoreExperimentRun(RestoreExperimentRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRestoreExperimentRunDetails(), "restoreExperimentRunDetails is required");
        


return clientCall(request, RestoreExperimentRunResponse::builder)
        .logger(LOG, "restoreExperimentRun")
        .serviceDetails("MLOps", "RestoreExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestoreExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("restore")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.RestoreExperimentRunResponseDetails.class, RestoreExperimentRunResponse.Builder::restoreExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            RestoreExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RestoreExperimentRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public SetExperimentRunTagResponse setExperimentRunTag(SetExperimentRunTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSetExperimentRunTagDetails(), "setExperimentRunTagDetails is required");
        


return clientCall(request, SetExperimentRunTagResponse::builder)
        .logger(LOG, "setExperimentRunTag")
        .serviceDetails("MLOps", "SetExperimentRunTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetExperimentRunTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails.class, SetExperimentRunTagResponse.Builder::setExperimentRunTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetExperimentRunTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetExperimentRunTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public SetExperimentTagResponse setExperimentTag(SetExperimentTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getSetExperimentTagDetails(), "setExperimentTagDetails is required");
        


return clientCall(request, SetExperimentTagResponse::builder)
        .logger(LOG, "setExperimentTag")
        .serviceDetails("MLOps", "SetExperimentTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetExperimentTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("set-experiment-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails.class, SetExperimentTagResponse.Builder::setExperimentTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetExperimentTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetExperimentTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public SetModelVersionTagResponse setModelVersionTag(SetModelVersionTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getSetModelVersionTagDetails(), "setModelVersionTagDetails is required");
        


return clientCall(request, SetModelVersionTagResponse::builder)
        .logger(LOG, "setModelVersionTag")
        .serviceDetails("MLOps", "SetModelVersionTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetModelVersionTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails.class, SetModelVersionTagResponse.Builder::setModelVersionTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetModelVersionTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetModelVersionTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public SetRegisteredModelTagResponse setRegisteredModelTag(SetRegisteredModelTagRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getSetRegisteredModelTagDetails(), "setRegisteredModelTagDetails is required");
        


return clientCall(request, SetRegisteredModelTagResponse::builder)
        .logger(LOG, "setRegisteredModelTag")
        .serviceDetails("MLOps", "SetRegisteredModelTag", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SetRegisteredModelTagRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("set-tag")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SetRegisteredModelTagResponseDetails.class, SetRegisteredModelTagResponse.Builder::setRegisteredModelTagResponseDetails)
                .handleResponseHeaderString("etag", 
            SetRegisteredModelTagResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SetRegisteredModelTagResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public TransitionModelVersionStageResponse transitionModelVersionStage(TransitionModelVersionStageRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getTransitionModelVersionStageDetails(), "transitionModelVersionStageDetails is required");
        


return clientCall(request, TransitionModelVersionStageResponse::builder)
        .logger(LOG, "transitionModelVersionStage")
        .serviceDetails("MLOps", "TransitionModelVersionStage", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(TransitionModelVersionStageRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("transition-stage")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.TransitionModelVersionStageResponseDetails.class, TransitionModelVersionStageResponse.Builder::transitionModelVersionStageResponseDetails)
                .handleResponseHeaderString("etag", 
            TransitionModelVersionStageResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            TransitionModelVersionStageResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateExperimentResponse updateExperiment(UpdateExperimentRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentDetails(), "updateExperimentDetails is required");
        


return clientCall(request, UpdateExperimentResponse::builder)
        .logger(LOG, "updateExperiment")
        .serviceDetails("MLOps", "UpdateExperiment", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateExperimentRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("experiments").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentResponseDetails.class, UpdateExperimentResponse.Builder::updateExperimentResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateExperimentResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateExperimentResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateExperimentRunResponse updateExperimentRun(UpdateExperimentRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentRunDetails(), "updateExperimentRunDetails is required");
        


return clientCall(request, UpdateExperimentRunResponse::builder)
        .logger(LOG, "updateExperimentRun")
        .serviceDetails("MLOps", "UpdateExperimentRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateExperimentRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("runs").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentRunResponseDetails.class, UpdateExperimentRunResponse.Builder::updateExperimentRunResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateExperimentRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateExperimentRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateExperimentRunTagsResponse updateExperimentRunTags(UpdateExperimentRunTagsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentRunTagsDetails(), "updateExperimentRunTagsDetails is required");
        


return clientCall(request, UpdateExperimentRunTagsResponse::builder)
        .logger(LOG, "updateExperimentRunTags")
        .serviceDetails("MLOps", "UpdateExperimentRunTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateExperimentRunTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("runs").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails.class, UpdateExperimentRunTagsResponse.Builder::updateExperimentRunTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateExperimentRunTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateExperimentRunTagsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateExperimentTagsResponse updateExperimentTags(UpdateExperimentTagsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUpdateExperimentTagsDetails(), "updateExperimentTagsDetails is required");
        


return clientCall(request, UpdateExperimentTagsResponse::builder)
        .logger(LOG, "updateExperimentTags")
        .serviceDetails("MLOps", "UpdateExperimentTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateExperimentTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("experiments").appendPathParam("update-experiment-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateExperimentTagsResponseDetails.class, UpdateExperimentTagsResponse.Builder::updateExperimentTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateExperimentTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateExperimentTagsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateModelVersionResponse updateModelVersion(UpdateModelVersionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateModelVersionDetails(), "updateModelVersionDetails is required");
        


return clientCall(request, UpdateModelVersionResponse::builder)
        .logger(LOG, "updateModelVersion")
        .serviceDetails("MLOps", "UpdateModelVersion", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateModelVersionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("model-versions").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateModelVersionResponseDetails.class, UpdateModelVersionResponse.Builder::updateModelVersionResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateModelVersionResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateModelVersionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateModelVersionTagsResponse updateModelVersionTags(UpdateModelVersionTagsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateModelVersionTagsDetails(), "updateModelVersionTagsDetails is required");
        


return clientCall(request, UpdateModelVersionTagsResponse::builder)
        .logger(LOG, "updateModelVersionTags")
        .serviceDetails("MLOps", "UpdateModelVersionTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateModelVersionTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("model-versions").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateModelVersionTagsResponseDetails.class, UpdateModelVersionTagsResponse.Builder::updateModelVersionTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateModelVersionTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateModelVersionTagsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateRegisteredModelResponse updateRegisteredModel(UpdateRegisteredModelRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateRegisteredModelDetails(), "updateRegisteredModelDetails is required");
        


return clientCall(request, UpdateRegisteredModelResponse::builder)
        .logger(LOG, "updateRegisteredModel")
        .serviceDetails("MLOps", "UpdateRegisteredModel", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateRegisteredModelRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("registered-models").appendPathParam("update")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateRegisteredModelResponseDetails.class, UpdateRegisteredModelResponse.Builder::updateRegisteredModelResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateRegisteredModelResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateRegisteredModelResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateRegisteredModelTagsResponse updateRegisteredModelTags(UpdateRegisteredModelTagsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getUpdateRegisteredModelTagsDetails(), "updateRegisteredModelTagsDetails is required");
        


return clientCall(request, UpdateRegisteredModelTagsResponse::builder)
        .logger(LOG, "updateRegisteredModelTags")
        .serviceDetails("MLOps", "UpdateRegisteredModelTags", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UpdateRegisteredModelTagsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("mlops").appendPathParam("api").appendPathParam("2.0").appendPathParam("mlflow").appendPathParam("internal").appendPathParam("registered-models").appendPathParam("update-tags")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UpdateRegisteredModelTagsResponseDetails.class, UpdateRegisteredModelTagsResponse.Builder::updateRegisteredModelTagsResponseDetails)
                .handleResponseHeaderString("etag", 
            UpdateRegisteredModelTagsResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateRegisteredModelTagsResponse.Builder::opcRequestId)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public MLOpsClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public MLOpsClient(
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
    public MLOpsClient(
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
    public MLOpsClient(
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
    public MLOpsClient(
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
