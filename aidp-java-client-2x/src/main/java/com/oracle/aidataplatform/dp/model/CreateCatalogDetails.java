// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The required details for creating catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateCatalogDetails.Builder.class)

public final class CreateCatalogDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "catalogType", "sourceType", "properties", "connectionDetails"})
    public CreateCatalogDetails(String displayName, String description, CatalogType catalogType, ExternalCatalogSourceType sourceType, java.util.Map<String, String> properties, CreateConnectionDetails connectionDetails) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.catalogType = catalogType;
        this.sourceType = sourceType;
        this.properties = properties;
        this.connectionDetails = connectionDetails;
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
            /**
     * Type of catalog.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogType")
        private CatalogType catalogType;

                /**
         * Type of catalog.
         * @param catalogType the value to set
         * @return this builder
         **/
        

        public Builder catalogType(CatalogType catalogType) {
        this.catalogType = catalogType;
        return this;
        }
            /**
     * External catalog source type.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private ExternalCatalogSourceType sourceType;

                /**
         * External catalog source type.
         * @param sourceType the value to set
         * @return this builder
         **/
        

        public Builder sourceType(ExternalCatalogSourceType sourceType) {
        this.sourceType = sourceType;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private CreateConnectionDetails connectionDetails;

        

        public Builder connectionDetails(CreateConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
        return this;
        }


        public CreateCatalogDetails build() {
            CreateCatalogDetails model = new CreateCatalogDetails(this.displayName
                    , this.description
                    , this.catalogType
                    , this.sourceType
                    , this.properties
                    , this.connectionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCatalogDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogType(model.getCatalogType());
    this.sourceType(model.getSourceType());
    this.properties(model.getProperties());
    this.connectionDetails(model.getConnectionDetails());
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

    
        /**
     * Type of catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogType")
    private final CatalogType catalogType;

        /**
     * Type of catalog.
     * @return the value
     **/
    
    public CatalogType getCatalogType() {
        return catalogType;
    }

    
        /**
     * External catalog source type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final ExternalCatalogSourceType sourceType;

        /**
     * External catalog source type.
     * @return the value
     **/
    
    public ExternalCatalogSourceType getSourceType() {
        return sourceType;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final CreateConnectionDetails connectionDetails;

    
    public CreateConnectionDetails getConnectionDetails() {
        return connectionDetails;
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
        sb.append("CreateCatalogDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogType=").append(String.valueOf(this.catalogType));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCatalogDetails)) {
            return false;
        }

        CreateCatalogDetails other = (CreateCatalogDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogType, other.catalogType) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.connectionDetails, other.connectionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogType == null ? 43 : this.catalogType.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        return result;
    }


}
