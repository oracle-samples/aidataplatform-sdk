// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Where a DFL connection's coordinates and credentials come from.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum OntologyDflConnectionSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    CatalogConnection("CATALOG_CONNECTION"),
    CredStore("CRED_STORE"),
    Inline("INLINE"),
    ;

    

    private final String value;
    private static java.util.Map<String, OntologyDflConnectionSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (OntologyDflConnectionSourceType v : OntologyDflConnectionSourceType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    OntologyDflConnectionSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OntologyDflConnectionSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OntologyDflConnectionSourceType: " + key);
    }
}
