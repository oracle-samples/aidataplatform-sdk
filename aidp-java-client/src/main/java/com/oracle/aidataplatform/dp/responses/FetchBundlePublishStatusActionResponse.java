// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class FetchBundlePublishStatusActionResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code BundlePublishStatus} instance.
     */
    private com.oracle.aidataplatform.dp.model.BundlePublishStatus bundlePublishStatus;

    /**
     * The returned {@code BundlePublishStatus} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.BundlePublishStatus getBundlePublishStatus() {
        return bundlePublishStatus;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "bundlePublishStatus"})
    private FetchBundlePublishStatusActionResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.BundlePublishStatus bundlePublishStatus) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.bundlePublishStatus = bundlePublishStatus;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<FetchBundlePublishStatusActionResponse> {
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
         * The returned {@code BundlePublishStatus} instance.
         */
        private com.oracle.aidataplatform.dp.model.BundlePublishStatus bundlePublishStatus;

        /**
         * The returned {@code BundlePublishStatus} instance.
         * @param bundlePublishStatus the value to set
         * @return this builder
         */
        public Builder bundlePublishStatus(com.oracle.aidataplatform.dp.model.BundlePublishStatus bundlePublishStatus) {
            this.bundlePublishStatus = bundlePublishStatus;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(FetchBundlePublishStatusActionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            bundlePublishStatus(o.getBundlePublishStatus());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public FetchBundlePublishStatusActionResponse build() {
            return new FetchBundlePublishStatusActionResponse(__httpStatusCode__, headers, opcRequestId, bundlePublishStatus);
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
        sb.append(",bundlePublishStatus=").append(String.valueOf(bundlePublishStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchBundlePublishStatusActionResponse)) {
            return false;
        }

        FetchBundlePublishStatusActionResponse other = (FetchBundlePublishStatusActionResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.bundlePublishStatus, other.bundlePublishStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.bundlePublishStatus == null ? 43 : this.bundlePublishStatus.hashCode());
        return result;
    }
}