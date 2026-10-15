// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Datalake resource details.
*/
export interface AccessGrantedForDatalakeDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;

}

export namespace AccessGrantedForDatalakeDetails {


    export function getJsonObj(obj: AccessGrantedForDatalakeDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForDatalakeDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
