// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of revoking the role.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RemoveMemberFromRoleDetails.Builder.class)

public final class RemoveMemberFromRoleDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees"})
    public RemoveMemberFromRoleDetails(java.util.List<RoleAssignee> assignees) {
        super();
        this.assignees = assignees;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The assignees on the role.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("assignees")
private java.util.List<RoleAssignee> assignees;

        /**
         * The assignees on the role.
         * @param assignees the value to set
         * @return this builder
         **/
        

public Builder assignees(java.util.List<RoleAssignee> assignees) {
    this.assignees = assignees;
    return this;
}


        public RemoveMemberFromRoleDetails build() {
            RemoveMemberFromRoleDetails model = new RemoveMemberFromRoleDetails(this.assignees);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveMemberFromRoleDetails model) {
                this.assignees(model.getAssignees());
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
     * The assignees on the role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("assignees")
    private final java.util.List<RoleAssignee> assignees;

        /**
     * The assignees on the role.
     * @return the value
     **/
    
    public java.util.List<RoleAssignee> getAssignees() {
        return assignees;
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
        sb.append("RemoveMemberFromRoleDetails(");
        sb.append("assignees=").append(String.valueOf(this.assignees));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveMemberFromRoleDetails)) {
            return false;
        }

        RemoveMemberFromRoleDetails other = (RemoveMemberFromRoleDetails) o;
        return java.util.Objects.equals(this.assignees, other.assignees);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignees == null ? 43 : this.assignees.hashCode());
        return result;
    }


}
