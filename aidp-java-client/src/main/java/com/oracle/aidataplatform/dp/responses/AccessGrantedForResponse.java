// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class AccessGrantedForResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code AccessGrantedForResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.AccessGrantedForResponseDetails accessGrantedForResponseDetails;

    /**
     * The returned {@code AccessGrantedForResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.AccessGrantedForResponseDetails getAccessGrantedForResponseDetails() {
        return accessGrantedForResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "accessGrantedForResponseDetails"})
    private AccessGrantedForResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.AccessGrantedForResponseDetails accessGrantedForResponseDetails) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.accessGrantedForResponseDetails = accessGrantedForResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<AccessGrantedForResponse> {
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
         * The returned {@code AccessGrantedForResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.AccessGrantedForResponseDetails accessGrantedForResponseDetails;

        /**
         * The returned {@code AccessGrantedForResponseDetails} instance.
         * @param accessGrantedForResponseDetails the value to set
         * @return this builder
         */
        public Builder accessGrantedForResponseDetails(com.oracle.aidataplatform.dp.model.AccessGrantedForResponseDetails accessGrantedForResponseDetails) {
            this.accessGrantedForResponseDetails = accessGrantedForResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(AccessGrantedForResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            accessGrantedForResponseDetails(o.getAccessGrantedForResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public AccessGrantedForResponse build() {
            return new AccessGrantedForResponse(__httpStatusCode__, headers, opcRequestId, accessGrantedForResponseDetails);
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
        sb.append(",accessGrantedForResponseDetails=").append(String.valueOf(accessGrantedForResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForResponse)) {
            return false;
        }

        AccessGrantedForResponse other = (AccessGrantedForResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.accessGrantedForResponseDetails, other.accessGrantedForResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.accessGrantedForResponseDetails == null ? 43 : this.accessGrantedForResponseDetails.hashCode());
        return result;
    }
}