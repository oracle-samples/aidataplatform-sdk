// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class DeltaShareClient extends com.oracle.bmc.http.internal.BaseSyncClient implements DeltaShare {
    /**
     * Service instance for DeltaShare.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("DELTASHARE").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeltaShareClient.class);


    private final DeltaShareWaiters waiters;

    DeltaShareClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            , java.util.concurrent.ExecutorService executorService) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("DeltaShare-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DeltaShareWaiters(executorService, this);
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DeltaShareClient> {
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
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DeltaShareClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new DeltaShareClient(this, authenticationDetailsProvider, executorService);
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
    
    public CreateRecipientResponse createRecipient(CreateRecipientRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, CreateRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            CreateRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateRecipientResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateShareResponse createShare(CreateShareRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, CreateShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            CreateShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateShareResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteRecipientResponse deleteRecipient(DeleteRecipientRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteRecipientResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteShareResponse deleteShare(DeleteShareRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteShareResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetRecipientResponse getRecipient(GetRecipientRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Recipient.class, GetRecipientResponse.Builder::recipient)
                .handleResponseHeaderString("etag", 
            GetRecipientResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetRecipientResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetShareResponse getShare(GetShareRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Share.class, GetShareResponse.Builder::share)
                .handleResponseHeaderString("etag", 
            GetShareResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetShareResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListRecipientPermissionsResponse listRecipientPermissions(ListRecipientPermissionsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientPermissionCollection.class, ListRecipientPermissionsResponse.Builder::recipientPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListRecipientSharesResponse listRecipientShares(ListRecipientSharesRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListRecipientSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientSharesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListRecipientsResponse listRecipients(ListRecipientsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListRecipientsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListShareDataAssetsResponse listShareDataAssets(ListShareDataAssetsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareDataAssetCollection.class, ListShareDataAssetsResponse.Builder::shareDataAssetCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListShareDataAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListShareDataAssetsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListSharePermissionsResponse listSharePermissions(ListSharePermissionsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SharePermissionCollection.class, ListSharePermissionsResponse.Builder::sharePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSharePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSharePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListShareRecipientsResponse listShareRecipients(ListShareRecipientsRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.RecipientCollection.class, ListShareRecipientsResponse.Builder::recipientCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListShareRecipientsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListShareRecipientsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListSharesResponse listShares(ListSharesRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ShareCollection.class, ListSharesResponse.Builder::shareCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSharesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSharesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageRecipientPermissionResponse manageRecipientPermission(ManageRecipientPermissionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageRecipientPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageShareAccessResponse manageShareAccess(ManageShareAccessRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageShareAccessResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageShareDataAssetResponse manageShareDataAsset(ManageShareDataAssetRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageShareDataAssetResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageSharePermissionResponse manageSharePermission(ManageSharePermissionRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageSharePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateRecipientResponse updateRecipient(UpdateRecipientRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateRecipientResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateShareResponse updateShare(UpdateShareRequest request) {
                
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
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            UpdateShareResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    public DeltaShareWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DeltaShareClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public DeltaShareClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public DeltaShareClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public DeltaShareClient(
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
    public DeltaShareClient(
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
    public DeltaShareClient(
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
    public DeltaShareClient(
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
    public DeltaShareClient(
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
