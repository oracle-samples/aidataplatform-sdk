package com.oracle.aidataplatform.dp.model;


/**
 * Details to update an HTTP Tool
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateHttpToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class UpdateHttpToolDetails extends UpdateToolDetails {
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
            /**
     * The list of template variable properties in the inputSchema
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
        private java.util.Map<String, Object> inputSchema;

                /**
         * The list of template variable properties in the inputSchema
         * @param inputSchema the value to set
         * @return this builder
         **/
        

        public Builder inputSchema(java.util.Map<String, Object> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
        private HttpToolConfiguration toolConfig;

        

        public Builder toolConfig(HttpToolConfiguration toolConfig) {
        this.toolConfig = toolConfig;
        return this;
        }


        public UpdateHttpToolDetails build() {
            UpdateHttpToolDetails model = new UpdateHttpToolDetails(this.displayName
                    , this.description
                    , this.properties
                    , this.inputSchema
                    , this.toolConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateHttpToolDetails model) {
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
    public UpdateHttpToolDetails(String displayName, String description, java.util.Map<String, Object> properties, java.util.Map<String, Object> inputSchema, HttpToolConfiguration toolConfig) {
        super(displayName, description, properties);
        this.inputSchema = inputSchema;
        this.toolConfig = toolConfig;
    }


        /**
     * The list of template variable properties in the inputSchema
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final java.util.Map<String, Object> inputSchema;

        /**
     * The list of template variable properties in the inputSchema
     * @return the value
     **/
    
    public java.util.Map<String, Object> getInputSchema() {
        return inputSchema;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
    private final HttpToolConfiguration toolConfig;

    
    public HttpToolConfiguration getToolConfig() {
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
        sb.append("UpdateHttpToolDetails(");
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
        if (!(o instanceof UpdateHttpToolDetails)) {
            return false;
        }

        UpdateHttpToolDetails other = (UpdateHttpToolDetails) o;
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
