// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for Schema service. <br/>
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
public class SchemaAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements SchemaAsync {
    /**
     * Service instance for Schema.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("SCHEMA").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaAsyncClient.class);

    SchemaAsyncClient (
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SchemaAsyncClient> {
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
        public SchemaAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new SchemaAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateDataTableResponse> createDataTable(CreateDataTableRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateDataTableRequest, CreateDataTableResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-work-request-id", 
            CreateDataTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateDataTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateDataTableResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateSchemaResponse> createSchema(CreateSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateSchemaRequest, CreateSchemaResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateSchemaResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateSchemaResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateSchemaResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateTableResponse> createTable(CreateTableRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateTableRequest, CreateTableResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateTableResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateTableResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateTableResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<CreateViewResponse> createView(CreateViewRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateViewRequest, CreateViewResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, CreateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            CreateViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateViewResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteSchemaResponse> deleteSchema(DeleteSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteSchemaRequest, DeleteSchemaResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteSchemaResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteTableResponse> deleteTable(DeleteTableRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteTableRequest, DeleteTableResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteTableResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteViewResponse> deleteView(DeleteViewRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteViewRequest, DeleteViewResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteViewResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GenerateTempFileUploadTargetResponse> generateTempFileUploadTarget(GenerateTempFileUploadTargetRequest request, final com.oracle.bmc.responses.AsyncHandler<GenerateTempFileUploadTargetRequest, GenerateTempFileUploadTargetResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails.class, GenerateTempFileUploadTargetResponse.Builder::generateTempFileUploadTargetResponseDetails)
                .handleResponseHeaderString("opc-request-id", 
            GenerateTempFileUploadTargetResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetSchemaResponse> getSchema(GetSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, GetSchemaResponse.Builder::schema)
                .handleResponseHeaderString("etag", 
            GetSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetSchemaResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetTableResponse> getTable(GetTableRequest request, final com.oracle.bmc.responses.AsyncHandler<GetTableRequest, GetTableResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Table.class, GetTableResponse.Builder::table)
                .handleResponseHeaderString("etag", 
            GetTableResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetTableResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetViewResponse> getView(GetViewRequest request, final com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, GetViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            GetViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetViewResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListSchemaPermissionsResponse> listSchemaPermissions(ListSchemaPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListSchemaPermissionsRequest, ListSchemaPermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaPermissionCollection.class, ListSchemaPermissionsResponse.Builder::schemaPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSchemaPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSchemaPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListSchemasResponse> listSchemas(ListSchemasRequest request, final com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaCollection.class, ListSchemasResponse.Builder::schemaCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListSchemasResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListTablePermissionsResponse> listTablePermissions(ListTablePermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListTablePermissionsRequest, ListTablePermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TablePermissionCollection.class, ListTablePermissionsResponse.Builder::tablePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListTablePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListTablePermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListTablesResponse> listTables(ListTablesRequest request, final com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TableCollection.class, ListTablesResponse.Builder::tableCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListTablesResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListViewPermissionsResponse> listViewPermissions(ListViewPermissionsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListViewPermissionsRequest, ListViewPermissionsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewPermissionCollection.class, ListViewPermissionsResponse.Builder::viewPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListViewPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListViewPermissionsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListViewsResponse> listViews(ListViewsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewCollection.class, ListViewsResponse.Builder::viewCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListViewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListViewsResponse.Builder::opcNextPage)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageSchemaPermissionResponse> manageSchemaPermission(ManageSchemaPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageSchemaPermissionRequest, ManageSchemaPermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageSchemaPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageTablePermissionResponse> manageTablePermission(ManageTablePermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageTablePermissionRequest, ManageTablePermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageTablePermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ManageViewPermissionResponse> manageViewPermission(ManageViewPermissionRequest request, final com.oracle.bmc.responses.AsyncHandler<ManageViewPermissionRequest, ManageViewPermissionResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageViewPermissionResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PerformInferSchemaResponse> performInferSchema(PerformInferSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<PerformInferSchemaRequest, PerformInferSchemaResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchema.class, PerformInferSchemaResponse.Builder::inferSchema)
                .handleResponseHeaderString("etag", 
            PerformInferSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformInferSchemaResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<PerformInferSchemaWithPreviewResponse> performInferSchemaWithPreview(PerformInferSchemaWithPreviewRequest request, final com.oracle.bmc.responses.AsyncHandler<PerformInferSchemaWithPreviewRequest, PerformInferSchemaWithPreviewResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchemaWithPreview.class, PerformInferSchemaWithPreviewResponse.Builder::inferSchemaWithPreview)
                .handleResponseHeaderString("etag", 
            PerformInferSchemaWithPreviewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformInferSchemaWithPreviewResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RefreshSchemaResponse> refreshSchema(RefreshSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshSchemaRequest, RefreshSchemaResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshSchemaResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RefreshTableResponse> refreshTable(RefreshTableRequest request, final com.oracle.bmc.responses.AsyncHandler<RefreshTableRequest, RefreshTableResponse> handler) {
                
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
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshTableResponse.Builder::aidpAsyncOperationKey)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<RetrieveParResponse> retrievePar(RetrieveParRequest request, final com.oracle.bmc.responses.AsyncHandler<RetrieveParRequest, RetrieveParResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ParDetails.class, RetrieveParResponse.Builder::parDetails)
                .handleResponseHeaderString("etag", 
            RetrieveParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RetrieveParResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateSchemaResponse> updateSchema(UpdateSchemaRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateSchemaRequest, UpdateSchemaResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, UpdateSchemaResponse.Builder::schema)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateSchemaResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateSchemaResponse.Builder::etag)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateTableResponse> updateTable(UpdateTableRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateTableRequest, UpdateTableResponse> handler) {
                
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
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateTableResponse.Builder::opcRequestId)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateViewResponse> updateView(UpdateViewRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateViewRequest, UpdateViewResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, UpdateViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            UpdateViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateViewResponse.Builder::opcRequestId)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public SchemaAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public SchemaAsyncClient(
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
    public SchemaAsyncClient (
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
    public SchemaAsyncClient (
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
    public SchemaAsyncClient (
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
