// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SchemaClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Schema {
    /**
     * Service instance for Schema.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("SCHEMA").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaClient.class);


    private final SchemaWaiters waiters;

    SchemaClient(
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
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(50, 50, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue<Runnable>(), com.oracle.bmc.internal.ClientThreadFactory.builder().isDaemon(true).nameFormat("Schema-waiters-%d").build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new SchemaWaiters(executorService, this);
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SchemaClient> {
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
        public SchemaClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new SchemaClient(this, authenticationDetailsProvider, executorService);
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
    
    public CreateDataTableResponse createDataTable(CreateDataTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateDataTableDetails(), "createDataTableDetails is required");
        


return clientCall(request, CreateDataTableResponse::builder)
        .logger(LOG, "createDataTable")
        .serviceDetails("Schema", "CreateDataTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateDataTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("dataTables")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-work-request-id", 
            CreateDataTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateDataTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateDataTableResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CreateSchemaResponse createSchema(CreateSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateSchemaDetails(), "createSchemaDetails is required");
        


return clientCall(request, CreateSchemaResponse::builder)
        .logger(LOG, "createSchema")
        .serviceDetails("Schema", "CreateSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateSchemaResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateSchemaResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateTableResponse createTable(CreateTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateTableDetails(), "createTableDetails is required");
        


return clientCall(request, CreateTableResponse::builder)
        .logger(LOG, "createTable")
        .serviceDetails("Schema", "CreateTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateTableResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateTableResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateViewResponse createView(CreateViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateViewDetails(), "createViewDetails is required");
        


return clientCall(request, CreateViewResponse::builder)
        .logger(LOG, "createView")
        .serviceDetails("Schema", "CreateView", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, CreateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            CreateViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteSchemaResponse deleteSchema(DeleteSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, DeleteSchemaResponse::builder)
        .logger(LOG, "deleteSchema")
        .serviceDetails("Schema", "DeleteSchema", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
        .accept("application/json")
                
                .appendHeader("is-forced", request.getIsForced())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteTableResponse deleteTable(DeleteTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, DeleteTableResponse::builder)
        .logger(LOG, "deleteTable")
        .serviceDetails("Schema", "DeleteTable", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteViewResponse deleteView(DeleteViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, DeleteViewResponse::builder)
        .logger(LOG, "deleteView")
        .serviceDetails("Schema", "DeleteView", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GenerateTempFileUploadTargetResponse generateTempFileUploadTarget(GenerateTempFileUploadTargetRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, GenerateTempFileUploadTargetResponse::builder)
        .logger(LOG, "generateTempFileUploadTarget")
        .serviceDetails("Schema", "GenerateTempFileUploadTarget", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(GenerateTempFileUploadTargetRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("generateTempFileUploadTarget")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails.class, GenerateTempFileUploadTargetResponse.Builder::generateTempFileUploadTargetResponseDetails)
                .handleResponseHeaderString("opc-request-id", 
            GenerateTempFileUploadTargetResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetSchemaResponse getSchema(GetSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, GetSchemaResponse::builder)
        .logger(LOG, "getSchema")
        .serviceDetails("Schema", "GetSchema", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, GetSchemaResponse.Builder::schema)
                .handleResponseHeaderString("etag", 
            GetSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetTableResponse getTable(GetTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, GetTableResponse::builder)
        .logger(LOG, "getTable")
        .serviceDetails("Schema", "GetTable", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Table.class, GetTableResponse.Builder::table)
                .handleResponseHeaderString("etag", 
            GetTableResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetViewResponse getView(GetViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, GetViewResponse::builder)
        .logger(LOG, "getView")
        .serviceDetails("Schema", "GetView", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, GetViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            GetViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListSchemaPermissionsResponse listSchemaPermissions(ListSchemaPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, ListSchemaPermissionsResponse::builder)
        .logger(LOG, "listSchemaPermissions")
        .serviceDetails("Schema", "ListSchemaPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListSchemaPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaPermissionCollection.class, ListSchemaPermissionsResponse.Builder::schemaPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSchemaPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSchemaPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListSchemasResponse listSchemas(ListSchemasRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        


return clientCall(request, ListSchemasResponse::builder)
        .logger(LOG, "listSchemas")
        .serviceDetails("Schema", "ListSchemas", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListSchemasRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas")
            
                
                    
                    .appendQueryParam("catalogKey", request.getCatalogKey())
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaCollection.class, ListSchemasResponse.Builder::schemaCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSchemasResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListTablePermissionsResponse listTablePermissions(ListTablePermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, ListTablePermissionsResponse::builder)
        .logger(LOG, "listTablePermissions")
        .serviceDetails("Schema", "ListTablePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListTablePermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TablePermissionCollection.class, ListTablePermissionsResponse.Builder::tablePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListTablePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListTablePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListTablesResponse listTables(ListTablesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListTablesResponse::builder)
        .logger(LOG, "listTables")
        .serviceDetails("Schema", "ListTables", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListTablesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables")
            
                
                    
                    .appendQueryParam("catalogKey", request.getCatalogKey())
            
                
                    
                    .appendQueryParam("shouldSkipOcidTranslation", request.getShouldSkipOcidTranslation())
            
                
                    
                    .appendQueryParam("schemaKey", request.getSchemaKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TableCollection.class, ListTablesResponse.Builder::tableCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListTablesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListViewPermissionsResponse listViewPermissions(ListViewPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, ListViewPermissionsResponse::builder)
        .logger(LOG, "listViewPermissions")
        .serviceDetails("Schema", "ListViewPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListViewPermissionsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey()).appendPathParam("permissions")
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewPermissionCollection.class, ListViewPermissionsResponse.Builder::viewPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListViewPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListViewPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListViewsResponse listViews(ListViewsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListViewsResponse::builder)
        .logger(LOG, "listViews")
        .serviceDetails("Schema", "ListViews", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListViewsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views")
            
                
                    
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewCollection.class, ListViewsResponse.Builder::viewCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListViewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListViewsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageSchemaPermissionResponse manageSchemaPermission(ManageSchemaPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getManageSchemaPermissionDetails(), "manageSchemaPermissionDetails is required");
        


return clientCall(request, ManageSchemaPermissionResponse::builder)
        .logger(LOG, "manageSchemaPermission")
        .serviceDetails("Schema", "ManageSchemaPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageSchemaPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageSchemaPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageTablePermissionResponse manageTablePermission(ManageTablePermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");
        Objects.requireNonNull(request.getManageTablePermissionDetails(), "manageTablePermissionDetails is required");
        


return clientCall(request, ManageTablePermissionResponse::builder)
        .logger(LOG, "manageTablePermission")
        .serviceDetails("Schema", "ManageTablePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageTablePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageTablePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageViewPermissionResponse manageViewPermission(ManageViewPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");
        Objects.requireNonNull(request.getManageViewPermissionDetails(), "manageViewPermissionDetails is required");
        


return clientCall(request, ManageViewPermissionResponse::builder)
        .logger(LOG, "manageViewPermission")
        .serviceDetails("Schema", "ManageViewPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageViewPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageViewPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PerformInferSchemaResponse performInferSchema(PerformInferSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getPerformInferSchemaDetails(), "performInferSchemaDetails is required");
        


return clientCall(request, PerformInferSchemaResponse::builder)
        .logger(LOG, "performInferSchema")
        .serviceDetails("Schema", "PerformInferSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PerformInferSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("inferSchema")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchema.class, PerformInferSchemaResponse.Builder::inferSchema)
                .handleResponseHeaderString("etag", 
            PerformInferSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformInferSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PerformInferSchemaWithPreviewResponse performInferSchemaWithPreview(PerformInferSchemaWithPreviewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getPerformInferSchemaDetails(), "performInferSchemaDetails is required");
        


return clientCall(request, PerformInferSchemaWithPreviewResponse::builder)
        .logger(LOG, "performInferSchemaWithPreview")
        .serviceDetails("Schema", "PerformInferSchemaWithPreview", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PerformInferSchemaWithPreviewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("inferSchemaWithPreview")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchemaWithPreview.class, PerformInferSchemaWithPreviewResponse.Builder::inferSchemaWithPreview)
                .handleResponseHeaderString("etag", 
            PerformInferSchemaWithPreviewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformInferSchemaWithPreviewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RefreshSchemaResponse refreshSchema(RefreshSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, RefreshSchemaResponse::builder)
        .logger(LOG, "refreshSchema")
        .serviceDetails("Schema", "RefreshSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RefreshSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("refresh")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshSchemaResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RefreshTableResponse refreshTable(RefreshTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, RefreshTableResponse::builder)
        .logger(LOG, "refreshTable")
        .serviceDetails("Schema", "RefreshTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RefreshTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("refresh")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshTableResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RetrieveParResponse retrievePar(RetrieveParRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, RetrieveParResponse::builder)
        .logger(LOG, "retrievePar")
        .serviceDetails("Schema", "RetrievePar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RetrieveParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("getPar")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ParDetails.class, RetrieveParResponse.Builder::parDetails)
                .handleResponseHeaderString("etag", 
            RetrieveParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RetrieveParResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateSchemaResponse updateSchema(UpdateSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getUpdateSchemaDetails(), "updateSchemaDetails is required");
        


return clientCall(request, UpdateSchemaResponse::builder)
        .logger(LOG, "updateSchema")
        .serviceDetails("Schema", "UpdateSchema", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, UpdateSchemaResponse.Builder::schema)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateSchemaResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateSchemaResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public UpdateTableResponse updateTable(UpdateTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");
        Objects.requireNonNull(request.getUpdateTableDetails(), "updateTableDetails is required");
        


return clientCall(request, UpdateTableResponse::builder)
        .logger(LOG, "updateTable")
        .serviceDetails("Schema", "UpdateTable", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateViewResponse updateView(UpdateViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");
        Objects.requireNonNull(request.getUpdateViewDetails(), "updateViewDetails is required");
        


return clientCall(request, UpdateViewResponse::builder)
        .logger(LOG, "updateView")
        .serviceDetails("Schema", "UpdateView", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, UpdateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            UpdateViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    public SchemaWaiters getWaiters() {
        return waiters;
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public SchemaClient(
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
    public SchemaClient(
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
    public SchemaClient(
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
    public SchemaClient(
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
    public SchemaClient(
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
