// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema summary of an Azure SQL Database external catalog.
*/
export interface SqlServerOnAzureSchemaSummary extends model.SchemaSummary {

   "entityType": string;
}

export namespace SqlServerOnAzureSchemaSummary {

    export function getJsonObj(obj: SqlServerOnAzureSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getJsonObj(obj) as SqlServerOnAzureSchemaSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'AZURE_SQLSERVER';
    export function getDeserializedJsonObj(obj: SqlServerOnAzureSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getDeserializedJsonObj(obj) as SqlServerOnAzureSchemaSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
