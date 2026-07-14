// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * PII Category types.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PiiCategoryType implements com.oracle.bmc.http.internal.BmcEnum {
    Person("PERSON"),
    Address("ADDRESS"),
    TelephoneNumber("TELEPHONE_NUMBER"),
    Email("EMAIL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PiiCategoryType.class);

    private final String value;
    private static java.util.Map<String, PiiCategoryType> map;

    static {
        map = new java.util.HashMap<>();
        for (PiiCategoryType v : PiiCategoryType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    PiiCategoryType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PiiCategoryType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'PiiCategoryType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
