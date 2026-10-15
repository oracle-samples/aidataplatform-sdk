// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Table resource details.
*/
export interface AccessGrantedForTableDetails {
    /**
    * Lakeproxy catalogName.
    */
    'catalogName': string;
    /**
    * Lakeproxy databaseName.
    */
    'databaseName': string;
    /**
    * Lakeproxy tableName.
    */
    'tableName': string;

}

export namespace AccessGrantedForTableDetails {




    export function getJsonObj(obj: AccessGrantedForTableDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForTableDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
