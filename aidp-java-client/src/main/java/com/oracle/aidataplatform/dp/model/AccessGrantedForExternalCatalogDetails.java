// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy ExternalCatalog resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForExternalCatalogDetails.Builder.class)

public final class AccessGrantedForExternalCatalogDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"externalCatalogName"})
    public AccessGrantedForExternalCatalogDetails(String externalCatalogName) {
        super();
        this.externalCatalogName = externalCatalogName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy externalCatalogName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalCatalogName")
private String externalCatalogName;

        /**
         * Lakeproxy externalCatalogName.
         * @param externalCatalogName the value to set
         * @return this builder
         **/
        

public Builder externalCatalogName(String externalCatalogName) {
    this.externalCatalogName = externalCatalogName;
    return this;
}


        public AccessGrantedForExternalCatalogDetails build() {
            AccessGrantedForExternalCatalogDetails model = new AccessGrantedForExternalCatalogDetails(this.externalCatalogName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForExternalCatalogDetails model) {
                this.externalCatalogName(model.getExternalCatalogName());
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
     * Lakeproxy externalCatalogName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalCatalogName")
    private final String externalCatalogName;

        /**
     * Lakeproxy externalCatalogName.
     * @return the value
     **/
    
    public String getExternalCatalogName() {
        return externalCatalogName;
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
        sb.append("AccessGrantedForExternalCatalogDetails(");
        sb.append("externalCatalogName=").append(String.valueOf(this.externalCatalogName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForExternalCatalogDetails)) {
            return false;
        }

        AccessGrantedForExternalCatalogDetails other = (AccessGrantedForExternalCatalogDetails) o;
        return java.util.Objects.equals(this.externalCatalogName, other.externalCatalogName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.externalCatalogName == null ? 43 : this.externalCatalogName.hashCode());
        return result;
    }


}
