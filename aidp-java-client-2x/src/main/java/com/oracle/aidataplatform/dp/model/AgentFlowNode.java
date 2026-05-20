// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A node in a diagram, representing logic, data, or operation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=AgentFlowNode.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StartNode.class, name = "START_NODE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = HttpToolNode.class, name = "HTTP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CustomToolNode.class, name = "CUSTOM_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = RagToolNode.class, name = "RAG_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = HumanInTheLoopNode.class, name = "HUMAN_IN_THE_LOOP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AgentNode.class, name = "AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpToolNode.class, name = "MCP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExternalAgentNode.class, name = "EXTERNAL_AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SqlToolNode.class, name = "SQL_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SupervisorAgentNode.class, name = "SUPERVISOR_AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = NestedAgentFlowNode.class, name = "NESTED_AGENT_FLOW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PromptToolNode.class, name = "PROMPT_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = GuardrailNode.class, name = "GUARDRAILS")
})

public class AgentFlowNode  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeType", "name", "description", "positionX", "positionY", "isExpanded", "parentNodeId", "configuration", "nodeTypeId", "key", "timeCreated", "timeUpdated", "inputs", "outputs", "validationErrors"})
    protected AgentFlowNode(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, java.util.Map<String, Object> configuration, String nodeTypeId, String key, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<NodeInput> inputs, java.util.List<NodeOutput> outputs, java.util.List<ValidationError> validationErrors) {
        super();
        this.nodeType = nodeType;
        this.name = name;
        this.description = description;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isExpanded = isExpanded;
        this.parentNodeId = parentNodeId;
        this.configuration = configuration;
        this.nodeTypeId = nodeTypeId;
        this.key = key;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.inputs = inputs;
        this.outputs = outputs;
        this.validationErrors = validationErrors;
    }




        /**
     * This field is deprecated. | It does not need to be set to any value for API calls.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final String nodeType;

        /**
     * This field is deprecated. | It does not need to be set to any value for API calls.
     * @return the value
     **/
    
    public String getNodeType() {
        return nodeType;
    }


        /**
     * Name of this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of this node.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of this node.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Canvas X coordinate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("positionX")
    private final Float positionX;

        /**
     * Canvas X coordinate.
     * @return the value
     **/
    
    public Float getPositionX() {
        return positionX;
    }


        /**
     * Canvas Y coordinate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("positionY")
    private final Float positionY;

        /**
     * Canvas Y coordinate.
     * @return the value
     **/
    
    public Float getPositionY() {
        return positionY;
    }


        /**
     * Is node expanded in UI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isExpanded")
    private final Boolean isExpanded;

        /**
     * Is node expanded in UI.
     * @return the value
     **/
    
    public Boolean getIsExpanded() {
        return isExpanded;
    }


        /**
     * Parent node ID, for subgraphs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentNodeId")
    private final String parentNodeId;

        /**
     * Parent node ID, for subgraphs.
     * @return the value
     **/
    
    public String getParentNodeId() {
        return parentNodeId;
    }


        /**
     * Configuration object for this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.Map<String, Object> configuration;

        /**
     * Configuration object for this node.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getConfiguration() {
        return configuration;
    }


        /**
     * Definition ID for this node type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeTypeId")
    private final String nodeTypeId;

        /**
     * Definition ID for this node type.
     * @return the value
     **/
    
    public String getNodeTypeId() {
        return nodeTypeId;
    }


        /**
     * Unique identifier for the node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for the node.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * RFC3339 timestamp when node was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * RFC3339 timestamp when node was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * RFC3339 timestamp when node was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * RFC3339 timestamp when node was last updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Array of NodeInput objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.List<NodeInput> inputs;

        /**
     * Array of NodeInput objects.
     * @return the value
     **/
    
    public java.util.List<NodeInput> getInputs() {
        return inputs;
    }


        /**
     * Array of NodeOutput objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.List<NodeOutput> outputs;

        /**
     * Array of NodeOutput objects.
     * @return the value
     **/
    
    public java.util.List<NodeOutput> getOutputs() {
        return outputs;
    }


        /**
     * List of validation errors encountered in the diagram.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
    private final java.util.List<ValidationError> validationErrors;

        /**
     * List of validation errors encountered in the diagram.
     * @return the value
     **/
    
    public java.util.List<ValidationError> getValidationErrors() {
        return validationErrors;
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
        sb.append("AgentFlowNode(");
        sb.append("nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", positionX=").append(String.valueOf(this.positionX));
        sb.append(", positionY=").append(String.valueOf(this.positionY));
        sb.append(", isExpanded=").append(String.valueOf(this.isExpanded));
        sb.append(", parentNodeId=").append(String.valueOf(this.parentNodeId));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", nodeTypeId=").append(String.valueOf(this.nodeTypeId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", validationErrors=").append(String.valueOf(this.validationErrors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowNode)) {
            return false;
        }

        AgentFlowNode other = (AgentFlowNode) o;
        return java.util.Objects.equals(this.nodeType, other.nodeType) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.positionX, other.positionX) &&
            java.util.Objects.equals(this.positionY, other.positionY) &&
            java.util.Objects.equals(this.isExpanded, other.isExpanded) &&
            java.util.Objects.equals(this.parentNodeId, other.parentNodeId) &&
            java.util.Objects.equals(this.configuration, other.configuration) &&
            java.util.Objects.equals(this.nodeTypeId, other.nodeTypeId) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.inputs, other.inputs) &&
            java.util.Objects.equals(this.outputs, other.outputs) &&
            java.util.Objects.equals(this.validationErrors, other.validationErrors);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.positionX == null ? 43 : this.positionX.hashCode());
        result = (result * PRIME) + (this.positionY == null ? 43 : this.positionY.hashCode());
        result = (result * PRIME) + (this.isExpanded == null ? 43 : this.isExpanded.hashCode());
        result = (result * PRIME) + (this.parentNodeId == null ? 43 : this.parentNodeId.hashCode());
        result = (result * PRIME) + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.nodeTypeId == null ? 43 : this.nodeTypeId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + (this.validationErrors == null ? 43 : this.validationErrors.hashCode());
        return result;
    }


}
