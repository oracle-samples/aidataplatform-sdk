package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformClusterLibrariesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ListAiDataPlatformClusterLibrariesConverter.class);

    public static com.oracle.aidataplatform.dp.requests.ListAiDataPlatformClusterLibrariesRequest interceptRequest(com.oracle.aidataplatform.dp.requests.ListAiDataPlatformClusterLibrariesRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.ListAiDataPlatformClusterLibrariesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");                                                

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("clusters").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getClusterKey())).path("libraries");

            if (request.getDisplayName() != null) { 
            target = target.queryParam("displayName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getDisplayName()));
             }

            if (request.getLimit() != null) { 
            target = target.queryParam("limit", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getLimit()));
             }

            if (request.getPage() != null) { 
            target = target.queryParam("page", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getPage()));
             }

            if (request.getSortOrder() != null) { 
            target = target.queryParam("sortOrder", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getSortOrder().getValue()));
             }

            if (request.getSortBy() != null) { 
            target = target.queryParam("sortBy", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getSortBy().getValue()));
             }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();
        
        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

       if (request.getOpcRequestId() != null) { 
           ib.header("opc-request-id", request.getOpcRequestId());
       } 


        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.ClusterLibraryCollection>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.ClusterLibraryCollection.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.ClusterLibraryCollection> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse.Builder builder = com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.clusterLibraryCollection(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcNextPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-next-page");
        if (opcNextPageHeader.isPresent()) {
            builder.opcNextPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-next-page", opcNextPageHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcPrevPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-prev-page");
        if (opcPrevPageHeader.isPresent()) {
            builder.opcPrevPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-prev-page", opcPrevPageHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcTotalItemsHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-total-items");
        if (opcTotalItemsHeader.isPresent()) {
            builder.opcTotalItems(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-total-items", opcTotalItemsHeader.get().get(0), Integer.class));
        }

        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformClusterLibrariesResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}