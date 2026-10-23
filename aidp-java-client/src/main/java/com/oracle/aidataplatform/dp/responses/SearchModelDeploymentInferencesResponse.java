// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SearchModelDeploymentInferencesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code InferenceInvocationSearchResult} instance.
     */
    private com.oracle.aidataplatform.dp.model.InferenceInvocationSearchResult inferenceInvocationSearchResult;

    /**
     * The returned {@code InferenceInvocationSearchResult} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.InferenceInvocationSearchResult getInferenceInvocationSearchResult() {
        return inferenceInvocationSearchResult;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "inferenceInvocationSearchResult"})
    private SearchModelDeploymentInferencesResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.InferenceInvocationSearchResult inferenceInvocationSearchResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.inferenceInvocationSearchResult = inferenceInvocationSearchResult;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<SearchModelDeploymentInferencesResponse> {
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
         * The returned {@code InferenceInvocationSearchResult} instance.
         */
        private com.oracle.aidataplatform.dp.model.InferenceInvocationSearchResult inferenceInvocationSearchResult;

        /**
         * The returned {@code InferenceInvocationSearchResult} instance.
         * @param inferenceInvocationSearchResult the value to set
         * @return this builder
         */
        public Builder inferenceInvocationSearchResult(com.oracle.aidataplatform.dp.model.InferenceInvocationSearchResult inferenceInvocationSearchResult) {
            this.inferenceInvocationSearchResult = inferenceInvocationSearchResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(SearchModelDeploymentInferencesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            inferenceInvocationSearchResult(o.getInferenceInvocationSearchResult());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public SearchModelDeploymentInferencesResponse build() {
            return new SearchModelDeploymentInferencesResponse(__httpStatusCode__, headers, opcRequestId, inferenceInvocationSearchResult);
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
        sb.append(",inferenceInvocationSearchResult=").append(String.valueOf(inferenceInvocationSearchResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchModelDeploymentInferencesResponse)) {
            return false;
        }

        SearchModelDeploymentInferencesResponse other = (SearchModelDeploymentInferencesResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.inferenceInvocationSearchResult, other.inferenceInvocationSearchResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.inferenceInvocationSearchResult == null ? 43 : this.inferenceInvocationSearchResult.hashCode());
        return result;
    }
}