package com.oracle.aidataplatform.dp.model;


/**
 * The details of the permissions revoked from assignees for a job.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RevokeJobPermissionDetails.Builder.class)

public final class RevokeJobPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions"})
    public RevokeJobPermissionDetails(PermissionAssignees assignees, java.util.List<JobPrivilege> permissions) {
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
     * The permission revoked from the assignee as per the index of assignee. This list should be same size as assignees list.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("permissions")
        private java.util.List<JobPrivilege> permissions;

                /**
         * The permission revoked from the assignee as per the index of assignee. This list should be same size as assignees list.
         * @param permissions the value to set
         * @return this builder
         **/
        

        public Builder permissions(java.util.List<JobPrivilege> permissions) {
        this.permissions = permissions;
        return this;
        }


        public RevokeJobPermissionDetails build() {
            RevokeJobPermissionDetails model = new RevokeJobPermissionDetails(this.assignees
                    , this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevokeJobPermissionDetails model) {
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
     * The permission revoked from the assignee as per the index of assignee. This list should be same size as assignees list.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<JobPrivilege> permissions;

        /**
     * The permission revoked from the assignee as per the index of assignee. This list should be same size as assignees list.
     * @return the value
     **/
    
    public java.util.List<JobPrivilege> getPermissions() {
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
        sb.append("RevokeJobPermissionDetails(");
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
        if (!(o instanceof RevokeJobPermissionDetails)) {
            return false;
        }

        RevokeJobPermissionDetails other = (RevokeJobPermissionDetails) o;
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
