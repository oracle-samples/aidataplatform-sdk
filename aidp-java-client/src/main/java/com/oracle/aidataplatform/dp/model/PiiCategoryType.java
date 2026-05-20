// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * PII Category types
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PiiCategoryType implements com.oracle.bmc.http.internal.BmcEnum {
    Person("PERSON"),
    Address("ADDRESS"),
    TelephoneNumber("TELEPHONE_NUMBER"),
    Email("EMAIL"),
    ;

    

    private final String value;
    private static java.util.Map<String, PiiCategoryType> map;

    static {
        map = new java.util.HashMap<>();
        for (PiiCategoryType v : PiiCategoryType.values()) {
                map.put(v.getValue(), v);
            
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
        throw new IllegalArgumentException("Invalid PiiCategoryType: " + key);
    }
}
