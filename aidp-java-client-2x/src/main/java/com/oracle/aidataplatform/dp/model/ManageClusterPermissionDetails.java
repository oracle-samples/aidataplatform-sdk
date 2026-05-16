// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a cluster.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageClusterPermissionDetails.Builder.class)

public final class ManageClusterPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignClusterPermissionDetails", "revokeClusterPermissionDetails"})
    public ManageClusterPermissionDetails(AssignClusterPermissionDetails assignClusterPermissionDetails, RevokeClusterPermissionDetails revokeClusterPermissionDetails) {
        super();
        this.assignClusterPermissionDetails = assignClusterPermissionDetails;
        this.revokeClusterPermissionDetails = revokeClusterPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignClusterPermissionDetails")
        private AssignClusterPermissionDetails assignClusterPermissionDetails;

        

        public Builder assignClusterPermissionDetails(AssignClusterPermissionDetails assignClusterPermissionDetails) {
        this.assignClusterPermissionDetails = assignClusterPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeClusterPermissionDetails")
        private RevokeClusterPermissionDetails revokeClusterPermissionDetails;

        

        public Builder revokeClusterPermissionDetails(RevokeClusterPermissionDetails revokeClusterPermissionDetails) {
        this.revokeClusterPermissionDetails = revokeClusterPermissionDetails;
        return this;
        }


        public ManageClusterPermissionDetails build() {
            ManageClusterPermissionDetails model = new ManageClusterPermissionDetails(this.assignClusterPermissionDetails
                    , this.revokeClusterPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageClusterPermissionDetails model) {
                this.assignClusterPermissionDetails(model.getAssignClusterPermissionDetails());
    this.revokeClusterPermissionDetails(model.getRevokeClusterPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignClusterPermissionDetails")
    private final AssignClusterPermissionDetails assignClusterPermissionDetails;

    
    public AssignClusterPermissionDetails getAssignClusterPermissionDetails() {
        return assignClusterPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeClusterPermissionDetails")
    private final RevokeClusterPermissionDetails revokeClusterPermissionDetails;

    
    public RevokeClusterPermissionDetails getRevokeClusterPermissionDetails() {
        return revokeClusterPermissionDetails;
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
        sb.append("ManageClusterPermissionDetails(");
        sb.append("assignClusterPermissionDetails=").append(String.valueOf(this.assignClusterPermissionDetails));
        sb.append(", revokeClusterPermissionDetails=").append(String.valueOf(this.revokeClusterPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageClusterPermissionDetails)) {
            return false;
        }

        ManageClusterPermissionDetails other = (ManageClusterPermissionDetails) o;
        return java.util.Objects.equals(this.assignClusterPermissionDetails, other.assignClusterPermissionDetails) &&
            java.util.Objects.equals(this.revokeClusterPermissionDetails, other.revokeClusterPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignClusterPermissionDetails == null ? 43 : this.assignClusterPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeClusterPermissionDetails == null ? 43 : this.revokeClusterPermissionDetails.hashCode());
        return result;
    }


}
