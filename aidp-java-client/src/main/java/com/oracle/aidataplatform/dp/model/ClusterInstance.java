package com.oracle.aidataplatform.dp.model;



/**
 * The cluster used for this run.
* The value of this field will be set when a new cluster is specified for execution and once the request to create a new cluster is successfully submitted.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterInstance.Builder.class)

public final class ClusterInstance  {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterKey", "sparkContextKey"})
    public ClusterInstance(String clusterKey, String sparkContextKey) {
        super();
        this.clusterKey = clusterKey;
        this.sparkContextKey = sparkContextKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The cluster key for the cluster configuration on which the job is executed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * The cluster key for the cluster configuration on which the job is executed.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
    return this;
}
            /**
     * The spark context used in the job run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkContextKey")
private String sparkContextKey;

        /**
         * The spark context used in the job run.
         * @param sparkContextKey the value to set
         * @return this builder
         **/
        

public Builder sparkContextKey(String sparkContextKey) {
    this.sparkContextKey = sparkContextKey;
    return this;
}


        public ClusterInstance build() {
            ClusterInstance model = new ClusterInstance(this.clusterKey
                , this.sparkContextKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterInstance model) {
                this.clusterKey(model.getClusterKey());
    this.sparkContextKey(model.getSparkContextKey());
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
     * The cluster key for the cluster configuration on which the job is executed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * The cluster key for the cluster configuration on which the job is executed.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
    }


        /**
     * The spark context used in the job run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkContextKey")
    private final String sparkContextKey;

        /**
     * The spark context used in the job run.
     * @return the value
     **/
    
    public String getSparkContextKey() {
        return sparkContextKey;
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
        sb.append("ClusterInstance(");
        sb.append("clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", sparkContextKey=").append(String.valueOf(this.sparkContextKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterInstance)) {
            return false;
        }

        ClusterInstance other = (ClusterInstance) o;
        return java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.sparkContextKey, other.sparkContextKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.sparkContextKey == null ? 43 : this.sparkContextKey.hashCode());
        return result;
    }


}
