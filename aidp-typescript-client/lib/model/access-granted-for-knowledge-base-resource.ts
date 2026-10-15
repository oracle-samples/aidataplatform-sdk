// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy KnowledgeBase resource.
*/
export interface AccessGrantedForKnowledgeBaseResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForKnowledgeBaseDetails;

   "resourceType": string;
}

export namespace AccessGrantedForKnowledgeBaseResource {


    export function getJsonObj(obj: AccessGrantedForKnowledgeBaseResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForKnowledgeBaseResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForKnowledgeBaseDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'KNOWLEDGE_BASE';
    export function getDeserializedJsonObj(obj: AccessGrantedForKnowledgeBaseResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForKnowledgeBaseResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForKnowledgeBaseDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
