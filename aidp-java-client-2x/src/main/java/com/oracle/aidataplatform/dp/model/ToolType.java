package com.oracle.aidataplatform.dp.model;

/**
 * Tool type.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ToolType {
    Rag("RAG"),
    Sql("SQL"),
    Prompt("PROMPT"),
    Nl2Sql("NL2SQL"),
    Mcp("MCP"),
    Custom("CUSTOM"),
    Http("HTTP"),
    Reference("REFERENCE"),
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
}
