package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class ExportAiDataPlatformContentsRequest extends com.oracle.bmc.requests.BmcRequest<com.oracle.aidataplatform.dp.model.ExportContentsDetails> {

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
     * The path to the notebook file.
     */
    private String contentPath;

    

        /**
     * The path to the notebook file.
     */
    public String getContentPath() {
        return contentPath;
    }
        /**
     * Payload to export contents of a file.
     */
    private com.oracle.aidataplatform.dp.model.ExportContentsDetails exportContentsDetails;

    

        /**
     * Payload to export contents of a file.
     */
    public com.oracle.aidataplatform.dp.model.ExportContentsDetails getExportContentsDetails() {
        return exportContentsDetails;
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
    public com.oracle.aidataplatform.dp.model.ExportContentsDetails getBody$() {
        return exportContentsDetails;
    }

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<ExportAiDataPlatformContentsRequest, com.oracle.aidataplatform.dp.model.ExportContentsDetails> {
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
     * The path to the notebook file.
     */
        private String contentPath = null;

        /**
         * The path to the notebook file.
         * @param contentPath the value to set
         * @return this builder instance
         */
        public Builder contentPath(String contentPath) {
            this.contentPath = contentPath;
            return this;
        }

            /**
     * Payload to export contents of a file.
     */
        private com.oracle.aidataplatform.dp.model.ExportContentsDetails exportContentsDetails = null;

        /**
         * Payload to export contents of a file.
         * @param exportContentsDetails the value to set
         * @return this builder instance
         */
        public Builder exportContentsDetails(com.oracle.aidataplatform.dp.model.ExportContentsDetails exportContentsDetails) {
            this.exportContentsDetails = exportContentsDetails;
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
        public Builder copy(ExportAiDataPlatformContentsRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());contentPath(o.getContentPath());exportContentsDetails(o.getExportContentsDetails());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportAiDataPlatformContentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ExportAiDataPlatformContentsRequest
         */
        public ExportAiDataPlatformContentsRequest build() {
            ExportAiDataPlatformContentsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.aidataplatform.dp.model.ExportContentsDetails body) {
            exportContentsDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportAiDataPlatformContentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportAiDataPlatformContentsRequest
         */
        public ExportAiDataPlatformContentsRequest buildWithoutInvocationCallback() {
            ExportAiDataPlatformContentsRequest request = new ExportAiDataPlatformContentsRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.contentPath = contentPath;
            request.exportContentsDetails = exportContentsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ExportAiDataPlatformContentsRequest(aiDataPlatformId, workspaceKey, contentPath, exportContentsDetails, opcRequestId);
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
            .contentPath(contentPath)
            .exportContentsDetails(exportContentsDetails)
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
        sb.append(",contentPath=").append(String.valueOf(this.contentPath));
        sb.append(",exportContentsDetails=").append(String.valueOf(this.exportContentsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportAiDataPlatformContentsRequest)) {
            return false;
        }

        ExportAiDataPlatformContentsRequest other = (ExportAiDataPlatformContentsRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.contentPath, other.contentPath)
            && java.util.Objects.equals(this.exportContentsDetails, other.exportContentsDetails)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.contentPath == null ? 43 : this.contentPath.hashCode());
        result = (result * PRIME) + (this.exportContentsDetails == null ? 43 : this.exportContentsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}