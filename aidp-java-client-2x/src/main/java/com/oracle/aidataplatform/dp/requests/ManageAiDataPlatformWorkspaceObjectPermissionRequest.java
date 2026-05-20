// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ManageAiDataPlatformWorkspaceObjectPermissionRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails> {

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
     * The key of the workspace object.
     */
    private String objectKey;

    

        /**
     * The key of the workspace object.
     */
    public String getObjectKey() {
        return objectKey;
    }
        /**
     * The information to be updated.
     */
    private com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails manageWorkspaceObjectPermissionDetails;

    

        /**
     * The information to be updated.
     */
    public com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails getManageWorkspaceObjectPermissionDetails() {
        return manageWorkspaceObjectPermissionDetails;
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
    public com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails getBody$() {
        return manageWorkspaceObjectPermissionDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ManageAiDataPlatformWorkspaceObjectPermissionRequest, com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails> {
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
     * The key of the workspace object.
     */
        private String objectKey = null;

        /**
         * The key of the workspace object.
         * @param objectKey the value to set
         * @return this builder instance
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

            /**
     * The information to be updated.
     */
        private com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails manageWorkspaceObjectPermissionDetails = null;

        /**
         * The information to be updated.
         * @param manageWorkspaceObjectPermissionDetails the value to set
         * @return this builder instance
         */
        public Builder manageWorkspaceObjectPermissionDetails(com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails manageWorkspaceObjectPermissionDetails) {
            this.manageWorkspaceObjectPermissionDetails = manageWorkspaceObjectPermissionDetails;
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
        public Builder copy(ManageAiDataPlatformWorkspaceObjectPermissionRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());objectKey(o.getObjectKey());manageWorkspaceObjectPermissionDetails(o.getManageWorkspaceObjectPermissionDetails());ifMatch(o.getIfMatch());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ManageAiDataPlatformWorkspaceObjectPermissionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ManageAiDataPlatformWorkspaceObjectPermissionRequest
         */
        public ManageAiDataPlatformWorkspaceObjectPermissionRequest build() {
            ManageAiDataPlatformWorkspaceObjectPermissionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.ManageWorkspaceObjectPermissionDetails body) {
            manageWorkspaceObjectPermissionDetails(body);
            return this;
        }

        /**
         * Build the instance of ManageAiDataPlatformWorkspaceObjectPermissionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ManageAiDataPlatformWorkspaceObjectPermissionRequest
         */
        public ManageAiDataPlatformWorkspaceObjectPermissionRequest buildWithoutInvocationCallback() {
            ManageAiDataPlatformWorkspaceObjectPermissionRequest request = new ManageAiDataPlatformWorkspaceObjectPermissionRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.objectKey = objectKey;
            request.manageWorkspaceObjectPermissionDetails = manageWorkspaceObjectPermissionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ManageAiDataPlatformWorkspaceObjectPermissionRequest(aiDataPlatformId, workspaceKey, objectKey, manageWorkspaceObjectPermissionDetails, ifMatch, opcRequestId);
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
            .objectKey(objectKey)
            .manageWorkspaceObjectPermissionDetails(manageWorkspaceObjectPermissionDetails)
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
        sb.append(",workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(",objectKey=").append(String.valueOf(this.objectKey));
        sb.append(",manageWorkspaceObjectPermissionDetails=").append(String.valueOf(this.manageWorkspaceObjectPermissionDetails));
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
        if (!(o instanceof ManageAiDataPlatformWorkspaceObjectPermissionRequest)) {
            return false;
        }

        ManageAiDataPlatformWorkspaceObjectPermissionRequest other = (ManageAiDataPlatformWorkspaceObjectPermissionRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.objectKey, other.objectKey)
            && java.util.Objects.equals(this.manageWorkspaceObjectPermissionDetails, other.manageWorkspaceObjectPermissionDetails)
            && java.util.Objects.equals(this.ifMatch, other.ifMatch)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.objectKey == null ? 43 : this.objectKey.hashCode());
        result = (result * PRIME) + (this.manageWorkspaceObjectPermissionDetails == null ? 43 : this.manageWorkspaceObjectPermissionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}