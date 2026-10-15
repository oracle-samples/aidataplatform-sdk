// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy DeltaShare resource.
*/
export interface AccessGrantedForDeltaShareResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForDeltaShareDetails;

   "resourceType": string;
}

export namespace AccessGrantedForDeltaShareResource {


    export function getJsonObj(obj: AccessGrantedForDeltaShareResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForDeltaShareResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDeltaShareDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'DELTASHARE';
    export function getDeserializedJsonObj(obj: AccessGrantedForDeltaShareResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForDeltaShareResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDeltaShareDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
