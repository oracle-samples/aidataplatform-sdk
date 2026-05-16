// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Type used for applying memory limits.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum MemoryLimitStrategy {
    Truncation("TRUNCATION"),
    ;

    

    private final String value;
    private static java.util.Map<String, MemoryLimitStrategy> map;

    static {
        map = new java.util.HashMap<>();
        for (MemoryLimitStrategy v : MemoryLimitStrategy.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    MemoryLimitStrategy(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MemoryLimitStrategy create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MemoryLimitStrategy: " + key);
    }
}
