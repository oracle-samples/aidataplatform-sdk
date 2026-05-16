// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformGitDiffDetailConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GetAiDataPlatformGitDiffDetailConverter.class);

    public static com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitDiffDetailRequest interceptRequest(com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitDiffDetailRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitDiffDetailRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");        Validate.notNull(request.getGitFolderPath(), "gitFolderPath is required");        Validate.notNull(request.getBranchName(), "branchName is required");        Validate.notNull(request.getGitFilePath(), "gitFilePath is required");                        

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("gitRepositories").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getGitRepositoryKey())).path("actions").path("gitDiffDetails");

            
            target = target.queryParam("gitFolderPath", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getGitFolderPath()));
            

            
            target = target.queryParam("branchName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getBranchName()));
            

            
            target = target.queryParam("gitFilePath", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getGitFilePath()));
            

            if (request.getContextLines() != null) { 
            target = target.queryParam("contextLines", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getContextLines()));
             }

            if (request.getMaxPatchBytes() != null) { 
            target = target.queryParam("maxPatchBytes", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getMaxPatchBytes()));
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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitDiffDetail>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitDiffDetail.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitDiffDetail.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitDiffDetail> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse.Builder builder = com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.gitDiffDetail(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitDiffDetailResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}