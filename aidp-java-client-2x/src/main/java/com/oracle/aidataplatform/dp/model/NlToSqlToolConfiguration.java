// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NlToSqlToolConfiguration.Builder.class)

public final class NlToSqlToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogKey", "schemaKey", "tables", "columns", "inContextLearning", "additionalInstructions"})
    public NlToSqlToolConfiguration(String catalogKey, String schemaKey, java.util.List<String> tables, java.util.List<String> columns, String inContextLearning, String additionalInstructions) {
        super();
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.tables = tables;
        this.columns = columns;
        this.inContextLearning = inContextLearning;
        this.additionalInstructions = additionalInstructions;
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
     * The fully qualified table names to use in SQL query generation
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tables")
        private java.util.List<String> tables;

                /**
         * The fully qualified table names to use in SQL query generation
         * @param tables the value to set
         * @return this builder
         **/
        

        public Builder tables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
        }
            /**
     * The fully qualified column names to use in SQL query generation
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<String> columns;

                /**
         * The fully qualified column names to use in SQL query generation
         * @param columns the value to set
         * @return this builder
         **/
        

        public Builder columns(java.util.List<String> columns) {
        this.columns = columns;
        return this;
        }
            /**
     * Optional few-shot examples (NL \u2192 SQL pairs) for better generation.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inContextLearning")
        private String inContextLearning;

                /**
         * Optional few-shot examples (NL \u2192 SQL pairs) for better generation.
         * @param inContextLearning the value to set
         * @return this builder
         **/
        

        public Builder inContextLearning(String inContextLearning) {
        this.inContextLearning = inContextLearning;
        return this;
        }
            /**
     * Additional instructions that is injected in the system prompt
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("additionalInstructions")
        private String additionalInstructions;

                /**
         * Additional instructions that is injected in the system prompt
         * @param additionalInstructions the value to set
         * @return this builder
         **/
        

        public Builder additionalInstructions(String additionalInstructions) {
        this.additionalInstructions = additionalInstructions;
        return this;
        }


        public NlToSqlToolConfiguration build() {
            NlToSqlToolConfiguration model = new NlToSqlToolConfiguration(this.catalogKey
                    , this.schemaKey
                    , this.tables
                    , this.columns
                    , this.inContextLearning
                    , this.additionalInstructions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NlToSqlToolConfiguration model) {
                this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.tables(model.getTables());
    this.columns(model.getColumns());
    this.inContextLearning(model.getInContextLearning());
    this.additionalInstructions(model.getAdditionalInstructions());
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
     * The fully qualified table names to use in SQL query generation
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tables")
    private final java.util.List<String> tables;

        /**
     * The fully qualified table names to use in SQL query generation
     * @return the value
     **/
    
    public java.util.List<String> getTables() {
        return tables;
    }


        /**
     * The fully qualified column names to use in SQL query generation
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<String> columns;

        /**
     * The fully qualified column names to use in SQL query generation
     * @return the value
     **/
    
    public java.util.List<String> getColumns() {
        return columns;
    }


        /**
     * Optional few-shot examples (NL \u2192 SQL pairs) for better generation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inContextLearning")
    private final String inContextLearning;

        /**
     * Optional few-shot examples (NL \u2192 SQL pairs) for better generation.
     * @return the value
     **/
    
    public String getInContextLearning() {
        return inContextLearning;
    }


        /**
     * Additional instructions that is injected in the system prompt
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("additionalInstructions")
    private final String additionalInstructions;

        /**
     * Additional instructions that is injected in the system prompt
     * @return the value
     **/
    
    public String getAdditionalInstructions() {
        return additionalInstructions;
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
        sb.append("NlToSqlToolConfiguration(");
        sb.append("catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", tables=").append(String.valueOf(this.tables));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", inContextLearning=").append(String.valueOf(this.inContextLearning));
        sb.append(", additionalInstructions=").append(String.valueOf(this.additionalInstructions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NlToSqlToolConfiguration)) {
            return false;
        }

        NlToSqlToolConfiguration other = (NlToSqlToolConfiguration) o;
        return java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.tables, other.tables) &&
            java.util.Objects.equals(this.columns, other.columns) &&
            java.util.Objects.equals(this.inContextLearning, other.inContextLearning) &&
            java.util.Objects.equals(this.additionalInstructions, other.additionalInstructions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.tables == null ? 43 : this.tables.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.inContextLearning == null ? 43 : this.inContextLearning.hashCode());
        result = (result * PRIME) + (this.additionalInstructions == null ? 43 : this.additionalInstructions.hashCode());
        return result;
    }


}
