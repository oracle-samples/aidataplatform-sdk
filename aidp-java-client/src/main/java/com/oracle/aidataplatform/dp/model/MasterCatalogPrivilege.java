// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The privilege for a Master Catalog. MASTER CATALOG ADMIN: This permission will allow the user to: - Grant/Revoke permissions - View all catalogs in the Master Catalog - Create Catalogs - DELETE Catalog CREATE CATALOG: This permission will enable users to add create a catalog (internal or external)
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum MasterCatalogPrivilege implements com.oracle.bmc.http.internal.BmcEnum {
    CreateCatalog("CREATE_CATALOG"),
    Admin("ADMIN"),
    CreateShare("CREATE_SHARE"),
    CreateRecipient("CREATE_RECIPIENT"),
    CreateCredential("CREATE_CREDENTIAL"),
    ;

    

    private final String value;
    private static java.util.Map<String, MasterCatalogPrivilege> map;

    static {
        map = new java.util.HashMap<>();
        for (MasterCatalogPrivilege v : MasterCatalogPrivilege.values()) {
                map.put(v.getValue(), v);
            
        }
    }

    MasterCatalogPrivilege(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MasterCatalogPrivilege create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MasterCatalogPrivilege: " + key);
    }
}
