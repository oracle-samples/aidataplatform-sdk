// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Fields for updating a reusable Git private network profile.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdatePrivateNetworkProfileDetails.Builder.class)

public final class UpdatePrivateNetworkProfileDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "customerCompartmentId", "customerVcnId", "customerSubnetId"})
    public UpdatePrivateNetworkProfileDetails(String name, String description, String customerCompartmentId, String customerVcnId, String customerSubnetId) {
        super();
        this.name = name;
        this.description = description;
        this.customerCompartmentId = customerCompartmentId;
        this.customerVcnId = customerVcnId;
        this.customerSubnetId = customerSubnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Updated display name of the Git connectivity profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Updated display name of the Git connectivity profile.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Updated profile description. An empty value clears the description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Updated profile description. An empty value clears the description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Updated customer compartment identifier containing the private network resources.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerCompartmentId")
private String customerCompartmentId;

        /**
         * Updated customer compartment identifier containing the private network resources.
         * @param customerCompartmentId the value to set
         * @return this builder
         **/
        

public Builder customerCompartmentId(String customerCompartmentId) {
    this.customerCompartmentId = customerCompartmentId;
    return this;
}
            /**
     * Updated customer VCN identifier used for Git connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerVcnId")
private String customerVcnId;

        /**
         * Updated customer VCN identifier used for Git connectivity.
         * @param customerVcnId the value to set
         * @return this builder
         **/
        

public Builder customerVcnId(String customerVcnId) {
    this.customerVcnId = customerVcnId;
    return this;
}
            /**
     * Updated customer subnet identifier used for Git connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerSubnetId")
private String customerSubnetId;

        /**
         * Updated customer subnet identifier used for Git connectivity.
         * @param customerSubnetId the value to set
         * @return this builder
         **/
        

public Builder customerSubnetId(String customerSubnetId) {
    this.customerSubnetId = customerSubnetId;
    return this;
}


        public UpdatePrivateNetworkProfileDetails build() {
            UpdatePrivateNetworkProfileDetails model = new UpdatePrivateNetworkProfileDetails(this.name
                , this.description
                , this.customerCompartmentId
                , this.customerVcnId
                , this.customerSubnetId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateNetworkProfileDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.customerCompartmentId(model.getCustomerCompartmentId());
    this.customerVcnId(model.getCustomerVcnId());
    this.customerSubnetId(model.getCustomerSubnetId());
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

    


        /**
     * Updated display name of the Git connectivity profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Updated display name of the Git connectivity profile.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Updated profile description. An empty value clears the description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Updated profile description. An empty value clears the description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Updated customer compartment identifier containing the private network resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerCompartmentId")
    private final String customerCompartmentId;

        /**
     * Updated customer compartment identifier containing the private network resources.
     * @return the value
     **/
    
    public String getCustomerCompartmentId() {
        return customerCompartmentId;
    }


        /**
     * Updated customer VCN identifier used for Git connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerVcnId")
    private final String customerVcnId;

        /**
     * Updated customer VCN identifier used for Git connectivity.
     * @return the value
     **/
    
    public String getCustomerVcnId() {
        return customerVcnId;
    }


        /**
     * Updated customer subnet identifier used for Git connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerSubnetId")
    private final String customerSubnetId;

        /**
     * Updated customer subnet identifier used for Git connectivity.
     * @return the value
     **/
    
    public String getCustomerSubnetId() {
        return customerSubnetId;
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
        sb.append("UpdatePrivateNetworkProfileDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", customerCompartmentId=").append(String.valueOf(this.customerCompartmentId));
        sb.append(", customerVcnId=").append(String.valueOf(this.customerVcnId));
        sb.append(", customerSubnetId=").append(String.valueOf(this.customerSubnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateNetworkProfileDetails)) {
            return false;
        }

        UpdatePrivateNetworkProfileDetails other = (UpdatePrivateNetworkProfileDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.customerCompartmentId, other.customerCompartmentId) &&
            java.util.Objects.equals(this.customerVcnId, other.customerVcnId) &&
            java.util.Objects.equals(this.customerSubnetId, other.customerSubnetId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.customerCompartmentId == null ? 43 : this.customerCompartmentId.hashCode());
        result = (result * PRIME) + (this.customerVcnId == null ? 43 : this.customerVcnId.hashCode());
        result = (result * PRIME) + (this.customerSubnetId == null ? 43 : this.customerSubnetId.hashCode());
        return result;
    }


}
