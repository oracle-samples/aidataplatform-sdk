// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Nodes and edges returned by graph exploration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphExpansion.Builder.class)

public final class OntologyGraphExpansion  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodes", "edges", "truncated"})
    public OntologyGraphExpansion(java.util.List<OntologyGraphNode> nodes, java.util.List<OntologyGraphEdge> edges, Boolean truncated) {
        super();
        this.nodes = nodes;
        this.edges = edges;
        this.truncated = truncated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("nodes")
private java.util.List<OntologyGraphNode> nodes;



public Builder nodes(java.util.List<OntologyGraphNode> nodes) {
    this.nodes = nodes;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("edges")
private java.util.List<OntologyGraphEdge> edges;



public Builder edges(java.util.List<OntologyGraphEdge> edges) {
    this.edges = edges;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("truncated")
private Boolean truncated;



public Builder truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
}


        public OntologyGraphExpansion build() {
            OntologyGraphExpansion model = new OntologyGraphExpansion(this.nodes
                , this.edges
                , this.truncated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphExpansion model) {
                this.nodes(model.getNodes());
    this.edges(model.getEdges());
    this.truncated(model.getTruncated());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<OntologyGraphNode> nodes;

    
    public java.util.List<OntologyGraphNode> getNodes() {
        return nodes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("edges")
    private final java.util.List<OntologyGraphEdge> edges;

    
    public java.util.List<OntologyGraphEdge> getEdges() {
        return edges;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("truncated")
    private final Boolean truncated;

    
    public Boolean getTruncated() {
        return truncated;
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
        sb.append("OntologyGraphExpansion(");
        sb.append("nodes=").append(String.valueOf(this.nodes));
        sb.append(", edges=").append(String.valueOf(this.edges));
        sb.append(", truncated=").append(String.valueOf(this.truncated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphExpansion)) {
            return false;
        }

        OntologyGraphExpansion other = (OntologyGraphExpansion) o;
        return java.util.Objects.equals(this.nodes, other.nodes) &&
            java.util.Objects.equals(this.edges, other.edges) &&
            java.util.Objects.equals(this.truncated, other.truncated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.edges == null ? 43 : this.edges.hashCode());
        result = (result * PRIME) + (this.truncated == null ? 43 : this.truncated.hashCode());
        return result;
    }


}
