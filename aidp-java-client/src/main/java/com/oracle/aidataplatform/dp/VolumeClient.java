// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class VolumeClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Volume {
    /**
     * Service instance for Volume.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("VOLUME").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(VolumeClient.class);


    private final VolumeWaiters waiters;
    VolumeClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            , java.util.concurrent.ExecutorService executorService) {
        this(
            builder,
            authenticationDetailsProvider,
            executorService,
            true
        );
     }
    VolumeClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            , java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("Volume-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new VolumeWaiters(executorService, this);
                if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
             LOG.warn(com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                "VolumeClient",
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, VolumeClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
        * Set the ExecutorService for the client to be created.
        * @param executorService executorService
        * @return this builder
        */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
        return this;
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
        public VolumeClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new VolumeClient(this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    
    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
                
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
        .operationUsesDefaultRetries()
        
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

                .callSync();
    }

    @Override
    
    public DeleteDirResponse deleteDir(DeleteDirRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteDirResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteDirResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteFileResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteFileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteVolumeResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DownloadFileResponse downloadFile(DownloadFileRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(java.io.InputStream.class, DownloadFileResponse.Builder::inputStream)
                .handleResponseHeaderString("opc-request-id", 
            DownloadFileResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DownloadFileWithParResponse downloadFileWithPar(DownloadFileWithParRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DownloadFileWithParResult.class, DownloadFileWithParResponse.Builder::downloadFileWithParResult)
                .handleResponseHeaderString("location", 
            DownloadFileWithParResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            DownloadFileWithParResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            DownloadFileWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DownloadFileWithParResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetVolumeResponse getVolume(GetVolumeRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, GetVolumeResponse.Builder::volume)
                .handleResponseHeaderString("etag", 
            GetVolumeResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetVolumeResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListFilesResponse listFiles(ListFilesRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeFileCollection.class, ListFilesResponse.Builder::volumeFileCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListFilesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListVolumePermissionsResponse listVolumePermissions(ListVolumePermissionsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumePermissionCollection.class, ListVolumePermissionsResponse.Builder::volumePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListVolumePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListVolumePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.VolumeCollection.class, ListVolumesResponse.Builder::volumeCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListVolumesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListVolumesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public MakeDirResponse makeDir(MakeDirRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("location", 
            MakeDirResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            MakeDirResponse.Builder::contentLocation)
                .handleResponseHeaderString("opc-request-id", 
            MakeDirResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageVolumePermissionResponse manageVolumePermission(ManageVolumePermissionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageVolumePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateDirResponse updateDir(UpdateDirRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("location", 
            UpdateDirResponse.Builder::location)
                .handleResponseHeaderString("opc-request-id", 
            UpdateDirResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateDirResponse.Builder::opcWorkRequestId)

                .callSync();
    }

    @Override
    
    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Volume.class, UpdateVolumeResponse.Builder::volume)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateVolumeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateVolumeResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateVolumeResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public UploadFileResponse uploadFile(UploadFileRequest request) {
                
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
        .operationUsesDefaultRetries()
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

                .callSync();
    }

    @Override
    
    public UploadFileWithParResponse uploadFileWithPar(UploadFileWithParRequest request) {
                
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
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
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

                .callSync();
    }

    @Override
    public VolumeWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VolumeClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider,
            null
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
    public VolumeClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider,
            null
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
    public VolumeClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider,
            null
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
    public VolumeClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider,
            null
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
    public VolumeClient(
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
            authenticationDetailsProvider,
            null
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
    public VolumeClient(
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
            authenticationDetailsProvider,
            null
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
    public VolumeClient(
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
            authenticationDetailsProvider,
            null
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public VolumeClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider,
            executorService
        );
    }
}
