// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Oracle Analytics objects returned by external catalog browse and listing APIs.
*/
export interface OacObjectCollection {
    /**
    * The Oracle Analytics objects returned for the request.
    */
    'items': Array<model.OacObjectSummary>;

}

export namespace OacObjectCollection {


    export function getJsonObj(obj: OacObjectCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacObjectSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacObjectSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
