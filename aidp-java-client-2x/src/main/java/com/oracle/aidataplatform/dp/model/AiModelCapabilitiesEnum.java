// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Possible capabilities of AiModels object
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AiModelCapabilitiesEnum {
    FineTune("FINE_TUNE"),
    Chat("CHAT"),
    TextEmbeddings("TEXT_EMBEDDINGS"),
    ;

    

    private final String value;
    private static java.util.Map<String, AiModelCapabilitiesEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (AiModelCapabilitiesEnum v : AiModelCapabilitiesEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AiModelCapabilitiesEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AiModelCapabilitiesEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AiModelCapabilitiesEnum: " + key);
    }
}
