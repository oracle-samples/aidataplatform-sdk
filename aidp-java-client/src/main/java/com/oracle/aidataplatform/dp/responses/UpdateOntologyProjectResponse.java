// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateOntologyProjectResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The returned {@code OntologyProject} instance.
     */
    private com.oracle.aidataplatform.dp.model.OntologyProject ontologyProject;

    /**
     * The returned {@code OntologyProject} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.OntologyProject getOntologyProject() {
        return ontologyProject;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "ontologyProject"})
    private UpdateOntologyProjectResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, com.oracle.aidataplatform.dp.model.OntologyProject ontologyProject) {
        super(__httpStatusCode__, headers);
        this.ontologyProject = ontologyProject;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<UpdateOntologyProjectResponse> {
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
         * The returned {@code OntologyProject} instance.
         */
        private com.oracle.aidataplatform.dp.model.OntologyProject ontologyProject;

        /**
         * The returned {@code OntologyProject} instance.
         * @param ontologyProject the value to set
         * @return this builder
         */
        public Builder ontologyProject(com.oracle.aidataplatform.dp.model.OntologyProject ontologyProject) {
            this.ontologyProject = ontologyProject;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateOntologyProjectResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            
            ontologyProject(o.getOntologyProject());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public UpdateOntologyProjectResponse build() {
            return new UpdateOntologyProjectResponse(__httpStatusCode__, headers, ontologyProject);
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
        sb.append(",ontologyProject=").append(String.valueOf(ontologyProject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOntologyProjectResponse)) {
            return false;
        }

        UpdateOntologyProjectResponse other = (UpdateOntologyProjectResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.ontologyProject, other.ontologyProject);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ontologyProject == null ? 43 : this.ontologyProject.hashCode());
        return result;
    }
}