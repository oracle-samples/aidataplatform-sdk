// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Flattened results in subject order and resource order. Unknown response fields are preserved by the HTTP proxy.
*/
export interface AccessGrantedForResponseDetails {
    /**
    * One result per requested resource, up to 100 subjects times 100 checks. This is not a paginated list.
    */
    'items': Array<model.AccessGrantedForResult>;

}

export namespace AccessGrantedForResponseDetails {


    export function getJsonObj(obj: AccessGrantedForResponseDetails): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.AccessGrantedForResult.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForResponseDetails): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.AccessGrantedForResult.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
