// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Shape of the driver or executor if a flexible shape is used.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ShapeConfig.Builder.class)

public final class ShapeConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"ocpus", "gpus", "memoryInGBs"})
    public ShapeConfig(Integer ocpus, Integer gpus, Integer memoryInGBs) {
        super();
        this.ocpus = ocpus;
        this.gpus = gpus;
        this.memoryInGBs = memoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Total number of OCPUs used for the driver or workers.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

                /**
         * Total number of OCPUs used for the driver or workers.
         * @param ocpus the value to set
         * @return this builder
         **/
        

        public Builder ocpus(Integer ocpus) {
        this.ocpus = ocpus;
        return this;
        }
            /**
     * Total number of GPUs used for the driver or workers.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

                /**
         * Total number of GPUs used for the driver or workers.
         * @param gpus the value to set
         * @return this builder
         **/
        

        public Builder gpus(Integer gpus) {
        this.gpus = gpus;
        return this;
        }
            /**
     * Amount of memory used for the driver or workers.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

                /**
         * Amount of memory used for the driver or workers.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        

        public Builder memoryInGBs(Integer memoryInGBs) {
        this.memoryInGBs = memoryInGBs;
        return this;
        }


        public ShapeConfig build() {
            ShapeConfig model = new ShapeConfig(this.ocpus
                    , this.gpus
                    , this.memoryInGBs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeConfig model) {
                this.ocpus(model.getOcpus());
    this.gpus(model.getGpus());
    this.memoryInGBs(model.getMemoryInGBs());
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
     * Total number of OCPUs used for the driver or workers.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

        /**
     * Total number of OCPUs used for the driver or workers.
     * @return the value
     **/
    
    public Integer getOcpus() {
        return ocpus;
    }


        /**
     * Total number of GPUs used for the driver or workers.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

        /**
     * Total number of GPUs used for the driver or workers.
     * @return the value
     **/
    
    public Integer getGpus() {
        return gpus;
    }


        /**
     * Amount of memory used for the driver or workers.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

        /**
     * Amount of memory used for the driver or workers.
     * @return the value
     **/
    
    public Integer getMemoryInGBs() {
        return memoryInGBs;
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
        sb.append("ShapeConfig(");
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeConfig)) {
            return false;
        }

        ShapeConfig other = (ShapeConfig) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus) &&
            java.util.Objects.equals(this.gpus, other.gpus) &&
            java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.gpus == null ? 43 : this.gpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        return result;
    }


}
