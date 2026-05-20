// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * The resource type of an async operation.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AsyncOperationResourceType {
    Unknown("UNKNOWN"),
    Catalog("CATALOG"),
    Schema("SCHEMA"),
    Table("TABLE"),
    View("VIEW"),
    Volume("VOLUME"),
    VolumeFile("VOLUME_FILE"),
    Workspace("WORKSPACE"),
    WorkspaceObject("WORKSPACE_OBJECT"),
    Cluster("CLUSTER"),
    AiCompute("AI_COMPUTE"),
    KnowledgeBase("KNOWLEDGE_BASE"),
    KnowledgeBaseJob("KNOWLEDGE_BASE_JOB"),
    KnowledgeBaseJobRun("KNOWLEDGE_BASE_JOB_RUN"),
    AgentFlow("AGENT_FLOW"),
    GitOperation("GIT_OPERATION"),
    BundleOperation("BUNDLE_OPERATION"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(AsyncOperationResourceType.class);

    private final String value;
    private static java.util.Map<String, AsyncOperationResourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (AsyncOperationResourceType v : AsyncOperationResourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AsyncOperationResourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AsyncOperationResourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'AsyncOperationResourceType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
