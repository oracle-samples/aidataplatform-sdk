// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for schema summary of a Google BigQuery external catalog.
*/
export interface GoogleBigquerySchemaSummary extends model.SchemaSummary {

   "entityType": string;
}

export namespace GoogleBigquerySchemaSummary {

    export function getJsonObj(obj: GoogleBigquerySchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getJsonObj(obj) as GoogleBigquerySchemaSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'GOOGLE_BIGQUERY';
    export function getDeserializedJsonObj(obj: GoogleBigquerySchemaSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.SchemaSummary.getDeserializedJsonObj(obj) as GoogleBigquerySchemaSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
