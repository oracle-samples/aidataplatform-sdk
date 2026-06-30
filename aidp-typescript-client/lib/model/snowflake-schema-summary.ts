// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for topic of a Snowflake external catalog.
*/
export interface SnowflakeSchemaSummary extends model.SchemaSummary {

   "entityType": string;
}

export namespace SnowflakeSchemaSummary {

    export function getJsonObj(obj: SnowflakeSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getJsonObj(obj) as SnowflakeSchemaSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'SNOWFLAKE';
    export function getDeserializedJsonObj(obj: SnowflakeSchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getDeserializedJsonObj(obj) as SnowflakeSchemaSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
