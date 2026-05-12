package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a Agent flow. Can be inherited privilege coming from object higher up in hierarchy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AgentFlowPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    Use("USE"),
    ;

    

    private final String value;
    private static java.util.Map<String, AgentFlowPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (AgentFlowPrivilege v : AgentFlowPrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AgentFlowPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AgentFlowPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AgentFlowPrivilege: " + key);
    }
}
