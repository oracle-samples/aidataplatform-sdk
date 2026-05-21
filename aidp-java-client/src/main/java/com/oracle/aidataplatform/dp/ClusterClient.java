// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ClusterClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Cluster {
    /**
     * Service instance for Cluster.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("CLUSTER").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ClusterClient.class);



    ClusterClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ClusterClient> {
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
        public ClusterClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new ClusterClient(this, authenticationDetailsProvider);
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
    
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateClusterDetails(), "createClusterDetails is required");
        


return clientCall(request, CreateClusterResponse::builder)
        .logger(LOG, "createCluster")
        .serviceDetails("Cluster", "CreateCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, CreateClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CreateClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, DeleteClusterResponse::builder)
        .logger(LOG, "deleteCluster")
        .serviceDetails("Cluster", "DeleteCluster", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DownloadClusterLogsResponse downloadClusterLogs(DownloadClusterLogsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getDownloadClusterLogsDetails(), "downloadClusterLogsDetails is required");
        


return clientCall(request, DownloadClusterLogsResponse::builder)
        .logger(LOG, "downloadClusterLogs")
        .serviceDetails("Cluster", "DownloadClusterLogs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadClusterLogsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("downloadLogs")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            DownloadClusterLogsResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("datalake-cluster-log-par-url", 
            DownloadClusterLogsResponse.Builder::datalakeClusterLogParUrl)
                .handleResponseHeaderString("opc-request-id", 
            DownloadClusterLogsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetClusterResponse getCluster(GetClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, GetClusterResponse::builder)
        .logger(LOG, "getCluster")
        .serviceDetails("Cluster", "GetCluster", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, GetClusterResponse.Builder::cluster)
                .handleResponseHeaderString("etag", 
            GetClusterResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetDefaultClusterResponse getDefaultCluster(GetDefaultClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, GetDefaultClusterResponse::builder)
        .logger(LOG, "getDefaultCluster")
        .serviceDetails("Cluster", "GetDefaultCluster", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetDefaultClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("defaultCluster")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DefaultCluster.class, GetDefaultClusterResponse.Builder::defaultCluster)
                .handleResponseHeaderString("etag", 
            GetDefaultClusterResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetDefaultClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListClusterLibrariesResponse listClusterLibraries(ListClusterLibrariesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, ListClusterLibrariesResponse::builder)
        .logger(LOG, "listClusterLibraries")
        .serviceDetails("Cluster", "ListClusterLibraries", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListClusterLibrariesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("libraries")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class, ListClusterLibrariesResponse.Builder::clusterLibraryCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListClusterLibrariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListClusterLibrariesResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", 
            ListClusterLibrariesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListClusterLibrariesResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public ListClusterPermissionsResponse listClusterPermissions(ListClusterPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, ListClusterPermissionsResponse::builder)
        .logger(LOG, "listClusterPermissions")
        .serviceDetails("Cluster", "ListClusterPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListClusterPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterPermissionCollection.class, ListClusterPermissionsResponse.Builder::clusterPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListClusterPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListClusterPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListClustersResponse listClusters(ListClustersRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListClustersResponse::builder)
        .logger(LOG, "listClusters")
        .serviceDetails("Cluster", "ListClusters", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListClustersRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters")
            
                
                    .appendEnumQueryParam("state", request.getState())
                    
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("displayNameContains", request.getDisplayNameContains())
            
                
                    
                    .appendQueryParam("type", request.getType())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterCollection.class, ListClustersResponse.Builder::clusterCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListClustersResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageClusterPermissionResponse manageClusterPermission(ManageClusterPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getManageClusterPermissionDetails(), "manageClusterPermissionDetails is required");
        


return clientCall(request, ManageClusterPermissionResponse::builder)
        .logger(LOG, "manageClusterPermission")
        .serviceDetails("Cluster", "ManageClusterPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageClusterPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageClusterPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PatchClusterLibraryResponse patchClusterLibrary(PatchClusterLibraryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getPatchClusterLibraryDetails(), "patchClusterLibraryDetails is required");
        


return clientCall(request, PatchClusterLibraryResponse::builder)
        .logger(LOG, "patchClusterLibrary")
        .serviceDetails("Cluster", "PatchClusterLibrary", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(PatchClusterLibraryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("libraries")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class, PatchClusterLibraryResponse.Builder::clusterLibraryCollection)
                .handleResponseHeaderString("etag", 
            PatchClusterLibraryResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PatchClusterLibraryResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            PatchClusterLibraryResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RestartClusterResponse restartCluster(RestartClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getRestartClusterDetails(), "restartClusterDetails is required");
        


return clientCall(request, RestartClusterResponse::builder)
        .logger(LOG, "restartCluster")
        .serviceDetails("Cluster", "RestartCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestartClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("restart")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, RestartClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RestartClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            RestartClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            RestartClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public SearchClusterLogsResponse searchClusterLogs(SearchClusterLogsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getSearchClusterLogsDetails(), "searchClusterLogsDetails is required");
        


return clientCall(request, SearchClusterLogsResponse::builder)
        .logger(LOG, "searchClusterLogs")
        .serviceDetails("Cluster", "SearchClusterLogs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SearchClusterLogsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("searchLogs")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLogCollection.class, SearchClusterLogsResponse.Builder::clusterLogCollection)
                .handleResponseHeaderString("opc-request-id", 
            SearchClusterLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            SearchClusterLogsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public StartClusterResponse startCluster(StartClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getStartClusterDetails(), "startClusterDetails is required");
        


return clientCall(request, StartClusterResponse::builder)
        .logger(LOG, "startCluster")
        .serviceDetails("Cluster", "StartCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(StartClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("start")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, StartClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            StartClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            StartClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            StartClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public StopClusterResponse stopCluster(StopClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getStopClusterDetails(), "stopClusterDetails is required");
        


return clientCall(request, StopClusterResponse::builder)
        .logger(LOG, "stopCluster")
        .serviceDetails("Cluster", "StopCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(StopClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("stop")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, StopClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            StopClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            StopClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            StopClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public SummarizeMetricsDataResponse summarizeMetricsData(SummarizeMetricsDataRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getSummarizeMetricsDataDetails(), "summarizeMetricsDataDetails is required");
        


return clientCall(request, SummarizeMetricsDataResponse::builder)
        .logger(LOG, "summarizeMetricsData")
        .serviceDetails("Cluster", "SummarizeMetricsData", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SummarizeMetricsDataRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("summarizeMetricsData")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SummarizeMetricsResponse.class, SummarizeMetricsDataResponse.Builder::summarizeMetricsResponse)
                .handleResponseHeaderString("etag", 
            SummarizeMetricsDataResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SummarizeMetricsDataResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getUpdateClusterDetails(), "updateClusterDetails is required");
        


return clientCall(request, UpdateClusterResponse::builder)
        .logger(LOG, "updateCluster")
        .serviceDetails("Cluster", "UpdateCluster", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, UpdateClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateClusterResponse.Builder::etag)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ClusterClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public ClusterClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public ClusterClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public ClusterClient(
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
    public ClusterClient(
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
    public ClusterClient(
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
    public ClusterClient(
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
