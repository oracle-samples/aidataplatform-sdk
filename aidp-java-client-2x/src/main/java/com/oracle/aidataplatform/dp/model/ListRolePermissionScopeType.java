package com.oracle.aidataplatform.dp.model;

/**
 * The permission scope for a role based on how it was obtained.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ListRolePermissionScopeType {
    Direct("DIRECT"),
    Inherited("INHERITED"),
    All("ALL"),
    ;

    

    private final String value;
    private static java.util.Map<String, ListRolePermissionScopeType> map;

    static {
        map = new java.util.HashMap<>();
        for (ListRolePermissionScopeType v : ListRolePermissionScopeType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ListRolePermissionScopeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ListRolePermissionScopeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ListRolePermissionScopeType: " + key);
    }
}
