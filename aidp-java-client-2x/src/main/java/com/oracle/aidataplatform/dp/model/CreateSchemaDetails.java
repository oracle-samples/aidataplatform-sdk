// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to create a schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateSchemaDetails.Builder.class)

public final class CreateSchemaDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "properties", "catalogName"})
    public CreateSchemaDetails(String displayName, String description, java.util.Map<String, String> properties, String catalogName) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.properties = properties;
        this.catalogName = catalogName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Schema name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Schema name.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Schema description.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Schema description.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * Key-value pair representing a defined tag key and value.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

                /**
         * Key-value pair representing a defined tag key and value.
         * @param properties the value to set
         * @return this builder
         **/
        

        public Builder properties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
        }
            /**
     * The name of the catalog to which this schema belongs.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
        private String catalogName;

                /**
         * The name of the catalog to which this schema belongs.
         * @param catalogName the value to set
         * @return this builder
         **/
        

        public Builder catalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
        }


        public CreateSchemaDetails build() {
            CreateSchemaDetails model = new CreateSchemaDetails(this.displayName
                    , this.description
                    , this.properties
                    , this.catalogName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSchemaDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.properties(model.getProperties());
    this.catalogName(model.getCatalogName());
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
     * Schema name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Schema name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Schema description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Schema description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Key-value pair representing a defined tag key and value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

        /**
     * Key-value pair representing a defined tag key and value.
     * @return the value
     **/
    
    public java.util.Map<String, String> getProperties() {
        return properties;
    }


        /**
     * The name of the catalog to which this schema belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * The name of the catalog to which this schema belongs.
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
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
        sb.append("CreateSchemaDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", catalogName=").append(String.valueOf(this.catalogName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSchemaDetails)) {
            return false;
        }

        CreateSchemaDetails other = (CreateSchemaDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.catalogName, other.catalogName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        return result;
    }


}
