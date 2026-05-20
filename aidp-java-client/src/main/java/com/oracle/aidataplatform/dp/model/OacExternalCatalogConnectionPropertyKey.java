// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Oracle Analytics external catalog connection property keys
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum OacExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    OacEndpointUrl("OAC_ENDPOINT_URL"),
    OacIdcsEndpointUrl("OAC_IDCS_ENDPOINT_URL"),
    OacIdcsClientId("OAC_IDCS_CLIENT_ID"),
    OacIdcsClientScope("OAC_IDCS_CLIENT_SCOPE"),
    OacIdcsCertificate("OAC_IDCS_CERTIFICATE"),
    OacIdcsPrivateKey("OAC_IDCS_PRIVATE_KEY"),
    ;

    

    private final String value;
    private static java.util.Map<String, OacExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (OacExternalCatalogConnectionPropertyKey v : OacExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    OacExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OacExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OacExternalCatalogConnectionPropertyKey: " + key);
    }
}
