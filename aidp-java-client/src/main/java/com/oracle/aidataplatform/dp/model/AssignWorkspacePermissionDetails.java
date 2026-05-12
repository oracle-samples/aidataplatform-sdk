package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions assigned on the workspace to assignee.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AssignWorkspacePermissionDetails.Builder.class)

public final class AssignWorkspacePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions"})
    public AssignWorkspacePermissionDetails(PermissionAssignees assignees, java.util.List<WorkspacePrivilege> permissions) {
        super();
        this.assignees = assignees;
        this.permissions = permissions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignees")
private PermissionAssignees assignees;



public Builder assignees(PermissionAssignees assignees) {
    this.assignees = assignees;
    return this;
}
            /**
     * The permissions assigned to the assignees.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private java.util.List<WorkspacePrivilege> permissions;

        /**
         * The permissions assigned to the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<WorkspacePrivilege> permissions) {
    this.permissions = permissions;
    return this;
}


        public AssignWorkspacePermissionDetails build() {
            AssignWorkspacePermissionDetails model = new AssignWorkspacePermissionDetails(this.assignees
                , this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignWorkspacePermissionDetails model) {
                this.assignees(model.getAssignees());
    this.permissions(model.getPermissions());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignees")
    private final PermissionAssignees assignees;

    
    public PermissionAssignees getAssignees() {
        return assignees;
    }

    
        /**
     * The permissions assigned to the assignees.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<WorkspacePrivilege> permissions;

        /**
     * The permissions assigned to the assignees.
     * @return the value
     **/
    
    public java.util.List<WorkspacePrivilege> getPermissions() {
        return permissions;
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
        sb.append("AssignWorkspacePermissionDetails(");
        sb.append("assignees=").append(String.valueOf(this.assignees));
        sb.append(", permissions=").append(String.valueOf(this.permissions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignWorkspacePermissionDetails)) {
            return false;
        }

        AssignWorkspacePermissionDetails other = (AssignWorkspacePermissionDetails) o;
        return java.util.Objects.equals(this.assignees, other.assignees) &&
            java.util.Objects.equals(this.permissions, other.permissions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignees == null ? 43 : this.assignees.hashCode());
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        return result;
    }


}
