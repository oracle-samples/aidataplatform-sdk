// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UpdateAiDataPlatformExperimentTagsRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails> {

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
     * The key of the Workspace
     */
    private String workspaceKey;

    

        /**
     * The key of the Workspace
     */
    public String getWorkspaceKey() {
        return workspaceKey;
    }
        /**
     * Details of Experiment tags.
     */
    private com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails updateExperimentTagsDetails;

    

        /**
     * Details of Experiment tags.
     */
    public com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails getUpdateExperimentTagsDetails() {
        return updateExperimentTagsDetails;
    }
        /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
* server error without risk of running that same action again. Retry tokens expire after 24
* hours, but can be invalidated before then due to conflicting operations. For example, if a resource
* has been deleted and removed from the system, then a retry of the original creation request
* might be rejected.
* 
     */
    private String opcRetryToken;

    

        /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
* server error without risk of running that same action again. Retry tokens expire after 24
* hours, but can be invalidated before then due to conflicting operations. For example, if a resource
* has been deleted and removed from the system, then a retry of the original creation request
* might be rejected.
* 
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
     * The DH User Principal Header .
     */
    private String dhUserPrincipal;

    

        /**
     * The DH User Principal Header .
     */
    public String getDhUserPrincipal() {
        return dhUserPrincipal;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails getBody$() {
        return updateExperimentTagsDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UpdateAiDataPlatformExperimentTagsRequest, com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails> {
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
     * The key of the Workspace
     */
        private String workspaceKey = null;

        /**
         * The key of the Workspace
         * @param workspaceKey the value to set
         * @return this builder instance
         */
        public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = workspaceKey;
            return this;
        }

            /**
     * Details of Experiment tags.
     */
        private com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails updateExperimentTagsDetails = null;

        /**
         * Details of Experiment tags.
         * @param updateExperimentTagsDetails the value to set
         * @return this builder instance
         */
        public Builder updateExperimentTagsDetails(com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails updateExperimentTagsDetails) {
            this.updateExperimentTagsDetails = updateExperimentTagsDetails;
            return this;
        }

            /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
* server error without risk of running that same action again. Retry tokens expire after 24
* hours, but can be invalidated before then due to conflicting operations. For example, if a resource
* has been deleted and removed from the system, then a retry of the original creation request
* might be rejected.
* 
     */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
* server error without risk of running that same action again. Retry tokens expire after 24
* hours, but can be invalidated before then due to conflicting operations. For example, if a resource
* has been deleted and removed from the system, then a retry of the original creation request
* might be rejected.
* 
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
     * The DH User Principal Header .
     */
        private String dhUserPrincipal = null;

        /**
         * The DH User Principal Header .
         * @param dhUserPrincipal the value to set
         * @return this builder instance
         */
        public Builder dhUserPrincipal(String dhUserPrincipal) {
            this.dhUserPrincipal = dhUserPrincipal;
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
        public Builder copy(UpdateAiDataPlatformExperimentTagsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());updateExperimentTagsDetails(o.getUpdateExperimentTagsDetails());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());dhUserPrincipal(o.getDhUserPrincipal());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAiDataPlatformExperimentTagsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAiDataPlatformExperimentTagsRequest
         */
        public UpdateAiDataPlatformExperimentTagsRequest build() {
            UpdateAiDataPlatformExperimentTagsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.UpdateExperimentTagsDetails body) {
            updateExperimentTagsDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAiDataPlatformExperimentTagsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAiDataPlatformExperimentTagsRequest
         */
        public UpdateAiDataPlatformExperimentTagsRequest buildWithoutInvocationCallback() {
            UpdateAiDataPlatformExperimentTagsRequest request = new UpdateAiDataPlatformExperimentTagsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.updateExperimentTagsDetails = updateExperimentTagsDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.dhUserPrincipal = dhUserPrincipal;
            return request;
            // new UpdateAiDataPlatformExperimentTagsRequest(aiDataPlatformId, workspaceKey, updateExperimentTagsDetails, opcRetryToken, opcRequestId, dhUserPrincipal);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .workspaceKey(workspaceKey)
            .updateExperimentTagsDetails(updateExperimentTagsDetails)
            .opcRetryToken(opcRetryToken)
            .opcRequestId(opcRequestId)
            .dhUserPrincipal(dhUserPrincipal);
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
        sb.append(",workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(",updateExperimentTagsDetails=").append(String.valueOf(this.updateExperimentTagsDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",dhUserPrincipal=").append(String.valueOf(this.dhUserPrincipal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAiDataPlatformExperimentTagsRequest)) {
            return false;
        }

        UpdateAiDataPlatformExperimentTagsRequest other = (UpdateAiDataPlatformExperimentTagsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.updateExperimentTagsDetails, other.updateExperimentTagsDetails)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.dhUserPrincipal, other.dhUserPrincipal);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.updateExperimentTagsDetails == null ? 43 : this.updateExperimentTagsDetails.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.dhUserPrincipal == null ? 43 : this.dhUserPrincipal.hashCode());
        return result;
    }
}