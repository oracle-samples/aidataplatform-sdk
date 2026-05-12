package com.oracle.aidataplatform.dp.model;


/**
 * Details to update a Custom Tool
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateCustomToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class UpdateCustomToolDetails extends UpdateToolDetails {
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
     * The provider of the tool, default is AIDP
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolProvider")
        private String toolProvider;

                /**
         * The provider of the tool, default is AIDP
         * @param toolProvider the value to set
         * @return this builder
         **/
        

        public Builder toolProvider(String toolProvider) {
        this.toolProvider = toolProvider;
        return this;
        }
            /**
     * The type name for this tool
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolTypeName")
        private String toolTypeName;

                /**
         * The type name for this tool
         * @param toolTypeName the value to set
         * @return this builder
         **/
        

        public Builder toolTypeName(String toolTypeName) {
        this.toolTypeName = toolTypeName;
        return this;
        }
            /**
     * The list of named properties in the inputSchema, along with the default value and description of each property
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
        private java.util.Map<String, Object> inputSchema;

                /**
         * The list of named properties in the inputSchema, along with the default value and description of each property
         * @param inputSchema the value to set
         * @return this builder
         **/
        

        public Builder inputSchema(java.util.Map<String, Object> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
        private CustomToolConfiguration toolConfig;

        

        public Builder toolConfig(CustomToolConfiguration toolConfig) {
        this.toolConfig = toolConfig;
        return this;
        }


        public UpdateCustomToolDetails build() {
            UpdateCustomToolDetails model = new UpdateCustomToolDetails(this.displayName
                    , this.description
                    , this.properties
                    , this.toolProvider
                    , this.toolTypeName
                    , this.inputSchema
                    , this.toolConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCustomToolDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.properties(model.getProperties());
    this.toolProvider(model.getToolProvider());
    this.toolTypeName(model.getToolTypeName());
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
    public UpdateCustomToolDetails(String displayName, String description, java.util.Map<String, Object> properties, String toolProvider, String toolTypeName, java.util.Map<String, Object> inputSchema, CustomToolConfiguration toolConfig) {
        super(displayName, description, properties);
        this.toolProvider = toolProvider;
        this.toolTypeName = toolTypeName;
        this.inputSchema = inputSchema;
        this.toolConfig = toolConfig;
    }


        /**
     * The provider of the tool, default is AIDP
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolProvider")
    private final String toolProvider;

        /**
     * The provider of the tool, default is AIDP
     * @return the value
     **/
    
    public String getToolProvider() {
        return toolProvider;
    }


        /**
     * The type name for this tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolTypeName")
    private final String toolTypeName;

        /**
     * The type name for this tool
     * @return the value
     **/
    
    public String getToolTypeName() {
        return toolTypeName;
    }


        /**
     * The list of named properties in the inputSchema, along with the default value and description of each property
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final java.util.Map<String, Object> inputSchema;

        /**
     * The list of named properties in the inputSchema, along with the default value and description of each property
     * @return the value
     **/
    
    public java.util.Map<String, Object> getInputSchema() {
        return inputSchema;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
    private final CustomToolConfiguration toolConfig;

    
    public CustomToolConfiguration getToolConfig() {
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
        sb.append("UpdateCustomToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolProvider=").append(String.valueOf(this.toolProvider));
        sb.append(", toolTypeName=").append(String.valueOf(this.toolTypeName));
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
        if (!(o instanceof UpdateCustomToolDetails)) {
            return false;
        }

        UpdateCustomToolDetails other = (UpdateCustomToolDetails) o;
        return java.util.Objects.equals(this.toolProvider, other.toolProvider) &&
            java.util.Objects.equals(this.toolTypeName, other.toolTypeName) &&
            java.util.Objects.equals(this.inputSchema, other.inputSchema) &&
            java.util.Objects.equals(this.toolConfig, other.toolConfig) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolProvider == null ? 43 : this.toolProvider.hashCode());
        result = (result * PRIME) + (this.toolTypeName == null ? 43 : this.toolTypeName.hashCode());
        result = (result * PRIME) + (this.inputSchema == null ? 43 : this.inputSchema.hashCode());
        result = (result * PRIME) + (this.toolConfig == null ? 43 : this.toolConfig.hashCode());
        return result;
    }


}
