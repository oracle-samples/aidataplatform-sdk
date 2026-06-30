// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Type of an Agent Deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
    Test("TEST"),
    Prod("PROD"),
    Code("CODE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeploymentType.class);

    private final String value;
    private static java.util.Map<String, DeploymentType> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentType v : DeploymentType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DeploymentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DeploymentType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'DeploymentType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
