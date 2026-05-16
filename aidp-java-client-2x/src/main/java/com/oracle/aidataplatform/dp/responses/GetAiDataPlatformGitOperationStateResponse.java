// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformGitOperationStateResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned GitOperationState instance.
     */
    private com.oracle.aidataplatform.dp.model.GitOperationState gitOperationState;

    /**
     * The returned GitOperationState instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.GitOperationState getGitOperationState() {
        return gitOperationState;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "gitOperationState"})
    private GetAiDataPlatformGitOperationStateResponse(int __httpStatusCode__, javax.ws.rs.core.MultivaluedMap<String, String> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.GitOperationState gitOperationState) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.gitOperationState = gitOperationState;

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
         * The returned GitOperationState instance.
         */
        private com.oracle.aidataplatform.dp.model.GitOperationState gitOperationState;

        /**
         * The returned GitOperationState instance.
         * @param gitOperationState the value to set
         * @return this builder
         */
        public Builder gitOperationState(com.oracle.aidataplatform.dp.model.GitOperationState gitOperationState) {
            this.gitOperationState = gitOperationState;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAiDataPlatformGitOperationStateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            gitOperationState(o.getGitOperationState());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetAiDataPlatformGitOperationStateResponse build() {
            return new GetAiDataPlatformGitOperationStateResponse(__httpStatusCode__, headers, opcRequestId, gitOperationState);
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
        sb.append(",gitOperationState=").append(String.valueOf(gitOperationState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAiDataPlatformGitOperationStateResponse)) {
            return false;
        }

        GetAiDataPlatformGitOperationStateResponse other = (GetAiDataPlatformGitOperationStateResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.gitOperationState, other.gitOperationState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.gitOperationState == null ? 43 : this.gitOperationState.hashCode());
        return result;
    }
}