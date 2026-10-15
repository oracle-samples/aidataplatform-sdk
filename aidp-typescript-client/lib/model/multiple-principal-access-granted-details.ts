// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Batch of subject access evaluations. Caller IAM authorization is independent of every evaluated subject.
*/
export interface MultiplePrincipalAccessGrantedDetails {
    /**
    * Subjects in evaluation order.
    */
    'items': Array<model.PrincipalAccessGrantedDetails>;

}

export namespace MultiplePrincipalAccessGrantedDetails {


    export function getJsonObj(obj: MultiplePrincipalAccessGrantedDetails): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.PrincipalAccessGrantedDetails.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: MultiplePrincipalAccessGrantedDetails): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.PrincipalAccessGrantedDetails.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
