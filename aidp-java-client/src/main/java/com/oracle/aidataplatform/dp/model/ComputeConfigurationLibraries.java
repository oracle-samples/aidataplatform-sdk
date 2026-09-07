// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Cluster-scoped libraries configured on Spark Compute.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ComputeConfigurationLibraries.Builder.class)

public final class ComputeConfigurationLibraries  {
    @Deprecated
    @java.beans.ConstructorProperties({"python", "jars"})
    public ComputeConfigurationLibraries(java.util.List<String> python, java.util.List<String> jars) {
        super();
        this.python = python;
        this.jars = jars;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Python package identifiers and workspace or volume paths.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("python")
private java.util.List<String> python;

        /**
         * Python package identifiers and workspace or volume paths.
         * @param python the value to set
         * @return this builder
         **/
        

public Builder python(java.util.List<String> python) {
    this.python = python;
    return this;
}
            /**
     * JAR coordinates and workspace or volume paths.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jars")
private java.util.List<String> jars;

        /**
         * JAR coordinates and workspace or volume paths.
         * @param jars the value to set
         * @return this builder
         **/
        

public Builder jars(java.util.List<String> jars) {
    this.jars = jars;
    return this;
}


        public ComputeConfigurationLibraries build() {
            ComputeConfigurationLibraries model = new ComputeConfigurationLibraries(this.python
                , this.jars);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeConfigurationLibraries model) {
                this.python(model.getPython());
    this.jars(model.getJars());
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
     * Python package identifiers and workspace or volume paths.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("python")
    private final java.util.List<String> python;

        /**
     * Python package identifiers and workspace or volume paths.
     * @return the value
     **/
    
    public java.util.List<String> getPython() {
        return python;
    }


        /**
     * JAR coordinates and workspace or volume paths.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jars")
    private final java.util.List<String> jars;

        /**
     * JAR coordinates and workspace or volume paths.
     * @return the value
     **/
    
    public java.util.List<String> getJars() {
        return jars;
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
        sb.append("ComputeConfigurationLibraries(");
        sb.append("python=").append(String.valueOf(this.python));
        sb.append(", jars=").append(String.valueOf(this.jars));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeConfigurationLibraries)) {
            return false;
        }

        ComputeConfigurationLibraries other = (ComputeConfigurationLibraries) o;
        return java.util.Objects.equals(this.python, other.python) &&
            java.util.Objects.equals(this.jars, other.jars);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.python == null ? 43 : this.python.hashCode());
        result = (result * PRIME) + (this.jars == null ? 43 : this.jars.hashCode());
        return result;
    }


}
