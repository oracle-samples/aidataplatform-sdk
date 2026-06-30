// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details of PAR URL associated with table.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ParDetails.Builder.class)

public final class ParDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"parUrl", "tableKey", "timeExpires", "parAccessType"})
    public ParDetails(String parUrl, String tableKey, java.util.Date timeExpires, ParAccessType parAccessType) {
        super();
        this.parUrl = parUrl;
        this.tableKey = tableKey;
        this.timeExpires = timeExpires;
        this.parAccessType = parAccessType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * PAR URL of the table.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parUrl")
private String parUrl;

        /**
         * PAR URL of the table.
         * @param parUrl the value to set
         * @return this builder
         **/
        

public Builder parUrl(String parUrl) {
    this.parUrl = parUrl;
    return this;
}
            /**
     * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tableKey")
private String tableKey;

        /**
         * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
         * @param tableKey the value to set
         * @return this builder
         **/
        

public Builder tableKey(String tableKey) {
    this.tableKey = tableKey;
    return this;
}
            /**
     * The date and time the table was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
private java.util.Date timeExpires;

        /**
         * The date and time the table was updated.
         * @param timeExpires the value to set
         * @return this builder
         **/
        

public Builder timeExpires(java.util.Date timeExpires) {
    this.timeExpires = timeExpires;
    return this;
}
            /**
     * The operation that can be performed on this resource.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parAccessType")
private ParAccessType parAccessType;

        /**
         * The operation that can be performed on this resource.
         * @param parAccessType the value to set
         * @return this builder
         **/
        

public Builder parAccessType(ParAccessType parAccessType) {
    this.parAccessType = parAccessType;
    return this;
}


        public ParDetails build() {
            ParDetails model = new ParDetails(this.parUrl
                , this.tableKey
                , this.timeExpires
                , this.parAccessType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParDetails model) {
                this.parUrl(model.getParUrl());
    this.tableKey(model.getTableKey());
    this.timeExpires(model.getTimeExpires());
    this.parAccessType(model.getParAccessType());
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
     * PAR URL of the table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parUrl")
    private final String parUrl;

        /**
     * PAR URL of the table.
     * @return the value
     **/
    
    public String getParUrl() {
        return parUrl;
    }


        /**
     * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tableKey")
    private final String tableKey;

        /**
     * The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.
     * @return the value
     **/
    
    public String getTableKey() {
        return tableKey;
    }


        /**
     * The date and time the table was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

        /**
     * The date and time the table was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    
        /**
     * The operation that can be performed on this resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parAccessType")
    private final ParAccessType parAccessType;

        /**
     * The operation that can be performed on this resource.
     * @return the value
     **/
    
    public ParAccessType getParAccessType() {
        return parAccessType;
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
        sb.append("ParDetails(");
        sb.append("parUrl=").append("<redacted>");
        sb.append(", tableKey=").append(String.valueOf(this.tableKey));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", parAccessType=").append(String.valueOf(this.parAccessType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParDetails)) {
            return false;
        }

        ParDetails other = (ParDetails) o;
        return java.util.Objects.equals(this.parUrl, other.parUrl) &&
            java.util.Objects.equals(this.tableKey, other.tableKey) &&
            java.util.Objects.equals(this.timeExpires, other.timeExpires) &&
            java.util.Objects.equals(this.parAccessType, other.parAccessType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parUrl == null ? 43 : this.parUrl.hashCode());
        result = (result * PRIME) + (this.tableKey == null ? 43 : this.tableKey.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.parAccessType == null ? 43 : this.parAccessType.hashCode());
        return result;
    }


}
