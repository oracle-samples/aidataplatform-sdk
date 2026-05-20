// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of logged models to fetch.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ListLoggedModelsDetails.Builder.class)

public final class ListLoggedModelsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"experimentIds", "maxResults", "pageToken", "filter", "orderBy"})
    public ListLoggedModelsDetails(java.util.List<String> experimentIds, Long maxResults, String pageToken, String filter, java.util.List<LoggedModelOrder> orderBy) {
        super();
        this.experimentIds = experimentIds;
        this.maxResults = maxResults;
        this.pageToken = pageToken;
        this.filter = filter;
        this.orderBy = orderBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Fetch logged-models under list of experiments.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("experiment_ids")
        private java.util.List<String> experimentIds;

                /**
         * Fetch logged-models under list of experiments.
* 
         * @param experimentIds the value to set
         * @return this builder
         **/
        

        public Builder experimentIds(java.util.List<String> experimentIds) {
        this.experimentIds = experimentIds;
        return this;
        }
            /**
     * Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("max_results")
        private Long maxResults;

                /**
         * Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to 
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
     * Token indicating the page of logged-models to fetch.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("page_token")
        private String pageToken;

                /**
         * Token indicating the page of logged-models to fetch.
         * @param pageToken the value to set
         * @return this builder
         **/
        

        public Builder pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
        }
            /**
     * A filter expression over logged-models attributes.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private String filter;

                /**
         * A filter expression over logged-models attributes.
* 
         * @param filter the value to set
         * @return this builder
         **/
        

        public Builder filter(String filter) {
        this.filter = filter;
        return this;
        }
            /**
     * List of attributes for ordering search results.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("order_by")
        private java.util.List<LoggedModelOrder> orderBy;

                /**
         * List of attributes for ordering search results.
* 
         * @param orderBy the value to set
         * @return this builder
         **/
        

        public Builder orderBy(java.util.List<LoggedModelOrder> orderBy) {
        this.orderBy = orderBy;
        return this;
        }


        public ListLoggedModelsDetails build() {
            ListLoggedModelsDetails model = new ListLoggedModelsDetails(this.experimentIds
                    , this.maxResults
                    , this.pageToken
                    , this.filter
                    , this.orderBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListLoggedModelsDetails model) {
                this.experimentIds(model.getExperimentIds());
    this.maxResults(model.getMaxResults());
    this.pageToken(model.getPageToken());
    this.filter(model.getFilter());
    this.orderBy(model.getOrderBy());
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
     * Fetch logged-models under list of experiments.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("experiment_ids")
    private final java.util.List<String> experimentIds;

        /**
     * Fetch logged-models under list of experiments.
* 
     * @return the value
     **/
    
    public java.util.List<String> getExperimentIds() {
        return experimentIds;
    }


        /**
     * Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_results")
    private final Long maxResults;

        /**
     * Maximum number of logged-models desired. Servers may select a default. Callers are encouraged to 
* pass max_results explicitly and leverage page_token to iterate.
* 
     * @return the value
     **/
    
    public Long getMaxResults() {
        return maxResults;
    }


        /**
     * Token indicating the page of logged-models to fetch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page_token")
    private final String pageToken;

        /**
     * Token indicating the page of logged-models to fetch.
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
    }


        /**
     * A filter expression over logged-models attributes.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final String filter;

        /**
     * A filter expression over logged-models attributes.
* 
     * @return the value
     **/
    
    public String getFilter() {
        return filter;
    }


        /**
     * List of attributes for ordering search results.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("order_by")
    private final java.util.List<LoggedModelOrder> orderBy;

        /**
     * List of attributes for ordering search results.
* 
     * @return the value
     **/
    
    public java.util.List<LoggedModelOrder> getOrderBy() {
        return orderBy;
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
        sb.append("ListLoggedModelsDetails(");
        sb.append("experimentIds=").append(String.valueOf(this.experimentIds));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", orderBy=").append(String.valueOf(this.orderBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLoggedModelsDetails)) {
            return false;
        }

        ListLoggedModelsDetails other = (ListLoggedModelsDetails) o;
        return java.util.Objects.equals(this.experimentIds, other.experimentIds) &&
            java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.pageToken, other.pageToken) &&
            java.util.Objects.equals(this.filter, other.filter) &&
            java.util.Objects.equals(this.orderBy, other.orderBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.experimentIds == null ? 43 : this.experimentIds.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        return result;
    }


}
