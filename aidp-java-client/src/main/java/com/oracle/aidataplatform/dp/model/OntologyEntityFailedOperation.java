// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Failed operation details for an unsuccessful save bundle.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityFailedOperation.Builder.class)

public final class OntologyEntityFailedOperation  {
    @Deprecated
    @java.beans.ConstructorProperties({"opId", "op", "entityType", "compactIri", "iri", "code", "message"})
    public OntologyEntityFailedOperation(String opId, String op, String entityType, String compactIri, String iri, String code, String message) {
        super();
        this.opId = opId;
        this.op = op;
        this.entityType = entityType;
        this.compactIri = compactIri;
        this.iri = iri;
        this.code = code;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("opId")
private String opId;



public Builder opId(String opId) {
    this.opId = opId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("op")
private String op;



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
        
@com.fasterxml.jackson.annotation.JsonProperty("code")
private String code;



public Builder code(String code) {
    this.code = code;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;



public Builder message(String message) {
    this.message = message;
    return this;
}


        public OntologyEntityFailedOperation build() {
            OntologyEntityFailedOperation model = new OntologyEntityFailedOperation(this.opId
                , this.op
                , this.entityType
                , this.compactIri
                , this.iri
                , this.code
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityFailedOperation model) {
                this.opId(model.getOpId());
    this.op(model.getOp());
    this.entityType(model.getEntityType());
    this.compactIri(model.getCompactIri());
    this.iri(model.getIri());
    this.code(model.getCode());
    this.message(model.getMessage());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    private final String op;

    
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    
    public String getCode() {
        return code;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    
    public String getMessage() {
        return message;
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
        sb.append("OntologyEntityFailedOperation(");
        sb.append("opId=").append(String.valueOf(this.opId));
        sb.append(", op=").append(String.valueOf(this.op));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", compactIri=").append(String.valueOf(this.compactIri));
        sb.append(", iri=").append(String.valueOf(this.iri));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityFailedOperation)) {
            return false;
        }

        OntologyEntityFailedOperation other = (OntologyEntityFailedOperation) o;
        return java.util.Objects.equals(this.opId, other.opId) &&
            java.util.Objects.equals(this.op, other.op) &&
            java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.compactIri, other.compactIri) &&
            java.util.Objects.equals(this.iri, other.iri) &&
            java.util.Objects.equals(this.code, other.code) &&
            java.util.Objects.equals(this.message, other.message);
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
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
