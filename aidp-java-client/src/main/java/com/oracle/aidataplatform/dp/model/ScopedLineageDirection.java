// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Direction of a non-anchor node relative to the active lineage anchor.
* BOTH is intentionally unsupported because a rendered non-anchor node belongs to one side
* of the anchor.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ScopedLineageDirection implements com.oracle.bmc.http.internal.BmcEnum {
    Upstream("UPSTREAM"),
    Downstream("DOWNSTREAM"),
    ;

    

    private final String value;
    private static java.util.Map<String, ScopedLineageDirection> map;

    static {
        map = new java.util.HashMap<>();
        for (ScopedLineageDirection v : ScopedLineageDirection.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ScopedLineageDirection(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ScopedLineageDirection create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ScopedLineageDirection: " + key);
    }
}
