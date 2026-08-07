// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details needed by a lineage fetch request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ObjectLineageRequestDetails.Builder.class)

public final class ObjectLineageRequestDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"anchorNode", "maxDepth", "level", "direction", "nodeFilters", "pathFilters", "shouldIncludeEdges"})
    public ObjectLineageRequestDetails(String anchorNode, Integer maxDepth, LineageLevel level, LineageDirection direction, NodeFilterObject nodeFilters, PathFilterObject pathFilters, Boolean shouldIncludeEdges) {
        super();
        this.anchorNode = anchorNode;
        this.maxDepth = maxDepth;
        this.level = level;
        this.direction = direction;
        this.nodeFilters = nodeFilters;
        this.pathFilters = pathFilters;
        this.shouldIncludeEdges = shouldIncludeEdges;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Root entity node from with the lineage is to be fetched.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorNode")
private String anchorNode;

        /**
         * Root entity node from with the lineage is to be fetched.
* 
         * @param anchorNode the value to set
         * @return this builder
         **/
        

public Builder anchorNode(String anchorNode) {
    this.anchorNode = anchorNode;
    return this;
}
            /**
     * Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxDepth")
private Integer maxDepth;

        /**
         * Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
* 
         * @param maxDepth the value to set
         * @return this builder
         **/
        

public Builder maxDepth(Integer maxDepth) {
    this.maxDepth = maxDepth;
    return this;
}
            /**
     * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("level")
private LineageLevel level;

        /**
         * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* 
         * @param level the value to set
         * @return this builder
         **/
        

public Builder level(LineageLevel level) {
    this.level = level;
    return this;
}
            /**
     * Direction of the lineage returned.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private LineageDirection direction;

        /**
         * Direction of the lineage returned.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(LineageDirection direction) {
    this.direction = direction;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("nodeFilters")
private NodeFilterObject nodeFilters;



public Builder nodeFilters(NodeFilterObject nodeFilters) {
    this.nodeFilters = nodeFilters;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("pathFilters")
private PathFilterObject pathFilters;



public Builder pathFilters(PathFilterObject pathFilters) {
    this.pathFilters = pathFilters;
    return this;
}
            /**
     * Controls if the edges will be returned with vertices.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeEdges")
private Boolean shouldIncludeEdges;

        /**
         * Controls if the edges will be returned with vertices.
         * @param shouldIncludeEdges the value to set
         * @return this builder
         **/
        

public Builder shouldIncludeEdges(Boolean shouldIncludeEdges) {
    this.shouldIncludeEdges = shouldIncludeEdges;
    return this;
}


        public ObjectLineageRequestDetails build() {
            ObjectLineageRequestDetails model = new ObjectLineageRequestDetails(this.anchorNode
                , this.maxDepth
                , this.level
                , this.direction
                , this.nodeFilters
                , this.pathFilters
                , this.shouldIncludeEdges);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectLineageRequestDetails model) {
                this.anchorNode(model.getAnchorNode());
    this.maxDepth(model.getMaxDepth());
    this.level(model.getLevel());
    this.direction(model.getDirection());
    this.nodeFilters(model.getNodeFilters());
    this.pathFilters(model.getPathFilters());
    this.shouldIncludeEdges(model.getShouldIncludeEdges());
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
     * Root entity node from with the lineage is to be fetched.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorNode")
    private final String anchorNode;

        /**
     * Root entity node from with the lineage is to be fetched.
* 
     * @return the value
     **/
    
    public String getAnchorNode() {
        return anchorNode;
    }


        /**
     * Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxDepth")
    private final Integer maxDepth;

        /**
     * Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
* 
     * @return the value
     **/
    
    public Integer getMaxDepth() {
        return maxDepth;
    }

    
        /**
     * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final LineageLevel level;

        /**
     * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* 
     * @return the value
     **/
    
    public LineageLevel getLevel() {
        return level;
    }

    
        /**
     * Direction of the lineage returned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final LineageDirection direction;

        /**
     * Direction of the lineage returned.
     * @return the value
     **/
    
    public LineageDirection getDirection() {
        return direction;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeFilters")
    private final NodeFilterObject nodeFilters;

    
    public NodeFilterObject getNodeFilters() {
        return nodeFilters;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("pathFilters")
    private final PathFilterObject pathFilters;

    
    public PathFilterObject getPathFilters() {
        return pathFilters;
    }


        /**
     * Controls if the edges will be returned with vertices.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeEdges")
    private final Boolean shouldIncludeEdges;

        /**
     * Controls if the edges will be returned with vertices.
     * @return the value
     **/
    
    public Boolean getShouldIncludeEdges() {
        return shouldIncludeEdges;
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
        sb.append("ObjectLineageRequestDetails(");
        sb.append("anchorNode=").append(String.valueOf(this.anchorNode));
        sb.append(", maxDepth=").append(String.valueOf(this.maxDepth));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", nodeFilters=").append(String.valueOf(this.nodeFilters));
        sb.append(", pathFilters=").append(String.valueOf(this.pathFilters));
        sb.append(", shouldIncludeEdges=").append(String.valueOf(this.shouldIncludeEdges));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectLineageRequestDetails)) {
            return false;
        }

        ObjectLineageRequestDetails other = (ObjectLineageRequestDetails) o;
        return java.util.Objects.equals(this.anchorNode, other.anchorNode) &&
            java.util.Objects.equals(this.maxDepth, other.maxDepth) &&
            java.util.Objects.equals(this.level, other.level) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.nodeFilters, other.nodeFilters) &&
            java.util.Objects.equals(this.pathFilters, other.pathFilters) &&
            java.util.Objects.equals(this.shouldIncludeEdges, other.shouldIncludeEdges);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.anchorNode == null ? 43 : this.anchorNode.hashCode());
        result = (result * PRIME) + (this.maxDepth == null ? 43 : this.maxDepth.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.nodeFilters == null ? 43 : this.nodeFilters.hashCode());
        result = (result * PRIME) + (this.pathFilters == null ? 43 : this.pathFilters.hashCode());
        result = (result * PRIME) + (this.shouldIncludeEdges == null ? 43 : this.shouldIncludeEdges.hashCode());
        return result;
    }


}
