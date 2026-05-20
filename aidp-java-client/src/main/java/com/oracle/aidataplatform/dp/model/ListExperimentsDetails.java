// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of experiments to fetch.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ListExperimentsDetails.Builder.class)

public final class ListExperimentsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"maxResults", "pageToken", "filter", "orderBy", "viewType"})
    public ListExperimentsDetails(Long maxResults, String pageToken, String filter, java.util.List<String> orderBy, ViewType viewType) {
        super();
        this.maxResults = maxResults;
        this.pageToken = pageToken;
        this.filter = filter;
        this.orderBy = orderBy;
        this.viewType = viewType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to 
* support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("max_results")
private Long maxResults;

        /**
         * Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to 
* support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
         * @param maxResults the value to set
         * @return this builder
         **/
        

public Builder maxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
}
            /**
     * Token indicating the page of experiments to fetch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("page_token")
private String pageToken;

        /**
         * Token indicating the page of experiments to fetch.
         * @param pageToken the value to set
         * @return this builder
         **/
        

public Builder pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
}
            /**
     * A filter expression over experiment attributes and tags that allows returning a subset of experiments.
* The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
* Example: name LIKE 'test-%' AND tags.key = 'value'
* Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
* Example: tags."extra-key" = 'value' or tags.{@code extra-key} = 'value'
* Supported operators are =, !=, LIKE, and ILIKE.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("filter")
private String filter;

        /**
         * A filter expression over experiment attributes and tags that allows returning a subset of experiments.
* The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
* Example: name LIKE 'test-%' AND tags.key = 'value'
* Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
* Example: tags."extra-key" = 'value' or tags.{@code extra-key} = 'value'
* Supported operators are =, !=, LIKE, and ILIKE.
* 
         * @param filter the value to set
         * @return this builder
         **/
        

public Builder filter(String filter) {
    this.filter = filter;
    return this;
}
            /**
     * List of columns for ordering search results, which can include experiment name and ID with 
* an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by experiment ID DESC.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("order_by")
private java.util.List<String> orderBy;

        /**
         * List of columns for ordering search results, which can include experiment name and ID with 
* an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by experiment ID DESC.
* 
         * @param orderBy the value to set
         * @return this builder
         **/
        

public Builder orderBy(java.util.List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
}
            /**
     * Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("view_type")
private ViewType viewType;

        /**
         * Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.
         * @param viewType the value to set
         * @return this builder
         **/
        

public Builder viewType(ViewType viewType) {
    this.viewType = viewType;
    return this;
}


        public ListExperimentsDetails build() {
            ListExperimentsDetails model = new ListExperimentsDetails(this.maxResults
                , this.pageToken
                , this.filter
                , this.orderBy
                , this.viewType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListExperimentsDetails model) {
                this.maxResults(model.getMaxResults());
    this.pageToken(model.getPageToken());
    this.filter(model.getFilter());
    this.orderBy(model.getOrderBy());
    this.viewType(model.getViewType());
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
     * Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to 
* support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_results")
    private final Long maxResults;

        /**
     * Maximum number of experiments desired. Servers may select a default. All servers are guaranteed to 
* support a max_results threshold of at least 1,000 but may support more. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     * @return the value
     **/
    
    public Long getMaxResults() {
        return maxResults;
    }


        /**
     * Token indicating the page of experiments to fetch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page_token")
    private final String pageToken;

        /**
     * Token indicating the page of experiments to fetch.
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
    }


        /**
     * A filter expression over experiment attributes and tags that allows returning a subset of experiments.
* The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
* Example: name LIKE 'test-%' AND tags.key = 'value'
* Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
* Example: tags."extra-key" = 'value' or tags.{@code extra-key} = 'value'
* Supported operators are =, !=, LIKE, and ILIKE.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final String filter;

        /**
     * A filter expression over experiment attributes and tags that allows returning a subset of experiments.
* The syntax is a subset of SQL that supports ANDing together binary operations between an attribute or tag and a constant.
* Example: name LIKE 'test-%' AND tags.key = 'value'
* Columns with special characters (hyphen, space, period, etc.) can be selected using double quotes or backticks.
* Example: tags."extra-key" = 'value' or tags.{@code extra-key} = 'value'
* Supported operators are =, !=, LIKE, and ILIKE.
* 
     * @return the value
     **/
    
    public String getFilter() {
        return filter;
    }


        /**
     * List of columns for ordering search results, which can include experiment name and ID with 
* an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by experiment ID DESC.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("order_by")
    private final java.util.List<String> orderBy;

        /**
     * List of columns for ordering search results, which can include experiment name and ID with 
* an optional "DESC" or "ASC" annotation, where "ASC" is the default. Tiebreaks are done by experiment ID DESC.
* 
     * @return the value
     **/
    
    public java.util.List<String> getOrderBy() {
        return orderBy;
    }

    /**
     * Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.
     **/
    public enum ViewType implements com.oracle.bmc.http.internal.BmcEnum {
        ActiveOnly("ACTIVE_ONLY"),
        DeletedOnly("DELETED_ONLY"),
        All("ALL"),
        ;

        

        private final String value;
        private static java.util.Map<String, ViewType> map;

        static {
            map = new java.util.HashMap<>();
            for (ViewType v : ViewType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ViewType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViewType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ViewType: " + key);
        }
    };
        /**
     * Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("view_type")
    private final ViewType viewType;

        /**
     * Qualifier for type of experiments to be returned. If unspecified, returns only active experiments.
     * @return the value
     **/
    
    public ViewType getViewType() {
        return viewType;
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
        sb.append("ListExperimentsDetails(");
        sb.append("maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", orderBy=").append(String.valueOf(this.orderBy));
        sb.append(", viewType=").append(String.valueOf(this.viewType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExperimentsDetails)) {
            return false;
        }

        ListExperimentsDetails other = (ListExperimentsDetails) o;
        return java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.pageToken, other.pageToken) &&
            java.util.Objects.equals(this.filter, other.filter) &&
            java.util.Objects.equals(this.orderBy, other.orderBy) &&
            java.util.Objects.equals(this.viewType, other.viewType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        result = (result * PRIME) + (this.viewType == null ? 43 : this.viewType.hashCode());
        return result;
    }


}
