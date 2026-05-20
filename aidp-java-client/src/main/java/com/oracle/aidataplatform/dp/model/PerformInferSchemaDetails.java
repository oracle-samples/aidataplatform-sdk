// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Infer schema details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PerformInferSchemaDetails.Builder.class)

public final class PerformInferSchemaDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"dataFormat", "location", "numberOfPartitions", "inferSchemaProperties"})
    public PerformInferSchemaDetails(DataFormat dataFormat, String location, Integer numberOfPartitions, java.util.List<InferSchemaProperties> inferSchemaProperties) {
        super();
        this.dataFormat = dataFormat;
        this.location = location;
        this.numberOfPartitions = numberOfPartitions;
        this.inferSchemaProperties = inferSchemaProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Data format of the schema location.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
private DataFormat dataFormat;

        /**
         * Data format of the schema location.
         * @param dataFormat the value to set
         * @return this builder
         **/
        

public Builder dataFormat(DataFormat dataFormat) {
    this.dataFormat = dataFormat;
    return this;
}
            /**
     * Location of the table to infer schema.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("location")
private String location;

        /**
         * Location of the table to infer schema.
         * @param location the value to set
         * @return this builder
         **/
        

public Builder location(String location) {
    this.location = location;
    return this;
}
            /**
     * Number of root partition folders to scan.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("numberOfPartitions")
private Integer numberOfPartitions;

        /**
         * Number of root partition folders to scan.
         * @param numberOfPartitions the value to set
         * @return this builder
         **/
        

public Builder numberOfPartitions(Integer numberOfPartitions) {
    this.numberOfPartitions = numberOfPartitions;
    return this;
}
            /**
     * Properties which are needed for inferring schema.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("inferSchemaProperties")
private java.util.List<InferSchemaProperties> inferSchemaProperties;

        /**
         * Properties which are needed for inferring schema.
         * @param inferSchemaProperties the value to set
         * @return this builder
         **/
        

public Builder inferSchemaProperties(java.util.List<InferSchemaProperties> inferSchemaProperties) {
    this.inferSchemaProperties = inferSchemaProperties;
    return this;
}


        public PerformInferSchemaDetails build() {
            PerformInferSchemaDetails model = new PerformInferSchemaDetails(this.dataFormat
                , this.location
                , this.numberOfPartitions
                , this.inferSchemaProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformInferSchemaDetails model) {
                this.dataFormat(model.getDataFormat());
    this.location(model.getLocation());
    this.numberOfPartitions(model.getNumberOfPartitions());
    this.inferSchemaProperties(model.getInferSchemaProperties());
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
     * Data format of the schema location.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
    private final DataFormat dataFormat;

        /**
     * Data format of the schema location.
     * @return the value
     **/
    
    public DataFormat getDataFormat() {
        return dataFormat;
    }


        /**
     * Location of the table to infer schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

        /**
     * Location of the table to infer schema.
     * @return the value
     **/
    
    public String getLocation() {
        return location;
    }


        /**
     * Number of root partition folders to scan.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfPartitions")
    private final Integer numberOfPartitions;

        /**
     * Number of root partition folders to scan.
     * @return the value
     **/
    
    public Integer getNumberOfPartitions() {
        return numberOfPartitions;
    }


        /**
     * Properties which are needed for inferring schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("inferSchemaProperties")
    private final java.util.List<InferSchemaProperties> inferSchemaProperties;

        /**
     * Properties which are needed for inferring schema.
     * @return the value
     **/
    
    public java.util.List<InferSchemaProperties> getInferSchemaProperties() {
        return inferSchemaProperties;
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
        sb.append("PerformInferSchemaDetails(");
        sb.append("dataFormat=").append(String.valueOf(this.dataFormat));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", numberOfPartitions=").append(String.valueOf(this.numberOfPartitions));
        sb.append(", inferSchemaProperties=").append(String.valueOf(this.inferSchemaProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformInferSchemaDetails)) {
            return false;
        }

        PerformInferSchemaDetails other = (PerformInferSchemaDetails) o;
        return java.util.Objects.equals(this.dataFormat, other.dataFormat) &&
            java.util.Objects.equals(this.location, other.location) &&
            java.util.Objects.equals(this.numberOfPartitions, other.numberOfPartitions) &&
            java.util.Objects.equals(this.inferSchemaProperties, other.inferSchemaProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataFormat == null ? 43 : this.dataFormat.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.numberOfPartitions == null ? 43 : this.numberOfPartitions.hashCode());
        result = (result * PRIME) + (this.inferSchemaProperties == null ? 43 : this.inferSchemaProperties.hashCode());
        return result;
    }


}
