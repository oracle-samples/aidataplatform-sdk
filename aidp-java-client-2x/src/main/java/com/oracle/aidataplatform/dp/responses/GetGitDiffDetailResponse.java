// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetGitDiffDetailResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned GitDiffDetail instance.
     */
    private com.oracle.aidataplatform.dp.model.GitDiffDetail gitDiffDetail;

    /**
     * The returned GitDiffDetail instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.GitDiffDetail getGitDiffDetail() {
        return gitDiffDetail;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "gitDiffDetail"})
    private GetGitDiffDetailResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.GitDiffDetail gitDiffDetail) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.gitDiffDetail = gitDiffDetail;

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
         * The returned GitDiffDetail instance.
         */
        private com.oracle.aidataplatform.dp.model.GitDiffDetail gitDiffDetail;

        /**
         * The returned GitDiffDetail instance.
         * @param gitDiffDetail the value to set
         * @return this builder
         */
        public Builder gitDiffDetail(com.oracle.aidataplatform.dp.model.GitDiffDetail gitDiffDetail) {
            this.gitDiffDetail = gitDiffDetail;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetGitDiffDetailResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            gitDiffDetail(o.getGitDiffDetail());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetGitDiffDetailResponse build() {
            return new GetGitDiffDetailResponse(__httpStatusCode__, headers, opcRequestId, gitDiffDetail);
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
        sb.append(",gitDiffDetail=").append(String.valueOf(gitDiffDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetGitDiffDetailResponse)) {
            return false;
        }

        GetGitDiffDetailResponse other = (GetGitDiffDetailResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.gitDiffDetail, other.gitDiffDetail);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.gitDiffDetail == null ? 43 : this.gitDiffDetail.hashCode());
        return result;
    }
}