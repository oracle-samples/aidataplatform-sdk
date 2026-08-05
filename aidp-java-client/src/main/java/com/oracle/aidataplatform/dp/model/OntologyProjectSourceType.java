// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Ontology project content source type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum OntologyProjectSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    Volume("VOLUME"),
    Git("GIT"),
    ;

    

    private final String value;
    private static java.util.Map<String, OntologyProjectSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (OntologyProjectSourceType v : OntologyProjectSourceType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    OntologyProjectSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OntologyProjectSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OntologyProjectSourceType: " + key);
    }
}
