// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.responses;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class SearchDeploymentLogsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned {@code DeploymentLogCollection} instance.
     */
    private com.oracle.aidataplatform.dp.model.DeploymentLogCollection deploymentLogCollection;

    /**
     * The returned {@code DeploymentLogCollection} instance.
     * @return the value
     */
    public com.oracle.aidataplatform.dp.model.DeploymentLogCollection getDeploymentLogCollection() {
        return deploymentLogCollection;
    }


    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "deploymentLogCollection"})
    private SearchDeploymentLogsResponse(int __httpStatusCode__,  java.util.Map<String, java.util.List<String>> headers, String opcRequestId, com.oracle.aidataplatform.dp.model.DeploymentLogCollection deploymentLogCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.deploymentLogCollection = deploymentLogCollection;

    }

    public static class Builder implements com.oracle.bmc.responses.BmcResponse.Builder<SearchDeploymentLogsResponse> {
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
         * The returned {@code DeploymentLogCollection} instance.
         */
        private com.oracle.aidataplatform.dp.model.DeploymentLogCollection deploymentLogCollection;

        /**
         * The returned {@code DeploymentLogCollection} instance.
         * @param deploymentLogCollection the value to set
         * @return this builder
         */
        public Builder deploymentLogCollection(com.oracle.aidataplatform.dp.model.DeploymentLogCollection deploymentLogCollection) {
            this.deploymentLogCollection = deploymentLogCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        @Override
        public Builder copy(SearchDeploymentLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            deploymentLogCollection(o.getDeploymentLogCollection());
            
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        @Override
        public SearchDeploymentLogsResponse build() {
            return new SearchDeploymentLogsResponse(__httpStatusCode__, headers, opcRequestId, deploymentLogCollection);
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
        sb.append(",deploymentLogCollection=").append(String.valueOf(deploymentLogCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchDeploymentLogsResponse)) {
            return false;
        }

        SearchDeploymentLogsResponse other = (SearchDeploymentLogsResponse) o;
        return super.equals(o)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.deploymentLogCollection, other.deploymentLogCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.deploymentLogCollection == null ? 43 : this.deploymentLogCollection.hashCode());
        return result;
    }
}