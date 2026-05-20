// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Details of the registered model tags to update.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateRegisteredModelTagsDetails.Builder.class)

public final class UpdateRegisteredModelTagsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "setTags", "deleteTags"})
    public UpdateRegisteredModelTagsDetails(String name, java.util.List<RegisteredModelTag> setTags, java.util.List<RegisteredModelTagKey> deleteTags) {
        super();
        this.name = name;
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
     * Registered model tags to set.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
        private java.util.List<RegisteredModelTag> setTags;

                /**
         * Registered model tags to set.
         * @param setTags the value to set
         * @return this builder
         **/
        

        public Builder setTags(java.util.List<RegisteredModelTag> setTags) {
        this.setTags = setTags;
        return this;
        }
            /**
     * Registered model tags to delete.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
        private java.util.List<RegisteredModelTagKey> deleteTags;

                /**
         * Registered model tags to delete.
         * @param deleteTags the value to set
         * @return this builder
         **/
        

        public Builder deleteTags(java.util.List<RegisteredModelTagKey> deleteTags) {
        this.deleteTags = deleteTags;
        return this;
        }


        public UpdateRegisteredModelTagsDetails build() {
            UpdateRegisteredModelTagsDetails model = new UpdateRegisteredModelTagsDetails(this.name
                    , this.setTags
                    , this.deleteTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRegisteredModelTagsDetails model) {
                this.name(model.getName());
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
     * Registered model tags to set.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("set_tags")
    private final java.util.List<RegisteredModelTag> setTags;

        /**
     * Registered model tags to set.
     * @return the value
     **/
    
    public java.util.List<RegisteredModelTag> getSetTags() {
        return setTags;
    }


        /**
     * Registered model tags to delete.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delete_tags")
    private final java.util.List<RegisteredModelTagKey> deleteTags;

        /**
     * Registered model tags to delete.
     * @return the value
     **/
    
    public java.util.List<RegisteredModelTagKey> getDeleteTags() {
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
        sb.append("UpdateRegisteredModelTagsDetails(");
        sb.append("name=").append(String.valueOf(this.name));
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
        if (!(o instanceof UpdateRegisteredModelTagsDetails)) {
            return false;
        }

        UpdateRegisteredModelTagsDetails other = (UpdateRegisteredModelTagsDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.setTags, other.setTags) &&
            java.util.Objects.equals(this.deleteTags, other.deleteTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.setTags == null ? 43 : this.setTags.hashCode());
        result = (result * PRIME) + (this.deleteTags == null ? 43 : this.deleteTags.hashCode());
        return result;
    }


}
