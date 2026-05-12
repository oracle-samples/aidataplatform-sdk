package com.oracle.aidataplatform.dp.model;



/**
 * Worker configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkerConfig.Builder.class)

public final class WorkerConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"workerShape", "workerShapeConfig", "minWorkerCount", "maxWorkerCount"})
    public WorkerConfig(String workerShape, ShapeConfig workerShapeConfig, Integer minWorkerCount, Integer maxWorkerCount) {
        super();
        this.workerShape = workerShape;
        this.workerShapeConfig = workerShapeConfig;
        this.minWorkerCount = minWorkerCount;
        this.maxWorkerCount = maxWorkerCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Shape of the compute cluster executor instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workerShape")
private String workerShape;

        /**
         * Shape of the compute cluster executor instance.
         * @param workerShape the value to set
         * @return this builder
         **/
        

public Builder workerShape(String workerShape) {
    this.workerShape = workerShape;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
private ShapeConfig workerShapeConfig;



public Builder workerShapeConfig(ShapeConfig workerShapeConfig) {
    this.workerShapeConfig = workerShapeConfig;
    return this;
}
            /**
     * Minimum number of workers.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("minWorkerCount")
private Integer minWorkerCount;

        /**
         * Minimum number of workers.
         * @param minWorkerCount the value to set
         * @return this builder
         **/
        

public Builder minWorkerCount(Integer minWorkerCount) {
    this.minWorkerCount = minWorkerCount;
    return this;
}
            /**
     * Maximum number of workers. When this property is specified, the cluster is auto-scaled.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxWorkerCount")
private Integer maxWorkerCount;

        /**
         * Maximum number of workers. When this property is specified, the cluster is auto-scaled.
         * @param maxWorkerCount the value to set
         * @return this builder
         **/
        

public Builder maxWorkerCount(Integer maxWorkerCount) {
    this.maxWorkerCount = maxWorkerCount;
    return this;
}


        public WorkerConfig build() {
            WorkerConfig model = new WorkerConfig(this.workerShape
                , this.workerShapeConfig
                , this.minWorkerCount
                , this.maxWorkerCount);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkerConfig model) {
                this.workerShape(model.getWorkerShape());
    this.workerShapeConfig(model.getWorkerShapeConfig());
    this.minWorkerCount(model.getMinWorkerCount());
    this.maxWorkerCount(model.getMaxWorkerCount());
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
     * Shape of the compute cluster executor instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workerShape")
    private final String workerShape;

        /**
     * Shape of the compute cluster executor instance.
     * @return the value
     **/
    
    public String getWorkerShape() {
        return workerShape;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
    private final ShapeConfig workerShapeConfig;

    
    public ShapeConfig getWorkerShapeConfig() {
        return workerShapeConfig;
    }


        /**
     * Minimum number of workers.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minWorkerCount")
    private final Integer minWorkerCount;

        /**
     * Minimum number of workers.
     * @return the value
     **/
    
    public Integer getMinWorkerCount() {
        return minWorkerCount;
    }


        /**
     * Maximum number of workers. When this property is specified, the cluster is auto-scaled.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxWorkerCount")
    private final Integer maxWorkerCount;

        /**
     * Maximum number of workers. When this property is specified, the cluster is auto-scaled.
     * @return the value
     **/
    
    public Integer getMaxWorkerCount() {
        return maxWorkerCount;
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
        sb.append("WorkerConfig(");
        sb.append("workerShape=").append(String.valueOf(this.workerShape));
        sb.append(", workerShapeConfig=").append(String.valueOf(this.workerShapeConfig));
        sb.append(", minWorkerCount=").append(String.valueOf(this.minWorkerCount));
        sb.append(", maxWorkerCount=").append(String.valueOf(this.maxWorkerCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkerConfig)) {
            return false;
        }

        WorkerConfig other = (WorkerConfig) o;
        return java.util.Objects.equals(this.workerShape, other.workerShape) &&
            java.util.Objects.equals(this.workerShapeConfig, other.workerShapeConfig) &&
            java.util.Objects.equals(this.minWorkerCount, other.minWorkerCount) &&
            java.util.Objects.equals(this.maxWorkerCount, other.maxWorkerCount);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workerShape == null ? 43 : this.workerShape.hashCode());
        result = (result * PRIME) + (this.workerShapeConfig == null ? 43 : this.workerShapeConfig.hashCode());
        result = (result * PRIME) + (this.minWorkerCount == null ? 43 : this.minWorkerCount.hashCode());
        result = (result * PRIME) + (this.maxWorkerCount == null ? 43 : this.maxWorkerCount.hashCode());
        return result;
    }


}
