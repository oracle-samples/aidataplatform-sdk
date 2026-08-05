// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Published ontology graph node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphNode.Builder.class)

public final class OntologyGraphNode  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "name", "label", "description"})
    public OntologyGraphNode(String id, String type, String name, String label, String description) {
        super();
        this.id = id;
        this.type = type;
        this.name = name;
        this.label = label;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;



public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;



public Builder name(String name) {
    this.name = name;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("label")
private String label;



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


        public OntologyGraphNode build() {
            OntologyGraphNode model = new OntologyGraphNode(this.id
                , this.type
                , this.name
                , this.label
                , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphNode model) {
                this.id(model.getId());
    this.type(model.getType());
    this.name(model.getName());
    this.label(model.getLabel());
    this.description(model.getDescription());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    
    public String getId() {
        return id;
    }


        /**
     * CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    
    public String getName() {
        return name;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    
    public String getLabel() {
        return label;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    
    public String getDescription() {
        return description;
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
        sb.append("OntologyGraphNode(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphNode)) {
            return false;
        }

        OntologyGraphNode other = (OntologyGraphNode) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.label, other.label) &&
            java.util.Objects.equals(this.description, other.description);
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
        return result;
    }


}
