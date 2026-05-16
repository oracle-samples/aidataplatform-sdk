// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Aggregated time series data point
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AggregatedTimeSeriesDataPoint.Builder.class)

public final class AggregatedTimeSeriesDataPoint  {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "value"})
    public AggregatedTimeSeriesDataPoint(java.util.Date timestamp, Float value) {
        super();
        this.timestamp = timestamp;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Bucket start timestamp in UTC
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

                /**
         * Bucket start timestamp in UTC
         * @param timestamp the value to set
         * @return this builder
         **/
        

        public Builder timestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
        return this;
        }
            /**
     * Value for that time bucket
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Float value;

                /**
         * Value for that time bucket
         * @param value the value to set
         * @return this builder
         **/
        

        public Builder value(Float value) {
        this.value = value;
        return this;
        }


        public AggregatedTimeSeriesDataPoint build() {
            AggregatedTimeSeriesDataPoint model = new AggregatedTimeSeriesDataPoint(this.timestamp
                    , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AggregatedTimeSeriesDataPoint model) {
                this.timestamp(model.getTimestamp());
    this.value(model.getValue());
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
     * Bucket start timestamp in UTC
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

        /**
     * Bucket start timestamp in UTC
     * @return the value
     **/
    
    public java.util.Date getTimestamp() {
        return timestamp;
    }


        /**
     * Value for that time bucket
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Float value;

        /**
     * Value for that time bucket
     * @return the value
     **/
    
    public Float getValue() {
        return value;
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
        sb.append("AggregatedTimeSeriesDataPoint(");
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregatedTimeSeriesDataPoint)) {
            return false;
        }

        AggregatedTimeSeriesDataPoint other = (AggregatedTimeSeriesDataPoint) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
