// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Oracle Analytics object tables returned by external catalog browse APIs.
*/
export interface OacObjectTableSummaryCollection {
    /**
    * The Oracle Analytics object tables returned for the request.
    */
    'items': Array<model.OacObjectTableSummary>;

}

export namespace OacObjectTableSummaryCollection {


    export function getJsonObj(obj: OacObjectTableSummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacObjectTableSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectTableSummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacObjectTableSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
