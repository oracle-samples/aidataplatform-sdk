// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Type of Sources supported where Embedding is generated
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseEmbeddingModelSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    Adw23Ai("ADW_23_AI"),
    Adw26Ai("ADW_26_AI"),
    GenAi("GEN_AI"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseEmbeddingModelSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseEmbeddingModelSourceType v : KnowledgeBaseEmbeddingModelSourceType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseEmbeddingModelSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseEmbeddingModelSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseEmbeddingModelSourceType: " + key);
    }
}
