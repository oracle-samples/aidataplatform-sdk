// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Customer-selected Compute configuration values and YAML destination.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportComputeConfigurationDetails.Builder.class)

public final class ExportComputeConfigurationDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"destinationPath", "fileName", "clusterScopedLibraries", "environmentVariables"})
    public ExportComputeConfigurationDetails(String destinationPath, String fileName, java.util.List<ComputeConfigurationLibraryEntry> clusterScopedLibraries, java.util.Map<String, String> environmentVariables) {
        super();
        this.destinationPath = destinationPath;
        this.fileName = fileName;
        this.clusterScopedLibraries = clusterScopedLibraries;
        this.environmentVariables = environmentVariables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destinationPath")
private String destinationPath;

        /**
         * Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
         * @param destinationPath the value to set
         * @return this builder
         **/
        

public Builder destinationPath(String destinationPath) {
    this.destinationPath = destinationPath;
    return this;
}
            /**
     * Optional YAML filename. API-handler appends .yaml when omitted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fileName")
private String fileName;

        /**
         * Optional YAML filename. API-handler appends .yaml when omitted.
         * @param fileName the value to set
         * @return this builder
         **/
        

public Builder fileName(String fileName) {
    this.fileName = fileName;
    return this;
}
            /**
     * Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterScopedLibraries")
private java.util.List<ComputeConfigurationLibraryEntry> clusterScopedLibraries;

        /**
         * Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
         * @param clusterScopedLibraries the value to set
         * @return this builder
         **/
        

public Builder clusterScopedLibraries(java.util.List<ComputeConfigurationLibraryEntry> clusterScopedLibraries) {
    this.clusterScopedLibraries = clusterScopedLibraries;
    return this;
}
            /**
     * Selected environment-variable keys and values to write to the YAML file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
private java.util.Map<String, String> environmentVariables;

        /**
         * Selected environment-variable keys and values to write to the YAML file.
         * @param environmentVariables the value to set
         * @return this builder
         **/
        

public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
}


        public ExportComputeConfigurationDetails build() {
            ExportComputeConfigurationDetails model = new ExportComputeConfigurationDetails(this.destinationPath
                , this.fileName
                , this.clusterScopedLibraries
                , this.environmentVariables);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportComputeConfigurationDetails model) {
                this.destinationPath(model.getDestinationPath());
    this.fileName(model.getFileName());
    this.clusterScopedLibraries(model.getClusterScopedLibraries());
    this.environmentVariables(model.getEnvironmentVariables());
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
     * Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destinationPath")
    private final String destinationPath;

        /**
     * Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
     * @return the value
     **/
    
    public String getDestinationPath() {
        return destinationPath;
    }


        /**
     * Optional YAML filename. API-handler appends .yaml when omitted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

        /**
     * Optional YAML filename. API-handler appends .yaml when omitted.
     * @return the value
     **/
    
    public String getFileName() {
        return fileName;
    }


        /**
     * Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterScopedLibraries")
    private final java.util.List<ComputeConfigurationLibraryEntry> clusterScopedLibraries;

        /**
     * Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
     * @return the value
     **/
    
    public java.util.List<ComputeConfigurationLibraryEntry> getClusterScopedLibraries() {
        return clusterScopedLibraries;
    }


        /**
     * Selected environment-variable keys and values to write to the YAML file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

        /**
     * Selected environment-variable keys and values to write to the YAML file.
     * @return the value
     **/
    
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
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
        sb.append("ExportComputeConfigurationDetails(");
        sb.append("destinationPath=").append(String.valueOf(this.destinationPath));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", clusterScopedLibraries=").append(String.valueOf(this.clusterScopedLibraries));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportComputeConfigurationDetails)) {
            return false;
        }

        ExportComputeConfigurationDetails other = (ExportComputeConfigurationDetails) o;
        return java.util.Objects.equals(this.destinationPath, other.destinationPath) &&
            java.util.Objects.equals(this.fileName, other.fileName) &&
            java.util.Objects.equals(this.clusterScopedLibraries, other.clusterScopedLibraries) &&
            java.util.Objects.equals(this.environmentVariables, other.environmentVariables);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destinationPath == null ? 43 : this.destinationPath.hashCode());
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result = (result * PRIME) + (this.clusterScopedLibraries == null ? 43 : this.clusterScopedLibraries.hashCode());
        result = (result * PRIME) + (this.environmentVariables == null ? 43 : this.environmentVariables.hashCode());
        return result;
    }


}
