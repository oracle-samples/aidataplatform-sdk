// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Snowflake external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SnowflakeExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    SnowflakeHost("SNOWFLAKE_HOST"),
    SnowflakePort("SNOWFLAKE_PORT"),
    SnowflakeUsername("SNOWFLAKE_USERNAME"),
    SnowflakePassword("SNOWFLAKE_PASSWORD"),
    SnowflakeDatabaseName("SNOWFLAKE_DATABASE_NAME"),
    SnowflakeWarehouse("SNOWFLAKE_WAREHOUSE"),
    SnowflakeRole("SNOWFLAKE_ROLE"),
    SnowflakeAuthenticationMethod("SNOWFLAKE_AUTHENTICATION_METHOD"),
    SnowflakePrivateKeyFile("SNOWFLAKE_PRIVATE_KEY_FILE"),
    SnowflakePrivateKeyContent("SNOWFLAKE_PRIVATE_KEY_CONTENT"),
    SnowflakePrivateKeyPassphrase("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"),
    ;

    

    private final String value;
    private static java.util.Map<String, SnowflakeExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (SnowflakeExternalCatalogConnectionPropertyKey v : SnowflakeExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    SnowflakeExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SnowflakeExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SnowflakeExternalCatalogConnectionPropertyKey: " + key);
    }
}
