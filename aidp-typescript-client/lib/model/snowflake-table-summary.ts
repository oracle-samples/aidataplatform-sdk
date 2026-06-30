// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table summary of a Snowflake catalog.
*/
export interface SnowflakeTableSummary extends model.TableSummary {

   "entityType": string;
}

export namespace SnowflakeTableSummary {

    export function getJsonObj(obj: SnowflakeTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getJsonObj(obj) as SnowflakeTableSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'SNOWFLAKE';
    export function getDeserializedJsonObj(obj: SnowflakeTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getDeserializedJsonObj(obj) as SnowflakeTableSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
