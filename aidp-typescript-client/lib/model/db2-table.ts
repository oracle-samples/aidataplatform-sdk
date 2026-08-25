// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table of a DB2 catalog.
*/
export interface Db2Table extends model.Table {

   "entityType": string;
}

export namespace Db2Table {

    export function getJsonObj(obj: Db2Table, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getJsonObj(obj) as Db2Table, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'DB2';
    export function getDeserializedJsonObj(obj: Db2Table, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getDeserializedJsonObj(obj) as Db2Table, ...{
            
         }};

        
        
        return jsonObj;
    }
}
