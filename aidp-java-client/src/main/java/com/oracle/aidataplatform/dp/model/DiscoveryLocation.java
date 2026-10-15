// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Volume location for DOCUMENTS or TTL sources.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DiscoveryLocation.Builder.class)

public final class DiscoveryLocation  {
    @Deprecated
    @java.beans.ConstructorProperties({"volumeKey", "paths"})
    public DiscoveryLocation(String volumeKey, java.util.List<String> paths) {
        super();
        this.volumeKey = volumeKey;
        this.paths = paths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Key of the workspace volume containing the source files.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
private String volumeKey;

        /**
         * Key of the workspace volume containing the source files.
         * @param volumeKey the value to set
         * @return this builder
         **/
        

public Builder volumeKey(String volumeKey) {
    this.volumeKey = volumeKey;
    return this;
}
            /**
     * Volume-relative paths of the source files or folders.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("paths")
private java.util.List<String> paths;

        /**
         * Volume-relative paths of the source files or folders.
         * @param paths the value to set
         * @return this builder
         **/
        

public Builder paths(java.util.List<String> paths) {
    this.paths = paths;
    return this;
}


        public DiscoveryLocation build() {
            DiscoveryLocation model = new DiscoveryLocation(this.volumeKey
                , this.paths);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryLocation model) {
                this.volumeKey(model.getVolumeKey());
    this.paths(model.getPaths());
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
     * Key of the workspace volume containing the source files.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("volumeKey")
    private final String volumeKey;

        /**
     * Key of the workspace volume containing the source files.
     * @return the value
     **/
    
    public String getVolumeKey() {
        return volumeKey;
    }


        /**
     * Volume-relative paths of the source files or folders.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final java.util.List<String> paths;

        /**
     * Volume-relative paths of the source files or folders.
     * @return the value
     **/
    
    public java.util.List<String> getPaths() {
        return paths;
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
        sb.append("DiscoveryLocation(");
        sb.append("volumeKey=").append(String.valueOf(this.volumeKey));
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryLocation)) {
            return false;
        }

        DiscoveryLocation other = (DiscoveryLocation) o;
        return java.util.Objects.equals(this.volumeKey, other.volumeKey) &&
            java.util.Objects.equals(this.paths, other.paths);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.volumeKey == null ? 43 : this.volumeKey.hashCode());
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        return result;
    }


}
