package com.oracle.aidataplatform.dp.model;


/**
 * Catalog property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum CatalogPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    BucketLocationCompartmentId("BUCKET_LOCATION_COMPARTMENT_ID"),
    ;

    

    private final String value;
    private static java.util.Map<String, CatalogPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (CatalogPropertyKey v : CatalogPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    CatalogPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CatalogPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CatalogPropertyKey: " + key);
    }
}
