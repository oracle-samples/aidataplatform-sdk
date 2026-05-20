// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class PerformAiDataPlatformInferSchemaRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails> {

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    private String aiDataPlatformId;

    

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
    public String getAiDataPlatformId() {
        return aiDataPlatformId;
    }
        /**
     * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
     */
    private String schemaKey;

    

        /**
     * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
     */
    public String getSchemaKey() {
        return schemaKey;
    }
        /**
     * Details of the location from which the table schema can be inferred.
     */
    private com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails performInferSchemaDetails;

    

        /**
     * Details of the location from which the table schema can be inferred.
     */
    public com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails getPerformInferSchemaDetails() {
        return performInferSchemaDetails;
    }
        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    private String opcRequestId;

    

        /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
        /**
     * A flag to identify if the recent list should be updated.
     */
    private Boolean shouldUpdateRecent;

    

        /**
     * A flag to identify if the recent list should be updated.
     */
    public Boolean getShouldUpdateRecent() {
        return shouldUpdateRecent;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails getBody$() {
        return performInferSchemaDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<PerformAiDataPlatformInferSchemaRequest, com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder> invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

            /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
     */
        private String aiDataPlatformId = null;

        /**
         * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
         * @param aiDataPlatformId the value to set
         * @return this builder instance
         */
        public Builder aiDataPlatformId(String aiDataPlatformId) {
            this.aiDataPlatformId = aiDataPlatformId;
            return this;
        }

            /**
     * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
     */
        private String schemaKey = null;

        /**
         * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
         * @param schemaKey the value to set
         * @return this builder instance
         */
        public Builder schemaKey(String schemaKey) {
            this.schemaKey = schemaKey;
            return this;
        }

            /**
     * Details of the location from which the table schema can be inferred.
     */
        private com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails performInferSchemaDetails = null;

        /**
         * Details of the location from which the table schema can be inferred.
         * @param performInferSchemaDetails the value to set
         * @return this builder instance
         */
        public Builder performInferSchemaDetails(com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails performInferSchemaDetails) {
            this.performInferSchemaDetails = performInferSchemaDetails;
            return this;
        }

            /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
     */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

            /**
     * A flag to identify if the recent list should be updated.
     */
        private Boolean shouldUpdateRecent = null;

        /**
         * A flag to identify if the recent list should be updated.
         * @param shouldUpdateRecent the value to set
         * @return this builder instance
         */
        public Builder shouldUpdateRecent(Boolean shouldUpdateRecent) {
            this.shouldUpdateRecent = shouldUpdateRecent;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder> invocationCallback) {
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
        public Builder copy(PerformAiDataPlatformInferSchemaRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());schemaKey(o.getSchemaKey());performInferSchemaDetails(o.getPerformInferSchemaDetails());opcRequestId(o.getOpcRequestId());shouldUpdateRecent(o.getShouldUpdateRecent());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PerformAiDataPlatformInferSchemaRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PerformAiDataPlatformInferSchemaRequest
         */
        public PerformAiDataPlatformInferSchemaRequest build() {
            PerformAiDataPlatformInferSchemaRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.PerformInferSchemaDetails body) {
            performInferSchemaDetails(body);
            return this;
        }

        /**
         * Build the instance of PerformAiDataPlatformInferSchemaRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PerformAiDataPlatformInferSchemaRequest
         */
        public PerformAiDataPlatformInferSchemaRequest buildWithoutInvocationCallback() {
            PerformAiDataPlatformInferSchemaRequest request = new PerformAiDataPlatformInferSchemaRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.schemaKey = schemaKey;
            request.performInferSchemaDetails = performInferSchemaDetails;
            request.opcRequestId = opcRequestId;
            request.shouldUpdateRecent = shouldUpdateRecent;
            return request;
            // new PerformAiDataPlatformInferSchemaRequest(aiDataPlatformId, schemaKey, performInferSchemaDetails, opcRequestId, shouldUpdateRecent);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .schemaKey(schemaKey)
            .performInferSchemaDetails(performInferSchemaDetails)
            .opcRequestId(opcRequestId)
            .shouldUpdateRecent(shouldUpdateRecent);
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
        sb.append(",aiDataPlatformId=").append(String.valueOf(this.aiDataPlatformId));
        sb.append(",schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(",performInferSchemaDetails=").append(String.valueOf(this.performInferSchemaDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformAiDataPlatformInferSchemaRequest)) {
            return false;
        }

        PerformAiDataPlatformInferSchemaRequest other = (PerformAiDataPlatformInferSchemaRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.schemaKey, other.schemaKey)
            && java.util.Objects.equals(this.performInferSchemaDetails, other.performInferSchemaDetails)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.performInferSchemaDetails == null ? 43 : this.performInferSchemaDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        return result;
    }
}