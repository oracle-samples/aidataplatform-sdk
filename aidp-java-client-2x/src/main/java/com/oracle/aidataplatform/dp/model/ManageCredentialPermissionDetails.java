package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a Credential.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageCredentialPermissionDetails.Builder.class)

public final class ManageCredentialPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignCredentialPermissionDetails", "revokeCredentialPermissionDetails"})
    public ManageCredentialPermissionDetails(AssignCredentialPermissionDetails assignCredentialPermissionDetails, RevokeCredentialPermissionDetails revokeCredentialPermissionDetails) {
        super();
        this.assignCredentialPermissionDetails = assignCredentialPermissionDetails;
        this.revokeCredentialPermissionDetails = revokeCredentialPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignCredentialPermissionDetails")
        private AssignCredentialPermissionDetails assignCredentialPermissionDetails;

        

        public Builder assignCredentialPermissionDetails(AssignCredentialPermissionDetails assignCredentialPermissionDetails) {
        this.assignCredentialPermissionDetails = assignCredentialPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeCredentialPermissionDetails")
        private RevokeCredentialPermissionDetails revokeCredentialPermissionDetails;

        

        public Builder revokeCredentialPermissionDetails(RevokeCredentialPermissionDetails revokeCredentialPermissionDetails) {
        this.revokeCredentialPermissionDetails = revokeCredentialPermissionDetails;
        return this;
        }


        public ManageCredentialPermissionDetails build() {
            ManageCredentialPermissionDetails model = new ManageCredentialPermissionDetails(this.assignCredentialPermissionDetails
                    , this.revokeCredentialPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageCredentialPermissionDetails model) {
                this.assignCredentialPermissionDetails(model.getAssignCredentialPermissionDetails());
    this.revokeCredentialPermissionDetails(model.getRevokeCredentialPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignCredentialPermissionDetails")
    private final AssignCredentialPermissionDetails assignCredentialPermissionDetails;

    
    public AssignCredentialPermissionDetails getAssignCredentialPermissionDetails() {
        return assignCredentialPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeCredentialPermissionDetails")
    private final RevokeCredentialPermissionDetails revokeCredentialPermissionDetails;

    
    public RevokeCredentialPermissionDetails getRevokeCredentialPermissionDetails() {
        return revokeCredentialPermissionDetails;
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
        sb.append("ManageCredentialPermissionDetails(");
        sb.append("assignCredentialPermissionDetails=").append(String.valueOf(this.assignCredentialPermissionDetails));
        sb.append(", revokeCredentialPermissionDetails=").append(String.valueOf(this.revokeCredentialPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageCredentialPermissionDetails)) {
            return false;
        }

        ManageCredentialPermissionDetails other = (ManageCredentialPermissionDetails) o;
        return java.util.Objects.equals(this.assignCredentialPermissionDetails, other.assignCredentialPermissionDetails) &&
            java.util.Objects.equals(this.revokeCredentialPermissionDetails, other.revokeCredentialPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignCredentialPermissionDetails == null ? 43 : this.assignCredentialPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeCredentialPermissionDetails == null ? 43 : this.revokeCredentialPermissionDetails.hashCode());
        return result;
    }


}
