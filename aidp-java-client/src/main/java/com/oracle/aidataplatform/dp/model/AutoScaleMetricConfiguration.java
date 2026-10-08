// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Autoscaling metric target for AI Compute.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AutoScaleMetricConfiguration.Builder.class)

public final class AutoScaleMetricConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "targetAverageValue"})
    public AutoScaleMetricConfiguration(Name name, String targetAverageValue) {
        super();
        this.name = name;
        this.targetAverageValue = targetAverageValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private Name name;

        /**
         * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(Name name) {
    this.name = name;
    return this;
}
            /**
     * Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetAverageValue")
private String targetAverageValue;

        /**
         * Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).
* 
         * @param targetAverageValue the value to set
         * @return this builder
         **/
        

public Builder targetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
}


        public AutoScaleMetricConfiguration build() {
            AutoScaleMetricConfiguration model = new AutoScaleMetricConfiguration(this.name
                , this.targetAverageValue);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScaleMetricConfiguration model) {
                this.name(model.getName());
    this.targetAverageValue(model.getTargetAverageValue());
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
     * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
     **/
    public enum Name implements com.oracle.bmc.http.internal.BmcEnum {
        ApiRequestsPerSecond("API_REQUESTS_PER_SECOND"),
        CpuUtilization("CPU_UTILIZATION"),
        MemoryUtilization("MEMORY_UTILIZATION"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Name.class);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Name name;

        /**
     * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
     * @return the value
     **/
    
    public Name getName() {
        return name;
    }


        /**
     * Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetAverageValue")
    private final String targetAverageValue;

        /**
     * Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).
* 
     * @return the value
     **/
    
    public String getTargetAverageValue() {
        return targetAverageValue;
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
        sb.append("AutoScaleMetricConfiguration(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", targetAverageValue=").append(String.valueOf(this.targetAverageValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScaleMetricConfiguration)) {
            return false;
        }

        AutoScaleMetricConfiguration other = (AutoScaleMetricConfiguration) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.targetAverageValue, other.targetAverageValue);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.targetAverageValue == null ? 43 : this.targetAverageValue.hashCode());
        return result;
    }


}
