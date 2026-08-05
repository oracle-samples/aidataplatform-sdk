// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for table summary of a Google BigQuery catalog.
*/
export interface GoogleBigqueryTableSummary extends model.TableSummary {

   "entityType": string;
}

export namespace GoogleBigqueryTableSummary {

    export function getJsonObj(obj: GoogleBigqueryTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getJsonObj(obj) as GoogleBigqueryTableSummary, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const entityType = 'GOOGLE_BIGQUERY';
    export function getDeserializedJsonObj(obj: GoogleBigqueryTableSummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.TableSummary.getDeserializedJsonObj(obj) as GoogleBigqueryTableSummary, ...{
            
         }};

        
        
        return jsonObj;
    }
}
