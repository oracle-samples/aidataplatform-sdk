// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request details for pulling changes into a workspace Git repository.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
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
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
private String gitFolderPath;

        /**
         * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
         * @param gitFolderPath the value to set
         * @return this builder
         **/
        

public Builder gitFolderPath(String gitFolderPath) {
    this.gitFolderPath = gitFolderPath;
    return this;
}
            /**
     * Repository branch name. The effective branch is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("branchName")
private String branchName;

        /**
         * Repository branch name. The effective branch is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
         * @param branchName the value to set
         * @return this builder
         **/
        

public Builder branchName(String branchName) {
    this.branchName = branchName;
    return this;
}
            /**
     * Requested remote branch name. The pull source is origin for the stored
* repository branch; the supplied value does not override it.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
private String remoteBranchName;

        /**
         * Requested remote branch name. The pull source is origin for the stored
* repository branch; the supplied value does not override it.
* 
         * @param remoteBranchName the value to set
         * @return this builder
         **/
        

public Builder remoteBranchName(String remoteBranchName) {
    this.remoteBranchName = remoteBranchName;
    return this;
}
            /**
     * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pullAction")
private PullAction pullAction;

        /**
         * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
         * @param pullAction the value to set
         * @return this builder
         **/
        

public Builder pullAction(PullAction pullAction) {
    this.pullAction = pullAction;
    return this;
}
            /**
     * Requested merge-continuation commit message. The supplied value has no effect,
* including when pullAction is MERGE_CONTINUE.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
private String commitMessage;

        /**
         * Requested merge-continuation commit message. The supplied value has no effect,
* including when pullAction is MERGE_CONTINUE.
* 
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
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFolderPath")
    private final String gitFolderPath;

        /**
     * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     * @return the value
     **/
    
    public String getGitFolderPath() {
        return gitFolderPath;
    }


        /**
     * Repository branch name. The effective branch is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

        /**
     * Repository branch name. The effective branch is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
     * @return the value
     **/
    
    public String getBranchName() {
        return branchName;
    }


        /**
     * Requested remote branch name. The pull source is origin for the stored
* repository branch; the supplied value does not override it.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("remoteBranchName")
    private final String remoteBranchName;

        /**
     * Requested remote branch name. The pull source is origin for the stored
* repository branch; the supplied value does not override it.
* 
     * @return the value
     **/
    
    public String getRemoteBranchName() {
        return remoteBranchName;
    }

    /**
     * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
     **/
    public enum PullAction implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pullAction")
    private final PullAction pullAction;

        /**
     * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
     * @return the value
     **/
    
    public PullAction getPullAction() {
        return pullAction;
    }


        /**
     * Requested merge-continuation commit message. The supplied value has no effect,
* including when pullAction is MERGE_CONTINUE.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("commitMessage")
    private final String commitMessage;

        /**
     * Requested merge-continuation commit message. The supplied value has no effect,
* including when pullAction is MERGE_CONTINUE.
* 
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
