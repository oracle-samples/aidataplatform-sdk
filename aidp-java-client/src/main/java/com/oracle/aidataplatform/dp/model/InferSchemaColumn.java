// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Column inferred from location.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferSchemaColumn.Builder.class)

public final class InferSchemaColumn  {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "fieldType", "isPartition", "rank"})
    public InferSchemaColumn(String fieldName, String fieldType, Boolean isPartition, Integer rank) {
        super();
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.isPartition = isPartition;
        this.rank = rank;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fieldName")
private String fieldName;

        /**
         * Name of the column.
         * @param fieldName the value to set
         * @return this builder
         **/
        

public Builder fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
}
            /**
     * Type of the column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fieldType")
private String fieldType;

        /**
         * Type of the column.
         * @param fieldType the value to set
         * @return this builder
         **/
        

public Builder fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
}
            /**
     * Boolean value indicating if this column is partition column.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isPartition")
private Boolean isPartition;

        /**
         * Boolean value indicating if this column is partition column.
         * @param isPartition the value to set
         * @return this builder
         **/
        

public Builder isPartition(Boolean isPartition) {
    this.isPartition = isPartition;
    return this;
}
            /**
     * For partition columns rank value indicates level, for non-partition column the value will be zero.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rank")
private Integer rank;

        /**
         * For partition columns rank value indicates level, for non-partition column the value will be zero.
         * @param rank the value to set
         * @return this builder
         **/
        

public Builder rank(Integer rank) {
    this.rank = rank;
    return this;
}


        public InferSchemaColumn build() {
            InferSchemaColumn model = new InferSchemaColumn(this.fieldName
                , this.fieldType
                , this.isPartition
                , this.rank);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferSchemaColumn model) {
                this.fieldName(model.getFieldName());
    this.fieldType(model.getFieldType());
    this.isPartition(model.getIsPartition());
    this.rank(model.getRank());
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
     * Name of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

        /**
     * Name of the column.
     * @return the value
     **/
    
    public String getFieldName() {
        return fieldName;
    }


        /**
     * Type of the column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final String fieldType;

        /**
     * Type of the column.
     * @return the value
     **/
    
    public String getFieldType() {
        return fieldType;
    }


        /**
     * Boolean value indicating if this column is partition column.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPartition")
    private final Boolean isPartition;

        /**
     * Boolean value indicating if this column is partition column.
     * @return the value
     **/
    
    public Boolean getIsPartition() {
        return isPartition;
    }


        /**
     * For partition columns rank value indicates level, for non-partition column the value will be zero.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rank")
    private final Integer rank;

        /**
     * For partition columns rank value indicates level, for non-partition column the value will be zero.
     * @return the value
     **/
    
    public Integer getRank() {
        return rank;
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
        sb.append("InferSchemaColumn(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldType=").append(String.valueOf(this.fieldType));
        sb.append(", isPartition=").append(String.valueOf(this.isPartition));
        sb.append(", rank=").append(String.valueOf(this.rank));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferSchemaColumn)) {
            return false;
        }

        InferSchemaColumn other = (InferSchemaColumn) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName) &&
            java.util.Objects.equals(this.fieldType, other.fieldType) &&
            java.util.Objects.equals(this.isPartition, other.isPartition) &&
            java.util.Objects.equals(this.rank, other.rank);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + (this.isPartition == null ? 43 : this.isPartition.hashCode());
        result = (result * PRIME) + (this.rank == null ? 43 : this.rank.hashCode());
        return result;
    }


}
