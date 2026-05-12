package com.oracle.aidataplatform.dp.model;


/**
 * Fields that can be updated in an existing node.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=UpdateAgentFlowNodeDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdatePromptToolNodeDetails.class, name = "PROMPT_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateCustomToolNodeDetails.class, name = "CUSTOM_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateHttpToolNodeDetails.class, name = "HTTP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateMcpToolNodeDetails.class, name = "MCP_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateRagToolNodeDetails.class, name = "RAG_TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateAgentNodeDetails.class, name = "AGENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateSqlToolNodeDetails.class, name = "SQL_TOOL")
})

public class UpdateAgentFlowNodeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeType", "name", "description", "positionX", "positionY", "isExpanded", "parentNodeId", "configuration", "nodeTypeId"})
    protected UpdateAgentFlowNodeDetails(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, java.util.Map<String, Object> configuration, String nodeTypeId) {
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
    }




        /**
     * Type of this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final String nodeType;

        /**
     * Type of this node.
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
        sb.append("UpdateAgentFlowNodeDetails(");
        sb.append("nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", positionX=").append(String.valueOf(this.positionX));
        sb.append(", positionY=").append(String.valueOf(this.positionY));
        sb.append(", isExpanded=").append(String.valueOf(this.isExpanded));
        sb.append(", parentNodeId=").append(String.valueOf(this.parentNodeId));
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
        if (!(o instanceof UpdateAgentFlowNodeDetails)) {
            return false;
        }

        UpdateAgentFlowNodeDetails other = (UpdateAgentFlowNodeDetails) o;
        return java.util.Objects.equals(this.nodeType, other.nodeType) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.positionX, other.positionX) &&
            java.util.Objects.equals(this.positionY, other.positionY) &&
            java.util.Objects.equals(this.isExpanded, other.isExpanded) &&
            java.util.Objects.equals(this.parentNodeId, other.parentNodeId) &&
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
        result = (result * PRIME) + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.nodeTypeId == null ? 43 : this.nodeTypeId.hashCode());
        return result;
    }


}
