// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Time range and granularity used for Metrics time-series data
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowSessionMetricsRange.Builder.class)

public final class AgentFlowSessionMetricsRange  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeBegin", "timeEnd", "granularity", "timezone"})
    public AgentFlowSessionMetricsRange(java.util.Date timeBegin, java.util.Date timeEnd, String granularity, String timezone) {
        super();
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.granularity = granularity;
        this.timezone = timezone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Start time for Metrics data
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

                /**
         * Start time for Metrics data
         * @param timeBegin the value to set
         * @return this builder
         **/
        

        public Builder timeBegin(java.util.Date timeBegin) {
        this.timeBegin = timeBegin;
        return this;
        }
            /**
     * End time for Metrics data
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

                /**
         * End time for Metrics data
         * @param timeEnd the value to set
         * @return this builder
         **/
        

        public Builder timeEnd(java.util.Date timeEnd) {
        this.timeEnd = timeEnd;
        return this;
        }
            /**
     * Granularity within the selected time range
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private String granularity;

                /**
         * Granularity within the selected time range
         * @param granularity the value to set
         * @return this builder
         **/
        

        public Builder granularity(String granularity) {
        this.granularity = granularity;
        return this;
        }
            /**
     * Time zone used for metrics data
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

                /**
         * Time zone used for metrics data
         * @param timezone the value to set
         * @return this builder
         **/
        

        public Builder timezone(String timezone) {
        this.timezone = timezone;
        return this;
        }


        public AgentFlowSessionMetricsRange build() {
            AgentFlowSessionMetricsRange model = new AgentFlowSessionMetricsRange(this.timeBegin
                    , this.timeEnd
                    , this.granularity
                    , this.timezone);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowSessionMetricsRange model) {
                this.timeBegin(model.getTimeBegin());
    this.timeEnd(model.getTimeEnd());
    this.granularity(model.getGranularity());
    this.timezone(model.getTimezone());
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
     * Start time for Metrics data
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

        /**
     * Start time for Metrics data
     * @return the value
     **/
    
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }


        /**
     * End time for Metrics data
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

        /**
     * End time for Metrics data
     * @return the value
     **/
    
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }


        /**
     * Granularity within the selected time range
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    private final String granularity;

        /**
     * Granularity within the selected time range
     * @return the value
     **/
    
    public String getGranularity() {
        return granularity;
    }


        /**
     * Time zone used for metrics data
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

        /**
     * Time zone used for metrics data
     * @return the value
     **/
    
    public String getTimezone() {
        return timezone;
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
        sb.append("AgentFlowSessionMetricsRange(");
        sb.append("timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowSessionMetricsRange)) {
            return false;
        }

        AgentFlowSessionMetricsRange other = (AgentFlowSessionMetricsRange) o;
        return java.util.Objects.equals(this.timeBegin, other.timeBegin) &&
            java.util.Objects.equals(this.timeEnd, other.timeEnd) &&
            java.util.Objects.equals(this.granularity, other.granularity) &&
            java.util.Objects.equals(this.timezone, other.timezone);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        return result;
    }


}
