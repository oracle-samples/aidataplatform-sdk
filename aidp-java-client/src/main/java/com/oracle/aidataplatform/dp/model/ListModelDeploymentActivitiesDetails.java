// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filters and pagination for a deployment activity search.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ListModelDeploymentActivitiesDetails.Builder.class)

public final class ListModelDeploymentActivitiesDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "status", "maxResults", "orderBy", "pageToken"})
    public ListModelDeploymentActivitiesDetails(String deploymentId, DeploymentActivityStatus status, Long maxResults, java.util.List<String> orderBy, String pageToken) {
        super();
        this.deploymentId = deploymentId;
        this.status = status;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
        this.pageToken = pageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the deployment whose activities to list.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
private String deploymentId;

        /**
         * ID of the deployment whose activities to list.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
            /**
     * A filter over activity status.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private DeploymentActivityStatus status;

        /**
         * A filter over activity status.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(DeploymentActivityStatus status) {
    this.status = status;
    return this;
}
            /**
     * Maximum number of activities desired. Default is 100. Max threshold is 1000.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("max_results")
private Long maxResults;

        /**
         * Maximum number of activities desired. Default is 100. Max threshold is 1000.
         * @param maxResults the value to set
         * @return this builder
         **/
        

public Builder maxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
}
            /**
     * List of columns for ordering search results, e.g. 'start_time DESC'.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("order_by")
private java.util.List<String> orderBy;

        /**
         * List of columns for ordering search results, e.g. 'start_time DESC'.
         * @param orderBy the value to set
         * @return this builder
         **/
        

public Builder orderBy(java.util.List<String> orderBy) {
    this.orderBy = orderBy;
    return this;
}
            /**
     * Token indicating the page of activities to fetch.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("page_token")
private String pageToken;

        /**
         * Token indicating the page of activities to fetch.
         * @param pageToken the value to set
         * @return this builder
         **/
        

public Builder pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
}


        public ListModelDeploymentActivitiesDetails build() {
            ListModelDeploymentActivitiesDetails model = new ListModelDeploymentActivitiesDetails(this.deploymentId
                , this.status
                , this.maxResults
                , this.orderBy
                , this.pageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListModelDeploymentActivitiesDetails model) {
                this.deploymentId(model.getDeploymentId());
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
     * ID of the deployment whose activities to list.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_id")
    private final String deploymentId;

        /**
     * ID of the deployment whose activities to list.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
    }

    
        /**
     * A filter over activity status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DeploymentActivityStatus status;

        /**
     * A filter over activity status.
     * @return the value
     **/
    
    public DeploymentActivityStatus getStatus() {
        return status;
    }


        /**
     * Maximum number of activities desired. Default is 100. Max threshold is 1000.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_results")
    private final Long maxResults;

        /**
     * Maximum number of activities desired. Default is 100. Max threshold is 1000.
     * @return the value
     **/
    
    public Long getMaxResults() {
        return maxResults;
    }


        /**
     * List of columns for ordering search results, e.g. 'start_time DESC'.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("order_by")
    private final java.util.List<String> orderBy;

        /**
     * List of columns for ordering search results, e.g. 'start_time DESC'.
     * @return the value
     **/
    
    public java.util.List<String> getOrderBy() {
        return orderBy;
    }


        /**
     * Token indicating the page of activities to fetch.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("page_token")
    private final String pageToken;

        /**
     * Token indicating the page of activities to fetch.
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
        sb.append("ListModelDeploymentActivitiesDetails(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
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
        if (!(o instanceof ListModelDeploymentActivitiesDetails)) {
            return false;
        }

        ListModelDeploymentActivitiesDetails other = (ListModelDeploymentActivitiesDetails) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.maxResults, other.maxResults) &&
            java.util.Objects.equals(this.orderBy, other.orderBy) &&
            java.util.Objects.equals(this.pageToken, other.pageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.maxResults == null ? 43 : this.maxResults.hashCode());
        result = (result * PRIME) + (this.orderBy == null ? 43 : this.orderBy.hashCode());
        result = (result * PRIME) + (this.pageToken == null ? 43 : this.pageToken.hashCode());
        return result;
    }


}
