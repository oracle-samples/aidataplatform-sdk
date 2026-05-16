// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Git branch object summary
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitBranchSummary.Builder.class)

public final class GitBranchSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"branchName", "branchPath"})
    public GitBranchSummary(String branchName, String branchPath) {
        super();
        this.branchName = branchName;
        this.branchPath = branchPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
     * Fully qualified branch path
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("branchPath")
private String branchPath;

        /**
         * Fully qualified branch path
         * @param branchPath the value to set
         * @return this builder
         **/
        

public Builder branchPath(String branchPath) {
    this.branchPath = branchPath;
    return this;
}


        public GitBranchSummary build() {
            GitBranchSummary model = new GitBranchSummary(this.branchName
                , this.branchPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitBranchSummary model) {
                this.branchName(model.getBranchName());
    this.branchPath(model.getBranchPath());
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
     * Fully qualified branch path
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchPath")
    private final String branchPath;

        /**
     * Fully qualified branch path
     * @return the value
     **/
    
    public String getBranchPath() {
        return branchPath;
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
        sb.append("GitBranchSummary(");
        sb.append("branchName=").append(String.valueOf(this.branchName));
        sb.append(", branchPath=").append(String.valueOf(this.branchPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitBranchSummary)) {
            return false;
        }

        GitBranchSummary other = (GitBranchSummary) o;
        return java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.branchPath, other.branchPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.branchPath == null ? 43 : this.branchPath.hashCode());
        return result;
    }


}
