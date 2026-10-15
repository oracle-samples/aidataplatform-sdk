// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Database resource.
*/
export interface AccessGrantedForDatabaseResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForDatabaseDetails;

   "resourceType": string;
}

export namespace AccessGrantedForDatabaseResource {


    export function getJsonObj(obj: AccessGrantedForDatabaseResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForDatabaseResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDatabaseDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'DATABASE';
    export function getDeserializedJsonObj(obj: AccessGrantedForDatabaseResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForDatabaseResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForDatabaseDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
