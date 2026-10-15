// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Project-wide semantic counts, independent of the bounded graph slice.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphSummary.Builder.class)

public final class OntologyGraphSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"classCount", "propertyCount", "relationshipCount"})
    public OntologyGraphSummary(Integer classCount, Integer propertyCount, Integer relationshipCount) {
        super();
        this.classCount = classCount;
        this.propertyCount = propertyCount;
        this.relationshipCount = relationshipCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("classCount")
private Integer classCount;



public Builder classCount(Integer classCount) {
    this.classCount = classCount;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("propertyCount")
private Integer propertyCount;



public Builder propertyCount(Integer propertyCount) {
    this.propertyCount = propertyCount;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("relationshipCount")
private Integer relationshipCount;



public Builder relationshipCount(Integer relationshipCount) {
    this.relationshipCount = relationshipCount;
    return this;
}


        public OntologyGraphSummary build() {
            OntologyGraphSummary model = new OntologyGraphSummary(this.classCount
                , this.propertyCount
                , this.relationshipCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphSummary model) {
                this.classCount(model.getClassCount());
    this.propertyCount(model.getPropertyCount());
    this.relationshipCount(model.getRelationshipCount());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("classCount")
    private final Integer classCount;

    
    public Integer getClassCount() {
        return classCount;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("propertyCount")
    private final Integer propertyCount;

    
    public Integer getPropertyCount() {
        return propertyCount;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("relationshipCount")
    private final Integer relationshipCount;

    
    public Integer getRelationshipCount() {
        return relationshipCount;
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
        sb.append("OntologyGraphSummary(");
        sb.append("classCount=").append(String.valueOf(this.classCount));
        sb.append(", propertyCount=").append(String.valueOf(this.propertyCount));
        sb.append(", relationshipCount=").append(String.valueOf(this.relationshipCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphSummary)) {
            return false;
        }

        OntologyGraphSummary other = (OntologyGraphSummary) o;
        return java.util.Objects.equals(this.classCount, other.classCount) &&
            java.util.Objects.equals(this.propertyCount, other.propertyCount) &&
            java.util.Objects.equals(this.relationshipCount, other.relationshipCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.classCount == null ? 43 : this.classCount.hashCode());
        result = (result * PRIME) + (this.propertyCount == null ? 43 : this.propertyCount.hashCode());
        result = (result * PRIME) + (this.relationshipCount == null ? 43 : this.relationshipCount.hashCode());
        return result;
    }


}
