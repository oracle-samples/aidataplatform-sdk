package com.oracle.aidataplatform.dp.model;


/**
 * Status of the Run.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DeploymentJobRunState implements com.oracle.bmc.http.internal.BmcEnum {
    DeploymentJobRunStateUnspecified("DEPLOYMENT_JOB_RUN_STATE_UNSPECIFIED"),
    NoValidDeploymentJobFound("NO_VALID_DEPLOYMENT_JOB_FOUND"),
    Running("RUNNING"),
    Succeeded("SUCCEEDED"),
    Failed("FAILED"),
    Pending("PENDING"),
    Approval("APPROVAL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeploymentJobRunState.class);

    private final String value;
    private static java.util.Map<String, DeploymentJobRunState> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentJobRunState v : DeploymentJobRunState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DeploymentJobRunState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentJobRunState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'DeploymentJobRunState', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
