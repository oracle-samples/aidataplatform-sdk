// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * The cluster configuration that can be shared by tasks in the job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobCluster.Builder.class)

public final class JobCluster  {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterKey", "clusterName", "newCluster"})
    public JobCluster(String clusterKey, String clusterName, NewClusterConfiguration newCluster) {
        super();
        this.clusterKey = clusterKey;
        this.clusterName = clusterName;
        this.newCluster = newCluster;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * A unique identifier for the job cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * A unique identifier for the job cluster.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("newCluster")
private NewClusterConfiguration newCluster;



public Builder newCluster(NewClusterConfiguration newCluster) {
    this.newCluster = newCluster;
    return this;
}


        public JobCluster build() {
            JobCluster model = new JobCluster(this.clusterKey
                , this.clusterName
                , this.newCluster);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobCluster model) {
                this.clusterKey(model.getClusterKey());
    this.clusterName(model.getClusterName());
    this.newCluster(model.getNewCluster());
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
     * A unique identifier for the job cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * A unique identifier for the job cluster.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("newCluster")
    private final NewClusterConfiguration newCluster;

    
    public NewClusterConfiguration getNewCluster() {
        return newCluster;
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
        sb.append("JobCluster(");
        sb.append("clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", newCluster=").append(String.valueOf(this.newCluster));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobCluster)) {
            return false;
        }

        JobCluster other = (JobCluster) o;
        return java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.clusterName, other.clusterName) &&
            java.util.Objects.equals(this.newCluster, other.newCluster);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result = (result * PRIME) + (this.newCluster == null ? 43 : this.newCluster.hashCode());
        return result;
    }


}
