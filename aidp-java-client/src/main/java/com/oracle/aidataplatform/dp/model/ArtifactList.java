// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of listing artifacts.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ArtifactList.Builder.class)

public final class ArtifactList  {
    @Deprecated
    @java.beans.ConstructorProperties({"rootUri", "files", "nextPageToken"})
    public ArtifactList(String rootUri, java.util.List<ArtifactFileInfo> files, String nextPageToken) {
        super();
        this.rootUri = rootUri;
        this.files = files;
        this.nextPageToken = nextPageToken;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Root artifact directory for the run.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("root_uri")
private String rootUri;

        /**
         * Root artifact directory for the run.
         * @param rootUri the value to set
         * @return this builder
         **/
        

public Builder rootUri(String rootUri) {
    this.rootUri = rootUri;
    return this;
}
            /**
     * File location and metadata for artifacts.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("files")
private java.util.List<ArtifactFileInfo> files;

        /**
         * File location and metadata for artifacts.
         * @param files the value to set
         * @return this builder
         **/
        

public Builder files(java.util.List<ArtifactFileInfo> files) {
    this.files = files;
    return this;
}
            /**
     * Token that can be used to retrieve the next page of artifact results.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
private String nextPageToken;

        /**
         * Token that can be used to retrieve the next page of artifact results.
         * @param nextPageToken the value to set
         * @return this builder
         **/
        

public Builder nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
}


        public ArtifactList build() {
            ArtifactList model = new ArtifactList(this.rootUri
                , this.files
                , this.nextPageToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArtifactList model) {
                this.rootUri(model.getRootUri());
    this.files(model.getFiles());
    this.nextPageToken(model.getNextPageToken());
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
     * Root artifact directory for the run.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("root_uri")
    private final String rootUri;

        /**
     * Root artifact directory for the run.
     * @return the value
     **/
    
    public String getRootUri() {
        return rootUri;
    }


        /**
     * File location and metadata for artifacts.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("files")
    private final java.util.List<ArtifactFileInfo> files;

        /**
     * File location and metadata for artifacts.
     * @return the value
     **/
    
    public java.util.List<ArtifactFileInfo> getFiles() {
        return files;
    }


        /**
     * Token that can be used to retrieve the next page of artifact results.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("next_page_token")
    private final String nextPageToken;

        /**
     * Token that can be used to retrieve the next page of artifact results.
     * @return the value
     **/
    
    public String getNextPageToken() {
        return nextPageToken;
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
        sb.append("ArtifactList(");
        sb.append("rootUri=").append(String.valueOf(this.rootUri));
        sb.append(", files=").append(String.valueOf(this.files));
        sb.append(", nextPageToken=").append(String.valueOf(this.nextPageToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArtifactList)) {
            return false;
        }

        ArtifactList other = (ArtifactList) o;
        return java.util.Objects.equals(this.rootUri, other.rootUri) &&
            java.util.Objects.equals(this.files, other.files) &&
            java.util.Objects.equals(this.nextPageToken, other.nextPageToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rootUri == null ? 43 : this.rootUri.hashCode());
        result = (result * PRIME) + (this.files == null ? 43 : this.files.hashCode());
        result = (result * PRIME) + (this.nextPageToken == null ? 43 : this.nextPageToken.hashCode());
        return result;
    }


}
