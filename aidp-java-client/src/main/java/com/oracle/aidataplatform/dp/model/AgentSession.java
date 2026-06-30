// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Agent session.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentSession.Builder.class)

public final class AgentSession  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "key", "agentKey", "endpointUrl", "lifecycleState", "agentComputeKey", "timeCreated", "updatedBy", "createdBy", "timeUpdated", "timeStarted", "timeEnded", "context"})
    public AgentSession(String displayName, String key, String agentKey, String endpointUrl, DeploymentLifecycleState lifecycleState, String agentComputeKey, java.util.Date timeCreated, String updatedBy, String createdBy, java.util.Date timeUpdated, java.util.Date timeStarted, java.util.Date timeEnded, AgentSessionContext context) {
        super();
        this.displayName = displayName;
        this.key = key;
        this.agentKey = agentKey;
        this.endpointUrl = endpointUrl;
        this.lifecycleState = lifecycleState;
        this.agentComputeKey = agentComputeKey;
        this.timeCreated = timeCreated;
        this.updatedBy = updatedBy;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.context = context;
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
     * Agent Session identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Agent Session identifier.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * The Agent key for which the session is started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentKey")
private String agentKey;

        /**
         * The Agent key for which the session is started.
         * @param agentKey the value to set
         * @return this builder
         **/
        

public Builder agentKey(String agentKey) {
    this.agentKey = agentKey;
    return this;
}
            /**
     * The endpointUrl where the client should connect to communicate with the agent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
private String endpointUrl;

        /**
         * The endpointUrl where the client should connect to communicate with the agent.
         * @param endpointUrl the value to set
         * @return this builder
         **/
        

public Builder endpointUrl(String endpointUrl) {
    this.endpointUrl = endpointUrl;
    return this;
}
            /**
     * LifecycleState of an Agent Session or Deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private DeploymentLifecycleState lifecycleState;

        /**
         * LifecycleState of an Agent Session or Deployment.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(DeploymentLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * The Agent Compute Key where client can run or test the agent.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentComputeKey")
private String agentComputeKey;

        /**
         * The Agent Compute Key where client can run or test the agent.
         * @param agentComputeKey the value to set
         * @return this builder
         **/
        

public Builder agentComputeKey(String agentComputeKey) {
    this.agentComputeKey = agentComputeKey;
    return this;
}
            /**
     * The date and time the Agent session was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Agent session was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * OCID of the user who updated this record
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * OCID of the user who updated this record
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * The OCID of the user/principal who created the agent session.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The OCID of the user/principal who created the agent session.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The date and time the Agent session was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Agent session was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The date and time the session was started.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
private java.util.Date timeStarted;

        /**
         * The date and time the session was started.
         * @param timeStarted the value to set
         * @return this builder
         **/
        

public Builder timeStarted(java.util.Date timeStarted) {
    this.timeStarted = timeStarted;
    return this;
}
            /**
     * The date and time the session was ended.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
private java.util.Date timeEnded;

        /**
         * The date and time the session was ended.
         * @param timeEnded the value to set
         * @return this builder
         **/
        

public Builder timeEnded(java.util.Date timeEnded) {
    this.timeEnded = timeEnded;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("context")
private AgentSessionContext context;



public Builder context(AgentSessionContext context) {
    this.context = context;
    return this;
}


        public AgentSession build() {
            AgentSession model = new AgentSession(this.displayName
                , this.key
                , this.agentKey
                , this.endpointUrl
                , this.lifecycleState
                , this.agentComputeKey
                , this.timeCreated
                , this.updatedBy
                , this.createdBy
                , this.timeUpdated
                , this.timeStarted
                , this.timeEnded
                , this.context);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentSession model) {
                this.displayName(model.getDisplayName());
    this.key(model.getKey());
    this.agentKey(model.getAgentKey());
    this.endpointUrl(model.getEndpointUrl());
    this.lifecycleState(model.getLifecycleState());
    this.agentComputeKey(model.getAgentComputeKey());
    this.timeCreated(model.getTimeCreated());
    this.updatedBy(model.getUpdatedBy());
    this.createdBy(model.getCreatedBy());
    this.timeUpdated(model.getTimeUpdated());
    this.timeStarted(model.getTimeStarted());
    this.timeEnded(model.getTimeEnded());
    this.context(model.getContext());
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
     * Agent Session identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Agent Session identifier.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The Agent key for which the session is started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentKey")
    private final String agentKey;

        /**
     * The Agent key for which the session is started.
     * @return the value
     **/
    
    public String getAgentKey() {
        return agentKey;
    }


        /**
     * The endpointUrl where the client should connect to communicate with the agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
    private final String endpointUrl;

        /**
     * The endpointUrl where the client should connect to communicate with the agent.
     * @return the value
     **/
    
    public String getEndpointUrl() {
        return endpointUrl;
    }

    
        /**
     * LifecycleState of an Agent Session or Deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DeploymentLifecycleState lifecycleState;

        /**
     * LifecycleState of an Agent Session or Deployment.
     * @return the value
     **/
    
    public DeploymentLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * The Agent Compute Key where client can run or test the agent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentComputeKey")
    private final String agentComputeKey;

        /**
     * The Agent Compute Key where client can run or test the agent.
     * @return the value
     **/
    
    public String getAgentComputeKey() {
        return agentComputeKey;
    }


        /**
     * The date and time the Agent session was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Agent session was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * OCID of the user who updated this record
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * OCID of the user who updated this record
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * The OCID of the user/principal who created the agent session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the user/principal who created the agent session.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The date and time the Agent session was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Agent session was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The date and time the session was started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

        /**
     * The date and time the session was started.
     * @return the value
     **/
    
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }


        /**
     * The date and time the session was ended.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

        /**
     * The date and time the session was ended.
     * @return the value
     **/
    
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final AgentSessionContext context;

    
    public AgentSessionContext getContext() {
        return context;
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
        sb.append("AgentSession(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", agentComputeKey=").append(String.valueOf(this.agentComputeKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentSession)) {
            return false;
        }

        AgentSession other = (AgentSession) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.endpointUrl, other.endpointUrl) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.agentComputeKey, other.agentComputeKey) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.timeStarted, other.timeStarted) &&
            java.util.Objects.equals(this.timeEnded, other.timeEnded) &&
            java.util.Objects.equals(this.context, other.context);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.agentComputeKey == null ? 43 : this.agentComputeKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        return result;
    }


}
