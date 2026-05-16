// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The privilege for a Knowledge Base which could be an inherited privilege coming from object up in hierarchy.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AllKnowledgeBasePrivilege {
    Write("WRITE"),
    Admin("ADMIN"),
    Select("SELECT"),
    Manage("MANAGE"),
    ;

    

    private final String value;
    private static java.util.Map<String, AllKnowledgeBasePrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (AllKnowledgeBasePrivilege v : AllKnowledgeBasePrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AllKnowledgeBasePrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AllKnowledgeBasePrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AllKnowledgeBasePrivilege: " + key);
    }
}
