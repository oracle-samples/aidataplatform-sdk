// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of files to checkout side or mark as resolved.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ConflictResolveDetails.Builder.class)

public final class ConflictResolveDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"files", "action"})
    public ConflictResolveDetails(java.util.List<String> files, Action action) {
        super();
        this.files = files;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of file paths to checkout side or mark as resolved.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("files")
private java.util.List<String> files;

        /**
         * List of file paths to checkout side or mark as resolved.
         * @param files the value to set
         * @return this builder
         **/
        

public Builder files(java.util.List<String> files) {
    this.files = files;
    return this;
}
            /**
     * Action for resolving conflict.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("action")
private Action action;

        /**
         * Action for resolving conflict.
         * @param action the value to set
         * @return this builder
         **/
        

public Builder action(Action action) {
    this.action = action;
    return this;
}


        public ConflictResolveDetails build() {
            ConflictResolveDetails model = new ConflictResolveDetails(this.files
                , this.action);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConflictResolveDetails model) {
                this.files(model.getFiles());
    this.action(model.getAction());
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
     * List of file paths to checkout side or mark as resolved.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    private final java.util.List<String> files;

        /**
     * List of file paths to checkout side or mark as resolved.
     * @return the value
     **/
    
    public java.util.List<String> getFiles() {
        return files;
    }

    /**
     * Action for resolving conflict.
     **/
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Local("LOCAL"),
        Remote("REMOTE"),
        MarkResolved("MARK_RESOLVED"),
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
     * Action for resolving conflict.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * Action for resolving conflict.
     * @return the value
     **/
    
    public Action getAction() {
        return action;
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
        sb.append("ConflictResolveDetails(");
        sb.append("files=").append(String.valueOf(this.files));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConflictResolveDetails)) {
            return false;
        }

        ConflictResolveDetails other = (ConflictResolveDetails) o;
        return java.util.Objects.equals(this.files, other.files) &&
            java.util.Objects.equals(this.action, other.action);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.files == null ? 43 : this.files.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }


}
