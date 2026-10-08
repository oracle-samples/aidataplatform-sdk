// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Graph node in a design-time ontology preview.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewNode.Builder.class)

public final class OntologyGraphPreviewNode  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "iri", "compactIri", "label", "properties", "kind", "expansion"})
    public OntologyGraphPreviewNode(String id, String iri, String compactIri, String label, java.util.List<OntologyGraphPreviewProperty> properties, String kind, OntologyGraphPreviewNodeExpansion expansion) {
        super();
        this.id = id;
        this.iri = iri;
        this.compactIri = compactIri;
        this.label = label;
        this.properties = properties;
        this.kind = kind;
        this.expansion = expansion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;



public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("iri")
private String iri;

        /**
         * Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.
         * @param iri the value to set
         * @return this builder
         **/
        

public Builder iri(String iri) {
    this.iri = iri;
    return this;
}
            /**
     * Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compactIri")
private String compactIri;

        /**
         * Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.
         * @param compactIri the value to set
         * @return this builder
         **/
        

public Builder compactIri(String compactIri) {
    this.compactIri = compactIri;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("label")
private String label;



public Builder label(String label) {
    this.label = label;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.List<OntologyGraphPreviewProperty> properties;



public Builder properties(java.util.List<OntologyGraphPreviewProperty> properties) {
    this.properties = properties;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;



public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("expansion")
private OntologyGraphPreviewNodeExpansion expansion;



public Builder expansion(OntologyGraphPreviewNodeExpansion expansion) {
    this.expansion = expansion;
    return this;
}


        public OntologyGraphPreviewNode build() {
            OntologyGraphPreviewNode model = new OntologyGraphPreviewNode(this.id
                , this.iri
                , this.compactIri
                , this.label
                , this.properties
                , this.kind
                , this.expansion);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewNode model) {
                this.id(model.getId());
    this.iri(model.getIri());
    this.compactIri(model.getCompactIri());
    this.label(model.getLabel());
    this.properties(model.getProperties());
    this.kind(model.getKind());
    this.expansion(model.getExpansion());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    
    public String getId() {
        return id;
    }


        /**
     * Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("iri")
    private final String iri;

        /**
     * Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.
     * @return the value
     **/
    
    public String getIri() {
        return iri;
    }


        /**
     * Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compactIri")
    private final String compactIri;

        /**
     * Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.
     * @return the value
     **/
    
    public String getCompactIri() {
        return compactIri;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    
    public String getLabel() {
        return label;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<OntologyGraphPreviewProperty> properties;

    
    public java.util.List<OntologyGraphPreviewProperty> getProperties() {
        return properties;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

    
    public String getKind() {
        return kind;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("expansion")
    private final OntologyGraphPreviewNodeExpansion expansion;

    
    public OntologyGraphPreviewNodeExpansion getExpansion() {
        return expansion;
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
        sb.append("OntologyGraphPreviewNode(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", compactIri=").append(String.valueOf(this.compactIri));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", expansion=").append(String.valueOf(this.expansion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewNode)) {
            return false;
        }

        OntologyGraphPreviewNode other = (OntologyGraphPreviewNode) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.compactIri, other.compactIri) &&
            java.util.Objects.equals(this.label, other.label) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.expansion, other.expansion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.iri == null ? 43 : this.iri.hashCode());
        result = (result * PRIME) + (this.compactIri == null ? 43 : this.compactIri.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.expansion == null ? 43 : this.expansion.hashCode());
        return result;
    }


}
