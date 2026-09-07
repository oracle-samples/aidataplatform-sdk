// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Resolved bundle publish location for the last publish operation.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundlePublishLocation.Builder.class)

public final class BundlePublishLocation  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "overwrite"})
    public BundlePublishLocation(String path, Boolean overwrite) {
        super();
        this.path = path;
        this.overwrite = overwrite;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Resolved publish root used by the bundle publish operation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Resolved publish root used by the bundle publish operation.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("overwrite")
private Boolean overwrite;

        /**
         * Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.
         * @param overwrite the value to set
         * @return this builder
         **/
        

public Builder overwrite(Boolean overwrite) {
    this.overwrite = overwrite;
    return this;
}


        public BundlePublishLocation build() {
            BundlePublishLocation model = new BundlePublishLocation(this.path
                , this.overwrite);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundlePublishLocation model) {
                this.path(model.getPath());
    this.overwrite(model.getOverwrite());
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
     * Resolved publish root used by the bundle publish operation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Resolved publish root used by the bundle publish operation.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("overwrite")
    private final Boolean overwrite;

        /**
     * Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.
     * @return the value
     **/
    
    public Boolean getOverwrite() {
        return overwrite;
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
        sb.append("BundlePublishLocation(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", overwrite=").append(String.valueOf(this.overwrite));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundlePublishLocation)) {
            return false;
        }

        BundlePublishLocation other = (BundlePublishLocation) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.overwrite, other.overwrite);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.overwrite == null ? 43 : this.overwrite.hashCode());
        return result;
    }


}
