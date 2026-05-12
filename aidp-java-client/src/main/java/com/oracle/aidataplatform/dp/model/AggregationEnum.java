package com.oracle.aidataplatform.dp.model;


/**
 * Possible types of search object
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AggregationEnum implements com.oracle.bmc.http.internal.BmcEnum {
    Type("TYPE"),
    Owner("OWNER"),
    CreatedBy("CREATED_BY"),
    Catalog("CATALOG"),
    Schema("SCHEMA"),
    Workspace("WORKSPACE"),
    ;

    

    private final String value;
    private static java.util.Map<String, AggregationEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (AggregationEnum v : AggregationEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    AggregationEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AggregationEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid AggregationEnum: " + key);
    }
}
