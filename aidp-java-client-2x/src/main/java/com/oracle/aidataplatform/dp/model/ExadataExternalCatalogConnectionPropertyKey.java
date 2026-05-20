// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Exadata external catalog connection property keys.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ExadataExternalCatalogConnectionPropertyKey {
    ExadataWalletContentBase64("EXADATA_WALLET_CONTENT_BASE64"),
    ExadataWalletPassword("EXADATA_WALLET_PASSWORD"),
    ExadataUsername("EXADATA_USERNAME"),
    ExadataPassword("EXADATA_PASSWORD"),
    ExadataHost("EXADATA_HOST"),
    ExadataPort("EXADATA_PORT"),
    ExadataDatabaseName("EXADATA_DATABASE_NAME"),
    ExadataDatabaseSid("EXADATA_DATABASE_SID"),
    ExadataSslEnabled("EXADATA_SSL_ENABLED"),
    ExadataStagingTenancyOcid("EXADATA_STAGING_TENANCY_OCID"),
    ExadataStagingRegion("EXADATA_STAGING_REGION"),
    ExadataStagingNamespace("EXADATA_STAGING_NAMESPACE"),
    ExadataStagingBucket("EXADATA_STAGING_BUCKET"),
    ExadataStagingFilePrefix("EXADATA_STAGING_FILE_PREFIX"),
    WorkspaceKey("WORKSPACE_KEY"),
    ;

    

    private final String value;
    private static java.util.Map<String, ExadataExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (ExadataExternalCatalogConnectionPropertyKey v : ExadataExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    ExadataExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExadataExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid ExadataExternalCatalogConnectionPropertyKey: " + key);
    }
}
