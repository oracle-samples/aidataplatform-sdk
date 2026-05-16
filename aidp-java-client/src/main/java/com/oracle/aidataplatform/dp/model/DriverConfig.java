// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Driver configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DriverConfig.Builder.class)

public final class DriverConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"driverNodeType", "driverShape", "driverShapeConfig"})
    public DriverConfig(String driverNodeType, String driverShape, ShapeConfig driverShapeConfig) {
        super();
        this.driverNodeType = driverNodeType;
        this.driverShape = driverShape;
        this.driverShapeConfig = driverShapeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Node type of optional driver node that encodes the driver node shape and associated resources.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("driverNodeType")
private String driverNodeType;

        /**
         * Node type of optional driver node that encodes the driver node shape and associated resources.
         * @param driverNodeType the value to set
         * @return this builder
         **/
        

public Builder driverNodeType(String driverNodeType) {
    this.driverNodeType = driverNodeType;
    return this;
}
            /**
     * Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("driverShape")
private String driverShape;

        /**
         * Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
         * @param driverShape the value to set
         * @return this builder
         **/
        

public Builder driverShape(String driverShape) {
    this.driverShape = driverShape;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
private ShapeConfig driverShapeConfig;



public Builder driverShapeConfig(ShapeConfig driverShapeConfig) {
    this.driverShapeConfig = driverShapeConfig;
    return this;
}


        public DriverConfig build() {
            DriverConfig model = new DriverConfig(this.driverNodeType
                , this.driverShape
                , this.driverShapeConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DriverConfig model) {
                this.driverNodeType(model.getDriverNodeType());
    this.driverShape(model.getDriverShape());
    this.driverShapeConfig(model.getDriverShapeConfig());
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
     * Node type of optional driver node that encodes the driver node shape and associated resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("driverNodeType")
    private final String driverNodeType;

        /**
     * Node type of optional driver node that encodes the driver node shape and associated resources.
     * @return the value
     **/
    
    public String getDriverNodeType() {
        return driverNodeType;
    }


        /**
     * Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

        /**
     * Shape of compute cluster driver instance. Example - VM.Standard2.x, VM.Standard.E3.Flex
     * @return the value
     **/
    
    public String getDriverShape() {
        return driverShape;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
    private final ShapeConfig driverShapeConfig;

    
    public ShapeConfig getDriverShapeConfig() {
        return driverShapeConfig;
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
        sb.append("DriverConfig(");
        sb.append("driverNodeType=").append(String.valueOf(this.driverNodeType));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DriverConfig)) {
            return false;
        }

        DriverConfig other = (DriverConfig) o;
        return java.util.Objects.equals(this.driverNodeType, other.driverNodeType) &&
            java.util.Objects.equals(this.driverShape, other.driverShape) &&
            java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.driverNodeType == null ? 43 : this.driverNodeType.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result = (result * PRIME) + (this.driverShapeConfig == null ? 43 : this.driverShapeConfig.hashCode());
        return result;
    }


}
