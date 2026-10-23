// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Aggregate metrics for the correlated invocation rows matching the request filters.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationSummaryMetrics.Builder.class)

public final class InferenceInvocationSummaryMetrics  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalRequests", "successfulRequests", "failedRequests", "successRatePercent", "malformedRequests", "averageResponseTimeMs"})
    public InferenceInvocationSummaryMetrics(Long totalRequests, Long successfulRequests, Long failedRequests, Double successRatePercent, Long malformedRequests, Double averageResponseTimeMs) {
        super();
        this.totalRequests = totalRequests;
        this.successfulRequests = successfulRequests;
        this.failedRequests = failedRequests;
        this.successRatePercent = successRatePercent;
        this.malformedRequests = malformedRequests;
        this.averageResponseTimeMs = averageResponseTimeMs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total number of correlated inference invocations in the resolved time range.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("totalRequests")
private Long totalRequests;

        /**
         * Total number of correlated inference invocations in the resolved time range.
         * @param totalRequests the value to set
         * @return this builder
         **/
        

public Builder totalRequests(Long totalRequests) {
    this.totalRequests = totalRequests;
    return this;
}
            /**
     * Number of correlated invocations whose inference response status is 2xx.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("successfulRequests")
private Long successfulRequests;

        /**
         * Number of correlated invocations whose inference response status is 2xx.
         * @param successfulRequests the value to set
         * @return this builder
         **/
        

public Builder successfulRequests(Long successfulRequests) {
    this.successfulRequests = successfulRequests;
    return this;
}
            /**
     * Number of correlated invocations whose inference response status is 5xx.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("failedRequests")
private Long failedRequests;

        /**
         * Number of correlated invocations whose inference response status is 5xx.
         * @param failedRequests the value to set
         * @return this builder
         **/
        

public Builder failedRequests(Long failedRequests) {
    this.failedRequests = failedRequests;
    return this;
}
            /**
     * Percentage of correlated invocations that succeeded, between 0 and 100.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("successRatePercent")
private Double successRatePercent;

        /**
         * Percentage of correlated invocations that succeeded, between 0 and 100.
         * @param successRatePercent the value to set
         * @return this builder
         **/
        

public Builder successRatePercent(Double successRatePercent) {
    this.successRatePercent = successRatePercent;
    return this;
}
            /**
     * Number of correlated requests whose inference response status is 4xx.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("malformedRequests")
private Long malformedRequests;

        /**
         * Number of correlated requests whose inference response status is 4xx.
         * @param malformedRequests the value to set
         * @return this builder
         **/
        

public Builder malformedRequests(Long malformedRequests) {
    this.malformedRequests = malformedRequests;
    return this;
}
            /**
     * Mean response latency in milliseconds across the correlated invocations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("averageResponseTimeMs")
private Double averageResponseTimeMs;

        /**
         * Mean response latency in milliseconds across the correlated invocations.
         * @param averageResponseTimeMs the value to set
         * @return this builder
         **/
        

public Builder averageResponseTimeMs(Double averageResponseTimeMs) {
    this.averageResponseTimeMs = averageResponseTimeMs;
    return this;
}


        public InferenceInvocationSummaryMetrics build() {
            InferenceInvocationSummaryMetrics model = new InferenceInvocationSummaryMetrics(this.totalRequests
                , this.successfulRequests
                , this.failedRequests
                , this.successRatePercent
                , this.malformedRequests
                , this.averageResponseTimeMs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationSummaryMetrics model) {
                this.totalRequests(model.getTotalRequests());
    this.successfulRequests(model.getSuccessfulRequests());
    this.failedRequests(model.getFailedRequests());
    this.successRatePercent(model.getSuccessRatePercent());
    this.malformedRequests(model.getMalformedRequests());
    this.averageResponseTimeMs(model.getAverageResponseTimeMs());
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
     * Total number of correlated inference invocations in the resolved time range.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalRequests")
    private final Long totalRequests;

        /**
     * Total number of correlated inference invocations in the resolved time range.
     * @return the value
     **/
    
    public Long getTotalRequests() {
        return totalRequests;
    }


        /**
     * Number of correlated invocations whose inference response status is 2xx.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("successfulRequests")
    private final Long successfulRequests;

        /**
     * Number of correlated invocations whose inference response status is 2xx.
     * @return the value
     **/
    
    public Long getSuccessfulRequests() {
        return successfulRequests;
    }


        /**
     * Number of correlated invocations whose inference response status is 5xx.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failedRequests")
    private final Long failedRequests;

        /**
     * Number of correlated invocations whose inference response status is 5xx.
     * @return the value
     **/
    
    public Long getFailedRequests() {
        return failedRequests;
    }


        /**
     * Percentage of correlated invocations that succeeded, between 0 and 100.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("successRatePercent")
    private final Double successRatePercent;

        /**
     * Percentage of correlated invocations that succeeded, between 0 and 100.
     * @return the value
     **/
    
    public Double getSuccessRatePercent() {
        return successRatePercent;
    }


        /**
     * Number of correlated requests whose inference response status is 4xx.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("malformedRequests")
    private final Long malformedRequests;

        /**
     * Number of correlated requests whose inference response status is 4xx.
     * @return the value
     **/
    
    public Long getMalformedRequests() {
        return malformedRequests;
    }


        /**
     * Mean response latency in milliseconds across the correlated invocations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("averageResponseTimeMs")
    private final Double averageResponseTimeMs;

        /**
     * Mean response latency in milliseconds across the correlated invocations.
     * @return the value
     **/
    
    public Double getAverageResponseTimeMs() {
        return averageResponseTimeMs;
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
        sb.append("InferenceInvocationSummaryMetrics(");
        sb.append("totalRequests=").append(String.valueOf(this.totalRequests));
        sb.append(", successfulRequests=").append(String.valueOf(this.successfulRequests));
        sb.append(", failedRequests=").append(String.valueOf(this.failedRequests));
        sb.append(", successRatePercent=").append(String.valueOf(this.successRatePercent));
        sb.append(", malformedRequests=").append(String.valueOf(this.malformedRequests));
        sb.append(", averageResponseTimeMs=").append(String.valueOf(this.averageResponseTimeMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationSummaryMetrics)) {
            return false;
        }

        InferenceInvocationSummaryMetrics other = (InferenceInvocationSummaryMetrics) o;
        return java.util.Objects.equals(this.totalRequests, other.totalRequests) &&
            java.util.Objects.equals(this.successfulRequests, other.successfulRequests) &&
            java.util.Objects.equals(this.failedRequests, other.failedRequests) &&
            java.util.Objects.equals(this.successRatePercent, other.successRatePercent) &&
            java.util.Objects.equals(this.malformedRequests, other.malformedRequests) &&
            java.util.Objects.equals(this.averageResponseTimeMs, other.averageResponseTimeMs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalRequests == null ? 43 : this.totalRequests.hashCode());
        result = (result * PRIME) + (this.successfulRequests == null ? 43 : this.successfulRequests.hashCode());
        result = (result * PRIME) + (this.failedRequests == null ? 43 : this.failedRequests.hashCode());
        result = (result * PRIME) + (this.successRatePercent == null ? 43 : this.successRatePercent.hashCode());
        result = (result * PRIME) + (this.malformedRequests == null ? 43 : this.malformedRequests.hashCode());
        result = (result * PRIME) + (this.averageResponseTimeMs == null ? 43 : this.averageResponseTimeMs.hashCode());
        return result;
    }


}
