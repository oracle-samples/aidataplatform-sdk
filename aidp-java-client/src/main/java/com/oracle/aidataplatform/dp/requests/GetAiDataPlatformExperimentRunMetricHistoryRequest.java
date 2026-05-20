// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformExperimentRunMetricHistoryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * ID of the run metric history to fetch.
     */
    private String runId;

    

        /**
     * ID of the run metric history to fetch.
     */
    public String getRunId() {
        return runId;
    }
        /**
     * Name of the metric key.
     */
    private String metricKey;

    

        /**
     * Name of the metric key.
     */
    public String getMetricKey() {
        return metricKey;
    }
        /**
     * Pagination token to go to the next page of metric history.
     */
    private String pageToken;

    

        /**
     * Pagination token to go to the next page of metric history.
     */
    public String getPageToken() {
        return pageToken;
    }
        /**
     * Maximum number of logged instances of a metric for a run to return per call. Backend servers 
* may restrict the value of max_results depending on performance requirements. Requests that do 
* not specify this value will behave as non-paginated queries where all metric history values 
* for a given metric within a run are returned in a single response.
* 
     */
    private Integer maxResults;

    

        /**
     * Maximum number of logged instances of a metric for a run to return per call. Backend servers 
* may restrict the value of max_results depending on performance requirements. Requests that do 
* not specify this value will behave as non-paginated queries where all metric history values 
* for a given metric within a run are returned in a single response.
* 
     */
    public Integer getMaxResults() {
        return maxResults;
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
     * The DH User Principal Header .
     */
    private String dhUserPrincipal;

    

        /**
     * The DH User Principal Header .
     */
    public String getDhUserPrincipal() {
        return dhUserPrincipal;
    }
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<GetAiDataPlatformExperimentRunMetricHistoryRequest, java.lang.Void> {
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
     * ID of the run metric history to fetch.
     */
        private String runId = null;

        /**
         * ID of the run metric history to fetch.
         * @param runId the value to set
         * @return this builder instance
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

            /**
     * Name of the metric key.
     */
        private String metricKey = null;

        /**
         * Name of the metric key.
         * @param metricKey the value to set
         * @return this builder instance
         */
        public Builder metricKey(String metricKey) {
            this.metricKey = metricKey;
            return this;
        }

            /**
     * Pagination token to go to the next page of metric history.
     */
        private String pageToken = null;

        /**
         * Pagination token to go to the next page of metric history.
         * @param pageToken the value to set
         * @return this builder instance
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

            /**
     * Maximum number of logged instances of a metric for a run to return per call. Backend servers 
* may restrict the value of max_results depending on performance requirements. Requests that do 
* not specify this value will behave as non-paginated queries where all metric history values 
* for a given metric within a run are returned in a single response.
* 
     */
        private Integer maxResults = null;

        /**
         * Maximum number of logged instances of a metric for a run to return per call. Backend servers 
* may restrict the value of max_results depending on performance requirements. Requests that do 
* not specify this value will behave as non-paginated queries where all metric history values 
* for a given metric within a run are returned in a single response.
* 
         * @param maxResults the value to set
         * @return this builder instance
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
     * The DH User Principal Header .
     */
        private String dhUserPrincipal = null;

        /**
         * The DH User Principal Header .
         * @param dhUserPrincipal the value to set
         * @return this builder instance
         */
        public Builder dhUserPrincipal(String dhUserPrincipal) {
            this.dhUserPrincipal = dhUserPrincipal;
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
        public Builder copy(GetAiDataPlatformExperimentRunMetricHistoryRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());runId(o.getRunId());metricKey(o.getMetricKey());pageToken(o.getPageToken());maxResults(o.getMaxResults());opcRequestId(o.getOpcRequestId());dhUserPrincipal(o.getDhUserPrincipal());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAiDataPlatformExperimentRunMetricHistoryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAiDataPlatformExperimentRunMetricHistoryRequest
         */
        public GetAiDataPlatformExperimentRunMetricHistoryRequest build() {
            GetAiDataPlatformExperimentRunMetricHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAiDataPlatformExperimentRunMetricHistoryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAiDataPlatformExperimentRunMetricHistoryRequest
         */
        public GetAiDataPlatformExperimentRunMetricHistoryRequest buildWithoutInvocationCallback() {
            GetAiDataPlatformExperimentRunMetricHistoryRequest request = new GetAiDataPlatformExperimentRunMetricHistoryRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.runId = runId;
            request.metricKey = metricKey;
            request.pageToken = pageToken;
            request.maxResults = maxResults;
            request.opcRequestId = opcRequestId;
            request.dhUserPrincipal = dhUserPrincipal;
            return request;
            // new GetAiDataPlatformExperimentRunMetricHistoryRequest(aiDataPlatformId, workspaceKey, runId, metricKey, pageToken, maxResults, opcRequestId, dhUserPrincipal);
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
            .runId(runId)
            .metricKey(metricKey)
            .pageToken(pageToken)
            .maxResults(maxResults)
            .opcRequestId(opcRequestId)
            .dhUserPrincipal(dhUserPrincipal);
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
        sb.append(",runId=").append(String.valueOf(this.runId));
        sb.append(",metricKey=").append(String.valueOf(this.metricKey));
        sb.append(",pageToken=").append(String.valueOf(this.pageToken));
        sb.append(",maxResults=").append(String.valueOf(this.maxResults));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",dhUserPrincipal=").append(String.valueOf(this.dhUserPrincipal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAiDataPlatformExperimentRunMetricHistoryRequest)) {
            return false;
        }

        GetAiDataPlatformExperimentRunMetricHistoryRequest other = (GetAiDataPlatformExperimentRunMetricHistoryRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.runId, other.runId)
            && java.util.Objects.equals(this.metricKey, other.metricKey)
            && java.util.Objects.equals(this.pageToken, other.pageToken)
            && java.util.Objects.equals(this.maxResults, other.maxResults)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.dhUserPrincipal, other.dhUserPrincipal);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.metricKey == null ? 43 : this.metricKey.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.dhUserPrincipal == null ? 43 : this.dhUserPrincipal.hashCode());
        return result;
    }
}