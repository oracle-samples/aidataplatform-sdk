// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema summary of a DB2 external catalog.
*/
export interface Db2SchemaSummary extends model.SchemaSummary {

   "entityType": string;
}

export namespace Db2SchemaSummary {

    export function getJsonObj(obj: Db2SchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getJsonObj(obj) as Db2SchemaSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'DB2';
    export function getDeserializedJsonObj(obj: Db2SchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getDeserializedJsonObj(obj) as Db2SchemaSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
