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
    
    public CreateAiDataPlatformClusterResponse createAiDataPlatformCluster(CreateAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        Objects.requireNonNull(request.getCreateClusterDetails(), "createClusterDetails is required");
        


return clientCall(request, CreateAiDataPlatformClusterResponse::builder)
        .logger(LOG, "createAiDataPlatformCluster")
        .serviceDetails("Cluster", "CreateAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, CreateAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformClusterResponse deleteAiDataPlatformCluster(DeleteAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, DeleteAiDataPlatformClusterResponse::builder)
        .logger(LOG, "deleteAiDataPlatformCluster")
        .serviceDetails("Cluster", "DeleteAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DownloadAiDataPlatformClusterLogsResponse downloadAiDataPlatformClusterLogs(DownloadAiDataPlatformClusterLogsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getDownloadClusterLogsDetails(), "downloadClusterLogsDetails is required");
        


return clientCall(request, DownloadAiDataPlatformClusterLogsResponse::builder)
        .logger(LOG, "downloadAiDataPlatformClusterLogs")
        .serviceDetails("Cluster", "DownloadAiDataPlatformClusterLogs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(DownloadAiDataPlatformClusterLogsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("downloadLogs")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            DownloadAiDataPlatformClusterLogsResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("datalake-cluster-log-par-url", 
            DownloadAiDataPlatformClusterLogsResponse.Builder::datalakeClusterLogParUrl)
                .handleResponseHeaderString("opc-request-id", 
            DownloadAiDataPlatformClusterLogsResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformClusterResponse getAiDataPlatformCluster(GetAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, GetAiDataPlatformClusterResponse::builder)
        .logger(LOG, "getAiDataPlatformCluster")
        .serviceDetails("Cluster", "GetAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, GetAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformClusterResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformDefaultClusterResponse getAiDataPlatformDefaultCluster(GetAiDataPlatformDefaultClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");


return clientCall(request, GetAiDataPlatformDefaultClusterResponse::builder)
        .logger(LOG, "getAiDataPlatformDefaultCluster")
        .serviceDetails("Cluster", "GetAiDataPlatformDefaultCluster", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformDefaultClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("defaultCluster")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.DefaultCluster.class, GetAiDataPlatformDefaultClusterResponse.Builder::defaultCluster)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformDefaultClusterResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformDefaultClusterResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformClusterLibrariesResponse listAiDataPlatformClusterLibraries(ListAiDataPlatformClusterLibrariesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, ListAiDataPlatformClusterLibrariesResponse::builder)
        .logger(LOG, "listAiDataPlatformClusterLibraries")
        .serviceDetails("Cluster", "ListAiDataPlatformClusterLibraries", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformClusterLibrariesRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class, ListAiDataPlatformClusterLibrariesResponse.Builder::clusterLibraryCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformClusterLibrariesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformClusterLibrariesResponse.Builder::opcNextPage)
                .handleResponseHeaderString("opc-prev-page", 
            ListAiDataPlatformClusterLibrariesResponse.Builder::opcPrevPage)
                .handleResponseHeaderInteger("opc-total-items", 
            ListAiDataPlatformClusterLibrariesResponse.Builder::opcTotalItems)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformClusterPermissionsResponse listAiDataPlatformClusterPermissions(ListAiDataPlatformClusterPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");


return clientCall(request, ListAiDataPlatformClusterPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformClusterPermissions")
        .serviceDetails("Cluster", "ListAiDataPlatformClusterPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformClusterPermissionsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterPermissionCollection.class, ListAiDataPlatformClusterPermissionsResponse.Builder::clusterPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformClusterPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformClusterPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformClustersResponse listAiDataPlatformClusters(ListAiDataPlatformClustersRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");


return clientCall(request, ListAiDataPlatformClustersResponse::builder)
        .logger(LOG, "listAiDataPlatformClusters")
        .serviceDetails("Cluster", "ListAiDataPlatformClusters", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformClustersRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterCollection.class, ListAiDataPlatformClustersResponse.Builder::clusterCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformClustersResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageAiDataPlatformClusterPermissionResponse manageAiDataPlatformClusterPermission(ManageAiDataPlatformClusterPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getManageClusterPermissionDetails(), "manageClusterPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformClusterPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformClusterPermission")
        .serviceDetails("Cluster", "ManageAiDataPlatformClusterPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformClusterPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformClusterPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PatchAiDataPlatformClusterLibraryResponse patchAiDataPlatformClusterLibrary(PatchAiDataPlatformClusterLibraryRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getPatchClusterLibraryDetails(), "patchClusterLibraryDetails is required");
        


return clientCall(request, PatchAiDataPlatformClusterLibraryResponse::builder)
        .logger(LOG, "patchAiDataPlatformClusterLibrary")
        .serviceDetails("Cluster", "PatchAiDataPlatformClusterLibrary", "")
        .method(com.oracle.bmc.http.client.Method.PATCH)
        .requestBuilder(PatchAiDataPlatformClusterLibraryRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("libraries")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class, PatchAiDataPlatformClusterLibraryResponse.Builder::clusterLibraryCollection)
                .handleResponseHeaderString("etag", 
            PatchAiDataPlatformClusterLibraryResponse.Builder::etag)
                .handleResponseHeaderString("aidp-async-operation-key", 
            PatchAiDataPlatformClusterLibraryResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            PatchAiDataPlatformClusterLibraryResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RestartAiDataPlatformClusterResponse restartAiDataPlatformCluster(RestartAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getRestartClusterDetails(), "restartClusterDetails is required");
        


return clientCall(request, RestartAiDataPlatformClusterResponse::builder)
        .logger(LOG, "restartAiDataPlatformCluster")
        .serviceDetails("Cluster", "RestartAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RestartAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("restart")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, RestartAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RestartAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            RestartAiDataPlatformClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            RestartAiDataPlatformClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public SearchAiDataPlatformClusterLogsResponse searchAiDataPlatformClusterLogs(SearchAiDataPlatformClusterLogsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getSearchClusterLogsDetails(), "searchClusterLogsDetails is required");
        


return clientCall(request, SearchAiDataPlatformClusterLogsResponse::builder)
        .logger(LOG, "searchAiDataPlatformClusterLogs")
        .serviceDetails("Cluster", "SearchAiDataPlatformClusterLogs", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SearchAiDataPlatformClusterLogsRequest::builder)
        
        
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
            .handleBody(com.oracle.aidataplatform.dp.model.ClusterLogCollection.class, SearchAiDataPlatformClusterLogsResponse.Builder::clusterLogCollection)
                .handleResponseHeaderString("opc-request-id", 
            SearchAiDataPlatformClusterLogsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            SearchAiDataPlatformClusterLogsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public StartAiDataPlatformClusterResponse startAiDataPlatformCluster(StartAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getStartClusterDetails(), "startClusterDetails is required");
        


return clientCall(request, StartAiDataPlatformClusterResponse::builder)
        .logger(LOG, "startAiDataPlatformCluster")
        .serviceDetails("Cluster", "StartAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(StartAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("start")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, StartAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            StartAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            StartAiDataPlatformClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            StartAiDataPlatformClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public StopAiDataPlatformClusterResponse stopAiDataPlatformCluster(StopAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getStopClusterDetails(), "stopClusterDetails is required");
        


return clientCall(request, StopAiDataPlatformClusterResponse::builder)
        .logger(LOG, "stopAiDataPlatformCluster")
        .serviceDetails("Cluster", "StopAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(StopAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("stop")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, StopAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            StopAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            StopAiDataPlatformClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            StopAiDataPlatformClusterResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public SummarizeAiDataPlatformMetricsDataResponse summarizeAiDataPlatformMetricsData(SummarizeAiDataPlatformMetricsDataRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getSummarizeMetricsDataDetails(), "summarizeMetricsDataDetails is required");
        


return clientCall(request, SummarizeAiDataPlatformMetricsDataResponse::builder)
        .logger(LOG, "summarizeAiDataPlatformMetricsData")
        .serviceDetails("Cluster", "SummarizeAiDataPlatformMetricsData", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(SummarizeAiDataPlatformMetricsDataRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey()).appendPathParam("actions").appendPathParam("summarizeMetricsData")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.SummarizeMetricsResponse.class, SummarizeAiDataPlatformMetricsDataResponse.Builder::summarizeMetricsResponse)
                .handleResponseHeaderString("etag", 
            SummarizeAiDataPlatformMetricsDataResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            SummarizeAiDataPlatformMetricsDataResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformClusterResponse updateAiDataPlatformCluster(UpdateAiDataPlatformClusterRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");
        
        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");
        Objects.requireNonNull(request.getUpdateClusterDetails(), "updateClusterDetails is required");
        


return clientCall(request, UpdateAiDataPlatformClusterResponse::builder)
        .logger(LOG, "updateAiDataPlatformCluster")
        .serviceDetails("Cluster", "UpdateAiDataPlatformCluster", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformClusterRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("workspaces").appendPathParam(request.getWorkspaceKey()).appendPathParam("clusters").appendPathParam(request.getClusterKey())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Cluster.class, UpdateAiDataPlatformClusterResponse.Builder::cluster)
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateAiDataPlatformClusterResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformClusterResponse.Builder::etag)

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
