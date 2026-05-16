// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * LoggedModelOrder.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LoggedModelOrder.Builder.class)

public final class LoggedModelOrder  {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "ascending"})
    public LoggedModelOrder(String fieldName, Boolean ascending) {
        super();
        this.fieldName = fieldName;
        this.ascending = ascending;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * field name. Allowed values are creation_time
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("field_name")
private String fieldName;

        /**
         * field name. Allowed values are creation_time
         * @param fieldName the value to set
         * @return this builder
         **/
        

public Builder fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
}
            /**
     * Whether the order is ascending.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ascending")
private Boolean ascending;

        /**
         * Whether the order is ascending.
         * @param ascending the value to set
         * @return this builder
         **/
        

public Builder ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
}


        public LoggedModelOrder build() {
            LoggedModelOrder model = new LoggedModelOrder(this.fieldName
                , this.ascending);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggedModelOrder model) {
                this.fieldName(model.getFieldName());
    this.ascending(model.getAscending());
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
     * field name. Allowed values are creation_time
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("field_name")
    private final String fieldName;

        /**
     * field name. Allowed values are creation_time
     * @return the value
     **/
    
    public String getFieldName() {
        return fieldName;
    }


        /**
     * Whether the order is ascending.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ascending")
    private final Boolean ascending;

        /**
     * Whether the order is ascending.
     * @return the value
     **/
    
    public Boolean getAscending() {
        return ascending;
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
        sb.append("LoggedModelOrder(");
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", ascending=").append(String.valueOf(this.ascending));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggedModelOrder)) {
            return false;
        }

        LoggedModelOrder other = (LoggedModelOrder) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName) &&
            java.util.Objects.equals(this.ascending, other.ascending);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.ascending == null ? 43 : this.ascending.hashCode());
        return result;
    }


}
