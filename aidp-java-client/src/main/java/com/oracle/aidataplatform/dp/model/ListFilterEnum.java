// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Accepted values of list filters
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ListFilterEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Type("TYPE"),
    Owner("OWNER"),
    CreatedBy("CREATED_BY"),
    Catalog("CATALOG"),
    Schema("SCHEMA"),
    Workspace("WORKSPACE"),
    Job("JOB"),
    Cluster("CLUSTER"),
    ;

    

    private final String value;
    private static java.util.Map<String, ListFilterEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (ListFilterEnum v : ListFilterEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ListFilterEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ListFilterEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ListFilterEnum: " + key);
    }
}
