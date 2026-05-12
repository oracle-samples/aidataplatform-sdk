package com.oracle.aidataplatform.dp.model;


/**
 * Type of KnowledgeBase Job Definition supported
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseJobType implements com.oracle.bmc.http.internal.BmcEnum {
    Scheduled("SCHEDULED"),
    OnDemand("ON_DEMAND"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseJobType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseJobType v : KnowledgeBaseJobType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseJobType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseJobType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseJobType: " + key);
    }
}
