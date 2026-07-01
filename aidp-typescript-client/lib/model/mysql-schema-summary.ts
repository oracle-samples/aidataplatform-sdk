// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema summary of a MySQL external catalog.
*/
export interface MysqlSchemaSummary extends model.SchemaSummary {

   "entityType": string;
}

export namespace MysqlSchemaSummary {

    export function getJsonObj(obj: MysqlSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getJsonObj(obj) as MysqlSchemaSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'MYSQL';
    export function getDeserializedJsonObj(obj: MysqlSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getDeserializedJsonObj(obj) as MysqlSchemaSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
