// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Context management configuration for controlling conversation history before model invocation, such as clearing older tool-use outputs to reduce context size. If present, context management is enabled; if omitted or null, disabled.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ContextManagementConfiguration.Builder.class)

public final class ContextManagementConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"rules"})
    public ContextManagementConfiguration(java.util.List<ContextManagementRule> rules) {
        super();
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("rules")
private java.util.List<ContextManagementRule> rules;

        /**
         * Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.
         * @param rules the value to set
         * @return this builder
         **/
        

public Builder rules(java.util.List<ContextManagementRule> rules) {
    this.rules = rules;
    return this;
}


        public ContextManagementConfiguration build() {
            ContextManagementConfiguration model = new ContextManagementConfiguration(this.rules);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContextManagementConfiguration model) {
                this.rules(model.getRules());
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
     * Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<ContextManagementRule> rules;

        /**
     * Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.
     * @return the value
     **/
    
    public java.util.List<ContextManagementRule> getRules() {
        return rules;
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
        sb.append("ContextManagementConfiguration(");
        sb.append("rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContextManagementConfiguration)) {
            return false;
        }

        ContextManagementConfiguration other = (ContextManagementConfiguration) o;
        return java.util.Objects.equals(this.rules, other.rules);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        return result;
    }


}
