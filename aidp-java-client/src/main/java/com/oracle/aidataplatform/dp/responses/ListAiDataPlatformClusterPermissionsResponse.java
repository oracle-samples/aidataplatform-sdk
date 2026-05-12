package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListAiDataPlatformClusterPermissionsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code ClusterPermissionCollection} instance.
     */
    private com.oracle.aidataplatform.dp.model.ClusterPermissionCollection clusterPermissionCollection;

    /**
     * The returned {@code ClusterPermissionCollection} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.ClusterPermissionCollection getClusterPermissionCollection() {
        return clusterPermissionCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "opcNextPage", "clusterPermissionCollection"})
    private ListAiDataPlatformClusterPermissionsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, String opcNextPage, com.oracle.aidataplatform.dp.model.ClusterPermissionCollection clusterPermissionCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.clusterPermissionCollection = clusterPermissionCollection;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<ListAiDataPlatformClusterPermissionsResponse> {
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
         * The returned {@code ClusterPermissionCollection} instance.
         */
        private com.oracle.aidataplatform.dp.model.ClusterPermissionCollection clusterPermissionCollection;

        /**
         * The returned {@code ClusterPermissionCollection} instance.
         * @param clusterPermissionCollection the value to set
         * @return this builder
         */
        public Builder clusterPermissionCollection(com.oracle.aidataplatform.dp.model.ClusterPermissionCollection clusterPermissionCollection) {
            this.clusterPermissionCollection = clusterPermissionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(ListAiDataPlatformClusterPermissionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());opcNextPage(o.getOpcNextPage());
            clusterPermissionCollection(o.getClusterPermissionCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public ListAiDataPlatformClusterPermissionsResponse build() {
            return new ListAiDataPlatformClusterPermissionsResponse(__httpStatusCode__, headers, opcRequestId, opcNextPage, clusterPermissionCollection);
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
        sb.append(",clusterPermissionCollection=").append(String.valueOf(clusterPermissionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAiDataPlatformClusterPermissionsResponse)) {
            return false;
        }

        ListAiDataPlatformClusterPermissionsResponse other = (ListAiDataPlatformClusterPermissionsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
            && java.util.Objects.equals(this.clusterPermissionCollection, other.clusterPermissionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.clusterPermissionCollection == null ? 43 : this.clusterPermissionCollection.hashCode());
        return result;
    }
}