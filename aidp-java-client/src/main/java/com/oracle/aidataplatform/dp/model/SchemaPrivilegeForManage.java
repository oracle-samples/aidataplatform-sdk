// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SchemaPrivilegeForManage implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Write("WRITE"),
    CreateView("CREATE_VIEW"),
    CreateVolume("CREATE_VOLUME"),
    CreateTable("CREATE_TABLE"),
    Admin("ADMIN"),
    CreateKnowledgeBase("CREATE_KNOWLEDGE_BASE"),
    CreateModel("CREATE_MODEL"),
    ;

    

    private final String value;
    private static java.util.Map<String, SchemaPrivilegeForManage> map;

    static {
        map = new java.util.HashMap<>();
        for (SchemaPrivilegeForManage v : SchemaPrivilegeForManage.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    SchemaPrivilegeForManage(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SchemaPrivilegeForManage create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SchemaPrivilegeForManage: " + key);
    }
}
