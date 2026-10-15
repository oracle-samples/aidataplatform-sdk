// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Workspace resource.
*/
export interface AccessGrantedForWorkspaceResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForWorkspaceDetails;

   "resourceType": string;
}

export namespace AccessGrantedForWorkspaceResource {


    export function getJsonObj(obj: AccessGrantedForWorkspaceResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForWorkspaceResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForWorkspaceDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'WORKSPACE';
    export function getDeserializedJsonObj(obj: AccessGrantedForWorkspaceResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForWorkspaceResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForWorkspaceDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
