package com.oracle.aidataplatform.dp.model;


/**
 * The details of a connection associated with a catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CatalogConnectionDetails.Builder.class)

public final class CatalogConnectionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "connectionProperties"})
    public CatalogConnectionDetails(String displayName, java.util.Map<String, String> connectionProperties) {
        super();
        this.displayName = displayName;
        this.connectionProperties = connectionProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Connection name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Connection name.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Connection properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.Map<String, String> connectionProperties;

                /**
         * Connection properties.
         * @param connectionProperties the value to set
         * @return this builder
         **/
        

        public Builder connectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
        }


        public CatalogConnectionDetails build() {
            CatalogConnectionDetails model = new CatalogConnectionDetails(this.displayName
                    , this.connectionProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogConnectionDetails model) {
                this.displayName(model.getDisplayName());
    this.connectionProperties(model.getConnectionProperties());
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
     * Connection name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Connection name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Connection properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
    private final java.util.Map<String, String> connectionProperties;

        /**
     * Connection properties.
     * @return the value
     **/
    
    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
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
        sb.append("CatalogConnectionDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", connectionProperties=").append(String.valueOf(this.connectionProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogConnectionDetails)) {
            return false;
        }

        CatalogConnectionDetails other = (CatalogConnectionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.connectionProperties, other.connectionProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.connectionProperties == null ? 43 : this.connectionProperties.hashCode());
        return result;
    }


}
