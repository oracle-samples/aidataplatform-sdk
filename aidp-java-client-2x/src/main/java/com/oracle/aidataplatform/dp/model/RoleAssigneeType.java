package com.oracle.aidataplatform.dp.model;

/**
 * The entity type to which a role can be assigned to/revoked from. It is also used for role Admin type.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum RoleAssigneeType {
    User("USER"),
    Role("ROLE"),
    Group("GROUP"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RoleAssigneeType.class);

    private final String value;
    private static java.util.Map<String, RoleAssigneeType> map;

    static {
        map = new java.util.HashMap<>();
        for (RoleAssigneeType v : RoleAssigneeType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RoleAssigneeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RoleAssigneeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'RoleAssigneeType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
