// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Graph preview limits and whether they were reached.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewLimits.Builder.class)

public final class OntologyGraphPreviewLimits  {
    @Deprecated
    @java.beans.ConstructorProperties({"maxNodes", "maxEdges", "reachedNodeLimit", "reachedEdgeLimit"})
    public OntologyGraphPreviewLimits(Integer maxNodes, Integer maxEdges, Boolean reachedNodeLimit, Boolean reachedEdgeLimit) {
        super();
        this.maxNodes = maxNodes;
        this.maxEdges = maxEdges;
        this.reachedNodeLimit = reachedNodeLimit;
        this.reachedEdgeLimit = reachedEdgeLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("maxNodes")
private Integer maxNodes;



public Builder maxNodes(Integer maxNodes) {
    this.maxNodes = maxNodes;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("maxEdges")
private Integer maxEdges;



public Builder maxEdges(Integer maxEdges) {
    this.maxEdges = maxEdges;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("reachedNodeLimit")
private Boolean reachedNodeLimit;



public Builder reachedNodeLimit(Boolean reachedNodeLimit) {
    this.reachedNodeLimit = reachedNodeLimit;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("reachedEdgeLimit")
private Boolean reachedEdgeLimit;



public Builder reachedEdgeLimit(Boolean reachedEdgeLimit) {
    this.reachedEdgeLimit = reachedEdgeLimit;
    return this;
}


        public OntologyGraphPreviewLimits build() {
            OntologyGraphPreviewLimits model = new OntologyGraphPreviewLimits(this.maxNodes
                , this.maxEdges
                , this.reachedNodeLimit
                , this.reachedEdgeLimit);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewLimits model) {
                this.maxNodes(model.getMaxNodes());
    this.maxEdges(model.getMaxEdges());
    this.reachedNodeLimit(model.getReachedNodeLimit());
    this.reachedEdgeLimit(model.getReachedEdgeLimit());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("maxNodes")
    private final Integer maxNodes;

    
    public Integer getMaxNodes() {
        return maxNodes;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("maxEdges")
    private final Integer maxEdges;

    
    public Integer getMaxEdges() {
        return maxEdges;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("reachedNodeLimit")
    private final Boolean reachedNodeLimit;

    
    public Boolean getReachedNodeLimit() {
        return reachedNodeLimit;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("reachedEdgeLimit")
    private final Boolean reachedEdgeLimit;

    
    public Boolean getReachedEdgeLimit() {
        return reachedEdgeLimit;
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
        sb.append("OntologyGraphPreviewLimits(");
        sb.append("maxNodes=").append(String.valueOf(this.maxNodes));
        sb.append(", maxEdges=").append(String.valueOf(this.maxEdges));
        sb.append(", reachedNodeLimit=").append(String.valueOf(this.reachedNodeLimit));
        sb.append(", reachedEdgeLimit=").append(String.valueOf(this.reachedEdgeLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewLimits)) {
            return false;
        }

        OntologyGraphPreviewLimits other = (OntologyGraphPreviewLimits) o;
        return java.util.Objects.equals(this.maxNodes, other.maxNodes) &&
            java.util.Objects.equals(this.maxEdges, other.maxEdges) &&
            java.util.Objects.equals(this.reachedNodeLimit, other.reachedNodeLimit) &&
            java.util.Objects.equals(this.reachedEdgeLimit, other.reachedEdgeLimit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxNodes == null ? 43 : this.maxNodes.hashCode());
        result = (result * PRIME) + (this.maxEdges == null ? 43 : this.maxEdges.hashCode());
        result = (result * PRIME) + (this.reachedNodeLimit == null ? 43 : this.reachedNodeLimit.hashCode());
        result = (result * PRIME) + (this.reachedEdgeLimit == null ? 43 : this.reachedEdgeLimit.hashCode());
        return result;
    }


}
