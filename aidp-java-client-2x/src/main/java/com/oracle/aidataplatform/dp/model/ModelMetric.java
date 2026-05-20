// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Model metric.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelMetric.Builder.class)

public final class ModelMetric  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value", "timestamp", "step"})
    public ModelMetric(String key, Double value, Long timestamp, Long step) {
        super();
        this.key = key;
        this.value = value;
        this.timestamp = timestamp;
        this.step = step;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the metric.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * Name of the metric.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * Value of the metric.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Double value;

                /**
         * Value of the metric.
         * @param value the value to set
         * @return this builder
         **/
        

        public Builder value(Double value) {
        this.value = value;
        return this;
        }
            /**
     * Unix timestamp in milliseconds when this metric was recorded.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private Long timestamp;

                /**
         * Unix timestamp in milliseconds when this metric was recorded.
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


        public ModelMetric build() {
            ModelMetric model = new ModelMetric(this.key
                    , this.value
                    , this.timestamp
                    , this.step);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelMetric model) {
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
     * Name of the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Name of the metric.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Value of the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Double value;

        /**
     * Value of the metric.
     * @return the value
     **/
    
    public Double getValue() {
        return value;
    }


        /**
     * Unix timestamp in milliseconds when this metric was recorded.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final Long timestamp;

        /**
     * Unix timestamp in milliseconds when this metric was recorded.
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
        sb.append("ModelMetric(");
        sb.append("key=").append(String.valueOf(this.key));
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
        if (!(o instanceof ModelMetric)) {
            return false;
        }

        ModelMetric other = (ModelMetric) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.value, other.value) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.step, other.step);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.step == null ? 43 : this.step.hashCode());
        return result;
    }


}
