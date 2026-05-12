package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GenerateAiDataPlatformTempFileUploadTargetResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned GenerateTempFileUploadTargetResponseDetails instance.
     */
    private com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails generateTempFileUploadTargetResponseDetails;

    /**
     * The returned GenerateTempFileUploadTargetResponseDetails instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails getGenerateTempFileUploadTargetResponseDetails() {
        return generateTempFileUploadTargetResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "generateTempFileUploadTargetResponseDetails"})
    private GenerateAiDataPlatformTempFileUploadTargetResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails generateTempFileUploadTargetResponseDetails) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.generateTempFileUploadTargetResponseDetails = generateTempFileUploadTargetResponseDetails;

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
         * The returned GenerateTempFileUploadTargetResponseDetails instance.
         */
        private com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails generateTempFileUploadTargetResponseDetails;

        /**
         * The returned GenerateTempFileUploadTargetResponseDetails instance.
         * @param generateTempFileUploadTargetResponseDetails the value to set
         * @return this builder
         */
        public Builder generateTempFileUploadTargetResponseDetails(com.oracle.aidataplatform.dp.model.GenerateTempFileUploadTargetResponseDetails generateTempFileUploadTargetResponseDetails) {
            this.generateTempFileUploadTargetResponseDetails = generateTempFileUploadTargetResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GenerateAiDataPlatformTempFileUploadTargetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            generateTempFileUploadTargetResponseDetails(o.getGenerateTempFileUploadTargetResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GenerateAiDataPlatformTempFileUploadTargetResponse build() {
            return new GenerateAiDataPlatformTempFileUploadTargetResponse(__httpStatusCode__, headers, opcRequestId, generateTempFileUploadTargetResponseDetails);
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
        sb.append(",generateTempFileUploadTargetResponseDetails=").append(String.valueOf(generateTempFileUploadTargetResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateAiDataPlatformTempFileUploadTargetResponse)) {
            return false;
        }

        GenerateAiDataPlatformTempFileUploadTargetResponse other = (GenerateAiDataPlatformTempFileUploadTargetResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.generateTempFileUploadTargetResponseDetails, other.generateTempFileUploadTargetResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.generateTempFileUploadTargetResponseDetails == null ? 43 : this.generateTempFileUploadTargetResponseDetails.hashCode());
        return result;
    }
}