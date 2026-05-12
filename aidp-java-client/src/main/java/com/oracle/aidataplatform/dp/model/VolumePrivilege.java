package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a volume
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum VolumePrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Read("READ"),
    Write("WRITE"),
    Admin("ADMIN"),
    ;

    

    private final String value;
    private static java.util.Map<String, VolumePrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (VolumePrivilege v : VolumePrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    VolumePrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static VolumePrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid VolumePrivilege: " + key);
    }
}
