// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table summary of a DB2 catalog.
*/
export interface Db2TableSummary extends model.TableSummary {

   "entityType": string;
}

export namespace Db2TableSummary {

    export function getJsonObj(obj: Db2TableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getJsonObj(obj) as Db2TableSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'DB2';
    export function getDeserializedJsonObj(obj: Db2TableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getDeserializedJsonObj(obj) as Db2TableSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
