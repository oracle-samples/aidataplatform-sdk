// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for WorkspaceObject service. <br/>
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
public class WorkspaceObjectAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements WorkspaceObjectAsync {
    /**
     * Service instance for WorkspaceObject.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("WORKSPACEOBJECT").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(WorkspaceObjectAsyncClient.class);
    WorkspaceObjectAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder,
            authenticationDetailsProvider,
            true
        );
    }

    WorkspaceObjectAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(
            builder,
            authenticationDetailsProvider
        );

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                "WorkspaceObjectAsyncClient",
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, WorkspaceObjectAsyncClient> {
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
        public WorkspaceObjectAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new WorkspaceObjectAsyncClient(this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    
    public java.util.concurrent.Future<CopyWorkspaceObjectResponse> copyWorkspaceObject(CopyWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CopyWorkspaceObjectRequest, CopyWorkspaceObjectResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, CopyWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            CopyWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CopyWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CopyWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateWorkspaceObjectResponse> createWorkspaceObject(CreateWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceObjectRequest, CreateWorkspaceObjectResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteWorkspaceObjectResponse> deleteWorkspaceObject(DeleteWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteWorkspaceObjectRequest, DeleteWorkspaceObjectResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteWorkspaceObjectResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadWorkspaceObjectWithParResponse> downloadWorkspaceObjectWithPar(DownloadWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadWorkspaceObjectWithParRequest, DownloadWorkspaceObjectWithParResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetWorkspaceObjectResponse> getWorkspaceObject(GetWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<GetWorkspaceObjectRequest, GetWorkspaceObjectResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<HeadWorkspaceObjectResponse> headWorkspaceObject(HeadWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<HeadWorkspaceObjectRequest, HeadWorkspaceObjectResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListWorkspaceObjectPermissionsResponse> listWorkspaceObjectPermissions(ListWorkspaceObjectPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListWorkspaceObjectPermissionsRequest, ListWorkspaceObjectPermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectPermissionCollection.class, ListWorkspaceObjectPermissionsResponse.Builder::workspaceObjectPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspaceObjectPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspaceObjectPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListWorkspaceObjectsResponse> listWorkspaceObjects(ListWorkspaceObjectsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListWorkspaceObjectsRequest, ListWorkspaceObjectsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection.class, ListWorkspaceObjectsResponse.Builder::workspaceObjectCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListWorkspaceObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListWorkspaceObjectsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageWorkspaceObjectPermissionResponse> manageWorkspaceObjectPermission(ManageWorkspaceObjectPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageWorkspaceObjectPermissionRequest, ManageWorkspaceObjectPermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageWorkspaceObjectPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<MoveWorkspaceObjectResponse> moveWorkspaceObject(MoveWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<MoveWorkspaceObjectRequest, MoveWorkspaceObjectResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, MoveWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            MoveWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            MoveWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            MoveWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RenameWorkspaceObjectResponse> renameWorkspaceObject(RenameWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameWorkspaceObjectRequest, RenameWorkspaceObjectResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, RenameWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            RenameWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            RenameWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            RenameWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateWorkspaceObjectResponse> updateWorkspaceObject(UpdateWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceObjectRequest, UpdateWorkspaceObjectResponse> handler) {
                
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
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadWorkspaceObjectWithParResponse> uploadWorkspaceObjectWithPar(UploadWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadWorkspaceObjectWithParRequest, UploadWorkspaceObjectWithParResponse> handler) {
                
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
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("type", request.getType())
        
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
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public WorkspaceObjectAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public WorkspaceObjectAsyncClient(
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
    public WorkspaceObjectAsyncClient (
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
    public WorkspaceObjectAsyncClient (
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
    public WorkspaceObjectAsyncClient (
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
