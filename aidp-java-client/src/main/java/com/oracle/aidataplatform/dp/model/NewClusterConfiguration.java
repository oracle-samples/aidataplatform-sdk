// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The cluster configuration to create a new cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NewClusterConfiguration.Builder.class)

public final class NewClusterConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"numWorkers", "autoScale", "clusterName", "sparkVersion", "sparkConf"})
    public NewClusterConfiguration(Integer numWorkers, AutoScale autoScale, String clusterName, String sparkVersion, String sparkConf) {
        super();
        this.numWorkers = numWorkers;
        this.autoScale = autoScale;
        this.clusterName = clusterName;
        this.sparkVersion = sparkVersion;
        this.sparkConf = sparkConf;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Number of worker nodes configured for this cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("numWorkers")
private Integer numWorkers;

        /**
         * Number of worker nodes configured for this cluster.
         * @param numWorkers the value to set
         * @return this builder
         **/
        

public Builder numWorkers(Integer numWorkers) {
    this.numWorkers = numWorkers;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("autoScale")
private AutoScale autoScale;



public Builder autoScale(AutoScale autoScale) {
    this.autoScale = autoScale;
    return this;
}
            /**
     * A unique name for the job cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterName")
private String clusterName;

        /**
         * A unique name for the job cluster.
         * @param clusterName the value to set
         * @return this builder
         **/
        

public Builder clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
}
            /**
     * The Spark version used to run the application.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
private String sparkVersion;

        /**
         * The Spark version used to run the application.
         * @param sparkVersion the value to set
         * @return this builder
         **/
        

public Builder sparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
}
            /**
     * The spark configuration in key-value pairs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkConf")
private String sparkConf;

        /**
         * The spark configuration in key-value pairs.
         * @param sparkConf the value to set
         * @return this builder
         **/
        

public Builder sparkConf(String sparkConf) {
    this.sparkConf = sparkConf;
    return this;
}


        public NewClusterConfiguration build() {
            NewClusterConfiguration model = new NewClusterConfiguration(this.numWorkers
                , this.autoScale
                , this.clusterName
                , this.sparkVersion
                , this.sparkConf);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewClusterConfiguration model) {
                this.numWorkers(model.getNumWorkers());
    this.autoScale(model.getAutoScale());
    this.clusterName(model.getClusterName());
    this.sparkVersion(model.getSparkVersion());
    this.sparkConf(model.getSparkConf());
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
     * Number of worker nodes configured for this cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("numWorkers")
    private final Integer numWorkers;

        /**
     * Number of worker nodes configured for this cluster.
     * @return the value
     **/
    
    public Integer getNumWorkers() {
        return numWorkers;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("autoScale")
    private final AutoScale autoScale;

    
    public AutoScale getAutoScale() {
        return autoScale;
    }


        /**
     * A unique name for the job cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

        /**
     * A unique name for the job cluster.
     * @return the value
     **/
    
    public String getClusterName() {
        return clusterName;
    }


        /**
     * The Spark version used to run the application.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

        /**
     * The Spark version used to run the application.
     * @return the value
     **/
    
    public String getSparkVersion() {
        return sparkVersion;
    }


        /**
     * The spark configuration in key-value pairs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkConf")
    private final String sparkConf;

        /**
     * The spark configuration in key-value pairs.
     * @return the value
     **/
    
    public String getSparkConf() {
        return sparkConf;
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
        sb.append("NewClusterConfiguration(");
        sb.append("numWorkers=").append(String.valueOf(this.numWorkers));
        sb.append(", autoScale=").append(String.valueOf(this.autoScale));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", sparkConf=").append(String.valueOf(this.sparkConf));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewClusterConfiguration)) {
            return false;
        }

        NewClusterConfiguration other = (NewClusterConfiguration) o;
        return java.util.Objects.equals(this.numWorkers, other.numWorkers) &&
            java.util.Objects.equals(this.autoScale, other.autoScale) &&
            java.util.Objects.equals(this.clusterName, other.clusterName) &&
            java.util.Objects.equals(this.sparkVersion, other.sparkVersion) &&
            java.util.Objects.equals(this.sparkConf, other.sparkConf);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.numWorkers == null ? 43 : this.numWorkers.hashCode());
        result = (result * PRIME) + (this.autoScale == null ? 43 : this.autoScale.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.sparkConf == null ? 43 : this.sparkConf.hashCode());
        return result;
    }


}
