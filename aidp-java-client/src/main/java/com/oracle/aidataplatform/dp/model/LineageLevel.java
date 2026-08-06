// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* Corresponding enums are:
* Entity   - Entity objects.
* Column - Column objects.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum LineageLevel implements com.oracle.bmc.http.internal.BmcEnum {
    Entity("ENTITY"),
    Column("COLUMN"),
    ;

    

    private final String value;
    private static java.util.Map<String, LineageLevel> map;

    static {
        map = new java.util.HashMap<>();
        for (LineageLevel v : LineageLevel.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    LineageLevel(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LineageLevel create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid LineageLevel: " + key);
    }
}
