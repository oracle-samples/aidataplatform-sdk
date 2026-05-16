// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * PII category configuration
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PiiCategory.Builder.class)

public final class PiiCategory  {
    @Deprecated
    @java.beans.ConstructorProperties({"category", "isEnabled", "action", "threshold"})
    public PiiCategory(String category, Boolean isEnabled, PolicyAction action, Float threshold) {
        super();
        this.category = category;
        this.isEnabled = isEnabled;
        this.action = action;
        this.threshold = threshold;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("category")
private String category;

        /**
         * PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)
         * @param category the value to set
         * @return this builder
         **/
        

public Builder category(String category) {
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
            /**
     * Detection threshold for this category
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("threshold")
private Float threshold;

        /**
         * Detection threshold for this category
         * @param threshold the value to set
         * @return this builder
         **/
        

public Builder threshold(Float threshold) {
    this.threshold = threshold;
    return this;
}


        public PiiCategory build() {
            PiiCategory model = new PiiCategory(this.category
                , this.isEnabled
                , this.action
                , this.threshold);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PiiCategory model) {
                this.category(model.getCategory());
    this.isEnabled(model.getIsEnabled());
    this.action(model.getAction());
    this.threshold(model.getThreshold());
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
     * PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

        /**
     * PII category name (e.g., SSN, EMAIL, PHONE_NUMBER)
     * @return the value
     **/
    
    public String getCategory() {
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


        /**
     * Detection threshold for this category
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Float threshold;

        /**
     * Detection threshold for this category
     * @return the value
     **/
    
    public Float getThreshold() {
        return threshold;
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
        sb.append("PiiCategory(");
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiCategory)) {
            return false;
        }

        PiiCategory other = (PiiCategory) o;
        return java.util.Objects.equals(this.category, other.category) &&
            java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.threshold, other.threshold);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        return result;
    }


}
