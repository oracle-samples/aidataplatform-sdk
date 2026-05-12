package com.oracle.aidataplatform.dp.model;

/**
 * LifecycleState of an Agent Flow Session or Deployment.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DeploymentLifecycleState {
    Creating("CREATING"),
    Active("ACTIVE"),
    Inactive("INACTIVE"),
    Failed("FAILED"),
    Deleted("DELETED"),
    ;

    

    private final String value;
    private static java.util.Map<String, DeploymentLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentLifecycleState v : DeploymentLifecycleState.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    DeploymentLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DeploymentLifecycleState: " + key);
    }
}
