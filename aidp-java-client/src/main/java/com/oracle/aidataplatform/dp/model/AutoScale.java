// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Properties required to automatically scale the clusters up and down based on load.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AutoScale.Builder.class)

public final class AutoScale  {
    @Deprecated
    @java.beans.ConstructorProperties({"minWorkers", "maxWorkers"})
    public AutoScale(Integer minWorkers, Integer maxWorkers) {
        super();
        this.minWorkers = minWorkers;
        this.maxWorkers = maxWorkers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The minimum number of workers to which the cluster can scale down when underused.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("minWorkers")
private Integer minWorkers;

        /**
         * The minimum number of workers to which the cluster can scale down when underused.
         * @param minWorkers the value to set
         * @return this builder
         **/
        

public Builder minWorkers(Integer minWorkers) {
    this.minWorkers = minWorkers;
    return this;
}
            /**
     * The maximum number of workers to which the cluster can scale up when overloaded.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxWorkers")
private Integer maxWorkers;

        /**
         * The maximum number of workers to which the cluster can scale up when overloaded.
         * @param maxWorkers the value to set
         * @return this builder
         **/
        

public Builder maxWorkers(Integer maxWorkers) {
    this.maxWorkers = maxWorkers;
    return this;
}


        public AutoScale build() {
            AutoScale model = new AutoScale(this.minWorkers
                , this.maxWorkers);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScale model) {
                this.minWorkers(model.getMinWorkers());
    this.maxWorkers(model.getMaxWorkers());
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
     * The minimum number of workers to which the cluster can scale down when underused.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minWorkers")
    private final Integer minWorkers;

        /**
     * The minimum number of workers to which the cluster can scale down when underused.
     * @return the value
     **/
    
    public Integer getMinWorkers() {
        return minWorkers;
    }


        /**
     * The maximum number of workers to which the cluster can scale up when overloaded.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxWorkers")
    private final Integer maxWorkers;

        /**
     * The maximum number of workers to which the cluster can scale up when overloaded.
     * @return the value
     **/
    
    public Integer getMaxWorkers() {
        return maxWorkers;
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
        sb.append("AutoScale(");
        sb.append("minWorkers=").append(String.valueOf(this.minWorkers));
        sb.append(", maxWorkers=").append(String.valueOf(this.maxWorkers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScale)) {
            return false;
        }

        AutoScale other = (AutoScale) o;
        return java.util.Objects.equals(this.minWorkers, other.minWorkers) &&
            java.util.Objects.equals(this.maxWorkers, other.maxWorkers);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minWorkers == null ? 43 : this.minWorkers.hashCode());
        result = (result * PRIME) + (this.maxWorkers == null ? 43 : this.maxWorkers.hashCode());
        return result;
    }


}
