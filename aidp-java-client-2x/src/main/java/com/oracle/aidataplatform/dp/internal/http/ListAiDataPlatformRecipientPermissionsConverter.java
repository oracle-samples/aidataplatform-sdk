package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformRecipientPermissionsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ListAiDataPlatformRecipientPermissionsConverter.class);

    public static com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRecipientPermissionsRequest interceptRequest(com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRecipientPermissionsRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRecipientPermissionsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getRecipientKey(), "recipientKey must not be blank");                                                

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("recipients").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getRecipientKey())).path("permissions");

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

       if (request.getShouldUpdateRecent() != null) { 
           ib.header("should-update-recent", request.getShouldUpdateRecent());
       } 


        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.RecipientPermissionCollection>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.RecipientPermissionCollection.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.RecipientPermissionCollection.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.RecipientPermissionCollection> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse.Builder builder = com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.recipientPermissionCollection(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcNextPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-next-page");
        if (opcNextPageHeader.isPresent()) {
            builder.opcNextPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-next-page", opcNextPageHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRecipientPermissionsResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}