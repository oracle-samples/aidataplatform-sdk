// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * ALH external catalog connection property keys.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AlhExternalCatalogConnectionPropertyKey {
    AlhWalletContentBase64("ALH_WALLET_CONTENT_BASE64"),
    AlhWalletPassword("ALH_WALLET_PASSWORD"),
    AlhUsername("ALH_USERNAME"),
    AlhPassword("ALH_PASSWORD"),
    AlhTnsAlias("ALH_TNS_ALIAS"),
    AlhStagingTenancyOcid("ALH_STAGING_TENANCY_OCID"),
    AlhStagingRegion("ALH_STAGING_REGION"),
    AlhStagingNamespace("ALH_STAGING_NAMESPACE"),
    AlhStagingBucket("ALH_STAGING_BUCKET"),
    AlhStagingFilePrefix("ALH_STAGING_FILE_PREFIX"),
    ;

    

    private final String value;
    private static java.util.Map<String, AlhExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (AlhExternalCatalogConnectionPropertyKey v : AlhExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AlhExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AlhExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AlhExternalCatalogConnectionPropertyKey: " + key);
    }
}
