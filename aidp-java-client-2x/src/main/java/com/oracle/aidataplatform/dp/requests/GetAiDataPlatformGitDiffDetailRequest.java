package com.oracle.aidataplatform.dp.requests;

import com.oracle.aidataplatform.dp.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class GetAiDataPlatformGitDiffDetailRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The git repository key
     */
    private String gitRepositoryKey;

    

        /**
     * The git repository key
     */
    public String getGitRepositoryKey() {
        return gitRepositoryKey;
    }
        /**
     * The git folder path
     */
    private String gitFolderPath;

    

        /**
     * The git folder path
     */
    public String getGitFolderPath() {
        return gitFolderPath;
    }
        /**
     * Expected branch name for the folder context.
     */
    private String branchName;

    

        /**
     * Expected branch name for the folder context.
     */
    public String getBranchName() {
        return branchName;
    }
        /**
     * File path relative to repository root.
     */
    private String gitFilePath;

    

        /**
     * File path relative to repository root.
     */
    public String getGitFilePath() {
        return gitFilePath;
    }
        /**
     * Number of context lines to include in the diff.
     */
    private Integer contextLines;

    

        /**
     * Number of context lines to include in the diff.
     */
    public Integer getContextLines() {
        return contextLines;
    }
        /**
     * Maximum number of bytes of diff output to return.
     */
    private Integer maxPatchBytes;

    

        /**
     * Maximum number of bytes of diff output to return.
     */
    public Integer getMaxPatchBytes() {
        return maxPatchBytes;
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
    

    public static class Builder implements com.oracle.bmc.requests.BmcRequest.Builder<GetAiDataPlatformGitDiffDetailRequest, java.lang.Void> {
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
     * The git repository key
     */
        private String gitRepositoryKey = null;

        /**
         * The git repository key
         * @param gitRepositoryKey the value to set
         * @return this builder instance
         */
        public Builder gitRepositoryKey(String gitRepositoryKey) {
            this.gitRepositoryKey = gitRepositoryKey;
            return this;
        }

            /**
     * The git folder path
     */
        private String gitFolderPath = null;

        /**
         * The git folder path
         * @param gitFolderPath the value to set
         * @return this builder instance
         */
        public Builder gitFolderPath(String gitFolderPath) {
            this.gitFolderPath = gitFolderPath;
            return this;
        }

            /**
     * Expected branch name for the folder context.
     */
        private String branchName = null;

        /**
         * Expected branch name for the folder context.
         * @param branchName the value to set
         * @return this builder instance
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

            /**
     * File path relative to repository root.
     */
        private String gitFilePath = null;

        /**
         * File path relative to repository root.
         * @param gitFilePath the value to set
         * @return this builder instance
         */
        public Builder gitFilePath(String gitFilePath) {
            this.gitFilePath = gitFilePath;
            return this;
        }

            /**
     * Number of context lines to include in the diff.
     */
        private Integer contextLines = null;

        /**
         * Number of context lines to include in the diff.
         * @param contextLines the value to set
         * @return this builder instance
         */
        public Builder contextLines(Integer contextLines) {
            this.contextLines = contextLines;
            return this;
        }

            /**
     * Maximum number of bytes of diff output to return.
     */
        private Integer maxPatchBytes = null;

        /**
         * Maximum number of bytes of diff output to return.
         * @param maxPatchBytes the value to set
         * @return this builder instance
         */
        public Builder maxPatchBytes(Integer maxPatchBytes) {
            this.maxPatchBytes = maxPatchBytes;
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
        public Builder copy(GetAiDataPlatformGitDiffDetailRequest o) {
            aiDataPlatformId(o.getAiDataPlatformId());workspaceKey(o.getWorkspaceKey());gitRepositoryKey(o.getGitRepositoryKey());gitFolderPath(o.getGitFolderPath());branchName(o.getBranchName());gitFilePath(o.getGitFilePath());contextLines(o.getContextLines());maxPatchBytes(o.getMaxPatchBytes());opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAiDataPlatformGitDiffDetailRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAiDataPlatformGitDiffDetailRequest
         */
        public GetAiDataPlatformGitDiffDetailRequest build() {
            GetAiDataPlatformGitDiffDetailRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAiDataPlatformGitDiffDetailRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAiDataPlatformGitDiffDetailRequest
         */
        public GetAiDataPlatformGitDiffDetailRequest buildWithoutInvocationCallback() {
            GetAiDataPlatformGitDiffDetailRequest request = new GetAiDataPlatformGitDiffDetailRequest();
            request.aiDataPlatformId = aiDataPlatformId;
            request.workspaceKey = workspaceKey;
            request.gitRepositoryKey = gitRepositoryKey;
            request.gitFolderPath = gitFolderPath;
            request.branchName = branchName;
            request.gitFilePath = gitFilePath;
            request.contextLines = contextLines;
            request.maxPatchBytes = maxPatchBytes;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAiDataPlatformGitDiffDetailRequest(aiDataPlatformId, workspaceKey, gitRepositoryKey, gitFolderPath, branchName, gitFilePath, contextLines, maxPatchBytes, opcRequestId);
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
            .gitRepositoryKey(gitRepositoryKey)
            .gitFolderPath(gitFolderPath)
            .branchName(branchName)
            .gitFilePath(gitFilePath)
            .contextLines(contextLines)
            .maxPatchBytes(maxPatchBytes)
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
        sb.append(",gitRepositoryKey=").append(String.valueOf(this.gitRepositoryKey));
        sb.append(",gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(",branchName=").append(String.valueOf(this.branchName));
        sb.append(",gitFilePath=").append(String.valueOf(this.gitFilePath));
        sb.append(",contextLines=").append(String.valueOf(this.contextLines));
        sb.append(",maxPatchBytes=").append(String.valueOf(this.maxPatchBytes));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAiDataPlatformGitDiffDetailRequest)) {
            return false;
        }

        GetAiDataPlatformGitDiffDetailRequest other = (GetAiDataPlatformGitDiffDetailRequest) o;
        return super.equals(o)
            && java.util.Objects.equals(this.aiDataPlatformId, other.aiDataPlatformId)
            && java.util.Objects.equals(this.workspaceKey, other.workspaceKey)
            && java.util.Objects.equals(this.gitRepositoryKey, other.gitRepositoryKey)
            && java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath)
            && java.util.Objects.equals(this.branchName, other.branchName)
            && java.util.Objects.equals(this.gitFilePath, other.gitFilePath)
            && java.util.Objects.equals(this.contextLines, other.contextLines)
            && java.util.Objects.equals(this.maxPatchBytes, other.maxPatchBytes)
            && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.aiDataPlatformId == null ? 43 : this.aiDataPlatformId.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.gitRepositoryKey == null ? 43 : this.gitRepositoryKey.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.gitFilePath == null ? 43 : this.gitFilePath.hashCode());
        result = (result * PRIME) + (this.contextLines == null ? 43 : this.contextLines.hashCode());
        result = (result * PRIME) + (this.maxPatchBytes == null ? 43 : this.maxPatchBytes.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}