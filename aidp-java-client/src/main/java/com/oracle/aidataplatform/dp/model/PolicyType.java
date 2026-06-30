// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Type of safety guardrail policy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum PolicyType implements com.oracle.bmc.http.internal.BmcEnum {
    ContentModeration("CONTENT_MODERATION"),
    PromptAttacksPrevention("PROMPT_ATTACKS_PREVENTION"),
    PiiDetection("PII_DETECTION"),
    DeniedTopics("DENIED_TOPICS"),
    WordFilters("WORD_FILTERS"),
    ContextualGrounding("CONTEXTUAL_GROUNDING"),
    CustomPolicy("CUSTOM_POLICY"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(PolicyType.class);

    private final String value;
    private static java.util.Map<String, PolicyType> map;

    static {
        map = new java.util.HashMap<>();
        for (PolicyType v : PolicyType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
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
        LOG.warn("Received unknown value '{}' for enum 'PolicyType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
