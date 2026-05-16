// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The user/principal/role the role can be assigned to.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RoleAssignee.Builder.class)

public final class RoleAssignee  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "target", "targetName"})
    public RoleAssignee(RoleAssigneeType type, String target, String targetName) {
        super();
        this.type = type;
        this.target = target;
        this.targetName = targetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * assignee type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private RoleAssigneeType type;

        /**
         * assignee type.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(RoleAssigneeType type) {
    this.type = type;
    return this;
}
            /**
     * The OCID for a principal or role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("target")
private String target;

        /**
         * The OCID for a principal or role.
         * @param target the value to set
         * @return this builder
         **/
        

public Builder target(String target) {
    this.target = target;
    return this;
}
            /**
     * The name for a principal or role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetName")
private String targetName;

        /**
         * The name for a principal or role.
         * @param targetName the value to set
         * @return this builder
         **/
        

public Builder targetName(String targetName) {
    this.targetName = targetName;
    return this;
}


        public RoleAssignee build() {
            RoleAssignee model = new RoleAssignee(this.type
                , this.target
                , this.targetName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleAssignee model) {
                this.type(model.getType());
    this.target(model.getTarget());
    this.targetName(model.getTargetName());
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
     * assignee type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final RoleAssigneeType type;

        /**
     * assignee type.
     * @return the value
     **/
    
    public RoleAssigneeType getType() {
        return type;
    }


        /**
     * The OCID for a principal or role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

        /**
     * The OCID for a principal or role.
     * @return the value
     **/
    
    public String getTarget() {
        return target;
    }


        /**
     * The name for a principal or role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

        /**
     * The name for a principal or role.
     * @return the value
     **/
    
    public String getTargetName() {
        return targetName;
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
        sb.append("RoleAssignee(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleAssignee)) {
            return false;
        }

        RoleAssignee other = (RoleAssignee) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.target, other.target) &&
            java.util.Objects.equals(this.targetName, other.targetName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        return result;
    }


}
