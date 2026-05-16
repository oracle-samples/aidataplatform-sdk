// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The details about the new managed table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManagedTableDefinition.Builder.class)

public final class ManagedTableDefinition  {
    @Deprecated
    @java.beans.ConstructorProperties({"managedTableDataFormat"})
    public ManagedTableDefinition(DataFormat managedTableDataFormat) {
        super();
        this.managedTableDataFormat = managedTableDataFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Data format of the managed table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("managedTableDataFormat")
        private DataFormat managedTableDataFormat;

                /**
         * Data format of the managed table.
         * @param managedTableDataFormat the value to set
         * @return this builder
         **/
        

        public Builder managedTableDataFormat(DataFormat managedTableDataFormat) {
        this.managedTableDataFormat = managedTableDataFormat;
        return this;
        }


        public ManagedTableDefinition build() {
            ManagedTableDefinition model = new ManagedTableDefinition(this.managedTableDataFormat);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedTableDefinition model) {
                this.managedTableDataFormat(model.getManagedTableDataFormat());
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
     * Data format of the managed table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("managedTableDataFormat")
    private final DataFormat managedTableDataFormat;

        /**
     * Data format of the managed table.
     * @return the value
     **/
    
    public DataFormat getManagedTableDataFormat() {
        return managedTableDataFormat;
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
        sb.append("ManagedTableDefinition(");
        sb.append("managedTableDataFormat=").append(String.valueOf(this.managedTableDataFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedTableDefinition)) {
            return false;
        }

        ManagedTableDefinition other = (ManagedTableDefinition) o;
        return java.util.Objects.equals(this.managedTableDataFormat, other.managedTableDataFormat);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.managedTableDataFormat == null ? 43 : this.managedTableDataFormat.hashCode());
        return result;
    }


}
