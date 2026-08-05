// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Google BigQuery external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum GoogleBigqueryExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    GoogleBigqueryHost("GOOGLE_BIGQUERY_HOST"),
    GoogleBigqueryPort("GOOGLE_BIGQUERY_PORT"),
    GoogleBigqueryProjectId("GOOGLE_BIGQUERY_PROJECT_ID"),
    GoogleBigqueryOauthType("GOOGLE_BIGQUERY_OAUTH_TYPE"),
    GoogleBigqueryOauthServiceAcctEmail("GOOGLE_BIGQUERY_OAUTH_SERVICE_ACCT_EMAIL"),
    GoogleBigqueryOauthPvtKey("GOOGLE_BIGQUERY_OAUTH_PVT_KEY"),
    ;

    

    private final String value;
    private static java.util.Map<String, GoogleBigqueryExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (GoogleBigqueryExternalCatalogConnectionPropertyKey v : GoogleBigqueryExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    GoogleBigqueryExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GoogleBigqueryExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid GoogleBigqueryExternalCatalogConnectionPropertyKey: " + key);
    }
}
