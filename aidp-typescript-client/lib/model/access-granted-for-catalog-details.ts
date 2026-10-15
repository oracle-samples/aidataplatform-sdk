// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Catalog resource details.
*/
export interface AccessGrantedForCatalogDetails {
    /**
    * Lakeproxy catalogName.
    */
    'catalogName': string;

}

export namespace AccessGrantedForCatalogDetails {


    export function getJsonObj(obj: AccessGrantedForCatalogDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForCatalogDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
