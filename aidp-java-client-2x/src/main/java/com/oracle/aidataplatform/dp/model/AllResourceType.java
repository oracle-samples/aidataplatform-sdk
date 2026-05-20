// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;

/**
 * List of sub-resources that are RBAC managed by AI Data Platform Workbench.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AllResourceType {
    Workspace("WORKSPACE"),
    Workflow("WORKFLOW"),
    Folder("FOLDER"),
    File("FILE"),
    Cluster("CLUSTER"),
    MasterCatalog("MASTER_CATALOG"),
    Catalog("CATALOG"),
    Schema("SCHEMA"),
    Table("TABLE"),
    Share("SHARE"),
    Recipient("RECIPIENT"),
    Volume("VOLUME"),
    View("VIEW"),
    KnowledgeBase("KNOWLEDGE_BASE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(AllResourceType.class);

    private final String value;
    private static java.util.Map<String, AllResourceType> map;

    static {
        map = new java.util.HashMap<>();
        for (AllResourceType v : AllResourceType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AllResourceType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AllResourceType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'AllResourceType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
