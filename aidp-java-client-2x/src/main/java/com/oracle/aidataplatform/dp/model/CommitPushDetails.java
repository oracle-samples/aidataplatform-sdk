// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Commit staged/local changes and push to remote for the given branch context.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CommitPushDetails.Builder.class)

public final class CommitPushDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "files", "commitMessage", "commitDescription"})
    public CommitPushDetails(String gitFolderPath, String branchName, java.util.List<String> files, String commitMessage, String commitDescription) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.files = files;
        this.commitMessage = commitMessage;
        this.commitDescription = commitDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Folder path used to locate the Git worktree.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
        private String gitFolderPath;

                /**
         * Folder path used to locate the Git worktree.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

        public Builder gitFolderPath(String gitFolderPath) {
        this.gitFolderPath = gitFolderPath;
        return this;
        }
            /**
     * The name of the Git branch.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

                /**
         * The name of the Git branch.
         * @param branchName the value to set
         * @return this builder
         **/
        

        public Builder branchName(String branchName) {
        this.branchName = branchName;
        return this;
        }
            /**
     * List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("files")
        private java.util.List<String> files;

                /**
         * List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.
         * @param files the value to set
         * @return this builder
         **/
        

        public Builder files(java.util.List<String> files) {
        this.files = files;
        return this;
        }
            /**
     * Commit message.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
        private String commitMessage;

                /**
         * Commit message.
         * @param commitMessage the value to set
         * @return this builder
         **/
        

        public Builder commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
        }
            /**
     * Commit description.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("commitDescription")
        private String commitDescription;

                /**
         * Commit description.
         * @param commitDescription the value to set
         * @return this builder
         **/
        

        public Builder commitDescription(String commitDescription) {
        this.commitDescription = commitDescription;
        return this;
        }


        public CommitPushDetails build() {
            CommitPushDetails model = new CommitPushDetails(this.gitFolderPath
                    , this.branchName
                    , this.files
                    , this.commitMessage
                    , this.commitDescription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitPushDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.branchName(model.getBranchName());
    this.files(model.getFiles());
    this.commitMessage(model.getCommitMessage());
    this.commitDescription(model.getCommitDescription());
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
     * Folder path used to locate the Git worktree.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Folder path used to locate the Git worktree.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * The name of the Git branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * The name of the Git branch.
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    private final java.util.List<String> files;

        /**
     * List of file paths (repo-relative) to stage before commit. If omitted, server may commit already-staged changes only.
     * @return the value
     **/
    
    public java.util.List<String> getFiles() {
        return files;
    }


        /**
     * Commit message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    private final String commitMessage;

        /**
     * Commit message.
     * @return the value
     **/
    
    public String getCommitMessage() {
        return commitMessage;
    }


        /**
     * Commit description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitDescription")
    private final String commitDescription;

        /**
     * Commit description.
     * @return the value
     **/
    
    public String getCommitDescription() {
        return commitDescription;
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
        sb.append("CommitPushDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", files=").append(String.valueOf(this.files));
        sb.append(", commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(", commitDescription=").append(String.valueOf(this.commitDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitPushDetails)) {
            return false;
        }

        CommitPushDetails other = (CommitPushDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.files, other.files) &&
            java.util.Objects.equals(this.commitMessage, other.commitMessage) &&
            java.util.Objects.equals(this.commitDescription, other.commitDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.files == null ? 43 : this.files.hashCode());
        result = (result * PRIME) + (this.commitMessage == null ? 43 : this.commitMessage.hashCode());
        result = (result * PRIME) + (this.commitDescription == null ? 43 : this.commitDescription.hashCode());
        return result;
    }


}
