// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of the permissions revoked from assignees for a role.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RevokeRolePermissionDetails.Builder.class)

public final class RevokeRolePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"permissionWithResourceDetails"})
    public RevokeRolePermissionDetails(java.util.List<PermissionWithResourceDetails> permissionWithResourceDetails) {
        super();
        this.permissionWithResourceDetails = permissionWithResourceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A list of permissions, resourceTypes, and resourceKeys.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("permissionWithResourceDetails")
private java.util.List<PermissionWithResourceDetails> permissionWithResourceDetails;

        /**
         * A list of permissions, resourceTypes, and resourceKeys.
         * @param permissionWithResourceDetails the value to set
         * @return this builder
         **/
        

public Builder permissionWithResourceDetails(java.util.List<PermissionWithResourceDetails> permissionWithResourceDetails) {
    this.permissionWithResourceDetails = permissionWithResourceDetails;
    return this;
}


        public RevokeRolePermissionDetails build() {
            RevokeRolePermissionDetails model = new RevokeRolePermissionDetails(this.permissionWithResourceDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevokeRolePermissionDetails model) {
                this.permissionWithResourceDetails(model.getPermissionWithResourceDetails());
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
     * A list of permissions, resourceTypes, and resourceKeys.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("permissionWithResourceDetails")
    private final java.util.List<PermissionWithResourceDetails> permissionWithResourceDetails;

        /**
     * A list of permissions, resourceTypes, and resourceKeys.
     * @return the value
     **/
    
    public java.util.List<PermissionWithResourceDetails> getPermissionWithResourceDetails() {
        return permissionWithResourceDetails;
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
        sb.append("RevokeRolePermissionDetails(");
        sb.append("permissionWithResourceDetails=").append(String.valueOf(this.permissionWithResourceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RevokeRolePermissionDetails)) {
            return false;
        }

        RevokeRolePermissionDetails other = (RevokeRolePermissionDetails) o;
        return java.util.Objects.equals(this.permissionWithResourceDetails, other.permissionWithResourceDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.permissionWithResourceDetails == null ? 43 : this.permissionWithResourceDetails.hashCode());
        return result;
    }


}
