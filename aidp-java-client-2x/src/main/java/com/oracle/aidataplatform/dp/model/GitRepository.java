package com.oracle.aidataplatform.dp.model;


/**
 * Details about a git repository
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitRepository.Builder.class)

public final class GitRepository  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "workspaceKey", "branchName", "gitUrl", "gitFolderPath", "credentialKey"})
    public GitRepository(String key, String workspaceKey, String branchName, String gitUrl, String gitFolderPath, String credentialKey) {
        super();
        this.key = key;
        this.workspaceKey = workspaceKey;
        this.branchName = branchName;
        this.gitUrl = gitUrl;
        this.gitFolderPath = gitFolderPath;
        this.credentialKey = credentialKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Unique key associated with repository
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * Unique key associated with repository
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * The workspaceKey associated with the git repository
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
        private String workspaceKey;

                /**
         * The workspaceKey associated with the git repository
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

        public Builder workspaceKey(String workspaceKey) {
        this.workspaceKey = workspaceKey;
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
     * The git repository url corresponding to the branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
        private String gitUrl;

                /**
         * The git repository url corresponding to the branch
         * @param gitUrl the value to set
         * @return this builder
         **/
        

        public Builder gitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
        }
            /**
     * The path of the current git folder which has to be created for the new branch
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
        private String gitFolderPath;

                /**
         * The path of the current git folder which has to be created for the new branch
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

        public Builder gitFolderPath(String gitFolderPath) {
        this.gitFolderPath = gitFolderPath;
        return this;
        }
            /**
     * The credential setting key
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
        private String credentialKey;

                /**
         * The credential setting key
         * @param credentialKey the value to set
         * @return this builder
         **/
        

        public Builder credentialKey(String credentialKey) {
        this.credentialKey = credentialKey;
        return this;
        }


        public GitRepository build() {
            GitRepository model = new GitRepository(this.key
                    , this.workspaceKey
                    , this.branchName
                    , this.gitUrl
                    , this.gitFolderPath
                    , this.credentialKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitRepository model) {
                this.key(model.getKey());
    this.workspaceKey(model.getWorkspaceKey());
    this.branchName(model.getBranchName());
    this.gitUrl(model.getGitUrl());
    this.gitFolderPath(model.getGitFolderPath());
    this.credentialKey(model.getCredentialKey());
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
     * Unique key associated with repository
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique key associated with repository
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The workspaceKey associated with the git repository
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The workspaceKey associated with the git repository
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
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
     * The git repository url corresponding to the branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
    private final String gitUrl;

        /**
     * The git repository url corresponding to the branch
     * @return the value
     **/
    
    public String getGitUrl() {
        return gitUrl;
    }


        /**
     * The path of the current git folder which has to be created for the new branch
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * The path of the current git folder which has to be created for the new branch
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * The credential setting key
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * The credential setting key
     * @return the value
     **/
    
    public String getCredentialKey() {
        return credentialKey;
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
        sb.append("GitRepository(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitRepository)) {
            return false;
        }

        GitRepository other = (GitRepository) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.gitUrl, other.gitUrl) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.credentialKey, other.credentialKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        return result;
    }


}
