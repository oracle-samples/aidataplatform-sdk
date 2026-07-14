// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The target query engine type for SQL tool execution.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SqlToolQueryType implements com.oracle.bmc.http.internal.BmcEnum {
    Oracle("ORACLE"),
    Spark("SPARK"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SqlToolQueryType.class);

    private final String value;
    private static java.util.Map<String, SqlToolQueryType> map;

    static {
        map = new java.util.HashMap<>();
        for (SqlToolQueryType v : SqlToolQueryType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SqlToolQueryType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SqlToolQueryType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'SqlToolQueryType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
