// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for creating or replacing an ontology source file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpsertOntologyFileDetails.Builder.class)

public final class UpsertOntologyFileDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "content", "contentType"})
    public UpsertOntologyFileDetails(String path, String content, String contentType) {
        super();
        this.path = path;
        this.content = content;
        this.contentType = contentType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Text content for the ontology source file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private String content;

        /**
         * Text content for the ontology source file.
         * @param content the value to set
         * @return this builder
         **/
        

public Builder content(String content) {
    this.content = content;
    return this;
}
            /**
     * Optional content type. OMS infers one from the file extension when omitted.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("contentType")
private String contentType;

        /**
         * Optional content type. OMS infers one from the file extension when omitted.
         * @param contentType the value to set
         * @return this builder
         **/
        

public Builder contentType(String contentType) {
    this.contentType = contentType;
    return this;
}


        public UpsertOntologyFileDetails build() {
            UpsertOntologyFileDetails model = new UpsertOntologyFileDetails(this.path
                , this.content
                , this.contentType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpsertOntologyFileDetails model) {
                this.path(model.getPath());
    this.content(model.getContent());
    this.contentType(model.getContentType());
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
     * Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Text content for the ontology source file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

        /**
     * Text content for the ontology source file.
     * @return the value
     **/
    
    public String getContent() {
        return content;
    }


        /**
     * Optional content type. OMS infers one from the file extension when omitted.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

        /**
     * Optional content type. OMS infers one from the file extension when omitted.
     * @return the value
     **/
    
    public String getContentType() {
        return contentType;
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
        sb.append("UpsertOntologyFileDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpsertOntologyFileDetails)) {
            return false;
        }

        UpsertOntologyFileDetails other = (UpsertOntologyFileDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.contentType, other.contentType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        return result;
    }


}
