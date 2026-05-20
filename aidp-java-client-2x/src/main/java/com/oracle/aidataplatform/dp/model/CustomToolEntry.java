// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A single tool class entry within a custom tool package
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CustomToolEntry.Builder.class)

public final class CustomToolEntry  {
    @Deprecated
    @java.beans.ConstructorProperties({"toolClassName", "displayName", "description", "version", "config", "inputSchema"})
    public CustomToolEntry(String toolClassName, String displayName, String description, String version, java.util.Map<String, Object> config, java.util.Map<String, Object> inputSchema) {
        super();
        this.toolClassName = toolClassName;
        this.displayName = displayName;
        this.description = description;
        this.version = version;
        this.config = config;
        this.inputSchema = inputSchema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Python class name (e.g., WeatherTool, BashTool)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolClassName")
        private String toolClassName;

                /**
         * Python class name (e.g., WeatherTool, BashTool)
         * @param toolClassName the value to set
         * @return this builder
         **/
        

        public Builder toolClassName(String toolClassName) {
        this.toolClassName = toolClassName;
        return this;
        }
            /**
     * Human-readable tool name shown to LLM
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * Human-readable tool name shown to LLM
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Tool description for LLM tool selection
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Tool description for LLM tool selection
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * Tool version
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

                /**
         * Tool version
         * @param version the value to set
         * @return this builder
         **/
        

        public Builder version(String version) {
        this.version = version;
        return this;
        }
            /**
     * Tool-specific configuration values (supports template variables)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, Object> config;

                /**
         * Tool-specific configuration values (supports template variables)
         * @param config the value to set
         * @return this builder
         **/
        

        public Builder config(java.util.Map<String, Object> config) {
        this.config = config;
        return this;
        }
            /**
     * JSON schema for tool input parameters
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
        private java.util.Map<String, Object> inputSchema;

                /**
         * JSON schema for tool input parameters
         * @param inputSchema the value to set
         * @return this builder
         **/
        

        public Builder inputSchema(java.util.Map<String, Object> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
        }


        public CustomToolEntry build() {
            CustomToolEntry model = new CustomToolEntry(this.toolClassName
                    , this.displayName
                    , this.description
                    , this.version
                    , this.config
                    , this.inputSchema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomToolEntry model) {
                this.toolClassName(model.getToolClassName());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.version(model.getVersion());
    this.config(model.getConfig());
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

    


        /**
     * Python class name (e.g., WeatherTool, BashTool)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolClassName")
    private final String toolClassName;

        /**
     * Python class name (e.g., WeatherTool, BashTool)
     * @return the value
     **/
    
    public String getToolClassName() {
        return toolClassName;
    }


        /**
     * Human-readable tool name shown to LLM
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Human-readable tool name shown to LLM
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Tool description for LLM tool selection
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Tool description for LLM tool selection
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Tool version
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Tool version
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * Tool-specific configuration values (supports template variables)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, Object> config;

        /**
     * Tool-specific configuration values (supports template variables)
     * @return the value
     **/
    
    public java.util.Map<String, Object> getConfig() {
        return config;
    }


        /**
     * JSON schema for tool input parameters
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final java.util.Map<String, Object> inputSchema;

        /**
     * JSON schema for tool input parameters
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
        sb.append("CustomToolEntry(");
        sb.append("toolClassName=").append(String.valueOf(this.toolClassName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", inputSchema=").append(String.valueOf(this.inputSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomToolEntry)) {
            return false;
        }

        CustomToolEntry other = (CustomToolEntry) o;
        return java.util.Objects.equals(this.toolClassName, other.toolClassName) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.config, other.config) &&
            java.util.Objects.equals(this.inputSchema, other.inputSchema);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.toolClassName == null ? 43 : this.toolClassName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.inputSchema == null ? 43 : this.inputSchema.hashCode());
        return result;
    }


}
