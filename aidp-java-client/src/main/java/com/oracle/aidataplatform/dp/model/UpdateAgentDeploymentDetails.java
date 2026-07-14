// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to update the deployment of an agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentDeploymentDetails.Builder.class)

public final class UpdateAgentDeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "agentComputeKey", "agentKey", "oAuthConfig"})
    public UpdateAgentDeploymentDetails(String displayName, String description, String agentComputeKey, String agentKey, OAuthConfiguration oAuthConfig) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.agentComputeKey = agentComputeKey;
        this.agentKey = agentKey;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("oAuthConfig")
private OAuthConfiguration oAuthConfig;



public Builder oAuthConfig(OAuthConfiguration oAuthConfig) {
    this.oAuthConfig = oAuthConfig;
    return this;
}


        public UpdateAgentDeploymentDetails build() {
            UpdateAgentDeploymentDetails model = new UpdateAgentDeploymentDetails(this.displayName
                , this.description
                , this.agentComputeKey
                , this.agentKey
                , this.oAuthConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentDeploymentDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.agentComputeKey(model.getAgentComputeKey());
    this.agentKey(model.getAgentKey());
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
        sb.append("UpdateAgentDeploymentDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", agentComputeKey=").append(String.valueOf(this.agentComputeKey));
        sb.append(", agentKey=").append(String.valueOf(this.agentKey));
        sb.append(", oAuthConfig=").append(String.valueOf(this.oAuthConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentDeploymentDetails)) {
            return false;
        }

        UpdateAgentDeploymentDetails other = (UpdateAgentDeploymentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.agentComputeKey, other.agentComputeKey) &&
            java.util.Objects.equals(this.agentKey, other.agentKey) &&
            java.util.Objects.equals(this.oAuthConfig, other.oAuthConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.agentComputeKey == null ? 43 : this.agentComputeKey.hashCode());
        result = (result * PRIME) + (this.agentKey == null ? 43 : this.agentKey.hashCode());
        result = (result * PRIME) + (this.oAuthConfig == null ? 43 : this.oAuthConfig.hashCode());
        return result;
    }


}
