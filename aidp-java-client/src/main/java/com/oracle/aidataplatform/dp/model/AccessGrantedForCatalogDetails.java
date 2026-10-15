// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Catalog resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForCatalogDetails.Builder.class)

public final class AccessGrantedForCatalogDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogName"})
    public AccessGrantedForCatalogDetails(String catalogName) {
        super();
        this.catalogName = catalogName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy catalogName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

        /**
         * Lakeproxy catalogName.
         * @param catalogName the value to set
         * @return this builder
         **/
        

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}


        public AccessGrantedForCatalogDetails build() {
            AccessGrantedForCatalogDetails model = new AccessGrantedForCatalogDetails(this.catalogName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForCatalogDetails model) {
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
     * Lakeproxy catalogName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * Lakeproxy catalogName.
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
        sb.append("AccessGrantedForCatalogDetails(");
        sb.append("catalogName=").append(String.valueOf(this.catalogName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForCatalogDetails)) {
            return false;
        }

        AccessGrantedForCatalogDetails other = (AccessGrantedForCatalogDetails) o;
        return java.util.Objects.equals(this.catalogName, other.catalogName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        return result;
    }


}
