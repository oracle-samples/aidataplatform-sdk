// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for DeltaShare service. <br/>
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
public class DeltaShareAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements DeltaShareAsync {
    /**
     * Service instance for DeltaShare.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("DELTASHARE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeltaShareAsyncClient.class);

    DeltaShareAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DeltaShareAsyncClient> {
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
        public DeltaShareAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new DeltaShareAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateRecipientResponse> createRecipient(CreateRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateRecipientRequest, CreateRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateRecipientDetails(), "createRecipientDetails is required");
        


return clientCall(request, CreateRecipientResponse::builder)
        .logger(LOG, "createRecipient")
        .serviceDetails("DeltaShare", "CreateRecipient", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, CreateRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            CreateRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateShareResponse> createShare(CreateShareRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateShareRequest, CreateShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateShareDetails(), "createShareDetails is required");
        


return clientCall(request, CreateShareResponse::builder)
        .logger(LOG, "createShare")
        .serviceDetails("DeltaShare", "CreateShare", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, CreateShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            CreateShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteRecipientResponse> deleteRecipient(DeleteRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteRecipientRequest, DeleteRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, DeleteRecipientResponse::builder)
        .logger(LOG, "deleteRecipient")
        .serviceDetails("DeltaShare", "DeleteRecipient", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteShareResponse> deleteShare(DeleteShareRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteShareRequest, DeleteShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, DeleteShareResponse::builder)
        .logger(LOG, "deleteShare")
        .serviceDetails("DeltaShare", "DeleteShare", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetRecipientResponse> getRecipient(GetRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<GetRecipientRequest, GetRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, GetRecipientResponse::builder)
        .logger(LOG, "getRecipient")
        .serviceDetails("DeltaShare", "GetRecipient", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, GetRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            GetRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetShareResponse> getShare(GetShareRequest request, final com.oracle.bmc.responses.AsyncHandler<GetShareRequest, GetShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, GetShareResponse::builder)
        .logger(LOG, "getShare")
        .serviceDetails("DeltaShare", "GetShare", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, GetShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            GetShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListRecipientPermissionsResponse> listRecipientPermissions(ListRecipientPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListRecipientPermissionsRequest, ListRecipientPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, ListRecipientPermissionsResponse::builder)
        .logger(LOG, "listRecipientPermissions")
        .serviceDetails("DeltaShare", "ListRecipientPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListRecipientPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientPermissionCollection.class, ListRecipientPermissionsResponse.Builder::recipientPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListRecipientSharesResponse> listRecipientShares(ListRecipientSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListRecipientSharesRequest, ListRecipientSharesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, ListRecipientSharesResponse::builder)
        .logger(LOG, "listRecipientShares")
        .serviceDetails("DeltaShare", "ListRecipientShares", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListRecipientSharesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey()).appendPathParam("shares")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListRecipientSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientSharesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListRecipientsResponse> listRecipients(ListRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListRecipientsRequest, ListRecipientsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListRecipientsResponse::builder)
        .logger(LOG, "listRecipients")
        .serviceDetails("DeltaShare", "ListRecipients", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListRecipientsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListShareDataAssetsResponse> listShareDataAssets(ListShareDataAssetsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListShareDataAssetsRequest, ListShareDataAssetsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListShareDataAssetsResponse::builder)
        .logger(LOG, "listShareDataAssets")
        .serviceDetails("DeltaShare", "ListShareDataAssets", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListShareDataAssetsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("dataAssets")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareDataAssetCollection.class, ListShareDataAssetsResponse.Builder::shareDataAssetCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListShareDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListShareDataAssetsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListSharePermissionsResponse> listSharePermissions(ListSharePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListSharePermissionsRequest, ListSharePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListSharePermissionsResponse::builder)
        .logger(LOG, "listSharePermissions")
        .serviceDetails("DeltaShare", "ListSharePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListSharePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SharePermissionCollection.class, ListSharePermissionsResponse.Builder::sharePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSharePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSharePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListShareRecipientsResponse> listShareRecipients(ListShareRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListShareRecipientsRequest, ListShareRecipientsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListShareRecipientsResponse::builder)
        .logger(LOG, "listShareRecipients")
        .serviceDetails("DeltaShare", "ListShareRecipients", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListShareRecipientsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("recipients")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListShareRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListShareRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListShareRecipientsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListSharesResponse> listShares(ListSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListSharesRequest, ListSharesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListSharesResponse::builder)
        .logger(LOG, "listShares")
        .serviceDetails("DeltaShare", "ListShares", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListSharesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSharesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageRecipientPermissionResponse> manageRecipientPermission(ManageRecipientPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageRecipientPermissionRequest, ManageRecipientPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");
        Objects.requireNonNull(request.getManageRecipientPermissionDetails(), "manageRecipientPermissionDetails is required");
        


return clientCall(request, ManageRecipientPermissionResponse::builder)
        .logger(LOG, "manageRecipientPermission")
        .serviceDetails("DeltaShare", "ManageRecipientPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageRecipientPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageRecipientPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageShareAccessResponse> manageShareAccess(ManageShareAccessRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageShareAccessRequest, ManageShareAccessResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageShareAccessDetails(), "manageShareAccessDetails is required");
        


return clientCall(request, ManageShareAccessResponse::builder)
        .logger(LOG, "manageShareAccess")
        .serviceDetails("DeltaShare", "ManageShareAccess", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageShareAccessRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("manageAccess")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageShareAccessResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageShareDataAssetResponse> manageShareDataAsset(ManageShareDataAssetRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageShareDataAssetRequest, ManageShareDataAssetResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageShareDataAssetDetails(), "manageShareDataAssetDetails is required");
        


return clientCall(request, ManageShareDataAssetResponse::builder)
        .logger(LOG, "manageShareDataAsset")
        .serviceDetails("DeltaShare", "ManageShareDataAsset", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageShareDataAssetRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("manageDataAsset")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageShareDataAssetResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageSharePermissionResponse> manageSharePermission(ManageSharePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageSharePermissionRequest, ManageSharePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageSharePermissionDetails(), "manageSharePermissionDetails is required");
        


return clientCall(request, ManageSharePermissionResponse::builder)
        .logger(LOG, "manageSharePermission")
        .serviceDetails("DeltaShare", "ManageSharePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageSharePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageSharePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateRecipientResponse> updateRecipient(UpdateRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateRecipientRequest, UpdateRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");
        Objects.requireNonNull(request.getUpdateRecipientDetails(), "updateRecipientDetails is required");
        


return clientCall(request, UpdateRecipientResponse::builder)
        .logger(LOG, "updateRecipient")
        .serviceDetails("DeltaShare", "UpdateRecipient", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateShareResponse> updateShare(UpdateShareRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateShareRequest, UpdateShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getUpdateShareDetails(), "updateShareDetails is required");
        


return clientCall(request, UpdateShareResponse::builder)
        .logger(LOG, "updateShare")
        .serviceDetails("DeltaShare", "UpdateShare", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public DeltaShareAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public DeltaShareAsyncClient(
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
    public DeltaShareAsyncClient (
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
    public DeltaShareAsyncClient (
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
    public DeltaShareAsyncClient (
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
