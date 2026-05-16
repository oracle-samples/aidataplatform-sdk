// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Range filters
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RangeFilter.Builder.class)

public final class RangeFilter  {
    @Deprecated
    @java.beans.ConstructorProperties({"field", "dataType", "start", "end"})
    public RangeFilter(RangeFilterEnum field, DataTypeEnum dataType, String start, String end) {
        super();
        this.field = field;
        this.dataType = dataType;
        this.start = start;
        this.end = end;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Field Name for range filter
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("field")
private RangeFilterEnum field;

        /**
         * Field Name for range filter
         * @param field the value to set
         * @return this builder
         **/
        

public Builder field(RangeFilterEnum field) {
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
     * Start value
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("start")
private String start;

        /**
         * Start value
         * @param start the value to set
         * @return this builder
         **/
        

public Builder start(String start) {
    this.start = start;
    return this;
}
            /**
     * End value
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("end")
private String end;

        /**
         * End value
         * @param end the value to set
         * @return this builder
         **/
        

public Builder end(String end) {
    this.end = end;
    return this;
}


        public RangeFilter build() {
            RangeFilter model = new RangeFilter(this.field
                , this.dataType
                , this.start
                , this.end);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RangeFilter model) {
                this.field(model.getField());
    this.dataType(model.getDataType());
    this.start(model.getStart());
    this.end(model.getEnd());
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
     * Field Name for range filter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final RangeFilterEnum field;

        /**
     * Field Name for range filter
     * @return the value
     **/
    
    public RangeFilterEnum getField() {
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
     * Start value
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    private final String start;

        /**
     * Start value
     * @return the value
     **/
    
    public String getStart() {
        return start;
    }


        /**
     * End value
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    private final String end;

        /**
     * End value
     * @return the value
     **/
    
    public String getEnd() {
        return end;
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
        sb.append("RangeFilter(");
        sb.append("field=").append(String.valueOf(this.field));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", start=").append(String.valueOf(this.start));
        sb.append(", end=").append(String.valueOf(this.end));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RangeFilter)) {
            return false;
        }

        RangeFilter other = (RangeFilter) o;
        return java.util.Objects.equals(this.field, other.field) &&
            java.util.Objects.equals(this.dataType, other.dataType) &&
            java.util.Objects.equals(this.start, other.start) &&
            java.util.Objects.equals(this.end, other.end);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        return result;
    }


}
