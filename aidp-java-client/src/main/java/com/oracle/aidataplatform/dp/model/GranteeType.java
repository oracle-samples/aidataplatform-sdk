// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The information about the Grantee Type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum GranteeType implements com.oracle.bmc.http.internal.BmcEnum {
    User("USER"),
    Role("ROLE"),
    Group("GROUP"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(GranteeType.class);

    private final String value;
    private static java.util.Map<String, GranteeType> map;

    static {
        map = new java.util.HashMap<>();
        for (GranteeType v : GranteeType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    GranteeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GranteeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'GranteeType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
