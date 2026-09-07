// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class WorkspaceObjectClient extends com.oracle.bmc.http.internal.BaseSyncClient implements WorkspaceObject {
    /**
     * Service instance for WorkspaceObject.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACEOBJECT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceObjectClient.class);


    WorkspaceObjectClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            ) {
        this(
            builder,
            authenticationDetailsProvider,
            true
        );
     }
    WorkspaceObjectClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            ,
            boolean isStreamWarningEnabled) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                "WorkspaceObjectClient",
                 "createWorkspaceObject,getWorkspaceObject,updateWorkspaceObject"
                 )
             );
        }
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceObjectClient> {
        private boolean isStreamWarningEnabled = true;
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public WorkspaceObjectClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkspaceObjectClient(this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    
    public CopyWorkspaceObjectResponse copyWorkspaceObject(CopyWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCopyWorkspaceObjectDetails(), "copyWorkspaceObjectDetails is required");
        


return clientCall(request, CopyWorkspaceObjectResponse::builder)
        .logger(LOG, "copyWorkspaceObject")
        .serviceDetails("WorkspaceObject", "CopyWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CopyWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("copyObject")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, CopyWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            CopyWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CopyWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CopyWorkspaceObjectResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public CreateWorkspaceObjectResponse createWorkspaceObject(CreateWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateWorkspaceObjectDetails(), "createWorkspaceObjectDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, CreateWorkspaceObjectResponse::builder)
        .logger(LOG, "createWorkspaceObject")
        .serviceDetails("WorkspaceObject", "CreateWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects")
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/x-yaml")
                
                .appendHeader("type", request.getType())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("is-upload-file-base64-encoded", request.getIsUploadFileBase64Encoded())
                
                .appendHeader("is-overwrite", request.getIsOverwrite())
        .operationUsesDefaultRetries()
        .hasBinaryRequestBody()
        .hasBody()
            .handleBody(java.io.InputStream.class, CreateWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("location", 
            CreateWorkspaceObjectResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateWorkspaceObjectResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            CreateWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            CreateWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            CreateWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            CreateWorkspaceObjectResponse.Builder::timeUpdated)

                .callSync();
    }

    @Override
    
    public DeleteWorkspaceObjectResponse deleteWorkspaceObject(DeleteWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, DeleteWorkspaceObjectResponse::builder)
        .logger(LOG, "deleteWorkspaceObject")
        .serviceDetails("WorkspaceObject", "DeleteWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteWorkspaceObjectResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DownloadWorkspaceObjectWithParResponse downloadWorkspaceObjectWithPar(DownloadWorkspaceObjectWithParRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadWorkspaceObjectWithParResponse::builder)
        .logger(LOG, "downloadWorkspaceObjectWithPar")
        .serviceDetails("WorkspaceObject", "DownloadWorkspaceObjectWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadWorkspaceObjectWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("downloadFileMeta")
            
                
                    
                    .appendQueryParam("shouldGenerateNewPar", request.getShouldGenerateNewPar())
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("type", request.getType())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DownloadFileWithParResult.class, DownloadWorkspaceObjectWithParResponse.Builder::downloadFileWithParResult)
                .handleResponseHeaderString("etag", 
            DownloadWorkspaceObjectWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DownloadWorkspaceObjectWithParResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            DownloadWorkspaceObjectWithParResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            DownloadWorkspaceObjectWithParResponse.Builder::path)
                .handleResponseHeaderString("type", 
            DownloadWorkspaceObjectWithParResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            DownloadWorkspaceObjectWithParResponse.Builder::timeUpdated)

                .callSync();
    }

    @Override
    
    public GetWorkspaceObjectResponse getWorkspaceObject(GetWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, GetWorkspaceObjectResponse::builder)
        .logger(LOG, "getWorkspaceObject")
        .serviceDetails("WorkspaceObject", "GetWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
        .accept("application/x-yaml")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(java.io.InputStream.class, GetWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", 
            GetWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            GetWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            GetWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            GetWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            GetWorkspaceObjectResponse.Builder::timeUpdated)

                .callSync();
    }

    @Override
    
    public HeadWorkspaceObjectResponse headWorkspaceObject(HeadWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, HeadWorkspaceObjectResponse::builder)
        .logger(LOG, "headWorkspaceObject")
        .serviceDetails("WorkspaceObject", "HeadWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.HEAD)
        .requestBuilder(HeadWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            HeadWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            HeadWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            HeadWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            HeadWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            HeadWorkspaceObjectResponse.Builder::timeUpdated)
                .handleResponseHeaderString("file-metadata", 
            HeadWorkspaceObjectResponse.Builder::fileMetadata)
                .handleResponseHeaderString("composite-etag", 
            HeadWorkspaceObjectResponse.Builder::compositeEtag)

                .callSync();
    }

    @Override
    
    public ListWorkspaceObjectPermissionsResponse listWorkspaceObjectPermissions(ListWorkspaceObjectPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectKey(), "objectKey must not be blank");


return clientCall(request, ListWorkspaceObjectPermissionsResponse::builder)
        .logger(LOG, "listWorkspaceObjectPermissions")
        .serviceDetails("WorkspaceObject", "ListWorkspaceObjectPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListWorkspaceObjectPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectPermissionCollection.class, ListWorkspaceObjectPermissionsResponse.Builder::workspaceObjectPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspaceObjectPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspaceObjectPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListWorkspaceObjectsResponse listWorkspaceObjects(ListWorkspaceObjectsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, ListWorkspaceObjectsResponse::builder)
        .logger(LOG, "listWorkspaceObjects")
        .serviceDetails("WorkspaceObject", "ListWorkspaceObjects", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListWorkspaceObjectsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects")
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("type", request.getType())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("metadataKeys", request.getMetadataKeys())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection.class, ListWorkspaceObjectsResponse.Builder::workspaceObjectCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspaceObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspaceObjectsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageWorkspaceObjectPermissionResponse manageWorkspaceObjectPermission(ManageWorkspaceObjectPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectKey(), "objectKey must not be blank");
        Objects.requireNonNull(request.getManageWorkspaceObjectPermissionDetails(), "manageWorkspaceObjectPermissionDetails is required");
        


return clientCall(request, ManageWorkspaceObjectPermissionResponse::builder)
        .logger(LOG, "manageWorkspaceObjectPermission")
        .serviceDetails("WorkspaceObject", "ManageWorkspaceObjectPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageWorkspaceObjectPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageWorkspaceObjectPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public MoveWorkspaceObjectResponse moveWorkspaceObject(MoveWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getMoveWorkspaceObjectDetails(), "moveWorkspaceObjectDetails is required");
        


return clientCall(request, MoveWorkspaceObjectResponse::builder)
        .logger(LOG, "moveWorkspaceObject")
        .serviceDetails("WorkspaceObject", "MoveWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MoveWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("moveObject")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, MoveWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            MoveWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            MoveWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            MoveWorkspaceObjectResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public RenameWorkspaceObjectResponse renameWorkspaceObject(RenameWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRenameWorkspaceObjectDetails(), "renameWorkspaceObjectDetails is required");
        


return clientCall(request, RenameWorkspaceObjectResponse::builder)
        .logger(LOG, "renameWorkspaceObject")
        .serviceDetails("WorkspaceObject", "RenameWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RenameWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("renameObject")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, RenameWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            RenameWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            RenameWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            RenameWorkspaceObjectResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public UpdateWorkspaceObjectResponse updateWorkspaceObject(UpdateWorkspaceObjectRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceObjectDetails(), "updateWorkspaceObjectDetails is required");
        


return clientCall(request, UpdateWorkspaceObjectResponse::builder)
        .logger(LOG, "updateWorkspaceObject")
        .serviceDetails("WorkspaceObject", "UpdateWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/x-yaml")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        .hasBinaryRequestBody()
        .hasBody()
            .handleBody(java.io.InputStream.class, UpdateWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("opc-request-id", 
            UpdateWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("object-key", 
            UpdateWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            UpdateWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            UpdateWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            UpdateWorkspaceObjectResponse.Builder::timeUpdated)

                .callSync();
    }

    @Override
    
    public UploadAndExtractWorkspaceZipResponse uploadAndExtractWorkspaceZip(UploadAndExtractWorkspaceZipRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUploadAndExtractZipDetails(), "uploadAndExtractZipDetails is required");
        


return clientCall(request, UploadAndExtractWorkspaceZipResponse::builder)
        .logger(LOG, "uploadAndExtractWorkspaceZip")
        .serviceDetails("WorkspaceObject", "UploadAndExtractWorkspaceZip", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadAndExtractWorkspaceZipRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("uploadAndExtractZip")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UploadAndExtractZipResult.class, UploadAndExtractWorkspaceZipResponse.Builder::uploadAndExtractZipResult)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UploadAndExtractWorkspaceZipResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UploadAndExtractWorkspaceZipResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UploadWorkspaceObjectWithParResponse uploadWorkspaceObjectWithPar(UploadWorkspaceObjectWithParRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUploadFileWithParDetails(), "uploadFileWithParDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadWorkspaceObjectWithParResponse::builder)
        .logger(LOG, "uploadWorkspaceObjectWithPar")
        .serviceDetails("WorkspaceObject", "UploadWorkspaceObjectWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadWorkspaceObjectWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("uploadFileMeta")
            
                
                    
                    .appendQueryParam("isOverwrite", request.getIsOverwrite())
            
                
                    
                    .appendQueryParam("shouldGenerateNewPar", request.getShouldGenerateNewPar())
            
                
                    
                    .appendQueryParam("shouldCreateRecursively", request.getShouldCreateRecursively())
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("type", request.getType())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class, UploadWorkspaceObjectWithParResponse.Builder::uploadFileWithParResult)
                .handleResponseHeaderString("etag", 
            UploadWorkspaceObjectWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadWorkspaceObjectWithParResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            UploadWorkspaceObjectWithParResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            UploadWorkspaceObjectWithParResponse.Builder::path)
                .handleResponseHeaderString("type", 
            UploadWorkspaceObjectWithParResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            UploadWorkspaceObjectWithParResponse.Builder::timeUpdated)

                .callSync();
    }

    @Override
    
    public ZipAndDownloadWorkspaceFolderResponse zipAndDownloadWorkspaceFolder(ZipAndDownloadWorkspaceFolderRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getZipAndDownloadFolderDetails(), "zipAndDownloadFolderDetails is required");
        


return clientCall(request, ZipAndDownloadWorkspaceFolderResponse::builder)
        .logger(LOG, "zipAndDownloadWorkspaceFolder")
        .serviceDetails("WorkspaceObject", "ZipAndDownloadWorkspaceFolder", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ZipAndDownloadWorkspaceFolderRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("zipAndDownloadFolder")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ZipAndDownloadFolderResult.class, ZipAndDownloadWorkspaceFolderResponse.Builder::zipAndDownloadFolderResult)
                .handleResponseHeaderString("aidp-async-operation-key", 
            ZipAndDownloadWorkspaceFolderResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            ZipAndDownloadWorkspaceFolderResponse.Builder::opcRequestId)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public WorkspaceObjectClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
    public WorkspaceObjectClient(
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
