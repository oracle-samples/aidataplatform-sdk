// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to update a Agent flow.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentFlowDetails.Builder.class)

public final class UpdateAgentFlowDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "computeKey", "diagram", "entryFilePath", "dependenciesFilePath", "deletedNodes", "updatedNodes", "addedNodes", "guardrails", "sessionConfig", "agentCardConfig"})
    public UpdateAgentFlowDetails(String displayName, String description, String computeKey, AgentFlowDiagram diagram, String entryFilePath, String dependenciesFilePath, java.util.List<String> deletedNodes, java.util.List<String> updatedNodes, java.util.List<String> addedNodes, GuardrailsConfiguration guardrails, SessionConfiguration sessionConfig, AgentCardConfigDetail agentCardConfig) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.computeKey = computeKey;
        this.diagram = diagram;
        this.entryFilePath = entryFilePath;
        this.dependenciesFilePath = dependenciesFilePath;
        this.deletedNodes = deletedNodes;
        this.updatedNodes = updatedNodes;
        this.addedNodes = addedNodes;
        this.guardrails = guardrails;
        this.sessionConfig = sessionConfig;
        this.agentCardConfig = agentCardConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * AgentFlow name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * AgentFlow name.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * AgentFlow description.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * AgentFlow description.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
        private String computeKey;

                /**
         * The key of the Agent Flow Compute associated with this Agent Flow
         * @param computeKey the value to set
         * @return this builder
         **/
        

        public Builder computeKey(String computeKey) {
        this.computeKey = computeKey;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("diagram")
        private AgentFlowDiagram diagram;

        

        public Builder diagram(AgentFlowDiagram diagram) {
        this.diagram = diagram;
        return this;
        }
            /**
     * The path to project entry file
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
        private String entryFilePath;

                /**
         * The path to project entry file
         * @param entryFilePath the value to set
         * @return this builder
         **/
        

        public Builder entryFilePath(String entryFilePath) {
        this.entryFilePath = entryFilePath;
        return this;
        }
            /**
     * The path to dependencies file
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
        private String dependenciesFilePath;

                /**
         * The path to dependencies file
         * @param dependenciesFilePath the value to set
         * @return this builder
         **/
        

        public Builder dependenciesFilePath(String dependenciesFilePath) {
        this.dependenciesFilePath = dependenciesFilePath;
        return this;
        }
            /**
     * List of node keys that were removed from the flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("deletedNodes")
        private java.util.List<String> deletedNodes;

                /**
         * List of node keys that were removed from the flow.
         * @param deletedNodes the value to set
         * @return this builder
         **/
        

        public Builder deletedNodes(java.util.List<String> deletedNodes) {
        this.deletedNodes = deletedNodes;
        return this;
        }
            /**
     * List of node keys that were updated in the flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedNodes")
        private java.util.List<String> updatedNodes;

                /**
         * List of node keys that were updated in the flow.
         * @param updatedNodes the value to set
         * @return this builder
         **/
        

        public Builder updatedNodes(java.util.List<String> updatedNodes) {
        this.updatedNodes = updatedNodes;
        return this;
        }
            /**
     * List of node keys that were newly added to the flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("addedNodes")
        private java.util.List<String> addedNodes;

                /**
         * List of node keys that were newly added to the flow.
         * @param addedNodes the value to set
         * @return this builder
         **/
        

        public Builder addedNodes(java.util.List<String> addedNodes) {
        this.addedNodes = addedNodes;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("guardrails")
        private GuardrailsConfiguration guardrails;

        

        public Builder guardrails(GuardrailsConfiguration guardrails) {
        this.guardrails = guardrails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
        private SessionConfiguration sessionConfig;

        

        public Builder sessionConfig(SessionConfiguration sessionConfig) {
        this.sessionConfig = sessionConfig;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("agentCardConfig")
        private AgentCardConfigDetail agentCardConfig;

        

        public Builder agentCardConfig(AgentCardConfigDetail agentCardConfig) {
        this.agentCardConfig = agentCardConfig;
        return this;
        }


        public UpdateAgentFlowDetails build() {
            UpdateAgentFlowDetails model = new UpdateAgentFlowDetails(this.displayName
                    , this.description
                    , this.computeKey
                    , this.diagram
                    , this.entryFilePath
                    , this.dependenciesFilePath
                    , this.deletedNodes
                    , this.updatedNodes
                    , this.addedNodes
                    , this.guardrails
                    , this.sessionConfig
                    , this.agentCardConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentFlowDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.computeKey(model.getComputeKey());
    this.diagram(model.getDiagram());
    this.entryFilePath(model.getEntryFilePath());
    this.dependenciesFilePath(model.getDependenciesFilePath());
    this.deletedNodes(model.getDeletedNodes());
    this.updatedNodes(model.getUpdatedNodes());
    this.addedNodes(model.getAddedNodes());
    this.guardrails(model.getGuardrails());
    this.sessionConfig(model.getSessionConfig());
    this.agentCardConfig(model.getAgentCardConfig());
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
     * AgentFlow name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * AgentFlow name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * AgentFlow description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * AgentFlow description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * The key of the Agent Flow Compute associated with this Agent Flow
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("diagram")
    private final AgentFlowDiagram diagram;

    
    public AgentFlowDiagram getDiagram() {
        return diagram;
    }


        /**
     * The path to project entry file
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entryFilePath")
    private final String entryFilePath;

        /**
     * The path to project entry file
     * @return the value
     **/
    
    public String getEntryFilePath() {
        return entryFilePath;
    }


        /**
     * The path to dependencies file
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependenciesFilePath")
    private final String dependenciesFilePath;

        /**
     * The path to dependencies file
     * @return the value
     **/
    
    public String getDependenciesFilePath() {
        return dependenciesFilePath;
    }


        /**
     * List of node keys that were removed from the flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deletedNodes")
    private final java.util.List<String> deletedNodes;

        /**
     * List of node keys that were removed from the flow.
     * @return the value
     **/
    
    public java.util.List<String> getDeletedNodes() {
        return deletedNodes;
    }


        /**
     * List of node keys that were updated in the flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedNodes")
    private final java.util.List<String> updatedNodes;

        /**
     * List of node keys that were updated in the flow.
     * @return the value
     **/
    
    public java.util.List<String> getUpdatedNodes() {
        return updatedNodes;
    }


        /**
     * List of node keys that were newly added to the flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("addedNodes")
    private final java.util.List<String> addedNodes;

        /**
     * List of node keys that were newly added to the flow.
     * @return the value
     **/
    
    public java.util.List<String> getAddedNodes() {
        return addedNodes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("guardrails")
    private final GuardrailsConfiguration guardrails;

    
    public GuardrailsConfiguration getGuardrails() {
        return guardrails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionConfig")
    private final SessionConfiguration sessionConfig;

    
    public SessionConfiguration getSessionConfig() {
        return sessionConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("agentCardConfig")
    private final AgentCardConfigDetail agentCardConfig;

    
    public AgentCardConfigDetail getAgentCardConfig() {
        return agentCardConfig;
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
        sb.append("UpdateAgentFlowDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", diagram=").append(String.valueOf(this.diagram));
        sb.append(", entryFilePath=").append(String.valueOf(this.entryFilePath));
        sb.append(", dependenciesFilePath=").append(String.valueOf(this.dependenciesFilePath));
        sb.append(", deletedNodes=").append(String.valueOf(this.deletedNodes));
        sb.append(", updatedNodes=").append(String.valueOf(this.updatedNodes));
        sb.append(", addedNodes=").append(String.valueOf(this.addedNodes));
        sb.append(", guardrails=").append(String.valueOf(this.guardrails));
        sb.append(", sessionConfig=").append(String.valueOf(this.sessionConfig));
        sb.append(", agentCardConfig=").append(String.valueOf(this.agentCardConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentFlowDetails)) {
            return false;
        }

        UpdateAgentFlowDetails other = (UpdateAgentFlowDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.diagram, other.diagram) &&
            java.util.Objects.equals(this.entryFilePath, other.entryFilePath) &&
            java.util.Objects.equals(this.dependenciesFilePath, other.dependenciesFilePath) &&
            java.util.Objects.equals(this.deletedNodes, other.deletedNodes) &&
            java.util.Objects.equals(this.updatedNodes, other.updatedNodes) &&
            java.util.Objects.equals(this.addedNodes, other.addedNodes) &&
            java.util.Objects.equals(this.guardrails, other.guardrails) &&
            java.util.Objects.equals(this.sessionConfig, other.sessionConfig) &&
            java.util.Objects.equals(this.agentCardConfig, other.agentCardConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.diagram == null ? 43 : this.diagram.hashCode());
        result = (result * PRIME) + (this.entryFilePath == null ? 43 : this.entryFilePath.hashCode());
        result = (result * PRIME) + (this.dependenciesFilePath == null ? 43 : this.dependenciesFilePath.hashCode());
        result = (result * PRIME) + (this.deletedNodes == null ? 43 : this.deletedNodes.hashCode());
        result = (result * PRIME) + (this.updatedNodes == null ? 43 : this.updatedNodes.hashCode());
        result = (result * PRIME) + (this.addedNodes == null ? 43 : this.addedNodes.hashCode());
        result = (result * PRIME) + (this.guardrails == null ? 43 : this.guardrails.hashCode());
        result = (result * PRIME) + (this.sessionConfig == null ? 43 : this.sessionConfig.hashCode());
        result = (result * PRIME) + (this.agentCardConfig == null ? 43 : this.agentCardConfig.hashCode());
        return result;
    }


}
