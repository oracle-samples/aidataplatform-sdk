// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table of a MySQL catalog.
*/
export interface MysqlTable extends model.Table {

   "entityType": string;
}

export namespace MysqlTable {

    export function getJsonObj(obj: MysqlTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getJsonObj(obj) as MysqlTable, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'MYSQL';
    export function getDeserializedJsonObj(obj: MysqlTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getDeserializedJsonObj(obj) as MysqlTable, ...{
            
         }};

        
        
        return jsonObj;
    }
}
