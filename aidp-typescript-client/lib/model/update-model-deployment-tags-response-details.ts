// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Response object for updating tags of a model deployment.
*/
export interface UpdateModelDeploymentTagsResponseDetails {

}

export namespace UpdateModelDeploymentTagsResponseDetails {

    export function getJsonObj(obj: UpdateModelDeploymentTagsResponseDetails): object {
        const jsonObj = {...obj, ...{
            
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateModelDeploymentTagsResponseDetails): object {
        const jsonObj = {...obj, ...{
            
         }};

        
        
        return jsonObj;
    }
}
