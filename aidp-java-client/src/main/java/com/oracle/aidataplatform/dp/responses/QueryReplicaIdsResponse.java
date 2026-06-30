// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class QueryReplicaIdsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    
    /**
     * The returned {@code QueryReplicaIdsResult} instance.
     */
    private com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult queryReplicaIdsResult;

    /**
     * The returned {@code QueryReplicaIdsResult} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult getQueryReplicaIdsResult() {
        return queryReplicaIdsResult;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "queryReplicaIdsResult"})
    private QueryReplicaIdsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult queryReplicaIdsResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.queryReplicaIdsResult = queryReplicaIdsResult;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<QueryReplicaIdsResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned {@code QueryReplicaIdsResult} instance.
         */
        private com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult queryReplicaIdsResult;

        /**
         * The returned {@code QueryReplicaIdsResult} instance.
         * @param queryReplicaIdsResult the value to set
         * @return this builder
         */
        public Builder queryReplicaIdsResult(com.oracle.aidataplatform.dp.model.QueryReplicaIdsResult queryReplicaIdsResult) {
            this.queryReplicaIdsResult = queryReplicaIdsResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(QueryReplicaIdsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            queryReplicaIdsResult(o.getQueryReplicaIdsResult());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public QueryReplicaIdsResponse build() {
            return new QueryReplicaIdsResponse(__httpStatusCode__, headers, opcRequestId, queryReplicaIdsResult);
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
        sb.append(",queryReplicaIdsResult=").append(String.valueOf(queryReplicaIdsResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryReplicaIdsResponse)) {
            return false;
        }

        QueryReplicaIdsResponse other = (QueryReplicaIdsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.queryReplicaIdsResult, other.queryReplicaIdsResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.queryReplicaIdsResult == null ? 43 : this.queryReplicaIdsResult.hashCode());
        return result;
    }
}