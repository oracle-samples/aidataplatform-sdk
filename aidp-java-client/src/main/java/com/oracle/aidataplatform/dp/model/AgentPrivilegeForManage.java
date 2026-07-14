// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a Agent.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AgentPrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    Use("USE"),
    ;

    

    private final String value;
    private static java.util.Map<String, AgentPrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (AgentPrivilegeForManage v : AgentPrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AgentPrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AgentPrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AgentPrivilegeForManage: " + key);
    }
}
