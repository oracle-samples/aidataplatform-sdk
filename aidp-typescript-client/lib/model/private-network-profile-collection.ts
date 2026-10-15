// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A page of Git connectivity profile summaries.
*/
export interface PrivateNetworkProfileCollection {
    /**
    * Git connectivity profile summaries.
    */
    'items': Array<model.PrivateNetworkProfileSummary>;

}

export namespace PrivateNetworkProfileCollection {


    export function getJsonObj(obj: PrivateNetworkProfileCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.PrivateNetworkProfileSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PrivateNetworkProfileCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.PrivateNetworkProfileSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
