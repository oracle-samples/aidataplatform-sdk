package com.oracle.aidataplatform.dp.model;

/**
 * Type of KnowledgeBase Sources
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseSourceType {
    Volume("VOLUME"),
    Table("TABLE"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseSourceType v : KnowledgeBaseSourceType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseSourceType: " + key);
    }
}
