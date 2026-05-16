// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Inferred schema and data.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferSchemaWithPreview.Builder.class)

public final class InferSchemaWithPreview  {
    @Deprecated
    @java.beans.ConstructorProperties({"schema", "data"})
    public InferSchemaWithPreview(java.util.List<InferSchemaColumn> schema, java.util.List<java.util.Map<String, String>> data) {
        super();
        this.schema = schema;
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Column information obtained by inferring schema.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private java.util.List<InferSchemaColumn> schema;

                /**
         * Column information obtained by inferring schema.
         * @param schema the value to set
         * @return this builder
         **/
        

        public Builder schema(java.util.List<InferSchemaColumn> schema) {
        this.schema = schema;
        return this;
        }
            /**
     * Sample preview data.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private java.util.List<java.util.Map<String, String>> data;

                /**
         * Sample preview data.
         * @param data the value to set
         * @return this builder
         **/
        

        public Builder data(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
        }


        public InferSchemaWithPreview build() {
            InferSchemaWithPreview model = new InferSchemaWithPreview(this.schema
                    , this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferSchemaWithPreview model) {
                this.schema(model.getSchema());
    this.data(model.getData());
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
     * Column information obtained by inferring schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final java.util.List<InferSchemaColumn> schema;

        /**
     * Column information obtained by inferring schema.
     * @return the value
     **/
    
    public java.util.List<InferSchemaColumn> getSchema() {
        return schema;
    }


        /**
     * Sample preview data.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final java.util.List<java.util.Map<String, String>> data;

        /**
     * Sample preview data.
     * @return the value
     **/
    
    public java.util.List<java.util.Map<String, String>> getData() {
        return data;
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
        sb.append("InferSchemaWithPreview(");
        sb.append("schema=").append(String.valueOf(this.schema));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferSchemaWithPreview)) {
            return false;
        }

        InferSchemaWithPreview other = (InferSchemaWithPreview) o;
        return java.util.Objects.equals(this.schema, other.schema) &&
            java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
