// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageSchemaPermissionDetails.Builder.class)

public final class ManageSchemaPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignSchemaPermissionDetails", "revokeSchemaPermissionDetails"})
    public ManageSchemaPermissionDetails(AssignSchemaPermissionDetails assignSchemaPermissionDetails, RevokeSchemaPermissionDetails revokeSchemaPermissionDetails) {
        super();
        this.assignSchemaPermissionDetails = assignSchemaPermissionDetails;
        this.revokeSchemaPermissionDetails = revokeSchemaPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignSchemaPermissionDetails")
        private AssignSchemaPermissionDetails assignSchemaPermissionDetails;

        

        public Builder assignSchemaPermissionDetails(AssignSchemaPermissionDetails assignSchemaPermissionDetails) {
        this.assignSchemaPermissionDetails = assignSchemaPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeSchemaPermissionDetails")
        private RevokeSchemaPermissionDetails revokeSchemaPermissionDetails;

        

        public Builder revokeSchemaPermissionDetails(RevokeSchemaPermissionDetails revokeSchemaPermissionDetails) {
        this.revokeSchemaPermissionDetails = revokeSchemaPermissionDetails;
        return this;
        }


        public ManageSchemaPermissionDetails build() {
            ManageSchemaPermissionDetails model = new ManageSchemaPermissionDetails(this.assignSchemaPermissionDetails
                    , this.revokeSchemaPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageSchemaPermissionDetails model) {
                this.assignSchemaPermissionDetails(model.getAssignSchemaPermissionDetails());
    this.revokeSchemaPermissionDetails(model.getRevokeSchemaPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignSchemaPermissionDetails")
    private final AssignSchemaPermissionDetails assignSchemaPermissionDetails;

    
    public AssignSchemaPermissionDetails getAssignSchemaPermissionDetails() {
        return assignSchemaPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeSchemaPermissionDetails")
    private final RevokeSchemaPermissionDetails revokeSchemaPermissionDetails;

    
    public RevokeSchemaPermissionDetails getRevokeSchemaPermissionDetails() {
        return revokeSchemaPermissionDetails;
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
        sb.append("ManageSchemaPermissionDetails(");
        sb.append("assignSchemaPermissionDetails=").append(String.valueOf(this.assignSchemaPermissionDetails));
        sb.append(", revokeSchemaPermissionDetails=").append(String.valueOf(this.revokeSchemaPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageSchemaPermissionDetails)) {
            return false;
        }

        ManageSchemaPermissionDetails other = (ManageSchemaPermissionDetails) o;
        return java.util.Objects.equals(this.assignSchemaPermissionDetails, other.assignSchemaPermissionDetails) &&
            java.util.Objects.equals(this.revokeSchemaPermissionDetails, other.revokeSchemaPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignSchemaPermissionDetails == null ? 43 : this.assignSchemaPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeSchemaPermissionDetails == null ? 43 : this.revokeSchemaPermissionDetails.hashCode());
        return result;
    }


}
