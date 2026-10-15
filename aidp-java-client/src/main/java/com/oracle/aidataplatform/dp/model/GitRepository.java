// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details about a Git repository.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitRepository.Builder.class)

public final class GitRepository  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "workspaceKey", "branchName", "gitUrl", "gitFolderPath", "credentialKey", "sparseCheckout", "isPrivateConnectivityEnabled", "gitConnectivityProfileKey", "gitConnectivityProfileName", "credentialStoreKey", "credentialStoreName"})
    public GitRepository(String key, String workspaceKey, String branchName, String gitUrl, String gitFolderPath, String credentialKey, SparseCheckoutDetails sparseCheckout, Boolean isPrivateConnectivityEnabled, String gitConnectivityProfileKey, String gitConnectivityProfileName, String credentialStoreKey, String credentialStoreName) {
        super();
        this.key = key;
        this.workspaceKey = workspaceKey;
        this.branchName = branchName;
        this.gitUrl = gitUrl;
        this.gitFolderPath = gitFolderPath;
        this.credentialKey = credentialKey;
        this.sparseCheckout = sparseCheckout;
        this.isPrivateConnectivityEnabled = isPrivateConnectivityEnabled;
        this.gitConnectivityProfileKey = gitConnectivityProfileKey;
        this.gitConnectivityProfileName = gitConnectivityProfileName;
        this.credentialStoreKey = credentialStoreKey;
        this.credentialStoreName = credentialStoreName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique key associated with repository.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique key associated with repository.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * The workspaceKey associated with the Git repository.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * The workspaceKey associated with the Git repository.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
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
     * The Git repository url corresponding to the branch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
private String gitUrl;

        /**
         * The Git repository url corresponding to the branch.
         * @param gitUrl the value to set
         * @return this builder
         **/
        

public Builder gitUrl(String gitUrl) {
    this.gitUrl = gitUrl;
    return this;
}
            /**
     * The path of the current Git folder which has to be created for the new branch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * The path of the current Git folder which has to be created for the new branch.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
}
            /**
     * Key of the current user's GIT_ACCOUNT user setting containing Git authentication
* credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
* setting listings. Distinct from credentialStoreKey, which references a TLS
* CA certificate.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
private String credentialKey;

        /**
         * Key of the current user's GIT_ACCOUNT user setting containing Git authentication
* credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
* setting listings. Distinct from credentialStoreKey, which references a TLS
* CA certificate.
* 
         * @param credentialKey the value to set
         * @return this builder
         **/
        

public Builder credentialKey(String credentialKey) {
    this.credentialKey = credentialKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sparseCheckout")
private SparseCheckoutDetails sparseCheckout;



public Builder sparseCheckout(SparseCheckoutDetails sparseCheckout) {
    this.sparseCheckout = sparseCheckout;
    return this;
}
            /**
     * Whether this repository uses private network connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPrivateConnectivityEnabled")
private Boolean isPrivateConnectivityEnabled;

        /**
         * Whether this repository uses private network connectivity.
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
     * User-friendly name of the private Git connectivity profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitConnectivityProfileName")
private String gitConnectivityProfileName;

        /**
         * User-friendly name of the private Git connectivity profile.
         * @param gitConnectivityProfileName the value to set
         * @return this builder
         **/
        

public Builder gitConnectivityProfileName(String gitConnectivityProfileName) {
    this.gitConnectivityProfileName = gitConnectivityProfileName;
    return this;
}
            /**
     * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialStoreKey")
private String credentialStoreKey;

        /**
         * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
         * @param credentialStoreKey the value to set
         * @return this builder
         **/
        

public Builder credentialStoreKey(String credentialStoreKey) {
    this.credentialStoreKey = credentialStoreKey;
    return this;
}
            /**
     * User-friendly display name of the repository TLS CA certificate credential.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialStoreName")
private String credentialStoreName;

        /**
         * User-friendly display name of the repository TLS CA certificate credential.
         * @param credentialStoreName the value to set
         * @return this builder
         **/
        

public Builder credentialStoreName(String credentialStoreName) {
    this.credentialStoreName = credentialStoreName;
    return this;
}


        public GitRepository build() {
            GitRepository model = new GitRepository(this.key
                , this.workspaceKey
                , this.branchName
                , this.gitUrl
                , this.gitFolderPath
                , this.credentialKey
                , this.sparseCheckout
                , this.isPrivateConnectivityEnabled
                , this.gitConnectivityProfileKey
                , this.gitConnectivityProfileName
                , this.credentialStoreKey
                , this.credentialStoreName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitRepository model) {
                this.key(model.getKey());
    this.workspaceKey(model.getWorkspaceKey());
    this.branchName(model.getBranchName());
    this.gitUrl(model.getGitUrl());
    this.gitFolderPath(model.getGitFolderPath());
    this.credentialKey(model.getCredentialKey());
    this.sparseCheckout(model.getSparseCheckout());
    this.isPrivateConnectivityEnabled(model.getIsPrivateConnectivityEnabled());
    this.gitConnectivityProfileKey(model.getGitConnectivityProfileKey());
    this.gitConnectivityProfileName(model.getGitConnectivityProfileName());
    this.credentialStoreKey(model.getCredentialStoreKey());
    this.credentialStoreName(model.getCredentialStoreName());
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
     * Unique key associated with repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique key associated with repository.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The workspaceKey associated with the Git repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The workspaceKey associated with the Git repository.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
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
     * The Git repository url corresponding to the branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitUrl")
    private final String gitUrl;

        /**
     * The Git repository url corresponding to the branch.
     * @return the value
     **/
    
    public String getGitUrl() {
        return gitUrl;
    }


        /**
     * The path of the current Git folder which has to be created for the new branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * The path of the current Git folder which has to be created for the new branch.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * Key of the current user's GIT_ACCOUNT user setting containing Git authentication
* credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
* setting listings. Distinct from credentialStoreKey, which references a TLS
* CA certificate.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * Key of the current user's GIT_ACCOUNT user setting containing Git authentication
* credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
* setting listings. Distinct from credentialStoreKey, which references a TLS
* CA certificate.
* 
     * @return the value
     **/
    
    public String getCredentialKey() {
        return credentialKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sparseCheckout")
    private final SparseCheckoutDetails sparseCheckout;

    
    public SparseCheckoutDetails getSparseCheckout() {
        return sparseCheckout;
    }


        /**
     * Whether this repository uses private network connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateConnectivityEnabled")
    private final Boolean isPrivateConnectivityEnabled;

        /**
     * Whether this repository uses private network connectivity.
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
     * User-friendly name of the private Git connectivity profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitConnectivityProfileName")
    private final String gitConnectivityProfileName;

        /**
     * User-friendly name of the private Git connectivity profile.
     * @return the value
     **/
    
    public String getGitConnectivityProfileName() {
        return gitConnectivityProfileName;
    }


        /**
     * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialStoreKey")
    private final String credentialStoreKey;

        /**
     * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
     * @return the value
     **/
    
    public String getCredentialStoreKey() {
        return credentialStoreKey;
    }


        /**
     * User-friendly display name of the repository TLS CA certificate credential.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialStoreName")
    private final String credentialStoreName;

        /**
     * User-friendly display name of the repository TLS CA certificate credential.
     * @return the value
     **/
    
    public String getCredentialStoreName() {
        return credentialStoreName;
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
        sb.append(", sparseCheckout=").append(String.valueOf(this.sparseCheckout));
        sb.append(", isPrivateConnectivityEnabled=").append(String.valueOf(this.isPrivateConnectivityEnabled));
        sb.append(", gitConnectivityProfileKey=").append(String.valueOf(this.gitConnectivityProfileKey));
        sb.append(", gitConnectivityProfileName=").append(String.valueOf(this.gitConnectivityProfileName));
        sb.append(", credentialStoreKey=").append(String.valueOf(this.credentialStoreKey));
        sb.append(", credentialStoreName=").append(String.valueOf(this.credentialStoreName));
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
            java.util.Objects.equals(this.credentialKey, other.credentialKey) &&
            java.util.Objects.equals(this.sparseCheckout, other.sparseCheckout) &&
            java.util.Objects.equals(this.isPrivateConnectivityEnabled, other.isPrivateConnectivityEnabled) &&
            java.util.Objects.equals(this.gitConnectivityProfileKey, other.gitConnectivityProfileKey) &&
            java.util.Objects.equals(this.gitConnectivityProfileName, other.gitConnectivityProfileName) &&
            java.util.Objects.equals(this.credentialStoreKey, other.credentialStoreKey) &&
            java.util.Objects.equals(this.credentialStoreName, other.credentialStoreName);
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
        result = (result * PRIME) + (this.sparseCheckout == null ? 43 : this.sparseCheckout.hashCode());
        result = (result * PRIME) + (this.isPrivateConnectivityEnabled == null ? 43 : this.isPrivateConnectivityEnabled.hashCode());
        result = (result * PRIME) + (this.gitConnectivityProfileKey == null ? 43 : this.gitConnectivityProfileKey.hashCode());
        result = (result * PRIME) + (this.gitConnectivityProfileName == null ? 43 : this.gitConnectivityProfileName.hashCode());
        result = (result * PRIME) + (this.credentialStoreKey == null ? 43 : this.credentialStoreKey.hashCode());
        result = (result * PRIME) + (this.credentialStoreName == null ? 43 : this.credentialStoreName.hashCode());
        return result;
    }


}
