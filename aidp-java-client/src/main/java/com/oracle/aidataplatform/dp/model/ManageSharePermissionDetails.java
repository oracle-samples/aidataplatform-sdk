package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a share.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageSharePermissionDetails.Builder.class)

public final class ManageSharePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignSharePermissionDetails", "revokeSharePermissionDetails"})
    public ManageSharePermissionDetails(AssignSharePermissionDetails assignSharePermissionDetails, RevokeSharePermissionDetails revokeSharePermissionDetails) {
        super();
        this.assignSharePermissionDetails = assignSharePermissionDetails;
        this.revokeSharePermissionDetails = revokeSharePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignSharePermissionDetails")
private AssignSharePermissionDetails assignSharePermissionDetails;



public Builder assignSharePermissionDetails(AssignSharePermissionDetails assignSharePermissionDetails) {
    this.assignSharePermissionDetails = assignSharePermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeSharePermissionDetails")
private RevokeSharePermissionDetails revokeSharePermissionDetails;



public Builder revokeSharePermissionDetails(RevokeSharePermissionDetails revokeSharePermissionDetails) {
    this.revokeSharePermissionDetails = revokeSharePermissionDetails;
    return this;
}


        public ManageSharePermissionDetails build() {
            ManageSharePermissionDetails model = new ManageSharePermissionDetails(this.assignSharePermissionDetails
                , this.revokeSharePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageSharePermissionDetails model) {
                this.assignSharePermissionDetails(model.getAssignSharePermissionDetails());
    this.revokeSharePermissionDetails(model.getRevokeSharePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignSharePermissionDetails")
    private final AssignSharePermissionDetails assignSharePermissionDetails;

    
    public AssignSharePermissionDetails getAssignSharePermissionDetails() {
        return assignSharePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeSharePermissionDetails")
    private final RevokeSharePermissionDetails revokeSharePermissionDetails;

    
    public RevokeSharePermissionDetails getRevokeSharePermissionDetails() {
        return revokeSharePermissionDetails;
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
        sb.append("ManageSharePermissionDetails(");
        sb.append("assignSharePermissionDetails=").append(String.valueOf(this.assignSharePermissionDetails));
        sb.append(", revokeSharePermissionDetails=").append(String.valueOf(this.revokeSharePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageSharePermissionDetails)) {
            return false;
        }

        ManageSharePermissionDetails other = (ManageSharePermissionDetails) o;
        return java.util.Objects.equals(this.assignSharePermissionDetails, other.assignSharePermissionDetails) &&
            java.util.Objects.equals(this.revokeSharePermissionDetails, other.revokeSharePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignSharePermissionDetails == null ? 43 : this.assignSharePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeSharePermissionDetails == null ? 43 : this.revokeSharePermissionDetails.hashCode());
        return result;
    }


}
