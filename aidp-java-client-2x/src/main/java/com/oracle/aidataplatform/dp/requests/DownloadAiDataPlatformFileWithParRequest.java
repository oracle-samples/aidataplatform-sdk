package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class DownloadAiDataPlatformFileWithParRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<DownloadAiDataPlatformFileWithParRequest, java.lang.Void> {
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
        public Builder copy(DownloadAiDataPlatformFileWithParRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());volumeKey(o.getVolumeKey());path(o.getPath());opcRetryToken(o.getOpcRetryToken());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadAiDataPlatformFileWithParRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DownloadAiDataPlatformFileWithParRequest
         */
        public DownloadAiDataPlatformFileWithParRequest build() {
            DownloadAiDataPlatformFileWithParRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DownloadAiDataPlatformFileWithParRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadAiDataPlatformFileWithParRequest
         */
        public DownloadAiDataPlatformFileWithParRequest buildWithoutInvocationCallback() {
            DownloadAiDataPlatformFileWithParRequest request = new DownloadAiDataPlatformFileWithParRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.volumeKey = volumeKey;
            request.path = path;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadAiDataPlatformFileWithParRequest(aiDataPlatformId, volumeKey, path, opcRetryToken, opcRequestId);
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
            .path(path)
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
        sb.append(",path=").append(String.valueOf(this.path));
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
        if (!(o instanceof DownloadAiDataPlatformFileWithParRequest)) {
            return false;
        }

        DownloadAiDataPlatformFileWithParRequest other = (DownloadAiDataPlatformFileWithParRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.volumeKey, other.volumeKey)
            && java.util.Objects.equals(this.path, other.path)
            && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}