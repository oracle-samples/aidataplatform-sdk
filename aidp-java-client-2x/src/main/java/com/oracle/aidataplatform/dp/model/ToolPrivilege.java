package com.oracle.aidataplatform.dp.model;

/**
 * The privilege for a tool. Can be inherited privilege coming from object higher up in hierarchy.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ToolPrivilege {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, ToolPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (ToolPrivilege v : ToolPrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ToolPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ToolPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ToolPrivilege: " + key);
    }
}
