// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Published ontology graph edge.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphEdge.Builder.class)

public final class OntologyGraphEdge  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "label", "sourceId", "targetId"})
    public OntologyGraphEdge(String id, String type, String label, String sourceId, String targetId) {
        super();
        this.id = id;
        this.type = type;
        this.label = label;
        this.sourceId = sourceId;
        this.targetId = targetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;



public Builder id(String id) {
    this.id = id;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;



public Builder type(String type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("label")
private String label;



public Builder label(String label) {
    this.label = label;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sourceId")
private String sourceId;



public Builder sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("targetId")
private String targetId;



public Builder targetId(String targetId) {
    this.targetId = targetId;
    return this;
}


        public OntologyGraphEdge build() {
            OntologyGraphEdge model = new OntologyGraphEdge(this.id
                , this.type
                , this.label
                , this.sourceId
                , this.targetId);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphEdge model) {
                this.id(model.getId());
    this.type(model.getType());
    this.label(model.getLabel());
    this.sourceId(model.getSourceId());
    this.targetId(model.getTargetId());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    
    public String getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    
    public String getLabel() {
        return label;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    
    public String getSourceId() {
        return sourceId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    
    public String getTargetId() {
        return targetId;
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
        sb.append("OntologyGraphEdge(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphEdge)) {
            return false;
        }

        OntologyGraphEdge other = (OntologyGraphEdge) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.label, other.label) &&
            java.util.Objects.equals(this.sourceId, other.sourceId) &&
            java.util.Objects.equals(this.targetId, other.targetId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        return result;
    }


}
