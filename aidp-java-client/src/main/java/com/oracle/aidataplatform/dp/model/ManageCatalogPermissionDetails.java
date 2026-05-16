// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information to update permissions on a catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageCatalogPermissionDetails.Builder.class)

public final class ManageCatalogPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignCatalogPermissionDetails", "revokeCatalogPermissionDetails"})
    public ManageCatalogPermissionDetails(AssignCatalogPermissionDetails assignCatalogPermissionDetails, RevokeCatalogPermissionDetails revokeCatalogPermissionDetails) {
        super();
        this.assignCatalogPermissionDetails = assignCatalogPermissionDetails;
        this.revokeCatalogPermissionDetails = revokeCatalogPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("assignCatalogPermissionDetails")
private AssignCatalogPermissionDetails assignCatalogPermissionDetails;



public Builder assignCatalogPermissionDetails(AssignCatalogPermissionDetails assignCatalogPermissionDetails) {
    this.assignCatalogPermissionDetails = assignCatalogPermissionDetails;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("revokeCatalogPermissionDetails")
private RevokeCatalogPermissionDetails revokeCatalogPermissionDetails;



public Builder revokeCatalogPermissionDetails(RevokeCatalogPermissionDetails revokeCatalogPermissionDetails) {
    this.revokeCatalogPermissionDetails = revokeCatalogPermissionDetails;
    return this;
}


        public ManageCatalogPermissionDetails build() {
            ManageCatalogPermissionDetails model = new ManageCatalogPermissionDetails(this.assignCatalogPermissionDetails
                , this.revokeCatalogPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageCatalogPermissionDetails model) {
                this.assignCatalogPermissionDetails(model.getAssignCatalogPermissionDetails());
    this.revokeCatalogPermissionDetails(model.getRevokeCatalogPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignCatalogPermissionDetails")
    private final AssignCatalogPermissionDetails assignCatalogPermissionDetails;

    
    public AssignCatalogPermissionDetails getAssignCatalogPermissionDetails() {
        return assignCatalogPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeCatalogPermissionDetails")
    private final RevokeCatalogPermissionDetails revokeCatalogPermissionDetails;

    
    public RevokeCatalogPermissionDetails getRevokeCatalogPermissionDetails() {
        return revokeCatalogPermissionDetails;
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
        sb.append("ManageCatalogPermissionDetails(");
        sb.append("assignCatalogPermissionDetails=").append(String.valueOf(this.assignCatalogPermissionDetails));
        sb.append(", revokeCatalogPermissionDetails=").append(String.valueOf(this.revokeCatalogPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageCatalogPermissionDetails)) {
            return false;
        }

        ManageCatalogPermissionDetails other = (ManageCatalogPermissionDetails) o;
        return java.util.Objects.equals(this.assignCatalogPermissionDetails, other.assignCatalogPermissionDetails) &&
            java.util.Objects.equals(this.revokeCatalogPermissionDetails, other.revokeCatalogPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignCatalogPermissionDetails == null ? 43 : this.assignCatalogPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeCatalogPermissionDetails == null ? 43 : this.revokeCatalogPermissionDetails.hashCode());
        return result;
    }


}
