// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformWorkspaceObjectsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned WorkspaceObjectCollection instance.
     */
    private com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection workspaceObjectCollection;

    /**
     * The returned WorkspaceObjectCollection instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection getWorkspaceObjectCollection() {
        return workspaceObjectCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "opcNextPage", "workspaceObjectCollection"})
    private ListAiDataPlatformWorkspaceObjectsResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, String opcNextPage, com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection workspaceObjectCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.workspaceObjectCollection = workspaceObjectCollection;

    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
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
         * The returned WorkspaceObjectCollection instance.
         */
        private com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection workspaceObjectCollection;

        /**
         * The returned WorkspaceObjectCollection instance.
         * @param workspaceObjectCollection the value to set
         * @return this builder
         */
        public Builder workspaceObjectCollection(com.oracle.aidataplatform.dp.model.WorkspaceObjectCollection workspaceObjectCollection) {
            this.workspaceObjectCollection = workspaceObjectCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAiDataPlatformWorkspaceObjectsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());opcNextPage(o.getOpcNextPage());
            workspaceObjectCollection(o.getWorkspaceObjectCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListAiDataPlatformWorkspaceObjectsResponse build() {
            return new ListAiDataPlatformWorkspaceObjectsResponse(__httpStatusCode__, headers, opcRequestId, opcNextPage, workspaceObjectCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",workspaceObjectCollection=").append(String.valueOf(workspaceObjectCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAiDataPlatformWorkspaceObjectsResponse)) {
            return false;
        }

        ListAiDataPlatformWorkspaceObjectsResponse other = (ListAiDataPlatformWorkspaceObjectsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
            && java.util.Objects.equals(this.workspaceObjectCollection, other.workspaceObjectCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.workspaceObjectCollection == null ? 43 : this.workspaceObjectCollection.hashCode());
        return result;
    }
}