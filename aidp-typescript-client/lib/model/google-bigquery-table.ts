// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table of a Google BigQuery catalog.
*/
export interface GoogleBigqueryTable extends model.Table {

   "entityType": string;
}

export namespace GoogleBigqueryTable {

    export function getJsonObj(obj: GoogleBigqueryTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getJsonObj(obj) as GoogleBigqueryTable, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'GOOGLE_BIGQUERY';
    export function getDeserializedJsonObj(obj: GoogleBigqueryTable, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Table.getDeserializedJsonObj(obj) as GoogleBigqueryTable, ...{
            
         }};

        
        
        return jsonObj;
    }
}
