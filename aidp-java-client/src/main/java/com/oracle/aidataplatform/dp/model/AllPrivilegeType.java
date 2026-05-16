// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * List of all privileges in the AI Data Platform Workbench.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum AllPrivilegeType implements com.oracle.bmc.http.internal.BmcEnum {
    User("USER"),
    Administrator("ADMINISTRATOR"),
    Read("READ"),
    Use("USE"),
    Manage("MANAGE"),
    Admin("ADMIN"),
    CreateCatalog("CREATE_CATALOG"),
    Select("SELECT"),
    Insert("INSERT"),
    Update("UPDATE"),
    Delete("DELETE"),
    Alter("ALTER"),
    CreateSchema("CREATE_SCHEMA"),
    Write("WRITE"),
    CreateView("CREATE_VIEW"),
    CreateVolume("CREATE_VOLUME"),
    CreateTable("CREATE_TABLE"),
    CreateKnowledgeBase("CREATE_KNOWLEDGE_BASE"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(AllPrivilegeType.class);

    private final String value;
    private static java.util.Map<String, AllPrivilegeType> map;

    static {
        map = new java.util.HashMap<>();
        for (AllPrivilegeType v : AllPrivilegeType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    AllPrivilegeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static AllPrivilegeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'AllPrivilegeType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
