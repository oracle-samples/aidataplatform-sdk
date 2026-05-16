// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The current lifecycle state of the credential object.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum CredentialV2LifeCycleState {
    Active("ACTIVE"),
    Creating("CREATING"),
    Updating("UPDATING"),
    Deleting("DELETING"),
    ;

    

    private final String value;
    private static java.util.Map<String, CredentialV2LifeCycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (CredentialV2LifeCycleState v : CredentialV2LifeCycleState.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    CredentialV2LifeCycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CredentialV2LifeCycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid CredentialV2LifeCycleState: " + key);
    }
}
