// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Collection of diagnostic log entries for a lineage import.
*/
export interface LineageImportLogCollection {
    /**
    * Log entries in the current page.
    */
    'items': Array<model.LineageImportLogSummary>;

}

export namespace LineageImportLogCollection {


    export function getJsonObj(obj: LineageImportLogCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageImportLogSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportLogCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageImportLogSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
