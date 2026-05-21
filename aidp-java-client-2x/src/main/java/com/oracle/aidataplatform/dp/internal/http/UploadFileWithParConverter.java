// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UploadFileWithParConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(UploadFileWithParConverter.class);

    public static com.oracle.aidataplatform.dp.requests.UploadFileWithParRequest interceptRequest(com.oracle.aidataplatform.dp.requests.UploadFileWithParRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.UploadFileWithParRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getVolumeKey(), "volumeKey must not be blank");        Validate.notNull(request.getUploadFileWithParDetails(), "uploadFileWithParDetails is required");        Validate.notNull(request.getPath(), "path is required");                                        

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("volumes").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getVolumeKey())).path("actions").path("uploadFileMeta");

            if (request.getIsOverwrite() != null) { 
            target = target.queryParam("isOverwrite", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getIsOverwrite()));
             }

            if (request.getShouldGenerateNewPar() != null) { 
            target = target.queryParam("shouldGenerateNewPar", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getShouldGenerateNewPar()));
             }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();
        
        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

       if (request.getShouldUpdateRecent() != null) { 
           ib.header("should-update-recent", request.getShouldUpdateRecent());
       } 


           ib.header("path", request.getPath());


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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.UploadFileWithParResult>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.UploadFileWithParResult.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.UploadFileWithParResult> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse.Builder builder = com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.uploadFileWithParResult(response.getItem());
        
        java.util.Optional<java.util.List<String>> locationHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "location");
        if (locationHeader.isPresent()) {
            builder.location(com.oracle.bmc.http.internal.HeaderUtils.toValue("location", locationHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> contentLocationHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "content-location");
        if (contentLocationHeader.isPresent()) {
            builder.contentLocation(com.oracle.bmc.http.internal.HeaderUtils.toValue("content-location", contentLocationHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> etagHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "etag");
        if (etagHeader.isPresent()) {
            builder.etag(com.oracle.bmc.http.internal.HeaderUtils.toValue("etag", etagHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.UploadFileWithParResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}