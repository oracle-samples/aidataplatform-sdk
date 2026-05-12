package com.oracle.aidataplatform.dp.model;



/**
 * Details of the permissions revoked from assignees for a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RevokeClusterPermissionDetails.Builder.class)

public final class RevokeClusterPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions"})
    public RevokeClusterPermissionDetails(PermissionAssignees assignees, java.util.List<ClusterPrivilege> permissions) {
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
     * Permissions revoked from the assignees.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private java.util.List<ClusterPrivilege> permissions;

        /**
         * Permissions revoked from the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<ClusterPrivilege> permissions) {
    this.permissions = permissions;
    return this;
}


        public RevokeClusterPermissionDetails build() {
            RevokeClusterPermissionDetails model = new RevokeClusterPermissionDetails(this.assignees
                , this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevokeClusterPermissionDetails model) {
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
     * Permissions revoked from the assignees.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<ClusterPrivilege> permissions;

        /**
     * Permissions revoked from the assignees.
     * @return the value
     **/
    
    public java.util.List<ClusterPrivilege> getPermissions() {
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
        sb.append("RevokeClusterPermissionDetails(");
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
        if (!(o instanceof RevokeClusterPermissionDetails)) {
            return false;
        }

        RevokeClusterPermissionDetails other = (RevokeClusterPermissionDetails) o;
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
