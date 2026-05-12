package com.oracle.aidataplatform.dp.model;


/**
 * Session Metrics data for a agentFlow.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowSessionMetric.Builder.class)

public final class AgentFlowSessionMetric  {
    @Deprecated
    @java.beans.ConstructorProperties({"totalSessions", "successfulSessions", "failedSessions", "totalTokenUsage", "totalInputTokenCount", "totalOutputTokenCount", "avgTotalToken", "avgInputToken", "avgOutputToken", "avgSessionDuration", "minSessionDuration", "maxSessionDuration", "sessionDurationP50", "sessionDurationP95", "avgSessionLatency", "minSessionLatency", "maxSessionLatency", "sessionLatencyP50", "sessionLatencyP95", "totalSessionRequests", "successfulSessionRequests", "failedSessionRequests", "totalErrorCount", "userErrorCount", "systemErrorCount", "range", "dataPoints"})
    public AgentFlowSessionMetric(Integer totalSessions, Integer successfulSessions, Integer failedSessions, Integer totalTokenUsage, Integer totalInputTokenCount, Integer totalOutputTokenCount, Float avgTotalToken, Float avgInputToken, Float avgOutputToken, Float avgSessionDuration, Float minSessionDuration, Float maxSessionDuration, Float sessionDurationP50, Float sessionDurationP95, Float avgSessionLatency, Float minSessionLatency, Float maxSessionLatency, Float sessionLatencyP50, Float sessionLatencyP95, Integer totalSessionRequests, Integer successfulSessionRequests, Integer failedSessionRequests, Integer totalErrorCount, Integer userErrorCount, Integer systemErrorCount, AgentFlowSessionMetricsRange range, java.util.List<KeyedTimeSeries> dataPoints) {
        super();
        this.totalSessions = totalSessions;
        this.successfulSessions = successfulSessions;
        this.failedSessions = failedSessions;
        this.totalTokenUsage = totalTokenUsage;
        this.totalInputTokenCount = totalInputTokenCount;
        this.totalOutputTokenCount = totalOutputTokenCount;
        this.avgTotalToken = avgTotalToken;
        this.avgInputToken = avgInputToken;
        this.avgOutputToken = avgOutputToken;
        this.avgSessionDuration = avgSessionDuration;
        this.minSessionDuration = minSessionDuration;
        this.maxSessionDuration = maxSessionDuration;
        this.sessionDurationP50 = sessionDurationP50;
        this.sessionDurationP95 = sessionDurationP95;
        this.avgSessionLatency = avgSessionLatency;
        this.minSessionLatency = minSessionLatency;
        this.maxSessionLatency = maxSessionLatency;
        this.sessionLatencyP50 = sessionLatencyP50;
        this.sessionLatencyP95 = sessionLatencyP95;
        this.totalSessionRequests = totalSessionRequests;
        this.successfulSessionRequests = successfulSessionRequests;
        this.failedSessionRequests = failedSessionRequests;
        this.totalErrorCount = totalErrorCount;
        this.userErrorCount = userErrorCount;
        this.systemErrorCount = systemErrorCount;
        this.range = range;
        this.dataPoints = dataPoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The total number of sessions for the agent flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalSessions")
        private Integer totalSessions;

                /**
         * The total number of sessions for the agent flow
         * @param totalSessions the value to set
         * @return this builder
         **/
        

        public Builder totalSessions(Integer totalSessions) {
        this.totalSessions = totalSessions;
        return this;
        }
            /**
     * The number of successful sessions for the agent flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("successfulSessions")
        private Integer successfulSessions;

                /**
         * The number of successful sessions for the agent flow
         * @param successfulSessions the value to set
         * @return this builder
         **/
        

        public Builder successfulSessions(Integer successfulSessions) {
        this.successfulSessions = successfulSessions;
        return this;
        }
            /**
     * The number of failed sessions for the agent flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("failedSessions")
        private Integer failedSessions;

                /**
         * The number of failed sessions for the agent flow
         * @param failedSessions the value to set
         * @return this builder
         **/
        

        public Builder failedSessions(Integer failedSessions) {
        this.failedSessions = failedSessions;
        return this;
        }
            /**
     * The total token usage for all sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalTokenUsage")
        private Integer totalTokenUsage;

                /**
         * The total token usage for all sessions
         * @param totalTokenUsage the value to set
         * @return this builder
         **/
        

        public Builder totalTokenUsage(Integer totalTokenUsage) {
        this.totalTokenUsage = totalTokenUsage;
        return this;
        }
            /**
     * The total input token usage count
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalInputTokenCount")
        private Integer totalInputTokenCount;

                /**
         * The total input token usage count
         * @param totalInputTokenCount the value to set
         * @return this builder
         **/
        

        public Builder totalInputTokenCount(Integer totalInputTokenCount) {
        this.totalInputTokenCount = totalInputTokenCount;
        return this;
        }
            /**
     * The total input token usage count
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalOutputTokenCount")
        private Integer totalOutputTokenCount;

                /**
         * The total input token usage count
         * @param totalOutputTokenCount the value to set
         * @return this builder
         **/
        

        public Builder totalOutputTokenCount(Integer totalOutputTokenCount) {
        this.totalOutputTokenCount = totalOutputTokenCount;
        return this;
        }
            /**
     * The average total token usage by session
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("avgTotalToken")
        private Float avgTotalToken;

                /**
         * The average total token usage by session
         * @param avgTotalToken the value to set
         * @return this builder
         **/
        

        public Builder avgTotalToken(Float avgTotalToken) {
        this.avgTotalToken = avgTotalToken;
        return this;
        }
            /**
     * The average input token usage by session
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("avgInputToken")
        private Float avgInputToken;

                /**
         * The average input token usage by session
         * @param avgInputToken the value to set
         * @return this builder
         **/
        

        public Builder avgInputToken(Float avgInputToken) {
        this.avgInputToken = avgInputToken;
        return this;
        }
            /**
     * The average output token usage by session
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("avgOutputToken")
        private Float avgOutputToken;

                /**
         * The average output token usage by session
         * @param avgOutputToken the value to set
         * @return this builder
         **/
        

        public Builder avgOutputToken(Float avgOutputToken) {
        this.avgOutputToken = avgOutputToken;
        return this;
        }
            /**
     * The average duration of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("avgSessionDuration")
        private Float avgSessionDuration;

                /**
         * The average duration of sessions
         * @param avgSessionDuration the value to set
         * @return this builder
         **/
        

        public Builder avgSessionDuration(Float avgSessionDuration) {
        this.avgSessionDuration = avgSessionDuration;
        return this;
        }
            /**
     * The min duration of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("minSessionDuration")
        private Float minSessionDuration;

                /**
         * The min duration of sessions
         * @param minSessionDuration the value to set
         * @return this builder
         **/
        

        public Builder minSessionDuration(Float minSessionDuration) {
        this.minSessionDuration = minSessionDuration;
        return this;
        }
            /**
     * The max duration of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionDuration")
        private Float maxSessionDuration;

                /**
         * The max duration of sessions
         * @param maxSessionDuration the value to set
         * @return this builder
         **/
        

        public Builder maxSessionDuration(Float maxSessionDuration) {
        this.maxSessionDuration = maxSessionDuration;
        return this;
        }
            /**
     * The 50th percentile duration of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sessionDurationP50")
        private Float sessionDurationP50;

                /**
         * The 50th percentile duration of sessions
         * @param sessionDurationP50 the value to set
         * @return this builder
         **/
        

        public Builder sessionDurationP50(Float sessionDurationP50) {
        this.sessionDurationP50 = sessionDurationP50;
        return this;
        }
            /**
     * The 95th percentile duration of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sessionDurationP95")
        private Float sessionDurationP95;

                /**
         * The 95th percentile duration of sessions
         * @param sessionDurationP95 the value to set
         * @return this builder
         **/
        

        public Builder sessionDurationP95(Float sessionDurationP95) {
        this.sessionDurationP95 = sessionDurationP95;
        return this;
        }
            /**
     * The average Latency of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("avgSessionLatency")
        private Float avgSessionLatency;

                /**
         * The average Latency of sessions
         * @param avgSessionLatency the value to set
         * @return this builder
         **/
        

        public Builder avgSessionLatency(Float avgSessionLatency) {
        this.avgSessionLatency = avgSessionLatency;
        return this;
        }
            /**
     * The min Latency of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("minSessionLatency")
        private Float minSessionLatency;

                /**
         * The min Latency of sessions
         * @param minSessionLatency the value to set
         * @return this builder
         **/
        

        public Builder minSessionLatency(Float minSessionLatency) {
        this.minSessionLatency = minSessionLatency;
        return this;
        }
            /**
     * The max Latency of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("maxSessionLatency")
        private Float maxSessionLatency;

                /**
         * The max Latency of sessions
         * @param maxSessionLatency the value to set
         * @return this builder
         **/
        

        public Builder maxSessionLatency(Float maxSessionLatency) {
        this.maxSessionLatency = maxSessionLatency;
        return this;
        }
            /**
     * The 50th percentile Latency of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sessionLatencyP50")
        private Float sessionLatencyP50;

                /**
         * The 50th percentile Latency of sessions
         * @param sessionLatencyP50 the value to set
         * @return this builder
         **/
        

        public Builder sessionLatencyP50(Float sessionLatencyP50) {
        this.sessionLatencyP50 = sessionLatencyP50;
        return this;
        }
            /**
     * The 95th percentile Latency of sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sessionLatencyP95")
        private Float sessionLatencyP95;

                /**
         * The 95th percentile Latency of sessions
         * @param sessionLatencyP95 the value to set
         * @return this builder
         **/
        

        public Builder sessionLatencyP95(Float sessionLatencyP95) {
        this.sessionLatencyP95 = sessionLatencyP95;
        return this;
        }
            /**
     * The total requests for all sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalSessionRequests")
        private Integer totalSessionRequests;

                /**
         * The total requests for all sessions
         * @param totalSessionRequests the value to set
         * @return this builder
         **/
        

        public Builder totalSessionRequests(Integer totalSessionRequests) {
        this.totalSessionRequests = totalSessionRequests;
        return this;
        }
            /**
     * The successful requests for all sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("successfulSessionRequests")
        private Integer successfulSessionRequests;

                /**
         * The successful requests for all sessions
         * @param successfulSessionRequests the value to set
         * @return this builder
         **/
        

        public Builder successfulSessionRequests(Integer successfulSessionRequests) {
        this.successfulSessionRequests = successfulSessionRequests;
        return this;
        }
            /**
     * The failed requests for all sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("failedSessionRequests")
        private Integer failedSessionRequests;

                /**
         * The failed requests for all sessions
         * @param failedSessionRequests the value to set
         * @return this builder
         **/
        

        public Builder failedSessionRequests(Integer failedSessionRequests) {
        this.failedSessionRequests = failedSessionRequests;
        return this;
        }
            /**
     * The total error count for all sessions
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("totalErrorCount")
        private Integer totalErrorCount;

                /**
         * The total error count for all sessions
         * @param totalErrorCount the value to set
         * @return this builder
         **/
        

        public Builder totalErrorCount(Integer totalErrorCount) {
        this.totalErrorCount = totalErrorCount;
        return this;
        }
            /**
     * The user error count
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userErrorCount")
        private Integer userErrorCount;

                /**
         * The user error count
         * @param userErrorCount the value to set
         * @return this builder
         **/
        

        public Builder userErrorCount(Integer userErrorCount) {
        this.userErrorCount = userErrorCount;
        return this;
        }
            /**
     * The system error count
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("systemErrorCount")
        private Integer systemErrorCount;

                /**
         * The system error count
         * @param systemErrorCount the value to set
         * @return this builder
         **/
        

        public Builder systemErrorCount(Integer systemErrorCount) {
        this.systemErrorCount = systemErrorCount;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("range")
        private AgentFlowSessionMetricsRange range;

        

        public Builder range(AgentFlowSessionMetricsRange range) {
        this.range = range;
        return this;
        }
            /**
     * Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dataPoints")
        private java.util.List<KeyedTimeSeries> dataPoints;

                /**
         * Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.
* 
         * @param dataPoints the value to set
         * @return this builder
         **/
        

        public Builder dataPoints(java.util.List<KeyedTimeSeries> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
        }


        public AgentFlowSessionMetric build() {
            AgentFlowSessionMetric model = new AgentFlowSessionMetric(this.totalSessions
                    , this.successfulSessions
                    , this.failedSessions
                    , this.totalTokenUsage
                    , this.totalInputTokenCount
                    , this.totalOutputTokenCount
                    , this.avgTotalToken
                    , this.avgInputToken
                    , this.avgOutputToken
                    , this.avgSessionDuration
                    , this.minSessionDuration
                    , this.maxSessionDuration
                    , this.sessionDurationP50
                    , this.sessionDurationP95
                    , this.avgSessionLatency
                    , this.minSessionLatency
                    , this.maxSessionLatency
                    , this.sessionLatencyP50
                    , this.sessionLatencyP95
                    , this.totalSessionRequests
                    , this.successfulSessionRequests
                    , this.failedSessionRequests
                    , this.totalErrorCount
                    , this.userErrorCount
                    , this.systemErrorCount
                    , this.range
                    , this.dataPoints);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowSessionMetric model) {
                this.totalSessions(model.getTotalSessions());
    this.successfulSessions(model.getSuccessfulSessions());
    this.failedSessions(model.getFailedSessions());
    this.totalTokenUsage(model.getTotalTokenUsage());
    this.totalInputTokenCount(model.getTotalInputTokenCount());
    this.totalOutputTokenCount(model.getTotalOutputTokenCount());
    this.avgTotalToken(model.getAvgTotalToken());
    this.avgInputToken(model.getAvgInputToken());
    this.avgOutputToken(model.getAvgOutputToken());
    this.avgSessionDuration(model.getAvgSessionDuration());
    this.minSessionDuration(model.getMinSessionDuration());
    this.maxSessionDuration(model.getMaxSessionDuration());
    this.sessionDurationP50(model.getSessionDurationP50());
    this.sessionDurationP95(model.getSessionDurationP95());
    this.avgSessionLatency(model.getAvgSessionLatency());
    this.minSessionLatency(model.getMinSessionLatency());
    this.maxSessionLatency(model.getMaxSessionLatency());
    this.sessionLatencyP50(model.getSessionLatencyP50());
    this.sessionLatencyP95(model.getSessionLatencyP95());
    this.totalSessionRequests(model.getTotalSessionRequests());
    this.successfulSessionRequests(model.getSuccessfulSessionRequests());
    this.failedSessionRequests(model.getFailedSessionRequests());
    this.totalErrorCount(model.getTotalErrorCount());
    this.userErrorCount(model.getUserErrorCount());
    this.systemErrorCount(model.getSystemErrorCount());
    this.range(model.getRange());
    this.dataPoints(model.getDataPoints());
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
     * The total number of sessions for the agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalSessions")
    private final Integer totalSessions;

        /**
     * The total number of sessions for the agent flow
     * @return the value
     **/
    
    public Integer getTotalSessions() {
        return totalSessions;
    }


        /**
     * The number of successful sessions for the agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("successfulSessions")
    private final Integer successfulSessions;

        /**
     * The number of successful sessions for the agent flow
     * @return the value
     **/
    
    public Integer getSuccessfulSessions() {
        return successfulSessions;
    }


        /**
     * The number of failed sessions for the agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failedSessions")
    private final Integer failedSessions;

        /**
     * The number of failed sessions for the agent flow
     * @return the value
     **/
    
    public Integer getFailedSessions() {
        return failedSessions;
    }


        /**
     * The total token usage for all sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalTokenUsage")
    private final Integer totalTokenUsage;

        /**
     * The total token usage for all sessions
     * @return the value
     **/
    
    public Integer getTotalTokenUsage() {
        return totalTokenUsage;
    }


        /**
     * The total input token usage count
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalInputTokenCount")
    private final Integer totalInputTokenCount;

        /**
     * The total input token usage count
     * @return the value
     **/
    
    public Integer getTotalInputTokenCount() {
        return totalInputTokenCount;
    }


        /**
     * The total input token usage count
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalOutputTokenCount")
    private final Integer totalOutputTokenCount;

        /**
     * The total input token usage count
     * @return the value
     **/
    
    public Integer getTotalOutputTokenCount() {
        return totalOutputTokenCount;
    }


        /**
     * The average total token usage by session
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("avgTotalToken")
    private final Float avgTotalToken;

        /**
     * The average total token usage by session
     * @return the value
     **/
    
    public Float getAvgTotalToken() {
        return avgTotalToken;
    }


        /**
     * The average input token usage by session
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("avgInputToken")
    private final Float avgInputToken;

        /**
     * The average input token usage by session
     * @return the value
     **/
    
    public Float getAvgInputToken() {
        return avgInputToken;
    }


        /**
     * The average output token usage by session
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("avgOutputToken")
    private final Float avgOutputToken;

        /**
     * The average output token usage by session
     * @return the value
     **/
    
    public Float getAvgOutputToken() {
        return avgOutputToken;
    }


        /**
     * The average duration of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("avgSessionDuration")
    private final Float avgSessionDuration;

        /**
     * The average duration of sessions
     * @return the value
     **/
    
    public Float getAvgSessionDuration() {
        return avgSessionDuration;
    }


        /**
     * The min duration of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minSessionDuration")
    private final Float minSessionDuration;

        /**
     * The min duration of sessions
     * @return the value
     **/
    
    public Float getMinSessionDuration() {
        return minSessionDuration;
    }


        /**
     * The max duration of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionDuration")
    private final Float maxSessionDuration;

        /**
     * The max duration of sessions
     * @return the value
     **/
    
    public Float getMaxSessionDuration() {
        return maxSessionDuration;
    }


        /**
     * The 50th percentile duration of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionDurationP50")
    private final Float sessionDurationP50;

        /**
     * The 50th percentile duration of sessions
     * @return the value
     **/
    
    public Float getSessionDurationP50() {
        return sessionDurationP50;
    }


        /**
     * The 95th percentile duration of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionDurationP95")
    private final Float sessionDurationP95;

        /**
     * The 95th percentile duration of sessions
     * @return the value
     **/
    
    public Float getSessionDurationP95() {
        return sessionDurationP95;
    }


        /**
     * The average Latency of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("avgSessionLatency")
    private final Float avgSessionLatency;

        /**
     * The average Latency of sessions
     * @return the value
     **/
    
    public Float getAvgSessionLatency() {
        return avgSessionLatency;
    }


        /**
     * The min Latency of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minSessionLatency")
    private final Float minSessionLatency;

        /**
     * The min Latency of sessions
     * @return the value
     **/
    
    public Float getMinSessionLatency() {
        return minSessionLatency;
    }


        /**
     * The max Latency of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxSessionLatency")
    private final Float maxSessionLatency;

        /**
     * The max Latency of sessions
     * @return the value
     **/
    
    public Float getMaxSessionLatency() {
        return maxSessionLatency;
    }


        /**
     * The 50th percentile Latency of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionLatencyP50")
    private final Float sessionLatencyP50;

        /**
     * The 50th percentile Latency of sessions
     * @return the value
     **/
    
    public Float getSessionLatencyP50() {
        return sessionLatencyP50;
    }


        /**
     * The 95th percentile Latency of sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionLatencyP95")
    private final Float sessionLatencyP95;

        /**
     * The 95th percentile Latency of sessions
     * @return the value
     **/
    
    public Float getSessionLatencyP95() {
        return sessionLatencyP95;
    }


        /**
     * The total requests for all sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalSessionRequests")
    private final Integer totalSessionRequests;

        /**
     * The total requests for all sessions
     * @return the value
     **/
    
    public Integer getTotalSessionRequests() {
        return totalSessionRequests;
    }


        /**
     * The successful requests for all sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("successfulSessionRequests")
    private final Integer successfulSessionRequests;

        /**
     * The successful requests for all sessions
     * @return the value
     **/
    
    public Integer getSuccessfulSessionRequests() {
        return successfulSessionRequests;
    }


        /**
     * The failed requests for all sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("failedSessionRequests")
    private final Integer failedSessionRequests;

        /**
     * The failed requests for all sessions
     * @return the value
     **/
    
    public Integer getFailedSessionRequests() {
        return failedSessionRequests;
    }


        /**
     * The total error count for all sessions
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("totalErrorCount")
    private final Integer totalErrorCount;

        /**
     * The total error count for all sessions
     * @return the value
     **/
    
    public Integer getTotalErrorCount() {
        return totalErrorCount;
    }


        /**
     * The user error count
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userErrorCount")
    private final Integer userErrorCount;

        /**
     * The user error count
     * @return the value
     **/
    
    public Integer getUserErrorCount() {
        return userErrorCount;
    }


        /**
     * The system error count
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemErrorCount")
    private final Integer systemErrorCount;

        /**
     * The system error count
     * @return the value
     **/
    
    public Integer getSystemErrorCount() {
        return systemErrorCount;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("range")
    private final AgentFlowSessionMetricsRange range;

    
    public AgentFlowSessionMetricsRange getRange() {
        return range;
    }


        /**
     * Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataPoints")
    private final java.util.List<KeyedTimeSeries> dataPoints;

        /**
     * Ordered list of time-series. Each entry is keyed by the same name as the KPI it represents.
* 
     * @return the value
     **/
    
    public java.util.List<KeyedTimeSeries> getDataPoints() {
        return dataPoints;
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
        sb.append("AgentFlowSessionMetric(");
        sb.append("totalSessions=").append(String.valueOf(this.totalSessions));
        sb.append(", successfulSessions=").append(String.valueOf(this.successfulSessions));
        sb.append(", failedSessions=").append(String.valueOf(this.failedSessions));
        sb.append(", totalTokenUsage=").append(String.valueOf(this.totalTokenUsage));
        sb.append(", totalInputTokenCount=").append(String.valueOf(this.totalInputTokenCount));
        sb.append(", totalOutputTokenCount=").append(String.valueOf(this.totalOutputTokenCount));
        sb.append(", avgTotalToken=").append(String.valueOf(this.avgTotalToken));
        sb.append(", avgInputToken=").append(String.valueOf(this.avgInputToken));
        sb.append(", avgOutputToken=").append(String.valueOf(this.avgOutputToken));
        sb.append(", avgSessionDuration=").append(String.valueOf(this.avgSessionDuration));
        sb.append(", minSessionDuration=").append(String.valueOf(this.minSessionDuration));
        sb.append(", maxSessionDuration=").append(String.valueOf(this.maxSessionDuration));
        sb.append(", sessionDurationP50=").append(String.valueOf(this.sessionDurationP50));
        sb.append(", sessionDurationP95=").append(String.valueOf(this.sessionDurationP95));
        sb.append(", avgSessionLatency=").append(String.valueOf(this.avgSessionLatency));
        sb.append(", minSessionLatency=").append(String.valueOf(this.minSessionLatency));
        sb.append(", maxSessionLatency=").append(String.valueOf(this.maxSessionLatency));
        sb.append(", sessionLatencyP50=").append(String.valueOf(this.sessionLatencyP50));
        sb.append(", sessionLatencyP95=").append(String.valueOf(this.sessionLatencyP95));
        sb.append(", totalSessionRequests=").append(String.valueOf(this.totalSessionRequests));
        sb.append(", successfulSessionRequests=").append(String.valueOf(this.successfulSessionRequests));
        sb.append(", failedSessionRequests=").append(String.valueOf(this.failedSessionRequests));
        sb.append(", totalErrorCount=").append(String.valueOf(this.totalErrorCount));
        sb.append(", userErrorCount=").append(String.valueOf(this.userErrorCount));
        sb.append(", systemErrorCount=").append(String.valueOf(this.systemErrorCount));
        sb.append(", range=").append(String.valueOf(this.range));
        sb.append(", dataPoints=").append(String.valueOf(this.dataPoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowSessionMetric)) {
            return false;
        }

        AgentFlowSessionMetric other = (AgentFlowSessionMetric) o;
        return java.util.Objects.equals(this.totalSessions, other.totalSessions) &&
            java.util.Objects.equals(this.successfulSessions, other.successfulSessions) &&
            java.util.Objects.equals(this.failedSessions, other.failedSessions) &&
            java.util.Objects.equals(this.totalTokenUsage, other.totalTokenUsage) &&
            java.util.Objects.equals(this.totalInputTokenCount, other.totalInputTokenCount) &&
            java.util.Objects.equals(this.totalOutputTokenCount, other.totalOutputTokenCount) &&
            java.util.Objects.equals(this.avgTotalToken, other.avgTotalToken) &&
            java.util.Objects.equals(this.avgInputToken, other.avgInputToken) &&
            java.util.Objects.equals(this.avgOutputToken, other.avgOutputToken) &&
            java.util.Objects.equals(this.avgSessionDuration, other.avgSessionDuration) &&
            java.util.Objects.equals(this.minSessionDuration, other.minSessionDuration) &&
            java.util.Objects.equals(this.maxSessionDuration, other.maxSessionDuration) &&
            java.util.Objects.equals(this.sessionDurationP50, other.sessionDurationP50) &&
            java.util.Objects.equals(this.sessionDurationP95, other.sessionDurationP95) &&
            java.util.Objects.equals(this.avgSessionLatency, other.avgSessionLatency) &&
            java.util.Objects.equals(this.minSessionLatency, other.minSessionLatency) &&
            java.util.Objects.equals(this.maxSessionLatency, other.maxSessionLatency) &&
            java.util.Objects.equals(this.sessionLatencyP50, other.sessionLatencyP50) &&
            java.util.Objects.equals(this.sessionLatencyP95, other.sessionLatencyP95) &&
            java.util.Objects.equals(this.totalSessionRequests, other.totalSessionRequests) &&
            java.util.Objects.equals(this.successfulSessionRequests, other.successfulSessionRequests) &&
            java.util.Objects.equals(this.failedSessionRequests, other.failedSessionRequests) &&
            java.util.Objects.equals(this.totalErrorCount, other.totalErrorCount) &&
            java.util.Objects.equals(this.userErrorCount, other.userErrorCount) &&
            java.util.Objects.equals(this.systemErrorCount, other.systemErrorCount) &&
            java.util.Objects.equals(this.range, other.range) &&
            java.util.Objects.equals(this.dataPoints, other.dataPoints);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalSessions == null ? 43 : this.totalSessions.hashCode());
        result = (result * PRIME) + (this.successfulSessions == null ? 43 : this.successfulSessions.hashCode());
        result = (result * PRIME) + (this.failedSessions == null ? 43 : this.failedSessions.hashCode());
        result = (result * PRIME) + (this.totalTokenUsage == null ? 43 : this.totalTokenUsage.hashCode());
        result = (result * PRIME) + (this.totalInputTokenCount == null ? 43 : this.totalInputTokenCount.hashCode());
        result = (result * PRIME) + (this.totalOutputTokenCount == null ? 43 : this.totalOutputTokenCount.hashCode());
        result = (result * PRIME) + (this.avgTotalToken == null ? 43 : this.avgTotalToken.hashCode());
        result = (result * PRIME) + (this.avgInputToken == null ? 43 : this.avgInputToken.hashCode());
        result = (result * PRIME) + (this.avgOutputToken == null ? 43 : this.avgOutputToken.hashCode());
        result = (result * PRIME) + (this.avgSessionDuration == null ? 43 : this.avgSessionDuration.hashCode());
        result = (result * PRIME) + (this.minSessionDuration == null ? 43 : this.minSessionDuration.hashCode());
        result = (result * PRIME) + (this.maxSessionDuration == null ? 43 : this.maxSessionDuration.hashCode());
        result = (result * PRIME) + (this.sessionDurationP50 == null ? 43 : this.sessionDurationP50.hashCode());
        result = (result * PRIME) + (this.sessionDurationP95 == null ? 43 : this.sessionDurationP95.hashCode());
        result = (result * PRIME) + (this.avgSessionLatency == null ? 43 : this.avgSessionLatency.hashCode());
        result = (result * PRIME) + (this.minSessionLatency == null ? 43 : this.minSessionLatency.hashCode());
        result = (result * PRIME) + (this.maxSessionLatency == null ? 43 : this.maxSessionLatency.hashCode());
        result = (result * PRIME) + (this.sessionLatencyP50 == null ? 43 : this.sessionLatencyP50.hashCode());
        result = (result * PRIME) + (this.sessionLatencyP95 == null ? 43 : this.sessionLatencyP95.hashCode());
        result = (result * PRIME) + (this.totalSessionRequests == null ? 43 : this.totalSessionRequests.hashCode());
        result = (result * PRIME) + (this.successfulSessionRequests == null ? 43 : this.successfulSessionRequests.hashCode());
        result = (result * PRIME) + (this.failedSessionRequests == null ? 43 : this.failedSessionRequests.hashCode());
        result = (result * PRIME) + (this.totalErrorCount == null ? 43 : this.totalErrorCount.hashCode());
        result = (result * PRIME) + (this.userErrorCount == null ? 43 : this.userErrorCount.hashCode());
        result = (result * PRIME) + (this.systemErrorCount == null ? 43 : this.systemErrorCount.hashCode());
        result = (result * PRIME) + (this.range == null ? 43 : this.range.hashCode());
        result = (result * PRIME) + (this.dataPoints == null ? 43 : this.dataPoints.hashCode());
        return result;
    }


}
