// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * File type values accepted by the session file read/write configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum FileAllowedFileType implements com.oracle.bmc.http.internal.BmcEnum {
    Pdf("pdf"),
    Txt("txt"),
    Csv("csv"),
    Json("json"),
    Ndjson("ndjson"),
    Png("png"),
    Jpg("jpg"),
    Jpeg("jpeg"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(FileAllowedFileType.class);

    private final String value;
    private static java.util.Map<String, FileAllowedFileType> map;

    static {
        map = new java.util.HashMap<>();
        for (FileAllowedFileType v : FileAllowedFileType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    FileAllowedFileType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static FileAllowedFileType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'FileAllowedFileType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
