package com.oracle.aidataplatform.dp.model;

/**
 * The current state of the schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SchemaLifecycleState {
    Active("ACTIVE"),
    Creating("CREATING"),
    Deleting("DELETING"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaLifecycleState.class);

    private final String value;
    private static java.util.Map<String, SchemaLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (SchemaLifecycleState v : SchemaLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SchemaLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SchemaLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'SchemaLifecycleState', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
