package com.oracle.aidataplatform.dp.model;


/**
 * Update supported in KnowledgeBase/source
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum KnowledgeBaseUpdateOperationType implements com.oracle.bmc.http.internal.BmcEnum {
    MetadataUpdate("METADATA_UPDATE"),
    SourcesUpdate("SOURCES_UPDATE"),
    AddIndex("ADD_INDEX"),
    DropIndex("DROP_INDEX"),
    ;

    

    private final String value;
    private static java.util.Map<String, KnowledgeBaseUpdateOperationType> map;

    static {
        map = new java.util.HashMap<>();
        for (KnowledgeBaseUpdateOperationType v : KnowledgeBaseUpdateOperationType.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    KnowledgeBaseUpdateOperationType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static KnowledgeBaseUpdateOperationType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid KnowledgeBaseUpdateOperationType: " + key);
    }
}
