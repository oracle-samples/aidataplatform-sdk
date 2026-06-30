// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAgentSessionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * For list pagination. When this header appears in the response, previous pages of results remain.
     */
    private String opcPrevPage;

    /**
     * For list pagination. When this header appears in the response, previous pages of results remain.
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }
    
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }
    
    /**
     * The returned {@code AgentSessionCollection} instance.
     */
    private com.oracle.aidataplatform.dp.model.AgentSessionCollection agentSessionCollection;

    /**
     * The returned {@code AgentSessionCollection} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.AgentSessionCollection getAgentSessionCollection() {
        return agentSessionCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "opcPrevPage", "opcNextPage", "agentSessionCollection"})
    private ListAgentSessionsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, String opcPrevPage, String opcNextPage, com.oracle.aidataplatform.dp.model.AgentSessionCollection agentSessionCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.agentSessionCollection = agentSessionCollection;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<ListAgentSessionsResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned ID for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, previous pages of results remain.
         */
        private String opcPrevPage;

        /**
         * For list pagination. When this header appears in the response, previous pages of results remain.
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response, then a partial list might have been returned. Include this value as the {@code page} parameter for the subsequent GET request to get the next batch of items.
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned {@code AgentSessionCollection} instance.
         */
        private com.oracle.aidataplatform.dp.model.AgentSessionCollection agentSessionCollection;

        /**
         * The returned {@code AgentSessionCollection} instance.
         * @param agentSessionCollection the value to set
         * @return this builder
         */
        public Builder agentSessionCollection(com.oracle.aidataplatform.dp.model.AgentSessionCollection agentSessionCollection) {
            this.agentSessionCollection = agentSessionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(ListAgentSessionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());opcPrevPage(o.getOpcPrevPage());opcNextPage(o.getOpcNextPage());
            agentSessionCollection(o.getAgentSessionCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public ListAgentSessionsResponse build() {
            return new ListAgentSessionsResponse(__httpStatusCode__, headers, opcRequestId, opcPrevPage, opcNextPage, agentSessionCollection);
        }
    }

    /**
     * Return a new builder for this response object.
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",agentSessionCollection=").append(String.valueOf(agentSessionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAgentSessionsResponse)) {
            return false;
        }

        ListAgentSessionsResponse other = (ListAgentSessionsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
            && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
            && java.util.Objects.equals(this.agentSessionCollection, other.agentSessionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.agentSessionCollection == null ? 43 : this.agentSessionCollection.hashCode());
        return result;
    }
}