// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The details about the new external table.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExternalTableDefinition.Builder.class)

public final class ExternalTableDefinition  {
    @Deprecated
    @java.beans.ConstructorProperties({"externalTableLocationType", "objectStorageLocationPath", "externalTableDataFormat", "txtFileDefinition"})
    public ExternalTableDefinition(ExternalTableLocationType externalTableLocationType, String objectStorageLocationPath, DataFormat externalTableDataFormat, TxtFileDefinition txtFileDefinition) {
        super();
        this.externalTableLocationType = externalTableLocationType;
        this.objectStorageLocationPath = objectStorageLocationPath;
        this.externalTableDataFormat = externalTableDataFormat;
        this.txtFileDefinition = txtFileDefinition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * External table location type, either object store location or mount location.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalTableLocationType")
private ExternalTableLocationType externalTableLocationType;

        /**
         * External table location type, either object store location or mount location.
         * @param externalTableLocationType the value to set
         * @return this builder
         **/
        

public Builder externalTableLocationType(ExternalTableLocationType externalTableLocationType) {
    this.externalTableLocationType = externalTableLocationType;
    return this;
}
            /**
     * The file location from which table properties are loaded.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("objectStorageLocationPath")
private String objectStorageLocationPath;

        /**
         * The file location from which table properties are loaded.
         * @param objectStorageLocationPath the value to set
         * @return this builder
         **/
        

public Builder objectStorageLocationPath(String objectStorageLocationPath) {
    this.objectStorageLocationPath = objectStorageLocationPath;
    return this;
}
            /**
     * External table data format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalTableDataFormat")
private DataFormat externalTableDataFormat;

        /**
         * External table data format.
         * @param externalTableDataFormat the value to set
         * @return this builder
         **/
        

public Builder externalTableDataFormat(DataFormat externalTableDataFormat) {
    this.externalTableDataFormat = externalTableDataFormat;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("txtFileDefinition")
private TxtFileDefinition txtFileDefinition;



public Builder txtFileDefinition(TxtFileDefinition txtFileDefinition) {
    this.txtFileDefinition = txtFileDefinition;
    return this;
}


        public ExternalTableDefinition build() {
            ExternalTableDefinition model = new ExternalTableDefinition(this.externalTableLocationType
                , this.objectStorageLocationPath
                , this.externalTableDataFormat
                , this.txtFileDefinition);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalTableDefinition model) {
                this.externalTableLocationType(model.getExternalTableLocationType());
    this.objectStorageLocationPath(model.getObjectStorageLocationPath());
    this.externalTableDataFormat(model.getExternalTableDataFormat());
    this.txtFileDefinition(model.getTxtFileDefinition());
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
     * External table location type, either object store location or mount location.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalTableLocationType")
    private final ExternalTableLocationType externalTableLocationType;

        /**
     * External table location type, either object store location or mount location.
     * @return the value
     **/
    
    public ExternalTableLocationType getExternalTableLocationType() {
        return externalTableLocationType;
    }


        /**
     * The file location from which table properties are loaded.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageLocationPath")
    private final String objectStorageLocationPath;

        /**
     * The file location from which table properties are loaded.
     * @return the value
     **/
    
    public String getObjectStorageLocationPath() {
        return objectStorageLocationPath;
    }

    
        /**
     * External table data format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalTableDataFormat")
    private final DataFormat externalTableDataFormat;

        /**
     * External table data format.
     * @return the value
     **/
    
    public DataFormat getExternalTableDataFormat() {
        return externalTableDataFormat;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("txtFileDefinition")
    private final TxtFileDefinition txtFileDefinition;

    
    public TxtFileDefinition getTxtFileDefinition() {
        return txtFileDefinition;
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
        sb.append("ExternalTableDefinition(");
        sb.append("externalTableLocationType=").append(String.valueOf(this.externalTableLocationType));
        sb.append(", objectStorageLocationPath=").append(String.valueOf(this.objectStorageLocationPath));
        sb.append(", externalTableDataFormat=").append(String.valueOf(this.externalTableDataFormat));
        sb.append(", txtFileDefinition=").append(String.valueOf(this.txtFileDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalTableDefinition)) {
            return false;
        }

        ExternalTableDefinition other = (ExternalTableDefinition) o;
        return java.util.Objects.equals(this.externalTableLocationType, other.externalTableLocationType) &&
            java.util.Objects.equals(this.objectStorageLocationPath, other.objectStorageLocationPath) &&
            java.util.Objects.equals(this.externalTableDataFormat, other.externalTableDataFormat) &&
            java.util.Objects.equals(this.txtFileDefinition, other.txtFileDefinition);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.externalTableLocationType == null ? 43 : this.externalTableLocationType.hashCode());
        result = (result * PRIME) + (this.objectStorageLocationPath == null ? 43 : this.objectStorageLocationPath.hashCode());
        result = (result * PRIME) + (this.externalTableDataFormat == null ? 43 : this.externalTableDataFormat.hashCode());
        result = (result * PRIME) + (this.txtFileDefinition == null ? 43 : this.txtFileDefinition.hashCode());
        return result;
    }


}
