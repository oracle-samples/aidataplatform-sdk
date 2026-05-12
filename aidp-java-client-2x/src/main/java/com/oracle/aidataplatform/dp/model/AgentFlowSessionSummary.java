package com.oracle.aidataplatform.dp.model;


/**
 * Agent flow session summary.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowSessionSummary.Builder.class)

public final class AgentFlowSessionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "key", "agentFlowKey", "lifecycleState", "agentFlowComputeKey", "endpointUrl", "timeCreated", "createdBy", "timeStarted", "timeEnded", "duration", "tokens"})
    public AgentFlowSessionSummary(String displayName, String key, String agentFlowKey, DeploymentLifecycleState lifecycleState, String agentFlowComputeKey, String endpointUrl, java.util.Date timeCreated, String createdBy, java.util.Date timeStarted, java.util.Date timeEnded, Float duration, Long tokens) {
        super();
        this.displayName = displayName;
        this.key = key;
        this.agentFlowKey = agentFlowKey;
        this.lifecycleState = lifecycleState;
        this.agentFlowComputeKey = agentFlowComputeKey;
        this.endpointUrl = endpointUrl;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.duration = duration;
        this.tokens = tokens;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Display name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Agent Flow Session identifier.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * Agent Flow Session identifier.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * The Agent Flow key for which the session is started.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
        private String agentFlowKey;

                /**
         * The Agent Flow key for which the session is started.
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

        public Builder agentFlowKey(String agentFlowKey) {
        this.agentFlowKey = agentFlowKey;
        return this;
        }
            /**
     * LifecycleState of an Agent Flow Session or Deployment.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DeploymentLifecycleState lifecycleState;

                /**
         * LifecycleState of an Agent Flow Session or Deployment.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(DeploymentLifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }
            /**
     * The Agent Flow Compute Key where client can run or test the Agent Flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowComputeKey")
        private String agentFlowComputeKey;

                /**
         * The Agent Flow Compute Key where client can run or test the Agent Flow.
         * @param agentFlowComputeKey the value to set
         * @return this builder
         **/
        

        public Builder agentFlowComputeKey(String agentFlowComputeKey) {
        this.agentFlowComputeKey = agentFlowComputeKey;
        return this;
        }
            /**
     * The endpointUrl where the client should connect to communicate with the Agent.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
        private String endpointUrl;

                /**
         * The endpointUrl where the client should connect to communicate with the Agent.
         * @param endpointUrl the value to set
         * @return this builder
         **/
        

        public Builder endpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
        }
            /**
     * The date and time the Agent flow session was created.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time the Agent flow session was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The OCID of the user/principal who created the Agent flow session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * The OCID of the user/principal who created the Agent flow session.
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * The date and time the session was started
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

                /**
         * The date and time the session was started
         * @param timeStarted the value to set
         * @return this builder
         **/
        

        public Builder timeStarted(java.util.Date timeStarted) {
        this.timeStarted = timeStarted;
        return this;
        }
            /**
     * The date and time the session was ended
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

                /**
         * The date and time the session was ended
         * @param timeEnded the value to set
         * @return this builder
         **/
        

        public Builder timeEnded(java.util.Date timeEnded) {
        this.timeEnded = timeEnded;
        return this;
        }
            /**
     * Agent flow session duration
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Float duration;

                /**
         * Agent flow session duration
         * @param duration the value to set
         * @return this builder
         **/
        

        public Builder duration(Float duration) {
        this.duration = duration;
        return this;
        }
            /**
     * Agent flow session token usage
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tokens")
        private Long tokens;

                /**
         * Agent flow session token usage
         * @param tokens the value to set
         * @return this builder
         **/
        

        public Builder tokens(Long tokens) {
        this.tokens = tokens;
        return this;
        }


        public AgentFlowSessionSummary build() {
            AgentFlowSessionSummary model = new AgentFlowSessionSummary(this.displayName
                    , this.key
                    , this.agentFlowKey
                    , this.lifecycleState
                    , this.agentFlowComputeKey
                    , this.endpointUrl
                    , this.timeCreated
                    , this.createdBy
                    , this.timeStarted
                    , this.timeEnded
                    , this.duration
                    , this.tokens);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowSessionSummary model) {
                this.displayName(model.getDisplayName());
    this.key(model.getKey());
    this.agentFlowKey(model.getAgentFlowKey());
    this.lifecycleState(model.getLifecycleState());
    this.agentFlowComputeKey(model.getAgentFlowComputeKey());
    this.endpointUrl(model.getEndpointUrl());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.timeStarted(model.getTimeStarted());
    this.timeEnded(model.getTimeEnded());
    this.duration(model.getDuration());
    this.tokens(model.getTokens());
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
     * Display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Agent Flow Session identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Agent Flow Session identifier.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The Agent Flow key for which the session is started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * The Agent Flow key for which the session is started.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }

    
        /**
     * LifecycleState of an Agent Flow Session or Deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DeploymentLifecycleState lifecycleState;

        /**
     * LifecycleState of an Agent Flow Session or Deployment.
     * @return the value
     **/
    
    public DeploymentLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * The Agent Flow Compute Key where client can run or test the Agent Flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowComputeKey")
    private final String agentFlowComputeKey;

        /**
     * The Agent Flow Compute Key where client can run or test the Agent Flow.
     * @return the value
     **/
    
    public String getAgentFlowComputeKey() {
        return agentFlowComputeKey;
    }


        /**
     * The endpointUrl where the client should connect to communicate with the Agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
    private final String endpointUrl;

        /**
     * The endpointUrl where the client should connect to communicate with the Agent.
     * @return the value
     **/
    
    public String getEndpointUrl() {
        return endpointUrl;
    }


        /**
     * The date and time the Agent flow session was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Agent flow session was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The OCID of the user/principal who created the Agent flow session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the user/principal who created the Agent flow session.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The date and time the session was started
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * The date and time the session was started
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * The date and time the session was ended
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

        /**
     * The date and time the session was ended
     * @return the value
     **/
    
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }


        /**
     * Agent flow session duration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Float duration;

        /**
     * Agent flow session duration
     * @return the value
     **/
    
    public Float getDuration() {
        return duration;
    }


        /**
     * Agent flow session token usage
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tokens")
    private final Long tokens;

        /**
     * Agent flow session token usage
     * @return the value
     **/
    
    public Long getTokens() {
        return tokens;
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
        sb.append("AgentFlowSessionSummary(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", agentFlowComputeKey=").append(String.valueOf(this.agentFlowComputeKey));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", tokens=").append(String.valueOf(this.tokens));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowSessionSummary)) {
            return false;
        }

        AgentFlowSessionSummary other = (AgentFlowSessionSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.agentFlowComputeKey, other.agentFlowComputeKey) &&
            java.util.Objects.equals(this.endpointUrl, other.endpointUrl) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeEnded, other.timeEnded) &&
            java.util.Objects.equals(this.duration, other.duration) &&
            java.util.Objects.equals(this.tokens, other.tokens);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.agentFlowComputeKey == null ? 43 : this.agentFlowComputeKey.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + (this.tokens == null ? 43 : this.tokens.hashCode());
        return result;
    }


}
