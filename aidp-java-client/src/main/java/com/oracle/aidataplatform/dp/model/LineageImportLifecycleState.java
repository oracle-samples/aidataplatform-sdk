// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Processing state of a lineage import.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum LineageImportLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Accepted("ACCEPTED"),
    InProgress("IN_PROGRESS"),
    Succeeded("SUCCEEDED"),
    CompletedWithError("COMPLETED_WITH_ERROR"),
    Failed("FAILED"),
    Deleting("DELETING"),
    ;

    

    private final String value;
    private static java.util.Map<String, LineageImportLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (LineageImportLifecycleState v : LineageImportLifecycleState.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    LineageImportLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LineageImportLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid LineageImportLifecycleState: " + key);
    }
}
