// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Individual safety policy configuration
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="policyType", defaultImpl=SafetyPolicy.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PiiDetectionPolicy.class, name = "PII_DETECTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DeniedTopicsPolicy.class, name = "DENIED_TOPICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ContentModerationPolicy.class, name = "CONTENT_MODERATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = WordFiltersPolicy.class, name = "WORD_FILTERS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PromptAttacksPreventionPolicy.class, name = "PROMPT_ATTACKS_PREVENTION")
})

public class SafetyPolicy  {
    @Deprecated
    @java.beans.ConstructorProperties({"policyName", "policyDescription", "scope", "action", "threshold"})
    protected SafetyPolicy(String policyName, String policyDescription, PolicyScope scope, PolicyAction action, Float threshold) {
        super();
        this.policyName = policyName;
        this.policyDescription = policyDescription;
        this.scope = scope;
        this.action = action;
        this.threshold = threshold;
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
        sb.append("SafetyPolicy(");
        sb.append("policyName=").append(String.valueOf(this.policyName));
        sb.append(", policyDescription=").append(String.valueOf(this.policyDescription));
        sb.append(", scope=").append(String.valueOf(this.scope));
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
        if (!(o instanceof SafetyPolicy)) {
            return false;
        }

        SafetyPolicy other = (SafetyPolicy) o;
        return java.util.Objects.equals(this.policyName, other.policyName) &&
            java.util.Objects.equals(this.policyDescription, other.policyDescription) &&
            java.util.Objects.equals(this.scope, other.scope) &&
            java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.threshold, other.threshold);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result = (result * PRIME) + (this.policyDescription == null ? 43 : this.policyDescription.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        return result;
    }


}
