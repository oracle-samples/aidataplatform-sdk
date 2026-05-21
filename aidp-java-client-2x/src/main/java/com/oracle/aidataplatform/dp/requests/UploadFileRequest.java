// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UploadFileRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

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
     * The key of the volume.
     */
    private String volumeKey;

    

        /**
     * The key of the volume.
     */
    public String getVolumeKey() {
        return volumeKey;
    }
        /**
     * Contents of the file to upload.
     */
    private java.io.InputStream uploadFileDetails;

    

        /**
     * Contents of the file to upload.
     */
    public java.io.InputStream getUploadFileDetails() {
        return uploadFileDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadFileDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UploadFileRequest, java.io.InputStream> {
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
     * The key of the volume.
     */
        private String volumeKey = null;

        /**
         * The key of the volume.
         * @param volumeKey the value to set
         * @return this builder instance
         */
        public Builder volumeKey(String volumeKey) {
            this.volumeKey = volumeKey;
            return this;
        }

            /**
     * Contents of the file to upload.
     */
        private java.io.InputStream uploadFileDetails = null;

        /**
         * Contents of the file to upload.
         * @param uploadFileDetails the value to set
         * @return this builder instance
         */
        public Builder uploadFileDetails(java.io.InputStream uploadFileDetails) {
            this.uploadFileDetails = uploadFileDetails;
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
        public Builder copy(UploadFileRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());volumeKey(o.getVolumeKey());uploadFileDetails(o.getUploadFileDetails());path(o.getPath());isOverwrite(o.getIsOverwrite());shouldUpdateRecent(o.getShouldUpdateRecent());isUploadFileBase64Encoded(o.getIsUploadFileBase64Encoded());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadFileRequest
         */
        public UploadFileRequest build() {
            UploadFileRequest request = buildWithoutInvocationCallback();
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
            uploadFileDetails(body);
            return this;
        }

        /**
         * Build the instance of UploadFileRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadFileRequest
         */
        public UploadFileRequest buildWithoutInvocationCallback() {
            UploadFileRequest request = new UploadFileRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.volumeKey = volumeKey;
            request.uploadFileDetails = uploadFileDetails;
            request.path = path;
            request.isOverwrite = isOverwrite;
            request.shouldUpdateRecent = shouldUpdateRecent;
            request.isUploadFileBase64Encoded = isUploadFileBase64Encoded;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new UploadFileRequest(aiDataPlatformId, volumeKey, uploadFileDetails, path, isOverwrite, shouldUpdateRecent, isUploadFileBase64Encoded, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
            .aiDataPlatformId(aiDataPlatformId)
            .volumeKey(volumeKey)
            .uploadFileDetails(uploadFileDetails)
            .path(path)
            .isOverwrite(isOverwrite)
            .shouldUpdateRecent(shouldUpdateRecent)
            .isUploadFileBase64Encoded(isUploadFileBase64Encoded)
            .opcRetryToken(opcRetryToken)
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
        sb.append(",volumeKey=").append(String.valueOf(this.volumeKey));
        sb.append(",uploadFileDetails=").append(String.valueOf(this.uploadFileDetails));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
        sb.append(",isUploadFileBase64Encoded=").append(String.valueOf(this.isUploadFileBase64Encoded));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadFileRequest)) {
            return false;
        }

        UploadFileRequest other = (UploadFileRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.volumeKey, other.volumeKey)
            && java.util.Objects.equals(this.uploadFileDetails, other.uploadFileDetails)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent)
            && java.util.Objects.equals(this.isUploadFileBase64Encoded, other.isUploadFileBase64Encoded)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.uploadFileDetails == null ? 43 : this.uploadFileDetails.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        result = (result * PRIME) + (this.isUploadFileBase64Encoded == null ? 43 : this.isUploadFileBase64Encoded.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}