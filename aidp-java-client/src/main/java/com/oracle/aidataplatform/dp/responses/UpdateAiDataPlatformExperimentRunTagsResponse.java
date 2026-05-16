// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateAiDataPlatformExperimentRunTagsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code UpdateExperimentRunTagsResponseDetails} instance.
     */
    private com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails updateExperimentRunTagsResponseDetails;

    /**
     * The returned {@code UpdateExperimentRunTagsResponseDetails} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails getUpdateExperimentRunTagsResponseDetails() {
        return updateExperimentRunTagsResponseDetails;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "etag", "opcRequestId", "updateExperimentRunTagsResponseDetails"})
    private UpdateAiDataPlatformExperimentRunTagsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String etag, String opcRequestId, com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails updateExperimentRunTagsResponseDetails) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.updateExperimentRunTagsResponseDetails = updateExperimentRunTagsResponseDetails;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<UpdateAiDataPlatformExperimentRunTagsResponse> {
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
         * The returned {@code UpdateExperimentRunTagsResponseDetails} instance.
         */
        private com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails updateExperimentRunTagsResponseDetails;

        /**
         * The returned {@code UpdateExperimentRunTagsResponseDetails} instance.
         * @param updateExperimentRunTagsResponseDetails the value to set
         * @return this builder
         */
        public Builder updateExperimentRunTagsResponseDetails(com.oracle.aidataplatform.dp.model.UpdateExperimentRunTagsResponseDetails updateExperimentRunTagsResponseDetails) {
            this.updateExperimentRunTagsResponseDetails = updateExperimentRunTagsResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateAiDataPlatformExperimentRunTagsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());opcRequestId(o.getOpcRequestId());
            updateExperimentRunTagsResponseDetails(o.getUpdateExperimentRunTagsResponseDetails());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public UpdateAiDataPlatformExperimentRunTagsResponse build() {
            return new UpdateAiDataPlatformExperimentRunTagsResponse(__httpStatusCode__, headers, etag, opcRequestId, updateExperimentRunTagsResponseDetails);
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
        sb.append(",updateExperimentRunTagsResponseDetails=").append(String.valueOf(updateExperimentRunTagsResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAiDataPlatformExperimentRunTagsResponse)) {
            return false;
        }

        UpdateAiDataPlatformExperimentRunTagsResponse other = (UpdateAiDataPlatformExperimentRunTagsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.etag, other.etag)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.updateExperimentRunTagsResponseDetails, other.updateExperimentRunTagsResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.updateExperimentRunTagsResponseDetails == null ? 43 : this.updateExperimentRunTagsResponseDetails.hashCode());
        return result;
    }
}