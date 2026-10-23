// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Branch name and workspace Git folder path for a checkout request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CheckoutBranchDetails.Builder.class)

public final class CheckoutBranchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"branchName", "gitFolderPath"})
    public CheckoutBranchDetails(String branchName, String gitFolderPath) {
        super();
        this.branchName = branchName;
        this.gitFolderPath = gitFolderPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Branch to check out. This selects the target branch rather than asserting the
* current branch.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("branchName")
private String branchName;

        /**
         * Branch to check out. This selects the target branch rather than asserting the
* current branch.
* 
         * @param branchName the value to set
         * @return this builder
         **/
        

public Builder branchName(String branchName) {
    this.branchName = branchName;
    return this;
}
            /**
     * Workspace path of the Git folder associated with gitRepositoryKey.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Workspace path of the Git folder associated with gitRepositoryKey.
* 
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
}


        public CheckoutBranchDetails build() {
            CheckoutBranchDetails model = new CheckoutBranchDetails(this.branchName
                , this.gitFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CheckoutBranchDetails model) {
                this.branchName(model.getBranchName());
    this.gitFolderPath(model.getGitFolderPath());
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
     * Branch to check out. This selects the target branch rather than asserting the
* current branch.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * Branch to check out. This selects the target branch rather than asserting the
* current branch.
* 
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * Workspace path of the Git folder associated with gitRepositoryKey.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Workspace path of the Git folder associated with gitRepositoryKey.
* 
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
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
        sb.append("CheckoutBranchDetails(");
        sb.append("branchName=").append(String.valueOf(this.branchName));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CheckoutBranchDetails)) {
            return false;
        }

        CheckoutBranchDetails other = (CheckoutBranchDetails) o;
        return java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        return result;
    }


}
