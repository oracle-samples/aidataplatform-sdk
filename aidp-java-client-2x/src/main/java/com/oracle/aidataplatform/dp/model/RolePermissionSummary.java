// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary of role permissions.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RolePermissionSummary.Builder.class)

public final class RolePermissionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissionsWithResourceDetails", "roleKey", "roleDescription"})
    public RolePermissionSummary(ListPermissionsWithResourceDetails permissionsWithResourceDetails, String roleKey, String roleDescription) {
        super();
        this.permissionsWithResourceDetails = permissionsWithResourceDetails;
        this.roleKey = roleKey;
        this.roleDescription = roleDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("permissionsWithResourceDetails")
        private ListPermissionsWithResourceDetails permissionsWithResourceDetails;

        

        public Builder permissionsWithResourceDetails(ListPermissionsWithResourceDetails permissionsWithResourceDetails) {
        this.permissionsWithResourceDetails = permissionsWithResourceDetails;
        return this;
        }
            /**
     * Role attached to this permission entry.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("roleKey")
        private String roleKey;

                /**
         * Role attached to this permission entry.
         * @param roleKey the value to set
         * @return this builder
         **/
        

        public Builder roleKey(String roleKey) {
        this.roleKey = roleKey;
        return this;
        }
            /**
     * The description of the role.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("roleDescription")
        private String roleDescription;

                /**
         * The description of the role.
         * @param roleDescription the value to set
         * @return this builder
         **/
        

        public Builder roleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
        }


        public RolePermissionSummary build() {
            RolePermissionSummary model = new RolePermissionSummary(this.permissionsWithResourceDetails
                    , this.roleKey
                    , this.roleDescription);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RolePermissionSummary model) {
                this.permissionsWithResourceDetails(model.getPermissionsWithResourceDetails());
    this.roleKey(model.getRoleKey());
    this.roleDescription(model.getRoleDescription());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("permissionsWithResourceDetails")
    private final ListPermissionsWithResourceDetails permissionsWithResourceDetails;

    
    public ListPermissionsWithResourceDetails getPermissionsWithResourceDetails() {
        return permissionsWithResourceDetails;
    }


        /**
     * Role attached to this permission entry.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("roleKey")
    private final String roleKey;

        /**
     * Role attached to this permission entry.
     * @return the value
     **/
    
    public String getRoleKey() {
        return roleKey;
    }


        /**
     * The description of the role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("roleDescription")
    private final String roleDescription;

        /**
     * The description of the role.
     * @return the value
     **/
    
    public String getRoleDescription() {
        return roleDescription;
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
        sb.append("RolePermissionSummary(");
        sb.append("permissionsWithResourceDetails=").append(String.valueOf(this.permissionsWithResourceDetails));
        sb.append(", roleKey=").append(String.valueOf(this.roleKey));
        sb.append(", roleDescription=").append(String.valueOf(this.roleDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RolePermissionSummary)) {
            return false;
        }

        RolePermissionSummary other = (RolePermissionSummary) o;
        return java.util.Objects.equals(this.permissionsWithResourceDetails, other.permissionsWithResourceDetails) &&
            java.util.Objects.equals(this.roleKey, other.roleKey) &&
            java.util.Objects.equals(this.roleDescription, other.roleDescription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permissionsWithResourceDetails == null ? 43 : this.permissionsWithResourceDetails.hashCode());
        result = (result * PRIME) + (this.roleKey == null ? 43 : this.roleKey.hashCode());
        result = (result * PRIME) + (this.roleDescription == null ? 43 : this.roleDescription.hashCode());
        return result;
    }


}
