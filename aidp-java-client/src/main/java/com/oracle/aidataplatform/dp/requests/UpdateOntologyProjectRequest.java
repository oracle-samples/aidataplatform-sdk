// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateOntologyProjectRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails> {

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
        /**
     * The Ontology Manager project identifier.
     */
    private String projectId;

    

        /**
     * The Ontology Manager project identifier.
     */
    public String getProjectId() {
        return projectId;
    }
    
    private com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails updateOntologyProjectDetails;

    

    
    public com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails getUpdateOntologyProjectDetails() {
        return updateOntologyProjectDetails;
    }
        /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
    private String ifMatch;

    

        /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
    public String getIfMatch() {
        return ifMatch;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails getBody$() {
        return updateOntologyProjectDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UpdateOntologyProjectRequest, com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails> {
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

            /**
     * The Ontology Manager project identifier.
     */
        private String projectId = null;

        /**
         * The Ontology Manager project identifier.
         * @param projectId the value to set
         * @return this builder instance
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        
        private com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails updateOntologyProjectDetails = null;

        /**
         * 
         * @param updateOntologyProjectDetails the value to set
         * @return this builder instance
         */
        public Builder updateOntologyProjectDetails(com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails updateOntologyProjectDetails) {
            this.updateOntologyProjectDetails = updateOntologyProjectDetails;
            return this;
        }

            /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
     */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
* {@code if-match} parameter to the value of the etag from a previous GET or POST response for
* that resource. The resource will be updated or deleted only if the etag you provide
* matches the resource's current etag value.
* 
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateOntologyProjectRequest o) {
            dataLakeId(o.getDataLakeId());projectId(o.getProjectId());updateOntologyProjectDetails(o.getUpdateOntologyProjectDetails());ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOntologyProjectRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateOntologyProjectRequest
         */
        public UpdateOntologyProjectRequest build() {
            UpdateOntologyProjectRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.UpdateOntologyProjectDetails body) {
            updateOntologyProjectDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOntologyProjectRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOntologyProjectRequest
         */
        public UpdateOntologyProjectRequest buildWithoutInvocationCallback() {
            UpdateOntologyProjectRequest request = new UpdateOntologyProjectRequest();
            request.dataLakeId = dataLakeId;
            request.projectId = projectId;
            request.updateOntologyProjectDetails = updateOntologyProjectDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateOntologyProjectRequest(dataLakeId, projectId, updateOntologyProjectDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .dataLakeId(dataLakeId)
            .projectId(projectId)
            .updateOntologyProjectDetails(updateOntologyProjectDetails)
            .ifMatch(ifMatch);
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
        sb.append(",projectId=").append(String.valueOf(this.projectId));
        sb.append(",updateOntologyProjectDetails=").append(String.valueOf(this.updateOntologyProjectDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOntologyProjectRequest)) {
            return false;
        }

        UpdateOntologyProjectRequest other = (UpdateOntologyProjectRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.dataLakeId, other.dataLakeId)
            && java.util.Objects.equals(this.projectId, other.projectId)
            && java.util.Objects.equals(this.updateOntologyProjectDetails, other.updateOntologyProjectDetails)
            && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dataLakeId == null ? 43 : this.dataLakeId.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.updateOntologyProjectDetails == null ? 43 : this.updateOntologyProjectDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}