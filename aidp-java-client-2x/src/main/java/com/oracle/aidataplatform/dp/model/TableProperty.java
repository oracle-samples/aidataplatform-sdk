// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The property of the table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TableProperty.Builder.class)

public final class TableProperty  {
    @Deprecated
    @java.beans.ConstructorProperties({"propertyName", "propertyValue"})
    public TableProperty(String propertyName, String propertyValue) {
        super();
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Property name.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

                /**
         * Property name.
         * @param propertyName the value to set
         * @return this builder
         **/
        

        public Builder propertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
        }
            /**
     * Property value.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
        private String propertyValue;

                /**
         * Property value.
         * @param propertyValue the value to set
         * @return this builder
         **/
        

        public Builder propertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
        }


        public TableProperty build() {
            TableProperty model = new TableProperty(this.propertyName
                    , this.propertyValue);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableProperty model) {
                this.propertyName(model.getPropertyName());
    this.propertyValue(model.getPropertyValue());
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
     * Property name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    private final String propertyName;

        /**
     * Property name.
     * @return the value
     **/
    
    public String getPropertyName() {
        return propertyName;
    }


        /**
     * Property value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
    private final String propertyValue;

        /**
     * Property value.
     * @return the value
     **/
    
    public String getPropertyValue() {
        return propertyValue;
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
        sb.append("TableProperty(");
        sb.append("propertyName=").append(String.valueOf(this.propertyName));
        sb.append(", propertyValue=").append(String.valueOf(this.propertyValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableProperty)) {
            return false;
        }

        TableProperty other = (TableProperty) o;
        return java.util.Objects.equals(this.propertyName, other.propertyName) &&
            java.util.Objects.equals(this.propertyValue, other.propertyValue);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.propertyName == null ? 43 : this.propertyName.hashCode());
        result = (result * PRIME) + (this.propertyValue == null ? 43 : this.propertyValue.hashCode());
        return result;
    }


}
