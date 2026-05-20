// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Type of KB Job Goal supported
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseJobGoalType implements com.oracle.bmc.http.internal.BmcEnum {
    AddRefreshSource("ADD_REFRESH_SOURCE"),
    DeleteSource("DELETE_SOURCE"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseJobGoalType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseJobGoalType v : KnowledgeBaseJobGoalType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseJobGoalType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseJobGoalType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseJobGoalType: " + key);
    }
}
