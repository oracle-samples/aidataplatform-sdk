package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a Agent flow.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AgentFlowPrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    Use("USE"),
    ;

    

    private final String value;
    private static java.util.Map<String, AgentFlowPrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (AgentFlowPrivilegeForManage v : AgentFlowPrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AgentFlowPrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AgentFlowPrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AgentFlowPrivilegeForManage: " + key);
    }
}
