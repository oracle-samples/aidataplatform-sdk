// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * SQL metadata for a column in an OAC data object.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectColumnSqlInfo.Builder.class)

public final class OacObjectColumnSqlInfo  {
    @Deprecated
    @java.beans.ConstructorProperties({"aggRule", "dataType", "aggType"})
    public OacObjectColumnSqlInfo(String aggRule, String dataType, String aggType) {
        super();
        this.aggRule = aggRule;
        this.dataType = dataType;
        this.aggType = aggType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The aggregation rule for the column in the OAC data object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aggRule")
private String aggRule;

        /**
         * The aggregation rule for the column in the OAC data object.
         * @param aggRule the value to set
         * @return this builder
         **/
        

public Builder aggRule(String aggRule) {
    this.aggRule = aggRule;
    return this;
}
            /**
     * The data type for the column in the OAC data object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dataType")
private String dataType;

        /**
         * The data type for the column in the OAC data object.
         * @param dataType the value to set
         * @return this builder
         **/
        

public Builder dataType(String dataType) {
    this.dataType = dataType;
    return this;
}
            /**
     * The aggregation type for the column in the OAC data object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aggType")
private String aggType;

        /**
         * The aggregation type for the column in the OAC data object.
         * @param aggType the value to set
         * @return this builder
         **/
        

public Builder aggType(String aggType) {
    this.aggType = aggType;
    return this;
}


        public OacObjectColumnSqlInfo build() {
            OacObjectColumnSqlInfo model = new OacObjectColumnSqlInfo(this.aggRule
                , this.dataType
                , this.aggType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectColumnSqlInfo model) {
                this.aggRule(model.getAggRule());
    this.dataType(model.getDataType());
    this.aggType(model.getAggType());
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
     * The aggregation rule for the column in the OAC data object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggRule")
    private final String aggRule;

        /**
     * The aggregation rule for the column in the OAC data object.
     * @return the value
     **/
    
    public String getAggRule() {
        return aggRule;
    }


        /**
     * The data type for the column in the OAC data object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

        /**
     * The data type for the column in the OAC data object.
     * @return the value
     **/
    
    public String getDataType() {
        return dataType;
    }


        /**
     * The aggregation type for the column in the OAC data object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggType")
    private final String aggType;

        /**
     * The aggregation type for the column in the OAC data object.
     * @return the value
     **/
    
    public String getAggType() {
        return aggType;
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
        sb.append("OacObjectColumnSqlInfo(");
        sb.append("aggRule=").append(String.valueOf(this.aggRule));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", aggType=").append(String.valueOf(this.aggType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectColumnSqlInfo)) {
            return false;
        }

        OacObjectColumnSqlInfo other = (OacObjectColumnSqlInfo) o;
        return java.util.Objects.equals(this.aggRule, other.aggRule) &&
            java.util.Objects.equals(this.dataType, other.dataType) &&
            java.util.Objects.equals(this.aggType, other.aggType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.aggRule == null ? 43 : this.aggRule.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.aggType == null ? 43 : this.aggType.hashCode());
        return result;
    }


}
