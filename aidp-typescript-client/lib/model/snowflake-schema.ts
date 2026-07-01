// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema of a Snowflake external catalog.
*/
export interface SnowflakeSchema extends model.Schema {

   "entityType": string;
}

export namespace SnowflakeSchema {

    export function getJsonObj(obj: SnowflakeSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getJsonObj(obj) as SnowflakeSchema, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'SNOWFLAKE';
    export function getDeserializedJsonObj(obj: SnowflakeSchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getDeserializedJsonObj(obj) as SnowflakeSchema, ...{
            
         }};

        
        
        return jsonObj;
    }
}
