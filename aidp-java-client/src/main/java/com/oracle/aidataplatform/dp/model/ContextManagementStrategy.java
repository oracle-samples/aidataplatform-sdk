// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Strategy used for context management.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ContextManagementStrategy implements com.oracle.bmc.http.internal.BmcEnum {
    ClearToolUses("CLEAR_TOOL_USES"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ContextManagementStrategy.class);

    private final String value;
    private static java.util.Map<String, ContextManagementStrategy> map;

    static {
        map = new java.util.HashMap<>();
        for (ContextManagementStrategy v : ContextManagementStrategy.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ContextManagementStrategy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContextManagementStrategy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ContextManagementStrategy', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
