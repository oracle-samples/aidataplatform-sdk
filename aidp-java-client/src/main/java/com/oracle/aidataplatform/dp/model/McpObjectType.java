package com.oracle.aidataplatform.dp.model;


/**
 * Mcp object type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum McpObjectType implements com.oracle.bmc.http.internal.BmcEnum {
    Tool("TOOL"),
    Prompt("PROMPT"),
    Resource("RESOURCE"),
    ;

    

    private final String value;
    private static java.util.Map<String, McpObjectType> map;

    static {
        map = new java.util.HashMap<>();
        for (McpObjectType v : McpObjectType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    McpObjectType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static McpObjectType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid McpObjectType: " + key);
    }
}
