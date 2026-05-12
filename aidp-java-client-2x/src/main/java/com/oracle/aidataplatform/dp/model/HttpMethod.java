package com.oracle.aidataplatform.dp.model;

/**
 * HTTP method for the request
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum HttpMethod {
    Get("GET"),
    Post("POST"),
    Put("PUT"),
    Delete("DELETE"),
    Patch("PATCH"),
    ;

    

    private final String value;
    private static java.util.Map<String, HttpMethod> map;

    static {
        map = new java.util.HashMap<>();
        for (HttpMethod v : HttpMethod.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    HttpMethod(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static HttpMethod create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid HttpMethod: " + key);
    }
}
