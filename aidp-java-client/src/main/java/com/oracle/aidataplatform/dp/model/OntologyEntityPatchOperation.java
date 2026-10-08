// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * JSON Patch-style operation. Paths are scoped to flat entity property paths.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityPatchOperation.Builder.class)

public final class OntologyEntityPatchOperation  {
    @Deprecated
    @java.beans.ConstructorProperties({"op", "path", "value"})
    public OntologyEntityPatchOperation(String op, String path, Object value) {
        super();
        this.op = op;
        this.path = path;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Patch operation. Supported values are add, replace, and remove.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("op")
private String op;

        /**
         * Patch operation. Supported values are add, replace, and remove.
         * @param op the value to set
         * @return this builder
         **/
        

public Builder op(String op) {
    this.op = op;
    return this;
}
            /**
     * JSON pointer path such as /label, /comment, or /subClassOf/0.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * JSON pointer path such as /label, /comment, or /subClassOf/0.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Value used by add and replace operations.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private Object value;

        /**
         * Value used by add and replace operations.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(Object value) {
    this.value = value;
    return this;
}


        public OntologyEntityPatchOperation build() {
            OntologyEntityPatchOperation model = new OntologyEntityPatchOperation(this.op
                , this.path
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityPatchOperation model) {
                this.op(model.getOp());
    this.path(model.getPath());
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

    


        /**
     * Patch operation. Supported values are add, replace, and remove.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    private final String op;

        /**
     * Patch operation. Supported values are add, replace, and remove.
     * @return the value
     **/
    
    public String getOp() {
        return op;
    }


        /**
     * JSON pointer path such as /label, /comment, or /subClassOf/0.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * JSON pointer path such as /label, /comment, or /subClassOf/0.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Value used by add and replace operations.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Object value;

        /**
     * Value used by add and replace operations.
     * @return the value
     **/
    
    public Object getValue() {
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
        sb.append("OntologyEntityPatchOperation(");
        sb.append("op=").append(String.valueOf(this.op));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityPatchOperation)) {
            return false;
        }

        OntologyEntityPatchOperation other = (OntologyEntityPatchOperation) o;
        return java.util.Objects.equals(this.op, other.op) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.op == null ? 43 : this.op.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
