// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageAgentPermissionDetails.Builder.class)

public final class ManageAgentPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignAgentPermissionDetails", "revokeAgentPermissionDetails"})
    public ManageAgentPermissionDetails(AssignAgentPermissionDetails assignAgentPermissionDetails, RevokeAgentPermissionDetails revokeAgentPermissionDetails) {
        super();
        this.assignAgentPermissionDetails = assignAgentPermissionDetails;
        this.revokeAgentPermissionDetails = revokeAgentPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignAgentPermissionDetails")
private AssignAgentPermissionDetails assignAgentPermissionDetails;



public Builder assignAgentPermissionDetails(AssignAgentPermissionDetails assignAgentPermissionDetails) {
    this.assignAgentPermissionDetails = assignAgentPermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeAgentPermissionDetails")
private RevokeAgentPermissionDetails revokeAgentPermissionDetails;



public Builder revokeAgentPermissionDetails(RevokeAgentPermissionDetails revokeAgentPermissionDetails) {
    this.revokeAgentPermissionDetails = revokeAgentPermissionDetails;
    return this;
}


        public ManageAgentPermissionDetails build() {
            ManageAgentPermissionDetails model = new ManageAgentPermissionDetails(this.assignAgentPermissionDetails
                , this.revokeAgentPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageAgentPermissionDetails model) {
                this.assignAgentPermissionDetails(model.getAssignAgentPermissionDetails());
    this.revokeAgentPermissionDetails(model.getRevokeAgentPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignAgentPermissionDetails")
    private final AssignAgentPermissionDetails assignAgentPermissionDetails;

    
    public AssignAgentPermissionDetails getAssignAgentPermissionDetails() {
        return assignAgentPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeAgentPermissionDetails")
    private final RevokeAgentPermissionDetails revokeAgentPermissionDetails;

    
    public RevokeAgentPermissionDetails getRevokeAgentPermissionDetails() {
        return revokeAgentPermissionDetails;
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
        sb.append("ManageAgentPermissionDetails(");
        sb.append("assignAgentPermissionDetails=").append(String.valueOf(this.assignAgentPermissionDetails));
        sb.append(", revokeAgentPermissionDetails=").append(String.valueOf(this.revokeAgentPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageAgentPermissionDetails)) {
            return false;
        }

        ManageAgentPermissionDetails other = (ManageAgentPermissionDetails) o;
        return java.util.Objects.equals(this.assignAgentPermissionDetails, other.assignAgentPermissionDetails) &&
            java.util.Objects.equals(this.revokeAgentPermissionDetails, other.revokeAgentPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignAgentPermissionDetails == null ? 43 : this.assignAgentPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeAgentPermissionDetails == null ? 43 : this.revokeAgentPermissionDetails.hashCode());
        return result;
    }


}
