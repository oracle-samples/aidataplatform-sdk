// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Result of history of ExperimentRun metrics.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExperimentRunMetricHistoryCollection.Builder.class)

public final class ExperimentRunMetricHistoryCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"metrics", "nextPageToken"})
    public ExperimentRunMetricHistoryCollection(java.util.List<ExperimentRunMetric> metrics, String nextPageToken) {
        super();
        this.metrics = metrics;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Logged values for the metric
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<ExperimentRunMetric> metrics;

                /**
         * Logged values for the metric
         * @param metrics the value to set
         * @return this builder
         **/
        

        public Builder metrics(java.util.List<ExperimentRunMetric> metrics) {
        this.metrics = metrics;
        return this;
        }
            /**
     * Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
        private String nextPageToken;

                /**
         * Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

        public Builder nextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
        }


        public ExperimentRunMetricHistoryCollection build() {
            ExperimentRunMetricHistoryCollection model = new ExperimentRunMetricHistoryCollection(this.metrics
                    , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExperimentRunMetricHistoryCollection model) {
                this.metrics(model.getMetrics());
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
     * Logged values for the metric
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<ExperimentRunMetric> metrics;

        /**
     * Logged values for the metric
     * @return the value
     **/
    
    public java.util.List<ExperimentRunMetric> getMetrics() {
        return metrics;
    }


        /**
     * Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.
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
        sb.append("ExperimentRunMetricHistoryCollection(");
        sb.append("metrics=").append(String.valueOf(this.metrics));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExperimentRunMetricHistoryCollection)) {
            return false;
        }

        ExperimentRunMetricHistoryCollection other = (ExperimentRunMetricHistoryCollection) o;
        return java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
