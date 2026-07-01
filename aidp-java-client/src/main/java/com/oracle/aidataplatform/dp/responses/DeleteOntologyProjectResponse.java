// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class DeleteOntologyProjectResponse extends com.oracle.bmc.responses.BmcResponse {
    

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers"})
    private DeleteOntologyProjectResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers) {
        super(__httpStatusCode__, headers);

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<DeleteOntologyProjectResponse> {
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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(DeleteOntologyProjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            
            
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public DeleteOntologyProjectResponse build() {
            return new DeleteOntologyProjectResponse(__httpStatusCode__, headers);
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteOntologyProjectResponse)) {
            return false;
        }

        DeleteOntologyProjectResponse other = (DeleteOntologyProjectResponse) o;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}