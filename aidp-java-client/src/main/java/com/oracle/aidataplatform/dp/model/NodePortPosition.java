// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * UI position of an input or output port on a node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum NodePortPosition implements com.oracle.bmc.http.internal.BmcEnum {
    Top("TOP"),
    Bottom("BOTTOM"),
    Right("RIGHT"),
    Left("LEFT"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(NodePortPosition.class);

    private final String value;
    private static java.util.Map<String, NodePortPosition> map;

    static {
        map = new java.util.HashMap<>();
        for (NodePortPosition v : NodePortPosition.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NodePortPosition(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NodePortPosition create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'NodePortPosition', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
