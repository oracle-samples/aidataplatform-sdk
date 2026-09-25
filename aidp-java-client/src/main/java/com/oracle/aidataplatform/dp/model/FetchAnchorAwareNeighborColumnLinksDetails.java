// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for anchor-aware neighbor column links.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchAnchorAwareNeighborColumnLinksDetails.Builder.class)

public final class FetchAnchorAwareNeighborColumnLinksDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"anchorNodeId", "nodeId", "nodeDepth", "direction", "nodeColumns", "entityPathNodeIds"})
    public FetchAnchorAwareNeighborColumnLinksDetails(String anchorNodeId, String nodeId, Integer nodeDepth, ScopedLineageDirection direction, java.util.List<String> nodeColumns, java.util.List<String> entityPathNodeIds) {
        super();
        this.anchorNodeId = anchorNodeId;
        this.nodeId = nodeId;
        this.nodeDepth = nodeDepth;
        this.direction = direction;
        this.nodeColumns = nodeColumns;
        this.entityPathNodeIds = entityPathNodeIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the active anchor entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorNodeId")
private String anchorNodeId;

        /**
         * ID of the active anchor entity.
         * @param anchorNodeId the value to set
         * @return this builder
         **/
        

public Builder anchorNodeId(String anchorNodeId) {
    this.anchorNodeId = anchorNodeId;
    return this;
}
            /**
     * ID of the expanded non-anchor entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodeId")
private String nodeId;

        /**
         * ID of the expanded non-anchor entity.
         * @param nodeId the value to set
         * @return this builder
         **/
        

public Builder nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
}
            /**
     * Lineage depth of the node from the anchor, used to bound traversal.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodeDepth")
private Integer nodeDepth;

        /**
         * Lineage depth of the node from the anchor, used to bound traversal.
         * @param nodeDepth the value to set
         * @return this builder
         **/
        

public Builder nodeDepth(Integer nodeDepth) {
    this.nodeDepth = nodeDepth;
    return this;
}
            /**
     * Direction of the non-anchor entity relative to the anchor.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private ScopedLineageDirection direction;

        /**
         * Direction of the non-anchor entity relative to the anchor.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(ScopedLineageDirection direction) {
    this.direction = direction;
    return this;
}
            /**
     * Column IDs to include in both response link collections.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodeColumns")
private java.util.List<String> nodeColumns;

        /**
         * Column IDs to include in both response link collections.
         * @param nodeColumns the value to set
         * @return this builder
         **/
        

public Builder nodeColumns(java.util.List<String> nodeColumns) {
    this.nodeColumns = nodeColumns;
    return this;
}
            /**
     * Entity IDs constraining the route; must include nodeId and anchorNodeId.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entityPathNodeIds")
private java.util.List<String> entityPathNodeIds;

        /**
         * Entity IDs constraining the route; must include nodeId and anchorNodeId.
         * @param entityPathNodeIds the value to set
         * @return this builder
         **/
        

public Builder entityPathNodeIds(java.util.List<String> entityPathNodeIds) {
    this.entityPathNodeIds = entityPathNodeIds;
    return this;
}


        public FetchAnchorAwareNeighborColumnLinksDetails build() {
            FetchAnchorAwareNeighborColumnLinksDetails model = new FetchAnchorAwareNeighborColumnLinksDetails(this.anchorNodeId
                , this.nodeId
                , this.nodeDepth
                , this.direction
                , this.nodeColumns
                , this.entityPathNodeIds);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchAnchorAwareNeighborColumnLinksDetails model) {
                this.anchorNodeId(model.getAnchorNodeId());
    this.nodeId(model.getNodeId());
    this.nodeDepth(model.getNodeDepth());
    this.direction(model.getDirection());
    this.nodeColumns(model.getNodeColumns());
    this.entityPathNodeIds(model.getEntityPathNodeIds());
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
     * ID of the active anchor entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorNodeId")
    private final String anchorNodeId;

        /**
     * ID of the active anchor entity.
     * @return the value
     **/
    
    public String getAnchorNodeId() {
        return anchorNodeId;
    }


        /**
     * ID of the expanded non-anchor entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeId")
    private final String nodeId;

        /**
     * ID of the expanded non-anchor entity.
     * @return the value
     **/
    
    public String getNodeId() {
        return nodeId;
    }


        /**
     * Lineage depth of the node from the anchor, used to bound traversal.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeDepth")
    private final Integer nodeDepth;

        /**
     * Lineage depth of the node from the anchor, used to bound traversal.
     * @return the value
     **/
    
    public Integer getNodeDepth() {
        return nodeDepth;
    }

    
        /**
     * Direction of the non-anchor entity relative to the anchor.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final ScopedLineageDirection direction;

        /**
     * Direction of the non-anchor entity relative to the anchor.
     * @return the value
     **/
    
    public ScopedLineageDirection getDirection() {
        return direction;
    }


        /**
     * Column IDs to include in both response link collections.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodeColumns")
    private final java.util.List<String> nodeColumns;

        /**
     * Column IDs to include in both response link collections.
     * @return the value
     **/
    
    public java.util.List<String> getNodeColumns() {
        return nodeColumns;
    }


        /**
     * Entity IDs constraining the route; must include nodeId and anchorNodeId.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entityPathNodeIds")
    private final java.util.List<String> entityPathNodeIds;

        /**
     * Entity IDs constraining the route; must include nodeId and anchorNodeId.
     * @return the value
     **/
    
    public java.util.List<String> getEntityPathNodeIds() {
        return entityPathNodeIds;
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
        sb.append("FetchAnchorAwareNeighborColumnLinksDetails(");
        sb.append("anchorNodeId=").append(String.valueOf(this.anchorNodeId));
        sb.append(", nodeId=").append(String.valueOf(this.nodeId));
        sb.append(", nodeDepth=").append(String.valueOf(this.nodeDepth));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", nodeColumns=").append(String.valueOf(this.nodeColumns));
        sb.append(", entityPathNodeIds=").append(String.valueOf(this.entityPathNodeIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchAnchorAwareNeighborColumnLinksDetails)) {
            return false;
        }

        FetchAnchorAwareNeighborColumnLinksDetails other = (FetchAnchorAwareNeighborColumnLinksDetails) o;
        return java.util.Objects.equals(this.anchorNodeId, other.anchorNodeId) &&
            java.util.Objects.equals(this.nodeId, other.nodeId) &&
            java.util.Objects.equals(this.nodeDepth, other.nodeDepth) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.nodeColumns, other.nodeColumns) &&
            java.util.Objects.equals(this.entityPathNodeIds, other.entityPathNodeIds);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.anchorNodeId == null ? 43 : this.anchorNodeId.hashCode());
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result = (result * PRIME) + (this.nodeDepth == null ? 43 : this.nodeDepth.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.nodeColumns == null ? 43 : this.nodeColumns.hashCode());
        result = (result * PRIME) + (this.entityPathNodeIds == null ? 43 : this.entityPathNodeIds.hashCode());
        return result;
    }


}
