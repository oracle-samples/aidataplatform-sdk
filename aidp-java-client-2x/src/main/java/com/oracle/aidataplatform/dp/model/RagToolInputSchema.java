// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The input schema definition of a RAG Tool
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RagToolInputSchema.Builder.class)

public final class RagToolInputSchema  {
    @Deprecated
    @java.beans.ConstructorProperties({"query"})
    public RagToolInputSchema(String query) {
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


        public RagToolInputSchema build() {
            RagToolInputSchema model = new RagToolInputSchema(this.query);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RagToolInputSchema model) {
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
        sb.append("RagToolInputSchema(");
        sb.append("query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RagToolInputSchema)) {
            return false;
        }

        RagToolInputSchema other = (RagToolInputSchema) o;
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
