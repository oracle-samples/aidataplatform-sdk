// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Remote branch and optional context for a Git rebase request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitRebaseDetails.Builder.class)

public final class GitRebaseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "remoteBranchName", "commitId"})
    public GitRebaseDetails(String gitFolderPath, String branchName, String remoteBranchName, String commitId) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.remoteBranchName = remoteBranchName;
        this.commitId = commitId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
}
            /**
     * Requested branch name. The branch being rebased is the stored repository
* branch; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("branchName")
private String branchName;

        /**
         * Requested branch name. The branch being rebased is the stored repository
* branch; the supplied value does not override it.
* 
         * @param branchName the value to set
         * @return this builder
         **/
        

public Builder branchName(String branchName) {
    this.branchName = branchName;
    return this;
}
            /**
     * Required remote branch whose origin reference is the rebase target.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
private String remoteBranchName;

        /**
         * Required remote branch whose origin reference is the rebase target.
* 
         * @param remoteBranchName the value to set
         * @return this builder
         **/
        

public Builder remoteBranchName(String remoteBranchName) {
    this.remoteBranchName = remoteBranchName;
    return this;
}
            /**
     * Requested target commit identifier. The rebase target is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("commitId")
private String commitId;

        /**
         * Requested target commit identifier. The rebase target is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
         * @param commitId the value to set
         * @return this builder
         **/
        

public Builder commitId(String commitId) {
    this.commitId = commitId;
    return this;
}


        public GitRebaseDetails build() {
            GitRebaseDetails model = new GitRebaseDetails(this.gitFolderPath
                , this.branchName
                , this.remoteBranchName
                , this.commitId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitRebaseDetails model) {
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
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * Requested branch name. The branch being rebased is the stored repository
* branch; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * Requested branch name. The branch being rebased is the stored repository
* branch; the supplied value does not override it.
* 
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * Required remote branch whose origin reference is the rebase target.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
    private final String remoteBranchName;

        /**
     * Required remote branch whose origin reference is the rebase target.
* 
     * @return the value
     **/
    
    public String getRemoteBranchName() {
        return remoteBranchName;
    }


        /**
     * Requested target commit identifier. The rebase target is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

        /**
     * Requested target commit identifier. The rebase target is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
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
        sb.append("GitRebaseDetails(");
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
        if (!(o instanceof GitRebaseDetails)) {
            return false;
        }

        GitRebaseDetails other = (GitRebaseDetails) o;
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
