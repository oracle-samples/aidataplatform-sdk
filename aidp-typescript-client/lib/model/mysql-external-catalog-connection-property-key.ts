// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * MySQL external catalog connection property keys.
**/
export enum MysqlExternalCatalogConnectionPropertyKey {
    MysqlUsername = "MYSQL_USERNAME",
    MysqlPassword = "MYSQL_PASSWORD",
    MysqlHost = "MYSQL_HOST",
    MysqlPort = "MYSQL_PORT",
    MysqlDatabaseName = "MYSQL_DATABASE_NAME",
    MysqlSslEnabled = "MYSQL_SSL_ENABLED"
    
}

export namespace MysqlExternalCatalogConnectionPropertyKey {
    export function getJsonObj(obj: MysqlExternalCatalogConnectionPropertyKey): MysqlExternalCatalogConnectionPropertyKey {
        return obj;
    }
    export function getDeserializedJsonObj(obj: MysqlExternalCatalogConnectionPropertyKey): MysqlExternalCatalogConnectionPropertyKey {
        return obj;
    }
}

