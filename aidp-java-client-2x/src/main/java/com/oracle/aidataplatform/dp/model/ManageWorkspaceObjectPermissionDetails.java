// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a workspace object.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageWorkspaceObjectPermissionDetails.Builder.class)

public final class ManageWorkspaceObjectPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignWorkspaceObjectPermissionDetails", "revokeWorkspaceObjectPermissionDetails"})
    public ManageWorkspaceObjectPermissionDetails(AssignWorkspaceObjectPermissionDetails assignWorkspaceObjectPermissionDetails, RevokeWorkspaceObjectPermissionDetails revokeWorkspaceObjectPermissionDetails) {
        super();
        this.assignWorkspaceObjectPermissionDetails = assignWorkspaceObjectPermissionDetails;
        this.revokeWorkspaceObjectPermissionDetails = revokeWorkspaceObjectPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignWorkspaceObjectPermissionDetails")
        private AssignWorkspaceObjectPermissionDetails assignWorkspaceObjectPermissionDetails;

        

        public Builder assignWorkspaceObjectPermissionDetails(AssignWorkspaceObjectPermissionDetails assignWorkspaceObjectPermissionDetails) {
        this.assignWorkspaceObjectPermissionDetails = assignWorkspaceObjectPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeWorkspaceObjectPermissionDetails")
        private RevokeWorkspaceObjectPermissionDetails revokeWorkspaceObjectPermissionDetails;

        

        public Builder revokeWorkspaceObjectPermissionDetails(RevokeWorkspaceObjectPermissionDetails revokeWorkspaceObjectPermissionDetails) {
        this.revokeWorkspaceObjectPermissionDetails = revokeWorkspaceObjectPermissionDetails;
        return this;
        }


        public ManageWorkspaceObjectPermissionDetails build() {
            ManageWorkspaceObjectPermissionDetails model = new ManageWorkspaceObjectPermissionDetails(this.assignWorkspaceObjectPermissionDetails
                    , this.revokeWorkspaceObjectPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageWorkspaceObjectPermissionDetails model) {
                this.assignWorkspaceObjectPermissionDetails(model.getAssignWorkspaceObjectPermissionDetails());
    this.revokeWorkspaceObjectPermissionDetails(model.getRevokeWorkspaceObjectPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignWorkspaceObjectPermissionDetails")
    private final AssignWorkspaceObjectPermissionDetails assignWorkspaceObjectPermissionDetails;

    
    public AssignWorkspaceObjectPermissionDetails getAssignWorkspaceObjectPermissionDetails() {
        return assignWorkspaceObjectPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeWorkspaceObjectPermissionDetails")
    private final RevokeWorkspaceObjectPermissionDetails revokeWorkspaceObjectPermissionDetails;

    
    public RevokeWorkspaceObjectPermissionDetails getRevokeWorkspaceObjectPermissionDetails() {
        return revokeWorkspaceObjectPermissionDetails;
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
        sb.append("ManageWorkspaceObjectPermissionDetails(");
        sb.append("assignWorkspaceObjectPermissionDetails=").append(String.valueOf(this.assignWorkspaceObjectPermissionDetails));
        sb.append(", revokeWorkspaceObjectPermissionDetails=").append(String.valueOf(this.revokeWorkspaceObjectPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageWorkspaceObjectPermissionDetails)) {
            return false;
        }

        ManageWorkspaceObjectPermissionDetails other = (ManageWorkspaceObjectPermissionDetails) o;
        return java.util.Objects.equals(this.assignWorkspaceObjectPermissionDetails, other.assignWorkspaceObjectPermissionDetails) &&
            java.util.Objects.equals(this.revokeWorkspaceObjectPermissionDetails, other.revokeWorkspaceObjectPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignWorkspaceObjectPermissionDetails == null ? 43 : this.assignWorkspaceObjectPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeWorkspaceObjectPermissionDetails == null ? 43 : this.revokeWorkspaceObjectPermissionDetails.hashCode());
        return result;
    }


}
