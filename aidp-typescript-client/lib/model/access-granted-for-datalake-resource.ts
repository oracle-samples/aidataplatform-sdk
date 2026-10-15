// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Datalake resource.
*/
export interface AccessGrantedForDatalakeResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForDatalakeDetails;

   "resourceType": string;
}

export namespace AccessGrantedForDatalakeResource {


    export function getJsonObj(obj: AccessGrantedForDatalakeResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForDatalakeResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDatalakeDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'DATALAKE';
    export function getDeserializedJsonObj(obj: AccessGrantedForDatalakeResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForDatalakeResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDatalakeDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
