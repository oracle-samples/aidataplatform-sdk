// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details required to install a library on a cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InstallClusterLibraryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="operation")

public final class InstallClusterLibraryDetails extends ClusterLibraryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * PyPI package specifier to install. Example - {@code requests==2.31.0}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pythonPackage")
private String pythonPackage;

        /**
         * PyPI package specifier to install. Example - {@code requests==2.31.0}.
         * @param pythonPackage the value to set
         * @return this builder
         **/
        

public Builder pythonPackage(String pythonPackage) {
    this.pythonPackage = pythonPackage;
    return this;
}
            /**
     * Optional pip index URL used to resolve a PyPI package. Example - {@code https://pypi.org/simple}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("pipIndexUrl")
private String pipIndexUrl;

        /**
         * Optional pip index URL used to resolve a PyPI package. Example - {@code https://pypi.org/simple}.
         * @param pipIndexUrl the value to set
         * @return this builder
         **/
        

public Builder pipIndexUrl(String pipIndexUrl) {
    this.pipIndexUrl = pipIndexUrl;
    return this;
}
            /**
     * Maven coordinate in {@code groupId:artifactId:version} format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("coordinate")
private String coordinate;

        /**
         * Maven coordinate in {@code groupId:artifactId:version} format.
         * @param coordinate the value to set
         * @return this builder
         **/
        

public Builder coordinate(String coordinate) {
    this.coordinate = coordinate;
    return this;
}
            /**
     * Optional Maven repository name or URL used to resolve the module.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("repository")
private String repository;

        /**
         * Optional Maven repository name or URL used to resolve the module.
         * @param repository the value to set
         * @return this builder
         **/
        

public Builder repository(String repository) {
    this.repository = repository;
    return this;
}
            /**
     * Optional Maven dependency exclusions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("exclusions")
private java.util.List<String> exclusions;

        /**
         * Optional Maven dependency exclusions.
         * @param exclusions the value to set
         * @return this builder
         **/
        

public Builder exclusions(java.util.List<String> exclusions) {
    this.exclusions = exclusions;
    return this;
}


        public InstallClusterLibraryDetails build() {
            InstallClusterLibraryDetails model = new InstallClusterLibraryDetails(this.type
                , this.path
                , this.pythonPackage
                , this.pipIndexUrl
                , this.coordinate
                , this.repository
                , this.exclusions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallClusterLibraryDetails model) {
                this.type(model.getType());
    this.path(model.getPath());
    this.pythonPackage(model.getPythonPackage());
    this.pipIndexUrl(model.getPipIndexUrl());
    this.coordinate(model.getCoordinate());
    this.repository(model.getRepository());
    this.exclusions(model.getExclusions());
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
    public InstallClusterLibraryDetails(Type type, String path, String pythonPackage, String pipIndexUrl, String coordinate, String repository, java.util.List<String> exclusions) {
    super(type);
        this.path = path;
        this.pythonPackage = pythonPackage;
        this.pipIndexUrl = pipIndexUrl;
        this.coordinate = coordinate;
        this.repository = repository;
        this.exclusions = exclusions;
    }


        /**
     * File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * PyPI package specifier to install. Example - {@code requests==2.31.0}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pythonPackage")
    private final String pythonPackage;

        /**
     * PyPI package specifier to install. Example - {@code requests==2.31.0}.
     * @return the value
     **/
    
    public String getPythonPackage() {
        return pythonPackage;
    }


        /**
     * Optional pip index URL used to resolve a PyPI package. Example - {@code https://pypi.org/simple}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pipIndexUrl")
    private final String pipIndexUrl;

        /**
     * Optional pip index URL used to resolve a PyPI package. Example - {@code https://pypi.org/simple}.
     * @return the value
     **/
    
    public String getPipIndexUrl() {
        return pipIndexUrl;
    }


        /**
     * Maven coordinate in {@code groupId:artifactId:version} format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("coordinate")
    private final String coordinate;

        /**
     * Maven coordinate in {@code groupId:artifactId:version} format.
     * @return the value
     **/
    
    public String getCoordinate() {
        return coordinate;
    }


        /**
     * Optional Maven repository name or URL used to resolve the module.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repository")
    private final String repository;

        /**
     * Optional Maven repository name or URL used to resolve the module.
     * @return the value
     **/
    
    public String getRepository() {
        return repository;
    }


        /**
     * Optional Maven dependency exclusions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    private final java.util.List<String> exclusions;

        /**
     * Optional Maven dependency exclusions.
     * @return the value
     **/
    
    public java.util.List<String> getExclusions() {
        return exclusions;
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
        sb.append("InstallClusterLibraryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", pythonPackage=").append(String.valueOf(this.pythonPackage));
        sb.append(", pipIndexUrl=").append(String.valueOf(this.pipIndexUrl));
        sb.append(", coordinate=").append(String.valueOf(this.coordinate));
        sb.append(", repository=").append(String.valueOf(this.repository));
        sb.append(", exclusions=").append(String.valueOf(this.exclusions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallClusterLibraryDetails)) {
            return false;
        }

        InstallClusterLibraryDetails other = (InstallClusterLibraryDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.pythonPackage, other.pythonPackage) &&
            java.util.Objects.equals(this.pipIndexUrl, other.pipIndexUrl) &&
            java.util.Objects.equals(this.coordinate, other.coordinate) &&
            java.util.Objects.equals(this.repository, other.repository) &&
            java.util.Objects.equals(this.exclusions, other.exclusions) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.pythonPackage == null ? 43 : this.pythonPackage.hashCode());
        result = (result * PRIME) + (this.pipIndexUrl == null ? 43 : this.pipIndexUrl.hashCode());
        result = (result * PRIME) + (this.coordinate == null ? 43 : this.coordinate.hashCode());
        result = (result * PRIME) + (this.repository == null ? 43 : this.repository.hashCode());
        result = (result * PRIME) + (this.exclusions == null ? 43 : this.exclusions.hashCode());
        return result;
    }


}
