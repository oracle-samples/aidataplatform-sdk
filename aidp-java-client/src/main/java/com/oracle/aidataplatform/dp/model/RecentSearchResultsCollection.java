// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of recent searches objects
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RecentSearchResultsCollection.Builder.class)

public final class RecentSearchResultsCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"count", "items"})
    public RecentSearchResultsCollection(Integer count, java.util.List<ObjectRecentSearchSummary> items) {
        super();
        this.count = count;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total number of items
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("count")
private Integer count;

        /**
         * Total number of items
         * @param count the value to set
         * @return this builder
         **/
        

public Builder count(Integer count) {
    this.count = count;
    return this;
}
            /**
     * List of objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<ObjectRecentSearchSummary> items;

        /**
         * List of objects.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<ObjectRecentSearchSummary> items) {
    this.items = items;
    return this;
}


        public RecentSearchResultsCollection build() {
            RecentSearchResultsCollection model = new RecentSearchResultsCollection(this.count
                , this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecentSearchResultsCollection model) {
                this.count(model.getCount());
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
     * Total number of items
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

        /**
     * Total number of items
     * @return the value
     **/
    
    public Integer getCount() {
        return count;
    }


        /**
     * List of objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ObjectRecentSearchSummary> items;

        /**
     * List of objects.
     * @return the value
     **/
    
    public java.util.List<ObjectRecentSearchSummary> getItems() {
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
        sb.append("RecentSearchResultsCollection(");
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecentSearchResultsCollection)) {
            return false;
        }

        RecentSearchResultsCollection other = (RecentSearchResultsCollection) o;
        return java.util.Objects.equals(this.count, other.count) &&
            java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
