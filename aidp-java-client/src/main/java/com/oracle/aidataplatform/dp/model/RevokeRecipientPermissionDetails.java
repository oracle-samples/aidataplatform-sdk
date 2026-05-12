package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions revoked from assignees for a recipient.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RevokeRecipientPermissionDetails.Builder.class)

public final class RevokeRecipientPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignees", "permissions"})
    public RevokeRecipientPermissionDetails(PermissionAssignees assignees, java.util.List<RecipientPrivilege> permissions) {
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
     * The permissions revoked from the assignees.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissions")
private java.util.List<RecipientPrivilege> permissions;

        /**
         * The permissions revoked from the assignees.
         * @param permissions the value to set
         * @return this builder
         **/
        

public Builder permissions(java.util.List<RecipientPrivilege> permissions) {
    this.permissions = permissions;
    return this;
}


        public RevokeRecipientPermissionDetails build() {
            RevokeRecipientPermissionDetails model = new RevokeRecipientPermissionDetails(this.assignees
                , this.permissions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevokeRecipientPermissionDetails model) {
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
     * The permissions revoked from the assignees.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissions")
    private final java.util.List<RecipientPrivilege> permissions;

        /**
     * The permissions revoked from the assignees.
     * @return the value
     **/
    
    public java.util.List<RecipientPrivilege> getPermissions() {
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
        sb.append("RevokeRecipientPermissionDetails(");
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
        if (!(o instanceof RevokeRecipientPermissionDetails)) {
            return false;
        }

        RevokeRecipientPermissionDetails other = (RevokeRecipientPermissionDetails) o;
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
