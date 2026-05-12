package com.oracle.aidataplatform.dp.model;



/**
 * An edge connecting two nodes in the diagram, with context and metadata.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowEdge.Builder.class)

public final class AgentFlowEdge  {
    @Deprecated
    @java.beans.ConstructorProperties({"srcNodeId", "destNodeId", "srcNodeOutput", "destNodeInput", "parentNodeId", "edgeHandles", "edgeProperties", "edgeType", "key", "timeCreated", "timeUpdated", "validationErrors"})
    public AgentFlowEdge(String srcNodeId, String destNodeId, String srcNodeOutput, String destNodeInput, String parentNodeId, java.util.List<Point> edgeHandles, java.util.Map<String, Object> edgeProperties, String edgeType, String key, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.List<ValidationError> validationErrors) {
        super();
        this.srcNodeId = srcNodeId;
        this.destNodeId = destNodeId;
        this.srcNodeOutput = srcNodeOutput;
        this.destNodeInput = destNodeInput;
        this.parentNodeId = parentNodeId;
        this.edgeHandles = edgeHandles;
        this.edgeProperties = edgeProperties;
        this.edgeType = edgeType;
        this.key = key;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.validationErrors = validationErrors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Source node for this edge.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("srcNodeId")
private String srcNodeId;

        /**
         * Source node for this edge.
         * @param srcNodeId the value to set
         * @return this builder
         **/
        

public Builder srcNodeId(String srcNodeId) {
    this.srcNodeId = srcNodeId;
    return this;
}
            /**
     * Destination node for this edge.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destNodeId")
private String destNodeId;

        /**
         * Destination node for this edge.
         * @param destNodeId the value to set
         * @return this builder
         **/
        

public Builder destNodeId(String destNodeId) {
    this.destNodeId = destNodeId;
    return this;
}
            /**
     * Output port on the source node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("srcNodeOutput")
private String srcNodeOutput;

        /**
         * Output port on the source node.
         * @param srcNodeOutput the value to set
         * @return this builder
         **/
        

public Builder srcNodeOutput(String srcNodeOutput) {
    this.srcNodeOutput = srcNodeOutput;
    return this;
}
            /**
     * Input port on the destination node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destNodeInput")
private String destNodeInput;

        /**
         * Input port on the destination node.
         * @param destNodeInput the value to set
         * @return this builder
         **/
        

public Builder destNodeInput(String destNodeInput) {
    this.destNodeInput = destNodeInput;
    return this;
}
            /**
     * Parent node, if hierarchical.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentNodeId")
private String parentNodeId;

        /**
         * Parent node, if hierarchical.
         * @param parentNodeId the value to set
         * @return this builder
         **/
        

public Builder parentNodeId(String parentNodeId) {
    this.parentNodeId = parentNodeId;
    return this;
}
            /**
     * Geometry handle coordinates.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("edgeHandles")
private java.util.List<Point> edgeHandles;

        /**
         * Geometry handle coordinates.
         * @param edgeHandles the value to set
         * @return this builder
         **/
        

public Builder edgeHandles(java.util.List<Point> edgeHandles) {
    this.edgeHandles = edgeHandles;
    return this;
}
            /**
     * Extensible Properties of the Edge
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("edgeProperties")
private java.util.Map<String, Object> edgeProperties;

        /**
         * Extensible Properties of the Edge
         * @param edgeProperties the value to set
         * @return this builder
         **/
        

public Builder edgeProperties(java.util.Map<String, Object> edgeProperties) {
    this.edgeProperties = edgeProperties;
    return this;
}
            /**
     * Style/type for edge.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("edgeType")
private String edgeType;

        /**
         * Style/type for edge.
         * @param edgeType the value to set
         * @return this builder
         **/
        

public Builder edgeType(String edgeType) {
    this.edgeType = edgeType;
    return this;
}
            /**
     * Unique edge identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique edge identifier.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * RFC3339 timestamp when edge was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * RFC3339 timestamp when edge was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * RFC3339 timestamp when edge was last updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * RFC3339 timestamp when edge was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * List of validation errors encountered in the diagram.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
private java.util.List<ValidationError> validationErrors;

        /**
         * List of validation errors encountered in the diagram.
         * @param validationErrors the value to set
         * @return this builder
         **/
        

