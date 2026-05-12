package com.oracle.aidataplatform.dp.model;



/**
 * Agentflow deployment details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowDeployment.Builder.class)

public final class AgentFlowDeployment  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "agentFlowKey", "agentFlowComputeKey", "endpointUrl", "description", "deploymentType", "lifecycleState", "deploymentVersion", "timeCreated", "createdBy", "timeUpdated", "updatedBy", "sessionRetentionConfig", "oAuthConfig"})
    public AgentFlowDeployment(String key, String displayName, String agentFlowKey, String agentFlowComputeKey, String endpointUrl, String description, DeploymentType deploymentType, DeploymentLifecycleState lifecycleState, String deploymentVersion, java.util.Date timeCreated, String createdBy, java.util.Date timeUpdated, String updatedBy, SessionRetentionConfiguration sessionRetentionConfig, OAuthConfiguration oAuthConfig) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.agentFlowKey = agentFlowKey;
        this.agentFlowComputeKey = agentFlowComputeKey;
        this.endpointUrl = endpointUrl;
        this.description = description;
        this.deploymentType = deploymentType;
        this.lifecycleState = lifecycleState;
        this.deploymentVersion = deploymentVersion;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.sessionRetentionConfig = sessionRetentionConfig;
        this.oAuthConfig = oAuthConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Identifier, generally uuid.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Identifier, generally uuid.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
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
     * Type of an Agent Flow Deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
private DeploymentType deploymentType;

        /**
         * Type of an Agent Flow Deployment.
         * @param deploymentType the value to set
         * @return this builder
         **/
        

public Builder deploymentType(DeploymentType deploymentType) {
    this.deploymentType = deploymentType;
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
     * version of agent flow deployed on compute.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentVersion")
private String deploymentVersion;

        /**
         * version of agent flow deployed on compute.
         * @param deploymentVersion the value to set
         * @return this builder
         **/
        

public Builder deploymentVersion(String deploymentVersion) {
    this.deploymentVersion = deploymentVersion;
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
     * The date and time the Agent flow deployment was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Agent flow deployment was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The OCID of the user/principal who re-deployed the existing Agent flow deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The OCID of the user/principal who re-deployed the existing Agent flow deployment.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sessionRetentionConfig")
private SessionRetentionConfiguration sessionRetentionConfig;



public Builder sessionRetentionConfig(SessionRetentionConfiguration sessionRetentionConfig) {
    this.sessionRetentionConfig = sessionRetentionConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("oAuthConfig")
private OAuthConfiguration oAuthConfig;



public Builder oAuthConfig(OAuthConfiguration oAuthConfig) {
    this.oAuthConfig = oAuthConfig;
    return this;
}


        public AgentFlowDeployment build() {
            AgentFlowDeployment model = new AgentFlowDeployment(this.key
                , this.displayName
                , this.agentFlowKey
                , this.agentFlowComputeKey
                , this.endpointUrl
                , this.description
                , this.deploymentType
                , this.lifecycleState
                , this.deploymentVersion
                , this.timeCreated
                , this.createdBy
                , this.timeUpdated
                , this.updatedBy
                , this.sessionRetentionConfig
                , this.oAuthConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowDeployment model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.agentFlowKey(model.getAgentFlowKey());
    this.agentFlowComputeKey(model.getAgentFlowComputeKey());
    this.endpointUrl(model.getEndpointUrl());
    this.description(model.getDescription());
    this.deploymentType(model.getDeploymentType());
    this.lifecycleState(model.getLifecycleState());
    this.deploymentVersion(model.getDeploymentVersion());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.timeUpdated(model.getTimeUpdated());
    this.updatedBy(model.getUpdatedBy());
    this.sessionRetentionConfig(model.getSessionRetentionConfig());
    this.oAuthConfig(model.getOAuthConfig());
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
     * Identifier, generally uuid.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Identifier, generally uuid.
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
     * Type of an Agent Flow Deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

        /**
     * Type of an Agent Flow Deployment.
     * @return the value
     **/
    
    public DeploymentType getDeploymentType() {
        return deploymentType;
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
     * version of agent flow deployed on compute.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentVersion")
    private final String deploymentVersion;

        /**
     * version of agent flow deployed on compute.
     * @return the value
     **/
    
    public String getDeploymentVersion() {
        return deploymentVersion;
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
     * The date and time the Agent flow deployment was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Agent flow deployment was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The OCID of the user/principal who re-deployed the existing Agent flow deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The OCID of the user/principal who re-deployed the existing Agent flow deployment.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionRetentionConfig")
    private final SessionRetentionConfiguration sessionRetentionConfig;

    
    public SessionRetentionConfiguration getSessionRetentionConfig() {
        return sessionRetentionConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("oAuthConfig")
    private final OAuthConfiguration oAuthConfig;

    
    public OAuthConfiguration getOAuthConfig() {
        return oAuthConfig;
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
        sb.append("AgentFlowDeployment(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", agentFlowComputeKey=").append(String.valueOf(this.agentFlowComputeKey));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", deploymentVersion=").append(String.valueOf(this.deploymentVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", sessionRetentionConfig=").append(String.valueOf(this.sessionRetentionConfig));
        sb.append(", oAuthConfig=").append(String.valueOf(this.oAuthConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowDeployment)) {
            return false;
        }

        AgentFlowDeployment other = (AgentFlowDeployment) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.agentFlowComputeKey, other.agentFlowComputeKey) &&
            java.util.Objects.equals(this.endpointUrl, other.endpointUrl) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.deploymentType, other.deploymentType) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.deploymentVersion, other.deploymentVersion) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.sessionRetentionConfig, other.sessionRetentionConfig) &&
            java.util.Objects.equals(this.oAuthConfig, other.oAuthConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.agentFlowComputeKey == null ? 43 : this.agentFlowComputeKey.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.deploymentVersion == null ? 43 : this.deploymentVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.sessionRetentionConfig == null ? 43 : this.sessionRetentionConfig.hashCode());
        result = (result * PRIME) + (this.oAuthConfig == null ? 43 : this.oAuthConfig.hashCode());
        return result;
    }


}
