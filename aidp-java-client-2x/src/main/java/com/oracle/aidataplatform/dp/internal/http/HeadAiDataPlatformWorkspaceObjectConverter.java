package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class HeadAiDataPlatformWorkspaceObjectConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(HeadAiDataPlatformWorkspaceObjectConverter.class);

    public static com.oracle.aidataplatform.dp.requests.HeadAiDataPlatformWorkspaceObjectRequest interceptRequest(com.oracle.aidataplatform.dp.requests.HeadAiDataPlatformWorkspaceObjectRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.HeadAiDataPlatformWorkspaceObjectRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getObjectPath(), "objectPath must not be blank");                        

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("objects").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getObjectPath()));

            if (request.getShouldIncludeMetadata() != null) { 
            target = target.queryParam("shouldIncludeMetadata", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getShouldIncludeMetadata()));
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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<Void>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create();
        }

        com.oracle.bmc.http.internal.WithHeaders<Void> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse.Builder builder = com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> objectKeyHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "object-key");
        if (objectKeyHeader.isPresent()) {
            builder.objectKey(com.oracle.bmc.http.internal.HeaderUtils.toValue("object-key", objectKeyHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> pathHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "path");
        if (pathHeader.isPresent()) {
            builder.path(com.oracle.bmc.http.internal.HeaderUtils.toValue("path", pathHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> typeHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "type");
        if (typeHeader.isPresent()) {
            builder.type(com.oracle.bmc.http.internal.HeaderUtils.toValue("type", typeHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> timeUpdatedHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "time-updated");
        if (timeUpdatedHeader.isPresent()) {
            builder.timeUpdated(com.oracle.bmc.http.internal.HeaderUtils.toValue("time-updated", timeUpdatedHeader.get().get(0), java.util.Date.class));
        }

        java.util.Optional<java.util.List<String>> fileMetadataHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "file-metadata");
        if (fileMetadataHeader.isPresent()) {
            builder.fileMetadata(com.oracle.bmc.http.internal.HeaderUtils.toValue("file-metadata", fileMetadataHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> compositeEtagHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "composite-etag");
        if (compositeEtagHeader.isPresent()) {
            builder.compositeEtag(com.oracle.bmc.http.internal.HeaderUtils.toValue("composite-etag", compositeEtagHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.HeadAiDataPlatformWorkspaceObjectResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}