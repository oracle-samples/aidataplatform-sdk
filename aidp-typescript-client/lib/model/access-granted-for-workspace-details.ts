// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Workspace resource details.
*/
export interface AccessGrantedForWorkspaceDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;
    /**
    * Lakeproxy workspaceId.
    */
    'workspaceId': string;

}

export namespace AccessGrantedForWorkspaceDetails {



    export function getJsonObj(obj: AccessGrantedForWorkspaceDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForWorkspaceDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
