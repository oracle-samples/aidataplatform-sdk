package com.oracle.aidataplatform.dp.model;


/**
 * Type of Object
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum ObjectType implements com.oracle.bmc.http.internal.BmcEnum {
    DataLake("DATA_LAKE"),
    Role("ROLE"),
    Catalog("CATALOG"),
    Schema("SCHEMA"),
    Table("TABLE"),
    Volume("VOLUME"),
    View("VIEW"),
    Workspace("WORKSPACE"),
    WorkspaceFile("WORKSPACE_FILE"),
    WorkspaceFolder("WORKSPACE_FOLDER"),
    Compute("COMPUTE"),
    Folder("FOLDER"),
    File("FILE"),
    AutoPopulate("AUTO_POPULATE"),
    VolumeFile("VOLUME_FILE"),
    VolumeFolder("VOLUME_FOLDER"),
    KnowledgeBase("KNOWLEDGE_BASE"),
    KnowledgeBaseJob("KNOWLEDGE_BASE_JOB"),
    KnowledgeBaseJobRun("KNOWLEDGE_BASE_JOB_RUN"),
    KnowledgeBaseOwnership("KNOWLEDGE_BASE_OWNERSHIP"),
    VectorStoreCredentials("VECTOR_STORE_CREDENTIALS"),
    AuditLog("AUDIT_LOG"),
    Workflow("WORKFLOW"),
    Credential("CREDENTIAL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ObjectType.class);

    private final String value;
    private static java.util.Map<String, ObjectType> map;

    static {
        map = new java.util.HashMap<>();
        for (ObjectType v : ObjectType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ObjectType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ObjectType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'ObjectType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
