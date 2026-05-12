package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a recipient
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum RecipientPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Admin("ADMIN"),
    Use("USE"),
    Read("READ"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(RecipientPrivilege.class);

    private final String value;
    private static java.util.Map<String, RecipientPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (RecipientPrivilege v : RecipientPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RecipientPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RecipientPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'RecipientPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
