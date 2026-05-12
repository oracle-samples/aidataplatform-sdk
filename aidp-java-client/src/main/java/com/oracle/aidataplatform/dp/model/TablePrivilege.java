package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a table. Can be inherited privilege coming from object higher up in hierarchy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum TablePrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Manage("MANAGE"),
    Write("WRITE"),
    Insert("INSERT"),
    Update("UPDATE"),
    Delete("DELETE"),
    Alter("ALTER"),
    Admin("ADMIN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TablePrivilege.class);

    private final String value;
    private static java.util.Map<String, TablePrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (TablePrivilege v : TablePrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TablePrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TablePrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'TablePrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
