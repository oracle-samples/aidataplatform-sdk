// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy ExternalCatalog resource.
*/
export interface AccessGrantedForExternalCatalogResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForExternalCatalogDetails;

   "resourceType": string;
}

export namespace AccessGrantedForExternalCatalogResource {


    export function getJsonObj(obj: AccessGrantedForExternalCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForExternalCatalogResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForExternalCatalogDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'EXTERNALCATALOG';
    export function getDeserializedJsonObj(obj: AccessGrantedForExternalCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForExternalCatalogResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForExternalCatalogDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
