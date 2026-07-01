// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * MySQL external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum MysqlExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    MysqlUsername("MYSQL_USERNAME"),
    MysqlPassword("MYSQL_PASSWORD"),
    MysqlHost("MYSQL_HOST"),
    MysqlPort("MYSQL_PORT"),
    MysqlDatabaseName("MYSQL_DATABASE_NAME"),
    MysqlSslEnabled("MYSQL_SSL_ENABLED"),
    ;

    

    private final String value;
    private static java.util.Map<String, MysqlExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (MysqlExternalCatalogConnectionPropertyKey v : MysqlExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    MysqlExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MysqlExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MysqlExternalCatalogConnectionPropertyKey: " + key);
    }
}
