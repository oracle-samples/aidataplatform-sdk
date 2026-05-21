// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SetModelVersionTagResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code SetModelVersionTagResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails setModelVersionTagResponseDetails;

    /**
     * The returned {@code SetModelVersionTagResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails getSetModelVersionTagResponseDetails() {
        return setModelVersionTagResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "setModelVersionTagResponseDetails"})
    private SetModelVersionTagResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails setModelVersionTagResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.setModelVersionTagResponseDetails = setModelVersionTagResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<SetModelVersionTagResponse> {
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
         * The returned {@code SetModelVersionTagResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails setModelVersionTagResponseDetails;

        /**
         * The returned {@code SetModelVersionTagResponseDetails} instance.
         * @param setModelVersionTagResponseDetails the value to set
         * @return this builder
         */
        public Builder setModelVersionTagResponseDetails(com.oracle.aidataplatform.dp.model.SetModelVersionTagResponseDetails setModelVersionTagResponseDetails) {
            this.setModelVersionTagResponseDetails = setModelVersionTagResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(SetModelVersionTagResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            setModelVersionTagResponseDetails(o.getSetModelVersionTagResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public SetModelVersionTagResponse build() {
            return new SetModelVersionTagResponse(__httpStatusCode__, headers, etag, opcRequestId, setModelVersionTagResponseDetails);
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
        sb.append(",setModelVersionTagResponseDetails=").append(String.valueOf(setModelVersionTagResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetModelVersionTagResponse)) {
            return false;
        }

        SetModelVersionTagResponse other = (SetModelVersionTagResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.setModelVersionTagResponseDetails, other.setModelVersionTagResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.setModelVersionTagResponseDetails == null ? 43 : this.setModelVersionTagResponseDetails.hashCode());
        return result;
    }
}