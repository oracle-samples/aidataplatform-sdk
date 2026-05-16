// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The type of catalog for the schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SchemaCatalogType {
    Adw("ADW"),
    Alh("ALH"),
    Standard("STANDARD"),
    KafkaTopic("KAFKA_TOPIC"),
    Atp("ATP"),
    Oracle("ORACLE"),
    Exadata("EXADATA"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaCatalogType.class);

    private final String value;
    private static java.util.Map<String, SchemaCatalogType> map;

    static {
        map = new java.util.HashMap<>();
        for (SchemaCatalogType v : SchemaCatalogType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SchemaCatalogType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SchemaCatalogType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'SchemaCatalogType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
