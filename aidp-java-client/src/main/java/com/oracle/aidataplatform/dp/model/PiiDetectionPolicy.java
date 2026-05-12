package com.oracle.aidataplatform.dp.model;



/**
 * PII detection safety policy
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PiiDetectionPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="policyType")

public final class PiiDetectionPolicy extends SafetyPolicy {
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
     * List of PII categories to detect
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("piiCategories")
private java.util.List<PiiCategory> piiCategories;

        /**
         * List of PII categories to detect
         * @param piiCategories the value to set
         * @return this builder
         **/
        

public Builder piiCategories(java.util.List<PiiCategory> piiCategories) {
    this.piiCategories = piiCategories;
    return this;
}
            /**
     * Custom PII detection rules
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customPiiRules")
private java.util.List<CustomPiiRule> customPiiRules;

        /**
         * Custom PII detection rules
         * @param customPiiRules the value to set
         * @return this builder
         **/
        

public Builder customPiiRules(java.util.List<CustomPiiRule> customPiiRules) {
    this.customPiiRules = customPiiRules;
    return this;
}


        public PiiDetectionPolicy build() {
            PiiDetectionPolicy model = new PiiDetectionPolicy(this.policyName
                , this.policyDescription
                , this.scope
                , this.action
                , this.threshold
                , this.piiCategories
                , this.customPiiRules);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PiiDetectionPolicy model) {
                this.policyName(model.getPolicyName());
    this.policyDescription(model.getPolicyDescription());
    this.scope(model.getScope());
    this.action(model.getAction());
    this.threshold(model.getThreshold());
    this.piiCategories(model.getPiiCategories());
    this.customPiiRules(model.getCustomPiiRules());
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
    public PiiDetectionPolicy(String policyName, String policyDescription, PolicyScope scope, PolicyAction action, Float threshold, java.util.List<PiiCategory> piiCategories, java.util.List<CustomPiiRule> customPiiRules) {
    super(policyName, policyDescription, scope, action, threshold);
        this.piiCategories = piiCategories;
        this.customPiiRules = customPiiRules;
    }


        /**
     * List of PII categories to detect
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("piiCategories")
    private final java.util.List<PiiCategory> piiCategories;

        /**
     * List of PII categories to detect
     * @return the value
     **/
    
    public java.util.List<PiiCategory> getPiiCategories() {
        return piiCategories;
    }


        /**
     * Custom PII detection rules
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customPiiRules")
    private final java.util.List<CustomPiiRule> customPiiRules;

        /**
     * Custom PII detection rules
     * @return the value
     **/
    
    public java.util.List<CustomPiiRule> getCustomPiiRules() {
        return customPiiRules;
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
        sb.append("PiiDetectionPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", piiCategories=").append(String.valueOf(this.piiCategories));
        sb.append(", customPiiRules=").append(String.valueOf(this.customPiiRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiDetectionPolicy)) {
            return false;
        }

        PiiDetectionPolicy other = (PiiDetectionPolicy) o;
        return java.util.Objects.equals(this.piiCategories, other.piiCategories) &&
            java.util.Objects.equals(this.customPiiRules, other.customPiiRules) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.piiCategories == null ? 43 : this.piiCategories.hashCode());
        result = (result * PRIME) + (this.customPiiRules == null ? 43 : this.customPiiRules.hashCode());
        return result;
    }


}
