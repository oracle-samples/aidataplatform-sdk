// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * DB2 external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum Db2ExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    UserName("user.name"),
    Password("password"),
    Host("host"),
    Port("port"),
    DatabaseName("database.name"),
    SslEnabled("ssl.enabled"),
    ;

    

    private final String value;
    private static java.util.Map<String, Db2ExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (Db2ExternalCatalogConnectionPropertyKey v : Db2ExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    Db2ExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static Db2ExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid Db2ExternalCatalogConnectionPropertyKey: " + key);
    }
}
