// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table of a Snowflake catalog.
*/
export interface SnowflakeTable extends model.Table {

   "entityType": string;
}

export namespace SnowflakeTable {

    export function getJsonObj(obj: SnowflakeTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getJsonObj(obj) as SnowflakeTable, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'SNOWFLAKE';
    export function getDeserializedJsonObj(obj: SnowflakeTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getDeserializedJsonObj(obj) as SnowflakeTable, ...{
            
         }};

        
        
        return jsonObj;
    }
}
