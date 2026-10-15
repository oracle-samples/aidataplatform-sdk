// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Table resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForTableDetails.Builder.class)

public final class AccessGrantedForTableDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogName", "databaseName", "tableName"})
    public AccessGrantedForTableDetails(String catalogName, String databaseName, String tableName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.tableName = tableName;
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
            /**
     * Lakeproxy tableName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableName")
private String tableName;

        /**
         * Lakeproxy tableName.
         * @param tableName the value to set
         * @return this builder
         **/
        

public Builder tableName(String tableName) {
    this.tableName = tableName;
    return this;
}


        public AccessGrantedForTableDetails build() {
            AccessGrantedForTableDetails model = new AccessGrantedForTableDetails(this.catalogName
                , this.databaseName
                , this.tableName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForTableDetails model) {
                this.catalogName(model.getCatalogName());
    this.databaseName(model.getDatabaseName());
    this.tableName(model.getTableName());
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


        /**
     * Lakeproxy tableName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableName")
    private final String tableName;

        /**
     * Lakeproxy tableName.
     * @return the value
     **/
    
    public String getTableName() {
        return tableName;
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
        sb.append("AccessGrantedForTableDetails(");
        sb.append("catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", tableName=").append(String.valueOf(this.tableName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForTableDetails)) {
            return false;
        }

        AccessGrantedForTableDetails other = (AccessGrantedForTableDetails) o;
        return java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.databaseName, other.databaseName) &&
            java.util.Objects.equals(this.tableName, other.tableName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        return result;
    }


}
