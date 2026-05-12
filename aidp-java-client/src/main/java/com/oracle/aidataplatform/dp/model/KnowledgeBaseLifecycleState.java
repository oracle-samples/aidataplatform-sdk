package com.oracle.aidataplatform.dp.model;


/**
 * Lifecycle state for KnowledgeBase
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Creating("CREATING"),
    Active("ACTIVE"),
    Updating("UPDATING"),
    Deleting("DELETING"),
    NeedsAttention("NEEDS_ATTENTION"),
    Deleted("DELETED"),
    Failed("FAILED"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseLifecycleState v : KnowledgeBaseLifecycleState.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseLifecycleState: " + key);
    }
}
