// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.
*/
export interface ModelDeploymentTagKey {
    /**
    * Tag key. At most 250 characters and 250 UTF-8 bytes.
    */
    'key': string;

}

export namespace ModelDeploymentTagKey {


    export function getJsonObj(obj: ModelDeploymentTagKey): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeploymentTagKey): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
