// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Volume resource details.
*/
export interface AccessGrantedForVolumeDetails {
    /**
    * Lakeproxy catalogName.
    */
    'catalogName': string;
    /**
    * Lakeproxy databaseName.
    */
    'databaseName': string;
    /**
    * Lakeproxy volumeName.
    */
    'volumeName': string;

}

export namespace AccessGrantedForVolumeDetails {




    export function getJsonObj(obj: AccessGrantedForVolumeDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForVolumeDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
