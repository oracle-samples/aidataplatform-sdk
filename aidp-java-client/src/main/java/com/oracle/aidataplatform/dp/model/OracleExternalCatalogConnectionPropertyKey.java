package com.oracle.aidataplatform.dp.model;


/**
 * Oracle Database external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum OracleExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    OracleWalletContentBase64("ORACLE_WALLET_CONTENT_BASE64"),
    OracleWalletPassword("ORACLE_WALLET_PASSWORD"),
    OracleUsername("ORACLE_USERNAME"),
    OraclePassword("ORACLE_PASSWORD"),
    OracleHost("ORACLE_HOST"),
    OraclePort("ORACLE_PORT"),
    OracleDatabaseName("ORACLE_DATABASE_NAME"),
    OracleDatabaseSid("ORACLE_DATABASE_SID"),
    OracleSslEnabled("ORACLE_SSL_ENABLED"),
    OracleStagingTenancyOcid("ORACLE_STAGING_TENANCY_OCID"),
    OracleStagingRegion("ORACLE_STAGING_REGION"),
    OracleStagingNamespace("ORACLE_STAGING_NAMESPACE"),
    OracleStagingBucket("ORACLE_STAGING_BUCKET"),
    OracleStagingFilePrefix("ORACLE_STAGING_FILE_PREFIX"),
    ;

    

    private final String value;
    private static java.util.Map<String, OracleExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (OracleExternalCatalogConnectionPropertyKey v : OracleExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    OracleExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OracleExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid OracleExternalCatalogConnectionPropertyKey: " + key);
    }
}
