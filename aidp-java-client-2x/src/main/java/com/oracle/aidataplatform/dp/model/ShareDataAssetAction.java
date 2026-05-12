package com.oracle.aidataplatform.dp.model;

/**
 * The action of an operation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ShareDataAssetAction {
    Add("ADD"),
    Remove("REMOVE"),
    ;

    

    private final String value;
    private static java.util.Map<String, ShareDataAssetAction> map;

    static {
        map = new java.util.HashMap<>();
        for (ShareDataAssetAction v : ShareDataAssetAction.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ShareDataAssetAction(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ShareDataAssetAction create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ShareDataAssetAction: " + key);
    }
}
