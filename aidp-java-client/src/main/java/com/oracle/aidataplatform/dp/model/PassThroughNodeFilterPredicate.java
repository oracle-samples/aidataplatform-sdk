// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Includes only lineage paths that pass through the specified intermediate node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PassThroughNodeFilterPredicate.Builder.class)

public final class PassThroughNodeFilterPredicate  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "depth"})
    public PassThroughNodeFilterPredicate(String id, Integer depth) {
        super();
        this.id = id;
        this.depth = depth;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * ID of the pass through node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * ID of the pass through node.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Depth of the pass through node from anchor node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("depth")
private Integer depth;

        /**
         * Depth of the pass through node from anchor node.
         * @param depth the value to set
         * @return this builder
         **/
        

public Builder depth(Integer depth) {
    this.depth = depth;
    return this;
}


        public PassThroughNodeFilterPredicate build() {
            PassThroughNodeFilterPredicate model = new PassThroughNodeFilterPredicate(this.id
                , this.depth);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PassThroughNodeFilterPredicate model) {
                this.id(model.getId());
    this.depth(model.getDepth());
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

    


        /**
     * ID of the pass through node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * ID of the pass through node.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Depth of the pass through node from anchor node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    private final Integer depth;

        /**
     * Depth of the pass through node from anchor node.
     * @return the value
     **/
    
    public Integer getDepth() {
        return depth;
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
        sb.append("PassThroughNodeFilterPredicate(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", depth=").append(String.valueOf(this.depth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PassThroughNodeFilterPredicate)) {
            return false;
        }

        PassThroughNodeFilterPredicate other = (PassThroughNodeFilterPredicate) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.depth, other.depth);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        return result;
    }


}
