// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a Volume
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBasePrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBasePrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBasePrivilege v : KnowledgeBasePrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBasePrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBasePrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBasePrivilege: " + key);
    }
}
