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



    SchemaClient(
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, SchemaClient> {
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
        public SchemaClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new SchemaClient(this, authenticationDetailsProvider);
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
    
    public CreateAiDataPlatformDataTableResponse createAiDataPlatformDataTable(CreateAiDataPlatformDataTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateDataTableDetails(), "createDataTableDetails is required");
        


return clientCall(request, CreateAiDataPlatformDataTableResponse::builder)
        .logger(LOG, "createAiDataPlatformDataTable")
        .serviceDetails("Schema", "CreateAiDataPlatformDataTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformDataTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("dataTables")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-work-request-id", 
            CreateAiDataPlatformDataTableResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformDataTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformDataTableResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public CreateAiDataPlatformSchemaResponse createAiDataPlatformSchema(CreateAiDataPlatformSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateSchemaDetails(), "createSchemaDetails is required");
        


return clientCall(request, CreateAiDataPlatformSchemaResponse::builder)
        .logger(LOG, "createAiDataPlatformSchema")
        .serviceDetails("Schema", "CreateAiDataPlatformSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas")
        .accept("application/json")
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformSchemaResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformSchemaResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateAiDataPlatformTableResponse createAiDataPlatformTable(CreateAiDataPlatformTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateTableDetails(), "createTableDetails is required");
        


return clientCall(request, CreateAiDataPlatformTableResponse::builder)
        .logger(LOG, "createAiDataPlatformTable")
        .serviceDetails("Schema", "CreateAiDataPlatformTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("location", 
            CreateAiDataPlatformTableResponse.Builder::location)
                .handleResponseHeaderString("content-location", 
            CreateAiDataPlatformTableResponse.Builder::contentLocation)
                .handleResponseHeaderString("aidp-async-operation-key", 
            CreateAiDataPlatformTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public CreateAiDataPlatformViewResponse createAiDataPlatformView(CreateAiDataPlatformViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCreateViewDetails(), "createViewDetails is required");
        


return clientCall(request, CreateAiDataPlatformViewResponse::builder)
        .logger(LOG, "createAiDataPlatformView")
        .serviceDetails("Schema", "CreateAiDataPlatformView", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateAiDataPlatformViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views")
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, CreateAiDataPlatformViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            CreateAiDataPlatformViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            CreateAiDataPlatformViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformSchemaResponse deleteAiDataPlatformSchema(DeleteAiDataPlatformSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, DeleteAiDataPlatformSchemaResponse::builder)
        .logger(LOG, "deleteAiDataPlatformSchema")
        .serviceDetails("Schema", "DeleteAiDataPlatformSchema", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
        .accept("application/json")
                
                .appendHeader("is-forced", request.getIsForced())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteAiDataPlatformSchemaResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformTableResponse deleteAiDataPlatformTable(DeleteAiDataPlatformTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, DeleteAiDataPlatformTableResponse::builder)
        .logger(LOG, "deleteAiDataPlatformTable")
        .serviceDetails("Schema", "DeleteAiDataPlatformTable", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("aidp-async-operation-key", 
            DeleteAiDataPlatformTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public DeleteAiDataPlatformViewResponse deleteAiDataPlatformView(DeleteAiDataPlatformViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, DeleteAiDataPlatformViewResponse::builder)
        .logger(LOG, "deleteAiDataPlatformView")
        .serviceDetails("Schema", "DeleteAiDataPlatformView", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteAiDataPlatformViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            DeleteAiDataPlatformViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GenerateAiDataPlatformTempFileUploadTargetResponse generateAiDataPlatformTempFileUploadTarget(GenerateAiDataPlatformTempFileUploadTargetRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, GenerateAiDataPlatformTempFileUploadTargetResponse::builder)
        .logger(LOG, "generateAiDataPlatformTempFileUploadTarget")
        .serviceDetails("Schema", "GenerateAiDataPlatformTempFileUploadTarget", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(GenerateAiDataPlatformTempFileUploadTargetRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("generateTempFileUploadTarget")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails.class, GenerateAiDataPlatformTempFileUploadTargetResponse.Builder::generateTempFileUploadTargetResponseDetails)
                .handleResponseHeaderString("opc-request-id", 
            GenerateAiDataPlatformTempFileUploadTargetResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformSchemaResponse getAiDataPlatformSchema(GetAiDataPlatformSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, GetAiDataPlatformSchemaResponse::builder)
        .logger(LOG, "getAiDataPlatformSchema")
        .serviceDetails("Schema", "GetAiDataPlatformSchema", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, GetAiDataPlatformSchemaResponse.Builder::schema)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformTableResponse getAiDataPlatformTable(GetAiDataPlatformTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, GetAiDataPlatformTableResponse::builder)
        .logger(LOG, "getAiDataPlatformTable")
        .serviceDetails("Schema", "GetAiDataPlatformTable", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.Table.class, GetAiDataPlatformTableResponse.Builder::table)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformTableResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public GetAiDataPlatformViewResponse getAiDataPlatformView(GetAiDataPlatformViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, GetAiDataPlatformViewResponse::builder)
        .logger(LOG, "getAiDataPlatformView")
        .serviceDetails("Schema", "GetAiDataPlatformView", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetAiDataPlatformViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, GetAiDataPlatformViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            GetAiDataPlatformViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            GetAiDataPlatformViewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformSchemaPermissionsResponse listAiDataPlatformSchemaPermissions(ListAiDataPlatformSchemaPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, ListAiDataPlatformSchemaPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformSchemaPermissions")
        .serviceDetails("Schema", "ListAiDataPlatformSchemaPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformSchemaPermissionsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaPermissionCollection.class, ListAiDataPlatformSchemaPermissionsResponse.Builder::schemaPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSchemaPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformSchemaPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformSchemasResponse listAiDataPlatformSchemas(ListAiDataPlatformSchemasRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        


return clientCall(request, ListAiDataPlatformSchemasResponse::builder)
        .logger(LOG, "listAiDataPlatformSchemas")
        .serviceDetails("Schema", "ListAiDataPlatformSchemas", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformSchemasRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas")
            
                
                    
                    .appendQueryParam("catalogKey", request.getCatalogKey())
            
                
                    
                    .appendQueryParam("displayName", request.getDisplayName())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    .appendEnumQueryParam("sortOrder", request.getSortOrder())
                    
            
                
                    .appendEnumQueryParam("sortBy", request.getSortBy())
                    
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.SchemaCollection.class, ListAiDataPlatformSchemasResponse.Builder::schemaCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformSchemasResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformTablePermissionsResponse listAiDataPlatformTablePermissions(ListAiDataPlatformTablePermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, ListAiDataPlatformTablePermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformTablePermissions")
        .serviceDetails("Schema", "ListAiDataPlatformTablePermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformTablePermissionsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TablePermissionCollection.class, ListAiDataPlatformTablePermissionsResponse.Builder::tablePermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformTablePermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformTablePermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformTablesResponse listAiDataPlatformTables(ListAiDataPlatformTablesRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListAiDataPlatformTablesResponse::builder)
        .logger(LOG, "listAiDataPlatformTables")
        .serviceDetails("Schema", "ListAiDataPlatformTables", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformTablesRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables")
            
                
                    
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.TableCollection.class, ListAiDataPlatformTablesResponse.Builder::tableCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformTablesResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformViewPermissionsResponse listAiDataPlatformViewPermissions(ListAiDataPlatformViewPermissionsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");


return clientCall(request, ListAiDataPlatformViewPermissionsResponse::builder)
        .logger(LOG, "listAiDataPlatformViewPermissions")
        .serviceDetails("Schema", "ListAiDataPlatformViewPermissions", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformViewPermissionsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewPermissionCollection.class, ListAiDataPlatformViewPermissionsResponse.Builder::viewPermissionCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformViewPermissionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformViewPermissionsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ListAiDataPlatformViewsResponse listAiDataPlatformViews(ListAiDataPlatformViewsRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        Objects.requireNonNull(request.getCatalogKey(), "catalogKey is required");
        
        Objects.requireNonNull(request.getSchemaKey(), "schemaKey is required");
        


return clientCall(request, ListAiDataPlatformViewsResponse::builder)
        .logger(LOG, "listAiDataPlatformViews")
        .serviceDetails("Schema", "ListAiDataPlatformViews", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListAiDataPlatformViewsRequest::builder)
        
        
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ViewCollection.class, ListAiDataPlatformViewsResponse.Builder::viewCollection)
                .handleResponseHeaderString("opc-request-id", 
            ListAiDataPlatformViewsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", 
            ListAiDataPlatformViewsResponse.Builder::opcNextPage)

                .callSync();
    }

    @Override
    
    public ManageAiDataPlatformSchemaPermissionResponse manageAiDataPlatformSchemaPermission(ManageAiDataPlatformSchemaPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getManageSchemaPermissionDetails(), "manageSchemaPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformSchemaPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformSchemaPermission")
        .serviceDetails("Schema", "ManageAiDataPlatformSchemaPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformSchemaPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformSchemaPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageAiDataPlatformTablePermissionResponse manageAiDataPlatformTablePermission(ManageAiDataPlatformTablePermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");
        Objects.requireNonNull(request.getManageTablePermissionDetails(), "manageTablePermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformTablePermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformTablePermission")
        .serviceDetails("Schema", "ManageAiDataPlatformTablePermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformTablePermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformTablePermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public ManageAiDataPlatformViewPermissionResponse manageAiDataPlatformViewPermission(ManageAiDataPlatformViewPermissionRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");
        Objects.requireNonNull(request.getManageViewPermissionDetails(), "manageViewPermissionDetails is required");
        


return clientCall(request, ManageAiDataPlatformViewPermissionResponse::builder)
        .logger(LOG, "manageAiDataPlatformViewPermission")
        .serviceDetails("Schema", "ManageAiDataPlatformViewPermission", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(ManageAiDataPlatformViewPermissionRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey()).appendPathParam("actions").appendPathParam("managePermission")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("opc-request-id", 
            ManageAiDataPlatformViewPermissionResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PerformAiDataPlatformInferSchemaResponse performAiDataPlatformInferSchema(PerformAiDataPlatformInferSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getPerformInferSchemaDetails(), "performInferSchemaDetails is required");
        


return clientCall(request, PerformAiDataPlatformInferSchemaResponse::builder)
        .logger(LOG, "performAiDataPlatformInferSchema")
        .serviceDetails("Schema", "PerformAiDataPlatformInferSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PerformAiDataPlatformInferSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("inferSchema")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchema.class, PerformAiDataPlatformInferSchemaResponse.Builder::inferSchema)
                .handleResponseHeaderString("etag", 
            PerformAiDataPlatformInferSchemaResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformAiDataPlatformInferSchemaResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public PerformAiDataPlatformInferSchemaWithPreviewResponse performAiDataPlatformInferSchemaWithPreview(PerformAiDataPlatformInferSchemaWithPreviewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getPerformInferSchemaDetails(), "performInferSchemaDetails is required");
        


return clientCall(request, PerformAiDataPlatformInferSchemaWithPreviewResponse::builder)
        .logger(LOG, "performAiDataPlatformInferSchemaWithPreview")
        .serviceDetails("Schema", "PerformAiDataPlatformInferSchemaWithPreview", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(PerformAiDataPlatformInferSchemaWithPreviewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("inferSchemaWithPreview")
        .accept("application/json")
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.InferSchemaWithPreview.class, PerformAiDataPlatformInferSchemaWithPreviewResponse.Builder::inferSchemaWithPreview)
                .handleResponseHeaderString("etag", 
            PerformAiDataPlatformInferSchemaWithPreviewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            PerformAiDataPlatformInferSchemaWithPreviewResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public RefreshAiDataPlatformSchemaResponse refreshAiDataPlatformSchema(RefreshAiDataPlatformSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");


return clientCall(request, RefreshAiDataPlatformSchemaResponse::builder)
        .logger(LOG, "refreshAiDataPlatformSchema")
        .serviceDetails("Schema", "RefreshAiDataPlatformSchema", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RefreshAiDataPlatformSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey()).appendPathParam("actions").appendPathParam("refresh")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshAiDataPlatformSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshAiDataPlatformSchemaResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RefreshAiDataPlatformTableResponse refreshAiDataPlatformTable(RefreshAiDataPlatformTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, RefreshAiDataPlatformTableResponse::builder)
        .logger(LOG, "refreshAiDataPlatformTable")
        .serviceDetails("Schema", "RefreshAiDataPlatformTable", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RefreshAiDataPlatformTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("refresh")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
        .operationUsesDefaultRetries()
        
        
                .handleResponseHeaderString("opc-request-id", 
            RefreshAiDataPlatformTableResponse.Builder::opcRequestId)
                .handleResponseHeaderString("aidp-async-operation-key", 
            RefreshAiDataPlatformTableResponse.Builder::aidpAsyncOperationKey)

                .callSync();
    }

    @Override
    
    public RetrieveAiDataPlatformParResponse retrieveAiDataPlatformPar(RetrieveAiDataPlatformParRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");


return clientCall(request, RetrieveAiDataPlatformParResponse::builder)
        .logger(LOG, "retrieveAiDataPlatformPar")
        .serviceDetails("Schema", "RetrieveAiDataPlatformPar", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(RetrieveAiDataPlatformParRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey()).appendPathParam("actions").appendPathParam("getPar")
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.ParDetails.class, RetrieveAiDataPlatformParResponse.Builder::parDetails)
                .handleResponseHeaderString("etag", 
            RetrieveAiDataPlatformParResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            RetrieveAiDataPlatformParResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformSchemaResponse updateAiDataPlatformSchema(UpdateAiDataPlatformSchemaRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getSchemaKey(), "schemaKey must not be blank");
        Objects.requireNonNull(request.getUpdateSchemaDetails(), "updateSchemaDetails is required");
        


return clientCall(request, UpdateAiDataPlatformSchemaResponse::builder)
        .logger(LOG, "updateAiDataPlatformSchema")
        .serviceDetails("Schema", "UpdateAiDataPlatformSchema", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformSchemaRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("schemas").appendPathParam(request.getSchemaKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.Schema.class, UpdateAiDataPlatformSchemaResponse.Builder::schema)
                .handleResponseHeaderString("opc-work-request-id", 
            UpdateAiDataPlatformSchemaResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformSchemaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformSchemaResponse.Builder::etag)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformTableResponse updateAiDataPlatformTable(UpdateAiDataPlatformTableRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getTableKey(), "tableKey must not be blank");
        Objects.requireNonNull(request.getUpdateTableDetails(), "updateTableDetails is required");
        


return clientCall(request, UpdateAiDataPlatformTableResponse::builder)
        .logger(LOG, "updateAiDataPlatformTable")
        .serviceDetails("Schema", "UpdateAiDataPlatformTable", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformTableRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("tables").appendPathParam(request.getTableKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
                .handleResponseHeaderString("aidp-async-operation-key", 
            UpdateAiDataPlatformTableResponse.Builder::aidpAsyncOperationKey)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformTableResponse.Builder::opcRequestId)

                .callSync();
    }

    @Override
    
    public UpdateAiDataPlatformViewResponse updateAiDataPlatformView(UpdateAiDataPlatformViewRequest request) {
                
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");
        
        Validate.notBlank(request.getViewKey(), "viewKey must not be blank");
        Objects.requireNonNull(request.getUpdateViewDetails(), "updateViewDetails is required");
        


return clientCall(request, UpdateAiDataPlatformViewResponse::builder)
        .logger(LOG, "updateAiDataPlatformView")
        .serviceDetails("Schema", "UpdateAiDataPlatformView", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateAiDataPlatformViewRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("aiDataPlatforms").appendPathParam(request.getAiDataPlatformId()).appendPathParam("views").appendPathParam(request.getViewKey())
        .accept("application/json")
                
                .appendHeader("should-update-recent", request.getShouldUpdateRecent())
                
                .appendHeader("if-match", request.getIfMatch())
                
                .appendHeader("opc-request-id", request.getOpcRequestId())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.View.class, UpdateAiDataPlatformViewResponse.Builder::view)
                .handleResponseHeaderString("etag", 
            UpdateAiDataPlatformViewResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", 
            UpdateAiDataPlatformViewResponse.Builder::opcRequestId)

                .callSync();
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
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public SchemaClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
            authenticationDetailsProvider
        );
    }
}
