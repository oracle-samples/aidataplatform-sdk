// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A Supervisor Agent Node in an Agent Flow
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SupervisorAgentNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class SupervisorAgentNode extends AgentFlowNode {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private String nodeType;

            public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

            public Builder name(String name) {
            this.name = name;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

            public Builder description(String description) {
            this.description = description;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("positionX")
        private Float positionX;

            public Builder positionX(Float positionX) {
            this.positionX = positionX;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("positionY")
        private Float positionY;

            public Builder positionY(Float positionY) {
            this.positionY = positionY;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("isExpanded")
        private Boolean isExpanded;

            public Builder isExpanded(Boolean isExpanded) {
            this.isExpanded = isExpanded;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("parentNodeId")
        private String parentNodeId;

            public Builder parentNodeId(String parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, Object> configuration;

            public Builder configuration(java.util.Map<String, Object> configuration) {
            this.configuration = configuration;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("nodeTypeId")
        private String nodeTypeId;

            public Builder nodeTypeId(String nodeTypeId) {
            this.nodeTypeId = nodeTypeId;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

            public Builder key(String key) {
            this.key = key;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

            public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

            public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.List<NodeInput> inputs;

            public Builder inputs(java.util.List<NodeInput> inputs) {
            this.inputs = inputs;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.List<NodeOutput> outputs;

            public Builder outputs(java.util.List<NodeOutput> outputs) {
            this.outputs = outputs;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
        private java.util.List<ValidationError> validationErrors;

            public Builder validationErrors(java.util.List<ValidationError> validationErrors) {
            this.validationErrors = validationErrors;
            return this;
            }
            /**
     * System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("instructions")
        private String instructions;

                /**
         * System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.
         * @param instructions the value to set
         * @return this builder
         **/
        

        public Builder instructions(String instructions) {
        this.instructions = instructions;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("llm")
        private LlmConfig llm;

        

        public Builder llm(LlmConfig llm) {
        this.llm = llm;
        return this;
        }
            /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
        private java.util.Map<String, Object> modelSettings;

                /**
         * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
         * @param modelSettings the value to set
         * @return this builder
         **/
        

        public Builder modelSettings(java.util.Map<String, Object> modelSettings) {
        this.modelSettings = modelSettings;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("memory")
        private MemoryConfiguration memory;

        

        public Builder memory(MemoryConfiguration memory) {
        this.memory = memory;
        return this;
        }
            /**
     * List of tools that are accessible to the agent. Provide the unique tool key.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("tools")
        private java.util.List<Tool> tools;

                /**
         * List of tools that are accessible to the agent. Provide the unique tool key.
         * @param tools the value to set
         * @return this builder
         **/
        

        public Builder tools(java.util.List<Tool> tools) {
        this.tools = tools;
        return this;
        }
            /**
     * A list of tool reference keys, the full tool definition can be found in the toolsMap.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolReferences")
        private java.util.List<String> toolReferences;

                /**
         * A list of tool reference keys, the full tool definition can be found in the toolsMap.
         * @param toolReferences the value to set
         * @return this builder
         **/
        

        public Builder toolReferences(java.util.List<String> toolReferences) {
        this.toolReferences = toolReferences;
        return this;
        }
            /**
     * Extra configuration for the supervisor node.  Captured as a generic dictionary.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("supervisorConfig")
        private java.util.Map<String, String> supervisorConfig;

                /**
         * Extra configuration for the supervisor node.  Captured as a generic dictionary.
         * @param supervisorConfig the value to set
         * @return this builder
         **/
        

        public Builder supervisorConfig(java.util.Map<String, String> supervisorConfig) {
        this.supervisorConfig = supervisorConfig;
        return this;
        }


        public SupervisorAgentNode build() {
            SupervisorAgentNode model = new SupervisorAgentNode(this.nodeType
                    , this.name
                    , this.description
                    , this.positionX
                    , this.positionY
                    , this.isExpanded
                    , this.parentNodeId
                    , this.configuration
                    , this.nodeTypeId
                    , this.key
                    , this.timeCreated
                    , this.timeUpdated
                    , this.inputs
                    , this.outputs
                    , this.validationErrors
                    , this.instructions
                    , this.llm
                    , this.modelSettings
                    , this.memory
                    , this.tools
                    , this.toolReferences
                    , this.supervisorConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupervisorAgentNode model) {
                this.nodeType(model.getNodeType());
    this.name(model.getName());
    this.description(model.getDescription());
    this.positionX(model.getPositionX());
    this.positionY(model.getPositionY());
    this.isExpanded(model.getIsExpanded());
    this.parentNodeId(model.getParentNodeId());
    this.configuration(model.getConfiguration());
    this.nodeTypeId(model.getNodeTypeId());
    this.key(model.getKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.inputs(model.getInputs());
    this.outputs(model.getOutputs());
    this.validationErrors(model.getValidationErrors());
    this.instructions(model.getInstructions());
    this.llm(model.getLlm());
    this.modelSettings(model.getModelSettings());
    this.memory(model.getMemory());
    this.tools(model.getTools());
    this.toolReferences(model.getToolReferences());
    this.supervisorConfig(model.getSupervisorConfig());
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

    
    @Deprecated
    public SupervisorAgentNode(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, java.util.Map<String, Object> configuration, String nodeTypeId, String key, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<NodeInput> inputs, java.util.List<NodeOutput> outputs, java.util.List<ValidationError> validationErrors, String instructions, LlmConfig llm, java.util.Map<String, Object> modelSettings, MemoryConfiguration memory, java.util.List<Tool> tools, java.util.List<String> toolReferences, java.util.Map<String, String> supervisorConfig) {
        super(nodeType, name, description, positionX, positionY, isExpanded, parentNodeId, configuration, nodeTypeId, key, timeCreated, timeUpdated, inputs, outputs, validationErrors);
        this.instructions = instructions;
        this.llm = llm;
        this.modelSettings = modelSettings;
        this.memory = memory;
        this.tools = tools;
        this.toolReferences = toolReferences;
        this.supervisorConfig = supervisorConfig;
    }


        /**
     * System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("instructions")
    private final String instructions;

        /**
     * System prompt written by the flow developer defining the agent\u2019s goal(s) and what tools the agent has access to.
     * @return the value
     **/
    
    public String getInstructions() {
        return instructions;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("llm")
    private final LlmConfig llm;

    
    public LlmConfig getLlm() {
        return llm;
    }


        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
    private final java.util.Map<String, Object> modelSettings;

        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getModelSettings() {
        return modelSettings;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    private final MemoryConfiguration memory;

    
    public MemoryConfiguration getMemory() {
        return memory;
    }


        /**
     * List of tools that are accessible to the agent. Provide the unique tool key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tools")
    private final java.util.List<Tool> tools;

        /**
     * List of tools that are accessible to the agent. Provide the unique tool key.
     * @return the value
     **/
    
    public java.util.List<Tool> getTools() {
        return tools;
    }


        /**
     * A list of tool reference keys, the full tool definition can be found in the toolsMap.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolReferences")
    private final java.util.List<String> toolReferences;

        /**
     * A list of tool reference keys, the full tool definition can be found in the toolsMap.
     * @return the value
     **/
    
    public java.util.List<String> getToolReferences() {
        return toolReferences;
    }


        /**
     * Extra configuration for the supervisor node.  Captured as a generic dictionary.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("supervisorConfig")
    private final java.util.Map<String, String> supervisorConfig;

        /**
     * Extra configuration for the supervisor node.  Captured as a generic dictionary.
     * @return the value
     **/
    
    public java.util.Map<String, String> getSupervisorConfig() {
        return supervisorConfig;
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
        sb.append("SupervisorAgentNode(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instructions=").append(String.valueOf(this.instructions));
        sb.append(", llm=").append(String.valueOf(this.llm));
        sb.append(", modelSettings=").append(String.valueOf(this.modelSettings));
        sb.append(", memory=").append(String.valueOf(this.memory));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(", toolReferences=").append(String.valueOf(this.toolReferences));
        sb.append(", supervisorConfig=").append(String.valueOf(this.supervisorConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupervisorAgentNode)) {
            return false;
        }

        SupervisorAgentNode other = (SupervisorAgentNode) o;
        return java.util.Objects.equals(this.instructions, other.instructions) &&
            java.util.Objects.equals(this.llm, other.llm) &&
            java.util.Objects.equals(this.modelSettings, other.modelSettings) &&
            java.util.Objects.equals(this.memory, other.memory) &&
            java.util.Objects.equals(this.tools, other.tools) &&
            java.util.Objects.equals(this.toolReferences, other.toolReferences) &&
            java.util.Objects.equals(this.supervisorConfig, other.supervisorConfig) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instructions == null ? 43 : this.instructions.hashCode());
        result = (result * PRIME) + (this.llm == null ? 43 : this.llm.hashCode());
        result = (result * PRIME) + (this.modelSettings == null ? 43 : this.modelSettings.hashCode());
        result = (result * PRIME) + (this.memory == null ? 43 : this.memory.hashCode());
        result = (result * PRIME) + (this.tools == null ? 43 : this.tools.hashCode());
        result = (result * PRIME) + (this.toolReferences == null ? 43 : this.toolReferences.hashCode());
        result = (result * PRIME) + (this.supervisorConfig == null ? 43 : this.supervisorConfig.hashCode());
        return result;
    }


}
