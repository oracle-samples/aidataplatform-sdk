// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The data to create a Git folder in a workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateGitFolderDetails.Builder.class)

public final class CreateGitFolderDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"folderPath", "gitProviderKey", "gitRepositoryUrl", "branchName", "credentialKey", "description"})
    public CreateGitFolderDetails(String folderPath, String gitProviderKey, String gitRepositoryUrl, String branchName, String credentialKey, String description) {
        super();
        this.folderPath = folderPath;
        this.gitProviderKey = gitProviderKey;
        this.gitRepositoryUrl = gitRepositoryUrl;
        this.branchName = branchName;
        this.credentialKey = credentialKey;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The absolute path of the Git folder user wants to create.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("folderPath")
private String folderPath;

        /**
         * The absolute path of the Git folder user wants to create.
         * @param folderPath the value to set
         * @return this builder
         **/
        

public Builder folderPath(String folderPath) {
    this.folderPath = folderPath;
    return this;
}
            /**
     * key corresponding to Git service provider in git provider table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitProviderKey")
private String gitProviderKey;

        /**
         * key corresponding to Git service provider in git provider table.
         * @param gitProviderKey the value to set
         * @return this builder
         **/
        

public Builder gitProviderKey(String gitProviderKey) {
    this.gitProviderKey = gitProviderKey;
    return this;
}
            /**
     * Git repository url used to clone.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitRepositoryUrl")
private String gitRepositoryUrl;

        /**
         * Git repository url used to clone.
         * @param gitRepositoryUrl the value to set
         * @return this builder
         **/
        

public Builder gitRepositoryUrl(String gitRepositoryUrl) {
    this.gitRepositoryUrl = gitRepositoryUrl;
    return this;
}
            /**
     * Git branch name that is cloned.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("branchName")
private String branchName;

        /**
         * Git branch name that is cloned.
         * @param branchName the value to set
         * @return this builder
         **/
        

public Builder branchName(String branchName) {
    this.branchName = branchName;
    return this;
}
            /**
     * Credential key of the stored git credentials.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
private String credentialKey;

        /**
         * Credential key of the stored git credentials.
         * @param credentialKey the value to set
         * @return this builder
         **/
        

public Builder credentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
    return this;
}
            /**
     * Short description about the git repository.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Short description about the git repository.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}


        public CreateGitFolderDetails build() {
            CreateGitFolderDetails model = new CreateGitFolderDetails(this.folderPath
                , this.gitProviderKey
                , this.gitRepositoryUrl
                , this.branchName
                , this.credentialKey
                , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGitFolderDetails model) {
                this.folderPath(model.getFolderPath());
    this.gitProviderKey(model.getGitProviderKey());
    this.gitRepositoryUrl(model.getGitRepositoryUrl());
    this.branchName(model.getBranchName());
    this.credentialKey(model.getCredentialKey());
    this.description(model.getDescription());
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
     * The absolute path of the Git folder user wants to create.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("folderPath")
    private final String folderPath;

        /**
     * The absolute path of the Git folder user wants to create.
     * @return the value
     **/
    
    public String getFolderPath() {
        return folderPath;
    }


        /**
     * key corresponding to Git service provider in git provider table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitProviderKey")
    private final String gitProviderKey;

        /**
     * key corresponding to Git service provider in git provider table.
     * @return the value
     **/
    
    public String getGitProviderKey() {
        return gitProviderKey;
    }


        /**
     * Git repository url used to clone.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepositoryUrl")
    private final String gitRepositoryUrl;

        /**
     * Git repository url used to clone.
     * @return the value
     **/
    
    public String getGitRepositoryUrl() {
        return gitRepositoryUrl;
    }


        /**
     * Git branch name that is cloned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * Git branch name that is cloned.
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * Credential key of the stored git credentials.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * Credential key of the stored git credentials.
     * @return the value
     **/
    
    public String getCredentialKey() {
        return credentialKey;
    }


        /**
     * Short description about the git repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description about the git repository.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("CreateGitFolderDetails(");
        sb.append("folderPath=").append(String.valueOf(this.folderPath));
        sb.append(", gitProviderKey=").append(String.valueOf(this.gitProviderKey));
        sb.append(", gitRepositoryUrl=").append(String.valueOf(this.gitRepositoryUrl));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGitFolderDetails)) {
            return false;
        }

        CreateGitFolderDetails other = (CreateGitFolderDetails) o;
        return java.util.Objects.equals(this.folderPath, other.folderPath) &&
            java.util.Objects.equals(this.gitProviderKey, other.gitProviderKey) &&
            java.util.Objects.equals(this.gitRepositoryUrl, other.gitRepositoryUrl) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.credentialKey, other.credentialKey) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.folderPath == null ? 43 : this.folderPath.hashCode());
        result = (result * PRIME) + (this.gitProviderKey == null ? 43 : this.gitProviderKey.hashCode());
        result = (result * PRIME) + (this.gitRepositoryUrl == null ? 43 : this.gitRepositoryUrl.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
