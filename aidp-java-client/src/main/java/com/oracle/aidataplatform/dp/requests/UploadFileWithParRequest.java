// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class UploadFileWithParRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.UploadFileWithParDetails> {

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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.aidataplatform.dp.model.UploadFileWithParDetails getBody$() {
        return uploadFileWithParDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<UploadFileWithParRequest, com.oracle.aidataplatform.dp.model.UploadFileWithParDetails> {
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
        public Builder copy(UploadFileWithParRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());volumeKey(o.getVolumeKey());uploadFileWithParDetails(o.getUploadFileWithParDetails());path(o.getPath());isOverwrite(o.getIsOverwrite());shouldGenerateNewPar(o.getShouldGenerateNewPar());shouldUpdateRecent(o.getShouldUpdateRecent());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadFileWithParRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadFileWithParRequest
         */
        public UploadFileWithParRequest build() {
            UploadFileWithParRequest request = buildWithoutInvocationCallback();
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
         * Build the instance of UploadFileWithParRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadFileWithParRequest
         */
        public UploadFileWithParRequest buildWithoutInvocationCallback() {
            UploadFileWithParRequest request = new UploadFileWithParRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.volumeKey = volumeKey;
            request.uploadFileWithParDetails = uploadFileWithParDetails;
            request.path = path;
            request.isOverwrite = isOverwrite;
            request.shouldGenerateNewPar = shouldGenerateNewPar;
            request.shouldUpdateRecent = shouldUpdateRecent;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new UploadFileWithParRequest(aiDataPlatformId, volumeKey, uploadFileWithParDetails, path, isOverwrite, shouldGenerateNewPar, shouldUpdateRecent, opcRetryToken, opcRequestId);
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
            .uploadFileWithParDetails(uploadFileWithParDetails)
            .path(path)
            .isOverwrite(isOverwrite)
            .shouldGenerateNewPar(shouldGenerateNewPar)
            .shouldUpdateRecent(shouldUpdateRecent)
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
        sb.append(",uploadFileWithParDetails=").append(String.valueOf(this.uploadFileWithParDetails));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",isOverwrite=").append(String.valueOf(this.isOverwrite));
        sb.append(",shouldGenerateNewPar=").append(String.valueOf(this.shouldGenerateNewPar));
        sb.append(",shouldUpdateRecent=").append(String.valueOf(this.shouldUpdateRecent));
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
        if (!(o instanceof UploadFileWithParRequest)) {
            return false;
        }

        UploadFileWithParRequest other = (UploadFileWithParRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.volumeKey, other.volumeKey)
            && java.util.Objects.equals(this.uploadFileWithParDetails, other.uploadFileWithParDetails)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.isOverwrite, other.isOverwrite)
            && java.util.Objects.equals(this.shouldGenerateNewPar, other.shouldGenerateNewPar)
            && java.util.Objects.equals(this.shouldUpdateRecent, other.shouldUpdateRecent)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.uploadFileWithParDetails == null ? 43 : this.uploadFileWithParDetails.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.isOverwrite == null ? 43 : this.isOverwrite.hashCode());
        result = (result * PRIME) + (this.shouldGenerateNewPar == null ? 43 : this.shouldGenerateNewPar.hashCode());
        result = (result * PRIME) + (this.shouldUpdateRecent == null ? 43 : this.shouldUpdateRecent.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}