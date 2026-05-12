package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a role.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageRolePermissionDetails.Builder.class)

public final class ManageRolePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignRolePermissionDetails", "revokeRolePermissionDetails"})
    public ManageRolePermissionDetails(AssignRolePermissionDetails assignRolePermissionDetails, RevokeRolePermissionDetails revokeRolePermissionDetails) {
        super();
        this.assignRolePermissionDetails = assignRolePermissionDetails;
        this.revokeRolePermissionDetails = revokeRolePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignRolePermissionDetails")
private AssignRolePermissionDetails assignRolePermissionDetails;



public Builder assignRolePermissionDetails(AssignRolePermissionDetails assignRolePermissionDetails) {
    this.assignRolePermissionDetails = assignRolePermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeRolePermissionDetails")
private RevokeRolePermissionDetails revokeRolePermissionDetails;



public Builder revokeRolePermissionDetails(RevokeRolePermissionDetails revokeRolePermissionDetails) {
    this.revokeRolePermissionDetails = revokeRolePermissionDetails;
    return this;
}


        public ManageRolePermissionDetails build() {
            ManageRolePermissionDetails model = new ManageRolePermissionDetails(this.assignRolePermissionDetails
                , this.revokeRolePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageRolePermissionDetails model) {
                this.assignRolePermissionDetails(model.getAssignRolePermissionDetails());
    this.revokeRolePermissionDetails(model.getRevokeRolePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignRolePermissionDetails")
    private final AssignRolePermissionDetails assignRolePermissionDetails;

    
    public AssignRolePermissionDetails getAssignRolePermissionDetails() {
        return assignRolePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeRolePermissionDetails")
    private final RevokeRolePermissionDetails revokeRolePermissionDetails;

    
    public RevokeRolePermissionDetails getRevokeRolePermissionDetails() {
        return revokeRolePermissionDetails;
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
        sb.append("ManageRolePermissionDetails(");
        sb.append("assignRolePermissionDetails=").append(String.valueOf(this.assignRolePermissionDetails));
        sb.append(", revokeRolePermissionDetails=").append(String.valueOf(this.revokeRolePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageRolePermissionDetails)) {
            return false;
        }

        ManageRolePermissionDetails other = (ManageRolePermissionDetails) o;
        return java.util.Objects.equals(this.assignRolePermissionDetails, other.assignRolePermissionDetails) &&
            java.util.Objects.equals(this.revokeRolePermissionDetails, other.revokeRolePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignRolePermissionDetails == null ? 43 : this.assignRolePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeRolePermissionDetails == null ? 43 : this.revokeRolePermissionDetails.hashCode());
        return result;
    }


}
