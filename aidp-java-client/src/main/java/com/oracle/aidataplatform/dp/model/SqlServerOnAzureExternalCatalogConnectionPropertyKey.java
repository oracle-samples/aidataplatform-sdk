// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Azure SQL Database external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SqlServerOnAzureExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    AzureSqlserverUsername("AZURE_SQLSERVER_USERNAME"),
    AzureSqlserverPassword("AZURE_SQLSERVER_PASSWORD"),
    AzureSqlserverHost("AZURE_SQLSERVER_HOST"),
    AzureSqlserverPort("AZURE_SQLSERVER_PORT"),
    AzureSqlserverDatabaseName("AZURE_SQLSERVER_DATABASE_NAME"),
    AzureSqlserverSslEnabled("AZURE_SQLSERVER_SSL_ENABLED"),
    ;

    

    private final String value;
    private static java.util.Map<String, SqlServerOnAzureExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (SqlServerOnAzureExternalCatalogConnectionPropertyKey v : SqlServerOnAzureExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    SqlServerOnAzureExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SqlServerOnAzureExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SqlServerOnAzureExternalCatalogConnectionPropertyKey: " + key);
    }
}
