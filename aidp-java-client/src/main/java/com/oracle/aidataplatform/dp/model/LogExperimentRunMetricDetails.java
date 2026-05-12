package com.oracle.aidataplatform.dp.model;



/**
 * Details of an Experiment Run Metric
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogExperimentRunMetricDetails.Builder.class)

public final class LogExperimentRunMetricDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"runId", "key", "value", "timestamp", "step"})
    public LogExperimentRunMetricDetails(String runId, String key, Double value, Long timestamp, Long step) {
        super();
        this.runId = runId;
        this.key = key;
        this.value = value;
        this.timestamp = timestamp;
        this.step = step;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("run_id")
private String runId;

        /**
         * Unique identifier for the run.
         * @param runId the value to set
         * @return this builder
         **/
        

public Builder runId(String runId) {
    this.runId = runId;
    return this;
}
            /**
     * Name of the metric
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Name of the metric
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Value of the metric
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private Double value;

        /**
         * Value of the metric
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(Double value) {
    this.value = value;
    return this;
}
            /**
     * Unix timestamp in milliseconds when this metric being recorded.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timestamp")
private Long timestamp;

        /**
         * Unix timestamp in milliseconds when this metric being recorded.
         * @param timestamp the value to set
         * @return this builder
         **/
        

public Builder timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
}
            /**
     * Step at which to log the metric.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("step")
private Long step;

        /**
         * Step at which to log the metric.
         * @param step the value to set
         * @return this builder
         **/
        

public Builder step(Long step) {
    this.step = step;
    return this;
}


        public LogExperimentRunMetricDetails build() {
            LogExperimentRunMetricDetails model = new LogExperimentRunMetricDetails(this.runId
                , this.key
                , this.value
                , this.timestamp
                , this.step);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogExperimentRunMetricDetails model) {
                this.runId(model.getRunId());
    this.key(model.getKey());
    this.value(model.getValue());
    this.timestamp(model.getTimestamp());
    this.step(model.getStep());
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
     * Unique identifier for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("run_id")
    private final String runId;

        /**
     * Unique identifier for the run.
     * @return the value
     **/
    
    public String getRunId() {
        return runId;
    }


        /**
     * Name of the metric
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Name of the metric
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Value of the metric
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Double value;

        /**
     * Value of the metric
     * @return the value
     **/
    
    public Double getValue() {
        return value;
    }


        /**
     * Unix timestamp in milliseconds when this metric being recorded.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final Long timestamp;

        /**
     * Unix timestamp in milliseconds when this metric being recorded.
     * @return the value
     **/
    
    public Long getTimestamp() {
        return timestamp;
    }


        /**
     * Step at which to log the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("step")
    private final Long step;

        /**
     * Step at which to log the metric.
     * @return the value
     **/
    
    public Long getStep() {
        return step;
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
        sb.append("LogExperimentRunMetricDetails(");
        sb.append("runId=").append(String.valueOf(this.runId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", step=").append(String.valueOf(this.step));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogExperimentRunMetricDetails)) {
            return false;
        }

        LogExperimentRunMetricDetails other = (LogExperimentRunMetricDetails) o;
        return java.util.Objects.equals(this.runId, other.runId) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.value, other.value) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.step, other.step);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.step == null ? 43 : this.step.hashCode());
        return result;
    }


}
