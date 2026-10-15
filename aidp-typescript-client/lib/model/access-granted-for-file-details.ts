// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy File resource details.
*/
export interface AccessGrantedForFileDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;
    /**
    * Lakeproxy workspaceId.
    */
    'workspaceId': string;
    /**
    * Lakeproxy fileId.
    */
    'fileId': string;

}

export namespace AccessGrantedForFileDetails {




    export function getJsonObj(obj: AccessGrantedForFileDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForFileDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
