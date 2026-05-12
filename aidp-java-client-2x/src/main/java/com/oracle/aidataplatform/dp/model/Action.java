package com.oracle.aidataplatform.dp.model;

/**
 * action to enable or disable the logs
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum Action {
    Enable("ENABLE"),
    Disable("DISABLE"),
    ;

    

    private final String value;
    private static java.util.Map<String, Action> map;

    static {
        map = new java.util.HashMap<>();
        for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    Action(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Action create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid Action: " + key);
    }
}
