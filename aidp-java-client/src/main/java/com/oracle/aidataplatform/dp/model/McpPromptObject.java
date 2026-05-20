// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Prompt exposed by an MCP server.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=McpPromptObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="objectType")

public final class McpPromptObject extends McpObject {
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
     * prompt persisted within an MCP server.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("prompt")
private String prompt;

        /**
         * prompt persisted within an MCP server.
         * @param prompt the value to set
         * @return this builder
         **/
        

public Builder prompt(String prompt) {
    this.prompt = prompt;
    return this;
}


        public McpPromptObject build() {
            McpPromptObject model = new McpPromptObject(this.name
                , this.description
                , this.prompt);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(McpPromptObject model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.prompt(model.getPrompt());
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
    public McpPromptObject(String name, String description, String prompt) {
    super(name, description);
        this.prompt = prompt;
    }


        /**
     * prompt persisted within an MCP server.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prompt")
    private final String prompt;

        /**
     * prompt persisted within an MCP server.
     * @return the value
     **/
    
    public String getPrompt() {
        return prompt;
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
        sb.append("McpPromptObject(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", prompt=").append(String.valueOf(this.prompt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpPromptObject)) {
            return false;
        }

        McpPromptObject other = (McpPromptObject) o;
        return java.util.Objects.equals(this.prompt, other.prompt) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.prompt == null ? 43 : this.prompt.hashCode());
        return result;
    }


}
