// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * AI Compute replica configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ReplicaConfig.Builder.class)

public final class ReplicaConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"minReplica", "maxReplica"})
    public ReplicaConfig(Integer minReplica, Integer maxReplica) {
        super();
        this.minReplica = minReplica;
        this.maxReplica = maxReplica;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("minReplica")
private Integer minReplica;

        /**
         * Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.
         * @param minReplica the value to set
         * @return this builder
         **/
        

public Builder minReplica(Integer minReplica) {
    this.minReplica = minReplica;
    return this;
}
            /**
     * Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("maxReplica")
private Integer maxReplica;

        /**
         * Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
         * @param maxReplica the value to set
         * @return this builder
         **/
        

public Builder maxReplica(Integer maxReplica) {
    this.maxReplica = maxReplica;
    return this;
}


        public ReplicaConfig build() {
            ReplicaConfig model = new ReplicaConfig(this.minReplica
                , this.maxReplica);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicaConfig model) {
                this.minReplica(model.getMinReplica());
    this.maxReplica(model.getMaxReplica());
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
     * Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("minReplica")
    private final Integer minReplica;

        /**
     * Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default.
     * @return the value
     **/
    
    public Integer getMinReplica() {
        return minReplica;
    }


        /**
     * Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxReplica")
    private final Integer maxReplica;

        /**
     * Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match.
     * @return the value
     **/
    
    public Integer getMaxReplica() {
        return maxReplica;
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
        sb.append("ReplicaConfig(");
        sb.append("minReplica=").append(String.valueOf(this.minReplica));
        sb.append(", maxReplica=").append(String.valueOf(this.maxReplica));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicaConfig)) {
            return false;
        }

        ReplicaConfig other = (ReplicaConfig) o;
        return java.util.Objects.equals(this.minReplica, other.minReplica) &&
            java.util.Objects.equals(this.maxReplica, other.maxReplica);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minReplica == null ? 43 : this.minReplica.hashCode());
        result = (result * PRIME) + (this.maxReplica == null ? 43 : this.maxReplica.hashCode());
        return result;
    }


}
