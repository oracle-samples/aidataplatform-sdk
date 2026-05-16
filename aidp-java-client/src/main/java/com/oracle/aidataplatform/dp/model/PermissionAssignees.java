// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The information about the assignees
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PermissionAssignees.Builder.class)

public final class PermissionAssignees  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "targets"})
    public PermissionAssignees(GranteeType type, java.util.List<String> targets) {
        super();
        this.type = type;
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Grantee type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private GranteeType type;

        /**
         * Grantee type.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(GranteeType type) {
    this.type = type;
    return this;
}
            /**
     * The names/ocids of the users, groups or roles.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targets")
private java.util.List<String> targets;

        /**
         * The names/ocids of the users, groups or roles.
         * @param targets the value to set
         * @return this builder
         **/
        

public Builder targets(java.util.List<String> targets) {
    this.targets = targets;
    return this;
}


        public PermissionAssignees build() {
            PermissionAssignees model = new PermissionAssignees(this.type
                , this.targets);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PermissionAssignees model) {
                this.type(model.getType());
    this.targets(model.getTargets());
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
     * Grantee type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final GranteeType type;

        /**
     * Grantee type.
     * @return the value
     **/
    
    public GranteeType getType() {
        return type;
    }


        /**
     * The names/ocids of the users, groups or roles.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<String> targets;

        /**
     * The names/ocids of the users, groups or roles.
     * @return the value
     **/
    
    public java.util.List<String> getTargets() {
        return targets;
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
        sb.append("PermissionAssignees(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PermissionAssignees)) {
            return false;
        }

        PermissionAssignees other = (PermissionAssignees) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.targets, other.targets);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        return result;
    }


}
