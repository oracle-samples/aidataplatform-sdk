// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Diagrammatic representation of the Agent Flow with all node and edge details
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowDiagram.Builder.class)

public final class AgentFlowDiagram  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "nodes", "edges", "toolMap", "guardrailsMap"})
    public AgentFlowDiagram(String key, String displayName, String description, java.util.Map<String, AgentFlowNode> nodes, java.util.Map<String, AgentFlowEdge> edges, java.util.Map<String, Tool> toolMap, java.util.Map<String, GuardrailsConfiguration> guardrailsMap) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.nodes = nodes;
        this.edges = edges;
        this.toolMap = toolMap;
        this.guardrailsMap = guardrailsMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The unique identifier (UUID) of the Agent flow
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The unique identifier (UUID) of the Agent flow
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
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
     * Mapping of nodeId to node objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodes")
private java.util.Map<String, AgentFlowNode> nodes;

        /**
         * Mapping of nodeId to node objects.
         * @param nodes the value to set
         * @return this builder
         **/
        

public Builder nodes(java.util.Map<String, AgentFlowNode> nodes) {
    this.nodes = nodes;
    return this;
}
            /**
     * Mapping of edgeId to edge objects.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("edges")
private java.util.Map<String, AgentFlowEdge> edges;

        /**
         * Mapping of edgeId to edge objects.
         * @param edges the value to set
         * @return this builder
         **/
        

public Builder edges(java.util.Map<String, AgentFlowEdge> edges) {
    this.edges = edges;
    return this;
}
            /**
     * A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toolMap")
private java.util.Map<String, Tool> toolMap;

        /**
         * A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.
         * @param toolMap the value to set
         * @return this builder
         **/
        

public Builder toolMap(java.util.Map<String, Tool> toolMap) {
    this.toolMap = toolMap;
    return this;
}
            /**
     * A hash map with key=guardrails config name, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("guardrailsMap")
private java.util.Map<String, GuardrailsConfiguration> guardrailsMap;

        /**
         * A hash map with key=guardrails config name, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.
         * @param guardrailsMap the value to set
         * @return this builder
         **/
        

public Builder guardrailsMap(java.util.Map<String, GuardrailsConfiguration> guardrailsMap) {
    this.guardrailsMap = guardrailsMap;
    return this;
}


        public AgentFlowDiagram build() {
            AgentFlowDiagram model = new AgentFlowDiagram(this.key
                , this.displayName
                , this.description
                , this.nodes
                , this.edges
                , this.toolMap
                , this.guardrailsMap);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowDiagram model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.nodes(model.getNodes());
    this.edges(model.getEdges());
    this.toolMap(model.getToolMap());
    this.guardrailsMap(model.getGuardrailsMap());
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
     * The unique identifier (UUID) of the Agent flow
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique identifier (UUID) of the Agent flow
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
     * Mapping of nodeId to node objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.Map<String, AgentFlowNode> nodes;

        /**
     * Mapping of nodeId to node objects.
     * @return the value
     **/
    
    public java.util.Map<String, AgentFlowNode> getNodes() {
        return nodes;
    }


        /**
     * Mapping of edgeId to edge objects.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("edges")
    private final java.util.Map<String, AgentFlowEdge> edges;

        /**
     * Mapping of edgeId to edge objects.
     * @return the value
     **/
    
    public java.util.Map<String, AgentFlowEdge> getEdges() {
        return edges;
    }


        /**
     * A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolMap")
    private final java.util.Map<String, Tool> toolMap;

        /**
     * A hash map with key=tool key, value=tool definition.   It is used to find the tool definition for a tool reference, where the tool is marked as a reference.
     * @return the value
     **/
    
    public java.util.Map<String, Tool> getToolMap() {
        return toolMap;
    }


        /**
     * A hash map with key=guardrails config name, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("guardrailsMap")
    private final java.util.Map<String, GuardrailsConfiguration> guardrailsMap;

        /**
     * A hash map with key=guardrails config name, value=guardrails definition.   It is used to find the guardrails definition for a guardrails reference by name.
     * @return the value
     **/
    
    public java.util.Map<String, GuardrailsConfiguration> getGuardrailsMap() {
        return guardrailsMap;
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
        sb.append("AgentFlowDiagram(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", edges=").append(String.valueOf(this.edges));
        sb.append(", toolMap=").append(String.valueOf(this.toolMap));
        sb.append(", guardrailsMap=").append(String.valueOf(this.guardrailsMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowDiagram)) {
            return false;
        }

        AgentFlowDiagram other = (AgentFlowDiagram) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.nodes, other.nodes) &&
            java.util.Objects.equals(this.edges, other.edges) &&
            java.util.Objects.equals(this.toolMap, other.toolMap) &&
            java.util.Objects.equals(this.guardrailsMap, other.guardrailsMap);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.edges == null ? 43 : this.edges.hashCode());
        result = (result * PRIME) + (this.toolMap == null ? 43 : this.toolMap.hashCode());
        result = (result * PRIME) + (this.guardrailsMap == null ? 43 : this.guardrailsMap.hashCode());
        return result;
    }


}
