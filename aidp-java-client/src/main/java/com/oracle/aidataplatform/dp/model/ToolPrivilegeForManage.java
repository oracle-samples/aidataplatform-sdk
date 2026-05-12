package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a tool.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ToolPrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, ToolPrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (ToolPrivilegeForManage v : ToolPrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ToolPrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ToolPrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ToolPrivilegeForManage: " + key);
    }
}
