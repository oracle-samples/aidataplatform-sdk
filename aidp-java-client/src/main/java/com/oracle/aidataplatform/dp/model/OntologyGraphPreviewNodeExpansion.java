// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Hierarchy expansion metadata for a graph node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewNodeExpansion.Builder.class)

public final class OntologyGraphPreviewNodeExpansion  {
    @Deprecated
    @java.beans.ConstructorProperties({"childCount", "hasChildren", "hasMoreChildren", "loadedChildCount", "nextChildCursor", "isRoot"})
    public OntologyGraphPreviewNodeExpansion(Integer childCount, Boolean hasChildren, Boolean hasMoreChildren, Integer loadedChildCount, String nextChildCursor, Boolean isRoot) {
        super();
        this.childCount = childCount;
        this.hasChildren = hasChildren;
        this.hasMoreChildren = hasMoreChildren;
        this.loadedChildCount = loadedChildCount;
        this.nextChildCursor = nextChildCursor;
        this.isRoot = isRoot;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Total direct child relationship count for this node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("childCount")
private Integer childCount;

        /**
         * Total direct child relationship count for this node.
         * @param childCount the value to set
         * @return this builder
         **/
        

public Builder childCount(Integer childCount) {
    this.childCount = childCount;
    return this;
}
            /**
     * Whether this node has any direct child relationships.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hasChildren")
private Boolean hasChildren;

        /**
         * Whether this node has any direct child relationships.
         * @param hasChildren the value to set
         * @return this builder
         **/
        

public Builder hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
}
            /**
     * Whether more direct child relationships can be loaded for this node in paged hierarchy mode.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hasMoreChildren")
private Boolean hasMoreChildren;

        /**
         * Whether more direct child relationships can be loaded for this node in paged hierarchy mode.
         * @param hasMoreChildren the value to set
         * @return this builder
         **/
        

public Builder hasMoreChildren(Boolean hasMoreChildren) {
    this.hasMoreChildren = hasMoreChildren;
    return this;
}
            /**
     * Number of direct child relationships represented in the returned graph.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("loadedChildCount")
private Integer loadedChildCount;

        /**
         * Number of direct child relationships represented in the returned graph.
         * @param loadedChildCount the value to set
         * @return this builder
         **/
        

public Builder loadedChildCount(Integer loadedChildCount) {
    this.loadedChildCount = loadedChildCount;
    return this;
}
            /**
     * Cursor for loading the next direct child page for this node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nextChildCursor")
private String nextChildCursor;

        /**
         * Cursor for loading the next direct child page for this node.
         * @param nextChildCursor the value to set
         * @return this builder
         **/
        

public Builder nextChildCursor(String nextChildCursor) {
    this.nextChildCursor = nextChildCursor;
    return this;
}
            /**
     * Whether this node was returned as a root or parent page item.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isRoot")
private Boolean isRoot;

        /**
         * Whether this node was returned as a root or parent page item.
         * @param isRoot the value to set
         * @return this builder
         **/
        

public Builder isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
}


        public OntologyGraphPreviewNodeExpansion build() {
            OntologyGraphPreviewNodeExpansion model = new OntologyGraphPreviewNodeExpansion(this.childCount
                , this.hasChildren
                , this.hasMoreChildren
                , this.loadedChildCount
                , this.nextChildCursor
                , this.isRoot);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewNodeExpansion model) {
                this.childCount(model.getChildCount());
    this.hasChildren(model.getHasChildren());
    this.hasMoreChildren(model.getHasMoreChildren());
    this.loadedChildCount(model.getLoadedChildCount());
    this.nextChildCursor(model.getNextChildCursor());
    this.isRoot(model.getIsRoot());
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
     * Total direct child relationship count for this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("childCount")
    private final Integer childCount;

        /**
     * Total direct child relationship count for this node.
     * @return the value
     **/
    
    public Integer getChildCount() {
        return childCount;
    }


        /**
     * Whether this node has any direct child relationships.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hasChildren")
    private final Boolean hasChildren;

        /**
     * Whether this node has any direct child relationships.
     * @return the value
     **/
    
    public Boolean getHasChildren() {
        return hasChildren;
    }


        /**
     * Whether more direct child relationships can be loaded for this node in paged hierarchy mode.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hasMoreChildren")
    private final Boolean hasMoreChildren;

        /**
     * Whether more direct child relationships can be loaded for this node in paged hierarchy mode.
     * @return the value
     **/
    
    public Boolean getHasMoreChildren() {
        return hasMoreChildren;
    }


        /**
     * Number of direct child relationships represented in the returned graph.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("loadedChildCount")
    private final Integer loadedChildCount;

        /**
     * Number of direct child relationships represented in the returned graph.
     * @return the value
     **/
    
    public Integer getLoadedChildCount() {
        return loadedChildCount;
    }


        /**
     * Cursor for loading the next direct child page for this node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nextChildCursor")
    private final String nextChildCursor;

        /**
     * Cursor for loading the next direct child page for this node.
     * @return the value
     **/
    
    public String getNextChildCursor() {
        return nextChildCursor;
    }


        /**
     * Whether this node was returned as a root or parent page item.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRoot")
    private final Boolean isRoot;

        /**
     * Whether this node was returned as a root or parent page item.
     * @return the value
     **/
    
    public Boolean getIsRoot() {
        return isRoot;
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
        sb.append("OntologyGraphPreviewNodeExpansion(");
        sb.append("childCount=").append(String.valueOf(this.childCount));
        sb.append(", hasChildren=").append(String.valueOf(this.hasChildren));
        sb.append(", hasMoreChildren=").append(String.valueOf(this.hasMoreChildren));
        sb.append(", loadedChildCount=").append(String.valueOf(this.loadedChildCount));
        sb.append(", nextChildCursor=").append(String.valueOf(this.nextChildCursor));
        sb.append(", isRoot=").append(String.valueOf(this.isRoot));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewNodeExpansion)) {
            return false;
        }

        OntologyGraphPreviewNodeExpansion other = (OntologyGraphPreviewNodeExpansion) o;
        return java.util.Objects.equals(this.childCount, other.childCount) &&
            java.util.Objects.equals(this.hasChildren, other.hasChildren) &&
            java.util.Objects.equals(this.hasMoreChildren, other.hasMoreChildren) &&
            java.util.Objects.equals(this.loadedChildCount, other.loadedChildCount) &&
            java.util.Objects.equals(this.nextChildCursor, other.nextChildCursor) &&
            java.util.Objects.equals(this.isRoot, other.isRoot);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.childCount == null ? 43 : this.childCount.hashCode());
        result = (result * PRIME) + (this.hasChildren == null ? 43 : this.hasChildren.hashCode());
        result = (result * PRIME) + (this.hasMoreChildren == null ? 43 : this.hasMoreChildren.hashCode());
        result = (result * PRIME) + (this.loadedChildCount == null ? 43 : this.loadedChildCount.hashCode());
        result = (result * PRIME) + (this.nextChildCursor == null ? 43 : this.nextChildCursor.hashCode());
        result = (result * PRIME) + (this.isRoot == null ? 43 : this.isRoot.hashCode());
        return result;
    }


}
