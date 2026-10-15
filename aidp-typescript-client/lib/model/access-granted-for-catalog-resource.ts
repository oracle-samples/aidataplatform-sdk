// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Catalog resource.
*/
export interface AccessGrantedForCatalogResource extends model.AccessGrantedForResource {
    'resourceDetails': model.AccessGrantedForCatalogDetails;

   "resourceType": string;
}

export namespace AccessGrantedForCatalogResource {


    export function getJsonObj(obj: AccessGrantedForCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForCatalogResource, ...{
            
                'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForCatalogDetails.getJsonObj(obj.resourceDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'CATALOG';
    export function getDeserializedJsonObj(obj: AccessGrantedForCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForCatalogResource, ...{
            
                    'resourceDetails': obj.resourceDetails ?
                
                
                model.AccessGrantedForCatalogDetails.getDeserializedJsonObj(obj.resourceDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
