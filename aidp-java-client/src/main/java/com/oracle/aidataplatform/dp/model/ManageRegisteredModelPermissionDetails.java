// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information to grant or revoke permissions on a registered model's dedicated volume.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageRegisteredModelPermissionDetails.Builder.class)

public final class ManageRegisteredModelPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignRegisteredModelPermissionDetails", "revokeRegisteredModelPermissionDetails"})
    public ManageRegisteredModelPermissionDetails(AssignRegisteredModelPermissionDetails assignRegisteredModelPermissionDetails, RevokeRegisteredModelPermissionDetails revokeRegisteredModelPermissionDetails) {
        super();
        this.assignRegisteredModelPermissionDetails = assignRegisteredModelPermissionDetails;
        this.revokeRegisteredModelPermissionDetails = revokeRegisteredModelPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignRegisteredModelPermissionDetails")
private AssignRegisteredModelPermissionDetails assignRegisteredModelPermissionDetails;



public Builder assignRegisteredModelPermissionDetails(AssignRegisteredModelPermissionDetails assignRegisteredModelPermissionDetails) {
    this.assignRegisteredModelPermissionDetails = assignRegisteredModelPermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeRegisteredModelPermissionDetails")
private RevokeRegisteredModelPermissionDetails revokeRegisteredModelPermissionDetails;



public Builder revokeRegisteredModelPermissionDetails(RevokeRegisteredModelPermissionDetails revokeRegisteredModelPermissionDetails) {
    this.revokeRegisteredModelPermissionDetails = revokeRegisteredModelPermissionDetails;
    return this;
}


        public ManageRegisteredModelPermissionDetails build() {
            ManageRegisteredModelPermissionDetails model = new ManageRegisteredModelPermissionDetails(this.assignRegisteredModelPermissionDetails
                , this.revokeRegisteredModelPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageRegisteredModelPermissionDetails model) {
                this.assignRegisteredModelPermissionDetails(model.getAssignRegisteredModelPermissionDetails());
    this.revokeRegisteredModelPermissionDetails(model.getRevokeRegisteredModelPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignRegisteredModelPermissionDetails")
    private final AssignRegisteredModelPermissionDetails assignRegisteredModelPermissionDetails;

    
    public AssignRegisteredModelPermissionDetails getAssignRegisteredModelPermissionDetails() {
        return assignRegisteredModelPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeRegisteredModelPermissionDetails")
    private final RevokeRegisteredModelPermissionDetails revokeRegisteredModelPermissionDetails;

    
    public RevokeRegisteredModelPermissionDetails getRevokeRegisteredModelPermissionDetails() {
        return revokeRegisteredModelPermissionDetails;
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
        sb.append("ManageRegisteredModelPermissionDetails(");
        sb.append("assignRegisteredModelPermissionDetails=").append(String.valueOf(this.assignRegisteredModelPermissionDetails));
        sb.append(", revokeRegisteredModelPermissionDetails=").append(String.valueOf(this.revokeRegisteredModelPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageRegisteredModelPermissionDetails)) {
            return false;
        }

        ManageRegisteredModelPermissionDetails other = (ManageRegisteredModelPermissionDetails) o;
        return java.util.Objects.equals(this.assignRegisteredModelPermissionDetails, other.assignRegisteredModelPermissionDetails) &&
            java.util.Objects.equals(this.revokeRegisteredModelPermissionDetails, other.revokeRegisteredModelPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignRegisteredModelPermissionDetails == null ? 43 : this.assignRegisteredModelPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeRegisteredModelPermissionDetails == null ? 43 : this.revokeRegisteredModelPermissionDetails.hashCode());
        return result;
    }


}
