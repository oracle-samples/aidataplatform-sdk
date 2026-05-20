// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of Workspace objects
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceSearchCriteria.Builder.class)

public final class WorkspaceSearchCriteria  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "query", "limit", "offset", "aggregations", "filter", "sort"})
    public WorkspaceSearchCriteria(String path, String query, Integer limit, Integer offset, java.util.List<AggregationEnum> aggregations, FilterTypes filter, java.util.List<SortDetails> sort) {
        super();
        this.path = path;
        this.query = query;
        this.limit = limit;
        this.offset = offset;
        this.aggregations = aggregations;
        this.filter = filter;
        this.sort = sort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The path prefix Example: /Shared, /Shared/Folder1, etc.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * The path prefix Example: /Shared, /Shared/Folder1, etc.
* 
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Search query string
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("query")
private String query;

        /**
         * Search query string
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
            /**
     * The doc number from which it needs to be return.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("offset")
private Integer offset;

        /**
         * The doc number from which it needs to be return.
         * @param offset the value to set
         * @return this builder
         **/
        

public Builder offset(Integer offset) {
    this.offset = offset;
    return this;
}
            /**
     * The provide the field name on which we need aggregation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aggregations")
private java.util.List<AggregationEnum> aggregations;

        /**
         * The provide the field name on which we need aggregation.
         * @param aggregations the value to set
         * @return this builder
         **/
        

public Builder aggregations(java.util.List<AggregationEnum> aggregations) {
    this.aggregations = aggregations;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("filter")
private FilterTypes filter;



public Builder filter(FilterTypes filter) {
    this.filter = filter;
    return this;
}
            /**
     * Array of objects having details about sort field and order.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sort")
private java.util.List<SortDetails> sort;

        /**
         * Array of objects having details about sort field and order.
         * @param sort the value to set
         * @return this builder
         **/
        

public Builder sort(java.util.List<SortDetails> sort) {
    this.sort = sort;
    return this;
}


        public WorkspaceSearchCriteria build() {
            WorkspaceSearchCriteria model = new WorkspaceSearchCriteria(this.path
                , this.query
                , this.limit
                , this.offset
                , this.aggregations
                , this.filter
                , this.sort);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceSearchCriteria model) {
                this.path(model.getPath());
    this.query(model.getQuery());
    this.limit(model.getLimit());
    this.offset(model.getOffset());
    this.aggregations(model.getAggregations());
    this.filter(model.getFilter());
    this.sort(model.getSort());
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
     * The path prefix Example: /Shared, /Shared/Folder1, etc.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * The path prefix Example: /Shared, /Shared/Folder1, etc.
* 
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Search query string
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

        /**
     * Search query string
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


        /**
     * The doc number from which it needs to be return.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

        /**
     * The doc number from which it needs to be return.
     * @return the value
     **/
    
    public Integer getOffset() {
        return offset;
    }


        /**
     * The provide the field name on which we need aggregation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggregations")
    private final java.util.List<AggregationEnum> aggregations;

        /**
     * The provide the field name on which we need aggregation.
     * @return the value
     **/
    
    public java.util.List<AggregationEnum> getAggregations() {
        return aggregations;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final FilterTypes filter;

    
    public FilterTypes getFilter() {
        return filter;
    }


        /**
     * Array of objects having details about sort field and order.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sort")
    private final java.util.List<SortDetails> sort;

        /**
     * Array of objects having details about sort field and order.
     * @return the value
     **/
    
    public java.util.List<SortDetails> getSort() {
        return sort;
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
        sb.append("WorkspaceSearchCriteria(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", aggregations=").append(String.valueOf(this.aggregations));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", sort=").append(String.valueOf(this.sort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceSearchCriteria)) {
            return false;
        }

        WorkspaceSearchCriteria other = (WorkspaceSearchCriteria) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.limit, other.limit) &&
            java.util.Objects.equals(this.offset, other.offset) &&
            java.util.Objects.equals(this.aggregations, other.aggregations) &&
            java.util.Objects.equals(this.filter, other.filter) &&
            java.util.Objects.equals(this.sort, other.sort);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.aggregations == null ? 43 : this.aggregations.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.sort == null ? 43 : this.sort.hashCode());
        return result;
    }


}
