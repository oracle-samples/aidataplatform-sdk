// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * Status of the job.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DeploymentJobState {
    DeploymentJobConnectionStateUnspecified("DEPLOYMENT_JOB_CONNECTION_STATE_UNSPECIFIED"),
    NotSetUp("NOT_SET_UP"),
    Connected("CONNECTED"),
    NotFound("NOT_FOUND"),
    RequiredParametersChanged("REQUIRED_PARAMETERS_CHANGED"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeploymentJobState.class);

    private final String value;
    private static java.util.Map<String, DeploymentJobState> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentJobState v : DeploymentJobState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DeploymentJobState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentJobState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'DeploymentJobState', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
