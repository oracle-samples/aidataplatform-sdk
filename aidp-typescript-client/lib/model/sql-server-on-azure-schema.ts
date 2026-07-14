// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema of an Azure SQL Database external catalog.
*/
export interface SqlServerOnAzureSchema extends model.Schema {

   "entityType": string;
}

export namespace SqlServerOnAzureSchema {

    export function getJsonObj(obj: SqlServerOnAzureSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getJsonObj(obj) as SqlServerOnAzureSchema, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'AZURE_SQLSERVER';
    export function getDeserializedJsonObj(obj: SqlServerOnAzureSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getDeserializedJsonObj(obj) as SqlServerOnAzureSchema, ...{
            
         }};

        
        
        return jsonObj;
    }
}
