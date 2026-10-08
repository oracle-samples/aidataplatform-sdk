// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * JSON Patch-style request for modifying flat ontology entity properties.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityPatchDetails.Builder.class)

public final class OntologyEntityPatchDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"entityType", "payload"})
    public OntologyEntityPatchDetails(String entityType, java.util.List<OntologyEntityPatchOperation> payload) {
        super();
        this.entityType = entityType;
        this.payload = payload;
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
     * JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("payload")
private java.util.List<OntologyEntityPatchOperation> payload;

        /**
         * JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.
         * @param payload the value to set
         * @return this builder
         **/
        

public Builder payload(java.util.List<OntologyEntityPatchOperation> payload) {
    this.payload = payload;
    return this;
}


        public OntologyEntityPatchDetails build() {
            OntologyEntityPatchDetails model = new OntologyEntityPatchDetails(this.entityType
                , this.payload);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityPatchDetails model) {
                this.entityType(model.getEntityType());
    this.payload(model.getPayload());
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
     * JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    private final java.util.List<OntologyEntityPatchOperation> payload;

        /**
     * JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.
     * @return the value
     **/
    
    public java.util.List<OntologyEntityPatchOperation> getPayload() {
        return payload;
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
        sb.append("OntologyEntityPatchDetails(");
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", payload=").append(String.valueOf(this.payload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityPatchDetails)) {
            return false;
        }

        OntologyEntityPatchDetails other = (OntologyEntityPatchDetails) o;
        return java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.payload, other.payload);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.payload == null ? 43 : this.payload.hashCode());
        return result;
    }


}
