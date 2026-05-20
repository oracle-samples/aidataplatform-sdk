// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Current git operation state for a repository folder context.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitOperationState.Builder.class)

public final class GitOperationState  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFolderPath", "state", "isBlocking", "isAllowed", "message", "currentBranch", "headCommitId", "isDetached", "haveConflicts", "timeChecked"})
    public GitOperationState(String gitFolderPath, State state, Boolean isBlocking, Boolean isAllowed, String message, String currentBranch, String headCommitId, Boolean isDetached, Boolean haveConflicts, java.util.Date timeChecked) {
        super();
        this.gitFolderPath = gitFolderPath;
        this.state = state;
        this.isBlocking = isBlocking;
        this.isAllowed = isAllowed;
        this.message = message;
        this.currentBranch = currentBranch;
        this.headCommitId = headCommitId;
        this.isDetached = isDetached;
        this.haveConflicts = haveConflicts;
        this.timeChecked = timeChecked;
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
     * Current Git operation state detected.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private State state;

        /**
         * Current Git operation state detected.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(State state) {
    this.state = state;
    return this;
}
            /**
     * Whether the detected state blocks typical write operations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isBlocking")
private Boolean isBlocking;

        /**
         * Whether the detected state blocks typical write operations.
         * @param isBlocking the value to set
         * @return this builder
         **/
        

public Builder isBlocking(Boolean isBlocking) {
    this.isBlocking = isBlocking;
    return this;
}
            /**
     * Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
private Boolean isAllowed;

        /**
         * Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.
         * @param isAllowed the value to set
         * @return this builder
         **/
        

public Builder isAllowed(Boolean isAllowed) {
    this.isAllowed = isAllowed;
    return this;
}
            /**
     * Human-readable hint for UI display.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Human-readable hint for UI display.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * Current branch name. Empty if detached HEAD.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("currentBranch")
private String currentBranch;

        /**
         * Current branch name. Empty if detached HEAD.
         * @param currentBranch the value to set
         * @return this builder
         **/
        

public Builder currentBranch(String currentBranch) {
    this.currentBranch = currentBranch;
    return this;
}
            /**
     * Full commit ID of HEAD.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("headCommitId")
private String headCommitId;

        /**
         * Full commit ID of HEAD.
         * @param headCommitId the value to set
         * @return this builder
         **/
        

public Builder headCommitId(String headCommitId) {
    this.headCommitId = headCommitId;
    return this;
}
            /**
     * Whether HEAD is detached.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isDetached")
private Boolean isDetached;

        /**
         * Whether HEAD is detached.
         * @param isDetached the value to set
         * @return this builder
         **/
        

public Builder isDetached(Boolean isDetached) {
    this.isDetached = isDetached;
    return this;
}
            /**
     * Indicates if unmerged/conflicted files exist. This does not include file names.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("haveConflicts")
private Boolean haveConflicts;

        /**
         * Indicates if unmerged/conflicted files exist. This does not include file names.
         * @param haveConflicts the value to set
         * @return this builder
         **/
        

public Builder haveConflicts(Boolean haveConflicts) {
    this.haveConflicts = haveConflicts;
    return this;
}
            /**
     * Time when the state was computed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeChecked")
private java.util.Date timeChecked;

        /**
         * Time when the state was computed.
         * @param timeChecked the value to set
         * @return this builder
         **/
        

public Builder timeChecked(java.util.Date timeChecked) {
    this.timeChecked = timeChecked;
    return this;
}


        public GitOperationState build() {
            GitOperationState model = new GitOperationState(this.gitFolderPath
                , this.state
                , this.isBlocking
                , this.isAllowed
                , this.message
                , this.currentBranch
                , this.headCommitId
                , this.isDetached
                , this.haveConflicts
                , this.timeChecked);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitOperationState model) {
                this.gitFolderPath(model.getGitFolderPath());
    this.state(model.getState());
    this.isBlocking(model.getIsBlocking());
    this.isAllowed(model.getIsAllowed());
    this.message(model.getMessage());
    this.currentBranch(model.getCurrentBranch());
    this.headCommitId(model.getHeadCommitId());
    this.isDetached(model.getIsDetached());
    this.haveConflicts(model.getHaveConflicts());
    this.timeChecked(model.getTimeChecked());
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
     * Current Git operation state detected.
     **/
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Clean("CLEAN"),
        MergeInProgress("MERGE_IN_PROGRESS"),
        RebaseInProgress("REBASE_IN_PROGRESS"),
        PullInProgress("PULL_IN_PROGRESS"),
        DetachedHead("DETACHED_HEAD"),
        Unknown("UNKNOWN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'State', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Current Git operation state detected.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

        /**
     * Current Git operation state detected.
     * @return the value
     **/
    
    public State getState() {
        return state;
    }


        /**
     * Whether the detected state blocks typical write operations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isBlocking")
    private final Boolean isBlocking;

        /**
     * Whether the detected state blocks typical write operations.
     * @return the value
     **/
    
    public Boolean getIsBlocking() {
        return isBlocking;
    }


        /**
     * Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowed")
    private final Boolean isAllowed;

        /**
     * Whether the requested operation is allowed in the current state. If operationName is not provided, this indicates if the repository is in a generally safe state.
     * @return the value
     **/
    
    public Boolean getIsAllowed() {
        return isAllowed;
    }


        /**
     * Human-readable hint for UI display.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Human-readable hint for UI display.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * Current branch name. Empty if detached HEAD.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("currentBranch")
    private final String currentBranch;

        /**
     * Current branch name. Empty if detached HEAD.
     * @return the value
     **/
    
    public String getCurrentBranch() {
        return currentBranch;
    }


        /**
     * Full commit ID of HEAD.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("headCommitId")
    private final String headCommitId;

        /**
     * Full commit ID of HEAD.
     * @return the value
     **/
    
    public String getHeadCommitId() {
        return headCommitId;
    }


        /**
     * Whether HEAD is detached.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDetached")
    private final Boolean isDetached;

        /**
     * Whether HEAD is detached.
     * @return the value
     **/
    
    public Boolean getIsDetached() {
        return isDetached;
    }


        /**
     * Indicates if unmerged/conflicted files exist. This does not include file names.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("haveConflicts")
    private final Boolean haveConflicts;

        /**
     * Indicates if unmerged/conflicted files exist. This does not include file names.
     * @return the value
     **/
    
    public Boolean getHaveConflicts() {
        return haveConflicts;
    }


        /**
     * Time when the state was computed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeChecked")
    private final java.util.Date timeChecked;

        /**
     * Time when the state was computed.
     * @return the value
     **/
    
    public java.util.Date getTimeChecked() {
        return timeChecked;
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
        sb.append("GitOperationState(");
        sb.append("gitFolderPath=").append(String.valueOf(this.gitFolderPath));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", isBlocking=").append(String.valueOf(this.isBlocking));
        sb.append(", isAllowed=").append(String.valueOf(this.isAllowed));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", currentBranch=").append(String.valueOf(this.currentBranch));
        sb.append(", headCommitId=").append(String.valueOf(this.headCommitId));
        sb.append(", isDetached=").append(String.valueOf(this.isDetached));
        sb.append(", haveConflicts=").append(String.valueOf(this.haveConflicts));
        sb.append(", timeChecked=").append(String.valueOf(this.timeChecked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitOperationState)) {
            return false;
        }

        GitOperationState other = (GitOperationState) o;
        return java.util.Objects.equals(this.gitFolderPath, other.gitFolderPath) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.isBlocking, other.isBlocking) &&
            java.util.Objects.equals(this.isAllowed, other.isAllowed) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.currentBranch, other.currentBranch) &&
            java.util.Objects.equals(this.headCommitId, other.headCommitId) &&
            java.util.Objects.equals(this.isDetached, other.isDetached) &&
            java.util.Objects.equals(this.haveConflicts, other.haveConflicts) &&
            java.util.Objects.equals(this.timeChecked, other.timeChecked);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFolderPath == null ? 43 : this.gitFolderPath.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.isBlocking == null ? 43 : this.isBlocking.hashCode());
        result = (result * PRIME) + (this.isAllowed == null ? 43 : this.isAllowed.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.currentBranch == null ? 43 : this.currentBranch.hashCode());
        result = (result * PRIME) + (this.headCommitId == null ? 43 : this.headCommitId.hashCode());
        result = (result * PRIME) + (this.isDetached == null ? 43 : this.isDetached.hashCode());
        result = (result * PRIME) + (this.haveConflicts == null ? 43 : this.haveConflicts.hashCode());
        result = (result * PRIME) + (this.timeChecked == null ? 43 : this.timeChecked.hashCode());
        return result;
    }


}
