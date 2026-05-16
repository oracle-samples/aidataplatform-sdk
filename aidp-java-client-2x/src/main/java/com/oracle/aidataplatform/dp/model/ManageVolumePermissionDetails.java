// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a volume.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageVolumePermissionDetails.Builder.class)

public final class ManageVolumePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignVolumePermissionDetails", "revokeVolumePermissionDetails"})
    public ManageVolumePermissionDetails(AssignVolumePermissionDetails assignVolumePermissionDetails, RevokeVolumePermissionDetails revokeVolumePermissionDetails) {
        super();
        this.assignVolumePermissionDetails = assignVolumePermissionDetails;
        this.revokeVolumePermissionDetails = revokeVolumePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignVolumePermissionDetails")
        private AssignVolumePermissionDetails assignVolumePermissionDetails;

        

        public Builder assignVolumePermissionDetails(AssignVolumePermissionDetails assignVolumePermissionDetails) {
        this.assignVolumePermissionDetails = assignVolumePermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeVolumePermissionDetails")
        private RevokeVolumePermissionDetails revokeVolumePermissionDetails;

        

        public Builder revokeVolumePermissionDetails(RevokeVolumePermissionDetails revokeVolumePermissionDetails) {
        this.revokeVolumePermissionDetails = revokeVolumePermissionDetails;
        return this;
        }


        public ManageVolumePermissionDetails build() {
            ManageVolumePermissionDetails model = new ManageVolumePermissionDetails(this.assignVolumePermissionDetails
                    , this.revokeVolumePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageVolumePermissionDetails model) {
                this.assignVolumePermissionDetails(model.getAssignVolumePermissionDetails());
    this.revokeVolumePermissionDetails(model.getRevokeVolumePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignVolumePermissionDetails")
    private final AssignVolumePermissionDetails assignVolumePermissionDetails;

    
    public AssignVolumePermissionDetails getAssignVolumePermissionDetails() {
        return assignVolumePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeVolumePermissionDetails")
    private final RevokeVolumePermissionDetails revokeVolumePermissionDetails;

    
    public RevokeVolumePermissionDetails getRevokeVolumePermissionDetails() {
        return revokeVolumePermissionDetails;
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
        sb.append("ManageVolumePermissionDetails(");
        sb.append("assignVolumePermissionDetails=").append(String.valueOf(this.assignVolumePermissionDetails));
        sb.append(", revokeVolumePermissionDetails=").append(String.valueOf(this.revokeVolumePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageVolumePermissionDetails)) {
            return false;
        }

        ManageVolumePermissionDetails other = (ManageVolumePermissionDetails) o;
        return java.util.Objects.equals(this.assignVolumePermissionDetails, other.assignVolumePermissionDetails) &&
            java.util.Objects.equals(this.revokeVolumePermissionDetails, other.revokeVolumePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignVolumePermissionDetails == null ? 43 : this.assignVolumePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeVolumePermissionDetails == null ? 43 : this.revokeVolumePermissionDetails.hashCode());
        return result;
    }


}
