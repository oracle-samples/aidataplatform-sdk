package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class StartAiDataPlatformClusterConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(StartAiDataPlatformClusterConverter.class);

    public static com.oracle.aidataplatform.dp.requests.StartAiDataPlatformClusterRequest interceptRequest(com.oracle.aidataplatform.dp.requests.StartAiDataPlatformClusterRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.StartAiDataPlatformClusterRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getClusterKey(), "clusterKey must not be blank");        Validate.notNull(request.getStartClusterDetails(), "startClusterDetails is required");                        

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("clusters").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getClusterKey())).path("actions").path("start");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();
        
        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

       if (request.getIfMatch() != null) { 
           ib.header("if-match", request.getIfMatch());
       } 

       if (request.getOpcRetryToken() != null) { 
           ib.header("opc-retry-token", request.getOpcRetryToken());
       } 

       if (request.getOpcRequestId() != null) { 
           ib.header("opc-request-id", request.getOpcRequestId());
       } 


        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.Cluster>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.Cluster.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.Cluster.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.Cluster> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse.Builder builder = com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.cluster(response.getItem());
        
        java.util.Optional<java.util.List<String>> aidpAsyncOperationKeyHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "aidp-async-operation-key");
        if (aidpAsyncOperationKeyHeader.isPresent()) {
            builder.aidpAsyncOperationKey(com.oracle.bmc.http.internal.HeaderUtils.toValue("aidp-async-operation-key", aidpAsyncOperationKeyHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> etagHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "etag");
        if (etagHeader.isPresent()) {
            builder.etag(com.oracle.bmc.http.internal.HeaderUtils.toValue("etag", etagHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.StartAiDataPlatformClusterResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}