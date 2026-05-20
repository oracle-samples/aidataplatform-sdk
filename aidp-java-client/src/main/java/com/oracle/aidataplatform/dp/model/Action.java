// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Action to enable or disable the logs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
    Enable("ENABLE"),
    Disable("DISABLE"),
    ;

    

    private final String value;
    private static java.util.Map<String, Action> map;

    static {
        map = new java.util.HashMap<>();
        for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    Action(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Action create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid Action: " + key);
    }
}
