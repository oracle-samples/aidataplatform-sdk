// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Database resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForDatabaseDetails.Builder.class)

public final class AccessGrantedForDatabaseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogName", "databaseName"})
    public AccessGrantedForDatabaseDetails(String catalogName, String databaseName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
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
            /**
     * Lakeproxy databaseName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("databaseName")
private String databaseName;

        /**
         * Lakeproxy databaseName.
         * @param databaseName the value to set
         * @return this builder
         **/
        

public Builder databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
}


        public AccessGrantedForDatabaseDetails build() {
            AccessGrantedForDatabaseDetails model = new AccessGrantedForDatabaseDetails(this.catalogName
                , this.databaseName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForDatabaseDetails model) {
                this.catalogName(model.getCatalogName());
    this.databaseName(model.getDatabaseName());
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


        /**
     * Lakeproxy databaseName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

        /**
     * Lakeproxy databaseName.
     * @return the value
     **/
    
    public String getDatabaseName() {
        return databaseName;
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
        sb.append("AccessGrantedForDatabaseDetails(");
        sb.append("catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForDatabaseDetails)) {
            return false;
        }

        AccessGrantedForDatabaseDetails other = (AccessGrantedForDatabaseDetails) o;
        return java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.databaseName, other.databaseName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        return result;
    }


}
