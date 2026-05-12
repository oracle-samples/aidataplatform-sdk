package com.oracle.aidataplatform.dp.model;



/**
 * Resource exposed by an MCP server.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=McpResourceObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="objectType")

public final class McpResourceObject extends McpObject {
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
     * serialized schema of resource persisted within an MCP server.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resourceSchema")
private String resourceSchema;

        /**
         * serialized schema of resource persisted within an MCP server.
         * @param resourceSchema the value to set
         * @return this builder
         **/
        

public Builder resourceSchema(String resourceSchema) {
    this.resourceSchema = resourceSchema;
    return this;
}


        public McpResourceObject build() {
            McpResourceObject model = new McpResourceObject(this.name
                , this.description
                , this.resourceSchema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(McpResourceObject model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.resourceSchema(model.getResourceSchema());
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
    public McpResourceObject(String name, String description, String resourceSchema) {
    super(name, description);
        this.resourceSchema = resourceSchema;
    }


        /**
     * serialized schema of resource persisted within an MCP server.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceSchema")
    private final String resourceSchema;

        /**
     * serialized schema of resource persisted within an MCP server.
     * @return the value
     **/
    
    public String getResourceSchema() {
        return resourceSchema;
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
        sb.append("McpResourceObject(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceSchema=").append(String.valueOf(this.resourceSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpResourceObject)) {
            return false;
        }

        McpResourceObject other = (McpResourceObject) o;
        return java.util.Objects.equals(this.resourceSchema, other.resourceSchema) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceSchema == null ? 43 : this.resourceSchema.hashCode());
        return result;
    }


}
