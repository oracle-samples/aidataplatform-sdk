// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* List of registered model permissions.
*/
export interface RegisteredModelPermissionCollection {
    /**
    * List of registered model permissions.
    */
    'items': Array<model.RegisteredModelPermissionSummary>;

}

export namespace RegisteredModelPermissionCollection {


    export function getJsonObj(obj: RegisteredModelPermissionCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.RegisteredModelPermissionSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RegisteredModelPermissionCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.RegisteredModelPermissionSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
