package com.oracle.aidataplatform.dp.model;


/**
 * Type of operation
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum Operation implements com.oracle.bmc.http.internal.BmcEnum {
    Create("CREATE"),
    Update("UPDATE"),
    Delete("DELETE"),
    View("VIEW"),
    Grant("GRANT"),
    Revoke("REVOKE"),
    Attach("ATTACH"),
    Detach("DETACH"),
    ViewLogs("VIEW_LOGS"),
    Rename("RENAME"),
    Terminate("TERMINATE"),
    Move("MOVE"),
    Execute("EXECUTE"),
    ManageAccess("MANAGE_ACCESS"),
    Query("QUERY"),
    Manage("MANAGE"),
    Read("READ"),
    Write("WRITE"),
    Start("START"),
    Stop("STOP"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Operation.class);

    private final String value;
    private static java.util.Map<String, Operation> map;

    static {
        map = new java.util.HashMap<>();
        for (Operation v : Operation.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    Operation(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Operation create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'Operation', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
