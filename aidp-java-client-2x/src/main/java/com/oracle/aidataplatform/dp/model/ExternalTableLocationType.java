// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The location type of an external table.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ExternalTableLocationType {
    ObjectStorage("OBJECT_STORAGE"),
    Mount("MOUNT"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ExternalTableLocationType.class);

    private final String value;
    private static java.util.Map<String, ExternalTableLocationType> map;

    static {
        map = new java.util.HashMap<>();
        for (ExternalTableLocationType v : ExternalTableLocationType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExternalTableLocationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExternalTableLocationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ExternalTableLocationType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
