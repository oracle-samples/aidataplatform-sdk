// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table summary of a MySQL catalog.
*/
export interface MysqlTableSummary extends model.TableSummary {

   "entityType": string;
}

export namespace MysqlTableSummary {

    export function getJsonObj(obj: MysqlTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getJsonObj(obj) as MysqlTableSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'MYSQL';
    export function getDeserializedJsonObj(obj: MysqlTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getDeserializedJsonObj(obj) as MysqlTableSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
