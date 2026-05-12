package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateAiDataPlatformWorkspaceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
     */
    private String aidpAsyncOperationKey;

    /**
     * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
     * @return the value
     */
    public String getAidpAsyncOperationKey() {
        return aidpAsyncOperationKey;
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
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * For optimistic concurrency control. See {@code if-match}.
* 
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
* 
     * @return the value
     */
    public String getEtag() {
        return etag;
    }
    
    /**
     * The returned Workspace instance.
     */
    private com.oracle.aidataplatform.dp.model.Workspace workspace;

    /**
     * The returned Workspace instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.Workspace getWorkspace() {
        return workspace;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "aidpAsyncOperationKey", "opcRequestId", "etag", "workspace"})
    private UpdateAiDataPlatformWorkspaceResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String aidpAsyncOperationKey, String opcRequestId, String etag, com.oracle.aidataplatform.dp.model.Workspace workspace) {
        super(__httpStatusCode__, headers);
        this.aidpAsyncOperationKey = aidpAsyncOperationKey;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.workspace = workspace;

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
         * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
         */
        private String aidpAsyncOperationKey;

        /**
         * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
         * @param aidpAsyncOperationKey the value to set
         * @return this builder
         */
        public Builder aidpAsyncOperationKey(String aidpAsyncOperationKey) {
            this.aidpAsyncOperationKey = aidpAsyncOperationKey;
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
         * For optimistic concurrency control. See {@code if-match}.
* 
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
* 
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned Workspace instance.
         */
        private com.oracle.aidataplatform.dp.model.Workspace workspace;

        /**
         * The returned Workspace instance.
         * @param workspace the value to set
         * @return this builder
         */
        public Builder workspace(com.oracle.aidataplatform.dp.model.Workspace workspace) {
            this.workspace = workspace;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAiDataPlatformWorkspaceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            aidpAsyncOperationKey(o.getAidpAsyncOperationKey());opcRequestId(o.getOpcRequestId());etag(o.getEtag());
            workspace(o.getWorkspace());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateAiDataPlatformWorkspaceResponse build() {
            return new UpdateAiDataPlatformWorkspaceResponse(__httpStatusCode__, headers, aidpAsyncOperationKey, opcRequestId, etag, workspace);
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
        sb.append(",aidpAsyncOperationKey=").append(String.valueOf(aidpAsyncOperationKey));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",workspace=").append(String.valueOf(workspace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAiDataPlatformWorkspaceResponse)) {
            return false;
        }

        UpdateAiDataPlatformWorkspaceResponse other = (UpdateAiDataPlatformWorkspaceResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aidpAsyncOperationKey, other.aidpAsyncOperationKey)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.workspace, other.workspace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aidpAsyncOperationKey == null ? 43 : this.aidpAsyncOperationKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.workspace == null ? 43 : this.workspace.hashCode());
        return result;
    }
}