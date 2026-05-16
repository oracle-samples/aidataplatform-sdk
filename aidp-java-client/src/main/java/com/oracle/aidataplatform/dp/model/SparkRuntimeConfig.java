// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Spark runtime information.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SparkRuntimeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class SparkRuntimeConfig extends ClusterRuntimeConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("initScripts")
private java.util.List<InitScriptPath> initScripts;

public Builder initScripts(java.util.List<InitScriptPath> initScripts) {
    this.initScripts = initScripts;
    return this;
}
            /**
     * Spark version used to run the application.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
private String sparkVersion;

        /**
         * Spark version used to run the application.
         * @param sparkVersion the value to set
         * @return this builder
         **/
        

public Builder sparkVersion(String sparkVersion) {
    this.sparkVersion = sparkVersion;
    return this;
}
            /**
     * Spark configuration passed to the running process.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
private java.util.Map<String, String> sparkAdvancedConfigurations;

        /**
         * Spark configuration passed to the running process.
         * @param sparkAdvancedConfigurations the value to set
         * @return this builder
         **/
        

public Builder sparkAdvancedConfigurations(java.util.Map<String, String> sparkAdvancedConfigurations) {
    this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
    return this;
}
            /**
     * Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>.
* Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
* Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
* not allowed to be overwritten will cause a 400 status to be returned.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sparkEnvVariables")
private java.util.Map<String, String> sparkEnvVariables;

        /**
         * Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>.
* Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
* Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
* not allowed to be overwritten will cause a 400 status to be returned.
* 
         * @param sparkEnvVariables the value to set
         * @return this builder
         **/
        

public Builder sparkEnvVariables(java.util.Map<String, String> sparkEnvVariables) {
    this.sparkEnvVariables = sparkEnvVariables;
    return this;
}


        public SparkRuntimeConfig build() {
            SparkRuntimeConfig model = new SparkRuntimeConfig(this.initScripts
                , this.sparkVersion
                , this.sparkAdvancedConfigurations
                , this.sparkEnvVariables);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SparkRuntimeConfig model) {
                this.initScripts(model.getInitScripts());
    this.sparkVersion(model.getSparkVersion());
    this.sparkAdvancedConfigurations(model.getSparkAdvancedConfigurations());
    this.sparkEnvVariables(model.getSparkEnvVariables());
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

    
    @Deprecated
    public SparkRuntimeConfig(java.util.List<InitScriptPath> initScripts, String sparkVersion, java.util.Map<String, String> sparkAdvancedConfigurations, java.util.Map<String, String> sparkEnvVariables) {
    super(initScripts);
        this.sparkVersion = sparkVersion;
        this.sparkAdvancedConfigurations = sparkAdvancedConfigurations;
        this.sparkEnvVariables = sparkEnvVariables;
    }


        /**
     * Spark version used to run the application.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

        /**
     * Spark version used to run the application.
     * @return the value
     **/
    
    public String getSparkVersion() {
        return sparkVersion;
    }


        /**
     * Spark configuration passed to the running process.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkAdvancedConfigurations")
    private final java.util.Map<String, String> sparkAdvancedConfigurations;

        /**
     * Spark configuration passed to the running process.
     * @return the value
     **/
    
    public java.util.Map<String, String> getSparkAdvancedConfigurations() {
        return sparkAdvancedConfigurations;
    }


        /**
     * Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>.
* Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
* Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
* not allowed to be overwritten will cause a 400 status to be returned.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sparkEnvVariables")
    private final java.util.Map<String, String> sparkEnvVariables;

        /**
     * Environment variables passed to the running process. See <a href="https://spark.apache.org/docs/latest/configuration.html#available-properties" target="_blank" rel="noopener noreferrer">Available Properties</a>.
* Example - { "spark.app.name" : "My App Name", "spark.shuffle.io.maxRetries" : "4" }
* Note: Not all Spark properties are permitted to be set. Attempting to set a property that is
* not allowed to be overwritten will cause a 400 status to be returned.
* 
     * @return the value
     **/
    
    public java.util.Map<String, String> getSparkEnvVariables() {
        return sparkEnvVariables;
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
        sb.append("SparkRuntimeConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", sparkAdvancedConfigurations=").append(String.valueOf(this.sparkAdvancedConfigurations));
        sb.append(", sparkEnvVariables=").append(String.valueOf(this.sparkEnvVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SparkRuntimeConfig)) {
            return false;
        }

        SparkRuntimeConfig other = (SparkRuntimeConfig) o;
        return java.util.Objects.equals(this.sparkVersion, other.sparkVersion) &&
            java.util.Objects.equals(this.sparkAdvancedConfigurations, other.sparkAdvancedConfigurations) &&
            java.util.Objects.equals(this.sparkEnvVariables, other.sparkEnvVariables) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.sparkAdvancedConfigurations == null ? 43 : this.sparkAdvancedConfigurations.hashCode());
        result = (result * PRIME) + (this.sparkEnvVariables == null ? 43 : this.sparkEnvVariables.hashCode());
        return result;
    }


}
