// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A workspace Git folder and its repository, branch, and connectivity settings.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitFolder.Builder.class)

public final class GitFolder  {
    @Deprecated
    @java.beans.ConstructorProperties({"folderPath", "gitProviderKey", "gitRepositoryUrl", "description", "branchName", "isPrivateConnectivityEnabled", "gitConnectivityProfileKey", "credentialStoreKey", "folderMetadata", "sparseCheckout"})
    public GitFolder(String folderPath, String gitProviderKey, String gitRepositoryUrl, String description, String branchName, Boolean isPrivateConnectivityEnabled, String gitConnectivityProfileKey, String credentialStoreKey, java.util.Map<String, Object> folderMetadata, SparseCheckoutDetails sparseCheckout) {
        super();
        this.folderPath = folderPath;
        this.gitProviderKey = gitProviderKey;
        this.gitRepositoryUrl = gitRepositoryUrl;
        this.description = description;
        this.branchName = branchName;
        this.isPrivateConnectivityEnabled = isPrivateConnectivityEnabled;
        this.gitConnectivityProfileKey = gitConnectivityProfileKey;
        this.credentialStoreKey = credentialStoreKey;
        this.folderMetadata = folderMetadata;
        this.sparseCheckout = sparseCheckout;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace-relative path of the Git folder, without a leading slash (for example, {@code sample-repo}). The folder is located at {@code /Workspace/<folderPath>}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("folderPath")
private String folderPath;

        /**
         * Workspace-relative path of the Git folder, without a leading slash (for example, {@code sample-repo}). The folder is located at {@code /Workspace/<folderPath>}.
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
     * Whether this Git folder uses private network connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPrivateConnectivityEnabled")
private Boolean isPrivateConnectivityEnabled;

        /**
         * Whether this Git folder uses private network connectivity.
         * @param isPrivateConnectivityEnabled the value to set
         * @return this builder
         **/
        

public Builder isPrivateConnectivityEnabled(Boolean isPrivateConnectivityEnabled) {
    this.isPrivateConnectivityEnabled = isPrivateConnectivityEnabled;
    return this;
}
            /**
     * Key of the private network profile used for Git connectivity, returned by
* private network profile listings filtered by name. Required when
* isPrivateConnectivityEnabled is true.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitConnectivityProfileKey")
private String gitConnectivityProfileKey;

        /**
         * Key of the private network profile used for Git connectivity, returned by
* private network profile listings filtered by name. Required when
* isPrivateConnectivityEnabled is true.
* 
         * @param gitConnectivityProfileKey the value to set
         * @return this builder
         **/
        

public Builder gitConnectivityProfileKey(String gitConnectivityProfileKey) {
    this.gitConnectivityProfileKey = gitConnectivityProfileKey;
    return this;
}
            /**
     * Key of the credential containing the Git server's TLS CA certificate,
* returned by credential listings filtered by displayName. Required when
* isPrivateConnectivityEnabled is true.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialStoreKey")
private String credentialStoreKey;

        /**
         * Key of the credential containing the Git server's TLS CA certificate,
* returned by credential listings filtered by displayName. Required when
* isPrivateConnectivityEnabled is true.
* 
         * @param credentialStoreKey the value to set
         * @return this builder
         **/
        

public Builder credentialStoreKey(String credentialStoreKey) {
    this.credentialStoreKey = credentialStoreKey;
    return this;
}
            /**
     * The metadata about the folder, like branchName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("folderMetadata")
private java.util.Map<String, Object> folderMetadata;

        /**
         * The metadata about the folder, like branchName.
         * @param folderMetadata the value to set
         * @return this builder
         **/
        

public Builder folderMetadata(java.util.Map<String, Object> folderMetadata) {
    this.folderMetadata = folderMetadata;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sparseCheckout")
private SparseCheckoutDetails sparseCheckout;



public Builder sparseCheckout(SparseCheckoutDetails sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
}


        public GitFolder build() {
            GitFolder model = new GitFolder(this.folderPath
                , this.gitProviderKey
                , this.gitRepositoryUrl
                , this.description
                , this.branchName
                , this.isPrivateConnectivityEnabled
                , this.gitConnectivityProfileKey
                , this.credentialStoreKey
                , this.folderMetadata
                , this.sparseCheckout);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitFolder model) {
                this.folderPath(model.getFolderPath());
    this.gitProviderKey(model.getGitProviderKey());
    this.gitRepositoryUrl(model.getGitRepositoryUrl());
    this.description(model.getDescription());
    this.branchName(model.getBranchName());
    this.isPrivateConnectivityEnabled(model.getIsPrivateConnectivityEnabled());
    this.gitConnectivityProfileKey(model.getGitConnectivityProfileKey());
    this.credentialStoreKey(model.getCredentialStoreKey());
    this.folderMetadata(model.getFolderMetadata());
    this.sparseCheckout(model.getSparseCheckout());
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
     * Workspace-relative path of the Git folder, without a leading slash (for example, {@code sample-repo}). The folder is located at {@code /Workspace/<folderPath>}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("folderPath")
    private final String folderPath;

        /**
     * Workspace-relative path of the Git folder, without a leading slash (for example, {@code sample-repo}). The folder is located at {@code /Workspace/<folderPath>}.
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
     * Whether this Git folder uses private network connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateConnectivityEnabled")
    private final Boolean isPrivateConnectivityEnabled;

        /**
     * Whether this Git folder uses private network connectivity.
     * @return the value
     **/
    
    public Boolean getIsPrivateConnectivityEnabled() {
        return isPrivateConnectivityEnabled;
    }


        /**
     * Key of the private network profile used for Git connectivity, returned by
* private network profile listings filtered by name. Required when
* isPrivateConnectivityEnabled is true.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitConnectivityProfileKey")
    private final String gitConnectivityProfileKey;

        /**
     * Key of the private network profile used for Git connectivity, returned by
* private network profile listings filtered by name. Required when
* isPrivateConnectivityEnabled is true.
* 
     * @return the value
     **/
    
    public String getGitConnectivityProfileKey() {
        return gitConnectivityProfileKey;
    }


        /**
     * Key of the credential containing the Git server's TLS CA certificate,
* returned by credential listings filtered by displayName. Required when
* isPrivateConnectivityEnabled is true.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialStoreKey")
    private final String credentialStoreKey;

        /**
     * Key of the credential containing the Git server's TLS CA certificate,
* returned by credential listings filtered by displayName. Required when
* isPrivateConnectivityEnabled is true.
* 
     * @return the value
     **/
    
    public String getCredentialStoreKey() {
        return credentialStoreKey;
    }


        /**
     * The metadata about the folder, like branchName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("folderMetadata")
    private final java.util.Map<String, Object> folderMetadata;

        /**
     * The metadata about the folder, like branchName.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getFolderMetadata() {
        return folderMetadata;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sparseCheckout")
    private final SparseCheckoutDetails sparseCheckout;

    
    public SparseCheckoutDetails getSparseCheckout() {
        return sparseCheckout;
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
        sb.append("GitFolder(");
        sb.append("folderPath=").append(String.valueOf(this.folderPath));
        sb.append(", gitProviderKey=").append(String.valueOf(this.gitProviderKey));
        sb.append(", gitRepositoryUrl=").append(String.valueOf(this.gitRepositoryUrl));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", isPrivateConnectivityEnabled=").append(String.valueOf(this.isPrivateConnectivityEnabled));
        sb.append(", gitConnectivityProfileKey=").append(String.valueOf(this.gitConnectivityProfileKey));
        sb.append(", credentialStoreKey=").append(String.valueOf(this.credentialStoreKey));
        sb.append(", folderMetadata=").append(String.valueOf(this.folderMetadata));
        sb.append(", sparseCheckout=").append(String.valueOf(this.sparseCheckout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitFolder)) {
            return false;
        }

        GitFolder other = (GitFolder) o;
        return java.util.Objects.equals(this.folderPath, other.folderPath) &&
            java.util.Objects.equals(this.gitProviderKey, other.gitProviderKey) &&
            java.util.Objects.equals(this.gitRepositoryUrl, other.gitRepositoryUrl) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.isPrivateConnectivityEnabled, other.isPrivateConnectivityEnabled) &&
            java.util.Objects.equals(this.gitConnectivityProfileKey, other.gitConnectivityProfileKey) &&
            java.util.Objects.equals(this.credentialStoreKey, other.credentialStoreKey) &&
            java.util.Objects.equals(this.folderMetadata, other.folderMetadata) &&
            java.util.Objects.equals(this.sparseCheckout, other.sparseCheckout);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.folderPath == null ? 43 : this.folderPath.hashCode());
        result = (result * PRIME) + (this.gitProviderKey == null ? 43 : this.gitProviderKey.hashCode());
        result = (result * PRIME) + (this.gitRepositoryUrl == null ? 43 : this.gitRepositoryUrl.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.isPrivateConnectivityEnabled == null ? 43 : this.isPrivateConnectivityEnabled.hashCode());
        result = (result * PRIME) + (this.gitConnectivityProfileKey == null ? 43 : this.gitConnectivityProfileKey.hashCode());
        result = (result * PRIME) + (this.credentialStoreKey == null ? 43 : this.credentialStoreKey.hashCode());
        result = (result * PRIME) + (this.folderMetadata == null ? 43 : this.folderMetadata.hashCode());
        result = (result * PRIME) + (this.sparseCheckout == null ? 43 : this.sparseCheckout.hashCode());
        return result;
    }


}
