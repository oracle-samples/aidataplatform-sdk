// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Action to take when policy is violated.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PolicyAction implements com.oracle.bmc.http.internal.BmcEnum {
    Block("BLOCK"),
    Inform("INFORM"),
    Mask("MASK"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PolicyAction.class);

    private final String value;
    private static java.util.Map<String, PolicyAction> map;

    static {
        map = new java.util.HashMap<>();
        for (PolicyAction v : PolicyAction.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PolicyAction(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PolicyAction create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'PolicyAction', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
