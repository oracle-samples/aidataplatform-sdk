package com.oracle.aidataplatform.dp.model;


/**
 * Request details when toolType = MCP
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestMcpToolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class TestMcpToolDetails extends TestToolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
        private String agentFlowId;

            public Builder agentFlowId(String agentFlowId) {
            this.agentFlowId = agentFlowId;
            return this;
            }
        
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private McpToolConfiguration config;

        

        public Builder config(McpToolConfiguration config) {
        this.config = config;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("mcpTest")
        private TestMcpOperation mcpTest;

        

        public Builder mcpTest(TestMcpOperation mcpTest) {
        this.mcpTest = mcpTest;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("paramValues")
        private TestToolParamValues paramValues;

        

        public Builder paramValues(TestToolParamValues paramValues) {
        this.paramValues = paramValues;
        return this;
        }
            /**
     * name of mcp server
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("serverName")
        private String serverName;

                /**
         * name of mcp server
         * @param serverName the value to set
         * @return this builder
         **/
        

        public Builder serverName(String serverName) {
        this.serverName = serverName;
        return this;
        }


        public TestMcpToolDetails build() {
            TestMcpToolDetails model = new TestMcpToolDetails(this.agentFlowId
                    , this.config
                    , this.mcpTest
                    , this.paramValues
                    , this.serverName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestMcpToolDetails model) {
                this.agentFlowId(model.getAgentFlowId());
    this.config(model.getConfig());
    this.mcpTest(model.getMcpTest());
    this.paramValues(model.getParamValues());
    this.serverName(model.getServerName());
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
    public TestMcpToolDetails(String agentFlowId, McpToolConfiguration config, TestMcpOperation mcpTest, TestToolParamValues paramValues, String serverName) {
        super(agentFlowId);
        this.config = config;
        this.mcpTest = mcpTest;
        this.paramValues = paramValues;
        this.serverName = serverName;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final McpToolConfiguration config;

    
    public McpToolConfiguration getConfig() {
        return config;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("mcpTest")
    private final TestMcpOperation mcpTest;

    
    public TestMcpOperation getMcpTest() {
        return mcpTest;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("paramValues")
    private final TestToolParamValues paramValues;

    
    public TestToolParamValues getParamValues() {
        return paramValues;
    }


        /**
     * name of mcp server
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("serverName")
    private final String serverName;

        /**
     * name of mcp server
     * @return the value
     **/
    
    public String getServerName() {
        return serverName;
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
        sb.append("TestMcpToolDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", mcpTest=").append(String.valueOf(this.mcpTest));
        sb.append(", paramValues=").append(String.valueOf(this.paramValues));
        sb.append(", serverName=").append(String.valueOf(this.serverName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestMcpToolDetails)) {
            return false;
        }

        TestMcpToolDetails other = (TestMcpToolDetails) o;
        return java.util.Objects.equals(this.config, other.config) &&
            java.util.Objects.equals(this.mcpTest, other.mcpTest) &&
            java.util.Objects.equals(this.paramValues, other.paramValues) &&
            java.util.Objects.equals(this.serverName, other.serverName) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.mcpTest == null ? 43 : this.mcpTest.hashCode());
        result = (result * PRIME) + (this.paramValues == null ? 43 : this.paramValues.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        return result;
    }


}
