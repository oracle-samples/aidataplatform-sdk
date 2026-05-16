// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of the ModelVersion tag.
*/
export interface DeleteModelVersionTagDetails {
    /**
    * Name of the registered model.
    */
    'name': string;
    /**
    * Model\u2019s version number.
    */
    'version': string;
    /**
    * Tag key.
    */
    'key': string;

}

export namespace DeleteModelVersionTagDetails {




    export function getJsonObj(obj: DeleteModelVersionTagDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeleteModelVersionTagDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
