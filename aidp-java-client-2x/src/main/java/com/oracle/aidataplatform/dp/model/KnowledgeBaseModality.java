package com.oracle.aidataplatform.dp.model;

/**
 * Type of modalities supported in KnowledgeBase
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseModality {
    Text("TEXT"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseModality> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseModality v : KnowledgeBaseModality.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseModality(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseModality create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseModality: " + key);
    }
}
