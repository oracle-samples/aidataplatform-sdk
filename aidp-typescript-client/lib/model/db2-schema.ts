// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema of a DB2 external catalog.
*/
export interface Db2Schema extends model.Schema {

   "entityType": string;
}

export namespace Db2Schema {

    export function getJsonObj(obj: Db2Schema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getJsonObj(obj) as Db2Schema, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'DB2';
    export function getDeserializedJsonObj(obj: Db2Schema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getDeserializedJsonObj(obj) as Db2Schema, ...{
            
         }};

        
        
        return jsonObj;
    }
}
