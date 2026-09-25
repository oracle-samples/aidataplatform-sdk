// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing deployment activity summaries.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelDeploymentActivitySummaryCollection.Builder.class)

public final class ModelDeploymentActivitySummaryCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"activities", "nextPageToken"})
    public ModelDeploymentActivitySummaryCollection(java.util.List<DeploymentActivitySummary> activities, String nextPageToken) {
        super();
        this.activities = activities;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Activity summaries that match the search criteria.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activities")
private java.util.List<DeploymentActivitySummary> activities;

        /**
         * Activity summaries that match the search criteria.
         * @param activities the value to set
         * @return this builder
         **/
        

public Builder activities(java.util.List<DeploymentActivitySummary> activities) {
    this.activities = activities;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public ModelDeploymentActivitySummaryCollection build() {
            ModelDeploymentActivitySummaryCollection model = new ModelDeploymentActivitySummaryCollection(this.activities
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentActivitySummaryCollection model) {
                this.activities(model.getActivities());
    this.nextPageToken(model.getNextPageToken());
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
     * Activity summaries that match the search criteria.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activities")
    private final java.util.List<DeploymentActivitySummary> activities;

        /**
     * Activity summaries that match the search criteria.
     * @return the value
     **/
    
    public java.util.List<DeploymentActivitySummary> getActivities() {
        return activities;
    }


        /**
     * Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.
     * @return the value
     **/
    
    public String getNextPageToken() {
        return nextPageToken;
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
        sb.append("ModelDeploymentActivitySummaryCollection(");
        sb.append("activities=").append(String.valueOf(this.activities));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentActivitySummaryCollection)) {
            return false;
        }

        ModelDeploymentActivitySummaryCollection other = (ModelDeploymentActivitySummaryCollection) o;
        return java.util.Objects.equals(this.activities, other.activities) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.activities == null ? 43 : this.activities.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
