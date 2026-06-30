// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Azure SQL Database external catalog connection property keys.
**/
export enum SqlServerOnAzureExternalCatalogConnectionPropertyKey {
    AzureSqlserverUsername = "AZURE_SQLSERVER_USERNAME",
    AzureSqlserverPassword = "AZURE_SQLSERVER_PASSWORD",
    AzureSqlserverHost = "AZURE_SQLSERVER_HOST",
    AzureSqlserverPort = "AZURE_SQLSERVER_PORT",
    AzureSqlserverDatabaseName = "AZURE_SQLSERVER_DATABASE_NAME",
    AzureSqlserverSslEnabled = "AZURE_SQLSERVER_SSL_ENABLED"
    
}

export namespace SqlServerOnAzureExternalCatalogConnectionPropertyKey {
    export function getJsonObj(obj: SqlServerOnAzureExternalCatalogConnectionPropertyKey): SqlServerOnAzureExternalCatalogConnectionPropertyKey {
        return obj;
    }
    export function getDeserializedJsonObj(obj: SqlServerOnAzureExternalCatalogConnectionPropertyKey): SqlServerOnAzureExternalCatalogConnectionPropertyKey {
        return obj;
    }
}

