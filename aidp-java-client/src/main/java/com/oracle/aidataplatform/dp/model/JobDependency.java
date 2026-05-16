// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Job dependency. Represents a job with its dependencies. Can be used for both root jobs and nested jobs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=JobDependency.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class JobDependency extends Dependency {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for the job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique identifier for the job.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * List of dependencies for this job.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dependencies")
private java.util.List<Dependency> dependencies;

        /**
         * List of dependencies for this job.
         * @param dependencies the value to set
         * @return this builder
         **/
        

public Builder dependencies(java.util.List<Dependency> dependencies) {
    this.dependencies = dependencies;
    return this;
}


        public JobDependency build() {
            JobDependency model = new JobDependency(this.key
                , this.dependencies);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDependency model) {
                this.key(model.getKey());
    this.dependencies(model.getDependencies());
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
    public JobDependency(String key, java.util.List<Dependency> dependencies) {
    super();
        this.key = key;
        this.dependencies = dependencies;
    }


        /**
     * Unique identifier for the job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for the job.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * List of dependencies for this job.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<Dependency> dependencies;

        /**
     * List of dependencies for this job.
     * @return the value
     **/
    
    public java.util.List<Dependency> getDependencies() {
        return dependencies;
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
        sb.append("JobDependency(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", dependencies=").append(String.valueOf(this.dependencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobDependency)) {
            return false;
        }

        JobDependency other = (JobDependency) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.dependencies, other.dependencies) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        return result;
    }


}
