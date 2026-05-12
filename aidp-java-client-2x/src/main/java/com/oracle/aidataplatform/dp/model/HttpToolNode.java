package com.oracle.aidataplatform.dp.model;


/**
 * A Tool Node in an Agent Flow
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=HttpToolNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class HttpToolNode extends AgentFlowNode {
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
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

            public Builder key(String key) {
            this.key = key;
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
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.List<NodeInput> inputs;

            public Builder inputs(java.util.List<NodeInput> inputs) {
            this.inputs = inputs;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.List<NodeOutput> outputs;

            public Builder outputs(java.util.List<NodeOutput> outputs) {
            this.outputs = outputs;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
        private java.util.List<ValidationError> validationErrors;

            public Builder validationErrors(java.util.List<ValidationError> validationErrors) {
            this.validationErrors = validationErrors;
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


        public HttpToolNode build() {
            HttpToolNode model = new HttpToolNode(this.nodeType
                    , this.name
                    , this.description
                    , this.positionX
                    , this.positionY
                    , this.isExpanded
                    , this.parentNodeId
                    , this.configuration
                    , this.nodeTypeId
                    , this.key
                    , this.timeCreated
                    , this.timeUpdated
                    , this.inputs
                    , this.outputs
                    , this.validationErrors
                    , this.inputSchema);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpToolNode model) {
                this.nodeType(model.getNodeType());
    this.name(model.getName());
    this.description(model.getDescription());
    this.positionX(model.getPositionX());
    this.positionY(model.getPositionY());
    this.isExpanded(model.getIsExpanded());
    this.parentNodeId(model.getParentNodeId());
    this.configuration(model.getConfiguration());
    this.nodeTypeId(model.getNodeTypeId());
    this.key(model.getKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.inputs(model.getInputs());
    this.outputs(model.getOutputs());
    this.validationErrors(model.getValidationErrors());
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
    public HttpToolNode(String nodeType, String name, String description, Float positionX, Float positionY, Boolean isExpanded, String parentNodeId, java.util.Map<String, Object> configuration, String nodeTypeId, String key, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<NodeInput> inputs, java.util.List<NodeOutput> outputs, java.util.List<ValidationError> validationErrors, java.util.Map<String, Object> inputSchema) {
        super(nodeType, name, description, positionX, positionY, isExpanded, parentNodeId, configuration, nodeTypeId, key, timeCreated, timeUpdated, inputs, outputs, validationErrors);
        this.inputSchema = inputSchema;
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
        sb.append("HttpToolNode(");
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
        if (!(o instanceof HttpToolNode)) {
            return false;
        }

        HttpToolNode other = (HttpToolNode) o;
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
