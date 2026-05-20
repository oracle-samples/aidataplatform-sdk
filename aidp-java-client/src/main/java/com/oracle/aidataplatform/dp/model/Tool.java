// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A tool is a function that an agent can call. Tools can retrieve data, call external APIs, HTTP endpoints, execute a snippet of code, entire Python scripts, etc. | A tool is stateless, doesn't reason  (it just executes), and can be reused across agents.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType", defaultImpl=Tool.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CustomTool.class, name = "CUSTOM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PromptTool.class, name = "PROMPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpTool.class, name = "MCP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SqlTool.class, name = "SQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = RagTool.class, name = "RAG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = HttpTool.class, name = "HTTP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = NlToSqlTool.class, name = "NL2SQL")
})

public class Tool  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "workspaceKey", "description", "positionX", "positionY", "properties", "timeCreated", "timeUpdated", "createdBy", "updatedBy"})
    protected Tool(String key, String displayName, String workspaceKey, String description, Float positionX, Float positionY, java.util.Map<String, Object> properties, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.workspaceKey = workspaceKey;
        this.description = description;
        this.positionX = positionX;
        this.positionY = positionY;
        this.properties = properties;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }




        /**
     * The unique identifier of the tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique identifier of the tool
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Tool name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Tool name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The key of the Workspace to which this tool belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * The key of the Workspace to which this tool belongs.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Tool description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Tool description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Canvas X coordinate of the Tool node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("positionX")
    private final Float positionX;

        /**
     * Canvas X coordinate of the Tool node
     * @return the value
     **/
    
    public Float getPositionX() {
        return positionX;
    }


        /**
     * Canvas Y coordinate of the Tool node
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("positionY")
    private final Float positionY;

        /**
     * Canvas Y coordinate of the Tool node
     * @return the value
     **/
    
    public Float getPositionY() {
        return positionY;
    }


        /**
     * A list of key-value pairs to use for configuring the tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * A list of key-value pairs to use for configuring the tool
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
        return properties;
    }


        /**
     * The date and time the tool was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the tool was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the tool was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the tool was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The OCID of the user/principal who created the tool.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The OCID of the user/principal who created the tool.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the schema.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
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
        sb.append("Tool(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", positionX=").append(String.valueOf(this.positionX));
        sb.append(", positionY=").append(String.valueOf(this.positionY));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tool)) {
            return false;
        }

        Tool other = (Tool) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.positionX, other.positionX) &&
            java.util.Objects.equals(this.positionY, other.positionY) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.positionX == null ? 43 : this.positionX.hashCode());
        result = (result * PRIME) + (this.positionY == null ? 43 : this.positionY.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        return result;
    }


}
