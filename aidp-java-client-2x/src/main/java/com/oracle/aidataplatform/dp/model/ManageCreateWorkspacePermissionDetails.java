// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a workspace.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageCreateWorkspacePermissionDetails.Builder.class)

public final class ManageCreateWorkspacePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignCreateWorkspacePermissionDetails", "revokeCreateWorkspacePermissionDetails"})
    public ManageCreateWorkspacePermissionDetails(AssignCreateWorkspacePermissionDetails assignCreateWorkspacePermissionDetails, RevokeCreateWorkspacePermissionDetails revokeCreateWorkspacePermissionDetails) {
        super();
        this.assignCreateWorkspacePermissionDetails = assignCreateWorkspacePermissionDetails;
        this.revokeCreateWorkspacePermissionDetails = revokeCreateWorkspacePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignCreateWorkspacePermissionDetails")
        private AssignCreateWorkspacePermissionDetails assignCreateWorkspacePermissionDetails;

        

        public Builder assignCreateWorkspacePermissionDetails(AssignCreateWorkspacePermissionDetails assignCreateWorkspacePermissionDetails) {
        this.assignCreateWorkspacePermissionDetails = assignCreateWorkspacePermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeCreateWorkspacePermissionDetails")
        private RevokeCreateWorkspacePermissionDetails revokeCreateWorkspacePermissionDetails;

        

        public Builder revokeCreateWorkspacePermissionDetails(RevokeCreateWorkspacePermissionDetails revokeCreateWorkspacePermissionDetails) {
        this.revokeCreateWorkspacePermissionDetails = revokeCreateWorkspacePermissionDetails;
        return this;
        }


        public ManageCreateWorkspacePermissionDetails build() {
            ManageCreateWorkspacePermissionDetails model = new ManageCreateWorkspacePermissionDetails(this.assignCreateWorkspacePermissionDetails
                    , this.revokeCreateWorkspacePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageCreateWorkspacePermissionDetails model) {
                this.assignCreateWorkspacePermissionDetails(model.getAssignCreateWorkspacePermissionDetails());
    this.revokeCreateWorkspacePermissionDetails(model.getRevokeCreateWorkspacePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignCreateWorkspacePermissionDetails")
    private final AssignCreateWorkspacePermissionDetails assignCreateWorkspacePermissionDetails;

    
    public AssignCreateWorkspacePermissionDetails getAssignCreateWorkspacePermissionDetails() {
        return assignCreateWorkspacePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeCreateWorkspacePermissionDetails")
    private final RevokeCreateWorkspacePermissionDetails revokeCreateWorkspacePermissionDetails;

    
    public RevokeCreateWorkspacePermissionDetails getRevokeCreateWorkspacePermissionDetails() {
        return revokeCreateWorkspacePermissionDetails;
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
        sb.append("ManageCreateWorkspacePermissionDetails(");
        sb.append("assignCreateWorkspacePermissionDetails=").append(String.valueOf(this.assignCreateWorkspacePermissionDetails));
        sb.append(", revokeCreateWorkspacePermissionDetails=").append(String.valueOf(this.revokeCreateWorkspacePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageCreateWorkspacePermissionDetails)) {
            return false;
        }

        ManageCreateWorkspacePermissionDetails other = (ManageCreateWorkspacePermissionDetails) o;
        return java.util.Objects.equals(this.assignCreateWorkspacePermissionDetails, other.assignCreateWorkspacePermissionDetails) &&
            java.util.Objects.equals(this.revokeCreateWorkspacePermissionDetails, other.revokeCreateWorkspacePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignCreateWorkspacePermissionDetails == null ? 43 : this.assignCreateWorkspacePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeCreateWorkspacePermissionDetails == null ? 43 : this.revokeCreateWorkspacePermissionDetails.hashCode());
        return result;
    }


}
