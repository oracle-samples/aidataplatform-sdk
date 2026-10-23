// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetModelDeploymentInferenceSummaryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Inclusive start of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-01T00:00:00Z.
     */
    private java.util.Date timeStart;

    

        /**
     * Inclusive start of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-01T00:00:00Z.
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
        /**
     * Inclusive end of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-15T00:00:00Z.
     */
    private java.util.Date timeEnd;

    

        /**
     * Inclusive end of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-15T00:00:00Z.
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<GetModelDeploymentInferenceSummaryRequest, java.lang.Void> {
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
     * Inclusive start of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-01T00:00:00Z.
     */
        private java.util.Date timeStart = null;

        /**
         * Inclusive start of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-01T00:00:00Z.
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

            /**
     * Inclusive end of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-15T00:00:00Z.
     */
        private java.util.Date timeEnd = null;

        /**
         * Inclusive end of the request timestamp range. The range must be within the most recent 14 days. Example: 2026-09-15T00:00:00Z.
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
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
        public Builder copy(GetModelDeploymentInferenceSummaryRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());deploymentId(o.getDeploymentId());timeStart(o.getTimeStart());timeEnd(o.getTimeEnd());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetModelDeploymentInferenceSummaryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetModelDeploymentInferenceSummaryRequest
         */
        public GetModelDeploymentInferenceSummaryRequest build() {
            GetModelDeploymentInferenceSummaryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetModelDeploymentInferenceSummaryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetModelDeploymentInferenceSummaryRequest
         */
        public GetModelDeploymentInferenceSummaryRequest buildWithoutInvocationCallback() {
            GetModelDeploymentInferenceSummaryRequest request = new GetModelDeploymentInferenceSummaryRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.deploymentId = deploymentId;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetModelDeploymentInferenceSummaryRequest(aiDataPlatformId, deploymentId, timeStart, timeEnd, opcRequestId);
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
            .timeStart(timeStart)
            .timeEnd(timeEnd)
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
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetModelDeploymentInferenceSummaryRequest)) {
            return false;
        }

        GetModelDeploymentInferenceSummaryRequest other = (GetModelDeploymentInferenceSummaryRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.deploymentId, other.deploymentId)
            && java.util.Objects.equals(this.timeStart, other.timeStart)
            && java.util.Objects.equals(this.timeEnd, other.timeEnd)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}