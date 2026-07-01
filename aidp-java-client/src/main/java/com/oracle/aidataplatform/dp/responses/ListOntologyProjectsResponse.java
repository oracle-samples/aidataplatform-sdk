// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ListOntologyProjectsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The returned {@code OntologyProjectCollection} instance.
     */
    private com.oracle.aidataplatform.dp.model.OntologyProjectCollection ontologyProjectCollection;

    /**
     * The returned {@code OntologyProjectCollection} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.OntologyProjectCollection getOntologyProjectCollection() {
        return ontologyProjectCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "ontologyProjectCollection"})
    private ListOntologyProjectsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, com.oracle.aidataplatform.dp.model.OntologyProjectCollection ontologyProjectCollection) {
        super(__httpStatusCode__, headers);
        this.ontologyProjectCollection = ontologyProjectCollection;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<ListOntologyProjectsResponse> {
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
         * The returned {@code OntologyProjectCollection} instance.
         */
        private com.oracle.aidataplatform.dp.model.OntologyProjectCollection ontologyProjectCollection;

        /**
         * The returned {@code OntologyProjectCollection} instance.
         * @param ontologyProjectCollection the value to set
         * @return this builder
         */
        public Builder ontologyProjectCollection(com.oracle.aidataplatform.dp.model.OntologyProjectCollection ontologyProjectCollection) {
            this.ontologyProjectCollection = ontologyProjectCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(ListOntologyProjectsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            
            ontologyProjectCollection(o.getOntologyProjectCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public ListOntologyProjectsResponse build() {
            return new ListOntologyProjectsResponse(__httpStatusCode__, headers, ontologyProjectCollection);
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
        sb.append(",ontologyProjectCollection=").append(String.valueOf(ontologyProjectCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOntologyProjectsResponse)) {
            return false;
        }

        ListOntologyProjectsResponse other = (ListOntologyProjectsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.ontologyProjectCollection, other.ontologyProjectCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ontologyProjectCollection == null ? 43 : this.ontologyProjectCollection.hashCode());
        return result;
    }
}