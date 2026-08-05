// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FindOntologyGraphPathsDetails.Builder.class)

public final class FindOntologyGraphPathsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "sourceNodeId", "targetNodeId", "maxDepth", "relationshipTypes", "limit"})
    public FindOntologyGraphPathsDetails(String projectId, String sourceNodeId, String targetNodeId, Integer maxDepth, java.util.List<String> relationshipTypes, Integer limit) {
        super();
        this.projectId = projectId;
        this.sourceNodeId = sourceNodeId;
        this.targetNodeId = targetNodeId;
        this.maxDepth = maxDepth;
        this.relationshipTypes = relationshipTypes;
        this.limit = limit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("projectId")
private String projectId;



public Builder projectId(String projectId) {
    this.projectId = projectId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sourceNodeId")
private String sourceNodeId;



public Builder sourceNodeId(String sourceNodeId) {
    this.sourceNodeId = sourceNodeId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("targetNodeId")
private String targetNodeId;



public Builder targetNodeId(String targetNodeId) {
    this.targetNodeId = targetNodeId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("maxDepth")
private Integer maxDepth;



public Builder maxDepth(Integer maxDepth) {
    this.maxDepth = maxDepth;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("relationshipTypes")
private java.util.List<String> relationshipTypes;



public Builder relationshipTypes(java.util.List<String> relationshipTypes) {
    this.relationshipTypes = relationshipTypes;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("limit")
private Integer limit;



public Builder limit(Integer limit) {
    this.limit = limit;
    return this;
}


        public FindOntologyGraphPathsDetails build() {
            FindOntologyGraphPathsDetails model = new FindOntologyGraphPathsDetails(this.projectId
                , this.sourceNodeId
                , this.targetNodeId
                , this.maxDepth
                , this.relationshipTypes
                , this.limit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindOntologyGraphPathsDetails model) {
                this.projectId(model.getProjectId());
    this.sourceNodeId(model.getSourceNodeId());
    this.targetNodeId(model.getTargetNodeId());
    this.maxDepth(model.getMaxDepth());
    this.relationshipTypes(model.getRelationshipTypes());
    this.limit(model.getLimit());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNodeId")
    private final String sourceNodeId;

    
    public String getSourceNodeId() {
        return sourceNodeId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("targetNodeId")
    private final String targetNodeId;

    
    public String getTargetNodeId() {
        return targetNodeId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("maxDepth")
    private final Integer maxDepth;

    
    public Integer getMaxDepth() {
        return maxDepth;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("relationshipTypes")
    private final java.util.List<String> relationshipTypes;

    
    public java.util.List<String> getRelationshipTypes() {
        return relationshipTypes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    
    public Integer getLimit() {
        return limit;
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
        sb.append("FindOntologyGraphPathsDetails(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", sourceNodeId=").append(String.valueOf(this.sourceNodeId));
        sb.append(", targetNodeId=").append(String.valueOf(this.targetNodeId));
        sb.append(", maxDepth=").append(String.valueOf(this.maxDepth));
        sb.append(", relationshipTypes=").append(String.valueOf(this.relationshipTypes));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindOntologyGraphPathsDetails)) {
            return false;
        }

        FindOntologyGraphPathsDetails other = (FindOntologyGraphPathsDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.sourceNodeId, other.sourceNodeId) &&
            java.util.Objects.equals(this.targetNodeId, other.targetNodeId) &&
            java.util.Objects.equals(this.maxDepth, other.maxDepth) &&
            java.util.Objects.equals(this.relationshipTypes, other.relationshipTypes) &&
            java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.sourceNodeId == null ? 43 : this.sourceNodeId.hashCode());
        result = (result * PRIME) + (this.targetNodeId == null ? 43 : this.targetNodeId.hashCode());
        result = (result * PRIME) + (this.maxDepth == null ? 43 : this.maxDepth.hashCode());
        result = (result * PRIME) + (this.relationshipTypes == null ? 43 : this.relationshipTypes.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }


}
