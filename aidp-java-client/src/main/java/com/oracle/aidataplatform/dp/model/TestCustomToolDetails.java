// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request details when toolType = CUSTOM
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestCustomToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class TestCustomToolDetails extends TestToolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
private String agentFlowId;

public Builder agentFlowId(String agentFlowId) {
    this.agentFlowId = agentFlowId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
private CustomToolConfiguration toolConfig;



public Builder toolConfig(CustomToolConfiguration toolConfig) {
    this.toolConfig = toolConfig;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("paramValues")
private TestToolParamValues paramValues;



public Builder paramValues(TestToolParamValues paramValues) {
    this.paramValues = paramValues;
    return this;
}
            /**
     * Base64-encoded ZIP file content for inline package upload during testing
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("packageContent")
private String packageContent;

        /**
         * Base64-encoded ZIP file content for inline package upload during testing
         * @param packageContent the value to set
         * @return this builder
         **/
        

public Builder packageContent(String packageContent) {
    this.packageContent = packageContent;
    return this;
}


        public TestCustomToolDetails build() {
            TestCustomToolDetails model = new TestCustomToolDetails(this.agentFlowId
                , this.toolConfig
                , this.paramValues
                , this.packageContent);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestCustomToolDetails model) {
                this.agentFlowId(model.getAgentFlowId());
    this.toolConfig(model.getToolConfig());
    this.paramValues(model.getParamValues());
    this.packageContent(model.getPackageContent());
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
    public TestCustomToolDetails(String agentFlowId, CustomToolConfiguration toolConfig, TestToolParamValues paramValues, String packageContent) {
    super(agentFlowId);
        this.toolConfig = toolConfig;
        this.paramValues = paramValues;
        this.packageContent = packageContent;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("toolConfig")
    private final CustomToolConfiguration toolConfig;

    
    public CustomToolConfiguration getToolConfig() {
        return toolConfig;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("paramValues")
    private final TestToolParamValues paramValues;

    
    public TestToolParamValues getParamValues() {
        return paramValues;
    }


        /**
     * Base64-encoded ZIP file content for inline package upload during testing
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("packageContent")
    private final String packageContent;

        /**
     * Base64-encoded ZIP file content for inline package upload during testing
     * @return the value
     **/
    
    public String getPackageContent() {
        return packageContent;
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
        sb.append("TestCustomToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toolConfig=").append(String.valueOf(this.toolConfig));
        sb.append(", paramValues=").append(String.valueOf(this.paramValues));
        sb.append(", packageContent=").append(String.valueOf(this.packageContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestCustomToolDetails)) {
            return false;
        }

        TestCustomToolDetails other = (TestCustomToolDetails) o;
        return java.util.Objects.equals(this.toolConfig, other.toolConfig) &&
            java.util.Objects.equals(this.paramValues, other.paramValues) &&
            java.util.Objects.equals(this.packageContent, other.packageContent) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toolConfig == null ? 43 : this.toolConfig.hashCode());
        result = (result * PRIME) + (this.paramValues == null ? 43 : this.paramValues.hashCode());
        result = (result * PRIME) + (this.packageContent == null ? 43 : this.packageContent.hashCode());
        return result;
    }


}
