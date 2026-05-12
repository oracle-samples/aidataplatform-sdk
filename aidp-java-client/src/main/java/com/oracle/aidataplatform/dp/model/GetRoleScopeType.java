package com.oracle.aidataplatform.dp.model;


/**
 * The role scope based on grantee type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum GetRoleScopeType implements com.oracle.bmc.http.internal.BmcEnum {
    User("USER"),
    Admin("ADMIN"),
    MemberOf("MEMBER_OF"),
    Group("GROUP"),
    All("ALL"),
    ;

    

    private final String value;
    private static java.util.Map<String, GetRoleScopeType> map;

    static {
        map = new java.util.HashMap<>();
        for (GetRoleScopeType v : GetRoleScopeType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    GetRoleScopeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GetRoleScopeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid GetRoleScopeType: " + key);
    }
}
