// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Guardrails Summary information
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentFlowGuardrailsSummary.Builder.class)

public final class AgentFlowGuardrailsSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"policyType", "policyName", "policyDescription", "action", "scope", "threshold", "categories"})
    public AgentFlowGuardrailsSummary(PolicyType policyType, String policyName, String policyDescription, PolicyAction action, PolicyScope scope, Float threshold, java.util.List<CategoryConfig> categories) {
        super();
        this.policyType = policyType;
        this.policyName = policyName;
        this.policyDescription = policyDescription;
        this.action = action;
        this.scope = scope;
        this.threshold = threshold;
        this.categories = categories;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Type of safety policy
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("policyType")
        private PolicyType policyType;

                /**
         * Type of safety policy
         * @param policyType the value to set
         * @return this builder
         **/
        

        public Builder policyType(PolicyType policyType) {
        this.policyType = policyType;
        return this;
        }
            /**
     * Custom name for the policy
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

                /**
         * Custom name for the policy
         * @param policyName the value to set
         * @return this builder
         **/
        

        public Builder policyName(String policyName) {
        this.policyName = policyName;
        return this;
        }
            /**
     * Description of the policy
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("policyDescription")
        private String policyDescription;

                /**
         * Description of the policy
         * @param policyDescription the value to set
         * @return this builder
         **/
        

        public Builder policyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
        return this;
        }
            /**
     * Action to take when policy is violated
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private PolicyAction action;

                /**
         * Action to take when policy is violated
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(PolicyAction action) {
        this.action = action;
        return this;
        }
            /**
     * Scope of policy application
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private PolicyScope scope;

                /**
         * Scope of policy application
         * @param scope the value to set
         * @return this builder
         **/
        

        public Builder scope(PolicyScope scope) {
        this.scope = scope;
        return this;
        }
            /**
     * Threshold value for policy violation (0.0 to 1.0)
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Float threshold;

                /**
         * Threshold value for policy violation (0.0 to 1.0)
         * @param threshold the value to set
         * @return this builder
         **/
        

        public Builder threshold(Float threshold) {
        this.threshold = threshold;
        return this;
        }
            /**
     * Guardrail categories for this policy and their configurations
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<CategoryConfig> categories;

                /**
         * Guardrail categories for this policy and their configurations
         * @param categories the value to set
         * @return this builder
         **/
        

        public Builder categories(java.util.List<CategoryConfig> categories) {
        this.categories = categories;
        return this;
        }


        public AgentFlowGuardrailsSummary build() {
            AgentFlowGuardrailsSummary model = new AgentFlowGuardrailsSummary(this.policyType
                    , this.policyName
                    , this.policyDescription
                    , this.action
                    , this.scope
                    , this.threshold
                    , this.categories);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentFlowGuardrailsSummary model) {
                this.policyType(model.getPolicyType());
    this.policyName(model.getPolicyName());
    this.policyDescription(model.getPolicyDescription());
    this.action(model.getAction());
    this.scope(model.getScope());
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

    

    
        /**
     * Type of safety policy
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("policyType")
    private final PolicyType policyType;

        /**
     * Type of safety policy
     * @return the value
     **/
    
    public PolicyType getPolicyType() {
        return policyType;
    }


        /**
     * Custom name for the policy
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    private final String policyName;

        /**
     * Custom name for the policy
     * @return the value
     **/
    
    public String getPolicyName() {
        return policyName;
    }


        /**
     * Description of the policy
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("policyDescription")
    private final String policyDescription;

        /**
     * Description of the policy
     * @return the value
     **/
    
    public String getPolicyDescription() {
        return policyDescription;
    }

    
        /**
     * Action to take when policy is violated
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final PolicyAction action;

        /**
     * Action to take when policy is violated
     * @return the value
     **/
    
    public PolicyAction getAction() {
        return action;
    }

    
        /**
     * Scope of policy application
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final PolicyScope scope;

        /**
     * Scope of policy application
     * @return the value
     **/
    
    public PolicyScope getScope() {
        return scope;
    }


        /**
     * Threshold value for policy violation (0.0 to 1.0)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Float threshold;

        /**
     * Threshold value for policy violation (0.0 to 1.0)
     * @return the value
     **/
    
    public Float getThreshold() {
        return threshold;
    }


        /**
     * Guardrail categories for this policy and their configurations
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<CategoryConfig> categories;

        /**
     * Guardrail categories for this policy and their configurations
     * @return the value
     **/
    
    public java.util.List<CategoryConfig> getCategories() {
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
        sb.append("AgentFlowGuardrailsSummary(");
        sb.append("policyType=").append(String.valueOf(this.policyType));
        sb.append(", policyName=").append(String.valueOf(this.policyName));
        sb.append(", policyDescription=").append(String.valueOf(this.policyDescription));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentFlowGuardrailsSummary)) {
            return false;
        }

        AgentFlowGuardrailsSummary other = (AgentFlowGuardrailsSummary) o;
        return java.util.Objects.equals(this.policyType, other.policyType) &&
            java.util.Objects.equals(this.policyName, other.policyName) &&
            java.util.Objects.equals(this.policyDescription, other.policyDescription) &&
            java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.scope, other.scope) &&
            java.util.Objects.equals(this.threshold, other.threshold) &&
            java.util.Objects.equals(this.categories, other.categories);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policyType == null ? 43 : this.policyType.hashCode());
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result = (result * PRIME) + (this.policyDescription == null ? 43 : this.policyDescription.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        return result;
    }


}
