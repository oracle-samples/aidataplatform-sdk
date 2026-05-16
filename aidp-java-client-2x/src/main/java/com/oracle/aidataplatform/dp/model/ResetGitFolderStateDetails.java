// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Action to either abort an in-progress merge/rebase or discard all local changes.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ResetGitFolderStateDetails.Builder.class)

public final class ResetGitFolderStateDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "discardPaths", "canIncludeIgnored"})
    public ResetGitFolderStateDetails(Action action, java.util.List<String> discardPaths, Boolean canIncludeIgnored) {
        super();
        this.action = action;
        this.discardPaths = discardPaths;
        this.canIncludeIgnored = canIncludeIgnored;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The action to perform.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

                /**
         * The action to perform.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(Action action) {
        this.action = action;
        return this;
        }
            /**
     * list of file paths whose changes are to be discarded and reset to original
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("discardPaths")
        private java.util.List<String> discardPaths;

                /**
         * list of file paths whose changes are to be discarded and reset to original
         * @param discardPaths the value to set
         * @return this builder
         **/
        

        public Builder discardPaths(java.util.List<String> discardPaths) {
        this.discardPaths = discardPaths;
        return this;
        }
            /**
     * If true with DISCARD, also remove ignored files (-x).
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("canIncludeIgnored")
        private Boolean canIncludeIgnored;

                /**
         * If true with DISCARD, also remove ignored files (-x).
         * @param canIncludeIgnored the value to set
         * @return this builder
         **/
        

        public Builder canIncludeIgnored(Boolean canIncludeIgnored) {
        this.canIncludeIgnored = canIncludeIgnored;
        return this;
        }


        public ResetGitFolderStateDetails build() {
            ResetGitFolderStateDetails model = new ResetGitFolderStateDetails(this.action
                    , this.discardPaths
                    , this.canIncludeIgnored);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResetGitFolderStateDetails model) {
                this.action(model.getAction());
    this.discardPaths(model.getDiscardPaths());
    this.canIncludeIgnored(model.getCanIncludeIgnored());
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
     * The action to perform.
     **/
    public enum Action {
        AbortMerge("ABORT_MERGE"),
        AbortRebase("ABORT_REBASE"),
        AbortPull("ABORT_PULL"),
        Discard("DISCARD"),
        ;

        

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
        /**
     * The action to perform.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * The action to perform.
     * @return the value
     **/
    
    public Action getAction() {
        return action;
    }


        /**
     * list of file paths whose changes are to be discarded and reset to original
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("discardPaths")
    private final java.util.List<String> discardPaths;

        /**
     * list of file paths whose changes are to be discarded and reset to original
     * @return the value
     **/
    
    public java.util.List<String> getDiscardPaths() {
        return discardPaths;
    }


        /**
     * If true with DISCARD, also remove ignored files (-x).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("canIncludeIgnored")
    private final Boolean canIncludeIgnored;

        /**
     * If true with DISCARD, also remove ignored files (-x).
     * @return the value
     **/
    
    public Boolean getCanIncludeIgnored() {
        return canIncludeIgnored;
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
        sb.append("ResetGitFolderStateDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", discardPaths=").append(String.valueOf(this.discardPaths));
        sb.append(", canIncludeIgnored=").append(String.valueOf(this.canIncludeIgnored));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResetGitFolderStateDetails)) {
            return false;
        }

        ResetGitFolderStateDetails other = (ResetGitFolderStateDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.discardPaths, other.discardPaths) &&
            java.util.Objects.equals(this.canIncludeIgnored, other.canIncludeIgnored);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.discardPaths == null ? 43 : this.discardPaths.hashCode());
        result = (result * PRIME) + (this.canIncludeIgnored == null ? 43 : this.canIncludeIgnored.hashCode());
        return result;
    }


}
