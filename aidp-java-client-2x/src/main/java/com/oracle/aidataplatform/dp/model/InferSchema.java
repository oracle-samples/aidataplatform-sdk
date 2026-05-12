package com.oracle.aidataplatform.dp.model;


/**
 * Inferred schema from location.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferSchema.Builder.class)

public final class InferSchema  {
    @Deprecated
    @java.beans.ConstructorProperties({"inferSchemaColumn"})
    public InferSchema(java.util.List<InferSchemaColumn> inferSchemaColumn) {
        super();
        this.inferSchemaColumn = inferSchemaColumn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Column information obtained by inferring schema.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("inferSchemaColumn")
        private java.util.List<InferSchemaColumn> inferSchemaColumn;

                /**
         * Column information obtained by inferring schema.
         * @param inferSchemaColumn the value to set
         * @return this builder
         **/
        

        public Builder inferSchemaColumn(java.util.List<InferSchemaColumn> inferSchemaColumn) {
        this.inferSchemaColumn = inferSchemaColumn;
        return this;
        }


        public InferSchema build() {
            InferSchema model = new InferSchema(this.inferSchemaColumn);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferSchema model) {
                this.inferSchemaColumn(model.getInferSchemaColumn());
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("inferSchemaColumn")
    private final java.util.List<InferSchemaColumn> inferSchemaColumn;

        /**
     * Column information obtained by inferring schema.
     * @return the value
     **/
    
    public java.util.List<InferSchemaColumn> getInferSchemaColumn() {
        return inferSchemaColumn;
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
        sb.append("InferSchema(");
        sb.append("inferSchemaColumn=").append(String.valueOf(this.inferSchemaColumn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferSchema)) {
            return false;
        }

        InferSchema other = (InferSchema) o;
        return java.util.Objects.equals(this.inferSchemaColumn, other.inferSchemaColumn);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inferSchemaColumn == null ? 43 : this.inferSchemaColumn.hashCode());
        return result;
    }


}
