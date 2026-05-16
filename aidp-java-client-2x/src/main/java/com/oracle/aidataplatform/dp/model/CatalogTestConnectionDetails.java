// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Information needed to test connection to an external catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CatalogTestConnectionDetails.Builder.class)

public final class CatalogTestConnectionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "sourceType", "connectionDetails"})
    public CatalogTestConnectionDetails(String key, ExternalCatalogSourceType sourceType, CatalogConnectionDetails connectionDetails) {
        super();
        this.key = key;
        this.sourceType = sourceType;
        this.connectionDetails = connectionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The AI Data Platform Workbench catalog key.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The AI Data Platform Workbench catalog key.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private CatalogConnectionDetails connectionDetails;

        

        public Builder connectionDetails(CatalogConnectionDetails connectionDetails) {
        this.connectionDetails = connectionDetails;
        return this;
        }


        public CatalogTestConnectionDetails build() {
            CatalogTestConnectionDetails model = new CatalogTestConnectionDetails(this.key
                    , this.sourceType
                    , this.connectionDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogTestConnectionDetails model) {
                this.key(model.getKey());
    this.sourceType(model.getSourceType());
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
     * The AI Data Platform Workbench catalog key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The AI Data Platform Workbench catalog key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final CatalogConnectionDetails connectionDetails;

    
    public CatalogConnectionDetails getConnectionDetails() {
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
        sb.append("CatalogTestConnectionDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CatalogTestConnectionDetails)) {
            return false;
        }

        CatalogTestConnectionDetails other = (CatalogTestConnectionDetails) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.connectionDetails, other.connectionDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        return result;
    }


}
