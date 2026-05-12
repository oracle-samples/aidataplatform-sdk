package com.oracle.aidataplatform.dp.model;


/**
 * Details required to update the deployment of an Agent Flow.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentFlowDeploymentDetails.Builder.class)

public final class UpdateAgentFlowDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "agentFlowComputeKey", "agentFlowKey", "deploymentType", "oAuthConfig"})
    public UpdateAgentFlowDeploymentDetails(String displayName, String description, String agentFlowComputeKey, String agentFlowKey, DeploymentType deploymentType, OAuthConfiguration oAuthConfig) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.agentFlowComputeKey = agentFlowComputeKey;
        this.agentFlowKey = agentFlowKey;
        this.deploymentType = deploymentType;
        this.oAuthConfig = oAuthConfig;
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("oAuthConfig")
        private OAuthConfiguration oAuthConfig;

        

        public Builder oAuthConfig(OAuthConfiguration oAuthConfig) {
        this.oAuthConfig = oAuthConfig;
        return this;
        }


        public UpdateAgentFlowDeploymentDetails build() {
            UpdateAgentFlowDeploymentDetails model = new UpdateAgentFlowDeploymentDetails(this.displayName
                    , this.description
                    , this.agentFlowComputeKey
                    , this.agentFlowKey
                    , this.deploymentType
                    , this.oAuthConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentFlowDeploymentDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.agentFlowComputeKey(model.getAgentFlowComputeKey());
    this.agentFlowKey(model.getAgentFlowKey());
    this.deploymentType(model.getDeploymentType());
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
        sb.append("UpdateAgentFlowDeploymentDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", agentFlowComputeKey=").append(String.valueOf(this.agentFlowComputeKey));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", oAuthConfig=").append(String.valueOf(this.oAuthConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentFlowDeploymentDetails)) {
            return false;
        }

        UpdateAgentFlowDeploymentDetails other = (UpdateAgentFlowDeploymentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.agentFlowComputeKey, other.agentFlowComputeKey) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.deploymentType, other.deploymentType) &&
            java.util.Objects.equals(this.oAuthConfig, other.oAuthConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.agentFlowComputeKey == null ? 43 : this.agentFlowComputeKey.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.oAuthConfig == null ? 43 : this.oAuthConfig.hashCode());
        return result;
    }


}
