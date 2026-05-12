package com.oracle.aidataplatform.dp.model;


/**
 * The details to update in a catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateCatalogDetails.Builder.class)

public final class UpdateCatalogDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "connectionDetails", "properties"})
    public UpdateCatalogDetails(String displayName, String description, UpdateConnectionDetails connectionDetails, java.util.Map<String, String> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.connectionDetails = connectionDetails;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Catalog display name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Catalog display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Short description of the catalog.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Short description of the catalog.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private UpdateConnectionDetails connectionDetails;

        

        public Builder connectionDetails(UpdateConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
        return this;
        }
            /**
     * Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

                /**
         * Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.
         * @param properties the value to set
         * @return this builder
         **/
        

        public Builder properties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
        }


        public UpdateCatalogDetails build() {
            UpdateCatalogDetails model = new UpdateCatalogDetails(this.displayName
                    , this.description
                    , this.connectionDetails
                    , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCatalogDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.connectionDetails(model.getConnectionDetails());
    this.properties(model.getProperties());
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
     * Catalog display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Catalog display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Short description of the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description of the catalog.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final UpdateConnectionDetails connectionDetails;

    
    public UpdateConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }


        /**
     * Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

        /**
     * Key-value pair used to provide catalog properties like the subCompartment OCID where the buckets need to reside.
     * @return the value
     **/
    
    public java.util.Map<String, String> getProperties() {
        return properties;
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
        sb.append("UpdateCatalogDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCatalogDetails)) {
            return false;
        }

        UpdateCatalogDetails other = (UpdateCatalogDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.connectionDetails, other.connectionDetails) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
