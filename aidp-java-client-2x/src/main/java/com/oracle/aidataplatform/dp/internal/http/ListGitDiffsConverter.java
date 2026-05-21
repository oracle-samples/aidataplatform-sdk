// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.internal.http;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.aidataplatform.dp.model.*;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListGitDiffsConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2 RESPONSE_CONVERSION_FACTORY =
            new com.oracle.bmc.http.internal.ResponseConversionFunctionFactoryV2();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ListGitDiffsConverter.class);

    public static com.oracle.aidataplatform.dp.requests.ListGitDiffsRequest interceptRequest(com.oracle.aidataplatform.dp.requests.ListGitDiffsRequest request) {
      
        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(com.oracle.bmc.http.internal.RestClient client, com.oracle.aidataplatform.dp.requests.ListGitDiffsRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getAiDataPlatformId(), "aiDataPlatformId must not be blank");        Validate.notBlank(request.getWorkspaceKey(), "workspaceKey must not be blank");        Validate.notBlank(request.getGitRepositoryKey(), "gitRepositoryKey must not be blank");        Validate.notNull(request.getGitFolderPath(), "gitFolderPath is required");        Validate.notNull(request.getBranchName(), "branchName is required");                                                                

        com.oracle.bmc.http.internal.WrappedWebTarget target = client.getBaseTarget()
        .path("/20260430")
            .path("aiDataPlatforms").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getAiDataPlatformId())).path("workspaces").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getWorkspaceKey())).path("gitRepositories").path(com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(request.getGitRepositoryKey())).path("actions").path("gitDiff");

            
            target = target.queryParam("gitFolderPath", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getGitFolderPath()));
            

            
            target = target.queryParam("branchName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getBranchName()));
            

            if (request.getCompareTo() != null) { 
            target = target.queryParam("compareTo", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getCompareTo().getValue()));
             }

            if (request.getFilter() != null) { 
            target = target.queryParam("filter", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getFilter().getValue()));
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

            if (request.getDisplayName() != null) { 
            target = target.queryParam("displayName", com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(request.getDisplayName()));
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
      
    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse> fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse> fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
    final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse> transformer = new java.util.function.Function<javax.ws.rs.core.Response, com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse>() {
    @Override
    public com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse apply(javax.ws.rs.core.Response rawResponse) {
        LOG.trace("Transform function invoked for com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse");
        final java.util.function.Function<javax.ws.rs.core.Response, com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection>> responseFn;
        if (serviceDetails.isPresent()) {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection.class, serviceDetails.get());
        }
        else {
            responseFn = RESPONSE_CONVERSION_FACTORY.create(com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection.class);
        }

        com.oracle.bmc.http.internal.WithHeaders<com.oracle.aidataplatform.dp.model.GitDiffSummaryCollection> response = responseFn.apply(rawResponse);
        javax.ws.rs.core.MultivaluedMap<String, String> headers = response.getHeaders();
        
        com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse.Builder builder = com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse.builder().__httpStatusCode__(rawResponse.getStatus()).headers(headers);

        builder.gitDiffSummaryCollection(response.getItem());
        
        java.util.Optional<java.util.List<String>> opcRequestIdHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-request-id");
        if (opcRequestIdHeader.isPresent()) {
            builder.opcRequestId(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-request-id", opcRequestIdHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcNextPageHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-next-page");
        if (opcNextPageHeader.isPresent()) {
            builder.opcNextPage(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-next-page", opcNextPageHeader.get().get(0), String.class));
        }

        java.util.Optional<java.util.List<String>> opcTotalItemsHeader = com.oracle.bmc.http.internal.HeaderUtils.getHeadersWithName(headers, "opc-total-items");
        if (opcTotalItemsHeader.isPresent()) {
            builder.opcTotalItems(com.oracle.bmc.http.internal.HeaderUtils.toValue("opc-total-items", opcTotalItemsHeader.get().get(0), Integer.class));
        }

        com.oracle.aidataplatform.dp.responses.ListGitDiffsResponse responseWrapper = builder.build();
        
        ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
            return responseWrapper;
        }
};
            return transformer;
     }

}