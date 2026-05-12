package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a job.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageJobPermissionDetails.Builder.class)

public final class ManageJobPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignJobPermissionDetails", "revokeJobPermissionDetails"})
    public ManageJobPermissionDetails(AssignJobPermissionDetails assignJobPermissionDetails, RevokeJobPermissionDetails revokeJobPermissionDetails) {
        super();
        this.assignJobPermissionDetails = assignJobPermissionDetails;
        this.revokeJobPermissionDetails = revokeJobPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignJobPermissionDetails")
        private AssignJobPermissionDetails assignJobPermissionDetails;

        

        public Builder assignJobPermissionDetails(AssignJobPermissionDetails assignJobPermissionDetails) {
        this.assignJobPermissionDetails = assignJobPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeJobPermissionDetails")
        private RevokeJobPermissionDetails revokeJobPermissionDetails;

        

        public Builder revokeJobPermissionDetails(RevokeJobPermissionDetails revokeJobPermissionDetails) {
        this.revokeJobPermissionDetails = revokeJobPermissionDetails;
        return this;
        }


        public ManageJobPermissionDetails build() {
            ManageJobPermissionDetails model = new ManageJobPermissionDetails(this.assignJobPermissionDetails
                    , this.revokeJobPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageJobPermissionDetails model) {
                this.assignJobPermissionDetails(model.getAssignJobPermissionDetails());
    this.revokeJobPermissionDetails(model.getRevokeJobPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignJobPermissionDetails")
    private final AssignJobPermissionDetails assignJobPermissionDetails;

    
    public AssignJobPermissionDetails getAssignJobPermissionDetails() {
        return assignJobPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeJobPermissionDetails")
    private final RevokeJobPermissionDetails revokeJobPermissionDetails;

    
    public RevokeJobPermissionDetails getRevokeJobPermissionDetails() {
        return revokeJobPermissionDetails;
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
        sb.append("ManageJobPermissionDetails(");
        sb.append("assignJobPermissionDetails=").append(String.valueOf(this.assignJobPermissionDetails));
        sb.append(", revokeJobPermissionDetails=").append(String.valueOf(this.revokeJobPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageJobPermissionDetails)) {
            return false;
        }

        ManageJobPermissionDetails other = (ManageJobPermissionDetails) o;
        return java.util.Objects.equals(this.assignJobPermissionDetails, other.assignJobPermissionDetails) &&
            java.util.Objects.equals(this.revokeJobPermissionDetails, other.revokeJobPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignJobPermissionDetails == null ? 43 : this.assignJobPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeJobPermissionDetails == null ? 43 : this.revokeJobPermissionDetails.hashCode());
        return result;
    }


}
