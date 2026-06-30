// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListModelVersionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string 
* values wrapped in single quotes.
* 
     */
    private String filter;

    

        /**
     * String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string 
* values wrapped in single quotes.
* 
     */
    public String getFilter() {
        return filter;
    }
        /**
     * Maximum number of model versions to retrieve.
     */
    private Long maxResults;

    

        /**
     * Maximum number of model versions to retrieve.
     */
    public Long getMaxResults() {
        return maxResults;
    }
        /**
     * Pagination token to go to the next page based on a previous search query.
     */
    private String pageToken;

    

        /**
     * Pagination token to go to the next page based on a previous search query.
     */
    public String getPageToken() {
        return pageToken;
    }
        /**
     * List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" 
* annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, 
* followed by name ASC, followed by version DESC.
* 
     */
    private String orderBy;

    

        /**
     * List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" 
* annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, 
* followed by name ASC, followed by version DESC.
* 
     */
    public String getOrderBy() {
        return orderBy;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListModelVersionsRequest, java.lang.Void> {
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
     * String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string 
* values wrapped in single quotes.
* 
     */
        private String filter = null;

        /**
         * String filter condition, like "name LIKE 'my-model-name'". Single boolean condition, with string 
* values wrapped in single quotes.
* 
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

            /**
     * Maximum number of model versions to retrieve.
     */
        private Long maxResults = null;

        /**
         * Maximum number of model versions to retrieve.
         * @param maxResults the value to set
         * @return this builder instance
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

            /**
     * Pagination token to go to the next page based on a previous search query.
     */
        private String pageToken = null;

        /**
         * Pagination token to go to the next page based on a previous search query.
         * @param pageToken the value to set
         * @return this builder instance
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

            /**
     * List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" 
* annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, 
* followed by name ASC, followed by version DESC.
* 
     */
        private String orderBy = null;

        /**
         * List of columns to be ordered by including model name, version, stage with an optional "DESC" or "ASC" 
* annotation, where "ASC" is the default. Tiebreaks are done by latest stage transition timestamp, 
* followed by name ASC, followed by version DESC.
* 
         * @param orderBy the value to set
         * @return this builder instance
         */
        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
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
        public Builder copy(ListModelVersionsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());filter(o.getFilter());maxResults(o.getMaxResults());pageToken(o.getPageToken());orderBy(o.getOrderBy());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListModelVersionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListModelVersionsRequest
         */
        public ListModelVersionsRequest build() {
            ListModelVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListModelVersionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListModelVersionsRequest
         */
        public ListModelVersionsRequest buildWithoutInvocationCallback() {
            ListModelVersionsRequest request = new ListModelVersionsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.filter = filter;
            request.maxResults = maxResults;
            request.pageToken = pageToken;
            request.orderBy = orderBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListModelVersionsRequest(aiDataPlatformId, filter, maxResults, pageToken, orderBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .filter(filter)
            .maxResults(maxResults)
            .pageToken(pageToken)
            .orderBy(orderBy)
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
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",maxResults=").append(String.valueOf(this.maxResults));
        sb.append(",pageToken=").append(String.valueOf(this.pageToken));
        sb.append(",orderBy=").append(String.valueOf(this.orderBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListModelVersionsRequest)) {
            return false;
        }

        ListModelVersionsRequest other = (ListModelVersionsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.filter, other.filter)
            && java.util.Objects.equals(this.maxResults, other.maxResults)
            && java.util.Objects.equals(this.pageToken, other.pageToken)
            && java.util.Objects.equals(this.orderBy, other.orderBy)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}