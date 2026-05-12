package com.oracle.aidataplatform.dp.model;


/**
 * Table type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum TableType implements com.oracle.bmc.http.internal.BmcEnum {
    Managed("MANAGED"),
    External("EXTERNAL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TableType.class);

    private final String value;
    private static java.util.Map<String, TableType> map;

    static {
        map = new java.util.HashMap<>();
        for (TableType v : TableType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    TableType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TableType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'TableType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
