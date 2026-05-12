package com.oracle.aidataplatform.dp.model;



/**
 * Details to update an Agent Node in an Agent Flow
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class UpdateAgentNodeDetails extends UpdateAgentFlowNodeDetails {
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
            /**
     * Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("instructions")
private String instructions;

        /**
         * Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to
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


        public UpdateAgentNodeDetails build() {
            UpdateAgentNodeDetails model = new UpdateAgentNodeDetails(this.nodeType
                , this.name
                , this.description
                , this.positionX
                , this.positionY
                , this.isExpanded
                , this.parentNodeId
                , this.configuration
                , this.nodeTypeId
                , this.instructions
                , this.llm
                , this.modelSettings
                , this.memory
                , this.tools);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentNodeDetails model) {
                this.nodeType(model.getNodeType());
    this.name(model.getName());
    this.description(model.getDescription());
    this.positionX(model.getPositionX());
    this.positionY(model.getPositionY());
    this.isExpanded(model.getIsExpanded());
    this.parentNodeId(model.getParentNodeId());
    this.configuration(model.getConfiguration());
    this.nodeTypeId(model.getNodeTypeId());
    this.instructions(model.getInstructions());
    this.llm(model.getLlm());
    this.modelSettings(model.getModelSettings());
    this.memory(model.getMemory());
    this.tools(model.getTools());
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
    public UpdateAgentNodeDetails(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, java.util.Map<String, Object> configuration, String nodeTypeId, String instructions, LlmConfig llm, java.util.Map<String, Object> modelSettings, MemoryConfiguration memory, java.util.List<Tool> tools) {
    super(nodeType, name, description, positionX, positionY, isExpanded, parentNodeId, configuration, nodeTypeId);
        this.instructions = instructions;
        this.llm = llm;
        this.modelSettings = modelSettings;
        this.memory = memory;
        this.tools = tools;
    }


        /**
     * Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("instructions")
    private final String instructions;

        /**
     * Custom prompt written by the user defining the agent\u2019s goal(s) and what tools the agent has access to
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
        sb.append("UpdateAgentNodeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instructions=").append(String.valueOf(this.instructions));
        sb.append(", llm=").append(String.valueOf(this.llm));
        sb.append(", modelSettings=").append(String.valueOf(this.modelSettings));
        sb.append(", memory=").append(String.valueOf(this.memory));
        sb.append(", tools=").append(String.valueOf(this.tools));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentNodeDetails)) {
            return false;
        }

        UpdateAgentNodeDetails other = (UpdateAgentNodeDetails) o;
        return java.util.Objects.equals(this.instructions, other.instructions) &&
            java.util.Objects.equals(this.llm, other.llm) &&
            java.util.Objects.equals(this.modelSettings, other.modelSettings) &&
            java.util.Objects.equals(this.memory, other.memory) &&
            java.util.Objects.equals(this.tools, other.tools) &&
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
        return result;
    }


}
