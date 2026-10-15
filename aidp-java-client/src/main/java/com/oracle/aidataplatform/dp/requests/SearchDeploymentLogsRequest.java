// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SearchDeploymentLogsRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails> {

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    private String aiDataPlatformId;

    

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    public String getAiDataPlatformId() {
        return aiDataPlatformId;
    }
        /**
     * The unique 32-character hexadecimal ID of the model deployment.
     */
    private String deploymentId;

    

        /**
     * The unique 32-character hexadecimal ID of the model deployment.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
        /**
     * Window, filters, and pagination for the log search.
     */
    private com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails searchDeploymentLogsDetails;

    

        /**
     * Window, filters, and pagination for the log search.
     */
    public com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails getSearchDeploymentLogsDetails() {
        return searchDeploymentLogsDetails;
    }
        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    private String opcRequestId;

    

        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails getBody$() {
        return searchDeploymentLogsDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<SearchDeploymentLogsRequest, com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

            /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
        private String aiDataPlatformId = null;

        /**
         * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
         * @param aiDataPlatformId the value to set
         * @return this builder instance
         */
        public Builder aiDataPlatformId(String aiDataPlatformId) {
            this.aiDataPlatformId = aiDataPlatformId;
            return this;
        }

            /**
     * The unique 32-character hexadecimal ID of the model deployment.
     */
        private String deploymentId = null;

        /**
         * The unique 32-character hexadecimal ID of the model deployment.
         * @param deploymentId the value to set
         * @return this builder instance
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

            /**
     * Window, filters, and pagination for the log search.
     */
        private com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails searchDeploymentLogsDetails = null;

        /**
         * Window, filters, and pagination for the log search.
         * @param searchDeploymentLogsDetails the value to set
         * @return this builder instance
         */
        public Builder searchDeploymentLogsDetails(com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails searchDeploymentLogsDetails) {
            this.searchDeploymentLogsDetails = searchDeploymentLogsDetails;
            return this;
        }

            /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
        com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SearchDeploymentLogsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());deploymentId(o.getDeploymentId());searchDeploymentLogsDetails(o.getSearchDeploymentLogsDetails());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SearchDeploymentLogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SearchDeploymentLogsRequest
         */
        public SearchDeploymentLogsRequest build() {
            SearchDeploymentLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.aidataplatform.dp.model.SearchDeploymentLogsDetails body) {
            searchDeploymentLogsDetails(body);
            return this;
        }

        /**
         * Build the instance of SearchDeploymentLogsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SearchDeploymentLogsRequest
         */
        public SearchDeploymentLogsRequest buildWithoutInvocationCallback() {
            SearchDeploymentLogsRequest request = new SearchDeploymentLogsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.deploymentId = deploymentId;
            request.searchDeploymentLogsDetails = searchDeploymentLogsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new SearchDeploymentLogsRequest(aiDataPlatformId, deploymentId, searchDeploymentLogsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .deploymentId(deploymentId)
            .searchDeploymentLogsDetails(searchDeploymentLogsDetails)
            .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",aiDataPlatformId=").append(String.valueOf(this.aiDataPlatformId));
        sb.append(",deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(",searchDeploymentLogsDetails=").append(String.valueOf(this.searchDeploymentLogsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchDeploymentLogsRequest)) {
            return false;
        }

        SearchDeploymentLogsRequest other = (SearchDeploymentLogsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.deploymentId, other.deploymentId)
            && java.util.Objects.equals(this.searchDeploymentLogsDetails, other.searchDeploymentLogsDetails)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.searchDeploymentLogsDetails == null ? 43 : this.searchDeploymentLogsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}