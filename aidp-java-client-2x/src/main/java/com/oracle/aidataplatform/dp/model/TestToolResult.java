package com.oracle.aidataplatform.dp.model;


/**
 * Base response for a test tool action.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType", defaultImpl=TestToolResult.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = McpTestToolResult.class, name = "MCP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = HttpTestToolResult.class, name = "HTTP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = RagTestToolResult.class, name = "RAG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SqlTestToolResult.class, name = "SQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PromptTestToolResult.class, name = "PROMPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CustomTestToolResult.class, name = "CUSTOM")
})

public class TestToolResult  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected TestToolResult() {
        super();
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
        sb.append("TestToolResult(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestToolResult)) {
            return false;
        }

        TestToolResult other = (TestToolResult) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }

    /**
     * Selects which result schema applies.
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
