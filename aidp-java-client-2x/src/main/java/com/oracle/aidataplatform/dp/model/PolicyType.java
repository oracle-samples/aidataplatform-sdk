package com.oracle.aidataplatform.dp.model;

/**
 * Type of safety guardrail policy
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PolicyType {
    ContentModeration("CONTENT_MODERATION"),
    PromptAttacksPrevention("PROMPT_ATTACKS_PREVENTION"),
    PiiDetection("PII_DETECTION"),
    DeniedTopics("DENIED_TOPICS"),
    WordFilters("WORD_FILTERS"),
    ContextualGrounding("CONTEXTUAL_GROUNDING"),
    CustomPolicy("CUSTOM_POLICY"),
    ;

    

    private final String value;
    private static java.util.Map<String, PolicyType> map;

    static {
        map = new java.util.HashMap<>();
        for (PolicyType v : PolicyType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    PolicyType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static PolicyType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid PolicyType: " + key);
    }
}
