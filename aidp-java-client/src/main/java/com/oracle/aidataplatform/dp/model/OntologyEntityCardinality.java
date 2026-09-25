// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Cardinality resolved from a relationship domain class restriction.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityCardinality.Builder.class)

public final class OntologyEntityCardinality  {
    @Deprecated
    @java.beans.ConstructorProperties({"minCardinality", "maxCardinality"})
    public OntologyEntityCardinality(Integer minCardinality, Integer maxCardinality) {
        super();
        this.minCardinality = minCardinality;
        this.maxCardinality = maxCardinality;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("minCardinality")
private Integer minCardinality;



public Builder minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("maxCardinality")
private Integer maxCardinality;



public Builder maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
}


        public OntologyEntityCardinality build() {
            OntologyEntityCardinality model = new OntologyEntityCardinality(this.minCardinality
                , this.maxCardinality);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityCardinality model) {
                this.minCardinality(model.getMinCardinality());
    this.maxCardinality(model.getMaxCardinality());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("minCardinality")
    private final Integer minCardinality;

    
    public Integer getMinCardinality() {
        return minCardinality;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("maxCardinality")
    private final Integer maxCardinality;

    
    public Integer getMaxCardinality() {
        return maxCardinality;
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
        sb.append("OntologyEntityCardinality(");
        sb.append("minCardinality=").append(String.valueOf(this.minCardinality));
        sb.append(", maxCardinality=").append(String.valueOf(this.maxCardinality));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityCardinality)) {
            return false;
        }

        OntologyEntityCardinality other = (OntologyEntityCardinality) o;
        return java.util.Objects.equals(this.minCardinality, other.minCardinality) &&
            java.util.Objects.equals(this.maxCardinality, other.maxCardinality);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minCardinality == null ? 43 : this.minCardinality.hashCode());
        result = (result * PRIME) + (this.maxCardinality == null ? 43 : this.maxCardinality.hashCode());
        return result;
    }


}
