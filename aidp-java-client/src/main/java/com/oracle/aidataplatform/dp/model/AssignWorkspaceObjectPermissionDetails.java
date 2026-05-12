package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions assigned on the workspace object to assignee.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AssignWorkspaceObjectPermissionDetails.Builder.class)

public final class AssignWorkspaceObjectPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions", "isPermissionsInheritable"})
    public AssignWorkspaceObjectPermissionDetails(PermissionAssignees assignees, java.util.List<WorkspaceObjectPrivilege> permissions, Boolean isPermissionsInheritable) {
        super();
        this.assignees = assignees;
        this.permissions = permissions;
        this.isPermissionsInheritable = isPermissionsInheritable;
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
private java.util.List<WorkspaceObjectPrivilege> permissions;

        /**
         * The permissions assigned to the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<WorkspaceObjectPrivilege> permissions) {
    this.permissions = permissions;
    return this;
}
            /**
     * Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
private Boolean isPermissionsInheritable;

        /**
         * Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.
         * @param isPermissionsInheritable the value to set
         * @return this builder
         **/
        

public Builder isPermissionsInheritable(Boolean isPermissionsInheritable) {
    this.isPermissionsInheritable = isPermissionsInheritable;
    return this;
}


        public AssignWorkspaceObjectPermissionDetails build() {
            AssignWorkspaceObjectPermissionDetails model = new AssignWorkspaceObjectPermissionDetails(this.assignees
                , this.permissions
                , this.isPermissionsInheritable);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignWorkspaceObjectPermissionDetails model) {
                this.assignees(model.getAssignees());
    this.permissions(model.getPermissions());
    this.isPermissionsInheritable(model.getIsPermissionsInheritable());
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
    private final java.util.List<WorkspaceObjectPrivilege> permissions;

        /**
     * The permissions assigned to the assignees.
     * @return the value
     **/
    
    public java.util.List<WorkspaceObjectPrivilege> getPermissions() {
        return permissions;
    }


        /**
     * Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
    private final Boolean isPermissionsInheritable;

        /**
     * Property to determine if permission should be inheritable or not, its default value is true. This is applicable only on workspace folders not on files.
     * @return the value
     **/
    
    public Boolean getIsPermissionsInheritable() {
        return isPermissionsInheritable;
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
        sb.append("AssignWorkspaceObjectPermissionDetails(");
        sb.append("assignees=").append(String.valueOf(this.assignees));
        sb.append(", permissions=").append(String.valueOf(this.permissions));
        sb.append(", isPermissionsInheritable=").append(String.valueOf(this.isPermissionsInheritable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignWorkspaceObjectPermissionDetails)) {
            return false;
        }

        AssignWorkspaceObjectPermissionDetails other = (AssignWorkspaceObjectPermissionDetails) o;
        return java.util.Objects.equals(this.assignees, other.assignees) &&
            java.util.Objects.equals(this.permissions, other.permissions) &&
            java.util.Objects.equals(this.isPermissionsInheritable, other.isPermissionsInheritable);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignees == null ? 43 : this.assignees.hashCode());
        result = (result * PRIME) + (this.permissions == null ? 43 : this.permissions.hashCode());
        result = (result * PRIME) + (this.isPermissionsInheritable == null ? 43 : this.isPermissionsInheritable.hashCode());
        return result;
    }


}
