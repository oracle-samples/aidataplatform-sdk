// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Scope of policy application
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PolicyScope implements com.oracle.bmc.http.internal.BmcEnum {
    UserRequest("USER_REQUEST"),
    AgentResponse("AGENT_RESPONSE"),
    Both("BOTH"),
    ;

    

    private final String value;
    private static java.util.Map<String, PolicyScope> map;

    static {
        map = new java.util.HashMap<>();
        for (PolicyScope v : PolicyScope.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    PolicyScope(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PolicyScope create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid PolicyScope: " + key);
    }
}
