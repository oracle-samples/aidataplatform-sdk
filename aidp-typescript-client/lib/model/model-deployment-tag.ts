// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A tag associated with a model deployment.
*/
export interface ModelDeploymentTag {
    /**
    * Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.
    */
    'key': string;
    /**
    * Value of the model deployment tag. At most 5000 characters and 5000 UTF-8 bytes.
    */
    'value'?: string;

}

export namespace ModelDeploymentTag {



    export function getJsonObj(obj: ModelDeploymentTag): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeploymentTag): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
