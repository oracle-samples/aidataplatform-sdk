package com.oracle.aidataplatform.dp.model;

/**
 * ADW external catalog connection property keys.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AdwExternalCatalogConnectionPropertyKey {
    AdwWalletContentBase64("ADW_WALLET_CONTENT_BASE64"),
    AdwWalletPassword("ADW_WALLET_PASSWORD"),
    AdwUsername("ADW_USERNAME"),
    AdwPassword("ADW_PASSWORD"),
    AdwTnsAlias("ADW_TNS_ALIAS"),
    AdwStagingTenancyOcid("ADW_STAGING_TENANCY_OCID"),
    AdwStagingRegion("ADW_STAGING_REGION"),
    AdwStagingNamespace("ADW_STAGING_NAMESPACE"),
    AdwStagingBucket("ADW_STAGING_BUCKET"),
    AdwStagingFilePrefix("ADW_STAGING_FILE_PREFIX"),
    ;

    

    private final String value;
    private static java.util.Map<String, AdwExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (AdwExternalCatalogConnectionPropertyKey v : AdwExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AdwExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AdwExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AdwExternalCatalogConnectionPropertyKey: " + key);
    }
}
