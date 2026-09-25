// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request for refactoring a design-time ontology entity IRI across project Turtle files.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityRefactorDetails.Builder.class)

public final class OntologyEntityRefactorDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"entityType", "iri", "newIri", "prefix", "newPrefix"})
    public OntologyEntityRefactorDetails(String entityType, String iri, String newIri, String prefix, String newPrefix) {
        super();
        this.entityType = entityType;
        this.iri = iri;
        this.newIri = newIri;
        this.prefix = prefix;
        this.newPrefix = newPrefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entityType")
private String entityType;

        /**
         * Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.
         * @param entityType the value to set
         * @return this builder
         **/
        

public Builder entityType(String entityType) {
    this.entityType = entityType;
    return this;
}
            /**
     * Current ontology entity IRI.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("iri")
private String iri;

        /**
         * Current ontology entity IRI.
         * @param iri the value to set
         * @return this builder
         **/
        

public Builder iri(String iri) {
    this.iri = iri;
    return this;
}
            /**
     * Replacement ontology entity IRI.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("newIri")
private String newIri;

        /**
         * Replacement ontology entity IRI.
         * @param newIri the value to set
         * @return this builder
         **/
        

public Builder newIri(String newIri) {
    this.newIri = newIri;
    return this;
}
            /**
     * Optional current ontology namespace prefix to replace. Not required for class refactors.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("prefix")
private String prefix;

        /**
         * Optional current ontology namespace prefix to replace. Not required for class refactors.
         * @param prefix the value to set
         * @return this builder
         **/
        

public Builder prefix(String prefix) {
    this.prefix = prefix;
    return this;
}
            /**
     * Optional replacement ontology namespace prefix. Not required for class refactors.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("newPrefix")
private String newPrefix;

        /**
         * Optional replacement ontology namespace prefix. Not required for class refactors.
         * @param newPrefix the value to set
         * @return this builder
         **/
        

public Builder newPrefix(String newPrefix) {
    this.newPrefix = newPrefix;
    return this;
}


        public OntologyEntityRefactorDetails build() {
            OntologyEntityRefactorDetails model = new OntologyEntityRefactorDetails(this.entityType
                , this.iri
                , this.newIri
                , this.prefix
                , this.newPrefix);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityRefactorDetails model) {
                this.entityType(model.getEntityType());
    this.iri(model.getIri());
    this.newIri(model.getNewIri());
    this.prefix(model.getPrefix());
    this.newPrefix(model.getNewPrefix());
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
     * Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

        /**
     * Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.
     * @return the value
     **/
    
    public String getEntityType() {
        return entityType;
    }


        /**
     * Current ontology entity IRI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("iri")
    private final String iri;

        /**
     * Current ontology entity IRI.
     * @return the value
     **/
    
    public String getIri() {
        return iri;
    }


        /**
     * Replacement ontology entity IRI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("newIri")
    private final String newIri;

        /**
     * Replacement ontology entity IRI.
     * @return the value
     **/
    
    public String getNewIri() {
        return newIri;
    }


        /**
     * Optional current ontology namespace prefix to replace. Not required for class refactors.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

        /**
     * Optional current ontology namespace prefix to replace. Not required for class refactors.
     * @return the value
     **/
    
    public String getPrefix() {
        return prefix;
    }


        /**
     * Optional replacement ontology namespace prefix. Not required for class refactors.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("newPrefix")
    private final String newPrefix;

        /**
     * Optional replacement ontology namespace prefix. Not required for class refactors.
     * @return the value
     **/
    
    public String getNewPrefix() {
        return newPrefix;
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
        sb.append("OntologyEntityRefactorDetails(");
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", newIri=").append(String.valueOf(this.newIri));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", newPrefix=").append(String.valueOf(this.newPrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityRefactorDetails)) {
            return false;
        }

        OntologyEntityRefactorDetails other = (OntologyEntityRefactorDetails) o;
        return java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.newIri, other.newIri) &&
            java.util.Objects.equals(this.prefix, other.prefix) &&
            java.util.Objects.equals(this.newPrefix, other.newPrefix);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.iri == null ? 43 : this.iri.hashCode());
        result = (result * PRIME) + (this.newIri == null ? 43 : this.newIri.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.newPrefix == null ? 43 : this.newPrefix.hashCode());
        return result;
    }


}
