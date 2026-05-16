// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkflowAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements WorkflowAsync {
    /**
     * Service instance for Workflow.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKFLOW").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkflowAsyncClient.class);

    WorkflowAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkflowAsyncClient> {
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
        public WorkflowAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkflowAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CancelAiDataPlatformJobRunResponse> cancelAiDataPlatformJobRun(CancelAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunRequest, CancelAiDataPlatformJobRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, CancelAiDataPlatformJobRunResponse::builder)
        .logger(LOG, "cancelAiDataPlatformJobRun")
        .serviceDetails("Workflow", "CancelAiDataPlatformJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CancelAiDataPlatformJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey()).appendPathParam("actions").appendPathParam("cancel")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, CancelAiDataPlatformJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            CancelAiDataPlatformJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CancelAiDataPlatformJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CancelAiDataPlatformJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CancelAiDataPlatformJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CancelAiDataPlatformJobRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CancelAiDataPlatformJobRunsResponse> cancelAiDataPlatformJobRuns(CancelAiDataPlatformJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<CancelAiDataPlatformJobRunsRequest, CancelAiDataPlatformJobRunsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, CancelAiDataPlatformJobRunsResponse::builder)
        .logger(LOG, "cancelAiDataPlatformJobRuns")
        .serviceDetails("Workflow", "CancelAiDataPlatformJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CancelAiDataPlatformJobRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("actions").appendPathParam("cancelJobRuns")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            CancelAiDataPlatformJobRunsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CancelAiDataPlatformJobRunsResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformJobResponse> createAiDataPlatformJob(CreateAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRequest, CreateAiDataPlatformJobResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");
        


return clientCall(request, CreateAiDataPlatformJobResponse::builder)
        .logger(LOG, "createAiDataPlatformJob")
        .serviceDetails("Workflow", "CreateAiDataPlatformJob", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, CreateAiDataPlatformJobResponse.Builder::job)
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformJobResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformJobResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformJobResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformJobRunResponse> createAiDataPlatformJobRun(CreateAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformJobRunRequest, CreateAiDataPlatformJobRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateJobRunDetails(), "createJobRunDetails is required");
        


return clientCall(request, CreateAiDataPlatformJobRunResponse::builder)
        .logger(LOG, "createAiDataPlatformJobRun")
        .serviceDetails("Workflow", "CreateAiDataPlatformJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, CreateAiDataPlatformJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformJobRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformJobResponse> deleteAiDataPlatformJob(DeleteAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRequest, DeleteAiDataPlatformJobResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, DeleteAiDataPlatformJobResponse::builder)
        .logger(LOG, "deleteAiDataPlatformJob")
        .serviceDetails("Workflow", "DeleteAiDataPlatformJob", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformJobResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformJobRunResponse> deleteAiDataPlatformJobRun(DeleteAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformJobRunRequest, DeleteAiDataPlatformJobRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, DeleteAiDataPlatformJobRunResponse::builder)
        .logger(LOG, "deleteAiDataPlatformJobRun")
        .serviceDetails("Workflow", "DeleteAiDataPlatformJobRun", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformJobRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ExportAiDataPlatformTaskRunOutputResponse> exportAiDataPlatformTaskRunOutput(ExportAiDataPlatformTaskRunOutputRequest request, final com.oracle.bmc.responses.AsyncHandler<ExportAiDataPlatformTaskRunOutputRequest, ExportAiDataPlatformTaskRunOutputResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");
        
        Validate.notBlank(request.getTaskRunOutputKey(), "taskRunOutputKey must not be blank");
        Objects.requireNonNull(request.getExportTaskRunOutputDetails(), "exportTaskRunOutputDetails is required");
        


return clientCall(request, ExportAiDataPlatformTaskRunOutputResponse::builder)
        .logger(LOG, "exportAiDataPlatformTaskRunOutput")
        .serviceDetails("Workflow", "ExportAiDataPlatformTaskRunOutput", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ExportAiDataPlatformTaskRunOutputRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey()).appendPathParam("outputs").appendPathParam(request.getTaskRunOutputKey()).appendPathParam("actions").appendPathParam("export")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedTaskRunOutputContents.class, ExportAiDataPlatformTaskRunOutputResponse.Builder::exportedTaskRunOutputContents)
                .handleResponseHeaderString("etag", 
            ExportAiDataPlatformTaskRunOutputResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportAiDataPlatformTaskRunOutputResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<FetchAiDataPlatformOutputResponse> fetchAiDataPlatformOutput(FetchAiDataPlatformOutputRequest request, final com.oracle.bmc.responses.AsyncHandler<FetchAiDataPlatformOutputRequest, FetchAiDataPlatformOutputResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");
        Objects.requireNonNull(request.getFetchOutputDetails(), "fetchOutputDetails is required");
        


return clientCall(request, FetchAiDataPlatformOutputResponse::builder)
        .logger(LOG, "fetchAiDataPlatformOutput")
        .serviceDetails("Workflow", "FetchAiDataPlatformOutput", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(FetchAiDataPlatformOutputRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey()).appendPathParam("actions").appendPathParam("fetchOutput")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRunOutput.class, FetchAiDataPlatformOutputResponse.Builder::taskRunOutput)
                .handleResponseHeaderString("opc-request-id", 
            FetchAiDataPlatformOutputResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            FetchAiDataPlatformOutputResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformJobResponse> getAiDataPlatformJob(GetAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRequest, GetAiDataPlatformJobResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, GetAiDataPlatformJobResponse::builder)
        .logger(LOG, "getAiDataPlatformJob")
        .serviceDetails("Workflow", "GetAiDataPlatformJob", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, GetAiDataPlatformJobResponse.Builder::job)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformJobResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformJobRunResponse> getAiDataPlatformJobRun(GetAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformJobRunRequest, GetAiDataPlatformJobRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, GetAiDataPlatformJobRunResponse::builder)
        .logger(LOG, "getAiDataPlatformJobRun")
        .serviceDetails("Workflow", "GetAiDataPlatformJobRun", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, GetAiDataPlatformJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformJobRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformTaskRunResponse> getAiDataPlatformTaskRun(GetAiDataPlatformTaskRunRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformTaskRunRequest, GetAiDataPlatformTaskRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");


return clientCall(request, GetAiDataPlatformTaskRunResponse::builder)
        .logger(LOG, "getAiDataPlatformTaskRun")
        .serviceDetails("Workflow", "GetAiDataPlatformTaskRun", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformTaskRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRun.class, GetAiDataPlatformTaskRunResponse.Builder::taskRun)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformTaskRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformTaskRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformJobPermissionsResponse> listAiDataPlatformJobPermissions(ListAiDataPlatformJobPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobPermissionsRequest, ListAiDataPlatformJobPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, ListAiDataPlatformJobPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformJobPermissions")
        .serviceDetails("Workflow", "ListAiDataPlatformJobPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformJobPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobPermissionCollection.class, ListAiDataPlatformJobPermissionsResponse.Builder::jobPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformJobPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformJobPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformJobRunsResponse> listAiDataPlatformJobRuns(ListAiDataPlatformJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobRunsRequest, ListAiDataPlatformJobRunsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAiDataPlatformJobRunsResponse::builder)
        .logger(LOG, "listAiDataPlatformJobRuns")
        .serviceDetails("Workflow", "ListAiDataPlatformJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformJobRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                .appendListQueryParam("jobKey", request.getJobKey(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                .appendListQueryParam("status", request.getStatus(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                
                    
                    .appendQueryParam("timeCreatedGreaterThanOrEqualTo", request.getTimeCreatedGreaterThanOrEqualTo())
            
                
                    
                    .appendQueryParam("timeCreatedLessThanOrEqualTo", request.getTimeCreatedLessThanOrEqualTo())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRunCollection.class, ListAiDataPlatformJobRunsResponse.Builder::jobRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformJobRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformJobRunsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformJobsResponse> listAiDataPlatformJobs(ListAiDataPlatformJobsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformJobsRequest, ListAiDataPlatformJobsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAiDataPlatformJobsResponse::builder)
        .logger(LOG, "listAiDataPlatformJobs")
        .serviceDetails("Workflow", "ListAiDataPlatformJobs", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformJobsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("createdBy", request.getCreatedBy())
            
                
                    
                    .appendQueryParam("updatedBy", request.getUpdatedBy())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobCollection.class, ListAiDataPlatformJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", 
            ListAiDataPlatformJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListAiDataPlatformJobsResponse.Builder::opcTotalItems)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRecentJobRunsResponse> listAiDataPlatformRecentJobRuns(ListAiDataPlatformRecentJobRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecentJobRunsRequest, ListAiDataPlatformRecentJobRunsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getJobKey(), "jobKey is required");
        


return clientCall(request, ListAiDataPlatformRecentJobRunsResponse::builder)
        .logger(LOG, "listAiDataPlatformRecentJobRuns")
        .serviceDetails("Workflow", "ListAiDataPlatformRecentJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRecentJobRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("recentJobRuns")
            
                .appendListQueryParam("jobKey", request.getJobKey(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                
                    
                    .appendQueryParam("recordCount", request.getRecordCount())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRunCollection.class, ListAiDataPlatformRecentJobRunsResponse.Builder::jobRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRecentJobRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRecentJobRunsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformTaskRunsResponse> listAiDataPlatformTaskRuns(ListAiDataPlatformTaskRunsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformTaskRunsRequest, ListAiDataPlatformTaskRunsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getJobRunKey(), "jobRunKey is required");
        


return clientCall(request, ListAiDataPlatformTaskRunsResponse::builder)
        .logger(LOG, "listAiDataPlatformTaskRuns")
        .serviceDetails("Workflow", "ListAiDataPlatformTaskRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformTaskRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns")
            
                
                    
                    .appendQueryParam("jobRunKey", request.getJobRunKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                .appendListQueryParam("status", request.getStatus(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                
                    
                    .appendQueryParam("parentJobRunKey", request.getParentJobRunKey())
            
                
                    
                    .appendQueryParam("rootJobRunKey", request.getRootJobRunKey())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRunCollection.class, ListAiDataPlatformTaskRunsResponse.Builder::taskRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformTaskRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformTaskRunsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformJobPermissionResponse> manageAiDataPlatformJobPermission(ManageAiDataPlatformJobPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformJobPermissionRequest, ManageAiDataPlatformJobPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(request.getManageJobPermissionDetails(), "manageJobPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformJobPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformJobPermission")
        .serviceDetails("Workflow", "ManageAiDataPlatformJobPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformJobPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformJobPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RepairAiDataPlatformJobRunResponse> repairAiDataPlatformJobRun(RepairAiDataPlatformJobRunRequest request, final com.oracle.bmc.responses.AsyncHandler<RepairAiDataPlatformJobRunRequest, RepairAiDataPlatformJobRunResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");
        Objects.requireNonNull(request.getRepairJobRunDetails(), "repairJobRunDetails is required");
        


return clientCall(request, RepairAiDataPlatformJobRunResponse::builder)
        .logger(LOG, "repairAiDataPlatformJobRun")
        .serviceDetails("Workflow", "RepairAiDataPlatformJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RepairAiDataPlatformJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey()).appendPathParam("actions").appendPathParam("repair")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, RepairAiDataPlatformJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            RepairAiDataPlatformJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            RepairAiDataPlatformJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            RepairAiDataPlatformJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            RepairAiDataPlatformJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            RepairAiDataPlatformJobRunResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformJobResponse> updateAiDataPlatformJob(UpdateAiDataPlatformJobRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformJobRequest, UpdateAiDataPlatformJobResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");
        


return clientCall(request, UpdateAiDataPlatformJobResponse::builder)
        .logger(LOG, "updateAiDataPlatformJob")
        .serviceDetails("Workflow", "UpdateAiDataPlatformJob", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, UpdateAiDataPlatformJobResponse.Builder::job)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformJobResponse.Builder::etag)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public WorkflowAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkflowAsyncClient(
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
    public WorkflowAsyncClient (
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
    public WorkflowAsyncClient (
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
    public WorkflowAsyncClient (
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
