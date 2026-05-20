// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateAiDataPlatformViewRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.UpdateViewDetails> {

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
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
     */
    private String viewKey;

    

        /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
     */
    public String getViewKey() {
        return viewKey;
    }
        /**
     * The update mode and information to be updated.
     */
    private com.oracle.aidataplatform.dp.model.UpdateViewDetails updateViewDetails;

    

        /**
     * The update mode and information to be updated.
     */
    public com.oracle.aidataplatform.dp.model.UpdateViewDetails getUpdateViewDetails() {
        return updateViewDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.UpdateViewDetails getBody$() {
        return updateViewDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UpdateAiDataPlatformViewRequest, com.oracle.aidataplatform.dp.model.UpdateViewDetails> {
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
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
     */
        private String viewKey = null;

        /**
         * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>.
         * @param viewKey the value to set
         * @return this builder instance
         */
        public Builder viewKey(String viewKey) {
            this.viewKey = viewKey;
            return this;
        }

            /**
     * The update mode and information to be updated.
     */
        private com.oracle.aidataplatform.dp.model.UpdateViewDetails updateViewDetails = null;

        /**
         * The update mode and information to be updated.
         * @param updateViewDetails the value to set
         * @return this builder instance
         */
        public Builder updateViewDetails(com.oracle.aidataplatform.dp.model.UpdateViewDetails updateViewDetails) {
            this.updateViewDetails = updateViewDetails;
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
        public Builder copy(UpdateAiDataPlatformViewRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());viewKey(o.getViewKey());updateViewDetails(o.getUpdateViewDetails());shouldUpdateRecent(o.getShouldUpdateRecent());ifMatch(o.getIfMatch());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAiDataPlatformViewRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAiDataPlatformViewRequest
         */
        public UpdateAiDataPlatformViewRequest build() {
            UpdateAiDataPlatformViewRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.UpdateViewDetails body) {
            updateViewDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAiDataPlatformViewRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAiDataPlatformViewRequest
         */
        public UpdateAiDataPlatformViewRequest buildWithoutInvocationCallback() {
            UpdateAiDataPlatformViewRequest request = new UpdateAiDataPlatformViewRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.viewKey = viewKey;
            request.updateViewDetails = updateViewDetails;
            request.shouldUpdateRecent = shouldUpdateRecent;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAiDataPlatformViewRequest(aiDataPlatformId, viewKey, updateViewDetails, shouldUpdateRecent, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .viewKey(viewKey)
            .updateViewDetails(updateViewDetails)
            .shouldUpdateRecent(shouldUpdateRecent)
            .ifMatch(ifMatch)
            .opcRequestId(opcRequestId);
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
        sb.append(",viewKey=").append(String.valueOf(this.viewKey));
        sb.append(",updateViewDetails=").append(String.valueOf(this.updateViewDetails));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAiDataPlatformViewRequest)) {
            return false;
        }

        UpdateAiDataPlatformViewRequest other = (UpdateAiDataPlatformViewRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.viewKey, other.viewKey)
            && java.util.Objects.equals(this.updateViewDetails, other.updateViewDetails)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent)
            && java.util.Objects.equals(this.ifMatch, other.ifMatch)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.viewKey == null ? 43 : this.viewKey.hashCode());
        result = (result * PRIME) + (this.updateViewDetails == null ? 43 : this.updateViewDetails.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}