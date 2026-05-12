package com.oracle.aidataplatform.dp.model;


/**
 * Prompt attacks prevention safety policy
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PromptAttacksPreventionPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="policyType")

public final class PromptAttacksPreventionPolicy extends SafetyPolicy {
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


        public PromptAttacksPreventionPolicy build() {
            PromptAttacksPreventionPolicy model = new PromptAttacksPreventionPolicy(this.policyName
                    , this.policyDescription
                    , this.scope
                    , this.action
                    , this.threshold);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromptAttacksPreventionPolicy model) {
                this.policyName(model.getPolicyName());
    this.policyDescription(model.getPolicyDescription());
    this.scope(model.getScope());
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

    
    @Deprecated
    public PromptAttacksPreventionPolicy(String policyName, String policyDescription, PolicyScope scope, PolicyAction action, Float threshold) {
        super(policyName, policyDescription, scope, action, threshold);
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
        sb.append("PromptAttacksPreventionPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromptAttacksPreventionPolicy)) {
            return false;
        }

        PromptAttacksPreventionPolicy other = (PromptAttacksPreventionPolicy) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
