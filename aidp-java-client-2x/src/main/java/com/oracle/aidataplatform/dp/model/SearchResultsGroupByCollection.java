// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Grouped list of objects by type.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchResultsGroupByCollection.Builder.class)

public final class SearchResultsGroupByCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"count", "query", "items", "aggregations"})
    public SearchResultsGroupByCollection(Integer count, String query, java.util.Map<String, java.util.List<ObjectSearchSummary>> items, java.util.Map<String, java.util.List<SearchObjectType>> aggregations) {
        super();
        this.count = count;
        this.query = query;
        this.items = items;
        this.aggregations = aggregations;
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
     * User search query
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

                /**
         * User search query
         * @param query the value to set
         * @return this builder
         **/
        

        public Builder query(String query) {
        this.query = query;
        return this;
        }
            /**
     * Objects grouped by their type. Each key is a type (e.g., "database", "catalog").
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.Map<String, java.util.List<ObjectSearchSummary>> items;

                /**
         * Objects grouped by their type. Each key is a type (e.g., "database", "catalog").
         * @param items the value to set
         * @return this builder
         **/
        

        public Builder items(java.util.Map<String, java.util.List<ObjectSearchSummary>> items) {
        this.items = items;
        return this;
        }
            /**
     * Grouped doc name with count.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("aggregations")
        private java.util.Map<String, java.util.List<SearchObjectType>> aggregations;

                /**
         * Grouped doc name with count.
         * @param aggregations the value to set
         * @return this builder
         **/
        

        public Builder aggregations(java.util.Map<String, java.util.List<SearchObjectType>> aggregations) {
        this.aggregations = aggregations;
        return this;
        }


        public SearchResultsGroupByCollection build() {
            SearchResultsGroupByCollection model = new SearchResultsGroupByCollection(this.count
                    , this.query
                    , this.items
                    , this.aggregations);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultsGroupByCollection model) {
                this.count(model.getCount());
    this.query(model.getQuery());
    this.items(model.getItems());
    this.aggregations(model.getAggregations());
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
     * User search query
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * User search query
     * @return the value
     **/
    
    public String getQuery() {
        return query;
    }


        /**
     * Objects grouped by their type. Each key is a type (e.g., "database", "catalog").
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.Map<String, java.util.List<ObjectSearchSummary>> items;

        /**
     * Objects grouped by their type. Each key is a type (e.g., "database", "catalog").
     * @return the value
     **/
    
    public java.util.Map<String, java.util.List<ObjectSearchSummary>> getItems() {
        return items;
    }


        /**
     * Grouped doc name with count.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggregations")
    private final java.util.Map<String, java.util.List<SearchObjectType>> aggregations;

        /**
     * Grouped doc name with count.
     * @return the value
     **/
    
    public java.util.Map<String, java.util.List<SearchObjectType>> getAggregations() {
        return aggregations;
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
        sb.append("SearchResultsGroupByCollection(");
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", aggregations=").append(String.valueOf(this.aggregations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResultsGroupByCollection)) {
            return false;
        }

        SearchResultsGroupByCollection other = (SearchResultsGroupByCollection) o;
        return java.util.Objects.equals(this.count, other.count) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.items, other.items) &&
            java.util.Objects.equals(this.aggregations, other.aggregations);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.aggregations == null ? 43 : this.aggregations.hashCode());
        return result;
    }


}
