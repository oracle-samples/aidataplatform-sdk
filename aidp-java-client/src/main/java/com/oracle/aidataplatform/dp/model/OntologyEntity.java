// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Flat ontology entity JSON for design-time ontology editing.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntity.Builder.class)

public final class OntologyEntity  {
    @Deprecated
    @java.beans.ConstructorProperties({"entityType", "compactIri", "iri", "path", "label", "comment", "description", "prefLabel", "definition", "scopeNotes", "altLabels", "synonyms", "versionInfo", "defaultPrefix", "prefix", "imports", "subClassOf", "equivalentClasses", "disjointWith", "relatedClasses", "entityRole", "grainKey", "measureGroup", "biSubjectArea", "biSubjectAreaTable", "propertyType", "dataType", "mappedColumn", "domain", "range", "cardinality", "subPropertyOf", "inverseOf", "owlCharacteristics", "properties", "constraints", "binding", "relationships", "joinBackedMapping"})
    public OntologyEntity(String entityType, String compactIri, String iri, String path, String label, String comment, String description, String prefLabel, String definition, String scopeNotes, java.util.List<String> altLabels, java.util.List<String> synonyms, String versionInfo, String defaultPrefix, java.util.Map<String, String> prefix, java.util.List<String> imports, java.util.List<String> subClassOf, java.util.List<String> equivalentClasses, java.util.List<String> disjointWith, java.util.List<String> relatedClasses, String entityRole, java.util.List<String> grainKey, String measureGroup, String biSubjectArea, String biSubjectAreaTable, String propertyType, String dataType, String mappedColumn, String domain, String range, OntologyEntityCardinality cardinality, java.util.List<String> subPropertyOf, String inverseOf, java.util.List<String> owlCharacteristics, java.util.List<Object> properties, java.util.List<Object> constraints, java.util.List<Object> binding, java.util.List<Object> relationships, java.util.List<Object> joinBackedMapping) {
        super();
        this.entityType = entityType;
        this.compactIri = compactIri;
        this.iri = iri;
        this.path = path;
        this.label = label;
        this.comment = comment;
        this.description = description;
        this.prefLabel = prefLabel;
        this.definition = definition;
        this.scopeNotes = scopeNotes;
        this.altLabels = altLabels;
        this.synonyms = synonyms;
        this.versionInfo = versionInfo;
        this.defaultPrefix = defaultPrefix;
        this.prefix = prefix;
        this.imports = imports;
        this.subClassOf = subClassOf;
        this.equivalentClasses = equivalentClasses;
        this.disjointWith = disjointWith;
        this.relatedClasses = relatedClasses;
        this.entityRole = entityRole;
        this.grainKey = grainKey;
        this.measureGroup = measureGroup;
        this.biSubjectArea = biSubjectArea;
        this.biSubjectAreaTable = biSubjectAreaTable;
        this.propertyType = propertyType;
        this.dataType = dataType;
        this.mappedColumn = mappedColumn;
        this.domain = domain;
        this.range = range;
        this.cardinality = cardinality;
        this.subPropertyOf = subPropertyOf;
        this.inverseOf = inverseOf;
        this.owlCharacteristics = owlCharacteristics;
        this.properties = properties;
        this.constraints = constraints;
        this.binding = binding;
        this.relationships = relationships;
        this.joinBackedMapping = joinBackedMapping;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entityType")
private String entityType;

        /**
         * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
         * @param entityType the value to set
         * @return this builder
         **/
        

public Builder entityType(String entityType) {
    this.entityType = entityType;
    return this;
}
            /**
     * Compact IRI for the entity, such as ex:Product.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compactIri")
private String compactIri;

        /**
         * Compact IRI for the entity, such as ex:Product.
         * @param compactIri the value to set
         * @return this builder
         **/
        

public Builder compactIri(String compactIri) {
    this.compactIri = compactIri;
    return this;
}
            /**
     * Full IRI for the entity, such as https://example.com/ontology/Product.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("iri")
private String iri;

        /**
         * Full IRI for the entity, such as https://example.com/ontology/Product.
         * @param iri the value to set
         * @return this builder
         **/
        

public Builder iri(String iri) {
    this.iri = iri;
    return this;
}
            /**
     * Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Human-readable entity label.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("label")
private String label;

        /**
         * Human-readable entity label.
         * @param label the value to set
         * @return this builder
         **/
        

public Builder label(String label) {
    this.label = label;
    return this;
}
            /**
     * Human-readable entity comment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("comment")
private String comment;

        /**
         * Human-readable entity comment.
         * @param comment the value to set
         * @return this builder
         **/
        

public Builder comment(String comment) {
    this.comment = comment;
    return this;
}
            /**
     * Human-readable entity description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Human-readable entity description.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Preferred SKOS label for the entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("prefLabel")
private String prefLabel;

        /**
         * Preferred SKOS label for the entity.
         * @param prefLabel the value to set
         * @return this builder
         **/
        

public Builder prefLabel(String prefLabel) {
    this.prefLabel = prefLabel;
    return this;
}
            /**
     * SKOS definition text for the entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("definition")
private String definition;

        /**
         * SKOS definition text for the entity.
         * @param definition the value to set
         * @return this builder
         **/
        

public Builder definition(String definition) {
    this.definition = definition;
    return this;
}
            /**
     * SKOS scope note text for the entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("scopeNotes")
private String scopeNotes;

        /**
         * SKOS scope note text for the entity.
         * @param scopeNotes the value to set
         * @return this builder
         **/
        

public Builder scopeNotes(String scopeNotes) {
    this.scopeNotes = scopeNotes;
    return this;
}
            /**
     * Alternative SKOS labels for the entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("altLabels")
private java.util.List<String> altLabels;

        /**
         * Alternative SKOS labels for the entity.
         * @param altLabels the value to set
         * @return this builder
         **/
        

public Builder altLabels(java.util.List<String> altLabels) {
    this.altLabels = altLabels;
    return this;
}
            /**
     * Synonym labels for the entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("synonyms")
private java.util.List<String> synonyms;

        /**
         * Synonym labels for the entity.
         * @param synonyms the value to set
         * @return this builder
         **/
        

public Builder synonyms(java.util.List<String> synonyms) {
    this.synonyms = synonyms;
    return this;
}
            /**
     * OWL version information for ontology entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("versionInfo")
private String versionInfo;

        /**
         * OWL version information for ontology entities.
         * @param versionInfo the value to set
         * @return this builder
         **/
        

public Builder versionInfo(String versionInfo) {
    this.versionInfo = versionInfo;
    return this;
}
            /**
     * Default prefix used to identify entities that belong to this ontology.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("defaultPrefix")
private String defaultPrefix;

        /**
         * Default prefix used to identify entities that belong to this ontology.
         * @param defaultPrefix the value to set
         * @return this builder
         **/
        

public Builder defaultPrefix(String defaultPrefix) {
    this.defaultPrefix = defaultPrefix;
    return this;
}
            /**
     * Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("prefix")
private java.util.Map<String, String> prefix;

        /**
         * Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.
         * @param prefix the value to set
         * @return this builder
         **/
        

public Builder prefix(java.util.Map<String, String> prefix) {
    this.prefix = prefix;
    return this;
}
            /**
     * OWL ontology import IRIs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("imports")
private java.util.List<String> imports;

        /**
         * OWL ontology import IRIs.
         * @param imports the value to set
         * @return this builder
         **/
        

public Builder imports(java.util.List<String> imports) {
    this.imports = imports;
    return this;
}
            /**
     * Parent class IRIs or prefixed names for class entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("subClassOf")
private java.util.List<String> subClassOf;

        /**
         * Parent class IRIs or prefixed names for class entities.
         * @param subClassOf the value to set
         * @return this builder
         **/
        

public Builder subClassOf(java.util.List<String> subClassOf) {
    this.subClassOf = subClassOf;
    return this;
}
            /**
     * Equivalent class IRIs or prefixed names for class entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("equivalentClasses")
private java.util.List<String> equivalentClasses;

        /**
         * Equivalent class IRIs or prefixed names for class entities.
         * @param equivalentClasses the value to set
         * @return this builder
         **/
        

public Builder equivalentClasses(java.util.List<String> equivalentClasses) {
    this.equivalentClasses = equivalentClasses;
    return this;
}
            /**
     * Disjoint class IRIs or prefixed names for class entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("disjointWith")
private java.util.List<String> disjointWith;

        /**
         * Disjoint class IRIs or prefixed names for class entities.
         * @param disjointWith the value to set
         * @return this builder
         **/
        

public Builder disjointWith(java.util.List<String> disjointWith) {
    this.disjointWith = disjointWith;
    return this;
}
            /**
     * Related class IRIs or prefixed names for class entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("relatedClasses")
private java.util.List<String> relatedClasses;

        /**
         * Related class IRIs or prefixed names for class entities.
         * @param relatedClasses the value to set
         * @return this builder
         **/
        

public Builder relatedClasses(java.util.List<String> relatedClasses) {
    this.relatedClasses = relatedClasses;
    return this;
}
            /**
     * Role of the class in the business or BI model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entityRole")
private String entityRole;

        /**
         * Role of the class in the business or BI model.
         * @param entityRole the value to set
         * @return this builder
         **/
        

public Builder entityRole(String entityRole) {
    this.entityRole = entityRole;
    return this;
}
            /**
     * Property names or IRIs defining analytical grain.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("grainKey")
private java.util.List<String> grainKey;

        /**
         * Property names or IRIs defining analytical grain.
         * @param grainKey the value to set
         * @return this builder
         **/
        

public Builder grainKey(java.util.List<String> grainKey) {
    this.grainKey = grainKey;
    return this;
}
            /**
     * BI measure group association.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("measureGroup")
private String measureGroup;

        /**
         * BI measure group association.
         * @param measureGroup the value to set
         * @return this builder
         **/
        

public Builder measureGroup(String measureGroup) {
    this.measureGroup = measureGroup;
    return this;
}
            /**
     * Source BI subject area.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("biSubjectArea")
private String biSubjectArea;

        /**
         * Source BI subject area.
         * @param biSubjectArea the value to set
         * @return this builder
         **/
        

public Builder biSubjectArea(String biSubjectArea) {
    this.biSubjectArea = biSubjectArea;
    return this;
}
            /**
     * Source BI subject area table mapping.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("biSubjectAreaTable")
private String biSubjectAreaTable;

        /**
         * Source BI subject area table mapping.
         * @param biSubjectAreaTable the value to set
         * @return this builder
         **/
        

public Builder biSubjectAreaTable(String biSubjectAreaTable) {
    this.biSubjectAreaTable = biSubjectAreaTable;
    return this;
}
            /**
     * Property kind for OwlProperty, such as datatype or object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("propertyType")
private String propertyType;

        /**
         * Property kind for OwlProperty, such as datatype or object.
         * @param propertyType the value to set
         * @return this builder
         **/
        

public Builder propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
}
            /**
     * Expected datatype for an OwlProperty or class property object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dataType")
private String dataType;

        /**
         * Expected datatype for an OwlProperty or class property object.
         * @param dataType the value to set
         * @return this builder
         **/
        

public Builder dataType(String dataType) {
    this.dataType = dataType;
    return this;
}
            /**
     * Physical source column mapped to the property.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("mappedColumn")
private String mappedColumn;

        /**
         * Physical source column mapped to the property.
         * @param mappedColumn the value to set
         * @return this builder
         **/
        

public Builder mappedColumn(String mappedColumn) {
    this.mappedColumn = mappedColumn;
    return this;
}
            /**
     * Domain class IRIs or prefixed names for relationship entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("domain")
private String domain;

        /**
         * Domain class IRIs or prefixed names for relationship entities.
         * @param domain the value to set
         * @return this builder
         **/
        

public Builder domain(String domain) {
    this.domain = domain;
    return this;
}
            /**
     * Range class IRIs or prefixed names for relationship entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("range")
private String range;

        /**
         * Range class IRIs or prefixed names for relationship entities.
         * @param range the value to set
         * @return this builder
         **/
        

public Builder range(String range) {
    this.range = range;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("cardinality")
private OntologyEntityCardinality cardinality;



public Builder cardinality(OntologyEntityCardinality cardinality) {
    this.cardinality = cardinality;
    return this;
}
            /**
     * Parent property IRIs or prefixed names for relationship entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("subPropertyOf")
private java.util.List<String> subPropertyOf;

        /**
         * Parent property IRIs or prefixed names for relationship entities.
         * @param subPropertyOf the value to set
         * @return this builder
         **/
        

public Builder subPropertyOf(java.util.List<String> subPropertyOf) {
    this.subPropertyOf = subPropertyOf;
    return this;
}
            /**
     * Inverse property IRIs or prefixed names for relationship entities.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("inverseOf")
private String inverseOf;

        /**
         * Inverse property IRIs or prefixed names for relationship entities.
         * @param inverseOf the value to set
         * @return this builder
         **/
        

public Builder inverseOf(String inverseOf) {
    this.inverseOf = inverseOf;
    return this;
}
            /**
     * OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("owlCharacteristics")
private java.util.List<String> owlCharacteristics;

        /**
         * OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.
         * @param owlCharacteristics the value to set
         * @return this builder
         **/
        

public Builder owlCharacteristics(java.util.List<String> owlCharacteristics) {
    this.owlCharacteristics = owlCharacteristics;
    return this;
}
            /**
     * Property definitions associated with the class.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.List<Object> properties;

        /**
         * Property definitions associated with the class.
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.List<Object> properties) {
    this.properties = properties;
    return this;
}
            /**
     * Validation or governance constraints for the class.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("constraints")
private java.util.List<Object> constraints;

        /**
         * Validation or governance constraints for the class.
         * @param constraints the value to set
         * @return this builder
         **/
        

public Builder constraints(java.util.List<Object> constraints) {
    this.constraints = constraints;
    return this;
}
            /**
     * R2RML or RML bindings for the class.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("binding")
private java.util.List<Object> binding;

        /**
         * R2RML or RML bindings for the class.
         * @param binding the value to set
         * @return this builder
         **/
        

public Builder binding(java.util.List<Object> binding) {
    this.binding = binding;
    return this;
}
            /**
     * Relationship definitions associated with the class.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("relationships")
private java.util.List<Object> relationships;

        /**
         * Relationship definitions associated with the class.
         * @param relationships the value to set
         * @return this builder
         **/
        

public Builder relationships(java.util.List<Object> relationships) {
    this.relationships = relationships;
    return this;
}
            /**
     * Join-backed mapping entries for a relationship.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("joinBackedMapping")
private java.util.List<Object> joinBackedMapping;

        /**
         * Join-backed mapping entries for a relationship.
         * @param joinBackedMapping the value to set
         * @return this builder
         **/
        

public Builder joinBackedMapping(java.util.List<Object> joinBackedMapping) {
    this.joinBackedMapping = joinBackedMapping;
    return this;
}


        public OntologyEntity build() {
            OntologyEntity model = new OntologyEntity(this.entityType
                , this.compactIri
                , this.iri
                , this.path
                , this.label
                , this.comment
                , this.description
                , this.prefLabel
                , this.definition
                , this.scopeNotes
                , this.altLabels
                , this.synonyms
                , this.versionInfo
                , this.defaultPrefix
                , this.prefix
                , this.imports
                , this.subClassOf
                , this.equivalentClasses
                , this.disjointWith
                , this.relatedClasses
                , this.entityRole
                , this.grainKey
                , this.measureGroup
                , this.biSubjectArea
                , this.biSubjectAreaTable
                , this.propertyType
                , this.dataType
                , this.mappedColumn
                , this.domain
                , this.range
                , this.cardinality
                , this.subPropertyOf
                , this.inverseOf
                , this.owlCharacteristics
                , this.properties
                , this.constraints
                , this.binding
                , this.relationships
                , this.joinBackedMapping);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntity model) {
                this.entityType(model.getEntityType());
    this.compactIri(model.getCompactIri());
    this.iri(model.getIri());
    this.path(model.getPath());
    this.label(model.getLabel());
    this.comment(model.getComment());
    this.description(model.getDescription());
    this.prefLabel(model.getPrefLabel());
    this.definition(model.getDefinition());
    this.scopeNotes(model.getScopeNotes());
    this.altLabels(model.getAltLabels());
    this.synonyms(model.getSynonyms());
    this.versionInfo(model.getVersionInfo());
    this.defaultPrefix(model.getDefaultPrefix());
    this.prefix(model.getPrefix());
    this.imports(model.getImports());
    this.subClassOf(model.getSubClassOf());
    this.equivalentClasses(model.getEquivalentClasses());
    this.disjointWith(model.getDisjointWith());
    this.relatedClasses(model.getRelatedClasses());
    this.entityRole(model.getEntityRole());
    this.grainKey(model.getGrainKey());
    this.measureGroup(model.getMeasureGroup());
    this.biSubjectArea(model.getBiSubjectArea());
    this.biSubjectAreaTable(model.getBiSubjectAreaTable());
    this.propertyType(model.getPropertyType());
    this.dataType(model.getDataType());
    this.mappedColumn(model.getMappedColumn());
    this.domain(model.getDomain());
    this.range(model.getRange());
    this.cardinality(model.getCardinality());
    this.subPropertyOf(model.getSubPropertyOf());
    this.inverseOf(model.getInverseOf());
    this.owlCharacteristics(model.getOwlCharacteristics());
    this.properties(model.getProperties());
    this.constraints(model.getConstraints());
    this.binding(model.getBinding());
    this.relationships(model.getRelationships());
    this.joinBackedMapping(model.getJoinBackedMapping());
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
     * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

        /**
     * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
     * @return the value
     **/
    
    public String getEntityType() {
        return entityType;
    }


        /**
     * Compact IRI for the entity, such as ex:Product.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compactIri")
    private final String compactIri;

        /**
     * Compact IRI for the entity, such as ex:Product.
     * @return the value
     **/
    
    public String getCompactIri() {
        return compactIri;
    }


        /**
     * Full IRI for the entity, such as https://example.com/ontology/Product.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("iri")
    private final String iri;

        /**
     * Full IRI for the entity, such as https://example.com/ontology/Product.
     * @return the value
     **/
    
    public String getIri() {
        return iri;
    }


        /**
     * Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Human-readable entity label.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

        /**
     * Human-readable entity label.
     * @return the value
     **/
    
    public String getLabel() {
        return label;
    }


        /**
     * Human-readable entity comment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

        /**
     * Human-readable entity comment.
     * @return the value
     **/
    
    public String getComment() {
        return comment;
    }


        /**
     * Human-readable entity description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Human-readable entity description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Preferred SKOS label for the entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prefLabel")
    private final String prefLabel;

        /**
     * Preferred SKOS label for the entity.
     * @return the value
     **/
    
    public String getPrefLabel() {
        return prefLabel;
    }


        /**
     * SKOS definition text for the entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    private final String definition;

        /**
     * SKOS definition text for the entity.
     * @return the value
     **/
    
    public String getDefinition() {
        return definition;
    }


        /**
     * SKOS scope note text for the entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scopeNotes")
    private final String scopeNotes;

        /**
     * SKOS scope note text for the entity.
     * @return the value
     **/
    
    public String getScopeNotes() {
        return scopeNotes;
    }


        /**
     * Alternative SKOS labels for the entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("altLabels")
    private final java.util.List<String> altLabels;

        /**
     * Alternative SKOS labels for the entity.
     * @return the value
     **/
    
    public java.util.List<String> getAltLabels() {
        return altLabels;
    }


        /**
     * Synonym labels for the entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("synonyms")
    private final java.util.List<String> synonyms;

        /**
     * Synonym labels for the entity.
     * @return the value
     **/
    
    public java.util.List<String> getSynonyms() {
        return synonyms;
    }


        /**
     * OWL version information for ontology entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("versionInfo")
    private final String versionInfo;

        /**
     * OWL version information for ontology entities.
     * @return the value
     **/
    
    public String getVersionInfo() {
        return versionInfo;
    }


        /**
     * Default prefix used to identify entities that belong to this ontology.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPrefix")
    private final String defaultPrefix;

        /**
     * Default prefix used to identify entities that belong to this ontology.
     * @return the value
     **/
    
    public String getDefaultPrefix() {
        return defaultPrefix;
    }


        /**
     * Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final java.util.Map<String, String> prefix;

        /**
     * Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.
     * @return the value
     **/
    
    public java.util.Map<String, String> getPrefix() {
        return prefix;
    }


        /**
     * OWL ontology import IRIs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("imports")
    private final java.util.List<String> imports;

        /**
     * OWL ontology import IRIs.
     * @return the value
     **/
    
    public java.util.List<String> getImports() {
        return imports;
    }


        /**
     * Parent class IRIs or prefixed names for class entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("subClassOf")
    private final java.util.List<String> subClassOf;

        /**
     * Parent class IRIs or prefixed names for class entities.
     * @return the value
     **/
    
    public java.util.List<String> getSubClassOf() {
        return subClassOf;
    }


        /**
     * Equivalent class IRIs or prefixed names for class entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("equivalentClasses")
    private final java.util.List<String> equivalentClasses;

        /**
     * Equivalent class IRIs or prefixed names for class entities.
     * @return the value
     **/
    
    public java.util.List<String> getEquivalentClasses() {
        return equivalentClasses;
    }


        /**
     * Disjoint class IRIs or prefixed names for class entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("disjointWith")
    private final java.util.List<String> disjointWith;

        /**
     * Disjoint class IRIs or prefixed names for class entities.
     * @return the value
     **/
    
    public java.util.List<String> getDisjointWith() {
        return disjointWith;
    }


        /**
     * Related class IRIs or prefixed names for class entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("relatedClasses")
    private final java.util.List<String> relatedClasses;

        /**
     * Related class IRIs or prefixed names for class entities.
     * @return the value
     **/
    
    public java.util.List<String> getRelatedClasses() {
        return relatedClasses;
    }


        /**
     * Role of the class in the business or BI model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entityRole")
    private final String entityRole;

        /**
     * Role of the class in the business or BI model.
     * @return the value
     **/
    
    public String getEntityRole() {
        return entityRole;
    }


        /**
     * Property names or IRIs defining analytical grain.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("grainKey")
    private final java.util.List<String> grainKey;

        /**
     * Property names or IRIs defining analytical grain.
     * @return the value
     **/
    
    public java.util.List<String> getGrainKey() {
        return grainKey;
    }


        /**
     * BI measure group association.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("measureGroup")
    private final String measureGroup;

        /**
     * BI measure group association.
     * @return the value
     **/
    
    public String getMeasureGroup() {
        return measureGroup;
    }


        /**
     * Source BI subject area.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("biSubjectArea")
    private final String biSubjectArea;

        /**
     * Source BI subject area.
     * @return the value
     **/
    
    public String getBiSubjectArea() {
        return biSubjectArea;
    }


        /**
     * Source BI subject area table mapping.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("biSubjectAreaTable")
    private final String biSubjectAreaTable;

        /**
     * Source BI subject area table mapping.
     * @return the value
     **/
    
    public String getBiSubjectAreaTable() {
        return biSubjectAreaTable;
    }


        /**
     * Property kind for OwlProperty, such as datatype or object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("propertyType")
    private final String propertyType;

        /**
     * Property kind for OwlProperty, such as datatype or object.
     * @return the value
     **/
    
    public String getPropertyType() {
        return propertyType;
    }


        /**
     * Expected datatype for an OwlProperty or class property object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

        /**
     * Expected datatype for an OwlProperty or class property object.
     * @return the value
     **/
    
    public String getDataType() {
        return dataType;
    }


        /**
     * Physical source column mapped to the property.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mappedColumn")
    private final String mappedColumn;

        /**
     * Physical source column mapped to the property.
     * @return the value
     **/
    
    public String getMappedColumn() {
        return mappedColumn;
    }


        /**
     * Domain class IRIs or prefixed names for relationship entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

        /**
     * Domain class IRIs or prefixed names for relationship entities.
     * @return the value
     **/
    
    public String getDomain() {
        return domain;
    }


        /**
     * Range class IRIs or prefixed names for relationship entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("range")
    private final String range;

        /**
     * Range class IRIs or prefixed names for relationship entities.
     * @return the value
     **/
    
    public String getRange() {
        return range;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
    private final OntologyEntityCardinality cardinality;

    
    public OntologyEntityCardinality getCardinality() {
        return cardinality;
    }


        /**
     * Parent property IRIs or prefixed names for relationship entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("subPropertyOf")
    private final java.util.List<String> subPropertyOf;

        /**
     * Parent property IRIs or prefixed names for relationship entities.
     * @return the value
     **/
    
    public java.util.List<String> getSubPropertyOf() {
        return subPropertyOf;
    }


        /**
     * Inverse property IRIs or prefixed names for relationship entities.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inverseOf")
    private final String inverseOf;

        /**
     * Inverse property IRIs or prefixed names for relationship entities.
     * @return the value
     **/
    
    public String getInverseOf() {
        return inverseOf;
    }


        /**
     * OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("owlCharacteristics")
    private final java.util.List<String> owlCharacteristics;

        /**
     * OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.
     * @return the value
     **/
    
    public java.util.List<String> getOwlCharacteristics() {
        return owlCharacteristics;
    }


        /**
     * Property definitions associated with the class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<Object> properties;

        /**
     * Property definitions associated with the class.
     * @return the value
     **/
    
    public java.util.List<Object> getProperties() {
        return properties;
    }


        /**
     * Validation or governance constraints for the class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("constraints")
    private final java.util.List<Object> constraints;

        /**
     * Validation or governance constraints for the class.
     * @return the value
     **/
    
    public java.util.List<Object> getConstraints() {
        return constraints;
    }


        /**
     * R2RML or RML bindings for the class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("binding")
    private final java.util.List<Object> binding;

        /**
     * R2RML or RML bindings for the class.
     * @return the value
     **/
    
    public java.util.List<Object> getBinding() {
        return binding;
    }


        /**
     * Relationship definitions associated with the class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("relationships")
    private final java.util.List<Object> relationships;

        /**
     * Relationship definitions associated with the class.
     * @return the value
     **/
    
    public java.util.List<Object> getRelationships() {
        return relationships;
    }


        /**
     * Join-backed mapping entries for a relationship.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("joinBackedMapping")
    private final java.util.List<Object> joinBackedMapping;

        /**
     * Join-backed mapping entries for a relationship.
     * @return the value
     **/
    
    public java.util.List<Object> getJoinBackedMapping() {
        return joinBackedMapping;
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
        sb.append("OntologyEntity(");
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", compactIri=").append(String.valueOf(this.compactIri));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", prefLabel=").append(String.valueOf(this.prefLabel));
        sb.append(", definition=").append(String.valueOf(this.definition));
        sb.append(", scopeNotes=").append(String.valueOf(this.scopeNotes));
        sb.append(", altLabels=").append(String.valueOf(this.altLabels));
        sb.append(", synonyms=").append(String.valueOf(this.synonyms));
        sb.append(", versionInfo=").append(String.valueOf(this.versionInfo));
        sb.append(", defaultPrefix=").append(String.valueOf(this.defaultPrefix));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", imports=").append(String.valueOf(this.imports));
        sb.append(", subClassOf=").append(String.valueOf(this.subClassOf));
        sb.append(", equivalentClasses=").append(String.valueOf(this.equivalentClasses));
        sb.append(", disjointWith=").append(String.valueOf(this.disjointWith));
        sb.append(", relatedClasses=").append(String.valueOf(this.relatedClasses));
        sb.append(", entityRole=").append(String.valueOf(this.entityRole));
        sb.append(", grainKey=").append(String.valueOf(this.grainKey));
        sb.append(", measureGroup=").append(String.valueOf(this.measureGroup));
        sb.append(", biSubjectArea=").append(String.valueOf(this.biSubjectArea));
        sb.append(", biSubjectAreaTable=").append(String.valueOf(this.biSubjectAreaTable));
        sb.append(", propertyType=").append(String.valueOf(this.propertyType));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", mappedColumn=").append(String.valueOf(this.mappedColumn));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", range=").append(String.valueOf(this.range));
        sb.append(", cardinality=").append(String.valueOf(this.cardinality));
        sb.append(", subPropertyOf=").append(String.valueOf(this.subPropertyOf));
        sb.append(", inverseOf=").append(String.valueOf(this.inverseOf));
        sb.append(", owlCharacteristics=").append(String.valueOf(this.owlCharacteristics));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", constraints=").append(String.valueOf(this.constraints));
        sb.append(", binding=").append(String.valueOf(this.binding));
        sb.append(", relationships=").append(String.valueOf(this.relationships));
        sb.append(", joinBackedMapping=").append(String.valueOf(this.joinBackedMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntity)) {
            return false;
        }

        OntologyEntity other = (OntologyEntity) o;
        return java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.compactIri, other.compactIri) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.label, other.label) &&
            java.util.Objects.equals(this.comment, other.comment) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.prefLabel, other.prefLabel) &&
            java.util.Objects.equals(this.definition, other.definition) &&
            java.util.Objects.equals(this.scopeNotes, other.scopeNotes) &&
            java.util.Objects.equals(this.altLabels, other.altLabels) &&
            java.util.Objects.equals(this.synonyms, other.synonyms) &&
            java.util.Objects.equals(this.versionInfo, other.versionInfo) &&
            java.util.Objects.equals(this.defaultPrefix, other.defaultPrefix) &&
            java.util.Objects.equals(this.prefix, other.prefix) &&
            java.util.Objects.equals(this.imports, other.imports) &&
            java.util.Objects.equals(this.subClassOf, other.subClassOf) &&
            java.util.Objects.equals(this.equivalentClasses, other.equivalentClasses) &&
            java.util.Objects.equals(this.disjointWith, other.disjointWith) &&
            java.util.Objects.equals(this.relatedClasses, other.relatedClasses) &&
            java.util.Objects.equals(this.entityRole, other.entityRole) &&
            java.util.Objects.equals(this.grainKey, other.grainKey) &&
            java.util.Objects.equals(this.measureGroup, other.measureGroup) &&
            java.util.Objects.equals(this.biSubjectArea, other.biSubjectArea) &&
            java.util.Objects.equals(this.biSubjectAreaTable, other.biSubjectAreaTable) &&
            java.util.Objects.equals(this.propertyType, other.propertyType) &&
            java.util.Objects.equals(this.dataType, other.dataType) &&
            java.util.Objects.equals(this.mappedColumn, other.mappedColumn) &&
            java.util.Objects.equals(this.domain, other.domain) &&
            java.util.Objects.equals(this.range, other.range) &&
            java.util.Objects.equals(this.cardinality, other.cardinality) &&
            java.util.Objects.equals(this.subPropertyOf, other.subPropertyOf) &&
            java.util.Objects.equals(this.inverseOf, other.inverseOf) &&
            java.util.Objects.equals(this.owlCharacteristics, other.owlCharacteristics) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.constraints, other.constraints) &&
            java.util.Objects.equals(this.binding, other.binding) &&
            java.util.Objects.equals(this.relationships, other.relationships) &&
            java.util.Objects.equals(this.joinBackedMapping, other.joinBackedMapping);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.compactIri == null ? 43 : this.compactIri.hashCode());
        result = (result * PRIME) + (this.iri == null ? 43 : this.iri.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.prefLabel == null ? 43 : this.prefLabel.hashCode());
        result = (result * PRIME) + (this.definition == null ? 43 : this.definition.hashCode());
        result = (result * PRIME) + (this.scopeNotes == null ? 43 : this.scopeNotes.hashCode());
        result = (result * PRIME) + (this.altLabels == null ? 43 : this.altLabels.hashCode());
        result = (result * PRIME) + (this.synonyms == null ? 43 : this.synonyms.hashCode());
        result = (result * PRIME) + (this.versionInfo == null ? 43 : this.versionInfo.hashCode());
        result = (result * PRIME) + (this.defaultPrefix == null ? 43 : this.defaultPrefix.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.imports == null ? 43 : this.imports.hashCode());
        result = (result * PRIME) + (this.subClassOf == null ? 43 : this.subClassOf.hashCode());
        result = (result * PRIME) + (this.equivalentClasses == null ? 43 : this.equivalentClasses.hashCode());
        result = (result * PRIME) + (this.disjointWith == null ? 43 : this.disjointWith.hashCode());
        result = (result * PRIME) + (this.relatedClasses == null ? 43 : this.relatedClasses.hashCode());
        result = (result * PRIME) + (this.entityRole == null ? 43 : this.entityRole.hashCode());
        result = (result * PRIME) + (this.grainKey == null ? 43 : this.grainKey.hashCode());
        result = (result * PRIME) + (this.measureGroup == null ? 43 : this.measureGroup.hashCode());
        result = (result * PRIME) + (this.biSubjectArea == null ? 43 : this.biSubjectArea.hashCode());
        result = (result * PRIME) + (this.biSubjectAreaTable == null ? 43 : this.biSubjectAreaTable.hashCode());
        result = (result * PRIME) + (this.propertyType == null ? 43 : this.propertyType.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.mappedColumn == null ? 43 : this.mappedColumn.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.range == null ? 43 : this.range.hashCode());
        result = (result * PRIME) + (this.cardinality == null ? 43 : this.cardinality.hashCode());
        result = (result * PRIME) + (this.subPropertyOf == null ? 43 : this.subPropertyOf.hashCode());
        result = (result * PRIME) + (this.inverseOf == null ? 43 : this.inverseOf.hashCode());
        result = (result * PRIME) + (this.owlCharacteristics == null ? 43 : this.owlCharacteristics.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.constraints == null ? 43 : this.constraints.hashCode());
        result = (result * PRIME) + (this.binding == null ? 43 : this.binding.hashCode());
        result = (result * PRIME) + (this.relationships == null ? 43 : this.relationships.hashCode());
        result = (result * PRIME) + (this.joinBackedMapping == null ? 43 : this.joinBackedMapping.hashCode());
        return result;
    }


}
