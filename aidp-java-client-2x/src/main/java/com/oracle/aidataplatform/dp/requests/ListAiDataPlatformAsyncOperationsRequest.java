// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformAsyncOperationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Required parameter which decides async operation resource type
     */
    private String resourceType;

    

        /**
     * Required parameter which decides async operation resource type
     */
    public String getResourceType() {
        return resourceType;
    }
        /**
     * A filter to return only resources that match the given resource name exactly.
     */
    private String resourceName;

    

        /**
     * A filter to return only resources that match the given resource name exactly.
     */
    public String getResourceName() {
        return resourceName;
    }
        /**
     * Parameter which decides to list async operations with prefix or exact match to resourceName
     */
    private Boolean matchResourceName;

    

        /**
     * Parameter which decides to list async operations with prefix or exact match to resourceName
     */
    public Boolean getMatchResourceName() {
        return matchResourceName;
    }
        /**
     * Option parameter to filter operation on status
     */
    private String status;

    

        /**
     * Option parameter to filter operation on status
     */
    public String getStatus() {
        return status;
    }
        /**
     * A filter to return only resources that match the current principal.
     */
    private Boolean shouldFilterByCallingPrincipal;

    

        /**
     * A filter to return only resources that match the current principal.
     */
    public Boolean getShouldFilterByCallingPrincipal() {
        return shouldFilterByCallingPrincipal;
    }
        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    private Integer limit;

    

        /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    public Integer getLimit() {
        return limit;
    }
        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    private String page;

    

        /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    public String getPage() {
        return page;
    }
        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private com.oracle.aidataplatform.dp.model.SortOrder sortOrder;

        

        /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public com.oracle.aidataplatform.dp.model.SortOrder getSortOrder() {
        return sortOrder;
    }
        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
* 
     */
    private SortBy sortBy;

        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
* 
     **/
    public enum SortBy {
        TimeStarted("timeStarted"),
        ;

        

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
* 
     */
    public SortBy getSortBy() {
        return sortBy;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListAiDataPlatformAsyncOperationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder> invocationCallback = null;
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
     * Required parameter which decides async operation resource type
     */
        private String resourceType = null;

        /**
         * Required parameter which decides async operation resource type
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

            /**
     * A filter to return only resources that match the given resource name exactly.
     */
        private String resourceName = null;

        /**
         * A filter to return only resources that match the given resource name exactly.
         * @param resourceName the value to set
         * @return this builder instance
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

            /**
     * Parameter which decides to list async operations with prefix or exact match to resourceName
     */
        private Boolean matchResourceName = null;

        /**
         * Parameter which decides to list async operations with prefix or exact match to resourceName
         * @param matchResourceName the value to set
         * @return this builder instance
         */
        public Builder matchResourceName(Boolean matchResourceName) {
            this.matchResourceName = matchResourceName;
            return this;
        }

            /**
     * Option parameter to filter operation on status
     */
        private String status = null;

        /**
         * Option parameter to filter operation on status
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

            /**
     * A filter to return only resources that match the current principal.
     */
        private Boolean shouldFilterByCallingPrincipal = null;

        /**
         * A filter to return only resources that match the current principal.
         * @param shouldFilterByCallingPrincipal the value to set
         * @return this builder instance
         */
        public Builder shouldFilterByCallingPrincipal(Boolean shouldFilterByCallingPrincipal) {
            this.shouldFilterByCallingPrincipal = shouldFilterByCallingPrincipal;
            return this;
        }

            /**
     * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
* paginated "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

            /**
     * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
* "List" call. For important details about how pagination works, see
* [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

            /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
        private com.oracle.aidataplatform.dp.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.aidataplatform.dp.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

            /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
* 
     */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code timeStarted} is descending.
* 
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder invocationCallback(com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder> invocationCallback) {
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
        public Builder copy(ListAiDataPlatformAsyncOperationsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());resourceType(o.getResourceType());resourceName(o.getResourceName());matchResourceName(o.getMatchResourceName());status(o.getStatus());shouldFilterByCallingPrincipal(o.getShouldFilterByCallingPrincipal());limit(o.getLimit());page(o.getPage());sortOrder(o.getSortOrder());sortBy(o.getSortBy());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAiDataPlatformAsyncOperationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAiDataPlatformAsyncOperationsRequest
         */
        public ListAiDataPlatformAsyncOperationsRequest build() {
            ListAiDataPlatformAsyncOperationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAiDataPlatformAsyncOperationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAiDataPlatformAsyncOperationsRequest
         */
        public ListAiDataPlatformAsyncOperationsRequest buildWithoutInvocationCallback() {
            ListAiDataPlatformAsyncOperationsRequest request = new ListAiDataPlatformAsyncOperationsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.resourceType = resourceType;
            request.resourceName = resourceName;
            request.matchResourceName = matchResourceName;
            request.status = status;
            request.shouldFilterByCallingPrincipal = shouldFilterByCallingPrincipal;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAiDataPlatformAsyncOperationsRequest(aiDataPlatformId, resourceType, resourceName, matchResourceName, status, shouldFilterByCallingPrincipal, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .resourceType(resourceType)
            .resourceName(resourceName)
            .matchResourceName(matchResourceName)
            .status(status)
            .shouldFilterByCallingPrincipal(shouldFilterByCallingPrincipal)
            .limit(limit)
            .page(page)
            .sortOrder(sortOrder)
            .sortBy(sortBy)
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
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",resourceName=").append(String.valueOf(this.resourceName));
        sb.append(",matchResourceName=").append(String.valueOf(this.matchResourceName));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",shouldFilterByCallingPrincipal=").append(String.valueOf(this.shouldFilterByCallingPrincipal));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAiDataPlatformAsyncOperationsRequest)) {
            return false;
        }

        ListAiDataPlatformAsyncOperationsRequest other = (ListAiDataPlatformAsyncOperationsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.resourceType, other.resourceType)
            && java.util.Objects.equals(this.resourceName, other.resourceName)
            && java.util.Objects.equals(this.matchResourceName, other.matchResourceName)
            && java.util.Objects.equals(this.status, other.status)
            && java.util.Objects.equals(this.shouldFilterByCallingPrincipal, other.shouldFilterByCallingPrincipal)
            && java.util.Objects.equals(this.limit, other.limit)
            && java.util.Objects.equals(this.page, other.page)
            && java.util.Objects.equals(this.sortOrder, other.sortOrder)
            && java.util.Objects.equals(this.sortBy, other.sortBy)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.matchResourceName == null ? 43 : this.matchResourceName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.shouldFilterByCallingPrincipal == null ? 43 : this.shouldFilterByCallingPrincipal.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}