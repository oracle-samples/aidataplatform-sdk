package com.oracle.aidataplatform.dp.model;

/**
 * Update action type supported on sources in KnowledgeBase
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseSourceUpdateOperationType {
    AddSource("ADD_SOURCE"),
    DeleteSource("DELETE_SOURCE"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseSourceUpdateOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseSourceUpdateOperationType v : KnowledgeBaseSourceUpdateOperationType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseSourceUpdateOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseSourceUpdateOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseSourceUpdateOperationType: " + key);
    }
}
