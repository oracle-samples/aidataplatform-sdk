package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a table.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum TablePrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Insert("INSERT"),
    Update("UPDATE"),
    Delete("DELETE"),
    Alter("ALTER"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, TablePrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (TablePrivilegeForManage v : TablePrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    TablePrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TablePrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid TablePrivilegeForManage: " + key);
    }
}
