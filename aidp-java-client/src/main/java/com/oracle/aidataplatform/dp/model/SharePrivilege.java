package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a share, which can be an inherited privilege coming from the object higher in the hierarchy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SharePrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Admin("ADMIN"),
    Read("READ"),
    Use("USE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SharePrivilege.class);

    private final String value;
    private static java.util.Map<String, SharePrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (SharePrivilege v : SharePrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SharePrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SharePrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'SharePrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
