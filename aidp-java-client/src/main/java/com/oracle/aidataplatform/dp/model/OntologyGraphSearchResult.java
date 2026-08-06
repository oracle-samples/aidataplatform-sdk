// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Search hit from a published ontology graph metadata object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphSearchResult.Builder.class)

public final class OntologyGraphSearchResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "name", "label", "description", "sourceId", "targetId", "relationshipLabel"})
    public OntologyGraphSearchResult(String id, String type, String name, String label, String description, String sourceId, String targetId, String relationshipLabel) {
        super();
        this.id = id;
        this.type = type;
        this.name = name;
        this.label = label;
        this.description = description;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.relationshipLabel = relationshipLabel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Stable ontology object identifier, usually an IRI or generated relationship id.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Stable ontology object identifier, usually an IRI or generated relationship id.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Local name or generated graph object name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Local name or generated graph object name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Human-readable label when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("label")
private String label;

        /**
         * Human-readable label when available.
         * @param label the value to set
         * @return this builder
         **/
        

public Builder label(String label) {
    this.label = label;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;



public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Source class or object identifier for relationship-like results.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceId")
private String sourceId;

        /**
         * Source class or object identifier for relationship-like results.
         * @param sourceId the value to set
         * @return this builder
         **/
        

public Builder sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
}
            /**
     * Target class or object identifier for relationship-like results.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("targetId")
private String targetId;

        /**
         * Target class or object identifier for relationship-like results.
         * @param targetId the value to set
         * @return this builder
         **/
        

public Builder targetId(String targetId) {
    this.targetId = targetId;
    return this;
}
            /**
     * Relationship or property kind when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("relationshipLabel")
private String relationshipLabel;

        /**
         * Relationship or property kind when available.
         * @param relationshipLabel the value to set
         * @return this builder
         **/
        

public Builder relationshipLabel(String relationshipLabel) {
    this.relationshipLabel = relationshipLabel;
    return this;
}


        public OntologyGraphSearchResult build() {
            OntologyGraphSearchResult model = new OntologyGraphSearchResult(this.id
                , this.type
                , this.name
                , this.label
                , this.description
                , this.sourceId
                , this.targetId
                , this.relationshipLabel);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphSearchResult model) {
                this.id(model.getId());
    this.type(model.getType());
    this.name(model.getName());
    this.label(model.getLabel());
    this.description(model.getDescription());
    this.sourceId(model.getSourceId());
    this.targetId(model.getTargetId());
    this.relationshipLabel(model.getRelationshipLabel());
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
     * Stable ontology object identifier, usually an IRI or generated relationship id.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Stable ontology object identifier, usually an IRI or generated relationship id.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Local name or generated graph object name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Local name or generated graph object name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Human-readable label when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

        /**
     * Human-readable label when available.
     * @return the value
     **/
    
    public String getLabel() {
        return label;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    
    public String getDescription() {
        return description;
    }


        /**
     * Source class or object identifier for relationship-like results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

        /**
     * Source class or object identifier for relationship-like results.
     * @return the value
     **/
    
    public String getSourceId() {
        return sourceId;
    }


        /**
     * Target class or object identifier for relationship-like results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

        /**
     * Target class or object identifier for relationship-like results.
     * @return the value
     **/
    
    public String getTargetId() {
        return targetId;
    }


        /**
     * Relationship or property kind when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("relationshipLabel")
    private final String relationshipLabel;

        /**
     * Relationship or property kind when available.
     * @return the value
     **/
    
    public String getRelationshipLabel() {
        return relationshipLabel;
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
        sb.append("OntologyGraphSearchResult(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", relationshipLabel=").append(String.valueOf(this.relationshipLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphSearchResult)) {
            return false;
        }

        OntologyGraphSearchResult other = (OntologyGraphSearchResult) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.label, other.label) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.sourceId, other.sourceId) &&
            java.util.Objects.equals(this.targetId, other.targetId) &&
            java.util.Objects.equals(this.relationshipLabel, other.relationshipLabel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.relationshipLabel == null ? 43 : this.relationshipLabel.hashCode());
        return result;
    }


}
