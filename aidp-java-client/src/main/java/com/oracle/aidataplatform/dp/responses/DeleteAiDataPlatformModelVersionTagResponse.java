// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class DeleteAiDataPlatformModelVersionTagResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code DeleteModelVersionTagResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails deleteModelVersionTagResponseDetails;

    /**
     * The returned {@code DeleteModelVersionTagResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails getDeleteModelVersionTagResponseDetails() {
        return deleteModelVersionTagResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "deleteModelVersionTagResponseDetails"})
    private DeleteAiDataPlatformModelVersionTagResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails deleteModelVersionTagResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.deleteModelVersionTagResponseDetails = deleteModelVersionTagResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<DeleteAiDataPlatformModelVersionTagResponse> {
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
         * The returned {@code DeleteModelVersionTagResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails deleteModelVersionTagResponseDetails;

        /**
         * The returned {@code DeleteModelVersionTagResponseDetails} instance.
         * @param deleteModelVersionTagResponseDetails the value to set
         * @return this builder
         */
        public Builder deleteModelVersionTagResponseDetails(com.oracle.aidataplatform.dp.model.DeleteModelVersionTagResponseDetails deleteModelVersionTagResponseDetails) {
            this.deleteModelVersionTagResponseDetails = deleteModelVersionTagResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(DeleteAiDataPlatformModelVersionTagResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            deleteModelVersionTagResponseDetails(o.getDeleteModelVersionTagResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public DeleteAiDataPlatformModelVersionTagResponse build() {
            return new DeleteAiDataPlatformModelVersionTagResponse(__httpStatusCode__, headers, etag, opcRequestId, deleteModelVersionTagResponseDetails);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",deleteModelVersionTagResponseDetails=").append(String.valueOf(deleteModelVersionTagResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteAiDataPlatformModelVersionTagResponse)) {
            return false;
        }

        DeleteAiDataPlatformModelVersionTagResponse other = (DeleteAiDataPlatformModelVersionTagResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.deleteModelVersionTagResponseDetails, other.deleteModelVersionTagResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.deleteModelVersionTagResponseDetails == null ? 43 : this.deleteModelVersionTagResponseDetails.hashCode());
        return result;
    }
}