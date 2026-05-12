package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SetAiDataPlatformExperimentTagResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned SetExperimentTagResponseDetails instance.
     */
    private com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails setExperimentTagResponseDetails;

    /**
     * The returned SetExperimentTagResponseDetails instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails getSetExperimentTagResponseDetails() {
        return setExperimentTagResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "setExperimentTagResponseDetails"})
    private SetAiDataPlatformExperimentTagResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails setExperimentTagResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.setExperimentTagResponseDetails = setExperimentTagResponseDetails;

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
         * The returned SetExperimentTagResponseDetails instance.
         */
        private com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails setExperimentTagResponseDetails;

        /**
         * The returned SetExperimentTagResponseDetails instance.
         * @param setExperimentTagResponseDetails the value to set
         * @return this builder
         */
        public Builder setExperimentTagResponseDetails(com.oracle.aidataplatform.dp.model.SetExperimentTagResponseDetails setExperimentTagResponseDetails) {
            this.setExperimentTagResponseDetails = setExperimentTagResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SetAiDataPlatformExperimentTagResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            setExperimentTagResponseDetails(o.getSetExperimentTagResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public SetAiDataPlatformExperimentTagResponse build() {
            return new SetAiDataPlatformExperimentTagResponse(__httpStatusCode__, headers, etag, opcRequestId, setExperimentTagResponseDetails);
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
        sb.append(",setExperimentTagResponseDetails=").append(String.valueOf(setExperimentTagResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetAiDataPlatformExperimentTagResponse)) {
            return false;
        }

        SetAiDataPlatformExperimentTagResponse other = (SetAiDataPlatformExperimentTagResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.setExperimentTagResponseDetails, other.setExperimentTagResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.setExperimentTagResponseDetails == null ? 43 : this.setExperimentTagResponseDetails.hashCode());
        return result;
    }
}