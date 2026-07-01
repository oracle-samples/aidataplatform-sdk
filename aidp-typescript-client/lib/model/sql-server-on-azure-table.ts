// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table of an Azure SQL Database catalog.
*/
export interface SqlServerOnAzureTable extends model.Table {

   "entityType": string;
}

export namespace SqlServerOnAzureTable {

    export function getJsonObj(obj: SqlServerOnAzureTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getJsonObj(obj) as SqlServerOnAzureTable, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'AZURE_SQLSERVER';
    export function getDeserializedJsonObj(obj: SqlServerOnAzureTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getDeserializedJsonObj(obj) as SqlServerOnAzureTable, ...{
            
         }};

        
        
        return jsonObj;
    }
}
