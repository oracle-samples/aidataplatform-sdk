// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CopyAiDataPlatformWorkspaceObjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
     */
    private String opcWorkRequestId;

    /**
     * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }
    
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
     * The returned {@code WorkspaceObjectDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails workspaceObjectDetails;

    /**
     * The returned {@code WorkspaceObjectDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails getWorkspaceObjectDetails() {
        return workspaceObjectDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcWorkRequestId", "opcRequestId", "etag", "workspaceObjectDetails"})
    private CopyAiDataPlatformWorkspaceObjectResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcWorkRequestId, String opcRequestId, String etag, com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails workspaceObjectDetails) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.workspaceObjectDetails = workspaceObjectDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<CopyAiDataPlatformWorkspaceObjectResponse> {
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
         * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
         */
        private String opcWorkRequestId;

        /**
         * The OCID of the asynchronous work request.
* Use GetWorkRequest with this ID to track the status of the request.
* 
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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
         * The returned {@code WorkspaceObjectDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails workspaceObjectDetails;

        /**
         * The returned {@code WorkspaceObjectDetails} instance.
         * @param workspaceObjectDetails the value to set
         * @return this builder
         */
        public Builder workspaceObjectDetails(com.oracle.aidataplatform.dp.model.WorkspaceObjectDetails workspaceObjectDetails) {
            this.workspaceObjectDetails = workspaceObjectDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(CopyAiDataPlatformWorkspaceObjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());opcRequestId(o.getOpcRequestId());etag(o.getEtag());
            workspaceObjectDetails(o.getWorkspaceObjectDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public CopyAiDataPlatformWorkspaceObjectResponse build() {
            return new CopyAiDataPlatformWorkspaceObjectResponse(__httpStatusCode__, headers, opcWorkRequestId, opcRequestId, etag, workspaceObjectDetails);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",workspaceObjectDetails=").append(String.valueOf(workspaceObjectDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyAiDataPlatformWorkspaceObjectResponse)) {
            return false;
        }

        CopyAiDataPlatformWorkspaceObjectResponse other = (CopyAiDataPlatformWorkspaceObjectResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.workspaceObjectDetails, other.workspaceObjectDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.workspaceObjectDetails == null ? 43 : this.workspaceObjectDetails.hashCode());
        return result;
    }
}