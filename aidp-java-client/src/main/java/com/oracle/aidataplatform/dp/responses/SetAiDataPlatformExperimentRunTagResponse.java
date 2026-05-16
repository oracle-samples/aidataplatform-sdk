// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SetAiDataPlatformExperimentRunTagResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code SetExperimentRunTagResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails setExperimentRunTagResponseDetails;

    /**
     * The returned {@code SetExperimentRunTagResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails getSetExperimentRunTagResponseDetails() {
        return setExperimentRunTagResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "setExperimentRunTagResponseDetails"})
    private SetAiDataPlatformExperimentRunTagResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails setExperimentRunTagResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.setExperimentRunTagResponseDetails = setExperimentRunTagResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<SetAiDataPlatformExperimentRunTagResponse> {
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
         * The returned {@code SetExperimentRunTagResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails setExperimentRunTagResponseDetails;

        /**
         * The returned {@code SetExperimentRunTagResponseDetails} instance.
         * @param setExperimentRunTagResponseDetails the value to set
         * @return this builder
         */
        public Builder setExperimentRunTagResponseDetails(com.oracle.aidataplatform.dp.model.SetExperimentRunTagResponseDetails setExperimentRunTagResponseDetails) {
            this.setExperimentRunTagResponseDetails = setExperimentRunTagResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(SetAiDataPlatformExperimentRunTagResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            setExperimentRunTagResponseDetails(o.getSetExperimentRunTagResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public SetAiDataPlatformExperimentRunTagResponse build() {
            return new SetAiDataPlatformExperimentRunTagResponse(__httpStatusCode__, headers, etag, opcRequestId, setExperimentRunTagResponseDetails);
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
        sb.append(",setExperimentRunTagResponseDetails=").append(String.valueOf(setExperimentRunTagResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetAiDataPlatformExperimentRunTagResponse)) {
            return false;
        }

        SetAiDataPlatformExperimentRunTagResponse other = (SetAiDataPlatformExperimentRunTagResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.setExperimentRunTagResponseDetails, other.setExperimentRunTagResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.setExperimentRunTagResponseDetails == null ? 43 : this.setExperimentRunTagResponseDetails.hashCode());
        return result;
    }
}