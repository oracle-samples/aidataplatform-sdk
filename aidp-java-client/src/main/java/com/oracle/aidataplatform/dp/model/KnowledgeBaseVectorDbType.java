// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Type of Vector Store supported where Embedding is stored
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseVectorDbType implements com.oracle.bmc.http.internal.BmcEnum {
    Adw23Ai("ADW_23_AI"),
    Adw26Ai("ADW_26_AI"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseVectorDbType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseVectorDbType v : KnowledgeBaseVectorDbType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseVectorDbType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseVectorDbType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseVectorDbType: " + key);
    }
}
