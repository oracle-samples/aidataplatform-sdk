// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema of a Google BigQuery external catalog.
*/
export interface GoogleBigquerySchema extends model.Schema {

   "entityType": string;
}

export namespace GoogleBigquerySchema {

    export function getJsonObj(obj: GoogleBigquerySchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getJsonObj(obj) as GoogleBigquerySchema, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'GOOGLE_BIGQUERY';
    export function getDeserializedJsonObj(obj: GoogleBigquerySchema, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Schema.getDeserializedJsonObj(obj) as GoogleBigquerySchema, ...{
            
         }};

        
        
        return jsonObj;
    }
}
