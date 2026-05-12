package com.oracle.aidataplatform.dp.model;


/**
 * The role type for a role.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum RoleType implements com.oracle.bmc.http.internal.BmcEnum {
    System("SYSTEM"),
    Custom("CUSTOM"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RoleType.class);

    private final String value;
    private static java.util.Map<String, RoleType> map;

    static {
        map = new java.util.HashMap<>();
        for (RoleType v : RoleType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RoleType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RoleType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'RoleType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
