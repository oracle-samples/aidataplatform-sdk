// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Safety guardrails configuration for an agent flow
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GuardrailsConfiguration.Builder.class)

public final class GuardrailsConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "policies"})
    public GuardrailsConfiguration(String name, String description, java.util.List<SafetyPolicy> policies) {
        super();
        this.name = name;
        this.description = description;
        this.policies = policies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the guardrails configuration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the guardrails configuration
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of the guardrails configuration
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the guardrails configuration
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * List of safety policies configured in this guardrails
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("policies")
private java.util.List<SafetyPolicy> policies;

        /**
         * List of safety policies configured in this guardrails
         * @param policies the value to set
         * @return this builder
         **/
        

public Builder policies(java.util.List<SafetyPolicy> policies) {
    this.policies = policies;
    return this;
}


        public GuardrailsConfiguration build() {
            GuardrailsConfiguration model = new GuardrailsConfiguration(this.name
                , this.description
                , this.policies);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuardrailsConfiguration model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.policies(model.getPolicies());
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
     * Name of the guardrails configuration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the guardrails configuration
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the guardrails configuration
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the guardrails configuration
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * List of safety policies configured in this guardrails
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("policies")
    private final java.util.List<SafetyPolicy> policies;

        /**
     * List of safety policies configured in this guardrails
     * @return the value
     **/
    
    public java.util.List<SafetyPolicy> getPolicies() {
        return policies;
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
        sb.append("GuardrailsConfiguration(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", policies=").append(String.valueOf(this.policies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuardrailsConfiguration)) {
            return false;
        }

        GuardrailsConfiguration other = (GuardrailsConfiguration) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.policies, other.policies);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.policies == null ? 43 : this.policies.hashCode());
        return result;
    }


}
