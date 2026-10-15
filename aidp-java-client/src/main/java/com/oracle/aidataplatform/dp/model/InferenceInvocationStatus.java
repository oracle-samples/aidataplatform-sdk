// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Status derived from the correlated inference response event. UNKNOWN is reported when the response event carries no status code, which some model runtime versions omit; the invocation is still returned rather than discarded.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum InferenceInvocationStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Success("SUCCESS"),
    Malformed("MALFORMED"),
    Failed("FAILED"),
    Unknown("UNKNOWN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(InferenceInvocationStatus.class);

    private final String value;
    private static java.util.Map<String, InferenceInvocationStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (InferenceInvocationStatus v : InferenceInvocationStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    InferenceInvocationStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static InferenceInvocationStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'InferenceInvocationStatus', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
