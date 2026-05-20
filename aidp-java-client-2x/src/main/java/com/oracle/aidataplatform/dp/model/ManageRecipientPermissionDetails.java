// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a recipient.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageRecipientPermissionDetails.Builder.class)

public final class ManageRecipientPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignRecipientPermissionDetails", "revokeRecipientPermissionDetails"})
    public ManageRecipientPermissionDetails(AssignRecipientPermissionDetails assignRecipientPermissionDetails, RevokeRecipientPermissionDetails revokeRecipientPermissionDetails) {
        super();
        this.assignRecipientPermissionDetails = assignRecipientPermissionDetails;
        this.revokeRecipientPermissionDetails = revokeRecipientPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignRecipientPermissionDetails")
        private AssignRecipientPermissionDetails assignRecipientPermissionDetails;

        

        public Builder assignRecipientPermissionDetails(AssignRecipientPermissionDetails assignRecipientPermissionDetails) {
        this.assignRecipientPermissionDetails = assignRecipientPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeRecipientPermissionDetails")
        private RevokeRecipientPermissionDetails revokeRecipientPermissionDetails;

        

        public Builder revokeRecipientPermissionDetails(RevokeRecipientPermissionDetails revokeRecipientPermissionDetails) {
        this.revokeRecipientPermissionDetails = revokeRecipientPermissionDetails;
        return this;
        }


        public ManageRecipientPermissionDetails build() {
            ManageRecipientPermissionDetails model = new ManageRecipientPermissionDetails(this.assignRecipientPermissionDetails
                    , this.revokeRecipientPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageRecipientPermissionDetails model) {
                this.assignRecipientPermissionDetails(model.getAssignRecipientPermissionDetails());
    this.revokeRecipientPermissionDetails(model.getRevokeRecipientPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignRecipientPermissionDetails")
    private final AssignRecipientPermissionDetails assignRecipientPermissionDetails;

    
    public AssignRecipientPermissionDetails getAssignRecipientPermissionDetails() {
        return assignRecipientPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeRecipientPermissionDetails")
    private final RevokeRecipientPermissionDetails revokeRecipientPermissionDetails;

    
    public RevokeRecipientPermissionDetails getRevokeRecipientPermissionDetails() {
        return revokeRecipientPermissionDetails;
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
        sb.append("ManageRecipientPermissionDetails(");
        sb.append("assignRecipientPermissionDetails=").append(String.valueOf(this.assignRecipientPermissionDetails));
        sb.append(", revokeRecipientPermissionDetails=").append(String.valueOf(this.revokeRecipientPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageRecipientPermissionDetails)) {
            return false;
        }

        ManageRecipientPermissionDetails other = (ManageRecipientPermissionDetails) o;
        return java.util.Objects.equals(this.assignRecipientPermissionDetails, other.assignRecipientPermissionDetails) &&
            java.util.Objects.equals(this.revokeRecipientPermissionDetails, other.revokeRecipientPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignRecipientPermissionDetails == null ? 43 : this.assignRecipientPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeRecipientPermissionDetails == null ? 43 : this.revokeRecipientPermissionDetails.hashCode());
        return result;
    }


}
