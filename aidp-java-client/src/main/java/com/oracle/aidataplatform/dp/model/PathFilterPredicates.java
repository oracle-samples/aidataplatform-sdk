// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * List of conditions
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PathFilterPredicates.Builder.class)

public final class PathFilterPredicates  {
    @Deprecated
    @java.beans.ConstructorProperties({"passThroughNode", "anchorNodeColumnsIn", "parentIdIn"})
    public PathFilterPredicates(PassThroughNodeFilterPredicate passThroughNode, java.util.List<String> anchorNodeColumnsIn, java.util.List<String> parentIdIn) {
        super();
        this.passThroughNode = passThroughNode;
        this.anchorNodeColumnsIn = anchorNodeColumnsIn;
        this.parentIdIn = parentIdIn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("passThroughNode")
private PassThroughNodeFilterPredicate passThroughNode;



public Builder passThroughNode(PassThroughNodeFilterPredicate passThroughNode) {
    this.passThroughNode = passThroughNode;
    return this;
}
            /**
     * Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorNodeColumnsIn")
private java.util.List<String> anchorNodeColumnsIn;

        /**
         * Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
         * @param anchorNodeColumnsIn the value to set
         * @return this builder
         **/
        

public Builder anchorNodeColumnsIn(java.util.List<String> anchorNodeColumnsIn) {
    this.anchorNodeColumnsIn = anchorNodeColumnsIn;
    return this;
}
            /**
     * Includes only those lineage paths in which each node's parent ID is present in the specified list.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parentIdIn")
private java.util.List<String> parentIdIn;

        /**
         * Includes only those lineage paths in which each node's parent ID is present in the specified list.
         * @param parentIdIn the value to set
         * @return this builder
         **/
        

public Builder parentIdIn(java.util.List<String> parentIdIn) {
    this.parentIdIn = parentIdIn;
    return this;
}


        public PathFilterPredicates build() {
            PathFilterPredicates model = new PathFilterPredicates(this.passThroughNode
                , this.anchorNodeColumnsIn
                , this.parentIdIn);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathFilterPredicates model) {
                this.passThroughNode(model.getPassThroughNode());
    this.anchorNodeColumnsIn(model.getAnchorNodeColumnsIn());
    this.parentIdIn(model.getParentIdIn());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("passThroughNode")
    private final PassThroughNodeFilterPredicate passThroughNode;

    
    public PassThroughNodeFilterPredicate getPassThroughNode() {
        return passThroughNode;
    }


        /**
     * Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorNodeColumnsIn")
    private final java.util.List<String> anchorNodeColumnsIn;

        /**
     * Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
     * @return the value
     **/
    
    public java.util.List<String> getAnchorNodeColumnsIn() {
        return anchorNodeColumnsIn;
    }


        /**
     * Includes only those lineage paths in which each node's parent ID is present in the specified list.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parentIdIn")
    private final java.util.List<String> parentIdIn;

        /**
     * Includes only those lineage paths in which each node's parent ID is present in the specified list.
     * @return the value
     **/
    
    public java.util.List<String> getParentIdIn() {
        return parentIdIn;
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
        sb.append("PathFilterPredicates(");
        sb.append("passThroughNode=").append(String.valueOf(this.passThroughNode));
        sb.append(", anchorNodeColumnsIn=").append(String.valueOf(this.anchorNodeColumnsIn));
        sb.append(", parentIdIn=").append(String.valueOf(this.parentIdIn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathFilterPredicates)) {
            return false;
        }

        PathFilterPredicates other = (PathFilterPredicates) o;
        return java.util.Objects.equals(this.passThroughNode, other.passThroughNode) &&
            java.util.Objects.equals(this.anchorNodeColumnsIn, other.anchorNodeColumnsIn) &&
            java.util.Objects.equals(this.parentIdIn, other.parentIdIn);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.passThroughNode == null ? 43 : this.passThroughNode.hashCode());
        result = (result * PRIME) + (this.anchorNodeColumnsIn == null ? 43 : this.anchorNodeColumnsIn.hashCode());
        result = (result * PRIME) + (this.parentIdIn == null ? 43 : this.parentIdIn.hashCode());
        return result;
    }


}
