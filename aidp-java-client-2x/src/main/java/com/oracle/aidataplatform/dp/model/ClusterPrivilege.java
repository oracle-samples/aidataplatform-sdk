package com.oracle.aidataplatform.dp.model;

/**
 * Privilege for a cluster.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ClusterPrivilege {
    Read("READ"),
    Use("USE"),
    Admin("ADMIN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ClusterPrivilege.class);

    private final String value;
    private static java.util.Map<String, ClusterPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (ClusterPrivilege v : ClusterPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ClusterPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ClusterPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ClusterPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
