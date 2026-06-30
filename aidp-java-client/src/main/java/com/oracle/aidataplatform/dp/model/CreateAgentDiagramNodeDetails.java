// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to create a new node in a diagram.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=CreateAgentDiagramNodeDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramRagToolNodeDetails.class, name = "RAG_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramHttpToolNodeDetails.class, name = "HTTP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramAgentNodeDetails.class, name = "AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramSqlToolNodeDetails.class, name = "SQL_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramCustomToolNodeDetails.class, name = "CUSTOM_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramMcpToolNodeDetails.class, name = "MCP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CreateAgentDiagramPromptToolNodeDetails.class, name = "PROMPT_TOOL")
})

public class CreateAgentDiagramNodeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeType", "name", "description", "positionX", "positionY", "isExpanded", "parentNodeId", "srcNodeId", "configuration", "nodeTypeId"})
    protected CreateAgentDiagramNodeDetails(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, String srcNodeId, java.util.Map<String, Object> configuration, String nodeTypeId) {
        super();
        this.nodeType = nodeType;
        this.name = name;
        this.description = description;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isExpanded = isExpanded;
        this.parentNodeId = parentNodeId;
        this.srcNodeId = srcNodeId;
        this.configuration = configuration;
        this.nodeTypeId = nodeTypeId;
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
     * Source node to which this node is connected.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("srcNodeId")
    private final String srcNodeId;

        /**
     * Source node to which this node is connected.
     * @return the value
     **/
    
    public String getSrcNodeId() {
        return srcNodeId;
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
        sb.append("CreateAgentDiagramNodeDetails(");
        sb.append("nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", positionX=").append(String.valueOf(this.positionX));
        sb.append(", positionY=").append(String.valueOf(this.positionY));
        sb.append(", isExpanded=").append(String.valueOf(this.isExpanded));
        sb.append(", parentNodeId=").append(String.valueOf(this.parentNodeId));
        sb.append(", srcNodeId=").append(String.valueOf(this.srcNodeId));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", nodeTypeId=").append(String.valueOf(this.nodeTypeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentDiagramNodeDetails)) {
            return false;
        }

        CreateAgentDiagramNodeDetails other = (CreateAgentDiagramNodeDetails) o;
        return java.util.Objects.equals(this.nodeType, other.nodeType) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.positionX, other.positionX) &&
            java.util.Objects.equals(this.positionY, other.positionY) &&
            java.util.Objects.equals(this.isExpanded, other.isExpanded) &&
            java.util.Objects.equals(this.parentNodeId, other.parentNodeId) &&
            java.util.Objects.equals(this.srcNodeId, other.srcNodeId) &&
            java.util.Objects.equals(this.configuration, other.configuration) &&
            java.util.Objects.equals(this.nodeTypeId, other.nodeTypeId);
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
        result = (result * PRIME) + (this.srcNodeId == null ? 43 : this.srcNodeId.hashCode());
        result = (result * PRIME) + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.nodeTypeId == null ? 43 : this.nodeTypeId.hashCode());
        return result;
    }


}
