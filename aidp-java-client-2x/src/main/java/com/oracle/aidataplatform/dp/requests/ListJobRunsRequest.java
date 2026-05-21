// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListJobRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The field to filter based on job key.
     */
    private java.util.List<String> jobKey;

    

        /**
     * The field to filter based on job key.
     */
    public java.util.List<String> getJobKey() {
        return jobKey;
    }
        /**
     * The field to filter based on state.
     */
    private java.util.List<Status> status;

        /**
     * The field to filter based on state.
     **/
    public enum Status {
        Pending("PENDING"),
        Running("RUNNING"),
        Skipped("SKIPPED"),
        InternalError("INTERNAL_ERROR"),
        Blocked("BLOCKED"),
        Success("SUCCESS"),
        Failed("FAILED"),
        Canceled("CANCELED"),
        UpstreamCanceled("UPSTREAM_CANCELED"),
        UpstreamFailed("UPSTREAM_FAILED"),
        Excluded("EXCLUDED"),
        ;

        

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };

        /**
     * The field to filter based on state.
     */
    public java.util.List<Status> getStatus() {
        return status;
    }
        /**
     * Fetch objects from repository that were created after or at the exact timestamp provided in parameter
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    

        /**
     * Fetch objects from repository that were created after or at the exact timestamp provided in parameter
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
        /**
     * Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
     */
    private java.util.Date timeCreatedLessThanOrEqualTo;

    

        /**
     * Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
     */
    public java.util.Date getTimeCreatedLessThanOrEqualTo() {
        return timeCreatedLessThanOrEqualTo;
    }
        /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated List call.
     */
    private Integer limit;

    

        /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated List call.
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    private SortBy sortBy;

        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        Status("status"),
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListJobRunsRequest, java.lang.Void> {
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
     * The field to filter based on job key.
     */
        private java.util.List<String> jobKey = null;

        /**
         * The field to filter based on job key.
         * @param jobKey the value to set
         * @return this builder instance
         */
        public Builder jobKey(java.util.List<String> jobKey) {
            this.jobKey = jobKey;
            return this;
        }

        /**
         * Singular setter. The field to filter based on job key.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder jobKey(String singularValue) {
            return this.jobKey(java.util.Arrays.asList(singularValue));
        }

            /**
     * The field to filter based on state.
     */
        private java.util.List<Status> status = null;

        /**
         * The field to filter based on state.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. The field to filter based on state.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(Status singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

            /**
     * Fetch objects from repository that were created after or at the exact timestamp provided in parameter
     */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * Fetch objects from repository that were created after or at the exact timestamp provided in parameter
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

            /**
     * Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
     */
        private java.util.Date timeCreatedLessThanOrEqualTo = null;

        /**
         * Fetch objects from repository that were created before or at the exact timestamp provided in parameter.
         * @param timeCreatedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThanOrEqualTo(java.util.Date timeCreatedLessThanOrEqualTo) {
            this.timeCreatedLessThanOrEqualTo = timeCreatedLessThanOrEqualTo;
            return this;
        }

            /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated List call.
     */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated List call.
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
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
        public Builder copy(ListJobRunsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());displayName(o.getDisplayName());jobKey(o.getJobKey());status(o.getStatus());timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());timeCreatedLessThanOrEqualTo(o.getTimeCreatedLessThanOrEqualTo());limit(o.getLimit());page(o.getPage());sortOrder(o.getSortOrder());sortBy(o.getSortBy());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobRunsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobRunsRequest
         */
        public ListJobRunsRequest build() {
            ListJobRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobRunsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobRunsRequest
         */
        public ListJobRunsRequest buildWithoutInvocationCallback() {
            ListJobRunsRequest request = new ListJobRunsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.displayName = displayName;
            request.jobKey = jobKey;
            request.status = status;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThanOrEqualTo = timeCreatedLessThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJobRunsRequest(aiDataPlatformId, workspaceKey, displayName, jobKey, status, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThanOrEqualTo, limit, page, sortOrder, sortBy, opcRequestId);
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
            .displayName(displayName)
            .jobKey(jobKey)
            .status(status)
            .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
            .timeCreatedLessThanOrEqualTo(timeCreatedLessThanOrEqualTo)
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
        sb.append(",workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",jobKey=").append(String.valueOf(this.jobKey));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",timeCreatedGreaterThanOrEqualTo=").append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThanOrEqualTo=").append(String.valueOf(this.timeCreatedLessThanOrEqualTo));
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
        if (!(o instanceof ListJobRunsRequest)) {
            return false;
        }

        ListJobRunsRequest other = (ListJobRunsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.displayName, other.displayName)
            && java.util.Objects.equals(this.jobKey, other.jobKey)
            && java.util.Objects.equals(this.status, other.status)
            && java.util.Objects.equals(this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
            && java.util.Objects.equals(this.timeCreatedLessThanOrEqualTo, other.timeCreatedLessThanOrEqualTo)
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
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreatedGreaterThanOrEqualTo == null ? 43 : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.timeCreatedLessThanOrEqualTo == null ? 43 : this.timeCreatedLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}