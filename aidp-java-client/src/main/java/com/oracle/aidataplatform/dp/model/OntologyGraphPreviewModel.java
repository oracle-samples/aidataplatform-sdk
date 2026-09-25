// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Graph model rendered by the Ontology Manager UI.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewModel.Builder.class)

public final class OntologyGraphPreviewModel  {
    @Deprecated
    @java.beans.ConstructorProperties({"nodes", "edges"})
    public OntologyGraphPreviewModel(java.util.List<OntologyGraphPreviewNode> nodes, java.util.List<OntologyGraphPreviewEdge> edges) {
        super();
        this.nodes = nodes;
        this.edges = edges;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("nodes")
private java.util.List<OntologyGraphPreviewNode> nodes;



public Builder nodes(java.util.List<OntologyGraphPreviewNode> nodes) {
    this.nodes = nodes;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("edges")
private java.util.List<OntologyGraphPreviewEdge> edges;



public Builder edges(java.util.List<OntologyGraphPreviewEdge> edges) {
    this.edges = edges;
    return this;
}


        public OntologyGraphPreviewModel build() {
            OntologyGraphPreviewModel model = new OntologyGraphPreviewModel(this.nodes
                , this.edges);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewModel model) {
                this.nodes(model.getNodes());
    this.edges(model.getEdges());
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
    private final java.util.List<OntologyGraphPreviewNode> nodes;

    
    public java.util.List<OntologyGraphPreviewNode> getNodes() {
        return nodes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("edges")
    private final java.util.List<OntologyGraphPreviewEdge> edges;

    
    public java.util.List<OntologyGraphPreviewEdge> getEdges() {
        return edges;
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
        sb.append("OntologyGraphPreviewModel(");
        sb.append("nodes=").append(String.valueOf(this.nodes));
        sb.append(", edges=").append(String.valueOf(this.edges));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewModel)) {
            return false;
        }

        OntologyGraphPreviewModel other = (OntologyGraphPreviewModel) o;
        return java.util.Objects.equals(this.nodes, other.nodes) &&
            java.util.Objects.equals(this.edges, other.edges);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.edges == null ? 43 : this.edges.hashCode());
        return result;
    }


}
