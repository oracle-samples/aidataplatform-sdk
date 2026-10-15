// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Credential resource.
*/
export interface AccessGrantedForCredentialResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForCredentialDetails;

   "resourceType": string;
}

export namespace AccessGrantedForCredentialResource {


    export function getJsonObj(obj: AccessGrantedForCredentialResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForCredentialResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForCredentialDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'CREDENTIAL';
    export function getDeserializedJsonObj(obj: AccessGrantedForCredentialResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForCredentialResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForCredentialDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
