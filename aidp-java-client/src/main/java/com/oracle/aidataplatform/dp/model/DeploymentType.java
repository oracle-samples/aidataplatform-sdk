package com.oracle.aidataplatform.dp.model;


/**
 * Type of an Agent Flow Deployment.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
    Test("TEST"),
    Prod("PROD"),
    Code("CODE"),
    ;

    

    private final String value;
    private static java.util.Map<String, DeploymentType> map;

    static {
        map = new java.util.HashMap<>();
        for (DeploymentType v : DeploymentType.values()) {
                map.put(v.getValue(), v);
            
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
        throw new IllegalArgumentException("Invalid DeploymentType: " + key);
    }
}
