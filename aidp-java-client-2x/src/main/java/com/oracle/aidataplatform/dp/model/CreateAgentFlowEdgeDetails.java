package com.oracle.aidataplatform.dp.model;


/**
 * Details required to create a new edge in a diagram.
* <p>
Excludes computed fields such as id, timeCreated, and timeUpdated.
* - srcNodeId: Source node identifier
* - destNodeId: Destination node identifier
* - srcNodeOutput: Source node's output port name
* - destNodeInput: Destination node's input port name
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAgentFlowEdgeDetails.Builder.class)

public final class CreateAgentFlowEdgeDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"srcNodeId", "destNodeId", "srcNodeOutput", "destNodeInput", "parentNodeId", "edgeHandles", "edgeType"})
    public CreateAgentFlowEdgeDetails(String srcNodeId, String destNodeId, String srcNodeOutput, String destNodeInput, String parentNodeId, java.util.List<Point> edgeHandles, String edgeType) {
        super();
        this.srcNodeId = srcNodeId;
        this.destNodeId = destNodeId;
        this.srcNodeOutput = srcNodeOutput;
        this.destNodeInput = destNodeInput;
        this.parentNodeId = parentNodeId;
        this.edgeHandles = edgeHandles;
        this.edgeType = edgeType;
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


        public CreateAgentFlowEdgeDetails build() {
            CreateAgentFlowEdgeDetails model = new CreateAgentFlowEdgeDetails(this.srcNodeId
                    , this.destNodeId
                    , this.srcNodeOutput
                    , this.destNodeInput
                    , this.parentNodeId
                    , this.edgeHandles
                    , this.edgeType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAgentFlowEdgeDetails model) {
                this.srcNodeId(model.getSrcNodeId());
    this.destNodeId(model.getDestNodeId());
    this.srcNodeOutput(model.getSrcNodeOutput());
    this.destNodeInput(model.getDestNodeInput());
    this.parentNodeId(model.getParentNodeId());
    this.edgeHandles(model.getEdgeHandles());
    this.edgeType(model.getEdgeType());
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
        sb.append("CreateAgentFlowEdgeDetails(");
        sb.append("srcNodeId=").append(String.valueOf(this.srcNodeId));
        sb.append(", destNodeId=").append(String.valueOf(this.destNodeId));
        sb.append(", srcNodeOutput=").append(String.valueOf(this.srcNodeOutput));
        sb.append(", destNodeInput=").append(String.valueOf(this.destNodeInput));
        sb.append(", parentNodeId=").append(String.valueOf(this.parentNodeId));
        sb.append(", edgeHandles=").append(String.valueOf(this.edgeHandles));
        sb.append(", edgeType=").append(String.valueOf(this.edgeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAgentFlowEdgeDetails)) {
            return false;
        }

        CreateAgentFlowEdgeDetails other = (CreateAgentFlowEdgeDetails) o;
        return java.util.Objects.equals(this.srcNodeId, other.srcNodeId) &&
            java.util.Objects.equals(this.destNodeId, other.destNodeId) &&
            java.util.Objects.equals(this.srcNodeOutput, other.srcNodeOutput) &&
            java.util.Objects.equals(this.destNodeInput, other.destNodeInput) &&
            java.util.Objects.equals(this.parentNodeId, other.parentNodeId) &&
            java.util.Objects.equals(this.edgeHandles, other.edgeHandles) &&
            java.util.Objects.equals(this.edgeType, other.edgeType);
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
        result = (result * PRIME) + (this.edgeType == null ? 43 : this.edgeType.hashCode());
        return result;
    }


}
