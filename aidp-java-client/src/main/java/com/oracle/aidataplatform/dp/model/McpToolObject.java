// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Tool exposed by an MCP server.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=McpToolObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="objectType")

public final class McpToolObject extends McpObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
            /**
     * representation of the input schema for a tool.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
private java.util.Map<String, Object> inputSchema;

        /**
         * representation of the input schema for a tool.
         * @param inputSchema the value to set
         * @return this builder
         **/
        

public Builder inputSchema(java.util.Map<String, Object> inputSchema) {
    this.inputSchema = inputSchema;
    return this;
}


        public McpToolObject build() {
            McpToolObject model = new McpToolObject(this.name
                , this.description
                , this.inputSchema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(McpToolObject model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.inputSchema(model.getInputSchema());
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
    public McpToolObject(String name, String description, java.util.Map<String, Object> inputSchema) {
    super(name, description);
        this.inputSchema = inputSchema;
    }


        /**
     * representation of the input schema for a tool.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final java.util.Map<String, Object> inputSchema;

        /**
     * representation of the input schema for a tool.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getInputSchema() {
        return inputSchema;
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
        sb.append("McpToolObject(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", inputSchema=").append(String.valueOf(this.inputSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpToolObject)) {
            return false;
        }

        McpToolObject other = (McpToolObject) o;
        return java.util.Objects.equals(this.inputSchema, other.inputSchema) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.inputSchema == null ? 43 : this.inputSchema.hashCode());
        return result;
    }


}
