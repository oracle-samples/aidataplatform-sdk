// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details needed to restore/discard local changes for a folder context.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitRestoreBranchDetails.Builder.class)

public final class GitRestoreBranchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "restoreFilesList"})
    public GitRestoreBranchDetails(String gitFolderPath, String branchName, java.util.List<String> restoreFilesList) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.restoreFilesList = restoreFilesList;
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
     * List of files whose local/staged changes you want to discard (repo-relative paths).
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("restoreFilesList")
        private java.util.List<String> restoreFilesList;

                /**
         * List of files whose local/staged changes you want to discard (repo-relative paths).
         * @param restoreFilesList the value to set
         * @return this builder
         **/
        

        public Builder restoreFilesList(java.util.List<String> restoreFilesList) {
        this.restoreFilesList = restoreFilesList;
        return this;
        }


        public GitRestoreBranchDetails build() {
            GitRestoreBranchDetails model = new GitRestoreBranchDetails(this.gitFolderPath
                    , this.branchName
                    , this.restoreFilesList);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitRestoreBranchDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.branchName(model.getBranchName());
    this.restoreFilesList(model.getRestoreFilesList());
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
     * List of files whose local/staged changes you want to discard (repo-relative paths).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("restoreFilesList")
    private final java.util.List<String> restoreFilesList;

        /**
     * List of files whose local/staged changes you want to discard (repo-relative paths).
     * @return the value
     **/
    
    public java.util.List<String> getRestoreFilesList() {
        return restoreFilesList;
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
        sb.append("GitRestoreBranchDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", restoreFilesList=").append(String.valueOf(this.restoreFilesList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitRestoreBranchDetails)) {
            return false;
        }

        GitRestoreBranchDetails other = (GitRestoreBranchDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.restoreFilesList, other.restoreFilesList);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.restoreFilesList == null ? 43 : this.restoreFilesList.hashCode());
        return result;
    }


}
