// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * keyed time series
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KeyedTimeSeries.Builder.class)

public final class KeyedTimeSeries  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "aggregatedTimeSeriesDataPoints"})
    public KeyedTimeSeries(String key, java.util.List<AggregatedTimeSeriesDataPoint> aggregatedTimeSeriesDataPoints) {
        super();
        this.key = key;
        this.aggregatedTimeSeriesDataPoints = aggregatedTimeSeriesDataPoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * KPI field name (e.g., totalSessions, totalInputTokenCount)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * KPI field name (e.g., totalSessions, totalInputTokenCount)
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * aggregated time series data points
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedTimeSeriesDataPoints")
        private java.util.List<AggregatedTimeSeriesDataPoint> aggregatedTimeSeriesDataPoints;

                /**
         * aggregated time series data points
         * @param aggregatedTimeSeriesDataPoints the value to set
         * @return this builder
         **/
        

        public Builder aggregatedTimeSeriesDataPoints(java.util.List<AggregatedTimeSeriesDataPoint> aggregatedTimeSeriesDataPoints) {
        this.aggregatedTimeSeriesDataPoints = aggregatedTimeSeriesDataPoints;
        return this;
        }


        public KeyedTimeSeries build() {
            KeyedTimeSeries model = new KeyedTimeSeries(this.key
                    , this.aggregatedTimeSeriesDataPoints);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyedTimeSeries model) {
                this.key(model.getKey());
    this.aggregatedTimeSeriesDataPoints(model.getAggregatedTimeSeriesDataPoints());
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
     * KPI field name (e.g., totalSessions, totalInputTokenCount)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * KPI field name (e.g., totalSessions, totalInputTokenCount)
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * aggregated time series data points
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedTimeSeriesDataPoints")
    private final java.util.List<AggregatedTimeSeriesDataPoint> aggregatedTimeSeriesDataPoints;

        /**
     * aggregated time series data points
     * @return the value
     **/
    
    public java.util.List<AggregatedTimeSeriesDataPoint> getAggregatedTimeSeriesDataPoints() {
        return aggregatedTimeSeriesDataPoints;
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
        sb.append("KeyedTimeSeries(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", aggregatedTimeSeriesDataPoints=").append(String.valueOf(this.aggregatedTimeSeriesDataPoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyedTimeSeries)) {
            return false;
        }

        KeyedTimeSeries other = (KeyedTimeSeries) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.aggregatedTimeSeriesDataPoints, other.aggregatedTimeSeriesDataPoints);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.aggregatedTimeSeriesDataPoints == null ? 43 : this.aggregatedTimeSeriesDataPoints.hashCode());
        return result;
    }


}
