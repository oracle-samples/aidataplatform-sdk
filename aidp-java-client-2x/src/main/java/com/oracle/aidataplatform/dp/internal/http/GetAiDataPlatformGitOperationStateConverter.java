package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformGitOperationStateConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GetAiDataPlatformGitOperationStateConverter.class);

    public static com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitOperationStateRequest interceptRequest(com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitOperationStateRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.GetAiDataPlatformGitOperationStateRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");                        

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("gitRepositories").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getGitRepositoryKey())).path("actions").path("gitOperationState");

            if (request.getOperationName() != null) { 
            target = target.queryParam("operationName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getOperationName()));
             }

            if (request.getBranchName() != null) { 
            target = target.queryParam("branchName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getBranchName()));
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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitOperationState>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitOperationState.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitOperationState.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitOperationState> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse.Builder builder = com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.gitOperationState(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        com.oracle.aidataplatform.dp.responses.GetAiDataPlatformGitOperationStateResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}