// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lineage for a data entity.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=EntityLineage.Builder.class)

public final class EntityLineage  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodes", "links"})
    public EntityLineage(java.util.List<LineageObject> nodes, java.util.List<LineageRelationship> links) {
        super();
        this.nodes = nodes;
        this.links = links;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Set of links that are involved in the lineage.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("nodes")
private java.util.List<LineageObject> nodes;

        /**
         * Set of links that are involved in the lineage.
         * @param nodes the value to set
         * @return this builder
         **/
        

public Builder nodes(java.util.List<LineageObject> nodes) {
    this.nodes = nodes;
    return this;
}
            /**
     * Set of links between the objects in the 'objects' set.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("links")
private java.util.List<LineageRelationship> links;

        /**
         * Set of links between the objects in the 'objects' set.
         * @param links the value to set
         * @return this builder
         **/
        

public Builder links(java.util.List<LineageRelationship> links) {
    this.links = links;
    return this;
}


        public EntityLineage build() {
            EntityLineage model = new EntityLineage(this.nodes
                , this.links);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityLineage model) {
                this.nodes(model.getNodes());
    this.links(model.getLinks());
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
     * Set of links that are involved in the lineage.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<LineageObject> nodes;

        /**
     * Set of links that are involved in the lineage.
     * @return the value
     **/
    
    public java.util.List<LineageObject> getNodes() {
        return nodes;
    }


        /**
     * Set of links between the objects in the 'objects' set.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("links")
    private final java.util.List<LineageRelationship> links;

        /**
     * Set of links between the objects in the 'objects' set.
     * @return the value
     **/
    
    public java.util.List<LineageRelationship> getLinks() {
        return links;
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
        sb.append("EntityLineage(");
        sb.append("nodes=").append(String.valueOf(this.nodes));
        sb.append(", links=").append(String.valueOf(this.links));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityLineage)) {
            return false;
        }

        EntityLineage other = (EntityLineage) o;
        return java.util.Objects.equals(this.nodes, other.nodes) &&
            java.util.Objects.equals(this.links, other.links);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.links == null ? 43 : this.links.hashCode());
        return result;
    }


}
