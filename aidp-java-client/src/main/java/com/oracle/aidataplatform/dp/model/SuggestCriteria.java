// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details about suggest criteria
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SuggestCriteria.Builder.class)

public final class SuggestCriteria  {
    @Deprecated
    @java.beans.ConstructorProperties({"query", "limit"})
    public SuggestCriteria(String query, Integer limit) {
        super();
        this.query = query;
        this.limit = limit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Suggest query string
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("query")
private String query;

        /**
         * Suggest query string
         * @param query the value to set
         * @return this builder
         **/
        

public Builder query(String query) {
    this.query = query;
    return this;
}
            /**
     * The maximum number of items to return.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("limit")
private Integer limit;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder
         **/
        

public Builder limit(Integer limit) {
    this.limit = limit;
    return this;
}


        public SuggestCriteria build() {
            SuggestCriteria model = new SuggestCriteria(this.query
                , this.limit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestCriteria model) {
                this.query(model.getQuery());
    this.limit(model.getLimit());
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
     * Suggest query string
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * Suggest query string
     * @return the value
     **/
    
    public String getQuery() {
        return query;
    }


        /**
     * The maximum number of items to return.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

        /**
     * The maximum number of items to return.
     * @return the value
     **/
    
    public Integer getLimit() {
        return limit;
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
        sb.append("SuggestCriteria(");
        sb.append("query=").append(String.valueOf(this.query));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestCriteria)) {
            return false;
        }

        SuggestCriteria other = (SuggestCriteria) o;
        return java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }


}
