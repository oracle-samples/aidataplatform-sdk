// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Rows for SQL result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SqlResult.Builder.class)

public final class SqlResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"rows"})
    public SqlResult(java.util.List<java.util.Map<String, String>> rows) {
        super();
        this.rows = rows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Array of result rows with dynamic columns.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rows")
private java.util.List<java.util.Map<String, String>> rows;

        /**
         * Array of result rows with dynamic columns.
         * @param rows the value to set
         * @return this builder
         **/
        

public Builder rows(java.util.List<java.util.Map<String, String>> rows) {
    this.rows = rows;
    return this;
}


        public SqlResult build() {
            SqlResult model = new SqlResult(this.rows);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlResult model) {
                this.rows(model.getRows());
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
     * Array of result rows with dynamic columns.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rows")
    private final java.util.List<java.util.Map<String, String>> rows;

        /**
     * Array of result rows with dynamic columns.
     * @return the value
     **/
    
    public java.util.List<java.util.Map<String, String>> getRows() {
        return rows;
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
        sb.append("SqlResult(");
        sb.append("rows=").append(String.valueOf(this.rows));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlResult)) {
            return false;
        }

        SqlResult other = (SqlResult) o;
        return java.util.Objects.equals(this.rows, other.rows);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rows == null ? 43 : this.rows.hashCode());
        return result;
    }


}
