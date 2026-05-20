// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information required to create a new Git branch.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateGitBranchDetails.Builder.class)

public final class CreateGitBranchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitBranchName", "gitFolderPath"})
    public CreateGitBranchDetails(String gitBranchName, String gitFolderPath) {
        super();
        this.gitBranchName = gitBranchName;
        this.gitFolderPath = gitFolderPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The name of the Git branch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
private String gitBranchName;

        /**
         * The name of the Git branch.
         * @param gitBranchName the value to set
         * @return this builder
         **/
        

public Builder gitBranchName(String gitBranchName) {
    this.gitBranchName = gitBranchName;
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


        public CreateGitBranchDetails build() {
            CreateGitBranchDetails model = new CreateGitBranchDetails(this.gitBranchName
                , this.gitFolderPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGitBranchDetails model) {
                this.gitBranchName(model.getGitBranchName());
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
     * The name of the Git branch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitBranchName")
    private final String gitBranchName;

        /**
     * The name of the Git branch.
     * @return the value
     **/
    
    public String getGitBranchName() {
        return gitBranchName;
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
        sb.append("CreateGitBranchDetails(");
        sb.append("gitBranchName=").append(String.valueOf(this.gitBranchName));
        sb.append(", gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGitBranchDetails)) {
            return false;
        }

        CreateGitBranchDetails other = (CreateGitBranchDetails) o;
        return java.util.Objects.equals(this.gitBranchName, other.gitBranchName) &&
            java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitBranchName == null ? 43 : this.gitBranchName.hashCode());
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        return result;
    }


}
