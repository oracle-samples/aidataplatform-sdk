// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CreateOntologyProjectRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails> {

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the DataLake.
     */
    private String dataLakeId;

    

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the DataLake.
     */
    public String getDataLakeId() {
        return dataLakeId;
    }
    
    private com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails createOntologyProjectDetails;

    

    
    public com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails getCreateOntologyProjectDetails() {
        return createOntologyProjectDetails;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails getBody$() {
        return createOntologyProjectDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<CreateOntologyProjectRequest, com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

            /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the DataLake.
     */
        private String dataLakeId = null;

        /**
         * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the DataLake.
         * @param dataLakeId the value to set
         * @return this builder instance
         */
        public Builder dataLakeId(String dataLakeId) {
            this.dataLakeId = dataLakeId;
            return this;
        }

        
        private com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails createOntologyProjectDetails = null;

        /**
         * 
         * @param createOntologyProjectDetails the value to set
         * @return this builder instance
         */
        public Builder createOntologyProjectDetails(com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails createOntologyProjectDetails) {
            this.createOntologyProjectDetails = createOntologyProjectDetails;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
        com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateOntologyProjectRequest o) {
            dataLakeId(o.getDataLakeId());createOntologyProjectDetails(o.getCreateOntologyProjectDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOntologyProjectRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateOntologyProjectRequest
         */
        public CreateOntologyProjectRequest build() {
            CreateOntologyProjectRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.aidataplatform.dp.model.CreateOntologyProjectDetails body) {
            createOntologyProjectDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOntologyProjectRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOntologyProjectRequest
         */
        public CreateOntologyProjectRequest buildWithoutInvocationCallback() {
            CreateOntologyProjectRequest request = new CreateOntologyProjectRequest();
            request.dataLakeId = dataLakeId;
            request.createOntologyProjectDetails = createOntologyProjectDetails;
            return request;
            // new CreateOntologyProjectRequest(dataLakeId, createOntologyProjectDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .dataLakeId(dataLakeId)
            .createOntologyProjectDetails(createOntologyProjectDetails);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",dataLakeId=").append(String.valueOf(this.dataLakeId));
        sb.append(",createOntologyProjectDetails=").append(String.valueOf(this.createOntologyProjectDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOntologyProjectRequest)) {
            return false;
        }

        CreateOntologyProjectRequest other = (CreateOntologyProjectRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.dataLakeId, other.dataLakeId)
            && java.util.Objects.equals(this.createOntologyProjectDetails, other.createOntologyProjectDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dataLakeId == null ? 43 : this.dataLakeId.hashCode());
        result = (result * PRIME) + (this.createOntologyProjectDetails == null ? 43 : this.createOntologyProjectDetails.hashCode());
        return result;
    }
}