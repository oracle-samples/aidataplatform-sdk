package com.oracle.aidataplatform.dp.model;


/**
 * Lifecycle state values exposed via the public credential API.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum CredentialLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
    Active("ACTIVE"),
    Creating("CREATING"),
    Updating("UPDATING"),
    Deleting("DELETING"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CredentialLifecycleState.class);

    private final String value;
    private static java.util.Map<String, CredentialLifecycleState> map;

    static {
        map = new java.util.HashMap<>();
        for (CredentialLifecycleState v : CredentialLifecycleState.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CredentialLifecycleState(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CredentialLifecycleState create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'CredentialLifecycleState', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
