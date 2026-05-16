// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Auth type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AuthType implements com.oracle.bmc.http.internal.BmcEnum {
    NoAuth("NO_AUTH"),
    BearerToken("BEARER_TOKEN"),
    Oauth("OAUTH"),
    OciResourcePrincipal("OCI_RESOURCE_PRINCIPAL"),
    ;

    

    private final String value;
    private static java.util.Map<String, AuthType> map;

    static {
        map = new java.util.HashMap<>();
        for (AuthType v : AuthType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AuthType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AuthType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AuthType: " + key);
    }
}
