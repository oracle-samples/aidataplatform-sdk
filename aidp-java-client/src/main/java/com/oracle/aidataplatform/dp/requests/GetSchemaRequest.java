// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetSchemaRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * When true, skip user OCID translation and return raw OCIDs.
     */
    private Boolean shouldSkipOcidTranslation;

    

        /**
     * When true, skip user OCID translation and return raw OCIDs.
     */
    public Boolean getShouldSkipOcidTranslation() {
        return shouldSkipOcidTranslation;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<GetSchemaRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
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
     * When true, skip user OCID translation and return raw OCIDs.
     */
        private Boolean shouldSkipOcidTranslation = null;

        /**
         * When true, skip user OCID translation and return raw OCIDs.
         * @param shouldSkipOcidTranslation the value to set
         * @return this builder instance
         */
        public Builder shouldSkipOcidTranslation(Boolean shouldSkipOcidTranslation) {
            this.shouldSkipOcidTranslation = shouldSkipOcidTranslation;
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
        public Builder copy(GetSchemaRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());schemaKey(o.getSchemaKey());shouldSkipOcidTranslation(o.getShouldSkipOcidTranslation());opcRequestId(o.getOpcRequestId());shouldUpdateRecent(o.getShouldUpdateRecent());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSchemaRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSchemaRequest
         */
        public GetSchemaRequest build() {
            GetSchemaRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSchemaRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSchemaRequest
         */
        public GetSchemaRequest buildWithoutInvocationCallback() {
            GetSchemaRequest request = new GetSchemaRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.schemaKey = schemaKey;
            request.shouldSkipOcidTranslation = shouldSkipOcidTranslation;
            request.opcRequestId = opcRequestId;
            request.shouldUpdateRecent = shouldUpdateRecent;
            return request;
            // new GetSchemaRequest(aiDataPlatformId, schemaKey, shouldSkipOcidTranslation, opcRequestId, shouldUpdateRecent);
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
            .shouldSkipOcidTranslation(shouldSkipOcidTranslation)
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
        sb.append(",shouldSkipOcidTranslation=").append(String.valueOf(this.shouldSkipOcidTranslation));
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
        if (!(o instanceof GetSchemaRequest)) {
            return false;
        }

        GetSchemaRequest other = (GetSchemaRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.schemaKey, other.schemaKey)
            && java.util.Objects.equals(this.shouldSkipOcidTranslation, other.shouldSkipOcidTranslation)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.shouldSkipOcidTranslation == null ? 43 : this.shouldSkipOcidTranslation.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        return result;
    }
}