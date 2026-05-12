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
                 "createAiDataPlatformWorkspaceObject,getAiDataPlatformWorkspaceObject,updateAiDataPlatformWorkspaceObject"
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
    
    public java.util.concurrent.Future<CopyAiDataPlatformWorkspaceObjectResponse> copyAiDataPlatformWorkspaceObject(CopyAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CopyAiDataPlatformWorkspaceObjectRequest, CopyAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCopyWorkspaceObjectDetails(), "copyWorkspaceObjectDetails is required");
        


return clientCall(request, CopyAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "copyAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "CopyAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CopyAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("copyObject")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, CopyAiDataPlatformWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            CopyAiDataPlatformWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CopyAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CopyAiDataPlatformWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformWorkspaceObjectResponse> createAiDataPlatformWorkspaceObject(CreateAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformWorkspaceObjectRequest, CreateAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateWorkspaceObjectDetails(), "createWorkspaceObjectDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, CreateAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "createAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "CreateAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformWorkspaceObjectRequest::builder)
        
        
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
            .handleBody(java.io.InputStream.class, CreateAiDataPlatformWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            CreateAiDataPlatformWorkspaceObjectResponse.Builder::timeUpdated)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformWorkspaceObjectResponse> deleteAiDataPlatformWorkspaceObject(DeleteAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformWorkspaceObjectRequest, DeleteAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, DeleteAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "deleteAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "DeleteAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
                .handleResponseHeaderString("opc-work-request-id", 
            DeleteAiDataPlatformWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DownloadAiDataPlatformWorkspaceObjectWithParResponse> downloadAiDataPlatformWorkspaceObjectWithPar(DownloadAiDataPlatformWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<DownloadAiDataPlatformWorkspaceObjectWithParRequest, DownloadAiDataPlatformWorkspaceObjectWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, DownloadAiDataPlatformWorkspaceObjectWithParResponse::builder)
        .logger(LOG, "downloadAiDataPlatformWorkspaceObjectWithPar")
        .serviceDetails("WorkspaceObject", "DownloadAiDataPlatformWorkspaceObjectWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadAiDataPlatformWorkspaceObjectWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("downloadFileMeta")
        .accept("application/json")
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("type", request.getType())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DownloadFileWithParResult.class, DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::downloadFileWithParResult)
                .handleResponseHeaderString("etag", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::path)
                .handleResponseHeaderString("type", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            DownloadAiDataPlatformWorkspaceObjectWithParResponse.Builder::timeUpdated)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformWorkspaceObjectResponse> getAiDataPlatformWorkspaceObject(GetAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformWorkspaceObjectRequest, GetAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, GetAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "getAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "GetAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
        .accept("application/x-yaml")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(java.io.InputStream.class, GetAiDataPlatformWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            GetAiDataPlatformWorkspaceObjectResponse.Builder::timeUpdated)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<HeadAiDataPlatformWorkspaceObjectResponse> headAiDataPlatformWorkspaceObject(HeadAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<HeadAiDataPlatformWorkspaceObjectRequest, HeadAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");


return clientCall(request, HeadAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "headAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "HeadAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.HEAD)
        .requestBuilder(HeadAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("shouldIncludeMetadata", request.getShouldIncludeMetadata())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::timeUpdated)
                .handleResponseHeaderString("file-metadata", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::fileMetadata)
                .handleResponseHeaderString("composite-etag", 
            HeadAiDataPlatformWorkspaceObjectResponse.Builder::compositeEtag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectPermissionsResponse> listAiDataPlatformWorkspaceObjectPermissions(ListAiDataPlatformWorkspaceObjectPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectPermissionsRequest, ListAiDataPlatformWorkspaceObjectPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectKey(), "objectKey must not be blank");


return clientCall(request, ListAiDataPlatformWorkspaceObjectPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformWorkspaceObjectPermissions")
        .serviceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjectPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformWorkspaceObjectPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectPermissionCollection.class, ListAiDataPlatformWorkspaceObjectPermissionsResponse.Builder::workspaceObjectPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformWorkspaceObjectPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformWorkspaceObjectPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformWorkspaceObjectsResponse> listAiDataPlatformWorkspaceObjects(ListAiDataPlatformWorkspaceObjectsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformWorkspaceObjectsRequest, ListAiDataPlatformWorkspaceObjectsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, ListAiDataPlatformWorkspaceObjectsResponse::builder)
        .logger(LOG, "listAiDataPlatformWorkspaceObjects")
        .serviceDetails("WorkspaceObject", "ListAiDataPlatformWorkspaceObjects", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformWorkspaceObjectsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection.class, ListAiDataPlatformWorkspaceObjectsResponse.Builder::workspaceObjectCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformWorkspaceObjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformWorkspaceObjectsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformWorkspaceObjectPermissionResponse> manageAiDataPlatformWorkspaceObjectPermission(ManageAiDataPlatformWorkspaceObjectPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformWorkspaceObjectPermissionRequest, ManageAiDataPlatformWorkspaceObjectPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectKey(), "objectKey must not be blank");
        Objects.requireNonNull(request.getManageWorkspaceObjectPermissionDetails(), "manageWorkspaceObjectPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformWorkspaceObjectPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformWorkspaceObjectPermission")
        .serviceDetails("WorkspaceObject", "ManageAiDataPlatformWorkspaceObjectPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformWorkspaceObjectPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformWorkspaceObjectPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<MoveAiDataPlatformWorkspaceObjectResponse> moveAiDataPlatformWorkspaceObject(MoveAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<MoveAiDataPlatformWorkspaceObjectRequest, MoveAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getMoveWorkspaceObjectDetails(), "moveWorkspaceObjectDetails is required");
        


return clientCall(request, MoveAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "moveAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "MoveAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(MoveAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("moveObject")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, MoveAiDataPlatformWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            MoveAiDataPlatformWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            MoveAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            MoveAiDataPlatformWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RenameAiDataPlatformWorkspaceObjectResponse> renameAiDataPlatformWorkspaceObject(RenameAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<RenameAiDataPlatformWorkspaceObjectRequest, RenameAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getRenameWorkspaceObjectDetails(), "renameWorkspaceObjectDetails is required");
        


return clientCall(request, RenameAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "renameAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "RenameAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RenameAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("renameObject")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails.class, RenameAiDataPlatformWorkspaceObjectResponse.Builder::workspaceObjectDetails)
                .handleResponseHeaderString("opc-work-request-id", 
            RenameAiDataPlatformWorkspaceObjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            RenameAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            RenameAiDataPlatformWorkspaceObjectResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformWorkspaceObjectResponse> updateAiDataPlatformWorkspaceObject(UpdateAiDataPlatformWorkspaceObjectRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformWorkspaceObjectRequest, UpdateAiDataPlatformWorkspaceObjectResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");
        Objects.requireNonNull(request.getUpdateWorkspaceObjectDetails(), "updateWorkspaceObjectDetails is required");
        


return clientCall(request, UpdateAiDataPlatformWorkspaceObjectResponse::builder)
        .logger(LOG, "updateAiDataPlatformWorkspaceObject")
        .serviceDetails("WorkspaceObject", "UpdateAiDataPlatformWorkspaceObject", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformWorkspaceObjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("objects").appendPathParam(request.getObjectPath())
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/x-yaml")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .hasBinaryRequestBody()
        .hasBody()
            .handleBody(java.io.InputStream.class, UpdateAiDataPlatformWorkspaceObjectResponse.Builder::inputStream)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::etag)
                .handleResponseHeaderString("object-key", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::path)
                .handleResponseHeaderString("type", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            UpdateAiDataPlatformWorkspaceObjectResponse.Builder::timeUpdated)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UploadAiDataPlatformWorkspaceObjectWithParResponse> uploadAiDataPlatformWorkspaceObjectWithPar(UploadAiDataPlatformWorkspaceObjectWithParRequest request, final com.oracle.bmc.responses.AsyncHandler<UploadAiDataPlatformWorkspaceObjectWithParRequest, UploadAiDataPlatformWorkspaceObjectWithParResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getUploadFileWithParDetails(), "uploadFileWithParDetails is required");
        
        Objects.requireNonNull(request.getPath(), "path is required");
        


return clientCall(request, UploadAiDataPlatformWorkspaceObjectWithParResponse::builder)
        .logger(LOG, "uploadAiDataPlatformWorkspaceObjectWithPar")
        .serviceDetails("WorkspaceObject", "UploadAiDataPlatformWorkspaceObjectWithPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(UploadAiDataPlatformWorkspaceObjectWithParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("actions").appendPathParam("uploadFileMeta")
            
                
                    
                    .appendQueryParam("isOverwrite", request.getIsOverwrite())
            
                
                    
                    .appendQueryParam("objectDescription", request.getObjectDescription())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("path", request.getPath())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("type", request.getType())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class, UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::uploadFileWithParResult)
                .handleResponseHeaderString("etag", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::opcRequestId)
                .handleResponseHeaderString("object-key", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::objectKey)
                .handleResponseHeaderString("path", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::path)
                .handleResponseHeaderString("type", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::type)
                .handleResponseHeaderDate("time-updated", 
            UploadAiDataPlatformWorkspaceObjectWithParResponse.Builder::timeUpdated)
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
