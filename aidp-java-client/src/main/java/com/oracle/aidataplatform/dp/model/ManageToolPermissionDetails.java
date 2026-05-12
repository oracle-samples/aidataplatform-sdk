package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a tool.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageToolPermissionDetails.Builder.class)

public final class ManageToolPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignToolPermissionDetails", "revokeToolPermissionDetails"})
    public ManageToolPermissionDetails(AssignToolPermissionDetails assignToolPermissionDetails, RevokeToolPermissionDetails revokeToolPermissionDetails) {
        super();
        this.assignToolPermissionDetails = assignToolPermissionDetails;
        this.revokeToolPermissionDetails = revokeToolPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignToolPermissionDetails")
private AssignToolPermissionDetails assignToolPermissionDetails;



public Builder assignToolPermissionDetails(AssignToolPermissionDetails assignToolPermissionDetails) {
    this.assignToolPermissionDetails = assignToolPermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeToolPermissionDetails")
private RevokeToolPermissionDetails revokeToolPermissionDetails;



public Builder revokeToolPermissionDetails(RevokeToolPermissionDetails revokeToolPermissionDetails) {
    this.revokeToolPermissionDetails = revokeToolPermissionDetails;
    return this;
}


        public ManageToolPermissionDetails build() {
            ManageToolPermissionDetails model = new ManageToolPermissionDetails(this.assignToolPermissionDetails
                , this.revokeToolPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageToolPermissionDetails model) {
                this.assignToolPermissionDetails(model.getAssignToolPermissionDetails());
    this.revokeToolPermissionDetails(model.getRevokeToolPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignToolPermissionDetails")
    private final AssignToolPermissionDetails assignToolPermissionDetails;

    
    public AssignToolPermissionDetails getAssignToolPermissionDetails() {
        return assignToolPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeToolPermissionDetails")
    private final RevokeToolPermissionDetails revokeToolPermissionDetails;

    
    public RevokeToolPermissionDetails getRevokeToolPermissionDetails() {
        return revokeToolPermissionDetails;
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
        sb.append("ManageToolPermissionDetails(");
        sb.append("assignToolPermissionDetails=").append(String.valueOf(this.assignToolPermissionDetails));
        sb.append(", revokeToolPermissionDetails=").append(String.valueOf(this.revokeToolPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageToolPermissionDetails)) {
            return false;
        }

        ManageToolPermissionDetails other = (ManageToolPermissionDetails) o;
        return java.util.Objects.equals(this.assignToolPermissionDetails, other.assignToolPermissionDetails) &&
            java.util.Objects.equals(this.revokeToolPermissionDetails, other.revokeToolPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignToolPermissionDetails == null ? 43 : this.assignToolPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeToolPermissionDetails == null ? 43 : this.revokeToolPermissionDetails.hashCode());
        return result;
    }


}
