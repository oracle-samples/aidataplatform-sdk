// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Filtering parameter that lets the user control how far the lineage is traversed.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PathFilterObject.Builder.class)

public final class PathFilterObject  {
    @Deprecated
    @java.beans.ConstructorProperties({"predicates"})
    public PathFilterObject(PathFilterPredicates predicates) {
        super();
        this.predicates = predicates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("predicates")
private PathFilterPredicates predicates;



public Builder predicates(PathFilterPredicates predicates) {
    this.predicates = predicates;
    return this;
}


        public PathFilterObject build() {
            PathFilterObject model = new PathFilterObject(this.predicates);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathFilterObject model) {
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
    private final PathFilterPredicates predicates;

    
    public PathFilterPredicates getPredicates() {
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
        sb.append("PathFilterObject(");
        sb.append("predicates=").append(String.valueOf(this.predicates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathFilterObject)) {
            return false;
        }

        PathFilterObject other = (PathFilterObject) o;
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
