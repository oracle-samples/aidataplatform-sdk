package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformRecipientSharesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The key of the recipient resource
     */
    private String recipientKey;

    

        /**
     * The key of the recipient resource
     */
    public String getRecipientKey() {
        return recipientKey;
    }
        /**
     * A filter to return only resources that match the given display name exactly.
     */
    private String displayName;

    

        /**
     * A filter to return only resources that match the given display name exactly.
     */
    public String getDisplayName() {
        return displayName;
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
* is descending. Default order for {@code displayName} is ascending.
* 
     */
    private SortBy sortBy;

        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
* is descending. Default order for {@code displayName} is ascending.
* 
     **/
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
* is descending. Default order for {@code displayName} is ascending.
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
        /**
     * A flag to identify if the recent list should be updated.
     */
    private Boolean shouldUpdateRecent;

    

        /**
     * A flag to identify if the recent list should be updated.
     */
    public Boolean getShouldUpdateRecent() {
        return shouldUpdateRecent;
    }
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListAiDataPlatformRecipientSharesRequest, java.lang.Void> {
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
     * The key of the recipient resource
     */
        private String recipientKey = null;

        /**
         * The key of the recipient resource
         * @param recipientKey the value to set
         * @return this builder instance
         */
        public Builder recipientKey(String recipientKey) {
            this.recipientKey = recipientKey;
            return this;
        }

            /**
     * A filter to return only resources that match the given display name exactly.
     */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
* is descending. Default order for {@code displayName} is ascending.
* 
     */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated}
* is descending. Default order for {@code displayName} is ascending.
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
     * A flag to identify if the recent list should be updated.
     */
        private Boolean shouldUpdateRecent = null;

        /**
         * A flag to identify if the recent list should be updated.
         * @param shouldUpdateRecent the value to set
         * @return this builder instance
         */
        public Builder shouldUpdateRecent(Boolean shouldUpdateRecent) {
            this.shouldUpdateRecent = shouldUpdateRecent;
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
        public Builder copy(ListAiDataPlatformRecipientSharesRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());recipientKey(o.getRecipientKey());displayName(o.getDisplayName());limit(o.getLimit());page(o.getPage());sortOrder(o.getSortOrder());sortBy(o.getSortBy());opcRequestId(o.getOpcRequestId());shouldUpdateRecent(o.getShouldUpdateRecent());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAiDataPlatformRecipientSharesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAiDataPlatformRecipientSharesRequest
         */
        public ListAiDataPlatformRecipientSharesRequest build() {
            ListAiDataPlatformRecipientSharesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAiDataPlatformRecipientSharesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAiDataPlatformRecipientSharesRequest
         */
        public ListAiDataPlatformRecipientSharesRequest buildWithoutInvocationCallback() {
            ListAiDataPlatformRecipientSharesRequest request = new ListAiDataPlatformRecipientSharesRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.recipientKey = recipientKey;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.shouldUpdateRecent = shouldUpdateRecent;
            return request;
            // new ListAiDataPlatformRecipientSharesRequest(aiDataPlatformId, recipientKey, displayName, limit, page, sortOrder, sortBy, opcRequestId, shouldUpdateRecent);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .recipientKey(recipientKey)
            .displayName(displayName)
            .limit(limit)
            .page(page)
            .sortOrder(sortOrder)
            .sortBy(sortBy)
            .opcRequestId(opcRequestId)
            .shouldUpdateRecent(shouldUpdateRecent);
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
        sb.append(",recipientKey=").append(String.valueOf(this.recipientKey));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAiDataPlatformRecipientSharesRequest)) {
            return false;
        }

        ListAiDataPlatformRecipientSharesRequest other = (ListAiDataPlatformRecipientSharesRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.recipientKey, other.recipientKey)
            && java.util.Objects.equals(this.displayName, other.displayName)
            && java.util.Objects.equals(this.limit, other.limit)
            && java.util.Objects.equals(this.page, other.page)
            && java.util.Objects.equals(this.sortOrder, other.sortOrder)
            && java.util.Objects.equals(this.sortBy, other.sortBy)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.recipientKey == null ? 43 : this.recipientKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        return result;
    }
}