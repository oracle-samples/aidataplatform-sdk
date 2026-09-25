// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * One ordered entity operation inside an ontology save bundle.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntitySaveOperation.Builder.class)

public final class OntologyEntitySaveOperation  {
    @Deprecated
    @java.beans.ConstructorProperties({"opId", "op", "entityType", "compactIri", "iri", "value", "patches"})
    public OntologyEntitySaveOperation(String opId, String op, String entityType, String compactIri, String iri, Object value, java.util.List<OntologyEntityPatchOperation> patches) {
        super();
        this.opId = opId;
        this.op = op;
        this.entityType = entityType;
        this.compactIri = compactIri;
        this.iri = iri;
        this.value = value;
        this.patches = patches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("opId")
private String opId;



public Builder opId(String opId) {
    this.opId = opId;
    return this;
}
            /**
     * Operation type. Supported values are create, replace, patch, and delete.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("op")
private String op;

        /**
         * Operation type. Supported values are create, replace, patch, and delete.
         * @param op the value to set
         * @return this builder
         **/
        

public Builder op(String op) {
    this.op = op;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("entityType")
private String entityType;



public Builder entityType(String entityType) {
    this.entityType = entityType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("compactIri")
private String compactIri;



public Builder compactIri(String compactIri) {
    this.compactIri = compactIri;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("iri")
private String iri;



public Builder iri(String iri) {
    this.iri = iri;
    return this;
}
            /**
     * Full entity value for create or replace operations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private Object value;

        /**
         * Full entity value for create or replace operations.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(Object value) {
    this.value = value;
    return this;
}
            /**
     * JSON Patch operations for patch operations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("patches")
private java.util.List<OntologyEntityPatchOperation> patches;

        /**
         * JSON Patch operations for patch operations.
         * @param patches the value to set
         * @return this builder
         **/
        

public Builder patches(java.util.List<OntologyEntityPatchOperation> patches) {
    this.patches = patches;
    return this;
}


        public OntologyEntitySaveOperation build() {
            OntologyEntitySaveOperation model = new OntologyEntitySaveOperation(this.opId
                , this.op
                , this.entityType
                , this.compactIri
                , this.iri
                , this.value
                , this.patches);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntitySaveOperation model) {
                this.opId(model.getOpId());
    this.op(model.getOp());
    this.entityType(model.getEntityType());
    this.compactIri(model.getCompactIri());
    this.iri(model.getIri());
    this.value(model.getValue());
    this.patches(model.getPatches());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("opId")
    private final String opId;

    
    public String getOpId() {
        return opId;
    }


        /**
     * Operation type. Supported values are create, replace, patch, and delete.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    private final String op;

        /**
     * Operation type. Supported values are create, replace, patch, and delete.
     * @return the value
     **/
    
    public String getOp() {
        return op;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    
    public String getEntityType() {
        return entityType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("compactIri")
    private final String compactIri;

    
    public String getCompactIri() {
        return compactIri;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("iri")
    private final String iri;

    
    public String getIri() {
        return iri;
    }


        /**
     * Full entity value for create or replace operations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Object value;

        /**
     * Full entity value for create or replace operations.
     * @return the value
     **/
    
    public Object getValue() {
        return value;
    }


        /**
     * JSON Patch operations for patch operations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("patches")
    private final java.util.List<OntologyEntityPatchOperation> patches;

        /**
     * JSON Patch operations for patch operations.
     * @return the value
     **/
    
    public java.util.List<OntologyEntityPatchOperation> getPatches() {
        return patches;
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
        sb.append("OntologyEntitySaveOperation(");
        sb.append("opId=").append(String.valueOf(this.opId));
        sb.append(", op=").append(String.valueOf(this.op));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", compactIri=").append(String.valueOf(this.compactIri));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", patches=").append(String.valueOf(this.patches));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntitySaveOperation)) {
            return false;
        }

        OntologyEntitySaveOperation other = (OntologyEntitySaveOperation) o;
        return java.util.Objects.equals(this.opId, other.opId) &&
            java.util.Objects.equals(this.op, other.op) &&
            java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.compactIri, other.compactIri) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.value, other.value) &&
            java.util.Objects.equals(this.patches, other.patches);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.opId == null ? 43 : this.opId.hashCode());
        result = (result * PRIME) + (this.op == null ? 43 : this.op.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.compactIri == null ? 43 : this.compactIri.hashCode());
        result = (result * PRIME) + (this.iri == null ? 43 : this.iri.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.patches == null ? 43 : this.patches.hashCode());
        return result;
    }


}
