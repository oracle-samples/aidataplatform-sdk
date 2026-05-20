// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The operation that can be performed on this resource.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ParAccessType implements com.oracle.bmc.http.internal.BmcEnum {
    ObjectRead("OBJECT_READ"),
    ObjectWrite("OBJECT_WRITE"),
    ObjectReadWrite("OBJECT_READ_WRITE"),
    AnyObjectWrite("ANY_OBJECT_WRITE"),
    AnyObjectRead("ANY_OBJECT_READ"),
    AnyObjectReadWrite("ANY_OBJECT_READ_WRITE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ParAccessType.class);

    private final String value;
    private static java.util.Map<String, ParAccessType> map;

    static {
        map = new java.util.HashMap<>();
        for (ParAccessType v : ParAccessType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ParAccessType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ParAccessType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ParAccessType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
