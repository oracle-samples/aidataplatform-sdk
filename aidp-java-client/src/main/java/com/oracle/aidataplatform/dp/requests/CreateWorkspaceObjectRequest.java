// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class CreateWorkspaceObjectRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

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
     * Details for the new workspace object.
     */
    private java.io.InputStream createWorkspaceObjectDetails;

    

        /**
     * Details for the new workspace object.
     */
    public java.io.InputStream getCreateWorkspaceObjectDetails() {
        return createWorkspaceObjectDetails;
    }
        /**
     * The absolute path of the file or folder
     */
    private String path;

    

        /**
     * The absolute path of the file or folder
     */
    public String getPath() {
        return path;
    }
        /**
     * The type of workspace object.
     */
    private String type;

    

        /**
     * The type of workspace object.
     */
    public String getType() {
        return type;
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
     * A flag to identify if the upload file is base64 encoded
     */
    private Boolean isUploadFileBase64Encoded;

    

        /**
     * A flag to identify if the upload file is base64 encoded
     */
    public Boolean getIsUploadFileBase64Encoded() {
        return isUploadFileBase64Encoded;
    }
        /**
     * A boolean which decides if overwrite is allowed
     */
    private Boolean isOverwrite;

    

        /**
     * A boolean which decides if overwrite is allowed
     */
    public Boolean getIsOverwrite() {
        return isOverwrite;
    }
        /**
     * The description of the workspace object
     */
    private String objectDescription;

    

        /**
     * The description of the workspace object
     */
    public String getObjectDescription() {
        return objectDescription;
    }
    

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return createWorkspaceObjectDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<CreateWorkspaceObjectRequest, java.io.InputStream> {
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
     * Details for the new workspace object.
     */
        private java.io.InputStream createWorkspaceObjectDetails = null;

        /**
         * Details for the new workspace object.
         * @param createWorkspaceObjectDetails the value to set
         * @return this builder instance
         */
        public Builder createWorkspaceObjectDetails(java.io.InputStream createWorkspaceObjectDetails) {
            this.createWorkspaceObjectDetails = createWorkspaceObjectDetails;
            return this;
        }

            /**
     * The absolute path of the file or folder
     */
        private String path = null;

        /**
         * The absolute path of the file or folder
         * @param path the value to set
         * @return this builder instance
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

            /**
     * The type of workspace object.
     */
        private String type = null;

        /**
         * The type of workspace object.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
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
     * A flag to identify if the upload file is base64 encoded
     */
        private Boolean isUploadFileBase64Encoded = null;

        /**
         * A flag to identify if the upload file is base64 encoded
         * @param isUploadFileBase64Encoded the value to set
         * @return this builder instance
         */
        public Builder isUploadFileBase64Encoded(Boolean isUploadFileBase64Encoded) {
            this.isUploadFileBase64Encoded = isUploadFileBase64Encoded;
            return this;
        }

            /**
     * A boolean which decides if overwrite is allowed
     */
        private Boolean isOverwrite = null;

        /**
         * A boolean which decides if overwrite is allowed
         * @param isOverwrite the value to set
         * @return this builder instance
         */
        public Builder isOverwrite(Boolean isOverwrite) {
            this.isOverwrite = isOverwrite;
            return this;
        }

            /**
     * The description of the workspace object
     */
        private String objectDescription = null;

        /**
         * The description of the workspace object
         * @param objectDescription the value to set
         * @return this builder instance
         */
        public Builder objectDescription(String objectDescription) {
            this.objectDescription = objectDescription;
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
        public Builder copy(CreateWorkspaceObjectRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());createWorkspaceObjectDetails(o.getCreateWorkspaceObjectDetails());path(o.getPath());type(o.getType());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());shouldUpdateRecent(o.getShouldUpdateRecent());isUploadFileBase64Encoded(o.getIsUploadFileBase64Encoded());isOverwrite(o.getIsOverwrite());objectDescription(o.getObjectDescription());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateWorkspaceObjectRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateWorkspaceObjectRequest
         */
        public CreateWorkspaceObjectRequest build() {
            CreateWorkspaceObjectRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            createWorkspaceObjectDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateWorkspaceObjectRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateWorkspaceObjectRequest
         */
        public CreateWorkspaceObjectRequest buildWithoutInvocationCallback() {
            CreateWorkspaceObjectRequest request = new CreateWorkspaceObjectRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.createWorkspaceObjectDetails = createWorkspaceObjectDetails;
            request.path = path;
            request.type = type;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.shouldUpdateRecent = shouldUpdateRecent;
            request.isUploadFileBase64Encoded = isUploadFileBase64Encoded;
            request.isOverwrite = isOverwrite;
            request.objectDescription = objectDescription;
            return request;
            // new CreateWorkspaceObjectRequest(aiDataPlatformId, workspaceKey, createWorkspaceObjectDetails, path, type, opcRetryToken, opcRequestId, shouldUpdateRecent, isUploadFileBase64Encoded, isOverwrite, objectDescription);
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
            .createWorkspaceObjectDetails(createWorkspaceObjectDetails)
            .path(path)
            .type(type)
            .opcRetryToken(opcRetryToken)
            .opcRequestId(opcRequestId)
            .shouldUpdateRecent(shouldUpdateRecent)
            .isUploadFileBase64Encoded(isUploadFileBase64Encoded)
            .isOverwrite(isOverwrite)
            .objectDescription(objectDescription);
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
        sb.append(",createWorkspaceObjectDetails=").append(String.valueOf(this.createWorkspaceObjectDetails));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(",isUploadFileBase64Encoded=").append(String.valueOf(this.isUploadFileBase64Encoded));
        sb.append(",isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(",objectDescription=").append(String.valueOf(this.objectDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWorkspaceObjectRequest)) {
            return false;
        }

        CreateWorkspaceObjectRequest other = (CreateWorkspaceObjectRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.createWorkspaceObjectDetails, other.createWorkspaceObjectDetails)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent)
            && java.util.Objects.equals(this.isUploadFileBase64Encoded, other.isUploadFileBase64Encoded)
            && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
            && java.util.Objects.equals(this.objectDescription, other.objectDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.createWorkspaceObjectDetails == null ? 43 : this.createWorkspaceObjectDetails.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        result = (result * PRIME) + (this.isUploadFileBase64Encoded == null ? 43 : this.isUploadFileBase64Encoded.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.objectDescription == null ? 43 : this.objectDescription.hashCode());
        return result;
    }
}