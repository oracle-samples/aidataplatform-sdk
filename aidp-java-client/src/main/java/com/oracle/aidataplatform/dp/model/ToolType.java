// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Tool type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ToolType implements com.oracle.bmc.http.internal.BmcEnum {
    Rag("RAG"),
    Sql("SQL"),
    Prompt("PROMPT"),
    Nl2Sql("NL2SQL"),
    Mcp("MCP"),
    Custom("CUSTOM"),
    Http("HTTP"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ToolType.class);

    private final String value;
    private static java.util.Map<String, ToolType> map;

    static {
        map = new java.util.HashMap<>();
        for (ToolType v : ToolType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ToolType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ToolType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ToolType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
