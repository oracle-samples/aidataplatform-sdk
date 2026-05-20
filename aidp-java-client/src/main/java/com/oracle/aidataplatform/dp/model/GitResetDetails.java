// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details needed to reset the current branch for a folder context.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitResetDetails.Builder.class)

public final class GitResetDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "commitId", "resetMode"})
    public GitResetDetails(String gitFolderPath, String branchName, String commitId, ResetMode resetMode) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.commitId = commitId;
        this.resetMode = resetMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Folder path used to locate the Git worktree.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Folder path used to locate the Git worktree.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
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
     * Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("commitId")
private String commitId;

        /**
         * Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.
         * @param commitId the value to set
         * @return this builder
         **/
        

public Builder commitId(String commitId) {
    this.commitId = commitId;
    return this;
}
            /**
     * Reset mode requested.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resetMode")
private ResetMode resetMode;

        /**
         * Reset mode requested.
         * @param resetMode the value to set
         * @return this builder
         **/
        

public Builder resetMode(ResetMode resetMode) {
    this.resetMode = resetMode;
    return this;
}


        public GitResetDetails build() {
            GitResetDetails model = new GitResetDetails(this.gitFolderPath
                , this.branchName
                , this.commitId
                , this.resetMode);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitResetDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.branchName(model.getBranchName());
    this.commitId(model.getCommitId());
    this.resetMode(model.getResetMode());
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
     * Folder path used to locate the Git worktree.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Folder path used to locate the Git worktree.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
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
     * Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

        /**
     * Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.
     * @return the value
     **/
    
    public String getCommitId() {
        return commitId;
    }

    /**
     * Reset mode requested.
     **/
    public enum ResetMode implements com.oracle.bmc.http.internal.BmcEnum {
        Soft("SOFT"),
        Mixed("MIXED"),
        Hard("HARD"),
        ;

        

        private final String value;
        private static java.util.Map<String, ResetMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ResetMode v : ResetMode.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ResetMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResetMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ResetMode: " + key);
        }
    };
        /**
     * Reset mode requested.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resetMode")
    private final ResetMode resetMode;

        /**
     * Reset mode requested.
     * @return the value
     **/
    
    public ResetMode getResetMode() {
        return resetMode;
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
        sb.append("GitResetDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", resetMode=").append(String.valueOf(this.resetMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitResetDetails)) {
            return false;
        }

        GitResetDetails other = (GitResetDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.commitId, other.commitId) &&
            java.util.Objects.equals(this.resetMode, other.resetMode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.resetMode == null ? 43 : this.resetMode.hashCode());
        return result;
    }


}
