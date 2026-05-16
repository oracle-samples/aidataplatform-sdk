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
                 "downloadAiDataPlatformFile"
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
    
    public java.util.concurrent.Future<CreateAiDataPlatformVolumeResponse> createAiDataPlatformVolume(CreateAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformVolumeRequest, CreateAiDataPlatformVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateVolumeDetails(), "createVolumeDetails is required");
        


return clientCall(request, CreateAiDataPlatformVolumeResponse::builder)
        .logger(LOG, "createAiDataPlatformVolume")
        .serviceDetails("Volume", "CreateAiDataPlatformVolume", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, CreateAiDataPlatformVolumeResponse.Builder::volume)
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformVolumeResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformVolumeResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformVolumeResponse.Builder::etag)
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformDirResponse> deleteAiDataPlatformDir(DeleteAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformDirRequest, DeleteAiDataPlatformDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DeleteAiDataPlatformDirResponse::builder)
        .logger(LOG, "deleteAiDataPlatformDir")
        .serviceDetails("Volume", "DeleteAiDataPlatformDir", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformDirRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("deleteDir")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformDirResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformDirResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformFileResponse> deleteAiDataPlatformFile(DeleteAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformFileRequest, DeleteAiDataPlatformFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DeleteAiDataPlatformFileResponse::builder)
        .logger(LOG, "deleteAiDataPlatformFile")
        .serviceDetails("Volume", "DeleteAiDataPlatformFile", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformFileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("deleteFile")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformVolumeResponse> deleteAiDataPlatformVolume(DeleteAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformVolumeRequest, DeleteAiDataPlatformVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, DeleteAiDataPlatformVolumeResponse::builder)
        .logger(LOG, "deleteAiDataPlatformVolume")
        .serviceDetails("Volume", "DeleteAiDataPlatformVolume", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadAiDataPlatformFileResponse> downloadAiDataPlatformFile(DownloadAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileRequest, DownloadAiDataPlatformFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadAiDataPlatformFileResponse::builder)
        .logger(LOG, "downloadAiDataPlatformFile")
        .serviceDetails("Volume", "DownloadAiDataPlatformFile", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadAiDataPlatformFileRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("downloadFile")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(java.io.InputStream.class, DownloadAiDataPlatformFileResponse.Builder::inputStream)
                .handleResponseHeaderString("opc-request-id", 
            DownloadAiDataPlatformFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadAiDataPlatformFileWithParResponse> downloadAiDataPlatformFileWithPar(DownloadAiDataPlatformFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformFileWithParRequest, DownloadAiDataPlatformFileWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadAiDataPlatformFileWithParResponse::builder)
        .logger(LOG, "downloadAiDataPlatformFileWithPar")
        .serviceDetails("Volume", "DownloadAiDataPlatformFileWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadAiDataPlatformFileWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("downloadFileMeta")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DownloadFileWithParResult.class, DownloadAiDataPlatformFileWithParResponse.Builder::downloadFileWithParResult)
                .handleResponseHeaderString("location", 
            DownloadAiDataPlatformFileWithParResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            DownloadAiDataPlatformFileWithParResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            DownloadAiDataPlatformFileWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DownloadAiDataPlatformFileWithParResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformVolumeResponse> getAiDataPlatformVolume(GetAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformVolumeRequest, GetAiDataPlatformVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, GetAiDataPlatformVolumeResponse::builder)
        .logger(LOG, "getAiDataPlatformVolume")
        .serviceDetails("Volume", "GetAiDataPlatformVolume", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, GetAiDataPlatformVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformVolumeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformVolumeResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformFilesResponse> listAiDataPlatformFiles(ListAiDataPlatformFilesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformFilesRequest, ListAiDataPlatformFilesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, ListAiDataPlatformFilesResponse::builder)
        .logger(LOG, "listAiDataPlatformFiles")
        .serviceDetails("Volume", "ListAiDataPlatformFiles", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformFilesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeFileCollection.class, ListAiDataPlatformFilesResponse.Builder::volumeFileCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformFilesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformVolumePermissionsResponse> listAiDataPlatformVolumePermissions(ListAiDataPlatformVolumePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumePermissionsRequest, ListAiDataPlatformVolumePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");


return clientCall(request, ListAiDataPlatformVolumePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformVolumePermissions")
        .serviceDetails("Volume", "ListAiDataPlatformVolumePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformVolumePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumePermissionCollection.class, ListAiDataPlatformVolumePermissionsResponse.Builder::volumePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformVolumePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformVolumePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformVolumesResponse> listAiDataPlatformVolumes(ListAiDataPlatformVolumesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformVolumesRequest, ListAiDataPlatformVolumesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListAiDataPlatformVolumesResponse::builder)
        .logger(LOG, "listAiDataPlatformVolumes")
        .serviceDetails("Volume", "ListAiDataPlatformVolumes", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformVolumesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeCollection.class, ListAiDataPlatformVolumesResponse.Builder::volumeCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformVolumesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<MakeAiDataPlatformDirResponse> makeAiDataPlatformDir(MakeAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<MakeAiDataPlatformDirRequest, MakeAiDataPlatformDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, MakeAiDataPlatformDirResponse::builder)
        .logger(LOG, "makeAiDataPlatformDir")
        .serviceDetails("Volume", "MakeAiDataPlatformDir", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MakeAiDataPlatformDirRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("mkdir")
            
                
                    
                    .appendQueryParam("description", request.getDescription())
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("location", 
            MakeAiDataPlatformDirResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            MakeAiDataPlatformDirResponse.Builder::contentLocation)
                .handleResponseHeaderString("opc-request-id", 
            MakeAiDataPlatformDirResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformVolumePermissionResponse> manageAiDataPlatformVolumePermission(ManageAiDataPlatformVolumePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformVolumePermissionRequest, ManageAiDataPlatformVolumePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getManageVolumePermissionDetails(), "manageVolumePermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformVolumePermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformVolumePermission")
        .serviceDetails("Volume", "ManageAiDataPlatformVolumePermission", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(ManageAiDataPlatformVolumePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformVolumePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformDirResponse> updateAiDataPlatformDir(UpdateAiDataPlatformDirRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformDirRequest, UpdateAiDataPlatformDirResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUpdateDirDetails(), "updateDirDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UpdateAiDataPlatformDirResponse::builder)
        .logger(LOG, "updateAiDataPlatformDir")
        .serviceDetails("Volume", "UpdateAiDataPlatformDir", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformDirRequest::builder)
        
        
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
            UpdateAiDataPlatformDirResponse.Builder::location)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformDirResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateAiDataPlatformDirResponse.Builder::opcWorkRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformVolumeResponse> updateAiDataPlatformVolume(UpdateAiDataPlatformVolumeRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformVolumeRequest, UpdateAiDataPlatformVolumeResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUpdateVolumeDetails(), "updateVolumeDetails is required");
        


return clientCall(request, UpdateAiDataPlatformVolumeResponse::builder)
        .logger(LOG, "updateAiDataPlatformVolume")
        .serviceDetails("Volume", "UpdateAiDataPlatformVolume", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformVolumeRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, UpdateAiDataPlatformVolumeResponse.Builder::volume)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateAiDataPlatformVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformVolumeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformVolumeResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadAiDataPlatformFileResponse> uploadAiDataPlatformFile(UploadAiDataPlatformFileRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileRequest, UploadAiDataPlatformFileResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUploadFileDetails(), "uploadFileDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadAiDataPlatformFileResponse::builder)
        .logger(LOG, "uploadAiDataPlatformFile")
        .serviceDetails("Volume", "UploadAiDataPlatformFile", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadAiDataPlatformFileRequest::builder)
        
        
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
            UploadAiDataPlatformFileResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            UploadAiDataPlatformFileResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            UploadAiDataPlatformFileResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadAiDataPlatformFileResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadAiDataPlatformFileWithParResponse> uploadAiDataPlatformFileWithPar(UploadAiDataPlatformFileWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformFileWithParRequest, UploadAiDataPlatformFileWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");
        Objects.requireNonNull(request.getUploadFileWithParDetails(), "uploadFileWithParDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadAiDataPlatformFileWithParResponse::builder)
        .logger(LOG, "uploadAiDataPlatformFileWithPar")
        .serviceDetails("Volume", "UploadAiDataPlatformFileWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadAiDataPlatformFileWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("volumes").appendPathParam(request.getVolumeKey()).appendPathParam("actions").appendPathParam("uploadFileMeta")
            
                
                    
                    .appendQueryParam("isOverwrite", request.getIsOverwrite())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class, UploadAiDataPlatformFileWithParResponse.Builder::uploadFileWithParResult)
                .handleResponseHeaderString("location", 
            UploadAiDataPlatformFileWithParResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            UploadAiDataPlatformFileWithParResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            UploadAiDataPlatformFileWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadAiDataPlatformFileWithParResponse.Builder::opcRequestId)
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
