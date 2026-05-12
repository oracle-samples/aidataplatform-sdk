package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a view.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageViewPermissionDetails.Builder.class)

public final class ManageViewPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignViewPermissionDetails", "revokeViewPermissionDetails"})
    public ManageViewPermissionDetails(AssignViewPermissionDetails assignViewPermissionDetails, RevokeViewPermissionDetails revokeViewPermissionDetails) {
        super();
        this.assignViewPermissionDetails = assignViewPermissionDetails;
        this.revokeViewPermissionDetails = revokeViewPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignViewPermissionDetails")
        private AssignViewPermissionDetails assignViewPermissionDetails;

        

        public Builder assignViewPermissionDetails(AssignViewPermissionDetails assignViewPermissionDetails) {
        this.assignViewPermissionDetails = assignViewPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeViewPermissionDetails")
        private RevokeViewPermissionDetails revokeViewPermissionDetails;

        

        public Builder revokeViewPermissionDetails(RevokeViewPermissionDetails revokeViewPermissionDetails) {
        this.revokeViewPermissionDetails = revokeViewPermissionDetails;
        return this;
        }


        public ManageViewPermissionDetails build() {
            ManageViewPermissionDetails model = new ManageViewPermissionDetails(this.assignViewPermissionDetails
                    , this.revokeViewPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageViewPermissionDetails model) {
                this.assignViewPermissionDetails(model.getAssignViewPermissionDetails());
    this.revokeViewPermissionDetails(model.getRevokeViewPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignViewPermissionDetails")
    private final AssignViewPermissionDetails assignViewPermissionDetails;

    
    public AssignViewPermissionDetails getAssignViewPermissionDetails() {
        return assignViewPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeViewPermissionDetails")
    private final RevokeViewPermissionDetails revokeViewPermissionDetails;

    
    public RevokeViewPermissionDetails getRevokeViewPermissionDetails() {
        return revokeViewPermissionDetails;
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
        sb.append("ManageViewPermissionDetails(");
        sb.append("assignViewPermissionDetails=").append(String.valueOf(this.assignViewPermissionDetails));
        sb.append(", revokeViewPermissionDetails=").append(String.valueOf(this.revokeViewPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageViewPermissionDetails)) {
            return false;
        }

        ManageViewPermissionDetails other = (ManageViewPermissionDetails) o;
        return java.util.Objects.equals(this.assignViewPermissionDetails, other.assignViewPermissionDetails) &&
            java.util.Objects.equals(this.revokeViewPermissionDetails, other.revokeViewPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignViewPermissionDetails == null ? 43 : this.assignViewPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeViewPermissionDetails == null ? 43 : this.revokeViewPermissionDetails.hashCode());
        return result;
    }


}
