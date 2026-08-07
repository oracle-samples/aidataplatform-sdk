// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Volume service. <br/>
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
public class VolumeAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements VolumeAsync {
    /**
     * Service instance for Volume.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("VOLUME").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(VolumeAsyncClient.class);
    VolumeAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder,
            authenticationDetailsProvider,
            true
        );
    }

    VolumeAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(
            builder,
            authenticationDetailsProvider
        );

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                "VolumeAsyncClient",
                 "downloadFile"
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VolumeAsyncClient> {
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
        public VolumeAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new VolumeAsyncClient(this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    
    public java.util.concurrent.Future<CreateVolumeResponse> createVolume(CreateVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateVolumeRequest, CreateVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateVolumeDetails(), "createVolumeDetails is required");
        


return clientCall(request, CreateVolumeResponse::builder)
        .logger(LOG, "createVolume")
        .serviceDetails("Volume", "CreateVolume", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, CreateVolumeResponse.Builder::volume)
                .handleResponseHeaderString("location", 
            CreateVolumeResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateVolumeResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateVolumeResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteDirResponse> deleteDir(DeleteDirRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteDirRequest, DeleteDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DeleteDirResponse::builder)
        .logger(LOG, "deleteDir")
        .serviceDetails("Volume", "DeleteDir", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteDirRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("deleteDir")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteDirResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteDirResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteFileResponse> deleteFile(DeleteFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteFileRequest, DeleteFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DeleteFileResponse::builder)
        .logger(LOG, "deleteFile")
        .serviceDetails("Volume", "DeleteFile", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteFileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("deleteFile")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteVolumeResponse> deleteVolume(DeleteVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteVolumeRequest, DeleteVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, DeleteVolumeResponse::builder)
        .logger(LOG, "deleteVolume")
        .serviceDetails("Volume", "DeleteVolume", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadFileResponse> downloadFile(DownloadFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadFileRequest, DownloadFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadFileResponse::builder)
        .logger(LOG, "downloadFile")
        .serviceDetails("Volume", "DownloadFile", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadFileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("downloadFile")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(java.io.InputStream.class, DownloadFileResponse.Builder::inputStream)
                .handleResponseHeaderString("opc-request-id", 
            DownloadFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadFileWithParResponse> downloadFileWithPar(DownloadFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadFileWithParRequest, DownloadFileWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadFileWithParResponse::builder)
        .logger(LOG, "downloadFileWithPar")
        .serviceDetails("Volume", "DownloadFileWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadFileWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("downloadFileMeta")
            
                
                    
                    .appendQueryParam("shouldGenerateNewPar", request.getShouldGenerateNewPar())
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DownloadFileWithParResult.class, DownloadFileWithParResponse.Builder::downloadFileWithParResult)
                .handleResponseHeaderString("location", 
            DownloadFileWithParResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            DownloadFileWithParResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            DownloadFileWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DownloadFileWithParResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetVolumeResponse> getVolume(GetVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<GetVolumeRequest, GetVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, GetVolumeResponse::builder)
        .logger(LOG, "getVolume")
        .serviceDetails("Volume", "GetVolume", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, GetVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", 
            GetVolumeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListFilesResponse> listFiles(ListFilesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListFilesRequest, ListFilesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, ListFilesResponse::builder)
        .logger(LOG, "listFiles")
        .serviceDetails("Volume", "ListFiles", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListFilesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("files")
            
                
                    
                    .appendQueryParam("isRecursive", request.getIsRecursive())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("path", request.getPath())
            
                
                    
                    .appendQueryParam("metadataKeys", request.getMetadataKeys())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeFileCollection.class, ListFilesResponse.Builder::volumeFileCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListFilesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListVolumePermissionsResponse> listVolumePermissions(ListVolumePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListVolumePermissionsRequest, ListVolumePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, ListVolumePermissionsResponse::builder)
        .logger(LOG, "listVolumePermissions")
        .serviceDetails("Volume", "ListVolumePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListVolumePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumePermissionCollection.class, ListVolumePermissionsResponse.Builder::volumePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListVolumePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListVolumePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListVolumesResponse> listVolumes(ListVolumesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListVolumesRequest, ListVolumesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListVolumesResponse::builder)
        .logger(LOG, "listVolumes")
        .serviceDetails("Volume", "ListVolumes", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListVolumesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes")
            
                
                    
                    .appendQueryParam("catalogKey", request.getCatalogKey())
            
                
                    
                    .appendQueryParam("schemaKey", request.getSchemaKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeCollection.class, ListVolumesResponse.Builder::volumeCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListVolumesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<MakeDirResponse> makeDir(MakeDirRequest request, final com.oracle.bmc.responses.AsyncHandler<MakeDirRequest, MakeDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, MakeDirResponse::builder)
        .logger(LOG, "makeDir")
        .serviceDetails("Volume", "MakeDir", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MakeDirRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("mkdir")
            
                
                    
                    .appendQueryParam("description", request.getDescription())
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("location", 
            MakeDirResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            MakeDirResponse.Builder::contentLocation)
                .handleResponseHeaderString("opc-request-id", 
            MakeDirResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageVolumePermissionResponse> manageVolumePermission(ManageVolumePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageVolumePermissionRequest, ManageVolumePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getManageVolumePermissionDetails(), "manageVolumePermissionDetails is required");
        


return clientCall(request, ManageVolumePermissionResponse::builder)
        .logger(LOG, "manageVolumePermission")
        .serviceDetails("Volume", "ManageVolumePermission", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(ManageVolumePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageVolumePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateDirResponse> updateDir(UpdateDirRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateDirRequest, UpdateDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUpdateDirDetails(), "updateDirDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UpdateDirResponse::builder)
        .logger(LOG, "updateDir")
        .serviceDetails("Volume", "UpdateDir", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateDirRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("updateDir")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("location", 
            UpdateDirResponse.Builder::location)
                .handleResponseHeaderString("opc-request-id", 
            UpdateDirResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateDirResponse.Builder::opcWorkRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateVolumeResponse> updateVolume(UpdateVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUpdateVolumeDetails(), "updateVolumeDetails is required");
        


return clientCall(request, UpdateVolumeResponse::builder)
        .logger(LOG, "updateVolume")
        .serviceDetails("Volume", "UpdateVolume", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, UpdateVolumeResponse.Builder::volume)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateVolumeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateVolumeResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadFileResponse> uploadFile(UploadFileRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadFileRequest, UploadFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUploadFileDetails(), "uploadFileDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadFileResponse::builder)
        .logger(LOG, "uploadFile")
        .serviceDetails("Volume", "UploadFile", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadFileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("uploadFile")
            
                
                    
                    .appendQueryParam("isOverwrite", request.getIsOverwrite())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("is-upload-file-base64-encoded", request.getIsUploadFileBase64Encoded())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .hasBinaryRequestBody()
        .hasBody()
                .handleResponseHeaderString("location", 
            UploadFileResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            UploadFileResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            UploadFileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadFileWithParResponse> uploadFileWithPar(UploadFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadFileWithParRequest, UploadFileWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUploadFileWithParDetails(), "uploadFileWithParDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadFileWithParResponse::builder)
        .logger(LOG, "uploadFileWithPar")
        .serviceDetails("Volume", "UploadFileWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadFileWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("uploadFileMeta")
            
                
                    
                    .appendQueryParam("isOverwrite", request.getIsOverwrite())
            
                
                    
                    .appendQueryParam("shouldGenerateNewPar", request.getShouldGenerateNewPar())
            
                
                    
                    .appendQueryParam("shouldCreateRecursively", request.getShouldCreateRecursively())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class, UploadFileWithParResponse.Builder::uploadFileWithParResult)
                .handleResponseHeaderString("location", 
            UploadFileWithParResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            UploadFileWithParResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            UploadFileWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadFileWithParResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public VolumeAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public VolumeAsyncClient(
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
    public VolumeAsyncClient (
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
    public VolumeAsyncClient (
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
    public VolumeAsyncClient (
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
