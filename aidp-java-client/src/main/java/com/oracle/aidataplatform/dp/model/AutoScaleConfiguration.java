// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Autoscaling configuration for AI Compute. When the minimum and maximum replica counts differ, at least one metric is required; omitted metric targets are defaulted before the request is sent to Data Flow. The default targets are 10 requests per second for API_REQUESTS_PER_SECOND, 75 percent for CPU_UTILIZATION, and 75 percent for MEMORY_UTILIZATION. An empty object represents fixed compute when the replica counts match.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AutoScaleConfiguration.Builder.class)

public final class AutoScaleConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"metrics", "cooldownPeriodInMinutes"})
    public AutoScaleConfiguration(java.util.List<AutoScaleMetricConfiguration> metrics, Integer cooldownPeriodInMinutes) {
        super();
        this.metrics = metrics;
        this.cooldownPeriodInMinutes = cooldownPeriodInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metrics")
private java.util.List<AutoScaleMetricConfiguration> metrics;

        /**
         * Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.
         * @param metrics the value to set
         * @return this builder
         **/
        

public Builder metrics(java.util.List<AutoScaleMetricConfiguration> metrics) {
    this.metrics = metrics;
    return this;
}
            /**
     * Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cooldownPeriodInMinutes")
private Integer cooldownPeriodInMinutes;

        /**
         * Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
         * @param cooldownPeriodInMinutes the value to set
         * @return this builder
         **/
        

public Builder cooldownPeriodInMinutes(Integer cooldownPeriodInMinutes) {
    this.cooldownPeriodInMinutes = cooldownPeriodInMinutes;
    return this;
}


        public AutoScaleConfiguration build() {
            AutoScaleConfiguration model = new AutoScaleConfiguration(this.metrics
                , this.cooldownPeriodInMinutes);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScaleConfiguration model) {
                this.metrics(model.getMetrics());
    this.cooldownPeriodInMinutes(model.getCooldownPeriodInMinutes());
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
     * Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<AutoScaleMetricConfiguration> metrics;

        /**
     * Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.
     * @return the value
     **/
    
    public java.util.List<AutoScaleMetricConfiguration> getMetrics() {
        return metrics;
    }


        /**
     * Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cooldownPeriodInMinutes")
    private final Integer cooldownPeriodInMinutes;

        /**
     * Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows.
     * @return the value
     **/
    
    public Integer getCooldownPeriodInMinutes() {
        return cooldownPeriodInMinutes;
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
        sb.append("AutoScaleConfiguration(");
        sb.append("metrics=").append(String.valueOf(this.metrics));
        sb.append(", cooldownPeriodInMinutes=").append(String.valueOf(this.cooldownPeriodInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScaleConfiguration)) {
            return false;
        }

        AutoScaleConfiguration other = (AutoScaleConfiguration) o;
        return java.util.Objects.equals(this.metrics, other.metrics) &&
            java.util.Objects.equals(this.cooldownPeriodInMinutes, other.cooldownPeriodInMinutes);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.cooldownPeriodInMinutes == null ? 43 : this.cooldownPeriodInMinutes.hashCode());
        return result;
    }


}
