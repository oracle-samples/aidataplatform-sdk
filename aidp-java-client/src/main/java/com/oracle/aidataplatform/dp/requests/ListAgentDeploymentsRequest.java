// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAgentDeploymentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The UUID of the Agent
     */
    private String agentKey;

    

        /**
     * The UUID of the Agent
     */
    public String getAgentKey() {
        return agentKey;
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
     * A filter to return only resources that have a display name containing the text provided.
     */
    private String displayNameContains;

    

        /**
     * A filter to return only resources that have a display name containing the text provided.
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
        /**
     * A filter to return only resources whose value matches the given lifecycleState.
     */
    private java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState> lifecycleState;

        

        /**
     * A filter to return only resources whose value matches the given lifecycleState.
     */
    public java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState> getLifecycleState() {
        return lifecycleState;
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    private SortBy sortBy;

        /**
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
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
     * The field to sort by. You can provide only one sort order. Default order for {@code timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
        /**
     * Compute key.
     */
    private java.util.List<String> computeKey;

    

        /**
     * Compute key.
     */
    public java.util.List<String> getComputeKey() {
        return computeKey;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListAgentDeploymentsRequest, java.lang.Void> {
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
     * The UUID of the Agent
     */
        private String agentKey = null;

        /**
         * The UUID of the Agent
         * @param agentKey the value to set
         * @return this builder instance
         */
        public Builder agentKey(String agentKey) {
            this.agentKey = agentKey;
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
     * A filter to return only resources that have a display name containing the text provided.
     */
        private String displayNameContains = null;

        /**
         * A filter to return only resources that have a display name containing the text provided.
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

            /**
     * A filter to return only resources whose value matches the given lifecycleState.
     */
        private java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState> lifecycleState = null;

        /**
         * A filter to return only resources whose value matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(java.util.List<com.oracle.aidataplatform.dp.model.DeploymentLifecycleState> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose value matches the given lifecycleState.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(DeploymentLifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
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
     * Compute key.
     */
        private java.util.List<String> computeKey = null;

        /**
         * Compute key.
         * @param computeKey the value to set
         * @return this builder instance
         */
        public Builder computeKey(java.util.List<String> computeKey) {
            this.computeKey = computeKey;
            return this;
        }

        /**
         * Singular setter. Compute key.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder computeKey(String singularValue) {
            return this.computeKey(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListAgentDeploymentsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());agentKey(o.getAgentKey());limit(o.getLimit());page(o.getPage());sortOrder(o.getSortOrder());displayName(o.getDisplayName());displayNameContains(o.getDisplayNameContains());lifecycleState(o.getLifecycleState());timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());timeCreatedLessThanOrEqualTo(o.getTimeCreatedLessThanOrEqualTo());sortBy(o.getSortBy());computeKey(o.getComputeKey());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAgentDeploymentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAgentDeploymentsRequest
         */
        public ListAgentDeploymentsRequest build() {
            ListAgentDeploymentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAgentDeploymentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAgentDeploymentsRequest
         */
        public ListAgentDeploymentsRequest buildWithoutInvocationCallback() {
            ListAgentDeploymentsRequest request = new ListAgentDeploymentsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.agentKey = agentKey;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThanOrEqualTo = timeCreatedLessThanOrEqualTo;
            request.sortBy = sortBy;
            request.computeKey = computeKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAgentDeploymentsRequest(aiDataPlatformId, workspaceKey, agentKey, limit, page, sortOrder, displayName, displayNameContains, lifecycleState, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThanOrEqualTo, sortBy, computeKey, opcRequestId);
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
            .agentKey(agentKey)
            .limit(limit)
            .page(page)
            .sortOrder(sortOrder)
            .displayName(displayName)
            .displayNameContains(displayNameContains)
            .lifecycleState(lifecycleState)
            .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
            .timeCreatedLessThanOrEqualTo(timeCreatedLessThanOrEqualTo)
            .sortBy(sortBy)
            .computeKey(computeKey)
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
        sb.append(",agentKey=").append(String.valueOf(this.agentKey));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreatedGreaterThanOrEqualTo=").append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThanOrEqualTo=").append(String.valueOf(this.timeCreatedLessThanOrEqualTo));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",computeKey=").append(String.valueOf(this.computeKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAgentDeploymentsRequest)) {
            return false;
        }

        ListAgentDeploymentsRequest other = (ListAgentDeploymentsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.agentKey, other.agentKey)
            && java.util.Objects.equals(this.limit, other.limit)
            && java.util.Objects.equals(this.page, other.page)
            && java.util.Objects.equals(this.sortOrder, other.sortOrder)
            && java.util.Objects.equals(this.displayName, other.displayName)
            && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
            && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
            && java.util.Objects.equals(this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
            && java.util.Objects.equals(this.timeCreatedLessThanOrEqualTo, other.timeCreatedLessThanOrEqualTo)
            && java.util.Objects.equals(this.sortBy, other.sortBy)
            && java.util.Objects.equals(this.computeKey, other.computeKey)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.displayNameContains == null ? 43 : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreatedGreaterThanOrEqualTo == null ? 43 : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.timeCreatedLessThanOrEqualTo == null ? 43 : this.timeCreatedLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}