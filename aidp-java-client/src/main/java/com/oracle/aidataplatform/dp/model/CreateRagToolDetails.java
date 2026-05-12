package com.oracle.aidataplatform.dp.model;



/**
 * Details to create a SQL Tool
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateRagToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class CreateRagToolDetails extends CreateToolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

public Builder description(String description) {
    this.description = description;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, Object> properties;

public Builder properties(java.util.Map<String, Object> properties) {
    this.properties = properties;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
private RagToolInputSchema inputSchema;



public Builder inputSchema(RagToolInputSchema inputSchema) {
    this.inputSchema = inputSchema;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
private RagToolConfiguration toolConfig;



public Builder toolConfig(RagToolConfiguration toolConfig) {
    this.toolConfig = toolConfig;
    return this;
}


        public CreateRagToolDetails build() {
            CreateRagToolDetails model = new CreateRagToolDetails(this.displayName
                , this.description
                , this.properties
                , this.inputSchema
                , this.toolConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRagToolDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.properties(model.getProperties());
    this.inputSchema(model.getInputSchema());
    this.toolConfig(model.getToolConfig());
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
    public CreateRagToolDetails(String displayName, String description, java.util.Map<String, Object> properties, RagToolInputSchema inputSchema, RagToolConfiguration toolConfig) {
    super(displayName, description, properties);
        this.inputSchema = inputSchema;
        this.toolConfig = toolConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final RagToolInputSchema inputSchema;

    
    public RagToolInputSchema getInputSchema() {
        return inputSchema;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
    private final RagToolConfiguration toolConfig;

    
    public RagToolConfiguration getToolConfig() {
        return toolConfig;
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
        sb.append("CreateRagToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", inputSchema=").append(String.valueOf(this.inputSchema));
        sb.append(", toolConfig=").append(String.valueOf(this.toolConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRagToolDetails)) {
            return false;
        }

        CreateRagToolDetails other = (CreateRagToolDetails) o;
        return java.util.Objects.equals(this.inputSchema, other.inputSchema) &&
            java.util.Objects.equals(this.toolConfig, other.toolConfig) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.inputSchema == null ? 43 : this.inputSchema.hashCode());
        result = (result * PRIME) + (this.toolConfig == null ? 43 : this.toolConfig.hashCode());
        return result;
    }


}
