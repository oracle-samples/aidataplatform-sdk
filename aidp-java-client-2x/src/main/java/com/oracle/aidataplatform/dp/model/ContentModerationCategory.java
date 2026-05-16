// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Content moderation categories
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ContentModerationCategory {
    HateSpeech("HATE_SPEECH"),
    Harassment("HARASSMENT"),
    Violence("VIOLENCE"),
    Sexual("SEXUAL"),
    Derogatory("DEROGATORY"),
    Toxic("TOXIC"),
    ;

    

    private final String value;
    private static java.util.Map<String, ContentModerationCategory> map;

    static {
        map = new java.util.HashMap<>();
        for (ContentModerationCategory v : ContentModerationCategory.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ContentModerationCategory(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ContentModerationCategory create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ContentModerationCategory: " + key);
    }
}
