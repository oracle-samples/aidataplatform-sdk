// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details to create a Custom Tool Node in an Agent Flow
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateCustomToolNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class CreateCustomToolNodeDetails extends CreateAgentFlowNodeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private String nodeType;

            public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
            }
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
        @com.fasterxml.jackson.annotation.JsonProperty("isExpanded")
        private Boolean isExpanded;

            public Builder isExpanded(Boolean isExpanded) {
            this.isExpanded = isExpanded;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("parentNodeId")
        private String parentNodeId;

            public Builder parentNodeId(String parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("srcNodeId")
        private String srcNodeId;

            public Builder srcNodeId(String srcNodeId) {
            this.srcNodeId = srcNodeId;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, Object> configuration;

            public Builder configuration(java.util.Map<String, Object> configuration) {
            this.configuration = configuration;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("nodeTypeId")
        private String nodeTypeId;

            public Builder nodeTypeId(String nodeTypeId) {
            this.nodeTypeId = nodeTypeId;
            return this;
            }
            /**
     * The unique identifier (key) of the saved AI tool
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolKey")
        private String toolKey;

                /**
         * The unique identifier (key) of the saved AI tool
         * @param toolKey the value to set
         * @return this builder
         **/
        

        public Builder toolKey(String toolKey) {
        this.toolKey = toolKey;
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
        private CustomToolConfiguration toolConfig;

        

        public Builder toolConfig(CustomToolConfiguration toolConfig) {
        this.toolConfig = toolConfig;
        return this;
        }


        public CreateCustomToolNodeDetails build() {
            CreateCustomToolNodeDetails model = new CreateCustomToolNodeDetails(this.nodeType
                    , this.name
                    , this.description
                    , this.positionX
                    , this.positionY
                    , this.isExpanded
                    , this.parentNodeId
                    , this.srcNodeId
                    , this.configuration
                    , this.nodeTypeId
                    , this.toolKey
                    , this.inputSchema
                    , this.toolConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCustomToolNodeDetails model) {
                this.nodeType(model.getNodeType());
    this.name(model.getName());
    this.description(model.getDescription());
    this.positionX(model.getPositionX());
    this.positionY(model.getPositionY());
    this.isExpanded(model.getIsExpanded());
    this.parentNodeId(model.getParentNodeId());
    this.srcNodeId(model.getSrcNodeId());
    this.configuration(model.getConfiguration());
    this.nodeTypeId(model.getNodeTypeId());
    this.toolKey(model.getToolKey());
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
    public CreateCustomToolNodeDetails(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, String srcNodeId, java.util.Map<String, Object> configuration, String nodeTypeId, String toolKey, java.util.Map<String, Object> inputSchema, CustomToolConfiguration toolConfig) {
        super(nodeType, name, description, positionX, positionY, isExpanded, parentNodeId, srcNodeId, configuration, nodeTypeId);
        this.toolKey = toolKey;
        this.inputSchema = inputSchema;
        this.toolConfig = toolConfig;
    }


        /**
     * The unique identifier (key) of the saved AI tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolKey")
    private final String toolKey;

        /**
     * The unique identifier (key) of the saved AI tool
     * @return the value
     **/
    
    public String getToolKey() {
        return toolKey;
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
        sb.append("CreateCustomToolNodeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolKey=").append(String.valueOf(this.toolKey));
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
        if (!(o instanceof CreateCustomToolNodeDetails)) {
            return false;
        }

        CreateCustomToolNodeDetails other = (CreateCustomToolNodeDetails) o;
        return java.util.Objects.equals(this.toolKey, other.toolKey) &&
            java.util.Objects.equals(this.inputSchema, other.inputSchema) &&
            java.util.Objects.equals(this.toolConfig, other.toolConfig) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolKey == null ? 43 : this.toolKey.hashCode());
        result = (result * PRIME) + (this.inputSchema == null ? 43 : this.inputSchema.hashCode());
        result = (result * PRIME) + (this.toolConfig == null ? 43 : this.toolConfig.hashCode());
        return result;
    }


}