public Builder validationErrors(java.util.List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
}


        public AgentFlowEdge build() {
            AgentFlowEdge model = new AgentFlowEdge(this.srcNodeId
                , this.destNodeId
                , this.srcNodeOutput
                , this.destNodeInput
                , this.parentNodeId
                , this.edgeHandles
                , this.edgeProperties
                , this.edgeType
                , this.key
                , this.timeCreated
                , this.timeUpdated
                , this.validationErrors);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowEdge model) {
                this.srcNodeId(model.getSrcNodeId());
    this.destNodeId(model.getDestNodeId());
    this.srcNodeOutput(model.getSrcNodeOutput());
    this.destNodeInput(model.getDestNodeInput());
    this.parentNodeId(model.getParentNodeId());
    this.edgeHandles(model.getEdgeHandles());
    this.edgeProperties(model.getEdgeProperties());
    this.edgeType(model.getEdgeType());
    this.key(model.getKey());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.validationErrors(model.getValidationErrors());
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
     * Source node for this edge.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("srcNodeId")
    private final String srcNodeId;

        /**
     * Source node for this edge.
     * @return the value
     **/
    
    public String getSrcNodeId() {
        return srcNodeId;
    }


        /**
     * Destination node for this edge.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destNodeId")
    private final String destNodeId;

        /**
     * Destination node for this edge.
     * @return the value
     **/
    
    public String getDestNodeId() {
        return destNodeId;
    }


        /**
     * Output port on the source node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("srcNodeOutput")
    private final String srcNodeOutput;

        /**
     * Output port on the source node.
     * @return the value
     **/
    
    public String getSrcNodeOutput() {
        return srcNodeOutput;
    }


        /**
     * Input port on the destination node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destNodeInput")
    private final String destNodeInput;

        /**
     * Input port on the destination node.
     * @return the value
     **/
    
    public String getDestNodeInput() {
        return destNodeInput;
    }


        /**
     * Parent node, if hierarchical.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentNodeId")
    private final String parentNodeId;

        /**
     * Parent node, if hierarchical.
     * @return the value
     **/
    
    public String getParentNodeId() {
        return parentNodeId;
    }


        /**
     * Geometry handle coordinates.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("edgeHandles")
    private final java.util.List<Point> edgeHandles;

        /**
     * Geometry handle coordinates.
     * @return the value
     **/
    
    public java.util.List<Point> getEdgeHandles() {
        return edgeHandles;
    }


        /**
     * Extensible Properties of the Edge
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("edgeProperties")
    private final java.util.Map<String, Object> edgeProperties;

        /**
     * Extensible Properties of the Edge
     * @return the value
     **/
    
    public java.util.Map<String, Object> getEdgeProperties() {
        return edgeProperties;
    }


        /**
     * Style/type for edge.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("edgeType")
    private final String edgeType;

        /**
     * Style/type for edge.
     * @return the value
     **/
    
    public String getEdgeType() {
        return edgeType;
    }


        /**
     * Unique edge identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique edge identifier.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * RFC3339 timestamp when edge was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * RFC3339 timestamp when edge was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * RFC3339 timestamp when edge was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * RFC3339 timestamp when edge was last updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * List of validation errors encountered in the diagram.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationErrors")
    private final java.util.List<ValidationError> validationErrors;

        /**
     * List of validation errors encountered in the diagram.
     * @return the value
     **/
    
    public java.util.List<ValidationError> getValidationErrors() {
        return validationErrors;
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
        sb.append("AgentFlowEdge(");
        sb.append("srcNodeId=").append(String.valueOf(this.srcNodeId));
        sb.append(", destNodeId=").append(String.valueOf(this.destNodeId));
        sb.append(", srcNodeOutput=").append(String.valueOf(this.srcNodeOutput));
        sb.append(", destNodeInput=").append(String.valueOf(this.destNodeInput));
        sb.append(", parentNodeId=").append(String.valueOf(this.parentNodeId));
        sb.append(", edgeHandles=").append(String.valueOf(this.edgeHandles));
        sb.append(", edgeProperties=").append(String.valueOf(this.edgeProperties));
        sb.append(", edgeType=").append(String.valueOf(this.edgeType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", validationErrors=").append(String.valueOf(this.validationErrors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowEdge)) {
            return false;
        }

        AgentFlowEdge other = (AgentFlowEdge) o;
        return java.util.Objects.equals(this.srcNodeId, other.srcNodeId) &&
            java.util.Objects.equals(this.destNodeId, other.destNodeId) &&
            java.util.Objects.equals(this.srcNodeOutput, other.srcNodeOutput) &&
            java.util.Objects.equals(this.destNodeInput, other.destNodeInput) &&
            java.util.Objects.equals(this.parentNodeId, other.parentNodeId) &&
            java.util.Objects.equals(this.edgeHandles, other.edgeHandles) &&
            java.util.Objects.equals(this.edgeProperties, other.edgeProperties) &&
            java.util.Objects.equals(this.edgeType, other.edgeType) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.validationErrors, other.validationErrors);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.srcNodeId == null ? 43 : this.srcNodeId.hashCode());
        result = (result * PRIME) + (this.destNodeId == null ? 43 : this.destNodeId.hashCode());
        result = (result * PRIME) + (this.srcNodeOutput == null ? 43 : this.srcNodeOutput.hashCode());
        result = (result * PRIME) + (this.destNodeInput == null ? 43 : this.destNodeInput.hashCode());
        result = (result * PRIME) + (this.parentNodeId == null ? 43 : this.parentNodeId.hashCode());
        result = (result * PRIME) + (this.edgeHandles == null ? 43 : this.edgeHandles.hashCode());
        result = (result * PRIME) + (this.edgeProperties == null ? 43 : this.edgeProperties.hashCode());
        result = (result * PRIME) + (this.edgeType == null ? 43 : this.edgeType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.validationErrors == null ? 43 : this.validationErrors.hashCode());
        return result;
    }


}
