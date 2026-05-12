package com.oracle.aidataplatform.dp.model;



/**
 * Details of the ModelVersion tags to update.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateModelVersionTagsDetails.Builder.class)

public final class UpdateModelVersionTagsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "setTags", "deleteTags"})
    public UpdateModelVersionTagsDetails(String name, String version, java.util.List<ModelVersionTag> setTags, java.util.List<ModelVersionTagKey> deleteTags) {
        super();
        this.name = name;
        this.version = version;
        this.setTags = setTags;
        this.deleteTags = deleteTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the registered model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the registered model.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Model\u2019s version number.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * Model\u2019s version number.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(String version) {
    this.version = version;
    return this;
}
            /**
     * ModelVersion tags to set
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("set_tags")
private java.util.List<ModelVersionTag> setTags;

        /**
         * ModelVersion tags to set
         * @param setTags the value to set
         * @return this builder
         **/
        

public Builder setTags(java.util.List<ModelVersionTag> setTags) {
    this.setTags = setTags;
    return this;
}
            /**
     * ModelVersion tags to delete
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
private java.util.List<ModelVersionTagKey> deleteTags;

        /**
         * ModelVersion tags to delete
         * @param deleteTags the value to set
         * @return this builder
         **/
        

public Builder deleteTags(java.util.List<ModelVersionTagKey> deleteTags) {
    this.deleteTags = deleteTags;
    return this;
}


        public UpdateModelVersionTagsDetails build() {
            UpdateModelVersionTagsDetails model = new UpdateModelVersionTagsDetails(this.name
                , this.version
                , this.setTags
                , this.deleteTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateModelVersionTagsDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.setTags(model.getSetTags());
    this.deleteTags(model.getDeleteTags());
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
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Model\u2019s version number.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Model\u2019s version number.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * ModelVersion tags to set
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
    private final java.util.List<ModelVersionTag> setTags;

        /**
     * ModelVersion tags to set
     * @return the value
     **/
    
    public java.util.List<ModelVersionTag> getSetTags() {
        return setTags;
    }


        /**
     * ModelVersion tags to delete
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
    private final java.util.List<ModelVersionTagKey> deleteTags;

        /**
     * ModelVersion tags to delete
     * @return the value
     **/
    
    public java.util.List<ModelVersionTagKey> getDeleteTags() {
        return deleteTags;
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
        sb.append("UpdateModelVersionTagsDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", setTags=").append(String.valueOf(this.setTags));
        sb.append(", deleteTags=").append(String.valueOf(this.deleteTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateModelVersionTagsDetails)) {
            return false;
        }

        UpdateModelVersionTagsDetails other = (UpdateModelVersionTagsDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.setTags, other.setTags) &&
            java.util.Objects.equals(this.deleteTags, other.deleteTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.setTags == null ? 43 : this.setTags.hashCode());
        result = (result * PRIME) + (this.deleteTags == null ? 43 : this.deleteTags.hashCode());
        return result;
    }


}
