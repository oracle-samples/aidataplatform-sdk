// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy MasterCatalog resource.
*/
export interface AccessGrantedForMasterCatalogResource extends model.AccessGrantedForResource {

   "resourceType": string;
}

export namespace AccessGrantedForMasterCatalogResource {

    export function getJsonObj(obj: AccessGrantedForMasterCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getJsonObj(obj) as AccessGrantedForMasterCatalogResource, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const resourceType = 'CENTRIFYCATALOG';
    export function getDeserializedJsonObj(obj: AccessGrantedForMasterCatalogResource, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AccessGrantedForResource.getDeserializedJsonObj(obj) as AccessGrantedForMasterCatalogResource, ...{
            
         }};

        
        
        return jsonObj;
    }
}
