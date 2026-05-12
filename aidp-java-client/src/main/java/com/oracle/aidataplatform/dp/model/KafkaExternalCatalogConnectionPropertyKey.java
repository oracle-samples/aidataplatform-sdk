package com.oracle.aidataplatform.dp.model;


/**
 * Kafka external catalog connection property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KafkaExternalCatalogConnectionPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    BootstrapServers("BOOTSTRAP_SERVERS"),
    Username("USERNAME"),
    Password("PASSWORD"),
    EnableSsl("ENABLE_SSL"),
    SaslMode("SASL_MODE"),
    ;

    

    private final String value;
    private static java.util.Map<String, KafkaExternalCatalogConnectionPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (KafkaExternalCatalogConnectionPropertyKey v : KafkaExternalCatalogConnectionPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KafkaExternalCatalogConnectionPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KafkaExternalCatalogConnectionPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KafkaExternalCatalogConnectionPropertyKey: " + key);
    }
}
