// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SqlToolConfiguration.Builder.class)

public final class SqlToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogKey", "schemaKey", "query", "isRowLimitEnabled", "maxRows"})
    public SqlToolConfiguration(String catalogKey, String schemaKey, String query, Boolean isRowLimitEnabled, Integer maxRows) {
        super();
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.query = query;
        this.isRowLimitEnabled = isRowLimitEnabled;
        this.maxRows = maxRows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Catalog to use for SQL query execution
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * The Catalog to use for SQL query execution
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * The Schema to use for SQL query execution
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * The Schema to use for SQL query execution
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
            /**
     * The SQL query to execute
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("query")
private String query;

        /**
         * The SQL query to execute
         * @param query the value to set
         * @return this builder
         **/
        

public Builder query(String query) {
    this.query = query;
    return this;
}
            /**
     * Whether to enforce the row limit when running the SQL tool
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isRowLimitEnabled")
private Boolean isRowLimitEnabled;

        /**
         * Whether to enforce the row limit when running the SQL tool
         * @param isRowLimitEnabled the value to set
         * @return this builder
         **/
        

public Builder isRowLimitEnabled(Boolean isRowLimitEnabled) {
    this.isRowLimitEnabled = isRowLimitEnabled;
    return this;
}
            /**
     * Maximum number of result rows returned per SQL tool execution to prevent oversized result sets
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxRows")
private Integer maxRows;

        /**
         * Maximum number of result rows returned per SQL tool execution to prevent oversized result sets
         * @param maxRows the value to set
         * @return this builder
         **/
        

public Builder maxRows(Integer maxRows) {
    this.maxRows = maxRows;
    return this;
}


        public SqlToolConfiguration build() {
            SqlToolConfiguration model = new SqlToolConfiguration(this.catalogKey
                , this.schemaKey
                , this.query
                , this.isRowLimitEnabled
                , this.maxRows);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlToolConfiguration model) {
                this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.query(model.getQuery());
    this.isRowLimitEnabled(model.getIsRowLimitEnabled());
    this.maxRows(model.getMaxRows());
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
     * The Catalog to use for SQL query execution
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The Catalog to use for SQL query execution
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * The Schema to use for SQL query execution
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The Schema to use for SQL query execution
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * The SQL query to execute
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * The SQL query to execute
     * @return the value
     **/
    
    public String getQuery() {
        return query;
    }


        /**
     * Whether to enforce the row limit when running the SQL tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRowLimitEnabled")
    private final Boolean isRowLimitEnabled;

        /**
     * Whether to enforce the row limit when running the SQL tool
     * @return the value
     **/
    
    public Boolean getIsRowLimitEnabled() {
        return isRowLimitEnabled;
    }


        /**
     * Maximum number of result rows returned per SQL tool execution to prevent oversized result sets
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxRows")
    private final Integer maxRows;

        /**
     * Maximum number of result rows returned per SQL tool execution to prevent oversized result sets
     * @return the value
     **/
    
    public Integer getMaxRows() {
        return maxRows;
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
        sb.append("SqlToolConfiguration(");
        sb.append("catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", isRowLimitEnabled=").append(String.valueOf(this.isRowLimitEnabled));
        sb.append(", maxRows=").append(String.valueOf(this.maxRows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlToolConfiguration)) {
            return false;
        }

        SqlToolConfiguration other = (SqlToolConfiguration) o;
        return java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.isRowLimitEnabled, other.isRowLimitEnabled) &&
            java.util.Objects.equals(this.maxRows, other.maxRows);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.isRowLimitEnabled == null ? 43 : this.isRowLimitEnabled.hashCode());
        result = (result * PRIME) + (this.maxRows == null ? 43 : this.maxRows.hashCode());
        return result;
    }


}
