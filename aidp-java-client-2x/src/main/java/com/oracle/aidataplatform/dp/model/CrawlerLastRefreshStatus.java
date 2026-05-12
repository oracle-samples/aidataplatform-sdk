package com.oracle.aidataplatform.dp.model;

/**
 * The status for an entity refresh.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum CrawlerLastRefreshStatus {
    Failed("FAILED"),
    Success("SUCCESS"),
    InProgress("IN_PROGRESS"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CrawlerLastRefreshStatus.class);

    private final String value;
    private static java.util.Map<String, CrawlerLastRefreshStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (CrawlerLastRefreshStatus v : CrawlerLastRefreshStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CrawlerLastRefreshStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CrawlerLastRefreshStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'CrawlerLastRefreshStatus', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
