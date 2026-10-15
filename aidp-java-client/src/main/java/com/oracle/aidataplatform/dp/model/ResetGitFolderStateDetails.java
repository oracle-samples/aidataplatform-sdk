// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Abort or discard action and optional file selection for resetting Git folder state.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
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
     * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("action")
private Action action;

        /**
         * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
         * @param action the value to set
         * @return this builder
         **/
        

public Builder action(Action action) {
    this.action = action;
    return this;
}
            /**
     * Repository-relative paths whose local changes are to be discarded. Required
* and nonempty when action is DISCARD.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("discardPaths")
private java.util.List<String> discardPaths;

        /**
         * Repository-relative paths whose local changes are to be discarded. Required
* and nonempty when action is DISCARD.
* 
         * @param discardPaths the value to set
         * @return this builder
         **/
        

public Builder discardPaths(java.util.List<String> discardPaths) {
    this.discardPaths = discardPaths;
    return this;
}
            /**
     * Requested inclusion of ignored files in a DISCARD request. The supplied value
* does not enable ignored-file removal.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("canIncludeIgnored")
private Boolean canIncludeIgnored;

        /**
         * Requested inclusion of ignored files in a DISCARD request. The supplied value
* does not enable ignored-file removal.
* 
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
     * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
     **/
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
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
     * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
     * @return the value
     **/
    
    public Action getAction() {
        return action;
    }


        /**
     * Repository-relative paths whose local changes are to be discarded. Required
* and nonempty when action is DISCARD.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("discardPaths")
    private final java.util.List<String> discardPaths;

        /**
     * Repository-relative paths whose local changes are to be discarded. Required
* and nonempty when action is DISCARD.
* 
     * @return the value
     **/
    
    public java.util.List<String> getDiscardPaths() {
        return discardPaths;
    }


        /**
     * Requested inclusion of ignored files in a DISCARD request. The supplied value
* does not enable ignored-file removal.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("canIncludeIgnored")
    private final Boolean canIncludeIgnored;

        /**
     * Requested inclusion of ignored files in a DISCARD request. The supplied value
* does not enable ignored-file removal.
* 
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
