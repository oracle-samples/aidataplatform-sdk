// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result for one applied entity operation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityOperationResult.Builder.class)

public final class OntologyEntityOperationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"opId", "entityType", "compactIri", "iri", "status"})
    public OntologyEntityOperationResult(String opId, String entityType, String compactIri, String iri, String status) {
        super();
        this.opId = opId;
        this.entityType = entityType;
        this.compactIri = compactIri;
        this.iri = iri;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("opId")
private String opId;



public Builder opId(String opId) {
    this.opId = opId;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("status")
private String status;



public Builder status(String status) {
    this.status = status;
    return this;
}


        public OntologyEntityOperationResult build() {
            OntologyEntityOperationResult model = new OntologyEntityOperationResult(this.opId
                , this.entityType
                , this.compactIri
                , this.iri
                , this.status);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityOperationResult model) {
                this.opId(model.getOpId());
    this.entityType(model.getEntityType());
    this.compactIri(model.getCompactIri());
    this.iri(model.getIri());
    this.status(model.getStatus());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    
    public String getStatus() {
        return status;
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
        sb.append("OntologyEntityOperationResult(");
        sb.append("opId=").append(String.valueOf(this.opId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", compactIri=").append(String.valueOf(this.compactIri));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityOperationResult)) {
            return false;
        }

        OntologyEntityOperationResult other = (OntologyEntityOperationResult) o;
        return java.util.Objects.equals(this.opId, other.opId) &&
            java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.compactIri, other.compactIri) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.status, other.status);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.opId == null ? 43 : this.opId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.compactIri == null ? 43 : this.compactIri.hashCode());
        result = (result * PRIME) + (this.iri == null ? 43 : this.iri.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        return result;
    }


}
