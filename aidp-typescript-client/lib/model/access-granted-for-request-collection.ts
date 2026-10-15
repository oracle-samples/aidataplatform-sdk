// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Ordered resource checks for one subject.
*/
export interface AccessGrantedForRequestCollection {
    /**
    * Resource checks in evaluation order.
    */
    'items': Array<model.AccessGrantedForRequestItem>;

}

export namespace AccessGrantedForRequestCollection {


    export function getJsonObj(obj: AccessGrantedForRequestCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.AccessGrantedForRequestItem.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForRequestCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.AccessGrantedForRequestItem.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
