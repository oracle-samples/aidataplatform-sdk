// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy ExternalCatalog resource details.
*/
export interface AccessGrantedForExternalCatalogDetails {
    /**
    * Lakeproxy externalCatalogName.
    */
    'externalCatalogName': string;

}

export namespace AccessGrantedForExternalCatalogDetails {


    export function getJsonObj(obj: AccessGrantedForExternalCatalogDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForExternalCatalogDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
