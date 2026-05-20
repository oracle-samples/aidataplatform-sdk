// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a view.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ViewPrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Alter("ALTER"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, ViewPrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (ViewPrivilegeForManage v : ViewPrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ViewPrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ViewPrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ViewPrivilegeForManage: " + key);
    }
}
