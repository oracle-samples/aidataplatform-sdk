package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformRegisteredModelsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ListAiDataPlatformRegisteredModelsConverter.class);

    public static com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRegisteredModelsRequest interceptRequest(com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRegisteredModelsRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.ListAiDataPlatformRegisteredModelsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");                                                

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("mlops").path("api").path("2.0").path("mlflow").path("registered-models").path("search");

            if (request.getFilter() != null) { 
            target = target.queryParam("filter", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getFilter()));
             }

            if (request.getMaxResults() != null) { 
            target = target.queryParam("max_results", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getMaxResults()));
             }

            if (request.getPageToken() != null) { 
            target = target.queryParam("page_token", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getPageToken()));
             }

            if (request.getOrderBy() != null) { 
            target = target.queryParam("order_by", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getOrderBy()));
             }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();
        
        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

       if (request.getOpcRequestId() != null) { 
           ib.header("opc-request-id", request.getOpcRequestId());
       } 

       if (request.getDhUserPrincipal() != null) { 
           ib.header("dh-user-principal", request.getDhUserPrincipal());
       } 


        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.RegisteredModelCollection>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.RegisteredModelCollection.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.RegisteredModelCollection.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.RegisteredModelCollection> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse.Builder builder = com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.registeredModelCollection(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcNextPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-next-page");
        if (opcNextPageHeader.isPresent()) {
            builder.opcNextPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-next-page", opcNextPageHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformRegisteredModelsResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}