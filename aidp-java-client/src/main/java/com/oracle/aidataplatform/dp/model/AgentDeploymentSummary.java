// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Agent deployment summary.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentDeploymentSummary.Builder.class)

public final class AgentDeploymentSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "key", "lifecycleState", "deploymentType", "agentComputeKey", "agentKey", "endpointUrl", "deploymentVersion", "timeCreated", "createdBy", "agentCardUrl"})
    public AgentDeploymentSummary(String displayName, String description, String key, DeploymentLifecycleState lifecycleState, DeploymentType deploymentType, String agentComputeKey, String agentKey, String endpointUrl, String deploymentVersion, java.util.Date timeCreated, String createdBy, String agentCardUrl) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.key = key;
        this.lifecycleState = lifecycleState;
        this.deploymentType = deploymentType;
        this.agentComputeKey = agentComputeKey;
        this.agentKey = agentKey;
        this.endpointUrl = endpointUrl;
        this.deploymentVersion = deploymentVersion;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.agentCardUrl = agentCardUrl;
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
     * deployment description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * deployment description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Identifier, generally UUID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Identifier, generally UUID.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
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
     * Type of an agent deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
private DeploymentType deploymentType;

        /**
         * Type of an agent deployment.
         * @param deploymentType the value to set
         * @return this builder
         **/
        

public Builder deploymentType(DeploymentType deploymentType) {
    this.deploymentType = deploymentType;
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
     * Version of agent deployed on compute.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentVersion")
private String deploymentVersion;

        /**
         * Version of agent deployed on compute.
         * @param deploymentVersion the value to set
         * @return this builder
         **/
        

public Builder deploymentVersion(String deploymentVersion) {
    this.deploymentVersion = deploymentVersion;
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
     * AgentCard base URL.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentCardUrl")
private String agentCardUrl;

        /**
         * AgentCard base URL.
         * @param agentCardUrl the value to set
         * @return this builder
         **/
        

public Builder agentCardUrl(String agentCardUrl) {
    this.agentCardUrl = agentCardUrl;
    return this;
}


        public AgentDeploymentSummary build() {
            AgentDeploymentSummary model = new AgentDeploymentSummary(this.displayName
                , this.description
                , this.key
                , this.lifecycleState
                , this.deploymentType
                , this.agentComputeKey
                , this.agentKey
                , this.endpointUrl
                , this.deploymentVersion
                , this.timeCreated
                , this.createdBy
                , this.agentCardUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentDeploymentSummary model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.key(model.getKey());
    this.lifecycleState(model.getLifecycleState());
    this.deploymentType(model.getDeploymentType());
    this.agentComputeKey(model.getAgentComputeKey());
    this.agentKey(model.getAgentKey());
    this.endpointUrl(model.getEndpointUrl());
    this.deploymentVersion(model.getDeploymentVersion());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.agentCardUrl(model.getAgentCardUrl());
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
     * deployment description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * deployment description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Identifier, generally UUID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Identifier, generally UUID.
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
     * Type of an agent deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

        /**
     * Type of an agent deployment.
     * @return the value
     **/
    
    public DeploymentType getDeploymentType() {
        return deploymentType;
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
     * Version of agent deployed on compute.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentVersion")
    private final String deploymentVersion;

        /**
     * Version of agent deployed on compute.
     * @return the value
     **/
    
    public String getDeploymentVersion() {
        return deploymentVersion;
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
     * AgentCard base URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardUrl")
    private final String agentCardUrl;

        /**
     * AgentCard base URL.
     * @return the value
     **/
    
    public String getAgentCardUrl() {
        return agentCardUrl;
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
        sb.append("AgentDeploymentSummary(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", agentComputeKey=").append(String.valueOf(this.agentComputeKey));
        sb.append(", agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", deploymentVersion=").append(String.valueOf(this.deploymentVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", agentCardUrl=").append(String.valueOf(this.agentCardUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentDeploymentSummary)) {
            return false;
        }

        AgentDeploymentSummary other = (AgentDeploymentSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.deploymentType, other.deploymentType) &&
            java.util.Objects.equals(this.agentComputeKey, other.agentComputeKey) &&
            java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.endpointUrl, other.endpointUrl) &&
            java.util.Objects.equals(this.deploymentVersion, other.deploymentVersion) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.agentCardUrl, other.agentCardUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.agentComputeKey == null ? 43 : this.agentComputeKey.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result = (result * PRIME) + (this.deploymentVersion == null ? 43 : this.deploymentVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.agentCardUrl == null ? 43 : this.agentCardUrl.hashCode());
        return result;
    }


}
