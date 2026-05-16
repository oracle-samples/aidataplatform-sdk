// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request payload for summarizing compute metrics data.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SummarizeMetricsDataDetails.Builder.class)

public final class SummarizeMetricsDataDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"aggregationType", "metricName", "timeBegin", "timeEnd", "interval", "resolution"})
    public SummarizeMetricsDataDetails(AggregationType aggregationType, String metricName, java.util.Date timeBegin, java.util.Date timeEnd, String interval, String resolution) {
        super();
        this.aggregationType = aggregationType;
        this.metricName = metricName;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.interval = interval;
        this.resolution = resolution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The type of aggregation to apply.
* - Standard Aggregations: {@code MAX}, {@code MEAN}, {@code MIN}, {@code SUM}, {@code RATE}.
* - Percentile Aggregation: Use {@code Pxx}, where {@code xx} is the percentile value (e.g., {@code P80} for the 80th percentile).
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aggregationType")
private AggregationType aggregationType;

        /**
         * The type of aggregation to apply.
* - Standard Aggregations: {@code MAX}, {@code MEAN}, {@code MIN}, {@code SUM}, {@code RATE}.
* - Percentile Aggregation: Use {@code Pxx}, where {@code xx} is the percentile value (e.g., {@code P80} for the 80th percentile).
* 
         * @param aggregationType the value to set
         * @return this builder
         **/
        

public Builder aggregationType(AggregationType aggregationType) {
    this.aggregationType = aggregationType;
    return this;
}
            /**
     * The metric to summarize. 
* - Supported values include but are not limited to:
*   - {@code CPU_UTILIZATION}, {@code MEMORY_UTILIZATION}, {@code FILE_SYSTEM_UTILIZATION}, {@code GC_CPU_UTILIZATION}
*   - {@code DISK_READ_BYTES}, {@code DISK_WRITE_BYTES}, {@code NETWORK_RECEIVE_BYTES}, {@code NETWORK_TRANSMIT_BYTES}
*   - {@code APP_STATUS}, {@code EXECUTOR_METRICS}, {@code SYSTEM_CPU}, {@code SYSTEM_MEMORY}
*   - {@code SYSTEM_NETWORK_IN}, {@code SYSTEM_NETWORK_OUT}, {@code SYSTEM_DISK_READ}, {@code SYSTEM_DISK_WRITE}
*   - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
* - Refer to API documentation or contact support for the latest supported metric list.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metricName")
private String metricName;

        /**
         * The metric to summarize. 
* - Supported values include but are not limited to:
*   - {@code CPU_UTILIZATION}, {@code MEMORY_UTILIZATION}, {@code FILE_SYSTEM_UTILIZATION}, {@code GC_CPU_UTILIZATION}
*   - {@code DISK_READ_BYTES}, {@code DISK_WRITE_BYTES}, {@code NETWORK_RECEIVE_BYTES}, {@code NETWORK_TRANSMIT_BYTES}
*   - {@code APP_STATUS}, {@code EXECUTOR_METRICS}, {@code SYSTEM_CPU}, {@code SYSTEM_MEMORY}
*   - {@code SYSTEM_NETWORK_IN}, {@code SYSTEM_NETWORK_OUT}, {@code SYSTEM_DISK_READ}, {@code SYSTEM_DISK_WRITE}
*   - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
* - Refer to API documentation or contact support for the latest supported metric list.
* 
         * @param metricName the value to set
         * @return this builder
         **/
        

public Builder metricName(String metricName) {
    this.metricName = metricName;
    return this;
}
            /**
     * The beginning of the time range to use when searching for metric data points. Format is RFC 3339.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
private java.util.Date timeBegin;

        /**
         * The beginning of the time range to use when searching for metric data points. Format is RFC 3339.
         * @param timeBegin the value to set
         * @return this builder
         **/
        

public Builder timeBegin(java.util.Date timeBegin) {
    this.timeBegin = timeBegin;
    return this;
}
            /**
     * The end of the time range to use when searching for metric data points. Format is RFC 3339.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
private java.util.Date timeEnd;

        /**
         * The end of the time range to use when searching for metric data points. Format is RFC 3339.
         * @param timeEnd the value to set
         * @return this builder
         **/
        

public Builder timeEnd(java.util.Date timeEnd) {
    this.timeEnd = timeEnd;
    return this;
}
            /**
     * The time window used to convert the set of raw data points.
* The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
* For example, for a five-minute interval, the timestamp "2:05" corresponds to the five-minute time window from 2:00:00 to 2:05:00.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("interval")
private String interval;

        /**
         * The time window used to convert the set of raw data points.
* The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
* For example, for a five-minute interval, the timestamp "2:05" corresponds to the five-minute time window from 2:00:00 to 2:05:00.
* 
         * @param interval the value to set
         * @return this builder
         **/
        

public Builder interval(String interval) {
    this.interval = interval;
    return this;
}
            /**
     * The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
* For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
* The resolution must be equal to or less than the interval in the query.
* The default resolution is 1m (one minute).
* Supported values: 1m-60m, 1h-24h, 1d.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resolution")
private String resolution;

        /**
         * The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
* For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
* The resolution must be equal to or less than the interval in the query.
* The default resolution is 1m (one minute).
* Supported values: 1m-60m, 1h-24h, 1d.
* 
         * @param resolution the value to set
         * @return this builder
         **/
        

public Builder resolution(String resolution) {
    this.resolution = resolution;
    return this;
}


        public SummarizeMetricsDataDetails build() {
            SummarizeMetricsDataDetails model = new SummarizeMetricsDataDetails(this.aggregationType
                , this.metricName
                , this.timeBegin
                , this.timeEnd
                , this.interval
                , this.resolution);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeMetricsDataDetails model) {
                this.aggregationType(model.getAggregationType());
    this.metricName(model.getMetricName());
    this.timeBegin(model.getTimeBegin());
    this.timeEnd(model.getTimeEnd());
    this.interval(model.getInterval());
    this.resolution(model.getResolution());
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
     * The type of aggregation to apply.
* - Standard Aggregations: {@code MAX}, {@code MEAN}, {@code MIN}, {@code SUM}, {@code RATE}.
* - Percentile Aggregation: Use {@code Pxx}, where {@code xx} is the percentile value (e.g., {@code P80} for the 80th percentile).
* 
     **/
    public enum AggregationType implements com.oracle.bmc.http.internal.BmcEnum {
        Max("MAX"),
        Mean("MEAN"),
        Min("MIN"),
        Sum("SUM"),
        Rate("RATE"),
        P50("P50"),
        P80("P80"),
        P90("P90"),
        P95("P95"),
        P99("P99"),
        P999("P99_9"),
        ;

        

        private final String value;
        private static java.util.Map<String, AggregationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AggregationType v : AggregationType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        AggregationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AggregationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AggregationType: " + key);
        }
    };
        /**
     * The type of aggregation to apply.
* - Standard Aggregations: {@code MAX}, {@code MEAN}, {@code MIN}, {@code SUM}, {@code RATE}.
* - Percentile Aggregation: Use {@code Pxx}, where {@code xx} is the percentile value (e.g., {@code P80} for the 80th percentile).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationType")
    private final AggregationType aggregationType;

        /**
     * The type of aggregation to apply.
* - Standard Aggregations: {@code MAX}, {@code MEAN}, {@code MIN}, {@code SUM}, {@code RATE}.
* - Percentile Aggregation: Use {@code Pxx}, where {@code xx} is the percentile value (e.g., {@code P80} for the 80th percentile).
* 
     * @return the value
     **/
    
    public AggregationType getAggregationType() {
        return aggregationType;
    }


        /**
     * The metric to summarize. 
* - Supported values include but are not limited to:
*   - {@code CPU_UTILIZATION}, {@code MEMORY_UTILIZATION}, {@code FILE_SYSTEM_UTILIZATION}, {@code GC_CPU_UTILIZATION}
*   - {@code DISK_READ_BYTES}, {@code DISK_WRITE_BYTES}, {@code NETWORK_RECEIVE_BYTES}, {@code NETWORK_TRANSMIT_BYTES}
*   - {@code APP_STATUS}, {@code EXECUTOR_METRICS}, {@code SYSTEM_CPU}, {@code SYSTEM_MEMORY}
*   - {@code SYSTEM_NETWORK_IN}, {@code SYSTEM_NETWORK_OUT}, {@code SYSTEM_DISK_READ}, {@code SYSTEM_DISK_WRITE}
*   - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
* - Refer to API documentation or contact support for the latest supported metric list.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

        /**
     * The metric to summarize. 
* - Supported values include but are not limited to:
*   - {@code CPU_UTILIZATION}, {@code MEMORY_UTILIZATION}, {@code FILE_SYSTEM_UTILIZATION}, {@code GC_CPU_UTILIZATION}
*   - {@code DISK_READ_BYTES}, {@code DISK_WRITE_BYTES}, {@code NETWORK_RECEIVE_BYTES}, {@code NETWORK_TRANSMIT_BYTES}
*   - {@code APP_STATUS}, {@code EXECUTOR_METRICS}, {@code SYSTEM_CPU}, {@code SYSTEM_MEMORY}
*   - {@code SYSTEM_NETWORK_IN}, {@code SYSTEM_NETWORK_OUT}, {@code SYSTEM_DISK_READ}, {@code SYSTEM_DISK_WRITE}
*   - Additional metrics such as task-related and shuffle metrics may be introduced in the future.
* - Refer to API documentation or contact support for the latest supported metric list.
* 
     * @return the value
     **/
    
    public String getMetricName() {
        return metricName;
    }


        /**
     * The beginning of the time range to use when searching for metric data points. Format is RFC 3339.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

        /**
     * The beginning of the time range to use when searching for metric data points. Format is RFC 3339.
     * @return the value
     **/
    
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }


        /**
     * The end of the time range to use when searching for metric data points. Format is RFC 3339.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * The end of the time range to use when searching for metric data points. Format is RFC 3339.
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * The time window used to convert the set of raw data points.
* The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
* For example, for a five-minute interval, the timestamp "2:05" corresponds to the five-minute time window from 2:00:00 to 2:05:00.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("interval")
    private final String interval;

        /**
     * The time window used to convert the set of raw data points.
* The timestamp of the aggregated data point corresponds to the end of the time window during which raw data points are assessed.
* For example, for a five-minute interval, the timestamp "2:05" corresponds to the five-minute time window from 2:00:00 to 2:05:00.
* 
     * @return the value
     **/
    
    public String getInterval() {
        return interval;
    }


        /**
     * The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
* For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
* The resolution must be equal to or less than the interval in the query.
* The default resolution is 1m (one minute).
* Supported values: 1m-60m, 1h-24h, 1d.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

        /**
     * The time between calculated aggregation windows. Use with the query interval to vary the frequency for returning aggregated data points.
* For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency.
* The resolution must be equal to or less than the interval in the query.
* The default resolution is 1m (one minute).
* Supported values: 1m-60m, 1h-24h, 1d.
* 
     * @return the value
     **/
    
    public String getResolution() {
        return resolution;
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
        sb.append("SummarizeMetricsDataDetails(");
        sb.append("aggregationType=").append(String.valueOf(this.aggregationType));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", interval=").append(String.valueOf(this.interval));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeMetricsDataDetails)) {
            return false;
        }

        SummarizeMetricsDataDetails other = (SummarizeMetricsDataDetails) o;
        return java.util.Objects.equals(this.aggregationType, other.aggregationType) &&
            java.util.Objects.equals(this.metricName, other.metricName) &&
            java.util.Objects.equals(this.timeBegin, other.timeBegin) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.interval, other.interval) &&
            java.util.Objects.equals(this.resolution, other.resolution);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.aggregationType == null ? 43 : this.aggregationType.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.interval == null ? 43 : this.interval.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        return result;
    }


}
