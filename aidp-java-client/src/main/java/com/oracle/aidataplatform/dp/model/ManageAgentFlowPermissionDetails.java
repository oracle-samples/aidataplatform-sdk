// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a Agent flow.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageAgentFlowPermissionDetails.Builder.class)

public final class ManageAgentFlowPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignAgentFlowPermissionDetails", "revokeAgentFlowPermissionDetails"})
    public ManageAgentFlowPermissionDetails(AssignAgentFlowPermissionDetails assignAgentFlowPermissionDetails, RevokeAgentFlowPermissionDetails revokeAgentFlowPermissionDetails) {
        super();
        this.assignAgentFlowPermissionDetails = assignAgentFlowPermissionDetails;
        this.revokeAgentFlowPermissionDetails = revokeAgentFlowPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignAgentFlowPermissionDetails")
private AssignAgentFlowPermissionDetails assignAgentFlowPermissionDetails;



public Builder assignAgentFlowPermissionDetails(AssignAgentFlowPermissionDetails assignAgentFlowPermissionDetails) {
    this.assignAgentFlowPermissionDetails = assignAgentFlowPermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeAgentFlowPermissionDetails")
private RevokeAgentFlowPermissionDetails revokeAgentFlowPermissionDetails;



public Builder revokeAgentFlowPermissionDetails(RevokeAgentFlowPermissionDetails revokeAgentFlowPermissionDetails) {
    this.revokeAgentFlowPermissionDetails = revokeAgentFlowPermissionDetails;
    return this;
}


        public ManageAgentFlowPermissionDetails build() {
            ManageAgentFlowPermissionDetails model = new ManageAgentFlowPermissionDetails(this.assignAgentFlowPermissionDetails
                , this.revokeAgentFlowPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageAgentFlowPermissionDetails model) {
                this.assignAgentFlowPermissionDetails(model.getAssignAgentFlowPermissionDetails());
    this.revokeAgentFlowPermissionDetails(model.getRevokeAgentFlowPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignAgentFlowPermissionDetails")
    private final AssignAgentFlowPermissionDetails assignAgentFlowPermissionDetails;

    
    public AssignAgentFlowPermissionDetails getAssignAgentFlowPermissionDetails() {
        return assignAgentFlowPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeAgentFlowPermissionDetails")
    private final RevokeAgentFlowPermissionDetails revokeAgentFlowPermissionDetails;

    
    public RevokeAgentFlowPermissionDetails getRevokeAgentFlowPermissionDetails() {
        return revokeAgentFlowPermissionDetails;
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
        sb.append("ManageAgentFlowPermissionDetails(");
        sb.append("assignAgentFlowPermissionDetails=").append(String.valueOf(this.assignAgentFlowPermissionDetails));
        sb.append(", revokeAgentFlowPermissionDetails=").append(String.valueOf(this.revokeAgentFlowPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageAgentFlowPermissionDetails)) {
            return false;
        }

        ManageAgentFlowPermissionDetails other = (ManageAgentFlowPermissionDetails) o;
        return java.util.Objects.equals(this.assignAgentFlowPermissionDetails, other.assignAgentFlowPermissionDetails) &&
            java.util.Objects.equals(this.revokeAgentFlowPermissionDetails, other.revokeAgentFlowPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignAgentFlowPermissionDetails == null ? 43 : this.assignAgentFlowPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeAgentFlowPermissionDetails == null ? 43 : this.revokeAgentFlowPermissionDetails.hashCode());
        return result;
    }


}
