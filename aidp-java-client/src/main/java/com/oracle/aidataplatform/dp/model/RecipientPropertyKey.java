package com.oracle.aidataplatform.dp.model;


/**
 * Recipient property keys.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum RecipientPropertyKey implements com.oracle.bmc.http.internal.BmcEnum {
    ActivationLinkEmail("ACTIVATION_LINK_EMAIL"),
    DeltaShareEndpoint("DELTA_SHARE_ENDPOINT"),
    ActivationLink("ACTIVATION_LINK"),
    ActivationTokenKey("ACTIVATION_TOKEN_KEY"),
    ActivationTokenExpiryTime("ACTIVATION_TOKEN_EXPIRY_TIME"),
    BearerTokenKey("BEARER_TOKEN_KEY"),
    BearerTokenExpiryTime("BEARER_TOKEN_EXPIRY_TIME"),
    ;

    

    private final String value;
    private static java.util.Map<String, RecipientPropertyKey> map;

    static {
        map = new java.util.HashMap<>();
        for (RecipientPropertyKey v : RecipientPropertyKey.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    RecipientPropertyKey(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RecipientPropertyKey create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid RecipientPropertyKey: " + key);
    }
}
