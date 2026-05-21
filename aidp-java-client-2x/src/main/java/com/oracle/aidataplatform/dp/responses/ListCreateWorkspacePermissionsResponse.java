// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListCreateWorkspacePermissionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }
    
    /**
     * The returned CreateWorkspacePermissionCollection instance.
     */
    private com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection createWorkspacePermissionCollection;

    /**
     * The returned CreateWorkspacePermissionCollection instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection getCreateWorkspacePermissionCollection() {
        return createWorkspacePermissionCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "opcNextPage", "createWorkspacePermissionCollection"})
    private ListCreateWorkspacePermissionsResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, String opcNextPage, com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection createWorkspacePermissionCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.createWorkspacePermissionCollection = createWorkspacePermissionCollection;

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
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of results remain. For
* important details about how pagination works, see [List Pagination]({{DOC_SERVER_URL}}/iaas/Content/API/Concepts/usingapi.htm#nine).
* 
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned CreateWorkspacePermissionCollection instance.
         */
        private com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection createWorkspacePermissionCollection;

        /**
         * The returned CreateWorkspacePermissionCollection instance.
         * @param createWorkspacePermissionCollection the value to set
         * @return this builder
         */
        public Builder createWorkspacePermissionCollection(com.oracle.aidataplatform.dp.model.CreateWorkspacePermissionCollection createWorkspacePermissionCollection) {
            this.createWorkspacePermissionCollection = createWorkspacePermissionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListCreateWorkspacePermissionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());opcNextPage(o.getOpcNextPage());
            createWorkspacePermissionCollection(o.getCreateWorkspacePermissionCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListCreateWorkspacePermissionsResponse build() {
            return new ListCreateWorkspacePermissionsResponse(__httpStatusCode__, headers, opcRequestId, opcNextPage, createWorkspacePermissionCollection);
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
        sb.append(",createWorkspacePermissionCollection=").append(String.valueOf(createWorkspacePermissionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCreateWorkspacePermissionsResponse)) {
            return false;
        }

        ListCreateWorkspacePermissionsResponse other = (ListCreateWorkspacePermissionsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
            && java.util.Objects.equals(this.createWorkspacePermissionCollection, other.createWorkspacePermissionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.createWorkspacePermissionCollection == null ? 43 : this.createWorkspacePermissionCollection.hashCode());
        return result;
    }
}