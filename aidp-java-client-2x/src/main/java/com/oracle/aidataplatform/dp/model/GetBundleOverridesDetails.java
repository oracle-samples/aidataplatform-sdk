package com.oracle.aidataplatform.dp.model;


/**
 * Request payload for fetching bundle overrides.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GetBundleOverridesDetails.Builder.class)

public final class GetBundleOverridesDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"path"})
    public GetBundleOverridesDetails(String path) {
        super();
        this.path = path;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Target folder for the new bundle
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * Target folder for the new bundle
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }


        public GetBundleOverridesDetails build() {
            GetBundleOverridesDetails model = new GetBundleOverridesDetails(this.path);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetBundleOverridesDetails model) {
                this.path(model.getPath());
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
     * Target folder for the new bundle
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Target folder for the new bundle
     * @return the value
     **/
    
    public String getPath() {
        return path;
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
        sb.append("GetBundleOverridesDetails(");
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBundleOverridesDetails)) {
            return false;
        }

        GetBundleOverridesDetails other = (GetBundleOverridesDetails) o;
        return java.util.Objects.equals(this.path, other.path);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        return result;
    }


}
