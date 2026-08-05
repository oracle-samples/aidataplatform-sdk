// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filtering parameter that lets users define which entities are included in the results, while still traversing the full lineage.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NodeFilterObject.Builder.class)

public final class NodeFilterObject  {
    @Deprecated
    @java.beans.ConstructorProperties({"predicates"})
    public NodeFilterObject(NodeFilterPredicates predicates) {
        super();
        this.predicates = predicates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("predicates")
private NodeFilterPredicates predicates;



public Builder predicates(NodeFilterPredicates predicates) {
    this.predicates = predicates;
    return this;
}


        public NodeFilterObject build() {
            NodeFilterObject model = new NodeFilterObject(this.predicates);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeFilterObject model) {
                this.predicates(model.getPredicates());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("predicates")
    private final NodeFilterPredicates predicates;

    
    public NodeFilterPredicates getPredicates() {
        return predicates;
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
        sb.append("NodeFilterObject(");
        sb.append("predicates=").append(String.valueOf(this.predicates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeFilterObject)) {
            return false;
        }

        NodeFilterObject other = (NodeFilterObject) o;
        return java.util.Objects.equals(this.predicates, other.predicates);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.predicates == null ? 43 : this.predicates.hashCode());
        return result;
    }


}
