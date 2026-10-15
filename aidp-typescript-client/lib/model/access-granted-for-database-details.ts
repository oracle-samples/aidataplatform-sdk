// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Database resource details.
*/
export interface AccessGrantedForDatabaseDetails {
    /**
    * Lakeproxy catalogName.
    */
    'catalogName': string;
    /**
    * Lakeproxy databaseName.
    */
    'databaseName': string;

}

export namespace AccessGrantedForDatabaseDetails {



    export function getJsonObj(obj: AccessGrantedForDatabaseDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForDatabaseDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
