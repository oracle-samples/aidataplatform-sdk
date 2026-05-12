package com.oracle.aidataplatform.dp.model;

/**
 * Mcp test type.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum McpTestType {
    Connection("CONNECTION"),
    ExternalTool("EXTERNAL_TOOL"),
    ;

    

    private final String value;
    private static java.util.Map<String, McpTestType> map;

    static {
        map = new java.util.HashMap<>();
        for (McpTestType v : McpTestType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    McpTestType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static McpTestType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid McpTestType: " + key);
    }
}
