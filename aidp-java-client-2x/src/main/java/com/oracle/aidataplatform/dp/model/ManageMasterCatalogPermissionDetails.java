package com.oracle.aidataplatform.dp.model;


/**
 * Information to update permissions on a Master Catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageMasterCatalogPermissionDetails.Builder.class)

public final class ManageMasterCatalogPermissionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"assignMasterCatalogPermissionDetails", "revokeMasterCatalogPermissionDetails"})
    public ManageMasterCatalogPermissionDetails(AssignMasterCatalogPermissionDetails assignMasterCatalogPermissionDetails, RevokeMasterCatalogPermissionDetails revokeMasterCatalogPermissionDetails) {
        super();
        this.assignMasterCatalogPermissionDetails = assignMasterCatalogPermissionDetails;
        this.revokeMasterCatalogPermissionDetails = revokeMasterCatalogPermissionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("assignMasterCatalogPermissionDetails")
        private AssignMasterCatalogPermissionDetails assignMasterCatalogPermissionDetails;

        

        public Builder assignMasterCatalogPermissionDetails(AssignMasterCatalogPermissionDetails assignMasterCatalogPermissionDetails) {
        this.assignMasterCatalogPermissionDetails = assignMasterCatalogPermissionDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("revokeMasterCatalogPermissionDetails")
        private RevokeMasterCatalogPermissionDetails revokeMasterCatalogPermissionDetails;

        

        public Builder revokeMasterCatalogPermissionDetails(RevokeMasterCatalogPermissionDetails revokeMasterCatalogPermissionDetails) {
        this.revokeMasterCatalogPermissionDetails = revokeMasterCatalogPermissionDetails;
        return this;
        }


        public ManageMasterCatalogPermissionDetails build() {
            ManageMasterCatalogPermissionDetails model = new ManageMasterCatalogPermissionDetails(this.assignMasterCatalogPermissionDetails
                    , this.revokeMasterCatalogPermissionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageMasterCatalogPermissionDetails model) {
                this.assignMasterCatalogPermissionDetails(model.getAssignMasterCatalogPermissionDetails());
    this.revokeMasterCatalogPermissionDetails(model.getRevokeMasterCatalogPermissionDetails());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("assignMasterCatalogPermissionDetails")
    private final AssignMasterCatalogPermissionDetails assignMasterCatalogPermissionDetails;

    
    public AssignMasterCatalogPermissionDetails getAssignMasterCatalogPermissionDetails() {
        return assignMasterCatalogPermissionDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("revokeMasterCatalogPermissionDetails")
    private final RevokeMasterCatalogPermissionDetails revokeMasterCatalogPermissionDetails;

    
    public RevokeMasterCatalogPermissionDetails getRevokeMasterCatalogPermissionDetails() {
        return revokeMasterCatalogPermissionDetails;
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
        sb.append("ManageMasterCatalogPermissionDetails(");
        sb.append("assignMasterCatalogPermissionDetails=").append(String.valueOf(this.assignMasterCatalogPermissionDetails));
        sb.append(", revokeMasterCatalogPermissionDetails=").append(String.valueOf(this.revokeMasterCatalogPermissionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageMasterCatalogPermissionDetails)) {
            return false;
        }

        ManageMasterCatalogPermissionDetails other = (ManageMasterCatalogPermissionDetails) o;
        return java.util.Objects.equals(this.assignMasterCatalogPermissionDetails, other.assignMasterCatalogPermissionDetails) &&
            java.util.Objects.equals(this.revokeMasterCatalogPermissionDetails, other.revokeMasterCatalogPermissionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignMasterCatalogPermissionDetails == null ? 43 : this.assignMasterCatalogPermissionDetails.hashCode());
        result = (result * PRIME) + (this.revokeMasterCatalogPermissionDetails == null ? 43 : this.revokeMasterCatalogPermissionDetails.hashCode());
        return result;
    }


}
