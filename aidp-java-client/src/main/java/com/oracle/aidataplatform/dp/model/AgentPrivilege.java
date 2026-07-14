// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a agent. Can be inherited privilege coming from object higher up in hierarchy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AgentPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    Use("USE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(AgentPrivilege.class);

    private final String value;
    private static java.util.Map<String, AgentPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (AgentPrivilege v : AgentPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AgentPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AgentPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'AgentPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
