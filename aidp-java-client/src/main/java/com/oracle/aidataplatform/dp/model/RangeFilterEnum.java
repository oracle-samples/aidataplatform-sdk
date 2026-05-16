// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Accepted values of range filters
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum RangeFilterEnum implements com.oracle.bmc.http.internal.BmcEnum {
    TimeUpdated("TIME_UPDATED"),
    TimeCreated("TIME_CREATED"),
    ;

    

    private final String value;
    private static java.util.Map<String, RangeFilterEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (RangeFilterEnum v : RangeFilterEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    RangeFilterEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RangeFilterEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid RangeFilterEnum: " + key);
    }
}
