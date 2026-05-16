// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The table data format type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DataFormat implements com.oracle.bmc.http.internal.BmcEnum {
    Avro("AVRO"),
    Orc("ORC"),
    Parquet("PARQUET"),
    Textfile("TEXTFILE"),
    Json("JSON"),
    Csv("CSV"),
    Delta("DELTA"),
    Iceberg("ICEBERG"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DataFormat.class);

    private final String value;
    private static java.util.Map<String, DataFormat> map;

    static {
        map = new java.util.HashMap<>();
        for (DataFormat v : DataFormat.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DataFormat(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataFormat create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'DataFormat', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
