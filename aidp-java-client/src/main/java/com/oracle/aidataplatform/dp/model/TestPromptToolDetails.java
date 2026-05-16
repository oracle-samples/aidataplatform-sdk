// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request details when toolType = PROMPT.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestPromptToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class TestPromptToolDetails extends TestToolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
private String agentFlowId;

public Builder agentFlowId(String agentFlowId) {
    this.agentFlowId = agentFlowId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("config")
private PromptToolConfiguration config;



public Builder config(PromptToolConfiguration config) {
    this.config = config;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("paramValues")
private TestToolParamValues paramValues;



public Builder paramValues(TestToolParamValues paramValues) {
    this.paramValues = paramValues;
    return this;
}


        public TestPromptToolDetails build() {
            TestPromptToolDetails model = new TestPromptToolDetails(this.agentFlowId
                , this.config
                , this.paramValues);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestPromptToolDetails model) {
                this.agentFlowId(model.getAgentFlowId());
    this.config(model.getConfig());
    this.paramValues(model.getParamValues());
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
    public TestPromptToolDetails(String agentFlowId, PromptToolConfiguration config, TestToolParamValues paramValues) {
    super(agentFlowId);
        this.config = config;
        this.paramValues = paramValues;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final PromptToolConfiguration config;

    
    public PromptToolConfiguration getConfig() {
        return config;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("paramValues")
    private final TestToolParamValues paramValues;

    
    public TestToolParamValues getParamValues() {
        return paramValues;
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
        sb.append("TestPromptToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", paramValues=").append(String.valueOf(this.paramValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestPromptToolDetails)) {
            return false;
        }

        TestPromptToolDetails other = (TestPromptToolDetails) o;
        return java.util.Objects.equals(this.config, other.config) &&
            java.util.Objects.equals(this.paramValues, other.paramValues) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.paramValues == null ? 43 : this.paramValues.hashCode());
        return result;
    }


}
