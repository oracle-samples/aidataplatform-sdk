// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema of a MySQL external catalog.
*/
export interface MysqlSchema extends model.Schema {

   "entityType": string;
}

export namespace MysqlSchema {

    export function getJsonObj(obj: MysqlSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getJsonObj(obj) as MysqlSchema, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'MYSQL';
    export function getDeserializedJsonObj(obj: MysqlSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getDeserializedJsonObj(obj) as MysqlSchema, ...{
            
         }};

        
        
        return jsonObj;
    }
}
