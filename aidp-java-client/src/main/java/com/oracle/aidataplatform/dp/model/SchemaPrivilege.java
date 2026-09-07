// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a schema. This privilege could be inherited from the object higher up in hierarchy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum SchemaPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    Select("SELECT"),
    Manage("MANAGE"),
    Write("WRITE"),
    CreateView("CREATE_VIEW"),
    CreateVolume("CREATE_VOLUME"),
    CreateTable("CREATE_TABLE"),
    CreateKnowledgeBase("CREATE_KNOWLEDGE_BASE"),
    CreateModel("CREATE_MODEL"),
    Admin("ADMIN"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SchemaPrivilege.class);

    private final String value;
    private static java.util.Map<String, SchemaPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (SchemaPrivilege v : SchemaPrivilege.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SchemaPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SchemaPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'SchemaPrivilege', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
