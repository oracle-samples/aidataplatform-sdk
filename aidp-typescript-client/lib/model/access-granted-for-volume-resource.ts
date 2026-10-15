// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Volume resource.
*/
export interface AccessGrantedForVolumeResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForVolumeDetails;

   "resourceType": string;
}

export namespace AccessGrantedForVolumeResource {


    export function getJsonObj(obj: AccessGrantedForVolumeResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForVolumeResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForVolumeDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'VOLUME';
    export function getDeserializedJsonObj(obj: AccessGrantedForVolumeResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForVolumeResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForVolumeDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
