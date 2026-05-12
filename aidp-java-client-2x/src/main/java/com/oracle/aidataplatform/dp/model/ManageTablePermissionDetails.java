package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageTablePermissionDetails.Builder.class)

public final class ManageTablePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignTablePermissionDetails", "revokeTablePermissionDetails"})
    public ManageTablePermissionDetails(AssignTablePermissionDetails assignTablePermissionDetails, RevokeTablePermissionDetails revokeTablePermissionDetails) {
        super();
        this.assignTablePermissionDetails = assignTablePermissionDetails;
        this.revokeTablePermissionDetails = revokeTablePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignTablePermissionDetails")
        private AssignTablePermissionDetails assignTablePermissionDetails;

        

        public Builder assignTablePermissionDetails(AssignTablePermissionDetails assignTablePermissionDetails) {
        this.assignTablePermissionDetails = assignTablePermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeTablePermissionDetails")
        private RevokeTablePermissionDetails revokeTablePermissionDetails;

        

        public Builder revokeTablePermissionDetails(RevokeTablePermissionDetails revokeTablePermissionDetails) {
        this.revokeTablePermissionDetails = revokeTablePermissionDetails;
        return this;
        }


        public ManageTablePermissionDetails build() {
            ManageTablePermissionDetails model = new ManageTablePermissionDetails(this.assignTablePermissionDetails
                    , this.revokeTablePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageTablePermissionDetails model) {
                this.assignTablePermissionDetails(model.getAssignTablePermissionDetails());
    this.revokeTablePermissionDetails(model.getRevokeTablePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignTablePermissionDetails")
    private final AssignTablePermissionDetails assignTablePermissionDetails;

    
    public AssignTablePermissionDetails getAssignTablePermissionDetails() {
        return assignTablePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeTablePermissionDetails")
    private final RevokeTablePermissionDetails revokeTablePermissionDetails;

    
    public RevokeTablePermissionDetails getRevokeTablePermissionDetails() {
        return revokeTablePermissionDetails;
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
        sb.append("ManageTablePermissionDetails(");
        sb.append("assignTablePermissionDetails=").append(String.valueOf(this.assignTablePermissionDetails));
        sb.append(", revokeTablePermissionDetails=").append(String.valueOf(this.revokeTablePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageTablePermissionDetails)) {
            return false;
        }

        ManageTablePermissionDetails other = (ManageTablePermissionDetails) o;
        return java.util.Objects.equals(this.assignTablePermissionDetails, other.assignTablePermissionDetails) &&
            java.util.Objects.equals(this.revokeTablePermissionDetails, other.revokeTablePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignTablePermissionDetails == null ? 43 : this.assignTablePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeTablePermissionDetails == null ? 43 : this.revokeTablePermissionDetails.hashCode());
        return result;
    }


}
