// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration for a content moderation category
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ContentModerationCategoryConfig.Builder.class)

public final class ContentModerationCategoryConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"category", "isEnabled", "threshold", "action"})
    public ContentModerationCategoryConfig(ContentModerationCategory category, Boolean isEnabled, Float threshold, PolicyAction action) {
        super();
        this.category = category;
        this.isEnabled = isEnabled;
        this.threshold = threshold;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Content moderation category
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("category")
private ContentModerationCategory category;

        /**
         * Content moderation category
         * @param category the value to set
         * @return this builder
         **/
        

public Builder category(ContentModerationCategory category) {
    this.category = category;
    return this;
}
            /**
     * Whether this category is enabled
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether this category is enabled
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
            /**
     * Threshold value for this category (0.0 to 1.0)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("threshold")
private Float threshold;

        /**
         * Threshold value for this category (0.0 to 1.0)
         * @param threshold the value to set
         * @return this builder
         **/
        

public Builder threshold(Float threshold) {
    this.threshold = threshold;
    return this;
}
            /**
     * Action to take for this category
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("action")
private PolicyAction action;

        /**
         * Action to take for this category
         * @param action the value to set
         * @return this builder
         **/
        

public Builder action(PolicyAction action) {
    this.action = action;
    return this;
}


        public ContentModerationCategoryConfig build() {
            ContentModerationCategoryConfig model = new ContentModerationCategoryConfig(this.category
                , this.isEnabled
                , this.threshold
                , this.action);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContentModerationCategoryConfig model) {
                this.category(model.getCategory());
    this.isEnabled(model.getIsEnabled());
    this.threshold(model.getThreshold());
    this.action(model.getAction());
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
     * Content moderation category
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final ContentModerationCategory category;

        /**
     * Content moderation category
     * @return the value
     **/
    
    public ContentModerationCategory getCategory() {
        return category;
    }


        /**
     * Whether this category is enabled
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether this category is enabled
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


        /**
     * Threshold value for this category (0.0 to 1.0)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Float threshold;

        /**
     * Threshold value for this category (0.0 to 1.0)
     * @return the value
     **/
    
    public Float getThreshold() {
        return threshold;
    }

    
        /**
     * Action to take for this category
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final PolicyAction action;

        /**
     * Action to take for this category
     * @return the value
     **/
    
    public PolicyAction getAction() {
        return action;
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
        sb.append("ContentModerationCategoryConfig(");
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentModerationCategoryConfig)) {
            return false;
        }

        ContentModerationCategoryConfig other = (ContentModerationCategoryConfig) o;
        return java.util.Objects.equals(this.category, other.category) &&
            java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.threshold, other.threshold) &&
            java.util.Objects.equals(this.action, other.action);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }


}
