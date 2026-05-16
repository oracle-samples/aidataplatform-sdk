// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details needed to merge into the current branch for a folder context.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitMergeDetails.Builder.class)

public final class GitMergeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "remoteBranchName", "commitId"})
    public GitMergeDetails(String gitFolderPath, String branchName, String remoteBranchName, String commitId) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.remoteBranchName = remoteBranchName;
        this.commitId = commitId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Folder path used to locate the git worktree.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
        private String gitFolderPath;

                /**
         * Folder path used to locate the git worktree.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

        public Builder gitFolderPath(String gitFolderPath) {
        this.gitFolderPath = gitFolderPath;
        return this;
        }
            /**
     * The name of the git branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

                /**
         * The name of the git branch
         * @param branchName the value to set
         * @return this builder
         **/
        

        public Builder branchName(String branchName) {
        this.branchName = branchName;
        return this;
        }
            /**
     * Remote branch name, if you want to merge a different branch.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
        private String remoteBranchName;

                /**
         * Remote branch name, if you want to merge a different branch.
         * @param remoteBranchName the value to set
         * @return this builder
         **/
        

        public Builder remoteBranchName(String remoteBranchName) {
        this.remoteBranchName = remoteBranchName;
        return this;
        }
            /**
     * Commit id to merge (optional).
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

                /**
         * Commit id to merge (optional).
         * @param commitId the value to set
         * @return this builder
         **/
        

        public Builder commitId(String commitId) {
        this.commitId = commitId;
        return this;
        }


        public GitMergeDetails build() {
            GitMergeDetails model = new GitMergeDetails(this.gitFolderPath
                    , this.branchName
                    , this.remoteBranchName
                    , this.commitId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitMergeDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.branchName(model.getBranchName());
    this.remoteBranchName(model.getRemoteBranchName());
    this.commitId(model.getCommitId());
return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }


    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    


        /**
     * Folder path used to locate the git worktree.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Folder path used to locate the git worktree.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * The name of the git branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * The name of the git branch
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * Remote branch name, if you want to merge a different branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
    private final String remoteBranchName;

        /**
     * Remote branch name, if you want to merge a different branch.
     * @return the value
     **/
    
    public String getRemoteBranchName() {
        return remoteBranchName;
    }


        /**
     * Commit id to merge (optional).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

        /**
     * Commit id to merge (optional).
     * @return the value
     **/
    
    public String getCommitId() {
        return commitId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GitMergeDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", remoteBranchName=").append(String.valueOf(this.remoteBranchName));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitMergeDetails)) {
            return false;
        }

        GitMergeDetails other = (GitMergeDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.remoteBranchName, other.remoteBranchName) &&
            java.util.Objects.equals(this.commitId, other.commitId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.remoteBranchName == null ? 43 : this.remoteBranchName.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        return result;
    }


}
