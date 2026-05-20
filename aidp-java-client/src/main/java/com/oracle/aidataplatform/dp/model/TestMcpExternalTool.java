// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Test mcp tool connection
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestMcpExternalTool.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="testType")

public final class TestMcpExternalTool extends TestMcpOperation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * name of external tool to test
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("externalToolName")
private String externalToolName;

        /**
         * name of external tool to test
         * @param externalToolName the value to set
         * @return this builder
         **/
        

public Builder externalToolName(String externalToolName) {
    this.externalToolName = externalToolName;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("paramValues")
private TestToolParamValues paramValues;



public Builder paramValues(TestToolParamValues paramValues) {
    this.paramValues = paramValues;
    return this;
}


        public TestMcpExternalTool build() {
            TestMcpExternalTool model = new TestMcpExternalTool(this.externalToolName
                , this.paramValues);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestMcpExternalTool model) {
                this.externalToolName(model.getExternalToolName());
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
    public TestMcpExternalTool(String externalToolName, TestToolParamValues paramValues) {
    super();
        this.externalToolName = externalToolName;
        this.paramValues = paramValues;
    }


        /**
     * name of external tool to test
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("externalToolName")
    private final String externalToolName;

        /**
     * name of external tool to test
     * @return the value
     **/
    
    public String getExternalToolName() {
        return externalToolName;
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
        sb.append("TestMcpExternalTool(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", externalToolName=").append(String.valueOf(this.externalToolName));
        sb.append(", paramValues=").append(String.valueOf(this.paramValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestMcpExternalTool)) {
            return false;
        }

        TestMcpExternalTool other = (TestMcpExternalTool) o;
        return java.util.Objects.equals(this.externalToolName, other.externalToolName) &&
            java.util.Objects.equals(this.paramValues, other.paramValues) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.externalToolName == null ? 43 : this.externalToolName.hashCode());
        result = (result * PRIME) + (this.paramValues == null ? 43 : this.paramValues.hashCode());
        return result;
    }


}
