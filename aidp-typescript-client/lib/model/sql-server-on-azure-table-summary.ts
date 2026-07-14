// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table summary of an Azure SQL Database catalog.
*/
export interface SqlServerOnAzureTableSummary extends model.TableSummary {

   "entityType": string;
}

export namespace SqlServerOnAzureTableSummary {

    export function getJsonObj(obj: SqlServerOnAzureTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getJsonObj(obj) as SqlServerOnAzureTableSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'AZURE_SQLSERVER';
    export function getDeserializedJsonObj(obj: SqlServerOnAzureTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getDeserializedJsonObj(obj) as SqlServerOnAzureTableSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
