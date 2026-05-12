package com.oracle.aidataplatform.dp.model;


/**
 * Metadata update action.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum UpdateFileMetadataActionType implements com.oracle.bmc.http.internal.BmcEnum {
    Update("UPDATE"),
    Append("APPEND"),
    Replace("REPLACE"),
    Reset("RESET"),
    ;

    

    private final String value;
    private static java.util.Map<String, UpdateFileMetadataActionType> map;

    static {
        map = new java.util.HashMap<>();
        for (UpdateFileMetadataActionType v : UpdateFileMetadataActionType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    UpdateFileMetadataActionType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static UpdateFileMetadataActionType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid UpdateFileMetadataActionType: " + key);
    }
}
