// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The source type of an external catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ExternalCatalogSourceType implements com.oracle.bmc.http.internal.BmcEnum {
    Adw("ADW"),
    Alh("ALH"),
    Kafka("KAFKA"),
    Atp("ATP"),
    Oracle("ORACLE"),
    Exadata("EXADATA"),
    Mysql("MYSQL"),
    AzureSqlserver("AZURE_SQLSERVER"),
    Snowflake("SNOWFLAKE"),
    GoogleBigquery("GOOGLE_BIGQUERY"),
    OracleAnalytics("ORACLE_ANALYTICS"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ExternalCatalogSourceType.class);

    private final String value;
    private static java.util.Map<String, ExternalCatalogSourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (ExternalCatalogSourceType v : ExternalCatalogSourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExternalCatalogSourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExternalCatalogSourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ExternalCatalogSourceType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
