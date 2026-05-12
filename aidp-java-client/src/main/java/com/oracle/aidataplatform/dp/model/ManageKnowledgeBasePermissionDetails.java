package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a Knowledge Base.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageKnowledgeBasePermissionDetails.Builder.class)

public final class ManageKnowledgeBasePermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignKnowledgeBasePermissionDetails", "revokeKnowledgeBasePermissionDetails"})
    public ManageKnowledgeBasePermissionDetails(AssignKnowledgeBasePermissionDetails assignKnowledgeBasePermissionDetails, RevokeKnowledgeBasePermissionDetails revokeKnowledgeBasePermissionDetails) {
        super();
        this.assignKnowledgeBasePermissionDetails = assignKnowledgeBasePermissionDetails;
        this.revokeKnowledgeBasePermissionDetails = revokeKnowledgeBasePermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignKnowledgeBasePermissionDetails")
private AssignKnowledgeBasePermissionDetails assignKnowledgeBasePermissionDetails;



public Builder assignKnowledgeBasePermissionDetails(AssignKnowledgeBasePermissionDetails assignKnowledgeBasePermissionDetails) {
    this.assignKnowledgeBasePermissionDetails = assignKnowledgeBasePermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeKnowledgeBasePermissionDetails")
private RevokeKnowledgeBasePermissionDetails revokeKnowledgeBasePermissionDetails;



public Builder revokeKnowledgeBasePermissionDetails(RevokeKnowledgeBasePermissionDetails revokeKnowledgeBasePermissionDetails) {
    this.revokeKnowledgeBasePermissionDetails = revokeKnowledgeBasePermissionDetails;
    return this;
}


        public ManageKnowledgeBasePermissionDetails build() {
            ManageKnowledgeBasePermissionDetails model = new ManageKnowledgeBasePermissionDetails(this.assignKnowledgeBasePermissionDetails
                , this.revokeKnowledgeBasePermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageKnowledgeBasePermissionDetails model) {
                this.assignKnowledgeBasePermissionDetails(model.getAssignKnowledgeBasePermissionDetails());
    this.revokeKnowledgeBasePermissionDetails(model.getRevokeKnowledgeBasePermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignKnowledgeBasePermissionDetails")
    private final AssignKnowledgeBasePermissionDetails assignKnowledgeBasePermissionDetails;

    
    public AssignKnowledgeBasePermissionDetails getAssignKnowledgeBasePermissionDetails() {
        return assignKnowledgeBasePermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeKnowledgeBasePermissionDetails")
    private final RevokeKnowledgeBasePermissionDetails revokeKnowledgeBasePermissionDetails;

    
    public RevokeKnowledgeBasePermissionDetails getRevokeKnowledgeBasePermissionDetails() {
        return revokeKnowledgeBasePermissionDetails;
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
        sb.append("ManageKnowledgeBasePermissionDetails(");
        sb.append("assignKnowledgeBasePermissionDetails=").append(String.valueOf(this.assignKnowledgeBasePermissionDetails));
        sb.append(", revokeKnowledgeBasePermissionDetails=").append(String.valueOf(this.revokeKnowledgeBasePermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageKnowledgeBasePermissionDetails)) {
            return false;
        }

        ManageKnowledgeBasePermissionDetails other = (ManageKnowledgeBasePermissionDetails) o;
        return java.util.Objects.equals(this.assignKnowledgeBasePermissionDetails, other.assignKnowledgeBasePermissionDetails) &&
            java.util.Objects.equals(this.revokeKnowledgeBasePermissionDetails, other.revokeKnowledgeBasePermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignKnowledgeBasePermissionDetails == null ? 43 : this.assignKnowledgeBasePermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeKnowledgeBasePermissionDetails == null ? 43 : this.revokeKnowledgeBasePermissionDetails.hashCode());
        return result;
    }


}
