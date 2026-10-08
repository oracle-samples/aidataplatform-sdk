// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Neighbor links and anchor-column associations for supplied columns.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AnchorAwareNeighborColumnLinks.Builder.class)

public final class AnchorAwareNeighborColumnLinks  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodes", "neighborLinks", "anchorColumnLinks"})
    public AnchorAwareNeighborColumnLinks(java.util.List<LineageObject> nodes, java.util.List<LineageRelationship> neighborLinks, java.util.List<AnchorColumnLink> anchorColumnLinks) {
        super();
        this.nodes = nodes;
        this.neighborLinks = neighborLinks;
        this.anchorColumnLinks = anchorColumnLinks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Nodes referenced by neighborLinks.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodes")
private java.util.List<LineageObject> nodes;

        /**
         * Nodes referenced by neighborLinks.
         * @param nodes the value to set
         * @return this builder
         **/
        

public Builder nodes(java.util.List<LineageObject> nodes) {
    this.nodes = nodes;
    return this;
}
            /**
     * Immediate links adjacent to supplied columns, including proven toward-anchor links.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("neighborLinks")
private java.util.List<LineageRelationship> neighborLinks;

        /**
         * Immediate links adjacent to supplied columns, including proven toward-anchor links.
         * @param neighborLinks the value to set
         * @return this builder
         **/
        

public Builder neighborLinks(java.util.List<LineageRelationship> neighborLinks) {
    this.neighborLinks = neighborLinks;
    return this;
}
            /**
     * Derived supplied-column to anchor-column associations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("anchorColumnLinks")
private java.util.List<AnchorColumnLink> anchorColumnLinks;

        /**
         * Derived supplied-column to anchor-column associations.
         * @param anchorColumnLinks the value to set
         * @return this builder
         **/
        

public Builder anchorColumnLinks(java.util.List<AnchorColumnLink> anchorColumnLinks) {
    this.anchorColumnLinks = anchorColumnLinks;
    return this;
}


        public AnchorAwareNeighborColumnLinks build() {
            AnchorAwareNeighborColumnLinks model = new AnchorAwareNeighborColumnLinks(this.nodes
                , this.neighborLinks
                , this.anchorColumnLinks);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnchorAwareNeighborColumnLinks model) {
                this.nodes(model.getNodes());
    this.neighborLinks(model.getNeighborLinks());
    this.anchorColumnLinks(model.getAnchorColumnLinks());
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
     * Nodes referenced by neighborLinks.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<LineageObject> nodes;

        /**
     * Nodes referenced by neighborLinks.
     * @return the value
     **/
    
    public java.util.List<LineageObject> getNodes() {
        return nodes;
    }


        /**
     * Immediate links adjacent to supplied columns, including proven toward-anchor links.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("neighborLinks")
    private final java.util.List<LineageRelationship> neighborLinks;

        /**
     * Immediate links adjacent to supplied columns, including proven toward-anchor links.
     * @return the value
     **/
    
    public java.util.List<LineageRelationship> getNeighborLinks() {
        return neighborLinks;
    }


        /**
     * Derived supplied-column to anchor-column associations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("anchorColumnLinks")
    private final java.util.List<AnchorColumnLink> anchorColumnLinks;

        /**
     * Derived supplied-column to anchor-column associations.
     * @return the value
     **/
    
    public java.util.List<AnchorColumnLink> getAnchorColumnLinks() {
        return anchorColumnLinks;
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
        sb.append("AnchorAwareNeighborColumnLinks(");
        sb.append("nodes=").append(String.valueOf(this.nodes));
        sb.append(", neighborLinks=").append(String.valueOf(this.neighborLinks));
        sb.append(", anchorColumnLinks=").append(String.valueOf(this.anchorColumnLinks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnchorAwareNeighborColumnLinks)) {
            return false;
        }

        AnchorAwareNeighborColumnLinks other = (AnchorAwareNeighborColumnLinks) o;
        return java.util.Objects.equals(this.nodes, other.nodes) &&
            java.util.Objects.equals(this.neighborLinks, other.neighborLinks) &&
            java.util.Objects.equals(this.anchorColumnLinks, other.anchorColumnLinks);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.neighborLinks == null ? 43 : this.neighborLinks.hashCode());
        result = (result * PRIME) + (this.anchorColumnLinks == null ? 43 : this.anchorColumnLinks.hashCode());
        return result;
    }


}
