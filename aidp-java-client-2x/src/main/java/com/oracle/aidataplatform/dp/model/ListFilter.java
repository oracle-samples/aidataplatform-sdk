package com.oracle.aidataplatform.dp.model;


/**
 * List filters
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ListFilter.Builder.class)

public final class ListFilter  {
    @Deprecated
    @java.beans.ConstructorProperties({"field", "dataType", "values"})
    public ListFilter(ListFilterEnum field, DataTypeEnum dataType, java.util.List<String> values) {
        super();
        this.field = field;
        this.dataType = dataType;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Field Name for term filter
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private ListFilterEnum field;

                /**
         * Field Name for term filter
         * @param field the value to set
         * @return this builder
         **/
        

        public Builder field(ListFilterEnum field) {
        this.field = field;
        return this;
        }
            /**
     * Field Name data type
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private DataTypeEnum dataType;

                /**
         * Field Name data type
         * @param dataType the value to set
         * @return this builder
         **/
        

        public Builder dataType(DataTypeEnum dataType) {
        this.dataType = dataType;
        return this;
        }
            /**
     * List of values
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

                /**
         * List of values
         * @param values the value to set
         * @return this builder
         **/
        

        public Builder values(java.util.List<String> values) {
        this.values = values;
        return this;
        }


        public ListFilter build() {
            ListFilter model = new ListFilter(this.field
                    , this.dataType
                    , this.values);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListFilter model) {
                this.field(model.getField());
    this.dataType(model.getDataType());
    this.values(model.getValues());
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
     * Field Name for term filter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final ListFilterEnum field;

        /**
     * Field Name for term filter
     * @return the value
     **/
    
    public ListFilterEnum getField() {
        return field;
    }

    
        /**
     * Field Name data type
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final DataTypeEnum dataType;

        /**
     * Field Name data type
     * @return the value
     **/
    
    public DataTypeEnum getDataType() {
        return dataType;
    }


        /**
     * List of values
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

        /**
     * List of values
     * @return the value
     **/
    
    public java.util.List<String> getValues() {
        return values;
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
        sb.append("ListFilter(");
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFilter)) {
            return false;
        }

        ListFilter other = (ListFilter) o;
        return java.util.Objects.equals(this.field, other.field) &&
            java.util.Objects.equals(this.dataType, other.dataType) &&
            java.util.Objects.equals(this.values, other.values);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        return result;
    }


}
