// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A cluster-scoped library entry in the Compute configuration YAML.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ComputeConfigurationLibraryEntry.Builder.class)

public final class ComputeConfigurationLibraryEntry  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "pip", "jar"})
    public ComputeConfigurationLibraryEntry(String path, String pip, String jar) {
        super();
        this.path = path;
        this.pip = pip;
        this.jar = jar;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Workspace or volume path containing library configuration.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Workspace or volume path containing library configuration.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Python package identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pip")
private String pip;

        /**
         * Python package identifier.
         * @param pip the value to set
         * @return this builder
         **/
        

public Builder pip(String pip) {
    this.pip = pip;
    return this;
}
            /**
     * JAR coordinate or workspace/volume path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jar")
private String jar;

        /**
         * JAR coordinate or workspace/volume path.
         * @param jar the value to set
         * @return this builder
         **/
        

public Builder jar(String jar) {
    this.jar = jar;
    return this;
}


        public ComputeConfigurationLibraryEntry build() {
            ComputeConfigurationLibraryEntry model = new ComputeConfigurationLibraryEntry(this.path
                , this.pip
                , this.jar);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeConfigurationLibraryEntry model) {
                this.path(model.getPath());
    this.pip(model.getPip());
    this.jar(model.getJar());
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
     * Workspace or volume path containing library configuration.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Workspace or volume path containing library configuration.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Python package identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pip")
    private final String pip;

        /**
     * Python package identifier.
     * @return the value
     **/
    
    public String getPip() {
        return pip;
    }


        /**
     * JAR coordinate or workspace/volume path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jar")
    private final String jar;

        /**
     * JAR coordinate or workspace/volume path.
     * @return the value
     **/
    
    public String getJar() {
        return jar;
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
        sb.append("ComputeConfigurationLibraryEntry(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", pip=").append(String.valueOf(this.pip));
        sb.append(", jar=").append(String.valueOf(this.jar));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeConfigurationLibraryEntry)) {
            return false;
        }

        ComputeConfigurationLibraryEntry other = (ComputeConfigurationLibraryEntry) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.pip, other.pip) &&
            java.util.Objects.equals(this.jar, other.jar);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.pip == null ? 43 : this.pip.hashCode());
        result = (result * PRIME) + (this.jar == null ? 43 : this.jar.hashCode());
        return result;
    }


}
