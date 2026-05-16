// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of suggested objects
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SuggestResultsCollection.Builder.class)

public final class SuggestResultsCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"count", "query", "items"})
    public SuggestResultsCollection(Integer count, String query, java.util.List<ObjectSuggestSummary> items) {
        super();
        this.count = count;
        this.query = query;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total number of hits
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("count")
private Integer count;

        /**
         * Total number of hits
         * @param count the value to set
         * @return this builder
         **/
        

public Builder count(Integer count) {
    this.count = count;
    return this;
}
            /**
     * User suggest query
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("query")
private String query;

        /**
         * User suggest query
         * @param query the value to set
         * @return this builder
         **/
        

public Builder query(String query) {
    this.query = query;
    return this;
}
            /**
     * List of objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<ObjectSuggestSummary> items;

        /**
         * List of objects.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<ObjectSuggestSummary> items) {
    this.items = items;
    return this;
}


        public SuggestResultsCollection build() {
            SuggestResultsCollection model = new SuggestResultsCollection(this.count
                , this.query
                , this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestResultsCollection model) {
                this.count(model.getCount());
    this.query(model.getQuery());
    this.items(model.getItems());
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
     * Total number of hits
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

        /**
     * Total number of hits
     * @return the value
     **/
    
    public Integer getCount() {
        return count;
    }


        /**
     * User suggest query
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * User suggest query
     * @return the value
     **/
    
    public String getQuery() {
        return query;
    }


        /**
     * List of objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ObjectSuggestSummary> items;

        /**
     * List of objects.
     * @return the value
     **/
    
    public java.util.List<ObjectSuggestSummary> getItems() {
        return items;
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
        sb.append("SuggestResultsCollection(");
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestResultsCollection)) {
            return false;
        }

        SuggestResultsCollection other = (SuggestResultsCollection) o;
        return java.util.Objects.equals(this.count, other.count) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
