// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * ATP external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AtpExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    AtpWalletContentBase64("ATP_WALLET_CONTENT_BASE64"),
    AtpWalletPassword("ATP_WALLET_PASSWORD"),
    AtpUsername("ATP_USERNAME"),
    AtpPassword("ATP_PASSWORD"),
    AtpTnsAlias("ATP_TNS_ALIAS"),
    AtpStagingTenancyOcid("ATP_STAGING_TENANCY_OCID"),
    AtpStagingRegion("ATP_STAGING_REGION"),
    AtpStagingNamespace("ATP_STAGING_NAMESPACE"),
    AtpStagingBucket("ATP_STAGING_BUCKET"),
    AtpStagingFilePrefix("ATP_STAGING_FILE_PREFIX"),
    ;

    

    private final String value;
    private static java.util.Map<String, AtpExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (AtpExternalCatalogConnectionPropertyKey v : AtpExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AtpExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AtpExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AtpExternalCatalogConnectionPropertyKey: " + key);
    }
}
