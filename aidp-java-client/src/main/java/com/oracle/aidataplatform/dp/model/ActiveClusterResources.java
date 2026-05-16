// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Active resources of a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ActiveClusterResources.Builder.class)

public final class ActiveClusterResources  {
    @Deprecated
    @java.beans.ConstructorProperties({"activeExecutorCount", "activeCores", "activeGpuCores", "activeMemoryInGBs", "activeGpuMemoryInGBs"})
    public ActiveClusterResources(Double activeExecutorCount, Double activeCores, Double activeGpuCores, Double activeMemoryInGBs, Double activeGpuMemoryInGBs) {
        super();
        this.activeExecutorCount = activeExecutorCount;
        this.activeCores = activeCores;
        this.activeGpuCores = activeGpuCores;
        this.activeMemoryInGBs = activeMemoryInGBs;
        this.activeGpuMemoryInGBs = activeGpuMemoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Count of active executors.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activeExecutorCount")
private Double activeExecutorCount;

        /**
         * Count of active executors.
         * @param activeExecutorCount the value to set
         * @return this builder
         **/
        

public Builder activeExecutorCount(Double activeExecutorCount) {
    this.activeExecutorCount = activeExecutorCount;
    return this;
}
            /**
     * Count of active cores.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activeCores")
private Double activeCores;

        /**
         * Count of active cores.
         * @param activeCores the value to set
         * @return this builder
         **/
        

public Builder activeCores(Double activeCores) {
    this.activeCores = activeCores;
    return this;
}
            /**
     * Count of active GPU cores.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activeGpuCores")
private Double activeGpuCores;

        /**
         * Count of active GPU cores.
         * @param activeGpuCores the value to set
         * @return this builder
         **/
        

public Builder activeGpuCores(Double activeGpuCores) {
    this.activeGpuCores = activeGpuCores;
    return this;
}
            /**
     * Active memory in GB.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activeMemoryInGBs")
private Double activeMemoryInGBs;

        /**
         * Active memory in GB.
         * @param activeMemoryInGBs the value to set
         * @return this builder
         **/
        

public Builder activeMemoryInGBs(Double activeMemoryInGBs) {
    this.activeMemoryInGBs = activeMemoryInGBs;
    return this;
}
            /**
     * Active GPU memory in GB.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("activeGpuMemoryInGBs")
private Double activeGpuMemoryInGBs;

        /**
         * Active GPU memory in GB.
         * @param activeGpuMemoryInGBs the value to set
         * @return this builder
         **/
        

public Builder activeGpuMemoryInGBs(Double activeGpuMemoryInGBs) {
    this.activeGpuMemoryInGBs = activeGpuMemoryInGBs;
    return this;
}


        public ActiveClusterResources build() {
            ActiveClusterResources model = new ActiveClusterResources(this.activeExecutorCount
                , this.activeCores
                , this.activeGpuCores
                , this.activeMemoryInGBs
                , this.activeGpuMemoryInGBs);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActiveClusterResources model) {
                this.activeExecutorCount(model.getActiveExecutorCount());
    this.activeCores(model.getActiveCores());
    this.activeGpuCores(model.getActiveGpuCores());
    this.activeMemoryInGBs(model.getActiveMemoryInGBs());
    this.activeGpuMemoryInGBs(model.getActiveGpuMemoryInGBs());
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
     * Count of active executors.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activeExecutorCount")
    private final Double activeExecutorCount;

        /**
     * Count of active executors.
     * @return the value
     **/
    
    public Double getActiveExecutorCount() {
        return activeExecutorCount;
    }


        /**
     * Count of active cores.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activeCores")
    private final Double activeCores;

        /**
     * Count of active cores.
     * @return the value
     **/
    
    public Double getActiveCores() {
        return activeCores;
    }


        /**
     * Count of active GPU cores.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activeGpuCores")
    private final Double activeGpuCores;

        /**
     * Count of active GPU cores.
     * @return the value
     **/
    
    public Double getActiveGpuCores() {
        return activeGpuCores;
    }


        /**
     * Active memory in GB.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activeMemoryInGBs")
    private final Double activeMemoryInGBs;

        /**
     * Active memory in GB.
     * @return the value
     **/
    
    public Double getActiveMemoryInGBs() {
        return activeMemoryInGBs;
    }


        /**
     * Active GPU memory in GB.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("activeGpuMemoryInGBs")
    private final Double activeGpuMemoryInGBs;

        /**
     * Active GPU memory in GB.
     * @return the value
     **/
    
    public Double getActiveGpuMemoryInGBs() {
        return activeGpuMemoryInGBs;
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
        sb.append("ActiveClusterResources(");
        sb.append("activeExecutorCount=").append(String.valueOf(this.activeExecutorCount));
        sb.append(", activeCores=").append(String.valueOf(this.activeCores));
        sb.append(", activeGpuCores=").append(String.valueOf(this.activeGpuCores));
        sb.append(", activeMemoryInGBs=").append(String.valueOf(this.activeMemoryInGBs));
        sb.append(", activeGpuMemoryInGBs=").append(String.valueOf(this.activeGpuMemoryInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActiveClusterResources)) {
            return false;
        }

        ActiveClusterResources other = (ActiveClusterResources) o;
        return java.util.Objects.equals(this.activeExecutorCount, other.activeExecutorCount) &&
            java.util.Objects.equals(this.activeCores, other.activeCores) &&
            java.util.Objects.equals(this.activeGpuCores, other.activeGpuCores) &&
            java.util.Objects.equals(this.activeMemoryInGBs, other.activeMemoryInGBs) &&
            java.util.Objects.equals(this.activeGpuMemoryInGBs, other.activeGpuMemoryInGBs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.activeExecutorCount == null ? 43 : this.activeExecutorCount.hashCode());
        result = (result * PRIME) + (this.activeCores == null ? 43 : this.activeCores.hashCode());
        result = (result * PRIME) + (this.activeGpuCores == null ? 43 : this.activeGpuCores.hashCode());
        result = (result * PRIME) + (this.activeMemoryInGBs == null ? 43 : this.activeMemoryInGBs.hashCode());
        result = (result * PRIME) + (this.activeGpuMemoryInGBs == null ? 43 : this.activeGpuMemoryInGBs.hashCode());
        return result;
    }


}
