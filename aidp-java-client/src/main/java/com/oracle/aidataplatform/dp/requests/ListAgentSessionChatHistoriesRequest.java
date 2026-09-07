// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAgentSessionChatHistoriesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The UUID of the agent.
     */
    private String agentKey;

    

        /**
     * The UUID of the agent.
     */
    public String getAgentKey() {
        return agentKey;
    }
        /**
     * The UUID of the agent session.
     */
    private String sessionId;

    

        /**
     * The UUID of the agent session.
     */
    public String getSessionId() {
        return sessionId;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ListAgentSessionChatHistoriesRequest, java.lang.Void> {
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
     * The UUID of the agent.
     */
        private String agentKey = null;

        /**
         * The UUID of the agent.
         * @param agentKey the value to set
         * @return this builder instance
         */
        public Builder agentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }

            /**
     * The UUID of the agent session.
     */
        private String sessionId = null;

        /**
         * The UUID of the agent session.
         * @param sessionId the value to set
         * @return this builder instance
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
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
        public Builder copy(ListAgentSessionChatHistoriesRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());agentKey(o.getAgentKey());sessionId(o.getSessionId());limit(o.getLimit());page(o.getPage());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAgentSessionChatHistoriesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAgentSessionChatHistoriesRequest
         */
        public ListAgentSessionChatHistoriesRequest build() {
            ListAgentSessionChatHistoriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAgentSessionChatHistoriesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAgentSessionChatHistoriesRequest
         */
        public ListAgentSessionChatHistoriesRequest buildWithoutInvocationCallback() {
            ListAgentSessionChatHistoriesRequest request = new ListAgentSessionChatHistoriesRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.agentKey = agentKey;
            request.sessionId = sessionId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAgentSessionChatHistoriesRequest(aiDataPlatformId, workspaceKey, agentKey, sessionId, limit, page, opcRequestId);
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
            .sessionId(sessionId)
            .limit(limit)
            .page(page)
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
        sb.append(",sessionId=").append(String.valueOf(this.sessionId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAgentSessionChatHistoriesRequest)) {
            return false;
        }

        ListAgentSessionChatHistoriesRequest other = (ListAgentSessionChatHistoriesRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.agentKey, other.agentKey)
            && java.util.Objects.equals(this.sessionId, other.sessionId)
            && java.util.Objects.equals(this.limit, other.limit)
            && java.util.Objects.equals(this.page, other.page)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}