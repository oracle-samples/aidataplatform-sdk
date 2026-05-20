// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Content moderation safety policy
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ContentModerationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="policyType")

public final class ContentModerationPolicy extends SafetyPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
private String policyName;

public Builder policyName(String policyName) {
    this.policyName = policyName;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("policyDescription")
private String policyDescription;

public Builder policyDescription(String policyDescription) {
    this.policyDescription = policyDescription;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("scope")
private PolicyScope scope;

public Builder scope(PolicyScope scope) {
    this.scope = scope;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("action")
private PolicyAction action;

public Builder action(PolicyAction action) {
    this.action = action;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("threshold")
private Float threshold;

public Builder threshold(Float threshold) {
    this.threshold = threshold;
    return this;
}
            /**
     * Content moderation categories and their configurations
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("categories")
private java.util.List<ContentModerationCategoryConfig> categories;

        /**
         * Content moderation categories and their configurations
         * @param categories the value to set
         * @return this builder
         **/
        

public Builder categories(java.util.List<ContentModerationCategoryConfig> categories) {
    this.categories = categories;
    return this;
}


        public ContentModerationPolicy build() {
            ContentModerationPolicy model = new ContentModerationPolicy(this.policyName
                , this.policyDescription
                , this.scope
                , this.action
                , this.threshold
                , this.categories);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContentModerationPolicy model) {
                this.policyName(model.getPolicyName());
    this.policyDescription(model.getPolicyDescription());
    this.scope(model.getScope());
    this.action(model.getAction());
    this.threshold(model.getThreshold());
    this.categories(model.getCategories());
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

    
    @Deprecated
    public ContentModerationPolicy(String policyName, String policyDescription, PolicyScope scope, PolicyAction action, Float threshold, java.util.List<ContentModerationCategoryConfig> categories) {
    super(policyName, policyDescription, scope, action, threshold);
        this.categories = categories;
    }


        /**
     * Content moderation categories and their configurations
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<ContentModerationCategoryConfig> categories;

        /**
     * Content moderation categories and their configurations
     * @return the value
     **/
    
    public java.util.List<ContentModerationCategoryConfig> getCategories() {
        return categories;
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
        sb.append("ContentModerationPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentModerationPolicy)) {
            return false;
        }

        ContentModerationPolicy other = (ContentModerationPolicy) o;
        return java.util.Objects.equals(this.categories, other.categories) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        return result;
    }


}
