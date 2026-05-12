package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class FetchAiDataPlatformBundleDeploymentStatusRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails> {

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
     * The key of the Workspace
     */
    private String workspaceKey;

    

        /**
     * The key of the Workspace
     */
    public String getWorkspaceKey() {
        return workspaceKey;
    }
        /**
     * Request payload for FetchBundleDeploymentStatusDetails.
     */
    private com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails fetchBundleDeploymentStatusDetails;

    

        /**
     * Request payload for FetchBundleDeploymentStatusDetails.
     */
    public com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails getFetchBundleDeploymentStatusDetails() {
        return fetchBundleDeploymentStatusDetails;
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
    public com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails getBody$() {
        return fetchBundleDeploymentStatusDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<FetchAiDataPlatformBundleDeploymentStatusRequest, com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails> {
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
     * The key of the Workspace
     */
        private String workspaceKey = null;

        /**
         * The key of the Workspace
         * @param workspaceKey the value to set
         * @return this builder instance
         */
        public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = workspaceKey;
            return this;
        }

            /**
     * Request payload for FetchBundleDeploymentStatusDetails.
     */
        private com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails fetchBundleDeploymentStatusDetails = null;

        /**
         * Request payload for FetchBundleDeploymentStatusDetails.
         * @param fetchBundleDeploymentStatusDetails the value to set
         * @return this builder instance
         */
        public Builder fetchBundleDeploymentStatusDetails(com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails fetchBundleDeploymentStatusDetails) {
            this.fetchBundleDeploymentStatusDetails = fetchBundleDeploymentStatusDetails;
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
        public Builder copy(FetchAiDataPlatformBundleDeploymentStatusRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());fetchBundleDeploymentStatusDetails(o.getFetchBundleDeploymentStatusDetails());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FetchAiDataPlatformBundleDeploymentStatusRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of FetchAiDataPlatformBundleDeploymentStatusRequest
         */
        public FetchAiDataPlatformBundleDeploymentStatusRequest build() {
            FetchAiDataPlatformBundleDeploymentStatusRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.FetchBundleDeploymentStatusDetails body) {
            fetchBundleDeploymentStatusDetails(body);
            return this;
        }

        /**
         * Build the instance of FetchAiDataPlatformBundleDeploymentStatusRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FetchAiDataPlatformBundleDeploymentStatusRequest
         */
        public FetchAiDataPlatformBundleDeploymentStatusRequest buildWithoutInvocationCallback() {
            FetchAiDataPlatformBundleDeploymentStatusRequest request = new FetchAiDataPlatformBundleDeploymentStatusRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.fetchBundleDeploymentStatusDetails = fetchBundleDeploymentStatusDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new FetchAiDataPlatformBundleDeploymentStatusRequest(aiDataPlatformId, workspaceKey, fetchBundleDeploymentStatusDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .workspaceKey(workspaceKey)
            .fetchBundleDeploymentStatusDetails(fetchBundleDeploymentStatusDetails)
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
        sb.append(",workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(",fetchBundleDeploymentStatusDetails=").append(String.valueOf(this.fetchBundleDeploymentStatusDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchAiDataPlatformBundleDeploymentStatusRequest)) {
            return false;
        }

        FetchAiDataPlatformBundleDeploymentStatusRequest other = (FetchAiDataPlatformBundleDeploymentStatusRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.fetchBundleDeploymentStatusDetails, other.fetchBundleDeploymentStatusDetails)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.fetchBundleDeploymentStatusDetails == null ? 43 : this.fetchBundleDeploymentStatusDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}