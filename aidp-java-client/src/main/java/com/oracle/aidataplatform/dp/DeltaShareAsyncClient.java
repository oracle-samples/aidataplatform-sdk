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
    
    public java.util.concurrent.Future<CreateAiDataPlatformRecipientResponse> createAiDataPlatformRecipient(CreateAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformRecipientRequest, CreateAiDataPlatformRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateRecipientDetails(), "createRecipientDetails is required");
        


return clientCall(request, CreateAiDataPlatformRecipientResponse::builder)
        .logger(LOG, "createAiDataPlatformRecipient")
        .serviceDetails("DeltaShare", "CreateAiDataPlatformRecipient", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, CreateAiDataPlatformRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateAiDataPlatformShareResponse> createAiDataPlatformShare(CreateAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateAiDataPlatformShareRequest, CreateAiDataPlatformShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateShareDetails(), "createShareDetails is required");
        


return clientCall(request, CreateAiDataPlatformShareResponse::builder)
        .logger(LOG, "createAiDataPlatformShare")
        .serviceDetails("DeltaShare", "CreateAiDataPlatformShare", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, CreateAiDataPlatformShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformRecipientResponse> deleteAiDataPlatformRecipient(DeleteAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformRecipientRequest, DeleteAiDataPlatformRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, DeleteAiDataPlatformRecipientResponse::builder)
        .logger(LOG, "deleteAiDataPlatformRecipient")
        .serviceDetails("DeltaShare", "DeleteAiDataPlatformRecipient", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteAiDataPlatformShareResponse> deleteAiDataPlatformShare(DeleteAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteAiDataPlatformShareRequest, DeleteAiDataPlatformShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, DeleteAiDataPlatformShareResponse::builder)
        .logger(LOG, "deleteAiDataPlatformShare")
        .serviceDetails("DeltaShare", "DeleteAiDataPlatformShare", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformRecipientResponse> getAiDataPlatformRecipient(GetAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformRecipientRequest, GetAiDataPlatformRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, GetAiDataPlatformRecipientResponse::builder)
        .logger(LOG, "getAiDataPlatformRecipient")
        .serviceDetails("DeltaShare", "GetAiDataPlatformRecipient", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, GetAiDataPlatformRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetAiDataPlatformShareResponse> getAiDataPlatformShare(GetAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<GetAiDataPlatformShareRequest, GetAiDataPlatformShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, GetAiDataPlatformShareResponse::builder)
        .logger(LOG, "getAiDataPlatformShare")
        .serviceDetails("DeltaShare", "GetAiDataPlatformShare", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, GetAiDataPlatformShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformShareResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRecipientPermissionsResponse> listAiDataPlatformRecipientPermissions(ListAiDataPlatformRecipientPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientPermissionsRequest, ListAiDataPlatformRecipientPermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, ListAiDataPlatformRecipientPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformRecipientPermissions")
        .serviceDetails("DeltaShare", "ListAiDataPlatformRecipientPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRecipientPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientPermissionCollection.class, ListAiDataPlatformRecipientPermissionsResponse.Builder::recipientPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRecipientPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRecipientPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRecipientSharesResponse> listAiDataPlatformRecipientShares(ListAiDataPlatformRecipientSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientSharesRequest, ListAiDataPlatformRecipientSharesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");


return clientCall(request, ListAiDataPlatformRecipientSharesResponse::builder)
        .logger(LOG, "listAiDataPlatformRecipientShares")
        .serviceDetails("DeltaShare", "ListAiDataPlatformRecipientShares", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRecipientSharesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListAiDataPlatformRecipientSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRecipientSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRecipientSharesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformRecipientsResponse> listAiDataPlatformRecipients(ListAiDataPlatformRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformRecipientsRequest, ListAiDataPlatformRecipientsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformRecipientsResponse::builder)
        .logger(LOG, "listAiDataPlatformRecipients")
        .serviceDetails("DeltaShare", "ListAiDataPlatformRecipients", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformRecipientsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListAiDataPlatformRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformRecipientsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformShareDataAssetsResponse> listAiDataPlatformShareDataAssets(ListAiDataPlatformShareDataAssetsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareDataAssetsRequest, ListAiDataPlatformShareDataAssetsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListAiDataPlatformShareDataAssetsResponse::builder)
        .logger(LOG, "listAiDataPlatformShareDataAssets")
        .serviceDetails("DeltaShare", "ListAiDataPlatformShareDataAssets", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformShareDataAssetsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareDataAssetCollection.class, ListAiDataPlatformShareDataAssetsResponse.Builder::shareDataAssetCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformShareDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformShareDataAssetsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformSharePermissionsResponse> listAiDataPlatformSharePermissions(ListAiDataPlatformSharePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharePermissionsRequest, ListAiDataPlatformSharePermissionsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListAiDataPlatformSharePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformSharePermissions")
        .serviceDetails("DeltaShare", "ListAiDataPlatformSharePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformSharePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SharePermissionCollection.class, ListAiDataPlatformSharePermissionsResponse.Builder::sharePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSharePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformSharePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformShareRecipientsResponse> listAiDataPlatformShareRecipients(ListAiDataPlatformShareRecipientsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformShareRecipientsRequest, ListAiDataPlatformShareRecipientsResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");


return clientCall(request, ListAiDataPlatformShareRecipientsResponse::builder)
        .logger(LOG, "listAiDataPlatformShareRecipients")
        .serviceDetails("DeltaShare", "ListAiDataPlatformShareRecipients", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformShareRecipientsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListAiDataPlatformShareRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformShareRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformShareRecipientsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListAiDataPlatformSharesResponse> listAiDataPlatformShares(ListAiDataPlatformSharesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListAiDataPlatformSharesRequest, ListAiDataPlatformSharesResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, ListAiDataPlatformSharesResponse::builder)
        .logger(LOG, "listAiDataPlatformShares")
        .serviceDetails("DeltaShare", "ListAiDataPlatformShares", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformSharesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListAiDataPlatformSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformSharesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformRecipientPermissionResponse> manageAiDataPlatformRecipientPermission(ManageAiDataPlatformRecipientPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformRecipientPermissionRequest, ManageAiDataPlatformRecipientPermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");
        Objects.requireNonNull(request.getManageRecipientPermissionDetails(), "manageRecipientPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformRecipientPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformRecipientPermission")
        .serviceDetails("DeltaShare", "ManageAiDataPlatformRecipientPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformRecipientPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformRecipientPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformShareAccessResponse> manageAiDataPlatformShareAccess(ManageAiDataPlatformShareAccessRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareAccessRequest, ManageAiDataPlatformShareAccessResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageShareAccessDetails(), "manageShareAccessDetails is required");
        


return clientCall(request, ManageAiDataPlatformShareAccessResponse::builder)
        .logger(LOG, "manageAiDataPlatformShareAccess")
        .serviceDetails("DeltaShare", "ManageAiDataPlatformShareAccess", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformShareAccessRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("manageAccess")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformShareAccessResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformShareDataAssetResponse> manageAiDataPlatformShareDataAsset(ManageAiDataPlatformShareDataAssetRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformShareDataAssetRequest, ManageAiDataPlatformShareDataAssetResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageShareDataAssetDetails(), "manageShareDataAssetDetails is required");
        


return clientCall(request, ManageAiDataPlatformShareDataAssetResponse::builder)
        .logger(LOG, "manageAiDataPlatformShareDataAsset")
        .serviceDetails("DeltaShare", "ManageAiDataPlatformShareDataAsset", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformShareDataAssetRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("manageDataAsset")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformShareDataAssetResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageAiDataPlatformSharePermissionResponse> manageAiDataPlatformSharePermission(ManageAiDataPlatformSharePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageAiDataPlatformSharePermissionRequest, ManageAiDataPlatformSharePermissionResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getManageSharePermissionDetails(), "manageSharePermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformSharePermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformSharePermission")
        .serviceDetails("DeltaShare", "ManageAiDataPlatformSharePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformSharePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformSharePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformRecipientResponse> updateAiDataPlatformRecipient(UpdateAiDataPlatformRecipientRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformRecipientRequest, UpdateAiDataPlatformRecipientResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");
        Objects.requireNonNull(request.getUpdateRecipientDetails(), "updateRecipientDetails is required");
        


return clientCall(request, UpdateAiDataPlatformRecipientResponse::builder)
        .logger(LOG, "updateAiDataPlatformRecipient")
        .serviceDetails("DeltaShare", "UpdateAiDataPlatformRecipient", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformRecipientRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("recipients").appendPathParam(request.getRecipientKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformRecipientResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateAiDataPlatformShareResponse> updateAiDataPlatformShare(UpdateAiDataPlatformShareRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateAiDataPlatformShareRequest, UpdateAiDataPlatformShareResponse> handler) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getShareKey(), "shareKey must not be blank");
        Objects.requireNonNull(request.getUpdateShareDetails(), "updateShareDetails is required");
        


return clientCall(request, UpdateAiDataPlatformShareResponse::builder)
        .logger(LOG, "updateAiDataPlatformShare")
        .serviceDetails("DeltaShare", "UpdateAiDataPlatformShare", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformShareRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("shares").appendPathParam(request.getShareKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformShareResponse.Builder::opcRequestId)
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
