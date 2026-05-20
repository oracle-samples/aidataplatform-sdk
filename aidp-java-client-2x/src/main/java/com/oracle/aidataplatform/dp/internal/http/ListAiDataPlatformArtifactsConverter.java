// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformArtifactsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ListAiDataPlatformArtifactsConverter.class);

    public static com.oracle.aidataplatform.dp.requests.ListAiDataPlatformArtifactsRequest interceptRequest(com.oracle.aidataplatform.dp.requests.ListAiDataPlatformArtifactsRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.ListAiDataPlatformArtifactsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notNull(request.getRunId(), "runId is required");                                

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("mlops").path("api").path("2.0").path("mlflow").path("artifacts").path("list");

            
            target = target.queryParam("run_id", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getRunId()));
            

            if (request.getPath() != null) { 
            target = target.queryParam("path", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getPath()));
             }

            if (request.getPageToken() != null) { 
            target = target.queryParam("page_token", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getPageToken()));
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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.ArtifactList>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.ArtifactList.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.ArtifactList.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.ArtifactList> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse.Builder builder = com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.artifactList(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcNextPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-next-page");
        if (opcNextPageHeader.isPresent()) {
            builder.opcNextPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-next-page", opcNextPageHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.ListAiDataPlatformArtifactsResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}