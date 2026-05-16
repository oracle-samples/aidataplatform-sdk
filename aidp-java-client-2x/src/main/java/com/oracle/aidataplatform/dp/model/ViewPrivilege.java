// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The privilege for a View which could be an inherited privilege coming from object up in hierarchy.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ViewPrivilege {
    Select("SELECT"),
    Manage("MANAGE"),
    Write("WRITE"),
    Insert("INSERT"),
    Update("UPDATE"),
    Delete("DELETE"),
    Alter("ALTER"),
    Admin("ADMIN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ViewPrivilege.class);

    private final String value;
    private static java.util.Map<String, ViewPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (ViewPrivilege v : ViewPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ViewPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ViewPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ViewPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
