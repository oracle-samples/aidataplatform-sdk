// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Graph-ingestion state for an imported lineage run event.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum LineageImportRunEventIngestionLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Pending("PENDING"),
    Succeeded("SUCCEEDED"),
    Failed("FAILED"),
    ;

    

    private final String value;
    private static java.util.Map<String, LineageImportRunEventIngestionLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (LineageImportRunEventIngestionLifecycleState v : LineageImportRunEventIngestionLifecycleState.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    LineageImportRunEventIngestionLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static LineageImportRunEventIngestionLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid LineageImportRunEventIngestionLifecycleState: " + key);
    }
}
