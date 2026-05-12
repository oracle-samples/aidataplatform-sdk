package com.oracle.aidataplatform.dp.model;

/**
 * The catalog type. Internal (Standard) or external.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum CatalogType {
    External("EXTERNAL"),
    Internal("INTERNAL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CatalogType.class);

    private final String value;
    private static java.util.Map<String, CatalogType> map;

    static {
        map = new java.util.HashMap<>();
        for (CatalogType v : CatalogType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CatalogType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CatalogType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'CatalogType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
