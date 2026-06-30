// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Scope of policy application.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PolicyScope implements com.oracle.bmc.http.internal.BmcEnum {
    UserRequest("USER_REQUEST"),
    AgentResponse("AGENT_RESPONSE"),
    Both("BOTH"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PolicyScope.class);

    private final String value;
    private static java.util.Map<String, PolicyScope> map;

    static {
        map = new java.util.HashMap<>();
        for (PolicyScope v : PolicyScope.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn("Received unknown value '{}' for enum 'PolicyScope', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
