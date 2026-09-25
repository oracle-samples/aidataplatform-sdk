// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filters and pagination for a model deployment search.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SearchModelDeploymentsDetails.Builder.class)

public final class SearchModelDeploymentsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelName", "status", "maxResults", "orderBy", "pageToken"})
    public SearchModelDeploymentsDetails(String modelName, DeploymentStatus status, Long maxResults, java.util.List<String> orderBy, String pageToken) {
        super();
        this.modelName = modelName;
        this.status = status;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
        this.pageToken = pageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A filter over the registered model name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_name")
private String modelName;

        /**
         * A filter over the registered model name.
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
            /**
     * A filter over deployment status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private DeploymentStatus status;

        /**
         * A filter over deployment status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(DeploymentStatus status) {
    this.status = status;
    return this;
}
            /**
     * Maximum number of deployments desired. Default is 100. Max threshold is 1000.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("max_results")
private Long maxResults;

        /**
         * Maximum number of deployments desired. Default is 100. Max threshold is 1000.
         * @param maxResults the value to set
         * @return this builder
         **/
        

public Builder maxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
}
            /**
     * List of columns for ordering search results, e.g. 'created_time DESC'.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("order_by")
private java.util.List<String> orderBy;

        /**
         * List of columns for ordering search results, e.g. 'created_time DESC'.
         * @param orderBy the value to set
         * @return this builder
         **/
        

public Builder orderBy(java.util.List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
}
            /**
     * Token indicating the page of deployments to fetch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("page_token")
private String pageToken;

        /**
         * Token indicating the page of deployments to fetch.
         * @param pageToken the value to set
         * @return this builder
         **/
        

public Builder pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
}


        public SearchModelDeploymentsDetails build() {
            SearchModelDeploymentsDetails model = new SearchModelDeploymentsDetails(this.modelName
                , this.status
                , this.maxResults
                , this.orderBy
                , this.pageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchModelDeploymentsDetails model) {
                this.modelName(model.getModelName());
    this.status(model.getStatus());
    this.maxResults(model.getMaxResults());
    this.orderBy(model.getOrderBy());
    this.pageToken(model.getPageToken());
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
     * A filter over the registered model name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_name")
    private final String modelName;

        /**
     * A filter over the registered model name.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }

    
        /**
     * A filter over deployment status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DeploymentStatus status;

        /**
     * A filter over deployment status.
     * @return the value
     **/
    
    public DeploymentStatus getStatus() {
        return status;
    }


        /**
     * Maximum number of deployments desired. Default is 100. Max threshold is 1000.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_results")
    private final Long maxResults;

        /**
     * Maximum number of deployments desired. Default is 100. Max threshold is 1000.
     * @return the value
     **/
    
    public Long getMaxResults() {
        return maxResults;
    }


        /**
     * List of columns for ordering search results, e.g. 'created_time DESC'.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("order_by")
    private final java.util.List<String> orderBy;

        /**
     * List of columns for ordering search results, e.g. 'created_time DESC'.
     * @return the value
     **/
    
    public java.util.List<String> getOrderBy() {
        return orderBy;
    }


        /**
     * Token indicating the page of deployments to fetch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page_token")
    private final String pageToken;

        /**
     * Token indicating the page of deployments to fetch.
     * @return the value
     **/
    
    public String getPageToken() {
        return pageToken;
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
        sb.append("SearchModelDeploymentsDetails(");
        sb.append("modelName=").append(String.valueOf(this.modelName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", maxResults=").append(String.valueOf(this.maxResults));
        sb.append(", orderBy=").append(String.valueOf(this.orderBy));
        sb.append(", pageToken=").append(String.valueOf(this.pageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchModelDeploymentsDetails)) {
            return false;
        }

        SearchModelDeploymentsDetails other = (SearchModelDeploymentsDetails) o;
        return java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.orderBy, other.orderBy) &&
            java.util.Objects.equals(this.pageToken, other.pageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        return result;
    }


}
