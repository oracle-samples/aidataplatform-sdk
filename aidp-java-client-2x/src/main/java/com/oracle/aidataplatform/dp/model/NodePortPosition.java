// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * UI position of an input or output port on a node.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum NodePortPosition {
    Top("TOP"),
    Bottom("BOTTOM"),
    Right("RIGHT"),
    Left("LEFT"),
    ;

    

    private final String value;
    private static java.util.Map<String, NodePortPosition> map;

    static {
        map = new java.util.HashMap<>();
        for (NodePortPosition v : NodePortPosition.values()) {
                map.put(v.getValue(), v);
            
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
        throw new IllegalArgumentException("Invalid NodePortPosition: " + key);
    }
}
