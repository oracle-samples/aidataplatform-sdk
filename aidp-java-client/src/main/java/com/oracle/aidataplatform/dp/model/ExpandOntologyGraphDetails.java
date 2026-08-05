// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExpandOntologyGraphDetails.Builder.class)

public final class ExpandOntologyGraphDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "startNodeId", "direction", "depth", "relationshipTypes", "limit"})
    public ExpandOntologyGraphDetails(String projectId, String startNodeId, String direction, Integer depth, java.util.List<String> relationshipTypes, Integer limit) {
        super();
        this.projectId = projectId;
        this.startNodeId = startNodeId;
        this.direction = direction;
        this.depth = depth;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("startNodeId")
private String startNodeId;



public Builder startNodeId(String startNodeId) {
    this.startNodeId = startNodeId;
    return this;
}
            /**
     * OUT, IN, or BOTH.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("direction")
private String direction;

        /**
         * OUT, IN, or BOTH.
         * @param direction the value to set
         * @return this builder
         **/
        

public Builder direction(String direction) {
    this.direction = direction;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("depth")
private Integer depth;



public Builder depth(Integer depth) {
    this.depth = depth;
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


        public ExpandOntologyGraphDetails build() {
            ExpandOntologyGraphDetails model = new ExpandOntologyGraphDetails(this.projectId
                , this.startNodeId
                , this.direction
                , this.depth
                , this.relationshipTypes
                , this.limit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExpandOntologyGraphDetails model) {
                this.projectId(model.getProjectId());
    this.startNodeId(model.getStartNodeId());
    this.direction(model.getDirection());
    this.depth(model.getDepth());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("startNodeId")
    private final String startNodeId;

    
    public String getStartNodeId() {
        return startNodeId;
    }


        /**
     * OUT, IN, or BOTH.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final String direction;

        /**
     * OUT, IN, or BOTH.
     * @return the value
     **/
    
    public String getDirection() {
        return direction;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    private final Integer depth;

    
    public Integer getDepth() {
        return depth;
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
        sb.append("ExpandOntologyGraphDetails(");
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", startNodeId=").append(String.valueOf(this.startNodeId));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", depth=").append(String.valueOf(this.depth));
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
        if (!(o instanceof ExpandOntologyGraphDetails)) {
            return false;
        }

        ExpandOntologyGraphDetails other = (ExpandOntologyGraphDetails) o;
        return java.util.Objects.equals(this.projectId, other.projectId) &&
            java.util.Objects.equals(this.startNodeId, other.startNodeId) &&
            java.util.Objects.equals(this.direction, other.direction) &&
            java.util.Objects.equals(this.depth, other.depth) &&
            java.util.Objects.equals(this.relationshipTypes, other.relationshipTypes) &&
            java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.startNodeId == null ? 43 : this.startNodeId.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        result = (result * PRIME) + (this.relationshipTypes == null ? 43 : this.relationshipTypes.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }


}
