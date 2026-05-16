// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Base model for testing any tool.  {@code toolType} drives the subtype.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType", defaultImpl=TestToolDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestCustomToolDetails.class, name = "CUSTOM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestHttpToolDetails.class, name = "HTTP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestSqlToolDetails.class, name = "SQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestRagToolDetails.class, name = "RAG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestMcpToolDetails.class, name = "MCP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = TestPromptToolDetails.class, name = "PROMPT")
})

public class TestToolDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"agentFlowId"})
    protected TestToolDetails(String agentFlowId) {
        super();
        this.agentFlowId = agentFlowId;
    }




        /**
     * Agent flow id for which the tool is being tested
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowId")
    private final String agentFlowId;

        /**
     * Agent flow id for which the tool is being tested
     * @return the value
     **/
    
    public String getAgentFlowId() {
        return agentFlowId;
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
        sb.append("TestToolDetails(");
        sb.append("agentFlowId=").append(String.valueOf(this.agentFlowId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestToolDetails)) {
            return false;
        }

        TestToolDetails other = (TestToolDetails) o;
        return java.util.Objects.equals(this.agentFlowId, other.agentFlowId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.agentFlowId == null ? 43 : this.agentFlowId.hashCode());
        return result;
    }

    /**
     * Which kind of tool this test is for (chooses the subtype).
     **/
    public enum ToolType {
        Sql("SQL"),
        Prompt("PROMPT"),
        Rag("RAG"),
        Mcp("MCP"),
        Http("HTTP"),
        Custom("CUSTOM"),
        ;

        

        private final String value;
        private static java.util.Map<String, ToolType> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolType v : ToolType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ToolType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ToolType: " + key);
        }
    };
}
