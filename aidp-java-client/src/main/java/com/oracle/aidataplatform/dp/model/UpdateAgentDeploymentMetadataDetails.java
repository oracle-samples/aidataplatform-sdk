// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for updating agent deployment metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentDeploymentMetadataDetails.Builder.class)

public final class UpdateAgentDeploymentMetadataDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentKey", "agentCardConfigDetail"})
    public UpdateAgentDeploymentMetadataDetails(String deploymentKey, AgentCardConfigDetail agentCardConfigDetail) {
        super();
        this.deploymentKey = deploymentKey;
        this.agentCardConfigDetail = agentCardConfigDetail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Deployment Id on Agent Service
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentKey")
private String deploymentKey;

        /**
         * Deployment Id on Agent Service
         * @param deploymentKey the value to set
         * @return this builder
         **/
        

public Builder deploymentKey(String deploymentKey) {
    this.deploymentKey = deploymentKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("agentCardConfigDetail")
private AgentCardConfigDetail agentCardConfigDetail;



public Builder agentCardConfigDetail(AgentCardConfigDetail agentCardConfigDetail) {
    this.agentCardConfigDetail = agentCardConfigDetail;
    return this;
}


        public UpdateAgentDeploymentMetadataDetails build() {
            UpdateAgentDeploymentMetadataDetails model = new UpdateAgentDeploymentMetadataDetails(this.deploymentKey
                , this.agentCardConfigDetail);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentDeploymentMetadataDetails model) {
                this.deploymentKey(model.getDeploymentKey());
    this.agentCardConfigDetail(model.getAgentCardConfigDetail());
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
     * Deployment Id on Agent Service
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentKey")
    private final String deploymentKey;

        /**
     * Deployment Id on Agent Service
     * @return the value
     **/
    
    public String getDeploymentKey() {
        return deploymentKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardConfigDetail")
    private final AgentCardConfigDetail agentCardConfigDetail;

    
    public AgentCardConfigDetail getAgentCardConfigDetail() {
        return agentCardConfigDetail;
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
        sb.append("UpdateAgentDeploymentMetadataDetails(");
        sb.append("deploymentKey=").append(String.valueOf(this.deploymentKey));
        sb.append(", agentCardConfigDetail=").append(String.valueOf(this.agentCardConfigDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentDeploymentMetadataDetails)) {
            return false;
        }

        UpdateAgentDeploymentMetadataDetails other = (UpdateAgentDeploymentMetadataDetails) o;
        return java.util.Objects.equals(this.deploymentKey, other.deploymentKey) &&
            java.util.Objects.equals(this.agentCardConfigDetail, other.agentCardConfigDetail);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentKey == null ? 43 : this.deploymentKey.hashCode());
        result = (result * PRIME) + (this.agentCardConfigDetail == null ? 43 : this.agentCardConfigDetail.hashCode());
        return result;
    }


}
