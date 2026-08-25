// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Selectable Spark Compute configuration returned by Compute.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ComputeConfiguration.Builder.class)

public final class ComputeConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterKey", "environmentVariables", "libraries"})
    public ComputeConfiguration(String clusterKey, java.util.Map<String, String> environmentVariables, ComputeConfigurationLibraries libraries) {
        super();
        this.clusterKey = clusterKey;
        this.environmentVariables = environmentVariables;
        this.libraries = libraries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Source cluster key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * Source cluster key.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
    return this;
}
            /**
     * Environment-variable keys and authoritative values configured on the source Compute.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
private java.util.Map<String, String> environmentVariables;

        /**
         * Environment-variable keys and authoritative values configured on the source Compute.
         * @param environmentVariables the value to set
         * @return this builder
         **/
        

public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("libraries")
private ComputeConfigurationLibraries libraries;



public Builder libraries(ComputeConfigurationLibraries libraries) {
    this.libraries = libraries;
    return this;
}


        public ComputeConfiguration build() {
            ComputeConfiguration model = new ComputeConfiguration(this.clusterKey
                , this.environmentVariables
                , this.libraries);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeConfiguration model) {
                this.clusterKey(model.getClusterKey());
    this.environmentVariables(model.getEnvironmentVariables());
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
     * Source cluster key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * Source cluster key.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
    }


        /**
     * Environment-variable keys and authoritative values configured on the source Compute.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

        /**
     * Environment-variable keys and authoritative values configured on the source Compute.
     * @return the value
     **/
    
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("libraries")
    private final ComputeConfigurationLibraries libraries;

    
    public ComputeConfigurationLibraries getLibraries() {
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
        sb.append("ComputeConfiguration(");
        sb.append("clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", libraries=").append(String.valueOf(this.libraries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeConfiguration)) {
            return false;
        }

        ComputeConfiguration other = (ComputeConfiguration) o;
        return java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.environmentVariables, other.environmentVariables) &&
            java.util.Objects.equals(this.libraries, other.libraries);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.environmentVariables == null ? 43 : this.environmentVariables.hashCode());
        result = (result * PRIME) + (this.libraries == null ? 43 : this.libraries.hashCode());
        return result;
    }


}
