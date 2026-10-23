// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A single artifact produced by an ontology discovery job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyDiscoveryArtifactItem.Builder.class)

public final class OntologyDiscoveryArtifactItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "path", "kind", "className", "bytes", "sha256"})
    public OntologyDiscoveryArtifactItem(String name, String path, String kind, String className, Long bytes, String sha256) {
        super();
        this.name = name;
        this.path = path;
        this.kind = kind;
        this.className = className;
        this.bytes = bytes;
        this.sha256 = sha256;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Artifact file name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Artifact file name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Artifact file path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Artifact file path.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Artifact type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;

        /**
         * Artifact type.
         * @param kind the value to set
         * @return this builder
         **/
        

public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
            /**
     * Owning ontology class.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("className")
private String className;

        /**
         * Owning ontology class.
         * @param className the value to set
         * @return this builder
         **/
        

public Builder className(String className) {
    this.className = className;
    return this;
}
            /**
     * Artifact size in bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("bytes")
private Long bytes;

        /**
         * Artifact size in bytes.
         * @param bytes the value to set
         * @return this builder
         **/
        

public Builder bytes(Long bytes) {
    this.bytes = bytes;
    return this;
}
            /**
     * Artifact checksum.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sha256")
private String sha256;

        /**
         * Artifact checksum.
         * @param sha256 the value to set
         * @return this builder
         **/
        

public Builder sha256(String sha256) {
    this.sha256 = sha256;
    return this;
}


        public OntologyDiscoveryArtifactItem build() {
            OntologyDiscoveryArtifactItem model = new OntologyDiscoveryArtifactItem(this.name
                , this.path
                , this.kind
                , this.className
                , this.bytes
                , this.sha256);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyDiscoveryArtifactItem model) {
                this.name(model.getName());
    this.path(model.getPath());
    this.kind(model.getKind());
    this.className(model.getClassName());
    this.bytes(model.getBytes());
    this.sha256(model.getSha256());
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
     * Artifact file name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Artifact file name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Artifact file path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Artifact file path.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Artifact type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

        /**
     * Artifact type.
     * @return the value
     **/
    
    public String getKind() {
        return kind;
    }


        /**
     * Owning ontology class.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    private final String className;

        /**
     * Owning ontology class.
     * @return the value
     **/
    
    public String getClassName() {
        return className;
    }


        /**
     * Artifact size in bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("bytes")
    private final Long bytes;

        /**
     * Artifact size in bytes.
     * @return the value
     **/
    
    public Long getBytes() {
        return bytes;
    }


        /**
     * Artifact checksum.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

        /**
     * Artifact checksum.
     * @return the value
     **/
    
    public String getSha256() {
        return sha256;
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
        sb.append("OntologyDiscoveryArtifactItem(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", className=").append(String.valueOf(this.className));
        sb.append(", bytes=").append(String.valueOf(this.bytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyDiscoveryArtifactItem)) {
            return false;
        }

        OntologyDiscoveryArtifactItem other = (OntologyDiscoveryArtifactItem) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.className, other.className) &&
            java.util.Objects.equals(this.bytes, other.bytes) &&
            java.util.Objects.equals(this.sha256, other.sha256);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.className == null ? 43 : this.className.hashCode());
        result = (result * PRIME) + (this.bytes == null ? 43 : this.bytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        return result;
    }


}
