// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * DB2 external catalog connection property keys.
**/
export enum Db2ExternalCatalogConnectionPropertyKey {
    UserName = "user.name",
    Password = "password",
    Host = "host",
    Port = "port",
    DatabaseName = "database.name",
    SslEnabled = "ssl.enabled"
    
}

export namespace Db2ExternalCatalogConnectionPropertyKey {
    export function getJsonObj(obj: Db2ExternalCatalogConnectionPropertyKey): Db2ExternalCatalogConnectionPropertyKey {
        return obj;
    }
    export function getDeserializedJsonObj(obj: Db2ExternalCatalogConnectionPropertyKey): Db2ExternalCatalogConnectionPropertyKey {
        return obj;
    }
}

