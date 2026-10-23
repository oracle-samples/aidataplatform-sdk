// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Repository URL, authentication, connectivity, and sparse checkout settings to update.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateGitRepositoryDetails.Builder.class)

public final class UpdateGitRepositoryDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "gitUrl", "credentialKey", "sparseCheckout", "isPrivateConnectivityEnabled", "gitConnectivityProfileKey", "credentialStoreKey"})
    public UpdateGitRepositoryDetails(String gitFolderPath, String gitUrl, String credentialKey, SparseCheckoutDetails sparseCheckout, Boolean isPrivateConnectivityEnabled, String gitConnectivityProfileKey, String credentialStoreKey) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.gitUrl = gitUrl;
        this.credentialKey = credentialKey;
        this.sparseCheckout = sparseCheckout;
        this.isPrivateConnectivityEnabled = isPrivateConnectivityEnabled;
        this.gitConnectivityProfileKey = gitConnectivityProfileKey;
        this.credentialStoreKey = credentialStoreKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace Git folder path. The stored repository path is retained; the supplied
* value does not rename or relocate the folder.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Workspace Git folder path. The stored repository path is retained; the supplied
* value does not rename or relocate the folder.
* 
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
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


        public UpdateGitRepositoryDetails build() {
            UpdateGitRepositoryDetails model = new UpdateGitRepositoryDetails(this.gitFolderPath
                , this.gitUrl
                , this.credentialKey
                , this.sparseCheckout
                , this.isPrivateConnectivityEnabled
                , this.gitConnectivityProfileKey
                , this.credentialStoreKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGitRepositoryDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.gitUrl(model.getGitUrl());
    this.credentialKey(model.getCredentialKey());
    this.sparseCheckout(model.getSparseCheckout());
    this.isPrivateConnectivityEnabled(model.getIsPrivateConnectivityEnabled());
    this.gitConnectivityProfileKey(model.getGitConnectivityProfileKey());
    this.credentialStoreKey(model.getCredentialStoreKey());
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
     * Workspace Git folder path. The stored repository path is retained; the supplied
* value does not rename or relocate the folder.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Workspace Git folder path. The stored repository path is retained; the supplied
* value does not rename or relocate the folder.
* 
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
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
        sb.append("UpdateGitRepositoryDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(", sparseCheckout=").append(String.valueOf(this.sparseCheckout));
        sb.append(", isPrivateConnectivityEnabled=").append(String.valueOf(this.isPrivateConnectivityEnabled));
        sb.append(", gitConnectivityProfileKey=").append(String.valueOf(this.gitConnectivityProfileKey));
        sb.append(", credentialStoreKey=").append(String.valueOf(this.credentialStoreKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGitRepositoryDetails)) {
            return false;
        }

        UpdateGitRepositoryDetails other = (UpdateGitRepositoryDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.gitUrl, other.gitUrl) &&
            java.util.Objects.equals(this.credentialKey, other.credentialKey) &&
            java.util.Objects.equals(this.sparseCheckout, other.sparseCheckout) &&
            java.util.Objects.equals(this.isPrivateConnectivityEnabled, other.isPrivateConnectivityEnabled) &&
            java.util.Objects.equals(this.gitConnectivityProfileKey, other.gitConnectivityProfileKey) &&
            java.util.Objects.equals(this.credentialStoreKey, other.credentialStoreKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result = (result * PRIME) + (this.sparseCheckout == null ? 43 : this.sparseCheckout.hashCode());
        result = (result * PRIME) + (this.isPrivateConnectivityEnabled == null ? 43 : this.isPrivateConnectivityEnabled.hashCode());
        result = (result * PRIME) + (this.gitConnectivityProfileKey == null ? 43 : this.gitConnectivityProfileKey.hashCode());
        result = (result * PRIME) + (this.credentialStoreKey == null ? 43 : this.credentialStoreKey.hashCode());
        return result;
    }


}
