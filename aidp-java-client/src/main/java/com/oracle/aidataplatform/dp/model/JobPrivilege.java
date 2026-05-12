package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a job.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum JobPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Use("USE"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(JobPrivilege.class);

    private final String value;
    private static java.util.Map<String, JobPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (JobPrivilege v : JobPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    JobPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static JobPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'JobPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
