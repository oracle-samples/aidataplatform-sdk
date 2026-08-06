// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UploadWorkspaceObjectWithParRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.UploadFileWithParDetails> {

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
     * Contents of the file to upload.
     */
    private com.oracle.aidataplatform.dp.model.UploadFileWithParDetails uploadFileWithParDetails;

    

        /**
     * Contents of the file to upload.
     */
    public com.oracle.aidataplatform.dp.model.UploadFileWithParDetails getUploadFileWithParDetails() {
        return uploadFileWithParDetails;
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
     * Flag to toggle to generate short living par
     */
    private Boolean shouldGenerateNewPar;

    

        /**
     * Flag to toggle to generate short living par
     */
    public Boolean getShouldGenerateNewPar() {
        return shouldGenerateNewPar;
    }
        /**
     * A boolean which decides if parent directories should be created recursively during upload.
     */
    private Boolean shouldCreateRecursively;

    

        /**
     * A boolean which decides if parent directories should be created recursively during upload.
     */
    public Boolean getShouldCreateRecursively() {
        return shouldCreateRecursively;
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
    public com.oracle.aidataplatform.dp.model.UploadFileWithParDetails getBody$() {
        return uploadFileWithParDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UploadWorkspaceObjectWithParRequest, com.oracle.aidataplatform.dp.model.UploadFileWithParDetails> {
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
     * Contents of the file to upload.
     */
        private com.oracle.aidataplatform.dp.model.UploadFileWithParDetails uploadFileWithParDetails = null;

        /**
         * Contents of the file to upload.
         * @param uploadFileWithParDetails the value to set
         * @return this builder instance
         */
        public Builder uploadFileWithParDetails(com.oracle.aidataplatform.dp.model.UploadFileWithParDetails uploadFileWithParDetails) {
            this.uploadFileWithParDetails = uploadFileWithParDetails;
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
     * Flag to toggle to generate short living par
     */
        private Boolean shouldGenerateNewPar = null;

        /**
         * Flag to toggle to generate short living par
         * @param shouldGenerateNewPar the value to set
         * @return this builder instance
         */
        public Builder shouldGenerateNewPar(Boolean shouldGenerateNewPar) {
            this.shouldGenerateNewPar = shouldGenerateNewPar;
            return this;
        }

            /**
     * A boolean which decides if parent directories should be created recursively during upload.
     */
        private Boolean shouldCreateRecursively = null;

        /**
         * A boolean which decides if parent directories should be created recursively during upload.
         * @param shouldCreateRecursively the value to set
         * @return this builder instance
         */
        public Builder shouldCreateRecursively(Boolean shouldCreateRecursively) {
            this.shouldCreateRecursively = shouldCreateRecursively;
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
        public Builder copy(UploadWorkspaceObjectWithParRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());uploadFileWithParDetails(o.getUploadFileWithParDetails());path(o.getPath());isOverwrite(o.getIsOverwrite());shouldGenerateNewPar(o.getShouldGenerateNewPar());shouldCreateRecursively(o.getShouldCreateRecursively());shouldUpdateRecent(o.getShouldUpdateRecent());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());type(o.getType());objectDescription(o.getObjectDescription());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadWorkspaceObjectWithParRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadWorkspaceObjectWithParRequest
         */
        public UploadWorkspaceObjectWithParRequest build() {
            UploadWorkspaceObjectWithParRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.UploadFileWithParDetails body) {
            uploadFileWithParDetails(body);
            return this;
        }

        /**
         * Build the instance of UploadWorkspaceObjectWithParRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadWorkspaceObjectWithParRequest
         */
        public UploadWorkspaceObjectWithParRequest buildWithoutInvocationCallback() {
            UploadWorkspaceObjectWithParRequest request = new UploadWorkspaceObjectWithParRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.uploadFileWithParDetails = uploadFileWithParDetails;
            request.path = path;
            request.isOverwrite = isOverwrite;
            request.shouldGenerateNewPar = shouldGenerateNewPar;
            request.shouldCreateRecursively = shouldCreateRecursively;
            request.shouldUpdateRecent = shouldUpdateRecent;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.type = type;
            request.objectDescription = objectDescription;
            return request;
            // new UploadWorkspaceObjectWithParRequest(aiDataPlatformId, workspaceKey, uploadFileWithParDetails, path, isOverwrite, shouldGenerateNewPar, shouldCreateRecursively, shouldUpdateRecent, opcRetryToken, opcRequestId, type, objectDescription);
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
            .uploadFileWithParDetails(uploadFileWithParDetails)
            .path(path)
            .isOverwrite(isOverwrite)
            .shouldGenerateNewPar(shouldGenerateNewPar)
            .shouldCreateRecursively(shouldCreateRecursively)
            .shouldUpdateRecent(shouldUpdateRecent)
            .opcRetryToken(opcRetryToken)
            .opcRequestId(opcRequestId)
            .type(type)
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
        sb.append(",uploadFileWithParDetails=").append(String.valueOf(this.uploadFileWithParDetails));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(",shouldGenerateNewPar=").append(String.valueOf(this.shouldGenerateNewPar));
        sb.append(",shouldCreateRecursively=").append(String.valueOf(this.shouldCreateRecursively));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",objectDescription=").append(String.valueOf(this.objectDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadWorkspaceObjectWithParRequest)) {
            return false;
        }

        UploadWorkspaceObjectWithParRequest other = (UploadWorkspaceObjectWithParRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.uploadFileWithParDetails, other.uploadFileWithParDetails)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
            && java.util.Objects.equals(this.shouldGenerateNewPar, other.shouldGenerateNewPar)
            && java.util.Objects.equals(this.shouldCreateRecursively, other.shouldCreateRecursively)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
            && java.util.Objects.equals(this.type, other.type)
            && java.util.Objects.equals(this.objectDescription, other.objectDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.uploadFileWithParDetails == null ? 43 : this.uploadFileWithParDetails.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.shouldGenerateNewPar == null ? 43 : this.shouldGenerateNewPar.hashCode());
        result = (result * PRIME) + (this.shouldCreateRecursively == null ? 43 : this.shouldCreateRecursively.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.objectDescription == null ? 43 : this.objectDescription.hashCode());
        return result;
    }
}