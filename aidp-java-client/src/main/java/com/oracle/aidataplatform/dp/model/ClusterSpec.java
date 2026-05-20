// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Cluster specification snapshot of a job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClusterSpec.Builder.class)

public final class ClusterSpec  {
    @Deprecated
    @java.beans.ConstructorProperties({"existingClusterKey", "newCluster", "libraries"})
    public ClusterSpec(String existingClusterKey, NewClusterConfiguration newCluster, Libraries libraries) {
        super();
        this.existingClusterKey = existingClusterKey;
        this.newCluster = newCluster;
        this.libraries = libraries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The key of the cluster.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("existingClusterKey")
private String existingClusterKey;

        /**
         * The key of the cluster.
         * @param existingClusterKey the value to set
         * @return this builder
         **/
        

public Builder existingClusterKey(String existingClusterKey) {
    this.existingClusterKey = existingClusterKey;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("newCluster")
private NewClusterConfiguration newCluster;



public Builder newCluster(NewClusterConfiguration newCluster) {
    this.newCluster = newCluster;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("libraries")
private Libraries libraries;



public Builder libraries(Libraries libraries) {
    this.libraries = libraries;
    return this;
}


        public ClusterSpec build() {
            ClusterSpec model = new ClusterSpec(this.existingClusterKey
                , this.newCluster
                , this.libraries);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterSpec model) {
                this.existingClusterKey(model.getExistingClusterKey());
    this.newCluster(model.getNewCluster());
    this.libraries(model.getLibraries());
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
     * The key of the cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("existingClusterKey")
    private final String existingClusterKey;

        /**
     * The key of the cluster.
     * @return the value
     **/
    
    public String getExistingClusterKey() {
        return existingClusterKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("newCluster")
    private final NewClusterConfiguration newCluster;

    
    public NewClusterConfiguration getNewCluster() {
        return newCluster;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("libraries")
    private final Libraries libraries;

    
    public Libraries getLibraries() {
        return libraries;
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
        sb.append("ClusterSpec(");
        sb.append("existingClusterKey=").append(String.valueOf(this.existingClusterKey));
        sb.append(", newCluster=").append(String.valueOf(this.newCluster));
        sb.append(", libraries=").append(String.valueOf(this.libraries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterSpec)) {
            return false;
        }

        ClusterSpec other = (ClusterSpec) o;
        return java.util.Objects.equals(this.existingClusterKey, other.existingClusterKey) &&
            java.util.Objects.equals(this.newCluster, other.newCluster) &&
            java.util.Objects.equals(this.libraries, other.libraries);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.existingClusterKey == null ? 43 : this.existingClusterKey.hashCode());
        result = (result * PRIME) + (this.newCluster == null ? 43 : this.newCluster.hashCode());
        result = (result * PRIME) + (this.libraries == null ? 43 : this.libraries.hashCode());
        return result;
    }


}
