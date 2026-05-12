package com.oracle.aidataplatform.dp.model;

/**
 * Possible types of data types
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum DataTypeEnum {
    String("STRING"),
    Date("DATE"),
    Integer("INTEGER"),
    ;

    

    private final String value;
    private static java.util.Map<String, DataTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (DataTypeEnum v : DataTypeEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    DataTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DataTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid DataTypeEnum: " + key);
    }
}
