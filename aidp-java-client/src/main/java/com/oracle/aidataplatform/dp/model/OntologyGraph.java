// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary of a published ontology graph.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraph.Builder.class)

public final class OntologyGraph  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "graphName", "namespace", "classCount", "propertyCount", "shapeCount", "relationshipCount"})
    public OntologyGraph(String projectId, String graphName, String namespace, Integer classCount, Integer propertyCount, Integer shapeCount, Integer relationshipCount) {
        super();
        this.projectId = projectId;
        this.graphName = graphName;
        this.namespace = namespace;
        this.classCount = classCount;
        this.propertyCount = propertyCount;
        this.shapeCount = shapeCount;
        this.relationshipCount = relationshipCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;



public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("graphName")
private String graphName;



public Builder graphName(String graphName) {
    this.graphName = graphName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;



public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
        
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
        
@com.fasterxml.jackson.annotation.JsonProperty("shapeCount")
private Integer shapeCount;



public Builder shapeCount(Integer shapeCount) {
    this.shapeCount = shapeCount;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("relationshipCount")
private Integer relationshipCount;



public Builder relationshipCount(Integer relationshipCount) {
    this.relationshipCount = relationshipCount;
    return this;
}


        public OntologyGraph build() {
            OntologyGraph model = new OntologyGraph(this.projectId
                , this.graphName
                , this.namespace
                , this.classCount
                , this.propertyCount
                , this.shapeCount
                , this.relationshipCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraph model) {
                this.projectId(model.getProjectId());
    this.graphName(model.getGraphName());
    this.namespace(model.getNamespace());
    this.classCount(model.getClassCount());
    this.propertyCount(model.getPropertyCount());
    this.shapeCount(model.getShapeCount());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    
    public String getProjectId() {
        return projectId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("graphName")
    private final String graphName;

    
    public String getGraphName() {
        return graphName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    
    public String getNamespace() {
        return namespace;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("shapeCount")
    private final Integer shapeCount;

    
    public Integer getShapeCount() {
        return shapeCount;
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
        sb.append("OntologyGraph(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", graphName=").append(String.valueOf(this.graphName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", classCount=").append(String.valueOf(this.classCount));
        sb.append(", propertyCount=").append(String.valueOf(this.propertyCount));
        sb.append(", shapeCount=").append(String.valueOf(this.shapeCount));
        sb.append(", relationshipCount=").append(String.valueOf(this.relationshipCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraph)) {
            return false;
        }

        OntologyGraph other = (OntologyGraph) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.graphName, other.graphName) &&
            java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.classCount, other.classCount) &&
            java.util.Objects.equals(this.propertyCount, other.propertyCount) &&
            java.util.Objects.equals(this.shapeCount, other.shapeCount) &&
            java.util.Objects.equals(this.relationshipCount, other.relationshipCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.graphName == null ? 43 : this.graphName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.classCount == null ? 43 : this.classCount.hashCode());
        result = (result * PRIME) + (this.propertyCount == null ? 43 : this.propertyCount.hashCode());
        result = (result * PRIME) + (this.shapeCount == null ? 43 : this.shapeCount.hashCode());
        result = (result * PRIME) + (this.relationshipCount == null ? 43 : this.relationshipCount.hashCode());
        return result;
    }


}
