// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Collection of imported run events.
*/
export interface LineageImportRunEventCollection {
    /**
    * Run events in the current page.
    */
    'items': Array<model.LineageImportRunEventSummary>;

}

export namespace LineageImportRunEventCollection {


    export function getJsonObj(obj: LineageImportRunEventCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageImportRunEventSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportRunEventCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageImportRunEventSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
