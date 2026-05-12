package com.oracle.aidataplatform.dp.model;


/**
 * Derived model a SQL Tool
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SqlTool.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class SqlTool extends Tool {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

            public Builder key(String key) {
            this.key = key;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

            public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
        private String workspaceKey;

            public Builder workspaceKey(String workspaceKey) {
            this.workspaceKey = workspaceKey;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

            public Builder description(String description) {
            this.description = description;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("isReference")
        private Boolean isReference;

            public Builder isReference(Boolean isReference) {
            this.isReference = isReference;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("positionX")
        private Float positionX;

            public Builder positionX(Float positionX) {
            this.positionX = positionX;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("positionY")
        private Float positionY;

            public Builder positionY(Float positionY) {
            this.positionY = positionY;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, Object> properties;

            public Builder properties(java.util.Map<String, Object> properties) {
            this.properties = properties;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

            public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

            public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

            public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

            public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
            }
            /**
     * The list of properties in the inputSchema, along with the default value and description of each property
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
        private java.util.Map<String, Object> inputSchema;

                /**
         * The list of properties in the inputSchema, along with the default value and description of each property
         * @param inputSchema the value to set
         * @return this builder
         **/
        

        public Builder inputSchema(java.util.Map<String, Object> inputSchema) {
        this.inputSchema = inputSchema;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
        private SqlToolConfiguration toolConfig;

        

        public Builder toolConfig(SqlToolConfiguration toolConfig) {
        this.toolConfig = toolConfig;
        return this;
        }


        public SqlTool build() {
            SqlTool model = new SqlTool(this.key
                    , this.displayName
                    , this.workspaceKey
                    , this.description
                    , this.isReference
                    , this.positionX
                    , this.positionY
                    , this.properties
                    , this.timeCreated
                    , this.timeUpdated
                    , this.createdBy
                    , this.updatedBy
                    , this.inputSchema
                    , this.toolConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTool model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.workspaceKey(model.getWorkspaceKey());
    this.description(model.getDescription());
    this.isReference(model.getIsReference());
    this.positionX(model.getPositionX());
    this.positionY(model.getPositionY());
    this.properties(model.getProperties());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
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
    public SqlTool(String key, String displayName, String workspaceKey, String description, Boolean isReference, Float positionX, Float positionY, java.util.Map<String, Object> properties, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, java.util.Map<String, Object> inputSchema, SqlToolConfiguration toolConfig) {
        super(key, displayName, workspaceKey, description, isReference, positionX, positionY, properties, timeCreated, timeUpdated, createdBy, updatedBy);
        this.inputSchema = inputSchema;
        this.toolConfig = toolConfig;
    }


        /**
     * The list of properties in the inputSchema, along with the default value and description of each property
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inputSchema")
    private final java.util.Map<String, Object> inputSchema;

        /**
     * The list of properties in the inputSchema, along with the default value and description of each property
     * @return the value
     **/
    
    public java.util.Map<String, Object> getInputSchema() {
        return inputSchema;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
    private final SqlToolConfiguration toolConfig;

    
    public SqlToolConfiguration getToolConfig() {
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
        sb.append("SqlTool(");
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
        if (!(o instanceof SqlTool)) {
            return false;
        }

        SqlTool other = (SqlTool) o;
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
