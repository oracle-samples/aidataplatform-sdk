// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Compute resource details.
*/
export interface AccessGrantedForComputeDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;
    /**
    * Lakeproxy workspaceId.
    */
    'workspaceId': string;
    /**
    * Lakeproxy computeId.
    */
    'computeId': string;

}

export namespace AccessGrantedForComputeDetails {




    export function getJsonObj(obj: AccessGrantedForComputeDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForComputeDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
