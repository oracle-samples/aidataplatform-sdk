// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Workflow resource.
*/
export interface AccessGrantedForWorkflowResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForWorkflowDetails;

   "resourceType": string;
}

export namespace AccessGrantedForWorkflowResource {


    export function getJsonObj(obj: AccessGrantedForWorkflowResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForWorkflowResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForWorkflowDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'WORKFLOW';
    export function getDeserializedJsonObj(obj: AccessGrantedForWorkflowResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForWorkflowResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForWorkflowDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
