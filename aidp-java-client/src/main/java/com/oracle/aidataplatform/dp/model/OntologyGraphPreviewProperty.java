// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Literal property attached to a graph node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewProperty.Builder.class)

public final class OntologyGraphPreviewProperty  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value"})
    public OntologyGraphPreviewProperty(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;



public Builder name(String name) {
    this.name = name;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;



public Builder value(String value) {
    this.value = value;
    return this;
}


        public OntologyGraphPreviewProperty build() {
            OntologyGraphPreviewProperty model = new OntologyGraphPreviewProperty(this.name
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewProperty model) {
                this.name(model.getName());
    this.value(model.getValue());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    
    public String getName() {
        return name;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    
    public String getValue() {
        return value;
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
        sb.append("OntologyGraphPreviewProperty(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewProperty)) {
            return false;
        }

        OntologyGraphPreviewProperty other = (OntologyGraphPreviewProperty) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
