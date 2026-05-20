// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions revoked from assignees for a workspace object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RevokeWorkspaceObjectPermissionDetails.Builder.class)

public final class RevokeWorkspaceObjectPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions", "isPermissionsInheritable"})
    public RevokeWorkspaceObjectPermissionDetails(PermissionAssignees assignees, java.util.List<WorkspaceObjectPrivilege> permissions, Boolean isPermissionsInheritable) {
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
     * The permissions revoked from the assignees.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private java.util.List<WorkspaceObjectPrivilege> permissions;

        /**
         * The permissions revoked from the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<WorkspaceObjectPrivilege> permissions) {
    this.permissions = permissions;
    return this;
}
            /**
     * Property to determine that permission which should be removed is inheritable or not. This is applicable only on workspace folders not on files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
private Boolean isPermissionsInheritable;

        /**
         * Property to determine that permission which should be removed is inheritable or not. This is applicable only on workspace folders not on files.
         * @param isPermissionsInheritable the value to set
         * @return this builder
         **/
        

public Builder isPermissionsInheritable(Boolean isPermissionsInheritable) {
    this.isPermissionsInheritable = isPermissionsInheritable;
    return this;
}


        public RevokeWorkspaceObjectPermissionDetails build() {
            RevokeWorkspaceObjectPermissionDetails model = new RevokeWorkspaceObjectPermissionDetails(this.assignees
                , this.permissions
                , this.isPermissionsInheritable);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevokeWorkspaceObjectPermissionDetails model) {
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
     * The permissions revoked from the assignees.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<WorkspaceObjectPrivilege> permissions;

        /**
     * The permissions revoked from the assignees.
     * @return the value
     **/
    
    public java.util.List<WorkspaceObjectPrivilege> getPermissions() {
        return permissions;
    }


        /**
     * Property to determine that permission which should be removed is inheritable or not. This is applicable only on workspace folders not on files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPermissionsInheritable")
    private final Boolean isPermissionsInheritable;

        /**
     * Property to determine that permission which should be removed is inheritable or not. This is applicable only on workspace folders not on files.
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
        sb.append("RevokeWorkspaceObjectPermissionDetails(");
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
        if (!(o instanceof RevokeWorkspaceObjectPermissionDetails)) {
            return false;
        }

        RevokeWorkspaceObjectPermissionDetails other = (RevokeWorkspaceObjectPermissionDetails) o;
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
