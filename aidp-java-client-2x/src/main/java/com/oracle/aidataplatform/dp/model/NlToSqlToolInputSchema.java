package com.oracle.aidataplatform.dp.model;


/**
 * The input schema definition of a NL to SQL Tool
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NlToSqlToolInputSchema.Builder.class)

public final class NlToSqlToolInputSchema  {
    @Deprecated
    @java.beans.ConstructorProperties({"query"})
    public NlToSqlToolInputSchema(String query) {
        super();
        this.query = query;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The user question to answer using relevant documents
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

                /**
         * The user question to answer using relevant documents
         * @param query the value to set
         * @return this builder
         **/
        

        public Builder query(String query) {
        this.query = query;
        return this;
        }


        public NlToSqlToolInputSchema build() {
            NlToSqlToolInputSchema model = new NlToSqlToolInputSchema(this.query);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NlToSqlToolInputSchema model) {
                this.query(model.getQuery());
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
     * The user question to answer using relevant documents
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * The user question to answer using relevant documents
     * @return the value
     **/
    
    public String getQuery() {
        return query;
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
        sb.append("NlToSqlToolInputSchema(");
        sb.append("query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NlToSqlToolInputSchema)) {
            return false;
        }

        NlToSqlToolInputSchema other = (NlToSqlToolInputSchema) o;
        return java.util.Objects.equals(this.query, other.query);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        return result;
    }


}
