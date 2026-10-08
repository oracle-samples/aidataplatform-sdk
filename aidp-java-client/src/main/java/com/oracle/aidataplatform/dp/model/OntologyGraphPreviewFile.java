// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Source file metadata for a design-time ontology graph preview.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyGraphPreviewFile.Builder.class)

public final class OntologyGraphPreviewFile  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "sizeBytes", "etag", "revision"})
    public OntologyGraphPreviewFile(String path, Long sizeBytes, String etag, String revision) {
        super();
        this.path = path;
        this.sizeBytes = sizeBytes;
        this.etag = etag;
        this.revision = revision;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Project-relative file path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Project-relative file path.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * File size in bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
private Long sizeBytes;

        /**
         * File size in bytes.
         * @param sizeBytes the value to set
         * @return this builder
         **/
        

public Builder sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
}
            /**
     * File etag used for cache invalidation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("etag")
private String etag;

        /**
         * File etag used for cache invalidation.
         * @param etag the value to set
         * @return this builder
         **/
        

public Builder etag(String etag) {
    this.etag = etag;
    return this;
}
            /**
     * File revision used for cache invalidation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("revision")
private String revision;

        /**
         * File revision used for cache invalidation.
         * @param revision the value to set
         * @return this builder
         **/
        

public Builder revision(String revision) {
    this.revision = revision;
    return this;
}


        public OntologyGraphPreviewFile build() {
            OntologyGraphPreviewFile model = new OntologyGraphPreviewFile(this.path
                , this.sizeBytes
                , this.etag
                , this.revision);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyGraphPreviewFile model) {
                this.path(model.getPath());
    this.sizeBytes(model.getSizeBytes());
    this.etag(model.getEtag());
    this.revision(model.getRevision());
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
     * Project-relative file path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Project-relative file path.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * File size in bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sizeBytes")
    private final Long sizeBytes;

        /**
     * File size in bytes.
     * @return the value
     **/
    
    public Long getSizeBytes() {
        return sizeBytes;
    }


        /**
     * File etag used for cache invalidation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

        /**
     * File etag used for cache invalidation.
     * @return the value
     **/
    
    public String getEtag() {
        return etag;
    }


        /**
     * File revision used for cache invalidation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("revision")
    private final String revision;

        /**
     * File revision used for cache invalidation.
     * @return the value
     **/
    
    public String getRevision() {
        return revision;
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
        sb.append("OntologyGraphPreviewFile(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", sizeBytes=").append(String.valueOf(this.sizeBytes));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", revision=").append(String.valueOf(this.revision));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyGraphPreviewFile)) {
            return false;
        }

        OntologyGraphPreviewFile other = (OntologyGraphPreviewFile) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.sizeBytes, other.sizeBytes) &&
            java.util.Objects.equals(this.etag, other.etag) &&
            java.util.Objects.equals(this.revision, other.revision);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.sizeBytes == null ? 43 : this.sizeBytes.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        return result;
    }


}
