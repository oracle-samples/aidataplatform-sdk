// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Pull remote changes for the given branch context (supports continue/abort during merge).
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitPullDetails.Builder.class)

public final class GitPullDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "branchName", "remoteBranchName", "pullAction", "commitMessage"})
    public GitPullDetails(String gitFolderPath, String branchName, String remoteBranchName, PullAction pullAction, String commitMessage) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.branchName = branchName;
        this.remoteBranchName = remoteBranchName;
        this.pullAction = pullAction;
        this.commitMessage = commitMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Folder path used to locate the git worktree.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
        private String gitFolderPath;

                /**
         * Folder path used to locate the git worktree.
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

        public Builder gitFolderPath(String gitFolderPath) {
        this.gitFolderPath = gitFolderPath;
        return this;
        }
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
     * Remote branch to pull from. Defaults to branchName if not provided.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
        private String remoteBranchName;

                /**
         * Remote branch to pull from. Defaults to branchName if not provided.
         * @param remoteBranchName the value to set
         * @return this builder
         **/
        

        public Builder remoteBranchName(String remoteBranchName) {
        this.remoteBranchName = remoteBranchName;
        return this;
        }
            /**
     * Pull behavior requested by the caller.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("pullAction")
        private PullAction pullAction;

                /**
         * Pull behavior requested by the caller.
         * @param pullAction the value to set
         * @return this builder
         **/
        

        public Builder pullAction(PullAction pullAction) {
        this.pullAction = pullAction;
        return this;
        }
            /**
     * Commit message used only when pullAction is MERGE_CONTINUE.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
        private String commitMessage;

                /**
         * Commit message used only when pullAction is MERGE_CONTINUE.
         * @param commitMessage the value to set
         * @return this builder
         **/
        

        public Builder commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
        }


        public GitPullDetails build() {
            GitPullDetails model = new GitPullDetails(this.gitFolderPath
                    , this.branchName
                    , this.remoteBranchName
                    , this.pullAction
                    , this.commitMessage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitPullDetails model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.branchName(model.getBranchName());
    this.remoteBranchName(model.getRemoteBranchName());
    this.pullAction(model.getPullAction());
    this.commitMessage(model.getCommitMessage());
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
     * Folder path used to locate the git worktree.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Folder path used to locate the git worktree.
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
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
     * Remote branch to pull from. Defaults to branchName if not provided.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
    private final String remoteBranchName;

        /**
     * Remote branch to pull from. Defaults to branchName if not provided.
     * @return the value
     **/
    
    public String getRemoteBranchName() {
        return remoteBranchName;
    }

    /**
     * Pull behavior requested by the caller.
     **/
    public enum PullAction {
        Pull("PULL"),
        MergeContinue("MERGE_CONTINUE"),
        MergeAbort("MERGE_ABORT"),
        ;

        

        private final String value;
        private static java.util.Map<String, PullAction> map;

        static {
            map = new java.util.HashMap<>();
            for (PullAction v : PullAction.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        PullAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PullAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PullAction: " + key);
        }
    };
        /**
     * Pull behavior requested by the caller.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pullAction")
    private final PullAction pullAction;

        /**
     * Pull behavior requested by the caller.
     * @return the value
     **/
    
    public PullAction getPullAction() {
        return pullAction;
    }


        /**
     * Commit message used only when pullAction is MERGE_CONTINUE.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    private final String commitMessage;

        /**
     * Commit message used only when pullAction is MERGE_CONTINUE.
     * @return the value
     **/
    
    public String getCommitMessage() {
        return commitMessage;
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
        sb.append("GitPullDetails(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", branchName=").append(String.valueOf(this.branchName));
        sb.append(", remoteBranchName=").append(String.valueOf(this.remoteBranchName));
        sb.append(", pullAction=").append(String.valueOf(this.pullAction));
        sb.append(", commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitPullDetails)) {
            return false;
        }

        GitPullDetails other = (GitPullDetails) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.branchName, other.branchName) &&
            java.util.Objects.equals(this.remoteBranchName, other.remoteBranchName) &&
            java.util.Objects.equals(this.pullAction, other.pullAction) &&
            java.util.Objects.equals(this.commitMessage, other.commitMessage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + (this.remoteBranchName == null ? 43 : this.remoteBranchName.hashCode());
        result = (result * PRIME) + (this.pullAction == null ? 43 : this.pullAction.hashCode());
        result = (result * PRIME) + (this.commitMessage == null ? 43 : this.commitMessage.hashCode());
        return result;
    }


}
