package com.oracle.aidataplatform.dp.model;



/**
 * Mcp object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="objectType", defaultImpl=McpObject.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpPromptObject.class, name = "PROMPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpToolObject.class, name = "TOOL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpResourceObject.class, name = "RESOURCE")
})

public class McpObject  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description"})
    protected McpObject(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }




        /**
     * name of the mcp object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * name of the mcp object
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * description of the mcp object
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * description of the mcp object
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("McpObject(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpObject)) {
            return false;
        }

        McpObject other = (McpObject) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
