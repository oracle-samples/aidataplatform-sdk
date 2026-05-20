// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Request payload for creating or updating bundle overrides.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateOrUpdateBundleOverridesDetails.Builder.class)

public final class CreateOrUpdateBundleOverridesDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "overrides"})
    public CreateOrUpdateBundleOverridesDetails(String path, BundleOverrides overrides) {
        super();
        this.path = path;
        this.overrides = overrides;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Target folder for the new bundle.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * Target folder for the new bundle.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("overrides")
        private BundleOverrides overrides;

        

        public Builder overrides(BundleOverrides overrides) {
        this.overrides = overrides;
        return this;
        }


        public CreateOrUpdateBundleOverridesDetails build() {
            CreateOrUpdateBundleOverridesDetails model = new CreateOrUpdateBundleOverridesDetails(this.path
                    , this.overrides);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOrUpdateBundleOverridesDetails model) {
                this.path(model.getPath());
    this.overrides(model.getOverrides());
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
     * Target folder for the new bundle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Target folder for the new bundle.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    private final BundleOverrides overrides;

    
    public BundleOverrides getOverrides() {
        return overrides;
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
        sb.append("CreateOrUpdateBundleOverridesDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", overrides=").append(String.valueOf(this.overrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOrUpdateBundleOverridesDetails)) {
            return false;
        }

        CreateOrUpdateBundleOverridesDetails other = (CreateOrUpdateBundleOverridesDetails) o;
        return java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.overrides, other.overrides);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.overrides == null ? 43 : this.overrides.hashCode());
        return result;
    }


}
