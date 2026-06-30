// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkflowClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Workflow {
    /**
     * Service instance for Workflow.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKFLOW").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkflowClient.class);



    WorkflowClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkflowClient> {
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
        public WorkflowClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkflowClient(this, authenticationDetailsProvider);
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
    
    public CancelJobRunResponse cancelJobRun(CancelJobRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, CancelJobRunResponse::builder)
        .logger(LOG, "cancelJobRun")
        .serviceDetails("Workflow", "CancelJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CancelJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey()).appendPathParam("actions").appendPathParam("cancel")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, CancelJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            CancelJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CancelJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CancelJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CancelJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CancelJobRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CancelJobRunsResponse cancelJobRuns(CancelJobRunsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, CancelJobRunsResponse::builder)
        .logger(LOG, "cancelJobRuns")
        .serviceDetails("Workflow", "CancelJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CancelJobRunsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("actions").appendPathParam("cancelJobRuns")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            CancelJobRunsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CancelJobRunsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateJobResponse createJob(CreateJobRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateJobDetails(), "createJobDetails is required");
        


return clientCall(request, CreateJobResponse::builder)
        .logger(LOG, "createJob")
        .serviceDetails("Workflow", "CreateJob", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, CreateJobResponse.Builder::job)
                .handleResponseHeaderString("location", 
            CreateJobResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateJobResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateJobResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateJobRunResponse createJobRun(CreateJobRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateJobRunDetails(), "createJobRunDetails is required");
        


return clientCall(request, CreateJobRunResponse::builder)
        .logger(LOG, "createJobRun")
        .serviceDetails("Workflow", "CreateJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, CreateJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            CreateJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateJobRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, DeleteJobResponse::builder)
        .logger(LOG, "deleteJob")
        .serviceDetails("Workflow", "DeleteJob", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteJobResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteJobRunResponse deleteJobRun(DeleteJobRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, DeleteJobRunResponse::builder)
        .logger(LOG, "deleteJobRun")
        .serviceDetails("Workflow", "DeleteJobRun", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteJobRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ExportTaskRunOutputResponse exportTaskRunOutput(ExportTaskRunOutputRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");
        
        Validate.notBlank(request.getTaskRunOutputKey(), "taskRunOutputKey must not be blank");
        Objects.requireNonNull(request.getExportTaskRunOutputDetails(), "exportTaskRunOutputDetails is required");
        


return clientCall(request, ExportTaskRunOutputResponse::builder)
        .logger(LOG, "exportTaskRunOutput")
        .serviceDetails("Workflow", "ExportTaskRunOutput", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ExportTaskRunOutputRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey()).appendPathParam("outputs").appendPathParam(request.getTaskRunOutputKey()).appendPathParam("actions").appendPathParam("export")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ExportedTaskRunOutputContents.class, ExportTaskRunOutputResponse.Builder::exportedTaskRunOutputContents)
                .handleResponseHeaderString("etag", 
            ExportTaskRunOutputResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            ExportTaskRunOutputResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public FetchOutputResponse fetchOutput(FetchOutputRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");
        Objects.requireNonNull(request.getFetchOutputDetails(), "fetchOutputDetails is required");
        


return clientCall(request, FetchOutputResponse::builder)
        .logger(LOG, "fetchOutput")
        .serviceDetails("Workflow", "FetchOutput", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(FetchOutputRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey()).appendPathParam("actions").appendPathParam("fetchOutput")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRunOutput.class, FetchOutputResponse.Builder::taskRunOutput)
                .handleResponseHeaderString("opc-request-id", 
            FetchOutputResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            FetchOutputResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public GetJobResponse getJob(GetJobRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, GetJobResponse::builder)
        .logger(LOG, "getJob")
        .serviceDetails("Workflow", "GetJob", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, GetJobResponse.Builder::job)
                .handleResponseHeaderString("etag", 
            GetJobResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetJobResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetJobRunResponse getJobRun(GetJobRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");


return clientCall(request, GetJobRunResponse::builder)
        .logger(LOG, "getJobRun")
        .serviceDetails("Workflow", "GetJobRun", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, GetJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("etag", 
            GetJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetJobRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetTaskRunResponse getTaskRun(GetTaskRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getTaskRunKey(), "taskRunKey must not be blank");


return clientCall(request, GetTaskRunResponse::builder)
        .logger(LOG, "getTaskRun")
        .serviceDetails("Workflow", "GetTaskRun", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetTaskRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("taskRuns").appendPathParam(request.getTaskRunKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRun.class, GetTaskRunResponse.Builder::taskRun)
                .handleResponseHeaderString("etag", 
            GetTaskRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetTaskRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListJobPermissionsResponse listJobPermissions(ListJobPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");


return clientCall(request, ListJobPermissionsResponse::builder)
        .logger(LOG, "listJobPermissions")
        .serviceDetails("Workflow", "ListJobPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListJobPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobPermissionCollection.class, ListJobPermissionsResponse.Builder::jobPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListJobPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListJobPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListJobRunsResponse listJobRuns(ListJobRunsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListJobRunsResponse::builder)
        .logger(LOG, "listJobRuns")
        .serviceDetails("Workflow", "ListJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListJobRunsRequest::builder)
        
        
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRunCollection.class, ListJobRunsResponse.Builder::jobRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListJobRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListJobRunsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListJobsResponse listJobs(ListJobsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListJobsResponse::builder)
        .logger(LOG, "listJobs")
        .serviceDetails("Workflow", "ListJobs", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListJobsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                .appendListQueryParam("jobKey", request.getJobKey(), com.oracle.bmc.util.internal.CollectionFormatType.Multi)
            
                
                    
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobCollection.class, ListJobsResponse.Builder::jobCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", 
            ListJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListJobsResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public ListRecentJobRunsResponse listRecentJobRuns(ListRecentJobRunsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getJobKey(), "jobKey is required");
        


return clientCall(request, ListRecentJobRunsResponse::builder)
        .logger(LOG, "listRecentJobRuns")
        .serviceDetails("Workflow", "ListRecentJobRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListRecentJobRunsRequest::builder)
        
        
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.JobRunCollection.class, ListRecentJobRunsResponse.Builder::jobRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecentJobRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecentJobRunsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListTaskRunsResponse listTaskRuns(ListTaskRunsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getJobRunKey(), "jobRunKey is required");
        


return clientCall(request, ListTaskRunsResponse::builder)
        .logger(LOG, "listTaskRuns")
        .serviceDetails("Workflow", "ListTaskRuns", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListTaskRunsRequest::builder)
        
        
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TaskRunCollection.class, ListTaskRunsResponse.Builder::taskRunCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListTaskRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListTaskRunsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageJobPermissionResponse manageJobPermission(ManageJobPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(request.getManageJobPermissionDetails(), "manageJobPermissionDetails is required");
        


return clientCall(request, ManageJobPermissionResponse::builder)
        .logger(LOG, "manageJobPermission")
        .serviceDetails("Workflow", "ManageJobPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageJobPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageJobPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RepairJobRunResponse repairJobRun(RepairJobRunRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobRunKey(), "jobRunKey must not be blank");
        Objects.requireNonNull(request.getRepairJobRunDetails(), "repairJobRunDetails is required");
        


return clientCall(request, RepairJobRunResponse::builder)
        .logger(LOG, "repairJobRun")
        .serviceDetails("Workflow", "RepairJobRun", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RepairJobRunRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobRuns").appendPathParam(request.getJobRunKey()).appendPathParam("actions").appendPathParam("repair")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.JobRun.class, RepairJobRunResponse.Builder::jobRun)
                .handleResponseHeaderString("location", 
            RepairJobRunResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            RepairJobRunResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            RepairJobRunResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            RepairJobRunResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            RepairJobRunResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateJobResponse updateJob(UpdateJobRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getJobKey(), "jobKey must not be blank");
        Objects.requireNonNull(request.getUpdateJobDetails(), "updateJobDetails is required");
        


return clientCall(request, UpdateJobResponse::builder)
        .logger(LOG, "updateJob")
        .serviceDetails("Workflow", "UpdateJob", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateJobRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("jobs").appendPathParam(request.getJobKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Job.class, UpdateJobResponse.Builder::job)
                .handleResponseHeaderString("opc-request-id", 
            UpdateJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateJobResponse.Builder::etag)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkflowClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public WorkflowClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public WorkflowClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkflowClient(
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
    public WorkflowClient(
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
    public WorkflowClient(
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
    public WorkflowClient(
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
