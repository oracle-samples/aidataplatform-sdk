package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CreateAiDataPlatformWorkspaceModelVersionResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code CreateModelVersionResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails createModelVersionResponseDetails;

    /**
     * The returned {@code CreateModelVersionResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails getCreateModelVersionResponseDetails() {
        return createModelVersionResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "createModelVersionResponseDetails"})
    private CreateAiDataPlatformWorkspaceModelVersionResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails createModelVersionResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.createModelVersionResponseDetails = createModelVersionResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<CreateAiDataPlatformWorkspaceModelVersionResponse> {
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
         * The returned {@code CreateModelVersionResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails createModelVersionResponseDetails;

        /**
         * The returned {@code CreateModelVersionResponseDetails} instance.
         * @param createModelVersionResponseDetails the value to set
         * @return this builder
         */
        public Builder createModelVersionResponseDetails(com.oracle.aidataplatform.dp.model.CreateModelVersionResponseDetails createModelVersionResponseDetails) {
            this.createModelVersionResponseDetails = createModelVersionResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateAiDataPlatformWorkspaceModelVersionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            createModelVersionResponseDetails(o.getCreateModelVersionResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public CreateAiDataPlatformWorkspaceModelVersionResponse build() {
            return new CreateAiDataPlatformWorkspaceModelVersionResponse(__httpStatusCode__, headers, etag, opcRequestId, createModelVersionResponseDetails);
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
        sb.append(",createModelVersionResponseDetails=").append(String.valueOf(createModelVersionResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAiDataPlatformWorkspaceModelVersionResponse)) {
            return false;
        }

        CreateAiDataPlatformWorkspaceModelVersionResponse other = (CreateAiDataPlatformWorkspaceModelVersionResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.createModelVersionResponseDetails, other.createModelVersionResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.createModelVersionResponseDetails == null ? 43 : this.createModelVersionResponseDetails.hashCode());
        return result;
    }
}