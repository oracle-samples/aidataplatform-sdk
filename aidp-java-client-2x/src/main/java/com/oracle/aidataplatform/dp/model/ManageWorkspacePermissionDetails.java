package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a workspace.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageWorkspacePermissionDetails.Builder.class)

public final class ManageWorkspacePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignWorkspacePermissionDetails", "revokeWorkspacePermissionDetails"})
    public ManageWorkspacePermissionDetails(AssignWorkspacePermissionDetails assignWorkspacePermissionDetails, RevokeWorkspacePermissionDetails revokeWorkspacePermissionDetails) {
        super();
        this.assignWorkspacePermissionDetails = assignWorkspacePermissionDetails;
        this.revokeWorkspacePermissionDetails = revokeWorkspacePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignWorkspacePermissionDetails")
        private AssignWorkspacePermissionDetails assignWorkspacePermissionDetails;

        

        public Builder assignWorkspacePermissionDetails(AssignWorkspacePermissionDetails assignWorkspacePermissionDetails) {
        this.assignWorkspacePermissionDetails = assignWorkspacePermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeWorkspacePermissionDetails")
        private RevokeWorkspacePermissionDetails revokeWorkspacePermissionDetails;

        

        public Builder revokeWorkspacePermissionDetails(RevokeWorkspacePermissionDetails revokeWorkspacePermissionDetails) {
        this.revokeWorkspacePermissionDetails = revokeWorkspacePermissionDetails;
        return this;
        }


        public ManageWorkspacePermissionDetails build() {
            ManageWorkspacePermissionDetails model = new ManageWorkspacePermissionDetails(this.assignWorkspacePermissionDetails
                    , this.revokeWorkspacePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageWorkspacePermissionDetails model) {
                this.assignWorkspacePermissionDetails(model.getAssignWorkspacePermissionDetails());
    this.revokeWorkspacePermissionDetails(model.getRevokeWorkspacePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignWorkspacePermissionDetails")
    private final AssignWorkspacePermissionDetails assignWorkspacePermissionDetails;

    
    public AssignWorkspacePermissionDetails getAssignWorkspacePermissionDetails() {
        return assignWorkspacePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeWorkspacePermissionDetails")
    private final RevokeWorkspacePermissionDetails revokeWorkspacePermissionDetails;

    
    public RevokeWorkspacePermissionDetails getRevokeWorkspacePermissionDetails() {
        return revokeWorkspacePermissionDetails;
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
        sb.append("ManageWorkspacePermissionDetails(");
        sb.append("assignWorkspacePermissionDetails=").append(String.valueOf(this.assignWorkspacePermissionDetails));
        sb.append(", revokeWorkspacePermissionDetails=").append(String.valueOf(this.revokeWorkspacePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageWorkspacePermissionDetails)) {
            return false;
        }

        ManageWorkspacePermissionDetails other = (ManageWorkspacePermissionDetails) o;
        return java.util.Objects.equals(this.assignWorkspacePermissionDetails, other.assignWorkspacePermissionDetails) &&
            java.util.Objects.equals(this.revokeWorkspacePermissionDetails, other.revokeWorkspacePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignWorkspacePermissionDetails == null ? 43 : this.assignWorkspacePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeWorkspacePermissionDetails == null ? 43 : this.revokeWorkspacePermissionDetails.hashCode());
        return result;
    }


}
