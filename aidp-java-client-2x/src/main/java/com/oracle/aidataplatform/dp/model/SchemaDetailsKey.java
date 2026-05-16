// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Schema details key. This can be referred to when the related catalog is an external (Non-ADW) catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SchemaDetailsKey {
    Partitions("PARTITIONS"),
    ReplicationFactor("REPLICATION_FACTOR"),
    BootstrapServers("BOOTSTRAP_SERVERS"),
    PartitionsDetails("PARTITIONS_DETAILS"),
    ;

    

    private final String value;
    private static java.util.Map<String, SchemaDetailsKey> map;

    static {
        map = new java.util.HashMap<>();
        for (SchemaDetailsKey v : SchemaDetailsKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    SchemaDetailsKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SchemaDetailsKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SchemaDetailsKey: " + key);
    }
}
