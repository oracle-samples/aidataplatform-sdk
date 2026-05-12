package com.oracle.aidataplatform.dp.model;


/**
 * Status of the run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ExperimentRunStatus implements com.oracle.bmc.http.internal.BmcEnum {
    Running("RUNNING"),
    Scheduled("SCHEDULED"),
    Finished("FINISHED"),
    Failed("FAILED"),
    Killed("KILLED"),
    InternalError("INTERNAL_ERROR"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ExperimentRunStatus.class);

    private final String value;
    private static java.util.Map<String, ExperimentRunStatus> map;

    static {
        map = new java.util.HashMap<>();
        for (ExperimentRunStatus v : ExperimentRunStatus.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ExperimentRunStatus(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ExperimentRunStatus create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ExperimentRunStatus', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
