// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Session configuration for an Agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionConfiguration.Builder.class)

public final class SessionConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"variables", "sessionRetentionConfig"})
    public SessionConfiguration(java.util.Map<String, SessionVariableDetails> variables, SessionRetentionConfiguration sessionRetentionConfig) {
        super();
        this.variables = variables;
        this.sessionRetentionConfig = sessionRetentionConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Map of session variable name to variable definition.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("variables")
private java.util.Map<String, SessionVariableDetails> variables;

        /**
         * Map of session variable name to variable definition.
         * @param variables the value to set
         * @return this builder
         **/
        

public Builder variables(java.util.Map<String, SessionVariableDetails> variables) {
    this.variables = variables;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("sessionRetentionConfig")
private SessionRetentionConfiguration sessionRetentionConfig;



public Builder sessionRetentionConfig(SessionRetentionConfiguration sessionRetentionConfig) {
    this.sessionRetentionConfig = sessionRetentionConfig;
    return this;
}


        public SessionConfiguration build() {
            SessionConfiguration model = new SessionConfiguration(this.variables
                , this.sessionRetentionConfig);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionConfiguration model) {
                this.variables(model.getVariables());
    this.sessionRetentionConfig(model.getSessionRetentionConfig());
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
     * Map of session variable name to variable definition.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, SessionVariableDetails> variables;

        /**
     * Map of session variable name to variable definition.
     * @return the value
     **/
    
    public java.util.Map<String, SessionVariableDetails> getVariables() {
        return variables;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("sessionRetentionConfig")
    private final SessionRetentionConfiguration sessionRetentionConfig;

    
    public SessionRetentionConfiguration getSessionRetentionConfig() {
        return sessionRetentionConfig;
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
        sb.append("SessionConfiguration(");
        sb.append("variables=").append(String.valueOf(this.variables));
        sb.append(", sessionRetentionConfig=").append(String.valueOf(this.sessionRetentionConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionConfiguration)) {
            return false;
        }

        SessionConfiguration other = (SessionConfiguration) o;
        return java.util.Objects.equals(this.variables, other.variables) &&
            java.util.Objects.equals(this.sessionRetentionConfig, other.sessionRetentionConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.sessionRetentionConfig == null ? 43 : this.sessionRetentionConfig.hashCode());
        return result;
    }


}
