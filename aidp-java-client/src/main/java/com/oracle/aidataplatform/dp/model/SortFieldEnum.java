package com.oracle.aidataplatform.dp.model;


/**
 * Accepted values of sort field
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SortFieldEnum implements com.oracle.bmc.http.internal.BmcEnum {
    TimeUpdated("TIME_UPDATED"),
    TimeCreated("TIME_CREATED"),
    Relevancy("RELEVANCY"),
    Type("TYPE"),
    ;

    

    private final String value;
    private static java.util.Map<String, SortFieldEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (SortFieldEnum v : SortFieldEnum.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    SortFieldEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SortFieldEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid SortFieldEnum: " + key);
    }
}
