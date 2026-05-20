// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details about a Git repository.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitFolderMetadatum.Builder.class)

public final class GitFolderMetadatum  {
    @Deprecated
    @java.beans.ConstructorProperties({"repoKey", "isAssociated"})
    public GitFolderMetadatum(String repoKey, Boolean isAssociated) {
        super();
        this.repoKey = repoKey;
        this.isAssociated = isAssociated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Unique repo key if folder/file path is associated with a Git folder.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("repoKey")
        private String repoKey;

                /**
         * Unique repo key if folder/file path is associated with a Git folder.
         * @param repoKey the value to set
         * @return this builder
         **/
        

        public Builder repoKey(String repoKey) {
        this.repoKey = repoKey;
        return this;
        }
            /**
     * If the passed folder/file path is associated with a Git folder. (Active/Inactive)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isAssociated")
        private Boolean isAssociated;

                /**
         * If the passed folder/file path is associated with a Git folder. (Active/Inactive)
         * @param isAssociated the value to set
         * @return this builder
         **/
        

        public Builder isAssociated(Boolean isAssociated) {
        this.isAssociated = isAssociated;
        return this;
        }


        public GitFolderMetadatum build() {
            GitFolderMetadatum model = new GitFolderMetadatum(this.repoKey
                    , this.isAssociated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitFolderMetadatum model) {
                this.repoKey(model.getRepoKey());
    this.isAssociated(model.getIsAssociated());
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
     * Unique repo key if folder/file path is associated with a Git folder.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repoKey")
    private final String repoKey;

        /**
     * Unique repo key if folder/file path is associated with a Git folder.
     * @return the value
     **/
    
    public String getRepoKey() {
        return repoKey;
    }


        /**
     * If the passed folder/file path is associated with a Git folder. (Active/Inactive)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAssociated")
    private final Boolean isAssociated;

        /**
     * If the passed folder/file path is associated with a Git folder. (Active/Inactive)
     * @return the value
     **/
    
    public Boolean getIsAssociated() {
        return isAssociated;
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
        sb.append("GitFolderMetadatum(");
        sb.append("repoKey=").append(String.valueOf(this.repoKey));
        sb.append(", isAssociated=").append(String.valueOf(this.isAssociated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitFolderMetadatum)) {
            return false;
        }

        GitFolderMetadatum other = (GitFolderMetadatum) o;
        return java.util.Objects.equals(this.repoKey, other.repoKey) &&
            java.util.Objects.equals(this.isAssociated, other.isAssociated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.repoKey == null ? 43 : this.repoKey.hashCode());
        result = (result * PRIME) + (this.isAssociated == null ? 43 : this.isAssociated.hashCode());
        return result;
    }


}
