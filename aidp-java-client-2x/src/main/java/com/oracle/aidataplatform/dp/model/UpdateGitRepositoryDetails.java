// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Update a git repository with the provided details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateGitRepositoryDetails.Builder.class)

public final class UpdateGitRepositoryDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "gitUrl", "credentialKey"})
    public UpdateGitRepositoryDetails(String gitFolderPath, String gitUrl, String credentialKey) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.gitUrl = gitUrl;
        this.credentialKey = credentialKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * updated PAT credential key
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
        private String credentialKey;

                /**
         * updated PAT credential key
         * @param credentialKey the value to set
         * @return this builder
         **/
        

        public Builder credentialKey(String credentialKey) {
        this.credentialKey = credentialKey;
        return this;
        }


        public UpdateGitRepositoryDetails build() {
            UpdateGitRepositoryDetails model = new UpdateGitRepositoryDetails(this.gitFolderPath
                    , this.gitUrl
                    , this.credentialKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateGitRepositoryDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.gitUrl(model.getGitUrl());
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
     * updated PAT credential key
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialKey")
    private final String credentialKey;

        /**
     * updated PAT credential key
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
        sb.append("UpdateGitRepositoryDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", gitUrl=").append(String.valueOf(this.gitUrl));
        sb.append(", credentialKey=").append(String.valueOf(this.credentialKey));
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
            java.util.Objects.equals(this.credentialKey, other.credentialKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.gitUrl == null ? 43 : this.gitUrl.hashCode());
        result = (result * PRIME) + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        return result;
    }


}
